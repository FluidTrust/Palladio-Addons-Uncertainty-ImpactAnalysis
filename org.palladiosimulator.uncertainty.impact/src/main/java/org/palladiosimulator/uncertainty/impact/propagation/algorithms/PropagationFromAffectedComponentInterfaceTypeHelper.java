package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
	 * <li>Retrieve all Delegation Connectors at system level</li>
	 * <li>Check if delegation connector references required interfaces.
	 * <ul>
	 * <li>If yes: Continue and build path.
	 * <li>If no: Stop propagation as end of path will not be the expected
	 * interface.
	 * </ul>
	 * <li>For delegation connector: Extract referencing assembly</li>
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

	/**
	 * * Inspect delegation connectors recursively. If referenced component is basic
	 * component, check if one of the roles matches the expected. If yes, path from
	 * System interface to interface is found and system interfaces needs to be
	 * added to affected system Interfaces. If not found, ignore this path. If
	 * encapsulated component is composite component, retrieve delegation connectors
	 * and dive deeper if outer delegation connector and inner delegation connector
	 * are matching (match if outer.InnerRole = inner.outerRole). <br>
	 * Remember: we need to build the path in the reverse order as we need impact
	 * from Interface Type to SystemInterface but can only traverse PalladioModel
	 * from SystemInterfaces to Interface types. Ugly but necessary. <br>
	 * Also: Different method for providing and requiring itnerfaces required due to
	 * palladio implementation
	 * 
	 * @param providedDelegationConnector
	 * @param expectedProvidedRole
	 * @param expectedInterface
	 * @param incompletePath
	 * @param uncertainty
	 * @param affectedSystemInterfaces
	 * @throws UncertaintyPropagationException
	 * @throws PalladioElementNotFoundException
	 */
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
			List<String> providedRoleIDs = basicComponent.getProvidedRoles_InterfaceProvidingEntity().stream()
					.map(Role::getId).collect(Collectors.toList());

			if (innerRole.getId().equals(expectedProvidedRole.getId())
					&& providedRoleIDs.contains(expectedProvidedRole.getId())) { // MATCH!!!
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

	// See inspectProvidedDelegationConnectorsRecursively
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
			List<String> requiredRoleIDs = basicComponent.getRequiredRoles_InterfaceRequiringEntity().stream()
					.map(Role::getId).collect(Collectors.toList());

			if (innerRole.getId().equals(expectedRequiredRole.getId())
					&& requiredRoleIDs.contains(expectedRequiredRole.getId())) { // MATCH!!!
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

	private Role extractComponentInterfaceType(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof Role) {
			return (Role) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is Role");

	}

}