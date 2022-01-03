package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleTypes;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

public class PropagationFromAffectedUsageBehaviourHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedUsageBehaviourHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleTypes rule) throws UncertaintyPropagationException {

		try {
			switch (rule) {

			case FROM_USAGE_BEHAVIOUR_TO_COMPONENT_INTERFACE_INSTANCE:
				return propagateFromUsageBehaviourToComponentInterfaceInstance(uncertainty);

			default:
				throw new UncertaintyPropagationException(
						"Propagation not possible as rule " + rule + " is not yet implemented");

			}
		} catch (PalladioElementNotFoundException e) {
			throw new UncertaintyPropagationException(
					"Propagation not possible due to following error: " + e.getMessage());
		}

	}

	private List<? extends UCImpactEntity<? extends Entity>> propagateFromUsageBehaviourToComponentInterfaceInstance(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtComponentInterfaceInstance> affectedComponentInterfaceInstances = new ArrayList<>();

		EntryLevelSystemCall usageBehaviour = extractUsageBehaviour(uncertainty);
		Role systemInterface = usageBehaviour.getProvidedRole_EntryLevelSystemCall();

		List<Entity> incompletePath = new ArrayList<>();
		incompletePath.add(usageBehaviour);
		incompletePath.add(systemInterface);

		List<ProvidedDelegationConnector> providedSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
				.getAllProvidedDelegationConnectors(version.getSystem());

		/*
		 * EntryLevelSystemCalls only references system provided roles
		 */
		for (ProvidedDelegationConnector providedSystemInterfaceDelegationConnector : providedSystemInterfaceDelegationConnectors) {

			if (!providedSystemInterfaceDelegationConnector.getOuterProvidedRole_ProvidedDelegationConnector().getId()
					.equals(systemInterface.getId())) {
				// Outer role is the actual system interface
				continue;
			}

			ComponentInterfaceInstance componentInterfaceInstance = PalladioModelsLookupHelper
					.getComponentInterfaceInstanceEntityByAssemblyContextAndRole(version.getSystem(),
							providedSystemInterfaceDelegationConnector.getAssemblyContext_ProvidedDelegationConnector(),
							providedSystemInterfaceDelegationConnector
									.getInnerProvidedRole_ProvidedDelegationConnector());

			List<Entity> path = new ArrayList<>(incompletePath);
			path.add(providedSystemInterfaceDelegationConnector);
			path.add(componentInterfaceInstance);

			// Create UCImpactAtSystemInterface with encapsulated CausingUncertainty
			CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
					.createCausingUncertainty(uncertaintyPropagation);
			causingUncertainty.setCausingUncertainty(uncertainty);
			causingUncertainty.getPath().addAll(path);

			UCImpactAtComponentInterfaceInstance ucImpactAtSystemInterface = UncertaintyPropagationFactoryHelper
					.createUCImpactAtComponentInterfaceInstance();
			ucImpactAtSystemInterface.setToolderived(true);
			ucImpactAtSystemInterface.setAffectedElement(componentInterfaceInstance);
			ucImpactAtSystemInterface.getCausingElements().add(causingUncertainty);

			// Add to result set
			affectedComponentInterfaceInstances.add(ucImpactAtSystemInterface);

		}

		return affectedComponentInterfaceInstances;
	}

	private EntryLevelSystemCall extractUsageBehaviour(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof EntryLevelSystemCall) {
			return (EntryLevelSystemCall) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is EntryLevelSystemCall");

	}

}
