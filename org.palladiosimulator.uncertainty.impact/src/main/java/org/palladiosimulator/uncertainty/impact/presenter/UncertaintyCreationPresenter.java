package org.palladiosimulator.uncertainty.impact.presenter;

import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.ElementTypeNotSupportedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.api.IUncertaintyCreationPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.util.ModelToViewModelConverter;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.view.api.IUncertaintyCreationView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.IUncertaintyCreationViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
/**
 * MVP-related presenter for views of type {@link IUncertaintyCreationView}.
 * Implements {@link IUncertaintyCreationViewListener} to be capable to listen
 * on view events. It is used when a user want to create a new uncertainty.
 * 
 * @author Niko
 *
 */
public class UncertaintyCreationPresenter
		implements IUncertaintyCreationPresenter, IUncertaintyCreationViewListener {

	private IUncertaintyCreationView view;
	private IUncertaintyTemplateModel uncertaintyTemplateModel;
	private IPalladioModel palladioModel;

	public UncertaintyCreationPresenter(IUncertaintyCreationView view,
			IUncertaintyTemplateModel uncertaintyTemplateModel, IPalladioModel palladioModel) {
		this.view = view;
		this.uncertaintyTemplateModel = uncertaintyTemplateModel;
		this.palladioModel = palladioModel;
		this.view.setCreateNewUncertaintyViewListener(this);
	}

	@Override
	public boolean newUncertaintyDialogCreated() {
		/*
		 * As soon as dialog is created, the user gets displayed all possible
		 * uncertainty types
		 */
		if (!uncertaintyTemplateModel.isInitialized()) {
			view.showMessage("Please load Uncertainty Template first!");
			return false;
		} else if (!palladioModel.isInitialized()) {
			view.showMessage("Please load Palladio models first!");
			return false;
		} else {

			List<UncertaintyTypeViewModel> uncertaintyTypeViewModels = ModelToViewModelConverter
					.convertUncertaintyTypesToUncertaintyTypeViewModels(uncertaintyTemplateModel.getUncertaintyTypes());

			view.setUncertaintyTypes(uncertaintyTypeViewModels);
			return true;
		}

	}

	@Override
	public void uncertaintyViewModelSelected(UncertaintyTypeViewModel uncertaintyTypeViewModel) {

		/*
		 * As soon as the user selects an uncertainty type, we need to retrieve all
		 * possible elements that can be assigned. Type of element is stored in
		 * uncertainty type
		 */
		UncertaintyType uncertaintyType;

		try {
			uncertaintyType = uncertaintyTemplateModel.getUncertaintyTypeById(uncertaintyTypeViewModel.getId());
		} catch (UncertaintyTemplateElementNotFoundException e) {
			view.showMessage("Uncertainty Type with name (id) " + uncertaintyTypeViewModel.getName() + " ("
					+ uncertaintyTypeViewModel.getId() + ") not found.");
			return;
		}

		ArchitecturalElementTypes type = uncertaintyType.getAssignableElementType();

		try {
			view.setAssignablePalladioElements(getAssignableElementsByType(type));
		} catch (PalladioElementNotFoundException | ElementTypeNotSupportedException e) {
			view.showMessage(e.getMessage());
		}

	}

	/**
	 * Helper method to retrieve all possible architectural element of a certain
	 * type
	 * 
	 * @param type
	 * @return
	 * @throws ElementTypeNotSupportedException
	 * @throws PalladioElementNotFoundException
	 */
	private List<PalladioElementViewModel> getAssignableElementsByType(ArchitecturalElementTypes type)
			throws ElementTypeNotSupportedException, PalladioElementNotFoundException {

		List<? extends Entity> elements;

		switch (type) {
		case BASIC_COMPONENT_BEHAVIOUR:
			elements = palladioModel.getAllBasicComponentBehaviourEntities();
			break;
		case BASIC_COMPONENT_TYPE:
			elements = palladioModel.getAllBasicComponentTypeEntities();
			break;
		case COMMUNICATION_COMPONENT:
			elements = palladioModel.getAllCommunicationComponentEntities();
			break;
		case COMMUNICATION_RESOURCE:
			elements = palladioModel.getAllCommunicationResourceEntities();
			break;
		case COMPONENT_INSTANCE:
			elements = palladioModel.getAllComponentInstanceEntities();
			break;
		case COMPONENT_INTERFACE_INSTANCE:
			elements = palladioModel.getAllComponentInterfaceInstanceEntities();
			break;
		case COMPONENT_INTERFACE_TYPE:
			elements = palladioModel.getAllComponentInterfaceTypeEntities();
			break;
		case HARDWARE_RESOURCE:
			elements = palladioModel.getAllHardwareResourceEntities();
			break;
		case SYSTEM:
			elements = palladioModel.getAllSystemEntities();
			break;
		case SYSTEM_INTERFACE:
			elements = palladioModel.getAllSystemInterfaceEntities();
			break;
		case USAGE_BEHAVIOUR:
			elements = palladioModel.getAllUsageBehaviourEntities();
			break;
		default:
			throw new ElementTypeNotSupportedException(
					"Display architecture elements for " + type + " not yet implemented!");

		}

		return ModelToViewModelConverter.convertPalladioElementsToPalladioElementViewModels(elements);
	}

}
