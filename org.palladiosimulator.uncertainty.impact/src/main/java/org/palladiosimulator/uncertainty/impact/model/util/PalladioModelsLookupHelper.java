
package org.palladiosimulator.uncertainty.impact.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.DelegationConnector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.core.entity.InterfaceRequiringEntity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.Branch;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.Loop;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.Start;
import org.palladiosimulator.pcm.usagemodel.Stop;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;

/**
 * This class serves as convenience to access palladio elements from palladio
 * models by certain criteria (for instance: access by id)
 * 
 * @author Niko
 *
 */
public class PalladioModelsLookupHelper {

	private PalladioModelsLookupHelper() {

	}

	public static List<BasicComponentBehaviour> getAllBasicComponentBehaviourEntities(Repository repository)
			throws PalladioElementNotFoundException {
		validate(repository);

		/*
		 * Special handling necessary ->
		 * (palladioElementTypeFactoryHelper.createBasicComponentBehaviour()) as
		 * ResourceDemandingSEFF does not extend Entity -> Need to encapsulate in newly
		 * create type BasicComponentBehaviour which extends from Entity
		 * 
		 */
		return getAllBasicComponentTypeEntities(repository).stream()
				.map(BasicComponent::getServiceEffectSpecifications__BasicComponent).flatMap(List::stream)
				.filter(ResourceDemandingSEFF.class::isInstance)
				.map(x -> PalladioElementWrapperFactoryHelper.createBasicComponentBehaviour((ResourceDemandingSEFF) x))
				.collect(Collectors.toList());

	}

	public static BasicComponentBehaviour getBasicComponentBehaviourEntityById(Repository repository, String id)
			throws PalladioElementNotFoundException {
		validate(repository);
		return getAllBasicComponentBehaviourEntities(repository).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(() -> new PalladioElementNotFoundException(
						"Basic Component Behaviour with id " + id + " not found"));
	}

	public static List<BasicComponent> getAllBasicComponentTypeEntities(Repository repository)
			throws PalladioElementNotFoundException {
		validate(repository);
		return repository.getComponents__Repository().stream().filter(BasicComponent.class::isInstance)
				.map(BasicComponent.class::cast).collect(Collectors.toList());
	}

	public static BasicComponent getBasicComponentTypeEntityById(Repository repository, String id)
			throws PalladioElementNotFoundException {
		validate(repository);
		return getAllBasicComponentTypeEntities(repository).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(
						() -> new PalladioElementNotFoundException("Basic Component with id " + id + " not found"));
	}

	public static List<AssemblyConnector> getAllCommunicationComponentEntities(System system)
			throws PalladioElementNotFoundException {
		validate(system);
		return system.getConnectors__ComposedStructure().stream().filter(AssemblyConnector.class::isInstance)
				.map(AssemblyConnector.class::cast).collect(Collectors.toList());
	}

	public static AssemblyConnector getCommunicationComponentEntityById(System system, String id)
			throws PalladioElementNotFoundException {
		validate(system);
		return getAllCommunicationComponentEntities(system).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(() -> new PalladioElementNotFoundException(
						"Communication (Component) with id " + id + " not found"));
	}

	public static List<LinkingResource> getAllCommunicationResourceEntities(ResourceEnvironment resourceEnvironment)
			throws PalladioElementNotFoundException {
		validate(resourceEnvironment);
		return resourceEnvironment.getLinkingResources__ResourceEnvironment();
	}

	public static LinkingResource getCommunicationResourceEntityById(ResourceEnvironment resourceEnvironment, String id)
			throws PalladioElementNotFoundException {
		validate(resourceEnvironment);
		return getAllCommunicationResourceEntities(resourceEnvironment).stream().filter(x -> x.getId().equals(id))
				.findFirst().orElseThrow(() -> new PalladioElementNotFoundException(
						"Communication (Resource) with id " + id + " not found"));
	}

	public static List<AssemblyContext> getAllComponentInstanceEntities(System system)
			throws PalladioElementNotFoundException {
		validate(system);
		return system.getAssemblyContexts__ComposedStructure();
	}

