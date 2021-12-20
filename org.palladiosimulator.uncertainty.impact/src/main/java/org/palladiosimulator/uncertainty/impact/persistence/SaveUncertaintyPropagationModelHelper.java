package org.palladiosimulator.uncertainty.impact.persistence;

import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.PLUGIN_URI_PREFIX;
import static org.palladiosimulator.uncertainty.impact.util.UncertaintyPluginConstants.UNCERTAINTY_PROPAGATION_DEFAULT_LOCATION;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.SaveModelFailedException;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;

/**
 * Helper method to save uncertainty propagations. Special logic has to be
 * applied to collect all uncontained elements. See comments below.
 * 
 * @author Niko
 *
 */
public class SaveUncertaintyPropagationModelHelper {

	private SaveUncertaintyPropagationModelHelper() {

	}

	/**
	 * Saves uncertainty propagation to path within workspace. (only relative paths
	 * allowed)
	 * 
	 * @param version
	 * @throws SaveModelFailedException
	 */
	public static void saveUncertaintyPropagation(UCArchitectureVersion version, URI uri)
			throws SaveModelFailedException {

		findAndAddUncontainedElements(version);

		if (version.getModificationMarkRepository() != null)

			EMFPersistenceHelper.saveEmfModelToURI(version.getModificationMarkRepository(), uri);

	}

	/**
	 * Saves uncertainty propagation to predefined path: <br>
	 * src/main/resources/models/user/modified/temp.uncertaintypropagation
	 * 
	 * @param version
	 * @throws SaveModelFailedException
	 */
	public static void saveUncertaintyPropagation(UCArchitectureVersion version) throws SaveModelFailedException {

		// Need to use PlatformResourceURI for saving!
		URI uri = URI.createPlatformResourceURI(PLUGIN_URI_PREFIX + UNCERTAINTY_PROPAGATION_DEFAULT_LOCATION, false);

		// Delegate with default path
		saveUncertaintyPropagation(version, uri);

	}

	/**
	 * In the course of the propagation, we create entities "on the fly" (i.e.
	 * entities of type {@link BasicComponentBehaviour} and
	 * {@link ComponentInterfaceInstance}). Those types are not in a containment
	 * relationship so that we have to add them to a specific container.
	 * 
	 * @param version
	 * @throws SaveModelFailedException
	 */
	private static void findAndAddUncontainedElements(UCArchitectureVersion version) throws SaveModelFailedException {

		// Lookup UCImpactEntities that are created during the propagation
		@SuppressWarnings("rawtypes")
		Set<UCImpactEntity> ucImpactEntities = ArchitectureModelLookup.lookUpAllCalculatedMarksOfAType(version,
				UCImpactEntity.class);

		UncertaintyPropagation uncertaintyPropagation = getUncertaintyPropagation(version);

		// Use Set to avoid duplicates
		Set<ComponentInterfaceInstance> componentInterfaceInstances = new HashSet<>();
		Set<BasicComponentBehaviour> basicComponentBehaviours = new HashSet<>();

		for (UCImpactEntity<?> ucImpactEntity : ucImpactEntities) {
			/*
			 * UCImpactEntities are created during propagation with an affected element. In
			 * case the affected element (Palladio Entity) is not yet in a containments
			 * relationship (indicated by element.eContainer == null), extract type of
			 * element and add to respective container of uncertaintyPropagation
			 */
			Entity affectedEntity = ucImpactEntity.getAffectedElement();
			if (affectedEntity.eContainer() == null) {
				if (affectedEntity instanceof ComponentInterfaceInstance) {
					componentInterfaceInstances.add((ComponentInterfaceInstance) affectedEntity);

				} else if (affectedEntity instanceof BasicComponentBehaviour) {
					basicComponentBehaviours.add((BasicComponentBehaviour) affectedEntity);

				}
			}

			/*
			 * In addition, a path within a causingUncertainty might also contain
			 * "uncontained" entities. Apply the same behavior as above.
			 */
			for (CausingUncertainty causingUncertainty : ucImpactEntity.getCausingElements()) {
				for (Entity pathEntity : causingUncertainty.getPath()) {
					if (pathEntity instanceof ComponentInterfaceInstance) {
						componentInterfaceInstances.add((ComponentInterfaceInstance) pathEntity);
					} else if (pathEntity instanceof BasicComponentBehaviour) {
						basicComponentBehaviours.add((BasicComponentBehaviour) pathEntity);
					}
				}
			}

		}

		// Add found entities to container
		uncertaintyPropagation.getComponentInterfaceInstanceContainer().getComponentInterfaceInstances()
				.addAll(componentInterfaceInstances);
		uncertaintyPropagation.getBasicComponentBehaviourContainer().getBasicComponentBehaviours()
				.addAll(basicComponentBehaviours);

	}

	/*
	 * Helper method to retrieve UncertaintyPropagation object from change
	 * propagation steps.
	 */
	private static UncertaintyPropagation getUncertaintyPropagation(UCArchitectureVersion version)
			throws SaveModelFailedException {
		return version.getUncertaintyImpactRepository().getChangePropagationSteps().stream()
				.filter(UncertaintyPropagation.class::isInstance).map(UncertaintyPropagation.class::cast).findFirst()
				.orElseThrow(() -> new SaveModelFailedException("Save propagation failed. No propagation available."));

	}

}
