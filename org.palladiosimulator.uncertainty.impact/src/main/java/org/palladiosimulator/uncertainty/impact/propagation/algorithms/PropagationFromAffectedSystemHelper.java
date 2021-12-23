package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleTypes;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

/**
 * Propagation algorithm for uncertainties that directly affect {@link System}
 * entities
 * 
 * @author Niko
 *
 */
public class PropagationFromAffectedSystemHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedSystemHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleTypes rule) throws UncertaintyPropagationException {

		switch (rule) {
		case FROM_SYSTEM_TO_COMMUNICATION_COMPONENT:
			return propagateFromSystemToCommunicationComponents(uncertainty);

		case FROM_SYSTEM_TO_SYSTEM_INTERFACE:
			return propagateFromSystemToSystemInterfaces(uncertainty);

		case FROM_SYSTEM_TO_COMPONENT_INTERFACE_INSTANCE:
			return propagateFromSystemToComponentInterfaceInstance(uncertainty);

		case FROM_SYSTEM_TO_COMPONENT_INTERFACE_TYPE:
			return propagateFromSystemToComponentInterfaceType(uncertainty);

		default:
			throw new UncertaintyPropagationException(
					"Propagation not possible as rule " + rule + " is not yet implemented");
		}

	}

	/**
	 * Important: Communication components are all assembly connectors at assembly
	 * level. Assemblies within composite components are not considered as composite
	 * components are black boxes from the system point of view. <br>
	 * Algorithm: System to CommunicationComponent<br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get all potential communication components at system level</li>
	 * <li>Create UCImpactEntity with specified path</li>
	 * 
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromSystemToCommunicationComponents(
			Uncertainty uncertainty) throws UncertaintyPropagationException {

		List<UCImpactAtCommunicationComponents> affectedCommunicationComponents = new ArrayList<>();

		System system = extractSystem(uncertainty);
		List<AssemblyConnector> communicationComponents;

		try {
			// Possible affected components are all communication components at assembly
			// level (Assemblies within composite components are not considered)
			communicationComponents = PalladioModelsLookupHelper.getAllCommunicationComponentEntities(system);
		} catch (PalladioElementNotFoundException e) {
			throw new UncertaintyPropagationException("Propagation not possible. Error message: " + e.getMessage());
		}

		for (AssemblyConnector communicationComponent : communicationComponents) {

			List<Entity> path = new ArrayList<>();
			path.add(system);
			path.add(communicationComponent);

			CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
					.createCausingUncertainty(uncertaintyPropagation);
			causingUncertainty.setCausingUncertainty(uncertainty);
			causingUncertainty.getPath().addAll(path);

			UCImpactAtCommunicationComponents ucImpactAtCommunicationComponents = UncertaintyPropagationFactoryHelper
					.createUCImpactAtCommunicationComponents();
			ucImpactAtCommunicationComponents.setToolderived(true);
			ucImpactAtCommunicationComponents.setAffectedElement(communicationComponent);
			ucImpactAtCommunicationComponents.getCausingElements().add(causingUncertainty);

			affectedCommunicationComponents.add(ucImpactAtCommunicationComponents);
		}

		return affectedCommunicationComponents;

	}

	/**
	 * Important: System interfaces are all interfaces retrieved directly from the
	 * system (provided and required) <br>
	 * Algorithm: System to CommunicationComponent<br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get all potential System interfaces</li>
	 * <li>Create UCImpactEntity with specified path</li>
	 * 
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromSystemToSystemInterfaces(
			Uncertainty uncertainty) throws UncertaintyPropagationException {
		List<UCImpactAtSystemInterface> affectedSystemInterfaces = new ArrayList<>();

		System system = extractSystem(uncertainty);
		List<Role> systemInterfaces;

		try {
			// Possible affected components are all communication components at assembly
			// level (Assemblies within composite components are not considered)
			systemInterfaces = PalladioModelsLookupHelper.getAllSystemInterfaceEntities(system);
		} catch (PalladioElementNotFoundException e) {
			throw new UncertaintyPropagationException("Propagation not possible. Error message: " + e.getMessage());
		}

		for (Role systemInterface : systemInterfaces) {

			List<Entity> path = new ArrayList<>();
			path.add(system);
			path.add(systemInterface);

			CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
					.createCausingUncertainty(uncertaintyPropagation);
			causingUncertainty.setCausingUncertainty(uncertainty);
			causingUncertainty.getPath().addAll(path);

			UCImpactAtSystemInterface ucImpactAtSystemInterface = UncertaintyPropagationFactoryHelper
					.createUCImpactAtSystemInterface();
			ucImpactAtSystemInterface.setToolderived(true);
			ucImpactAtSystemInterface.setAffectedElement(systemInterface);
			ucImpactAtSystemInterface.getCausingElements().add(causingUncertainty);

			affectedSystemInterfaces.add(ucImpactAtSystemInterface);
		}

		return affectedSystemInterfaces;

	}

	/**
	 * Important: Component Interface Instances are all Interfaces of instantiated
	 * top level components (which are either basic components or composite
	 * components). For composite components, we do not inspect the encapsulated
	 * component interfaces, as composite components are considered as black boxes
	 * from the system perspective. Therefore, we are only interested in the
	 * interfaces provided by composite components. <br>
	 * Algorithm: System to CommunicationComponent<br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get all potential component interface instance entities directly</li>
	 * <li>Create UCImpactEntity with specified path and encapsulated top level
	 * assembly</li>
	 * 
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromSystemToComponentInterfaceInstance(
			Uncertainty uncertainty) throws UncertaintyPropagationException {

		List<UCImpactAtComponentInterfaceInstance> affectedComponentInterfaceInstances = new ArrayList<>();

		System system = extractSystem(uncertainty);
		List<ComponentInterfaceInstance> componentInterfaceInstances;

		try {
			// Possible affected components are all communication components at assembly
			// level (Assemblies within composite components are not considered)
			componentInterfaceInstances = PalladioModelsLookupHelper.getAllComponentInterfaceInstanceEntities(system);
		} catch (PalladioElementNotFoundException e) {
			throw new UncertaintyPropagationException("Propagation not possible. Error message: " + e.getMessage());
		}

		for (ComponentInterfaceInstance componentInterfaceInstance : componentInterfaceInstances) {

			List<Entity> path = new ArrayList<>();
			path.add(system);
			path.add(componentInterfaceInstance.getAssemblyContext());
			path.add(componentInterfaceInstance);

			CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
					.createCausingUncertainty(uncertaintyPropagation);
			causingUncertainty.setCausingUncertainty(uncertainty);
			causingUncertainty.getPath().addAll(path);

			UCImpactAtComponentInterfaceInstance ucImpactAtComponentInterfaceInstance = UncertaintyPropagationFactoryHelper
					.createUCImpactAtComponentInterfaceInstance();
			ucImpactAtComponentInterfaceInstance.setToolderived(true);
			ucImpactAtComponentInterfaceInstance.setAffectedElement(componentInterfaceInstance);
			ucImpactAtComponentInterfaceInstance.getCausingElements().add(causingUncertainty);
			affectedComponentInterfaceInstances.add(ucImpactAtComponentInterfaceInstance);
		}

		return affectedComponentInterfaceInstances;

	}

	/**
	 * Important: Interface Types are all Interfaces of all instantiated basic
	 * components of the given system. Therefore, we need to inspect composite
	 * component in order to extract their basic components recursively. <br>
	 * Algorithm: System to ComponentInterfaceType<br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get all potential top level assemblies assemblies</li>
	 * <li>For each assembly, investigate encapsulated component:</li>
	 * <ul>
	 * <li>BasicComponent: Extract all interfaces and create UCImpactEntity</li>
	 * <li>CompositeComponent: Iteratively inspect all encapuslated
	 * RepositoryComponents</li>
	 * </ul>
	 * </ul>
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromSystemToComponentInterfaceType(
			Uncertainty uncertainty) throws UncertaintyPropagationException {

		List<UCImpactAtComponentInterfaceType> affectedComponentInterfaceTypes = new ArrayList<>();

		System system = extractSystem(uncertainty);

		for (AssemblyContext assemblyContext : system.getAssemblyContexts__ComposedStructure()) {
			RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();

			List<Entity> incompletePath = new ArrayList<>();
			incompletePath.add(system);
			incompletePath.add(repositoryComponent);

			inspectRepositoryComponentsRecursively(affectedComponentInterfaceTypes, repositoryComponent, incompletePath,
					uncertainty);
		}

		return affectedComponentInterfaceTypes;

	}

	/*
	 * 
	 * Repository Components are either basic components or composite components. In
	 * the first case, create UCImpactAtComponentInterfaceType and stop recursion.
	 * In the second case, inspect each encapsulated assembly context for basic
	 * components.
	 */

	private void inspectRepositoryComponentsRecursively(
			List<UCImpactAtComponentInterfaceType> affectedComponentInterfaceTypes,
			RepositoryComponent repositoryComponent, List<Entity> currentPath, Uncertainty uncertainty) {

		if (repositoryComponent instanceof BasicComponent) { // Stop Recursion

			BasicComponent basicComponent = (BasicComponent) repositoryComponent;

			// We do not distinguish between provided or required interfaces
			List<Role> roles = new ArrayList<>();
			roles.addAll(basicComponent.getProvidedRoles_InterfaceProvidingEntity());
			roles.addAll(basicComponent.getRequiredRoles_InterfaceRequiringEntity());
			
		

			for (Role role : roles) {
				List<Entity> local_path = new ArrayList<>(currentPath);
				local_path.add(role);
				
				
				if(role instanceof OperationProvidedRole) {
					local_path.add( ((OperationProvidedRole) role).getProvidedInterface__OperationProvidedRole() );
				} else if(role instanceof OperationRequiredRole) {
					local_path.add( ((OperationRequiredRole) role).getRequiredInterface__OperationRequiredRole() );
				}

				CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
						.createCausingUncertainty(uncertaintyPropagation);
				causingUncertainty.setCausingUncertainty(uncertainty);
				causingUncertainty.getPath().addAll(local_path);

				UCImpactAtComponentInterfaceType ucImpactAtComponentInterfaceType = UncertaintyPropagationFactoryHelper
						.createUCImpactAtComponentInterfaceType();
				ucImpactAtComponentInterfaceType.setToolderived(true);
				ucImpactAtComponentInterfaceType.setAffectedElement(role);
				ucImpactAtComponentInterfaceType.getCausingElements().add(causingUncertainty);

				affectedComponentInterfaceTypes.add(ucImpactAtComponentInterfaceType);
			}

		} else if (repositoryComponent instanceof CompositeComponent) { // Loop over all assembly contexts
			for (AssemblyContext assemblyContext : ((CompositeComponent) repositoryComponent)
					.getAssemblyContexts__ComposedStructure()) {

				RepositoryComponent newRepositoryComponent = assemblyContext
						.getEncapsulatedComponent__AssemblyContext();

				// copy path due to recursion
				List<Entity> local_path = new ArrayList<>(currentPath);
				local_path.add(0, repositoryComponent);
				local_path.add(0, assemblyContext);
				inspectRepositoryComponentsRecursively(affectedComponentInterfaceTypes, newRepositoryComponent,
						local_path, uncertainty);

			}
		}

	}

	private System extractSystem(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof System) {
			return (System) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is System");

	}

}
