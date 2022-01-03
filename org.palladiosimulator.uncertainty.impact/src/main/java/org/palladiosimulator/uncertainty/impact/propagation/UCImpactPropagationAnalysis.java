package org.palladiosimulator.uncertainty.impact.propagation;

import java.util.List;

import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedBasicComponentBehaviourHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedBasicComponentTypesHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedCommunicationComponentsHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedComponentInterfaceTypeHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedHardwareResourceHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedSystemHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedSystemInterfaceHelper;
import org.palladiosimulator.uncertainty.impact.propagation.algorithms.PropagationFromAffectedUsageBehaviourHelper;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

/**
 * This class starts the actual propagation based on a given version. It
 * extracts the propagation input and calculates the output based on pre-defined
 * rules. For each rule we specify an algorithm (so far, not all algorithms are
 * implemented, as indicated by the exception below).
 * 
 * @author Niko
 *
 */
public class UCImpactPropagationAnalysis {

	private UCImpactPropagationAnalysis() {

	}

	public static UCArchitectureVersion runUncertaintyPropagationAnalysis(UCArchitectureVersion version)
			throws UncertaintyPropagationException {

		// Holds actual uncertainty impact propagations (=change propagation step)
		UncertaintyPropagation uncertaintyPropagation = UncertaintyPropagationFactoryHelper
				.createUncertaintyPropagation();
		uncertaintyPropagation.setBasicComponentBehaviourContainer(
				UncertaintyPropagationFactoryHelper.createBasicComponentBehaviourContainer());
		uncertaintyPropagation.setComponentInterfaceInstanceContainer(
				UncertaintyPropagationFactoryHelper.createComponentInterfaceInstanceContainer());
		version.getModificationMarkRepository().getChangePropagationSteps().add(uncertaintyPropagation);

		calculatePropagation(version, uncertaintyPropagation);

		return version;

	}

