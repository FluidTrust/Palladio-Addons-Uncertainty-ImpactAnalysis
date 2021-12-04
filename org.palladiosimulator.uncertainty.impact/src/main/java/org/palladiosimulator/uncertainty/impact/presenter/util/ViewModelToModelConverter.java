package org.palladiosimulator.uncertainty.impact.presenter.util;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.ElementTypeNotSupportedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.api.IPalladioModel;
import org.palladiosimulator.uncertainty.impact.model.api.IUncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

/**
 * Model class that creates new models from view models.
 * 
 * @author Niko
 *
 */
public class ViewModelToModelConverter {

	private static UncertaintyFactory factory = UncertaintyFactory.eINSTANCE;

	public ViewModelToModelConverter() {

	}

	/**
	 * Create new Uncertainty from given Uncertainty View Model. Referenced
	 * {@link UncertaintyType} and {@link PalladioElementWrapper} need to be loaded
	 * from model, {@link UncertaintyTypeViewModel} and
	 * {@link PalladioElementViewModel} do not contain all necessary information.
	 * (only referencing actual model elements by id)
	 * 
	 * @param uncertaintyViewModel
	 * @param uncertaintyTemplateModel
	 * @param palladioModel
	 * @return
	 * @throws UncertaintyTemplateElementNotFoundException
	 * @throws ElementTypeNotSupportedException
	 * @throws PalladioElementNotFoundException
	 */
	public static Uncertainty createNewUncertaintyFromUncertaintyViewModel(UncertaintyViewModel uncertaintyViewModel,
			IUncertaintyTemplateModel uncertaintyTemplateModel, IPalladioModel palladioModel)
			throws UncertaintyTemplateElementNotFoundException, ElementTypeNotSupportedException,
			PalladioElementNotFoundException {

		// Create uncertainty
		Uncertainty uncertainty = factory.createUncertainty();

		// Set name as specified by user
		uncertainty.setName(uncertaintyViewModel.getName());

		// Set uncertainty type (ID in UncertaintyViewModel -> UncertaintyTypeViewModel)
		UncertaintyType uncertaintyType = getUncertaintyTypeById(uncertaintyTemplateModel,
				uncertaintyViewModel.getUncertaintyTypeViewModel().getId());
		uncertainty.setUncertaintyType(uncertaintyType);

		// Set element wrapper (ID in UncertaintyViewModel -> PalladioElementViewModel)
		PalladioElementWrapper wrapper = createElementWrapper(palladioModel, uncertaintyType,
				uncertaintyViewModel.getAssignedElement().getId());
		uncertainty.setAssignedElement(wrapper);

		return uncertainty;
	}

	private static UncertaintyType getUncertaintyTypeById(IUncertaintyTemplateModel uncertaintyTemplateModel,
			String uncertaintyTypeId) throws UncertaintyTemplateElementNotFoundException {
		return uncertaintyTemplateModel.getUncertaintyTypeById(uncertaintyTypeId);
	}


	private static PalladioElementWrapper createElementWrapper(IPalladioModel palladioModel,
			UncertaintyType uncertaintyType, String assignedElementId)
			throws ElementTypeNotSupportedException, PalladioElementNotFoundException {
		//Element Wrapper encapsulate referenced palladio element
		PalladioElementWrapper wrapper = factory.createPalladioElementWrapper();

		Entity entity;

		PalladioElementTypes type = uncertaintyType.getAssignableElementType().getType();

		switch (type) {
		case BASIC_COMPONENT_BEHAVIOUR:
			entity = palladioModel.getBasicComponentBehaviourEntityById(assignedElementId);
			break;
		case BASIC_COMPONENT_TYPE:
			entity = palladioModel.getBasicComponentTypeEntityById(assignedElementId);
			break;
		case COMMUNICATION_COMPONENTS:
			entity = palladioModel.getCommunicationComponentEntityById(assignedElementId);
			break;
		case COMMUNICATION_RESOURCES:
			entity = palladioModel.getCommunicationResourceEntityById(assignedElementId);
			break;
		case COMPONENT_INSTANCE:
			entity = palladioModel.getComponentInstanceEntityById(assignedElementId);
			break;
		case COMPONENT_INTERFACE_INSTANCE:
			entity = palladioModel.getComponentInterfaceInstanceEntityById(assignedElementId);
			break;
		case COMPONENT_INTERFACE_TYPE:
			entity = palladioModel.getComponentInterfaceTypeEntityById(assignedElementId);
			break;
		case HARDWARE_RESOURCE:
			entity = palladioModel.getHardwareResourceEntityById(assignedElementId);
			break;
		case SYSTEM:
			entity = palladioModel.getSystemEntityById(assignedElementId);
			break;
		case SYSTEM_INTERFACE:
			entity = palladioModel.getSystemInterfaceEntityById(assignedElementId);
			break;
		case USAGE_BEHAVIOUR:
			entity = palladioModel.getUsageBehaviourEntityById(assignedElementId);
			break;
		default:
			throw new ElementTypeNotSupportedException(
					"Create uncertainties for type " + type + " not yet implemented.");

		}

		wrapper.setReferencedElement(entity);

		return wrapper;
	}

}
