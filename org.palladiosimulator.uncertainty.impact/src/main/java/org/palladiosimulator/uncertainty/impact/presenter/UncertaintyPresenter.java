package org.palladiosimulator.uncertainty.impact.presenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.palladiosimulator.uncertainty.impact.exception.ElementTypeNotSupportedException;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.SaveModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.persistence.SaveUncertaintyModelHelper;
import org.palladiosimulator.uncertainty.impact.persistence.SaveUncertaintyPropagationModelHelper;
import org.palladiosimulator.uncertainty.impact.presenter.api.IUncertaintyPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.util.ModelToViewModelConverter;
import org.palladiosimulator.uncertainty.impact.presenter.util.UncertaintyPropagationResultViewModelConverter;
import org.palladiosimulator.uncertainty.impact.presenter.util.ViewModelToModelConverter;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersionFacade;
import org.palladiosimulator.uncertainty.impact.propagation.UCImpactPropagationAnalysis;
import org.palladiosimulator.uncertainty.impact.propagation.UCImpactPropagationAnalysisInitializer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

/**
 * MVP-related presenter for views of type {@link IUncertaintyView}. Implements
 * {@link IUncertaintyViewListener} to be capable to listen on view events. It
 * is used when for all uncertainty related tasks such ass created, removing
 * uncertainties, as well as uncertainty propagation.
 * 
 * @author Niko
 *
 */
public class UncertaintyPresenter implements IUncertaintyPresenter, IUncertaintyViewListener {

	IUncertaintyView view;
	IUncertaintyModel uncertaintyModel;
	IUncertaintyTemplateModel uncertaintyTemplateModel;
	IPalladioModel palladioModel;

	public UncertaintyPresenter(IUncertaintyView view, IUncertaintyModel uncertaintyModel,
			IUncertaintyTemplateModel uncertaintyTemplateModel, IPalladioModel palladioModel) {
		this.view = view;
		view.setUncertaintyViewListener(this);
		this.uncertaintyModel = uncertaintyModel;
		this.uncertaintyTemplateModel = uncertaintyTemplateModel;
		this.palladioModel = palladioModel;
	}

	/**
	 * A user can add uncertainties using the CreateNewUncertaintyView. Those
	 * uncertainty view models are forwarded to this presenter and finally created.
	 * Presenter updates backend model and ui.
	 */
	@Override
	public void onAddUncertaintyButtonClicked(UncertaintyViewModel uncertaintyViewModel) {

		if (!allModelsInitialized()) {
			return;
		}

		Uncertainty uncertainty;
		try {
			uncertainty = ViewModelToModelConverter.createNewUncertaintyFromUncertaintyViewModel(uncertaintyViewModel,
					uncertaintyTemplateModel, palladioModel);
		} catch (UncertaintyTemplateElementNotFoundException | ElementTypeNotSupportedException
				| PalladioElementNotFoundException e) {
			view.showMessage("Error while creating Uncertainty: " + e.getMessage());
			return;
		}

		// Update Model
		uncertaintyModel.addUncertainty(uncertainty);

		/*
		 * Update View but before, enhance uncertaintyViewModel with attributes (such as
		 * auto generated id). uncertaintyViewModel (=input) does not have those
		 * attributes yet.
		 * 
		 */
		view.addUncertainty(ModelToViewModelConverter.convertUncertaintyToUncertaintyViewModel(uncertainty));
	}

