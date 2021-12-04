package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
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
 * {@link BasicComponent} entities
 * 
 * @author Niko
 *
 */
public class PropagationFromAffectedBasicComponentTypesHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedBasicComponentTypesHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	/*
	 * Helper method to choose the correct algorithm based on the selected rule
	 */
	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleType rule) throws UncertaintyPropagationException {
		switch (rule) {
		case FROM_BASIC_COMPONENT_TYPE_TO_HARDWARE_RESOURCE:
			return propagateFromBasicComponentTypeToHardwareResource(uncertainty);

		default:
			throw new UncertaintyPropagationException(
					"Propagation not possible as rule " + rule + " is not yet implemented");
		}

	}

	/**
	 * Algorithm: BasicComponentType to HardwareResource <br>
	 * Workflow: <br>
	 * <ul>
	 * <li>IMPORTANT: No direct connection between BasicComponent and Hardware
	 * Resource. Need to iterate over the allocation model which serves as glue
	 * between the two other models.</li>
	 * <li>Extract and iterate overt all allocation contexts</li>
	 * <li>Extract hardware resource and assembly context from allocation context
	 * (not yet sure if added but it is necessary to extract this information)</li>
	 * <li>Extract RepositoryComponent from Assembly</li>
	 * <li>Iteratively inspect RepositoryComponent.</li>
	 * <ul>
	 * <li>BasicComponent: Check if inspected component matches expected. If yes,
	 * add component to path of assembly, allocation, resource container which was
	 * found in previous step.</li>
	 * <li>CompositeComponent: IterativelyInspect encapsulated
	 * RepositoryComponents</li>
	 * </ul>
	 * </ul>
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromBasicComponentTypeToHardwareResource(
			Uncertainty uncertainty) throws UncertaintyPropagationException {

		// Add UCImpactAtHardwareResource within the recursion
		List<UCImpactAtHardwareResource> affectedHardwareResources = new ArrayList<>();

		BasicComponent starting_element = extractBasicComponent(uncertainty);

		// Allocation model is the glue model between assembly/repository and allocation
		for (AllocationContext allocationContext : version.getAllocation().getAllocationContexts_Allocation()) {

			// Potential hardware resource where component might be deployed
			ResourceContainer hardwareResource = allocationContext.getResourceContainer_AllocationContext();

			/*
			 * Build path to actual hardware resource. Composite components and basic
			 * components will be prepended (eg: Comp_1 -> Assembly_1 -> Alloc_1 ->
			 * HWResource_1)
			 */
			List<Entity> incompletePath = new ArrayList<>();
			incompletePath.add(allocationContext.getAssemblyContext_AllocationContext());
			incompletePath.add(allocationContext);
			incompletePath.add(hardwareResource);

			// Extract repository component encapsulated in assembly for the current
			// allocation
			RepositoryComponent repositoryComponent = allocationContext.getAssemblyContext_AllocationContext()
					.getEncapsulatedComponent__AssemblyContext();

			inspectRepositoryComponentRecursively(affectedHardwareResources, repositoryComponent, starting_element,
					incompletePath, hardwareResource, uncertainty);
		}

		return affectedHardwareResources;

	}

	/*
	 * Repository Component are either basic components or composite components. In
	 * the first case, check if basic components are matching (if yes, create
	 * ucImpactAtHardwareResource with actual values). In the second case, inspect
	 * each encapsulated assembly context for basic components
	 */
	private void inspectRepositoryComponentRecursively(List<UCImpactAtHardwareResource> affectedHardwareResources,
			RepositoryComponent repositoryComponent, BasicComponent starting_element, List<Entity> currentPath,
			ResourceContainer hardwareResource, Uncertainty uncertainty) {

		// end recursion here!
		if (repositoryComponent instanceof BasicComponent) {
			if (repositoryComponent.getId().equals(starting_element.getId())) { // MATCH!
				// Prepend component to path
				List<Entity> local_path = new ArrayList<>(currentPath);
				local_path.add(0, repositoryComponent);

				// Create UCImpactAtHardwareResource with encapsulated CausingUncertainty
				CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
						.createCausingUncertainty(uncertaintyPropagation);
				causingUncertainty.setCausingUncertainty(uncertainty);
				causingUncertainty.getPath().addAll(local_path);

				UCImpactAtHardwareResource ucImpactAtHardwareResource = UncertaintyPropagationFactoryHelper
						.createUCImpactAtHardwareResource();
				ucImpactAtHardwareResource.setToolderived(true);
				ucImpactAtHardwareResource.setAffectedElement(hardwareResource);
				ucImpactAtHardwareResource.getCausingElements().add(causingUncertainty);

				// Add to result set
				affectedHardwareResources.add(ucImpactAtHardwareResource);

			}

		} else if (repositoryComponent instanceof CompositeComponent) {
			// Loop over assembly contexts -> For each context, do recursive call
			for (AssemblyContext assemblyContext : ((CompositeComponent) repositoryComponent)
					.getAssemblyContexts__ComposedStructure()) {
				// copy path due to recursion
				List<Entity> local_path = new ArrayList<>(currentPath);
				RepositoryComponent newRepositoryComponent = assemblyContext
						.getEncapsulatedComponent__AssemblyContext();

				//Add currently inspected repository and encapsulated assembly to path
				local_path.add(0, repositoryComponent);
				local_path.add(0, assemblyContext);

				inspectRepositoryComponentRecursively(affectedHardwareResources, newRepositoryComponent,
						starting_element, local_path, hardwareResource, uncertainty);

			}

		}

	}

	private BasicComponent extractBasicComponent(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof BasicComponent) {
			return (BasicComponent) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is BasicComponent");

	}

}