	public static AssemblyContext getComponentInstanceEntityById(System system, String id)
			throws PalladioElementNotFoundException {
		validate(system);
		return getAllComponentInstanceEntities(system).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(
						() -> new PalladioElementNotFoundException("Component instance with id " + id + " not found"));
	}

	public static List<ComponentInterfaceInstance> getAllComponentInterfaceInstanceEntities(System system)
			throws PalladioElementNotFoundException {
		validate(system);
		List<ComponentInterfaceInstance> componentInterfaces = new ArrayList<>();
		/*
		 * Special handling required, as assemblyContexts reference the component type
		 * interface (=role) only. This means that two assemblies with the same
		 * component reference the same interface id. As we want to instantiate
		 * uncertainties at instantiated interfaces, we need to "hack" this by using a
		 * self-defined type that references the assembly context and the interface
		 */
		for (AssemblyContext assemblyContext : system.getAssemblyContexts__ComposedStructure()) {
			EList<ProvidedRole> providedRoles = assemblyContext.getEncapsulatedComponent__AssemblyContext()
					.getProvidedRoles_InterfaceProvidingEntity();
			EList<RequiredRole> requiredRoles = assemblyContext.getEncapsulatedComponent__AssemblyContext()
					.getRequiredRoles_InterfaceRequiringEntity();

			for (Role providedRole : providedRoles) {
				componentInterfaces.add(PalladioElementWrapperFactoryHelper
						.createComponentInterfaceInstance(assemblyContext, providedRole));
			}
			for (Role requiredRole : requiredRoles) {
				componentInterfaces.add(PalladioElementWrapperFactoryHelper
						.createComponentInterfaceInstance(assemblyContext, requiredRole));
			}
		}

		return componentInterfaces;
	}

	public static ComponentInterfaceInstance getComponentInterfaceInstanceEntityById(System system, String id)
			throws PalladioElementNotFoundException {
		validate(system);
		return getAllComponentInterfaceInstanceEntities(system).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(() -> new PalladioElementNotFoundException(
						"Component interface instance with id " + id + " not found"));
	}

	public static List<Role> getAllComponentInterfaceTypeEntities(Repository repository)
			throws PalladioElementNotFoundException {
		validate(repository);
		List<Role> roles = new ArrayList<>();
		
		
		roles.addAll(repository.getComponents__Repository().stream().filter(BasicComponent.class :: isInstance)
				.map(InterfaceProvidingEntity::getProvidedRoles_InterfaceProvidingEntity).flatMap(List::stream)
				.collect(Collectors.toList()));
		roles.addAll(repository.getComponents__Repository().stream().filter(BasicComponent.class :: isInstance)
				.map(InterfaceRequiringEntity::getRequiredRoles_InterfaceRequiringEntity).flatMap(List::stream)
				.collect(Collectors.toList()));
		return roles;
	}

	public static Role getComponentInterfaceTypeEntityById(Repository repository, String id)
			throws PalladioElementNotFoundException {
		validate(repository);
		return getAllComponentInterfaceTypeEntities(repository).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(() -> new PalladioElementNotFoundException(
						"Component interface (type) with id " + id + " not found"));
	}

	public static List<ResourceContainer> getAllHardwareResourceEntities(ResourceEnvironment resourceEnvironment)
			throws PalladioElementNotFoundException {
		validate(resourceEnvironment);
		return resourceEnvironment.getResourceContainer_ResourceEnvironment();
	}

	public static ResourceContainer getHardwareResourceEntityById(ResourceEnvironment resourceEnvironment, String id)
			throws PalladioElementNotFoundException {
		validate(resourceEnvironment);
		return getAllHardwareResourceEntities(resourceEnvironment).stream().filter(x -> x.getId().equals(id))
				.findFirst().orElseThrow(
						() -> new PalladioElementNotFoundException("Resource Container with id " + id + " not found"));
	}

	public static List<System> getAllSystemEntities(System system) throws PalladioElementNotFoundException {
		validate(system);
		return List.of(system);
	}

	public static System getSystemEntityById(System system, String id) throws PalladioElementNotFoundException {
		validate(system);
		return getAllSystemEntities(system).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(() -> new PalladioElementNotFoundException("System with id " + id + " not found"));
	}

