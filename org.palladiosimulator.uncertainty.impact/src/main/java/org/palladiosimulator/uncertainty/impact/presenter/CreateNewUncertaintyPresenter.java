package org.palladiosimulator.uncertainty.impact.presenter;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.ElementTypeNotSupportedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.presenter.api.ICreateNewUncertaintyPresenter;
import org.palladiosimulator.uncertainty.impact.presenter.util.ModelToViewModelConverter;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.view.api.ICreateNewUncertaintyView;
import org.palladiosimulator.uncertainty.impact.view.listener.api.ICreateNewUncertaintyViewListener;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;

/**
 * MVP-related presenter for views of type {@link ICreateNewUncertaintyView}.
 * Implements {@link ICreateNewUncertaintyViewListener} to be capable to listen
 * on view events. It is used when a user want to create a new uncertainty.
 * 
 * @author Niko
 *
 */
public class CreateNewUncertaintyPresenter
		implements ICreateNewUncertaintyPresenter, ICreateNewUncertaintyViewListener {

	private ICreateNewUncertaintyView view;
	private IUncertaintyTemplateModel uncertaintyTemplateModel;
	private IPalladioModel palladioModel;

	public CreateNewUncertaintyPresenter(ICreateNewUncertaintyView view,
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

		PalladioElementTypes type = uncertaintyType.getAssignableElementType().getType();

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
	private List<PalladioElementViewModel> getAssignableElementsByType(PalladioElementTypes type)
			throws ElementTypeNotSupportedException, PalladioElementNotFoundException {

		List<Entity> elements;

		switch (type) {
		case BASIC_COMPONENT_BEHAVIOUR:
			elements = convertList(palladioModel.getAllBasicComponentBehaviourEntities());
			break;
		case BASIC_COMPONENT_TYPE:
			elements = convertList(palladioModel.getAllBasicComponentTypeEntities());
			break;
		case COMMUNICATION_COMPONENTS:
			elements = convertList(palladioModel.getAllCommunicationComponentEntities());
			break;
		case COMMUNICATION_RESOURCES:
			elements = convertList(palladioModel.getAllCommunicationResourceEntities());
			break;
		case COMPONENT_INSTANCE:
			elements = convertList(palladioModel.getAllComponentInstanceEntities());
			break;
		case COMPONENT_INTERFACE_INSTANCE:
			elements = convertList(palladioModel.getAllComponentInterfaceInstanceEntities());
			break;
		case COMPONENT_INTERFACE_TYPE:
			elements = convertList(palladioModel.getAllComponentInterfaceTypeEntities());
			break;
		case HARDWARE_RESOURCE:
			elements = convertList(palladioModel.getAllHardwareResourceEntities());
			break;
		case SYSTEM:
			elements = convertList(palladioModel.getAllSystemEntities());
			break;
		case SYSTEM_INTERFACE:
			elements = convertList(palladioModel.getAllSystemInterfaceEntities());
			break;
		case USAGE_BEHAVIOUR:
			elements = convertList(palladioModel.getAllUsageBehaviourEntities());
			break;
		default:
			throw new ElementTypeNotSupportedException(
					"Display architecture elements for " + type + " not yet implemented!");

		}

		return ModelToViewModelConverter.convertPalladioElementsToPalladioElementViewModels(elements);
	}

	/*
	 * Each element in the PCM Model extends Entity class (which has name and id).
	 * To display the elements, we are only intereseted in name and id which is why
	 * we can cast each typed entity to Entity
	 */
	private static List<Entity> convertList(List<? extends Entity> list) {
		return list.stream().map(Entity.class::cast).collect(Collectors.toList());
	}

}
