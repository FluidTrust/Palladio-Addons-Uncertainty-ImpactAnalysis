package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

/**
 * Propagation algorithm for uncertainties that directly affect
 * {@link ResourceContainer} entities
 * 
 * @author Niko
 *
 */
public class PropagationFromAffectedHardwareResourceHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedHardwareResourceHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleType rule) throws UncertaintyPropagationException {

		try {

			switch (rule) {
			case FROM_HARDWARE_RESOURCE_TO_COMMUNICATION_COMPONENTS:
				return propagateFromHardwareResourceToCommunicationComponents(uncertainty);

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
	 * Important: Extract top level communication components between the assemblies
	 * that are deployed on the given hardware resource. Also check for assemblies
	 * that are deployed in nested resource containers. <br>
	 * Algorithm: HardwareResource to CommunicationComponent<br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get all potential communication components (top down approach)</li>
	 * <li>Get Hardware Resource</li>
	 * <li>Extract and add nested resource containers</li>
	 * <li>For each container do the following:</li>
	 * <li>Check for all AssemblyConnectors if both referenced assemblies are
	 * allocated on a the investigated container</li>
	 * <ul>
	 * <li>No: Do nothing</li>
	 * <li>Yes: Match found. Build path and create ImapctEntity</li>
	 * </ul>
	 * </ul>
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 * @throws PalladioElementNotFoundException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromHardwareResourceToCommunicationComponents(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtCommunicationComponents> affectedCommunicationComponents = new ArrayList<>();

		ResourceContainer hardwareResource = extractHardwareResource(uncertainty);

		// Extract IDs of hardware resource and nested resources
		List<ResourceContainer> hardwareResourceWithNestedResources = new ArrayList<>();
		findNestedResourceContainers(hardwareResourceWithNestedResources, hardwareResource);
		// We need to check against this set of IDs
		List<String> nestedResourceContainerIDs = hardwareResourceWithNestedResources.stream()
				.map(ResourceContainer::getId).collect(Collectors.toList());

		// Top down approach necessary -> Build Path in reverse order
		List<AssemblyConnector> communicationComponents = PalladioModelsLookupHelper
				.getAllCommunicationComponentEntities(version.getSystem());

		/*
		 * Check for each possible communication component if providing/requiring
		 * AssemblyContext is allocated on given hardware resource.
		 */
		for (AssemblyConnector communicationComponent : communicationComponents) {

			/*
			 * CommunicationComponent (=Assembly Connector) has providing and requiring
			 * Assembly. Need to check both.
			 */
			List<AssemblyContext> assemblyContexts = new ArrayList<>();
			assemblyContexts.add(communicationComponent.getProvidingAssemblyContext_AssemblyConnector());
			assemblyContexts.add(communicationComponent.getRequiringAssemblyContext_AssemblyConnector());

			for (AssemblyContext assemblyContext : assemblyContexts) {

				AllocationContext allocationContext = PalladioModelsLookupHelper
						.getAllocationContextForGivenAssemblyContext(version.getAllocation(), assemblyContext);
				if (allocationContext == null) {
					throw new UncertaintyPropagationException(
							"No AllocationContext found for Assembly with id " + assemblyContext.getId());
				}

				ResourceContainer allocatedHardwareResource = allocationContext
						.getResourceContainer_AllocationContext();
				if (nestedResourceContainerIDs.contains(allocatedHardwareResource.getId())) { // MATCH!
					// Build path in reverse order!
					List<Entity> path = new ArrayList<>();
					path.add(hardwareResource);
					path.add(allocationContext);
					path.add(assemblyContext);
					path.add(communicationComponent);

					CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
							.createCausingUncertainty(this.uncertaintyPropagation);
					causingUncertainty.setCausingUncertainty(uncertainty);
					causingUncertainty.getPath().addAll(path);

					UCImpactAtCommunicationComponents ucImpact = UncertaintyPropagationFactoryHelper
							.createUCImpactAtCommunicationComponents();
					ucImpact.setAffectedElement(communicationComponent);
					ucImpact.getCausingElements().add(causingUncertainty);
					ucImpact.setToolderived(true);

					affectedCommunicationComponents.add(ucImpact);

				}
			}

		}

		return affectedCommunicationComponents;

	}

	/*
	 * Resource Container might contain nested resource container.
	 */
	private void findNestedResourceContainers(List<ResourceContainer> resultList,
			ResourceContainer resourceContainerToBeChecked) {

		resultList.add(resourceContainerToBeChecked);
		for (ResourceContainer nestedResourceContainer : resourceContainerToBeChecked
				.getNestedResourceContainers__ResourceContainer()) {
			findNestedResourceContainers(resultList, nestedResourceContainer);
		}
	}

	private ResourceContainer extractHardwareResource(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof ResourceContainer) {
			return (ResourceContainer) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is ResourceContainer");

	}

}