	/**
	 * Extracts propagation input for each type (= class extending
	 * {@link UCImpactEntity})
	 * 
	 * @param version
	 * @param uncertaintyPropagation
	 * @throws UncertaintyPropagationException
	 */
	private static void calculatePropagation(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {

		// Seed holds input data
		UCPropagationRulesSeed seed = version.getModificationMarkRepository().getSeedModifications();

		caclulcatePropagationFromAffectedBasicComponentBehaviours(seed.getAffectedBasicComponentBehaviours(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedBasicComponentTypes(seed.getAffectedBasicComponentTypes(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedCommunicationComponents(seed.getAffectedCommunicationComponents(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedCommunicationResources(seed.getAffectedCommunicationResources(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedComponentInstances(seed.getAffectedComponentInstances(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedComponentInterfaceInstances(seed.getAffectedComponentInterfaceInstances(),
				version, uncertaintyPropagation);
		caclulcatePropagationFromAffectedComponentInterfaceTypes(seed.getAffectedComponentInterfaceTypes(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedHardwareResources(seed.getAffectedHardwareResources(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedSystems(seed.getAffectedSystems(), version, uncertaintyPropagation);
		caclulcatePropagationFromAffectedSystemInterfaces(seed.getAffectedSystemInterfaces(), version,
				uncertaintyPropagation);
		caclulcatePropagationFromAffectedUsageBehaviours(seed.getAffectedUsageBehaviours(), version,
				uncertaintyPropagation);

	}

	private static void caclulcatePropagationFromAffectedBasicComponentBehaviours(
			List<UCImpactAtBasicComponentBehaviour> affectedBasicComponentBehaviours, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {

		if (affectedBasicComponentBehaviours.isEmpty()) {
			return;
		}

		PropagationFromAffectedBasicComponentBehaviourHelper helper = new PropagationFromAffectedBasicComponentBehaviourHelper(
				version, uncertaintyPropagation);
		helper.propagate(affectedBasicComponentBehaviours);

	}

	private static void caclulcatePropagationFromAffectedBasicComponentTypes(
			List<UCImpactAtBasicComponentType> affectedBasicComponentTypes, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedBasicComponentTypes.isEmpty()) {
			return;
		}
		PropagationFromAffectedBasicComponentTypesHelper helper = new PropagationFromAffectedBasicComponentTypesHelper(
				version, uncertaintyPropagation);
		helper.propagate(affectedBasicComponentTypes);
	}

	private static void caclulcatePropagationFromAffectedCommunicationComponents(
			List<UCImpactAtCommunicationComponents> affectedCommunicationComponents, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedCommunicationComponents.isEmpty()) {
			return;
		}
		PropagationFromAffectedCommunicationComponentsHelper helper = new PropagationFromAffectedCommunicationComponentsHelper(
				version, uncertaintyPropagation);
		helper.propagate(affectedCommunicationComponents);

	}

	private static void caclulcatePropagationFromAffectedCommunicationResources(
			List<UCImpactAtCommunicationResources> affectedCommunicationResources, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedCommunicationResources.isEmpty()) {
			return;
		}
		throw new UncertaintyPropagationException(
				"Currently no propagation supported from uncertainty impact at communication resources!");

	}

	private static void caclulcatePropagationFromAffectedComponentInstances(
			List<UCImpactAtComponentInstance> affectedComponentInstances, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedComponentInstances.isEmpty()) {
			return;
		}
		throw new UncertaintyPropagationException(
				"Currently no propagation supported from uncertainty impact at component instances!");

	}

	private static void caclulcatePropagationFromAffectedComponentInterfaceInstances(
			List<UCImpactAtComponentInterfaceInstance> affectedComponentInterfaceInstances,
			UCArchitectureVersion version, UncertaintyPropagation uncertaintyPropagation)
			throws UncertaintyPropagationException {
		if (affectedComponentInterfaceInstances.isEmpty()) {
			return;
		}
		throw new UncertaintyPropagationException(
				"Currently no propagation supported from uncertainty impact at component interface instances!");

	}

	private static void caclulcatePropagationFromAffectedComponentInterfaceTypes(
			List<UCImpactAtComponentInterfaceType> affectedComponentInterfaceTypes, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedComponentInterfaceTypes.isEmpty()) {
			return;
		}

		PropagationFromAffectedComponentInterfaceTypeHelper helper = new PropagationFromAffectedComponentInterfaceTypeHelper(
				version, uncertaintyPropagation);
		helper.propagate(affectedComponentInterfaceTypes);
	}

	private static void caclulcatePropagationFromAffectedHardwareResources(
			List<UCImpactAtHardwareResource> affectedHardwareResources, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedHardwareResources.isEmpty()) {
			return;
		}
		PropagationFromAffectedHardwareResourceHelper helper = new PropagationFromAffectedHardwareResourceHelper(
				version, uncertaintyPropagation);
		helper.propagate(affectedHardwareResources);

	}

	private static void caclulcatePropagationFromAffectedSystems(List<UCImpactAtSystem> affectedSystems,
			UCArchitectureVersion version, UncertaintyPropagation uncertaintyPropagation)
			throws UncertaintyPropagationException {
		if (affectedSystems.isEmpty()) {
			return;
		}
		PropagationFromAffectedSystemHelper helper = new PropagationFromAffectedSystemHelper(version,
				uncertaintyPropagation);
		helper.propagate(affectedSystems);

	}

	private static void caclulcatePropagationFromAffectedSystemInterfaces(
			List<UCImpactAtSystemInterface> affectedSystemInterfaces, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedSystemInterfaces.isEmpty()) {
			return;
		}

		PropagationFromAffectedSystemInterfaceHelper helper = new PropagationFromAffectedSystemInterfaceHelper(version,
				uncertaintyPropagation);

		helper.propagate(affectedSystemInterfaces);
		
	}

	private static void caclulcatePropagationFromAffectedUsageBehaviours(
			List<UCImpactAtUsageBehaviour> affectedUsageBehaviours, UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) throws UncertaintyPropagationException {
		if (affectedUsageBehaviours.isEmpty()) {
			return;
		}
		
		PropagationFromAffectedUsageBehaviourHelper helper = new PropagationFromAffectedUsageBehaviourHelper(version,
				uncertaintyPropagation);
		
		helper.propagate(affectedUsageBehaviours);
		
	}

}