	/**
	 * Remove all available uncertainties. Show error message for those which
	 * couldn't be removed. Enables partial removing: Uncertainties that were
	 * deleted from backend model shall also be deleted from ui.
	 */
	@Override
	public void onRemoveUncertaintyButtonClicked(List<UncertaintyViewModel> uncertaintyViewModels) {

		if (!allModelsInitialized()) {
			return;
		}

		List<UncertaintyViewModel> notRemovableUncertainties = new ArrayList<>();
		List<UncertaintyViewModel> removableUncertainties = new ArrayList<>();

		// Iterate and collect uncertainties that can be removed
		for (UncertaintyViewModel uncertaintyViewModel : uncertaintyViewModels) {
			try {
				// Try to remove uncertainty
				uncertaintyModel.removeUncertaintyById(uncertaintyViewModel.getId());
				removableUncertainties.add(uncertaintyViewModel);
			} catch (UncertaintyNotFoundException e) {
				notRemovableUncertainties.add(uncertaintyViewModel);
			}
		}

		// Remove uncertainties from view
		if (!removableUncertainties.isEmpty()) {
			view.removeUncertainties(removableUncertainties);
			if (notRemovableUncertainties.isEmpty()) {
				view.showMessage("Removing uncertainties was successfull.");
			}
		}

		if (!notRemovableUncertainties.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append("Following uncertanties could not be removed:");

			for (UncertaintyViewModel uncertaintyViewModel : notRemovableUncertainties) {
				sb.append(" " + uncertaintyViewModel.getName() + " (" + uncertaintyViewModel.getId() + ")");
			}
			view.showMessage(sb.toString());
		}

	}

	/**
	 * Load existing uncertainty model from specified path which must be relative to
	 * workspace.
	 */
	@Override
	public void onLoadExistingModelButtonClicked(String uncertaintiesPath) {

		if (!palladioAndTemplateInitialized()) {
			return;
		}

		if (uncertaintiesPath.isBlank()) {
			view.showMessage("Please provide vaild path to existing uncertainty model");
		} else {
			try {
				uncertaintyModel.loadUncertaintyModel(uncertaintiesPath);
			} catch (LoadModelFailedException e) {
				view.showMessage("Error while loading uncertainty model. Error message = " + e.getMessage());
				return;
			}
			// TODO check if templates are matching

			List<Uncertainty> uncertainties = uncertaintyModel.getUncertainties();
			view.reloadUncertainties(
					ModelToViewModelConverter.convertUncertaintiesToUncertaintyViewModels(uncertainties));
			view.showMessage("Loading successful!");
		}

	}

	/**
	 * Creates new and empty uncertainty model. Be aware that this model only exists
	 * in-memory as long as user does not save it.
	 */
	@Override
	public void onCreateNewUncertaintyModelButtonClicked() {

		if (!palladioAndTemplateInitialized()) {
			return;
		}

		UncertaintyTemplate uncertaintyTemplate = uncertaintyTemplateModel.getTemplateModel();
		uncertaintyModel.loadNewUncertaintyModel(uncertaintyTemplate);
		view.reloadUncertainties(Collections.emptyList());
		view.showMessage("New model created!");

	}

	/**
	 * Retrieve type information for given uncertainty view model
	 * 
	 * @throws UncertaintyTemplateElementNotFoundException
	 */
	@Override
	public void onDisplayTypeInformationButtonClicked(UncertaintyViewModel uncertaintyViewModel)
			 {

		/*
		 * UncertaintyViewModel already references UncertaintyTypeViewModel but we
		 * "reload" it from uncertaintyTemplate model in case it has been changed while
		 * the plugin was running.
		 */

		String uncertaintyTypeId = uncertaintyViewModel.getUncertaintyTypeViewModel().getId();
		UncertaintyType uncertaintyType;
		try {
			uncertaintyType = uncertaintyTemplateModel.getUncertaintyTypeById(uncertaintyTypeId);
			view.displayUncertaintyTypeInformation(
					ModelToViewModelConverter.convertUncertaintyTypeToUncertaintyTypeViewModel(uncertaintyType));
			
		} catch (UncertaintyTemplateElementNotFoundException e) {
			view.showMessage("Error while retrieving uncertainty type information. Error message: " + e.getMessage());
		}
		

	}

	/**
	 * Enables to save (or overwrite if already existing) uncertainty model.
	 */
	@Override
	public void onSaveUncertaintyModelButtonClicked(String path) {

		if (!allModelsInitialized()) {
			return;
		}

		try {
			SaveUncertaintyModelHelper.saveUncertaintyModel(uncertaintyModel.getUncertaintyModel(), path);
		} catch (SaveModelFailedException e) {
			view.showMessage("Error while saving model. Error Message: " + e.getMessage());
			return;
		}

		view.showMessage("Save uncertainty model successful!");
	}