	public static List<DelegationConnector> getAllDelegationConnectorEntities(System system)
			throws PalladioElementNotFoundException {
		validate(system);
		return system.getConnectors__ComposedStructure().stream().filter(DelegationConnector.class::isInstance)
				.map(DelegationConnector.class::cast).collect(Collectors.toList());
	}

	public static DelegationConnector getDelegationConnectorEntityById(System system, String id)
			throws PalladioElementNotFoundException {
		validate(system);
		return getAllDelegationConnectorEntities(system).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(
						() -> new PalladioElementNotFoundException("DelegationConnector with id " + id + " not found"));
	}

	public static List<AllocationContext> getAllAllocationContextEntities(Allocation allocation)
			throws PalladioElementNotFoundException {
		validate(allocation);
		return allocation.getAllocationContexts_Allocation();
	}

	public static AllocationContext getAllocationContextEntityById(Allocation allocation, String id)
			throws PalladioElementNotFoundException {
		validate(allocation);
		return getAllAllocationContextEntities(allocation).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(
						() -> new PalladioElementNotFoundException("AllocationContext with id " + id + " not found"));
	}

	public static List<Role> getAllSystemInterfaceEntities(System system) throws PalladioElementNotFoundException {
		validate(system);
		List<Role> roles = new ArrayList<>();
		roles.addAll(system.getProvidedRoles_InterfaceProvidingEntity().stream().map(Role.class::cast)
				.collect(Collectors.toList()));
		roles.addAll(system.getRequiredRoles_InterfaceRequiringEntity().stream().map(Role.class::cast)
				.collect(Collectors.toList()));
		return roles;
	}

	public static Role getSystemInterfaceEntityById(System system, String id) throws PalladioElementNotFoundException {
		validate(system);
		return getAllSystemInterfaceEntities(system).stream().filter(x -> x.getId().equals(id)).findFirst().orElseThrow(
				() -> new PalladioElementNotFoundException("System interface with id " + id + " not found"));
	}

	public static List<EntryLevelSystemCall> getAllUsageBehaviourEntities(UsageModel usageModel)
			throws PalladioElementNotFoundException {
		validate(usageModel);
		// Traverse tree and collect system calls
		List<EntryLevelSystemCall> entryLevelSystemCalls = new ArrayList<>();

		// Need to perform DepthSearch for each scenario behaviour
		List<ScenarioBehaviour> scenarioBehaviours = usageModel.getUsageScenario_UsageModel().stream()
				.map(UsageScenario::getScenarioBehaviour_UsageScenario).collect(Collectors.toList());

		for (ScenarioBehaviour scenarioBehaviour : scenarioBehaviours) {
			List<AbstractUserAction> actions = scenarioBehaviour.getActions_ScenarioBehaviour();
			performDepthSearchForAbstractUserActions(actions, entryLevelSystemCalls);
		}

		return entryLevelSystemCalls;
	}

	/**
	 * Iterate over action tree and collect EntryLevelSystemCalls within Branch and
	 * Loop actions
	 * 
	 * @param actions
	 * @param entryLevelSystemCalls
	 */
	private static void performDepthSearchForAbstractUserActions(List<AbstractUserAction> actions,
			List<EntryLevelSystemCall> entryLevelSystemCalls) {
		for (AbstractUserAction action : actions) {
			if (action instanceof Start || action instanceof Stop) {
				// ignore start and stop actions
				continue;
			} else if (action instanceof EntryLevelSystemCall) {
				// Add EntryLevelSystemCall and stop iterative call
				entryLevelSystemCalls.add((EntryLevelSystemCall) action);
			} else if (action instanceof Branch) {
				Branch branch = (Branch) action;
				// Get all abstractUserActions from branch and iteratively dive deeper
				List<AbstractUserAction> branchActions = branch.getBranchTransitions_Branch().stream()
						.map(x -> x.getBranchedBehaviour_BranchTransition().getActions_ScenarioBehaviour())
						.flatMap(List::stream).collect(Collectors.toList());
				performDepthSearchForAbstractUserActions(branchActions, entryLevelSystemCalls);
			} else if (action instanceof Loop) {
				Loop loop = (Loop) action;
				List<AbstractUserAction> loopAction = loop.getBodyBehaviour_Loop().getActions_ScenarioBehaviour();
				performDepthSearchForAbstractUserActions(loopAction, entryLevelSystemCalls);
			}
		}
	}

