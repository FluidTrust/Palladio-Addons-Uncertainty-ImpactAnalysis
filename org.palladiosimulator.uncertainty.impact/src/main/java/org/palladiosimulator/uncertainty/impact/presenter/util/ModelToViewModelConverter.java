package org.palladiosimulator.uncertainty.impact.presenter.util;

import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.view.model.ADDViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

/**
 * Utility class that converts model objects to view model objects
 * 
 * @author Niko
 *
 */
public class ModelToViewModelConverter {

	private ModelToViewModelConverter() {

	}

	/**
	 * Converts {@link UncertaintyType} to {@link UncertaintyTypeViewModel}
	 * 
	 * @param
	 * @return
	 */
	public static UncertaintyTypeViewModel convertUncertaintyTypeToUncertaintyTypeViewModel(
			UncertaintyType uncertaintyType) {
		UncertaintyTypeViewModel viewModel = new UncertaintyTypeViewModel();
		viewModel.setName(uncertaintyType.getName());
		viewModel.setId(uncertaintyType.getId());
		viewModel.setResolvedBy(convertADDToADDViewModel(uncertaintyType.getResolvedBy()));
		viewModel.setAssignableElementType(ArchitecturalElementTypeToPalladioElementTypeNameResolver
				.resolveName(uncertaintyType.getAssignableElementType()));
		viewModel.setImpactOnElementTypes(ArchitecturalElementTypeToPalladioElementTypeNameResolver
				.resolveNames(uncertaintyType.getImpactOnElementTypes()));
		viewModel.setImpactOnConfidentiality(uncertaintyType.getImpactOnConfidentiality().getName());
		viewModel.setInformationAvailability(uncertaintyType.getInformationAvailability().getName());
		viewModel.setLocation(uncertaintyType.getLocation().getName());
		viewModel.setManageability(uncertaintyType.getManageability().getName());
		viewModel.setNature(uncertaintyType.getNature().getName());
		viewModel.setResolutionTime(uncertaintyType.getResolutionTime().getName());
		viewModel.setRootCause(uncertaintyType.getRootCause().getName());
		viewModel.setSeverityOfImpact(uncertaintyType.getSeverityOfImpact().getName());

		return viewModel;
	}

	/**
	 * Converts list of {@link UncertaintyType} to list of
	 * {@link UncertaintyTypeViewModel}
	 * 
	 * @param
	 * @return
	 */
	public static List<UncertaintyTypeViewModel> convertUncertaintyTypesToUncertaintyTypeViewModels(
			List<UncertaintyType> uncertaintyTypes) {

		return uncertaintyTypes.stream()
				.map(ModelToViewModelConverter::convertUncertaintyTypeToUncertaintyTypeViewModel)
				.collect(Collectors.toList());
	}

	/**
	 * Converts {@link ADD} to {@link ADDViewModel}
	 * 
	 * @param
	 * @return
	 */
	public static ADDViewModel convertADDToADDViewModel(ADD add) {
		if (add == null) {
			return null;
		}
		ADDViewModel viewModel = new ADDViewModel();
		viewModel.setName(add.getName());
		viewModel.setId(add.getId());
		viewModel.setAmountOfAlternatives(add.getAmountOfAlternatives().getName());
		viewModel.setAddClass(add.getAddClass().getName());
		viewModel.setCostsOfRevision(add.getCostsOfRevision().getName());
		viewModel.setPossibilityOfRevisability(add.getPossibilityOfRevisability().getName());
		viewModel.setProbabilityOfRevisability(add.getProbabilityOfRevisability().getName());
		return viewModel;
	}

	/**
	 * Converts list of {@link ADD} to list of {@link ADDViewModel}
	 * 
	 * @param
	 * @return
	 */
	public static List<ADDViewModel> convertADDsToADDViewModels(List<ADD> adds) {

		return adds.stream().map(ModelToViewModelConverter::convertADDToADDViewModel).collect(Collectors.toList());
	}

	

	/**
	 * Converts {@link Uncertainty} to {@link UncertaintyTypeViewModel}
	 * 
	 * @param
	 * @return
	 */
	public static UncertaintyViewModel convertUncertaintyToUncertaintyViewModel(Uncertainty uncertainty) {

		UncertaintyViewModel uncertaintyViewModel = new UncertaintyViewModel();
		uncertaintyViewModel.setName(uncertainty.getName());
		uncertaintyViewModel.setId(uncertainty.getId());

		// Add view model for uncertainty type
		uncertaintyViewModel.setUncertaintyTypeViewModel(
				convertUncertaintyTypeToUncertaintyTypeViewModel(uncertainty.getUncertaintyType()));

		/*
		 * Add view model for palladio element type. Throw away type information as this
		 * is already included in uncertaintyViewModel.getUncertaintyTypeViewModel()
		 */
		uncertaintyViewModel.setAssignedElement(convertPalladioElementToPalladioElementViewModel(
				uncertainty.getAssignedElement().getReferencedElement()));

		return uncertaintyViewModel;
	}

	/**
	 * Converts list of {@link Uncertainty} to list of
	 * {@link UncertaintyTypeViewModel}
	 * 
	 * @param
	 * @return
	 */
	public static List<UncertaintyViewModel> convertUncertaintiesToUncertaintyViewModels(
			List<Uncertainty> uncertainties) {

		return uncertainties.stream().map(ModelToViewModelConverter::convertUncertaintyToUncertaintyViewModel)
				.collect(Collectors.toList());
	}

	/**
	 * Converts {@link Entity} to {@link PalladioElementViewModel}. Each Palladio
	 * element extends from entity (if not, we use a wapper element).
	 * 
	 * @param
	 * @return
	 */
	public static PalladioElementViewModel convertPalladioElementToPalladioElementViewModel(Entity entity) {
		PalladioElementViewModel viewModel = new PalladioElementViewModel();
		viewModel.setId(entity.getId());
		viewModel.setName(entity.getEntityName());

		return viewModel;
	}

	/**
	 * Converts list of {@link Entity} to list of {@link PalladioElementViewModel}.
	 * Each Palladio element extends from entity (if not, we use a wapper element).
	 * 
	 * @param
	 * @return
	 */
	public static List<PalladioElementViewModel> convertPalladioElementsToPalladioElementViewModels(
			List<? extends Entity> entities) {
		return entities.stream().map(ModelToViewModelConverter::convertPalladioElementToPalladioElementViewModel)
				.collect(Collectors.toList());
	}

}