	/**
	 * Trigger propagation for selected uncertainties
	 */
	@Override
	public void onPropagateUncertaintiesButtonClicked(List<UncertaintyViewModel> uncertaintyViewModels) {

		if (!allModelsInitialized()) {
			return;
		}

		UCArchitectureVersion ucArchitectureVersion = executePropagation(uncertaintyViewModels);
		if (ucArchitectureVersion == null) {
			return;
		}

		List<UncertaintyPropagationResultViewModel> result = UncertaintyPropagationResultViewModelConverter
				.getUCImpactUncertaintyViewModelsFromPropagation(ucArchitectureVersion);

		view.displayPropagationResult(result);

	}

	/**
	 * Trigger propagation for selected uncertainties (includes saving of resulting
	 * propagation model)
	 */
	@Override
	public void onSavePropagationButtonClicked(List<UncertaintyViewModel> uncertaintyViewModels) {

		if (!allModelsInitialized()) {
			return;
		}

		UCArchitectureVersion ucArchitectureVersion = executePropagation(uncertaintyViewModels);
		if (ucArchitectureVersion == null) {
			return;
		}

		try {
			SaveUncertaintyPropagationModelHelper.saveUncertaintyPropagation(ucArchitectureVersion);
			view.showMessage("Save propagation successfull!");
		} catch (SaveModelFailedException e) {
			view.showMessage("Save propagation not successfull. Error message: " + e.getMessage());
		}

	}

	private UCArchitectureVersion executePropagation(List<UncertaintyViewModel> uncertaintyViewModels) {
		if (!palladioModel.isInitialized()) {
			view.showMessage("Please load Palladio models first!");
		}

		List<Uncertainty> uncertainties = new ArrayList<>();
		try {
			for (UncertaintyViewModel uncertaintyViewModel : uncertaintyViewModels) {

				uncertainties.add(uncertaintyModel.getUncertaintyById(uncertaintyViewModel.getId()));

			}
		} catch (UncertaintyTemplateElementNotFoundException e) {
			view.showMessage("Error while retrieving uncertainties. Error message: " + e.getMessage());
			return null;
		}

		UCArchitectureVersion ucArchitectureVersion;
		try {
			ucArchitectureVersion = UCArchitectureVersionFacade.createEmptyModel("temp", palladioModel.getRepository(),
					palladioModel.getSystem(), palladioModel.getAllocation(), palladioModel.getResourceEnvironment(),
					palladioModel.getUsageModel());

			UCImpactPropagationAnalysisInitializer
					.addUncertaintyImpactEntitiesToArchitectureVersion(ucArchitectureVersion, uncertainties);
		} catch (InitializePropagationException e) {
			view.showMessage("Error while initalizing uncertainty propagation. Error message: " + e.getMessage());
			return null;
		}

		try {
			UCImpactPropagationAnalysis.runUncertaintyPropagationAnalysis(ucArchitectureVersion);
		} catch (UncertaintyPropagationException e) {
			view.showMessage("Error while propagating uncertainty. Error message: " + e.getMessage());
			return null;
		}

		return ucArchitectureVersion;
	}

	private boolean allModelsInitialized() {

		if (!palladioModel.isInitialized()) {
			view.showMessage("Please load Palladio models first!");
			return false;
		}

		if (!uncertaintyTemplateModel.isInitialized()) {
			view.showMessage("Please load Uncertainty Template first!");
			return false;
		}

		if (!uncertaintyModel.isInitialized()) {
			view.showMessage("Pleaser load Uncertainty Model first!");
			return false;
		}

		return true;
	}

	private boolean palladioAndTemplateInitialized() {

		if (!palladioModel.isInitialized()) {
			view.showMessage("Please load Palladio models first!");
			return false;
		}

		if (!uncertaintyTemplateModel.isInitialized()) {
			view.showMessage("Please load Uncertainty Template first!");
			return false;
		}

		return true;
	}

}
