package org.palladiosimulator.uncertainty.impact.presenter.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyPropagationResultViewModel;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;

/**
 * This class extracts uncertainty propagation results from an
 * {@link UCArchitectureVersion} which stores the actual propagation. For each
 * affected architectural element, an {@link UCImpactEntity} exists. Each
 * {@link UCImpactEntity} references a single architectural element and one or
 * multiple uncertainties that have a impact on that specific element. Further,
 * one uncertainty might impact multiple entities. For our presentation, we need
 * the information the other way around, i.e. we want to know on which element
 * and uncertainty has an impact. This conversion is done by this class.
 * 
 * 
 * @author Niko
 *
 */
public class UncertaintyPropagationResultViewModelConverter {

	private UncertaintyPropagationResultViewModelConverter() {

	}

	/**
	 * Extracts {@link UncertaintyPropagationResultViewModel} from an actual
	 * propagation (= {@link UCArchitectureVersion}. For each uncertainty, extract
	 * on which architectural elements it has an impact.
	 * 
	 * @param version
	 * @return
	 */
	public static List<UncertaintyPropagationResultViewModel> getUCImpactUncertaintyViewModelsFromPropagation(
			UCArchitectureVersion version) {

		// Holds found Uncertainties (String = id)
		Map<String, UncertaintyPropagationResultViewModel> ucImpactUncertainties = new HashMap<>();

		/*
		 * This set represents the propagation input, i.e. the the uncertainties that
		 * have direct impact on actual palladio elements. This information is stored
		 * the other way around in UCImpactEntities.
		 */
		@SuppressWarnings("rawtypes")
		Set<UCImpactEntity> initialUCImpactEntities = ArchitectureModelLookup
				.lookUpAllSeedModificationMarksOfAType(version, UCImpactEntity.class);

		/*
		 * This set represents the propagation output, i.e. the uncertainties that have
		 * direct impact on actual palladio elements. This information is stored the
		 * other way around in UCImpactEntities
		 */
		@SuppressWarnings("rawtypes")
		Set<UCImpactEntity> propagatedUCIMpactEntities = ArchitectureModelLookup
				.lookUpAllCalculatedMarksOfAType(version, UCImpactEntity.class);

		// Uncertainties and their direct impact
		addUCImpactEntitiesToResultMap(initialUCImpactEntities, ucImpactUncertainties);

		// Uncertainties and their indirect impact
		addUCImpactEntitiesToResultMap(propagatedUCIMpactEntities, ucImpactUncertainties);

		return new ArrayList<>(ucImpactUncertainties.values());
	}

	/*
	 * For each UCImpactEntity, extract the uncertainties that have an impact on the
	 * respective element. Then, for each uncertainty, i) create OR add
	 * UncertaintyPropagationResultViewModel if it does not yet exist ii) add
	 * affected element (= element referenced by UCImpactEntity) and path to
	 * respective UncertaintyPropagationResultViewModel
	 */
	@SuppressWarnings("rawtypes")
	private static void addUCImpactEntitiesToResultMap(Set<UCImpactEntity> initialUCImpactEntities,
			Map<String, UncertaintyPropagationResultViewModel> ucImpactUncertainties) {

		for (UCImpactEntity<?> entity : initialUCImpactEntities) {
			for (CausingUncertainty causingUncertainty : entity.getCausingElements()) {
				Uncertainty uncertainty = causingUncertainty.getCausingUncertainty();
				List<Entity> path = causingUncertainty.getPath();

				UncertaintyPropagationResultViewModel viewModel = ucImpactUncertainties.get(uncertainty.getId());
				if (viewModel == null) {
					viewModel = new UncertaintyPropagationResultViewModel();
					viewModel.setUncertainty(
							ModelToViewModelConverter.convertUncertaintyToUncertaintyViewModel(uncertainty));
					ucImpactUncertainties.put(uncertainty.getId(), viewModel);
				}

				viewModel.addAffectedElement(convertEntityToString(entity.getAffectedElement()), convertEntitiesToString(path));

			}
		}
	}


	private static List<String> convertEntitiesToString(List<Entity> path) {
		List<String> entityListAsString = new ArrayList<>();

		if (path.isEmpty()) {
		
			entityListAsString.add(" --- ");
			return entityListAsString;
		}

		for (Entity pathElement : path) {
			entityListAsString.add(convertEntityToString(pathElement));
		}

		return entityListAsString;
	}

	

	/*
	 * We want to have more specific information for entities: Add the actual
	 * class name.
	 */
	private static String convertEntityToString(Entity entity) {

		StringBuilder sb = new StringBuilder();
		sb.append(entity.getEntityName()); // Name of affectedElement
		sb.append("(");
		sb.append(entity.getId()); // Id of affectedElement
		sb.append(")");
		sb.append(": ");
		sb.append(getEntityClassName(entity)); // Add class name

		return sb.toString();
	}

	/**
	 * Palladio types are always named/should always be named: "xyImpl" <br>
	 * Remove Impl!
	 * @param entity
	 * @return
	 */
	private static String getEntityClassName(Entity entity) {
		String className = entity.getClass().getSimpleName();
		if(className.endsWith("Impl")) {
			return entity.getClass().getSimpleName().substring(0, className.length() - 4);
		}
		return className;
	}

}
