package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleTypes;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
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
			PropagationRuleTypes rule) throws UncertaintyPropagationException {
		try {
			switch (rule) {
			case FROM_BASIC_COMPONENT_TYPE_TO_HARDWARE_RESOURCE:
				return propagateFromBasicComponentTypeToHardwareResource(uncertainty);

			case FROM_BASIC_COMPONENT_TYPE_TO_SYSTEM_INTERFACE:
				return propagateFromBasicComponentTypeToSystemInterface(uncertainty);

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

				// Add currently inspected repository and encapsulated assembly to path
				local_path.add(0, repositoryComponent);
				local_path.add(0, assemblyContext);

				inspectRepositoryComponentRecursively(affectedHardwareResources, newRepositoryComponent,
						starting_element, local_path, hardwareResource, uncertainty);

			}

		}

	}

	/**
	 * Algorithm: BasicComponentType to SystemInterface <br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Retrieve all system interfaces</li>
	 * <li>For each interface: Extract referencing assembly</li>
	 * <li>For each assembly: iteratively inspect if encapsulated Component is
	 * BasicComponent</li>
	 * <ul>
	 * <li>Yes: Check if basic component matches the expected</li>
	 * <li>No: Recursively check all encapsulated components</li>
	 * </ul>
	 * </ul>
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @throws UncertaintyPropagationException
	 * @throws UncertaintyPropagationExceptiono
	 * @throws PalladioElementNotFoundException
	 * @throws
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromBasicComponentTypeToSystemInterface(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		// Result
		List<UCImpactAtSystemInterface> affectedSystemInterfaces = new ArrayList<>();

		// Starting element
		BasicComponent basicComponent = extractBasicComponent(uncertainty);

		List<ProvidedDelegationConnector> providedSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
				.getAllProvidedDelegationConnectors(version.getSystem());

		for (ProvidedDelegationConnector providedSystemInterfaceDelegationConnector : providedSystemInterfaceDelegationConnectors) {

			// Outer provided role represents system interface
			Role systemInterface = providedSystemInterfaceDelegationConnector.getOuterProvidedRole_ProvidedDelegationConnector();
			AssemblyContext referencingAssemblyContext = providedSystemInterfaceDelegationConnector
					.getAssemblyContext_ProvidedDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(0, providedSystemInterfaceDelegationConnector);
			incompletePath.add(0, referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForMatchingBasicComponent(referencingAssemblyContext, basicComponent,
					incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
		}

		/*
		 * Due to palladio implementation, we need to inspect required and provided
		 * delegation connectors separately.
		 * (ProvidedDelegationConnector,RequiredDelegationConnector do not have common
		 * super type with required methods)
		 */

		List<RequiredDelegationConnector> requiredSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
				.getAllRequiredDelegationConnectors(version.getSystem());

		for (RequiredDelegationConnector requiredSystemInterfaceDelegationConnector : requiredSystemInterfaceDelegationConnectors) {

			// Outer required role also represents system interface
			Role systemInterface = requiredSystemInterfaceDelegationConnector.getOuterRequiredRole_RequiredDelegationConnector();
			AssemblyContext referencingAssemblyContext = requiredSystemInterfaceDelegationConnector
					.getAssemblyContext_RequiredDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(0, requiredSystemInterfaceDelegationConnector);
			incompletePath.add(0, referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForMatchingBasicComponent(referencingAssemblyContext, basicComponent,
					incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
		}

		return affectedSystemInterfaces;

	}

	/**
	 * Inspect assembly context recursively. If encapsulated component is basic
	 * component, check if ID matches the expected basic component. If yes, path
	 * from System interface to BasicComponent is found and system interfaces needs
	 * to be added to affected system Interfaces. If not found, ignore this path. If
	 * encapsulated component is composite component, inspect assemblies of this
	 * component. Remember: In this case, we need to build the path in the reverse
	 * order as we need impact from BasicComponentBehaviour to SystemInterface but
	 * can only traverse PalladioModel from SystemInterfaces to
	 * BasicComponentBehaviours. Ugly but necessary.
	 * 
	 * @param assemblyContext
	 * @param basicComponentBehaviour
	 * @param incompletePath
	 * @param uncertainty
	 * @param systemInterface
	 * @param affectedSystemInterfaces
	 * @throws UncertaintyPropagationException
	 */
	private void inspectAssemblyContexRecursivelyForMatchingBasicComponent(AssemblyContext assemblyContext,
			BasicComponent expectedBasicComponent, List<Entity> incompletePath, Uncertainty uncertainty,
			Role systemInterface, List<UCImpactAtSystemInterface> affectedSystemInterfaces)
			throws UncertaintyPropagationException {

		RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();

		if (repositoryComponent instanceof BasicComponent) {
			BasicComponent basicComponent = (BasicComponent) repositoryComponent;

			if (basicComponent.getId().equals(expectedBasicComponent.getId())) { // MATCH!
				List<Entity> local_path = new LinkedList<>(incompletePath);
				local_path.add(0, basicComponent);

				// Create UCImpactAtSystemInterface with encapsulated CausingUncertainty
				CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
						.createCausingUncertainty(uncertaintyPropagation);
				causingUncertainty.setCausingUncertainty(uncertainty);
				causingUncertainty.getPath().addAll(local_path);

				UCImpactAtSystemInterface ucImpactAtSystemInterface = UncertaintyPropagationFactoryHelper
						.createUCImpactAtSystemInterface();
				ucImpactAtSystemInterface.setToolderived(true);
				ucImpactAtSystemInterface.setAffectedElement(systemInterface);
				ucImpactAtSystemInterface.getCausingElements().add(causingUncertainty);
				
				affectedSystemInterfaces.add(ucImpactAtSystemInterface);
			}

		} else if (repositoryComponent instanceof CompositeComponent) {
			// Loop over all assembly contexts of -> For each context, do recursive call
			for (AssemblyContext innerAssemblyContext : ((CompositeComponent) repositoryComponent)
					.getAssemblyContexts__ComposedStructure()) {
				// Copy path due to recursion
				List<Entity> local_path = new LinkedList<>(incompletePath);
				local_path.add(0, repositoryComponent);
				local_path.add(0, innerAssemblyContext);

				inspectAssemblyContexRecursivelyForMatchingBasicComponent(innerAssemblyContext, expectedBasicComponent,
						incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
			}

		} else {
			throw new UncertaintyPropagationException("RepositoryComponent " + repositoryComponent.getEntityName()
					+ " is expected to be either basic component or composite component");
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
