package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleType;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

/**
 * Propagation algorithm for uncertainties that directly affect
 * {@link AssemblyConnector} entities
 * 
 * @author Niko
 *
 */
public class PropagationFromAffectedCommunicationComponentsHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedCommunicationComponentsHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleType rule) throws UncertaintyPropagationException {

		try {
			switch (rule) {
			case FROM_COMMUNICATION_COMPONENTS_TO_HARDWARE_RESOURCE:
				return propagateFromCommunicationComponentsToHardwareResources(uncertainty);

			default:
				throw new UncertaintyPropagationException(
						"Propagation not possible as rule " + rule + " is not yet implemented");
			}

		} catch (PalladioElementNotFoundException e) {
			throw new UncertaintyPropagationException(
					"Propagation not possible due to following error: " + e.getMessage());
		}

	}

	/**
	 * Important: CommunicationComponents are represented by the top level
	 * AssemblyConnectors. Algorithm: CommunicationComponent to HardwareResource
	 * <br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get both assemblies for given assembly connector (starting/ending). For
	 * both assemblies do:</li>
	 * <li>Retrieve allocation context</li>
	 * <li>Retrieve hardware resource</li>
	 * <li>Create ImpactElement with found path</li>
	 * </ul>
	 * 
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 * @throws PalladioElementNotFoundException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromCommunicationComponentsToHardwareResources(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtHardwareResource> affectedHardwareResources = new ArrayList<>();

		AssemblyConnector communicationComponent = extractCommunicationComponent(uncertainty);
		List<AssemblyContext> assemblyContexts = new ArrayList<>();
		assemblyContexts.add(communicationComponent.getProvidingAssemblyContext_AssemblyConnector());
		assemblyContexts.add(communicationComponent.getRequiringAssemblyContext_AssemblyConnector());

		for (AssemblyContext assemblyContext : assemblyContexts) {

			AllocationContext allocationContext = PalladioModelsLookupHelper
					.getAllocationContextForGivenAssemblyContext(version.getAllocation(), assemblyContext);

			ResourceContainer hardwareResource = allocationContext.getResourceContainer_AllocationContext();

			List<Entity> path = new ArrayList<>();
			path.add(communicationComponent);
			path.add(assemblyContext);
			path.add(allocationContext);
			path.add(hardwareResource);

			CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
					.createCausingUncertainty(this.uncertaintyPropagation);
			causingUncertainty.setCausingUncertainty(uncertainty);
			causingUncertainty.getPath().addAll(path);

			UCImpactAtHardwareResource ucImpact = UncertaintyPropagationFactoryHelper
					.createUCImpactAtHardwareResource();
			ucImpact.setAffectedElement(hardwareResource);
			ucImpact.getCausingElements().add(causingUncertainty);
			ucImpact.setToolderived(true);

			affectedHardwareResources.add(ucImpact);

		}

		return affectedHardwareResources;

	}

	private AssemblyConnector extractCommunicationComponent(Uncertainty uncertainty)
			throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof AssemblyConnector) {
			return (AssemblyConnector) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is AssemblyConnector");

	}

}