	public static EntryLevelSystemCall getUsageBehaviourEntityById(UsageModel usageModel, String id)
			throws PalladioElementNotFoundException {
		validate(usageModel);
		return getAllUsageBehaviourEntities(usageModel).stream().filter(x -> x.getId().equals(id)).findFirst()
				.orElseThrow(
						() -> new PalladioElementNotFoundException("Usage Behaviour with id " + id + " not found"));
	}

	private static void validate(Repository repository) throws PalladioElementNotFoundException {
		if (repository == null) {
			throw new PalladioElementNotFoundException(
					"Cannot retrieve elements from repository model. Model is null.");
		}
	}

	private static void validate(UsageModel usageModel) throws PalladioElementNotFoundException {
		if (usageModel == null) {
			throw new PalladioElementNotFoundException("Cannot retrieve elements from usage model. Model is null.");
		}
	}

	private static void validate(System system) throws PalladioElementNotFoundException {
		if (system == null) {
			throw new PalladioElementNotFoundException("Cannot retrieve elements from system model. Model is null.");
		}

	}

	private static void validate(ResourceEnvironment resourceEnvironment) throws PalladioElementNotFoundException {
		if (resourceEnvironment == null) {
			throw new PalladioElementNotFoundException(
					"Cannot retrieve elements from resource environment model. Model is null.");
		}

	}
	
	private static void validate(Entity entity) throws PalladioElementNotFoundException {
		if (entity == null) {
			throw new PalladioElementNotFoundException(
					"Cannot retrieve elements from entity as entity is null.");
		}

	}

	private static void validate(Allocation allocation) throws PalladioElementNotFoundException {
		if (allocation == null) {
			throw new PalladioElementNotFoundException(
					"Cannot retrieve elements from allocation model. Model is null.");
		}

	}

	public static AllocationContext getAllocationContextForGivenAssemblyContext(Allocation allocation,
			AssemblyContext assemblyContext) throws PalladioElementNotFoundException {
		validate(allocation);
		for (AllocationContext allocationContext : allocation.getAllocationContexts_Allocation()) {
			if (allocationContext.getAssemblyContext_AllocationContext().getId().equals(assemblyContext.getId())) {
				return allocationContext;
			}
		}
		return null;
	}

	/*
	 * Needed besides getAllDelegationConnectorEntities(), as methods (beside getId,
	 * getName) are only defined for ProvidedDelegationConnector (and not for super
	 * class DelegationConntector)
	 * 
	 */
	public static List<ProvidedDelegationConnector> getAllProvidedDelegationConnectors(ComposedProvidingRequiringEntity entity)
			throws PalladioElementNotFoundException {
		validate(entity);

		return entity.getConnectors__ComposedStructure().stream().filter(ProvidedDelegationConnector.class::isInstance)
				.map(ProvidedDelegationConnector.class::cast).collect(Collectors.toList());
	}

	/*
	 * Needed besides getAllDelegationConnectorEntities(), as methods (beside getId,
	 * getName) are only defined for RequiredDelegationConnector (and not for super
	 * class DelegationConntector)
	 * 
	 */
	public static List<RequiredDelegationConnector> getAllRequiredDelegationConnectors(ComposedProvidingRequiringEntity entity)
			throws PalladioElementNotFoundException {
		validate(entity);

		return entity.getConnectors__ComposedStructure().stream().filter(RequiredDelegationConnector.class::isInstance)
				.map(RequiredDelegationConnector.class::cast).collect(Collectors.toList());
	}

	public static ComponentInterfaceInstance getComponentInterfaceInstanceEntityByAssemblyContextAndRole(System system,
			AssemblyContext assemblyContext, Role role) throws PalladioElementNotFoundException {

		String id = assemblyContext.getId() + "$" + role.getId();

		return getComponentInterfaceInstanceEntityById(system, id);
	}

}
