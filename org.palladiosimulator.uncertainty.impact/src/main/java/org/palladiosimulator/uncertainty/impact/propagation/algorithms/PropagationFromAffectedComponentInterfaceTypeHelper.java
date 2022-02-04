package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.core.entity.ComposedProvidingRequiringEntity;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleTypes;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

public class PropagationFromAffectedComponentInterfaceTypeHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedComponentInterfaceTypeHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleTypes rule) throws UncertaintyPropagationException {

		try {
			switch (rule) {

			case FROM_COMPONENT_INTERFACE_TYPE_TO_SYSTEM_INTERFACE:
				return propagateFromComponentInterfaceTypeToSystemInterfacesNew(uncertainty);

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
	 * Important: Algorithm: ComponentInterfaceType to System Interfaces <br>
	 * <ul>
	 * <li>Retrieve all system interfaces</li>
	 * <li>Check if system interface references expected component interface.
	 * <ul>
	 * <li>If yes: Continue and build path.
	 * <li>If no: Stop propagation as end of path will not be the expected
	 * interface.
	 * </ul>
	 * <li>For each system interface: Extract referencing assembly</li>
	 * <li>For each assembly: iteratively inspect if encapsulated Component is
	 * BasicComponent</li>
	 * <ul>
	 * <li>Yes: Check if one of its interfaces match the expected. If yes, add
	 * original system interface to result list</li>
	 * <li>No: Recursively check all encapsulated components</li>
	 * </ul>
	 * </ul>
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * 
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 * @throws PalladioElementNotFoundException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromComponentInterfaceTypeToSystemInterfaces(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtSystemInterface> affectedSystemInterfaces = new ArrayList<>();

		Role expectedInterface = extractComponentInterfaceType(uncertainty);

		List<ProvidedDelegationConnector> providedSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
				.getAllProvidedDelegationConnectors(version.getSystem());

		for (ProvidedDelegationConnector providedSystemInterfaceDelegationConnector : providedSystemInterfaceDelegationConnectors) {

			// Outer provided role represents system interface
			Role systemInterface = providedSystemInterfaceDelegationConnector
					.getOuterProvidedRole_ProvidedDelegationConnector();
			AssemblyContext referencingAssemblyContext = providedSystemInterfaceDelegationConnector
					.getAssemblyContext_ProvidedDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(0, providedSystemInterfaceDelegationConnector);
			incompletePath.add(0, referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForMatchingComponentInterfaces(referencingAssemblyContext,
					expectedInterface, incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
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
			Role systemInterface = requiredSystemInterfaceDelegationConnector
					.getOuterRequiredRole_RequiredDelegationConnector();
			AssemblyContext referencingAssemblyContext = requiredSystemInterfaceDelegationConnector
					.getAssemblyContext_RequiredDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(0, requiredSystemInterfaceDelegationConnector);
			incompletePath.add(0, referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForMatchingComponentInterfaces(referencingAssemblyContext,
					expectedInterface, incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
		}

		return affectedSystemInterfaces;

	}

	private List<? extends UCImpactEntity<? extends Entity>> propagateFromComponentInterfaceTypeToSystemInterfacesNew(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtSystemInterface> affectedSystemInterfaces = new ArrayList<>();

		Role expectedRole = extractComponentInterfaceType(uncertainty);

		if (expectedRole instanceof OperationProvidedRole) {
			OperationProvidedRole expectedProvidedRole = (OperationProvidedRole) expectedRole;
			OperationInterface expectedInterface = expectedProvidedRole.getProvidedInterface__OperationProvidedRole();
			List<Entity> incompletePath = new LinkedList<>();

			// Start with system provided interfaces
			List<ProvidedDelegationConnector> providedSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
					.getAllProvidedDelegationConnectors(version.getSystem());

			for (ProvidedDelegationConnector providedDelegationConnector : providedSystemInterfaceDelegationConnectors) {
				inspectProvidedDelegationConnectorsRecursively(providedDelegationConnector, expectedProvidedRole,
						expectedInterface, incompletePath, uncertainty, affectedSystemInterfaces);
			}

		} else if (expectedRole instanceof OperationRequiredRole) {
			OperationRequiredRole expectedRequiredRole = (OperationRequiredRole) expectedRole;
			OperationInterface expectedInterface = expectedRequiredRole.getRequiredInterface__OperationRequiredRole();
			List<Entity> incompletePath = new LinkedList<>();

			// Continue with system requiring interfaces
			List<RequiredDelegationConnector> requiredSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
					.getAllRequiredDelegationConnectors(version.getSystem());

			for (RequiredDelegationConnector requiredSystemInterfaceDelegationConnector : requiredSystemInterfaceDelegationConnectors) {
				inspectRequiredDelegationConnectorsRecursively(requiredSystemInterfaceDelegationConnector,
						expectedRequiredRole, expectedInterface, incompletePath, uncertainty, affectedSystemInterfaces);
			}

		} else {
			throw new UncertaintyPropagationException("Cannot propagate. Type error occured!");
		}

		return affectedSystemInterfaces;
	}

	private void inspectProvidedDelegationConnectorsRecursively(ProvidedDelegationConnector providedDelegationConnector,
			OperationProvidedRole expectedProvidedRole, OperationInterface expectedInterface,
			List<Entity> incompletePath, Uncertainty uncertainty,
			List<UCImpactAtSystemInterface> affectedSystemInterfaces)
			throws UncertaintyPropagationException, PalladioElementNotFoundException {

		OperationProvidedRole outerRole = providedDelegationConnector
				.getOuterProvidedRole_ProvidedDelegationConnector();
		OperationProvidedRole innerRole = providedDelegationConnector
				.getInnerProvidedRole_ProvidedDelegationConnector();
		AssemblyContext referencedAssemblyContext = providedDelegationConnector
				.getAssemblyContext_ProvidedDelegationConnector();
		RepositoryComponent encapsulatedComponent = referencedAssemblyContext
				.getEncapsulatedComponent__AssemblyContext();

		if (encapsulatedComponent instanceof BasicComponent) {
			BasicComponent basicComponent = (BasicComponent) encapsulatedComponent;
			List<ProvidedRole> providedRoles = basicComponent.getProvidedRoles_InterfaceProvidingEntity();

			if (innerRole.getId().equals(expectedProvidedRole.getId())
					&& providedRoles.contains(expectedProvidedRole)) { // MATCH!!!
				List<Entity> completePath = new LinkedList<>(incompletePath);
				completePath.add(0, outerRole);
				completePath.add(0, providedDelegationConnector);
				completePath.add(0, referencedAssemblyContext);
				completePath.add(0, basicComponent);
				completePath.add(0, expectedProvidedRole);

				// Create UCImpactAtSystemInterface with encapsulated CausingUncertainty
				CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
						.createCausingUncertainty(uncertaintyPropagation);
				causingUncertainty.setCausingUncertainty(uncertainty);
				causingUncertainty.getPath().addAll(completePath);

				UCImpactAtSystemInterface ucImpactAtSystemInterface = UncertaintyPropagationFactoryHelper
						.createUCImpactAtSystemInterface();
				ucImpactAtSystemInterface.setToolderived(true);
				// Last element was first element added and therefore system interface!
				ucImpactAtSystemInterface.setAffectedElement((Role) completePath.get(completePath.size() - 1));
				ucImpactAtSystemInterface.getCausingElements().add(causingUncertainty);

				// Add to result set
				affectedSystemInterfaces.add(ucImpactAtSystemInterface);
			}

		} else {
			CompositeComponent compositeComponent = (CompositeComponent) encapsulatedComponent;
			List<Entity> innerIncompletePath = new LinkedList<>(incompletePath);
			innerIncompletePath.add(0, outerRole);
			innerIncompletePath.add(0, providedDelegationConnector);
			innerIncompletePath.add(0, referencedAssemblyContext);
			innerIncompletePath.add(0, compositeComponent);

			List<ProvidedDelegationConnector> innerProvidedDelegationConnectors = PalladioModelsLookupHelper
					.getAllProvidedDelegationConnectors(compositeComponent);

			for (ProvidedDelegationConnector innerProvidedDelegationConnector : innerProvidedDelegationConnectors) {
				// outer role of encapsulated component matches inner role of outer delegation
				// connector
				if (innerProvidedDelegationConnector.getOuterProvidedRole_ProvidedDelegationConnector().getId()
						.equals(innerRole.getId())) {
					inspectProvidedDelegationConnectorsRecursively(innerProvidedDelegationConnector,
							expectedProvidedRole, expectedInterface, innerIncompletePath, uncertainty,
							affectedSystemInterfaces);
				}
			}

		}

	}

	private void inspectRequiredDelegationConnectorsRecursively(RequiredDelegationConnector requiredDelegationConnector,
			OperationRequiredRole expectedRequiredRole, OperationInterface expectedInterface,
			List<Entity> incompletePath, Uncertainty uncertainty,
			List<UCImpactAtSystemInterface> affectedSystemInterfaces)
			throws UncertaintyPropagationException, PalladioElementNotFoundException {

		OperationRequiredRole outerRole = requiredDelegationConnector
				.getOuterRequiredRole_RequiredDelegationConnector();
		OperationRequiredRole innerRole = requiredDelegationConnector
				.getInnerRequiredRole_RequiredDelegationConnector();
		AssemblyContext referencedAssemblyContext = requiredDelegationConnector
				.getAssemblyContext_RequiredDelegationConnector();
		RepositoryComponent encapsulatedComponent = referencedAssemblyContext
				.getEncapsulatedComponent__AssemblyContext();

		if (encapsulatedComponent instanceof BasicComponent) {
			BasicComponent basicComponent = (BasicComponent) encapsulatedComponent;
			List<RequiredRole> requiredRoles = basicComponent.getRequiredRoles_InterfaceRequiringEntity();

			if (innerRole.getId().equals(expectedRequiredRole.getId())
					&& requiredRoles.contains(expectedRequiredRole)) { // MATCH!!!
				List<Entity> completePath = new LinkedList<>(incompletePath);
				completePath.add(0, outerRole);
				completePath.add(0, requiredDelegationConnector);
				completePath.add(0, referencedAssemblyContext);
				completePath.add(0, basicComponent);
				completePath.add(0, expectedRequiredRole);

				// Create UCImpactAtSystemInterface with encapsulated CausingUncertainty
				CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
						.createCausingUncertainty(uncertaintyPropagation);
				causingUncertainty.setCausingUncertainty(uncertainty);
				causingUncertainty.getPath().addAll(completePath);

				UCImpactAtSystemInterface ucImpactAtSystemInterface = UncertaintyPropagationFactoryHelper
						.createUCImpactAtSystemInterface();
				ucImpactAtSystemInterface.setToolderived(true);
				// Last element was first element added and therefore system interface!
				ucImpactAtSystemInterface.setAffectedElement((Role) completePath.get(completePath.size() - 1));
				ucImpactAtSystemInterface.getCausingElements().add(causingUncertainty);

				// Add to result set
				affectedSystemInterfaces.add(ucImpactAtSystemInterface);
			}

		} else {
			CompositeComponent compositeComponent = (CompositeComponent) encapsulatedComponent;
			List<Entity> innerIncompletePath = new LinkedList<>(incompletePath);
			innerIncompletePath.add(0, outerRole);
			innerIncompletePath.add(0, requiredDelegationConnector);
			innerIncompletePath.add(0, referencedAssemblyContext);
			innerIncompletePath.add(0, compositeComponent);

			List<RequiredDelegationConnector> innerProvidedDelegationConnectors = PalladioModelsLookupHelper
					.getAllRequiredDelegationConnectors(compositeComponent);

			for (RequiredDelegationConnector innerProvidedDelegationConnector : innerProvidedDelegationConnectors) {
				// outer role of encapsulated component matches inner role of outer delegation
				// connector
				if (innerProvidedDelegationConnector.getOuterRequiredRole_RequiredDelegationConnector().getId()
						.equals(innerRole.getId())) {
					inspectRequiredDelegationConnectorsRecursively(innerProvidedDelegationConnector,
							expectedRequiredRole, expectedInterface, innerIncompletePath, uncertainty,
							affectedSystemInterfaces);
				}
			}

		}

	}

	/**
	 * Inspect assembly context recursively. If encapsulated component is basic
	 * component, check all Roles if one of them matches the expected. If yes, path
	 * from System interface to interface is found and system interfaces needs to be
	 * added to affected system Interfaces. If not found, ignore this path. If
	 * encapsulated component is composite component, inspect assemblies of this
	 * component. Remember: In this case, we need to build the path in the reverse
	 * order as we need impact from BasicComponentBehaviour to SystemInterface but
	 * can only traverse PalladioModel from SystemInterfaces to
	 * BasicComponentBehaviours. Ugly but necessary.
	 * 
	 * @param assemblyContext
	 * @param expectedInterface
	 * @param incompletePath
	 * @param uncertainty
	 * @param systemInterface
	 * @param affectedSystemInterfaces
	 * @throws UncertaintyPropagationException
	 */
	private void inspectAssemblyContexRecursivelyForMatchingComponentInterfaces(AssemblyContext assemblyContext,
			Role expectedInterface, List<Entity> incompletePath, Uncertainty uncertainty, Role systemInterface,
			List<UCImpactAtSystemInterface> affectedSystemInterfaces) throws UncertaintyPropagationException {

		RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();

		if (repositoryComponent instanceof BasicComponent) {
			BasicComponent basicComponent = (BasicComponent) repositoryComponent;

			List<Role> interfaces = new ArrayList<>();
			interfaces.addAll(basicComponent.getProvidedRoles_InterfaceProvidingEntity());
			interfaces.addAll(basicComponent.getRequiredRoles_InterfaceRequiringEntity());

			for (Role interfaze : interfaces) {

				if (interfaze.getId().equals(expectedInterface.getId())) { // MATCH!
					List<Entity> local_path = new LinkedList<>(incompletePath);
					local_path.add(0, basicComponent);
					local_path.add(0, interfaze);

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

					// Add to result set
					affectedSystemInterfaces.add(ucImpactAtSystemInterface);
				}

			}
		} else {
			// Loop over all assembly contexts of -> For each context, do recursive call
			for (AssemblyContext innerAssemblyContext : ((CompositeComponent) repositoryComponent)
					.getAssemblyContexts__ComposedStructure()) {
				// Copy path due to recursion
				List<Entity> local_path = new LinkedList<>(incompletePath);
				local_path.add(0, repositoryComponent);
				local_path.add(0, innerAssemblyContext);

				inspectAssemblyContexRecursivelyForMatchingComponentInterfaces(innerAssemblyContext, expectedInterface,
						incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
			}

		}

	}

	private Role extractComponentInterfaceType(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof Role) {
			return (Role) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is Role");

	}

}