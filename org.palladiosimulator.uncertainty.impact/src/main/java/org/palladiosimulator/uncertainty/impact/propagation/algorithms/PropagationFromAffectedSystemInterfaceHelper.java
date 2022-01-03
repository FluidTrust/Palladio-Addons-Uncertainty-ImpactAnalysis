package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.core.composition.RequiredDelegationConnector;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleTypes;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

public class PropagationFromAffectedSystemInterfaceHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedSystemInterfaceHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleTypes rule) throws UncertaintyPropagationException {
		try {
			switch (rule) {

			case FROM_SYSTEM_INTERFACE_TO_COMPONENT_INTERFACE_TYPE:
				return propagateFromSystemInterfaceToComponentInterfaceType(uncertainty);

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
	 * Important: Algorithm: System Interfaces to ComponentInterfaceType <br>
	 * <ul>
	 * <li>Retrieve all system interfaces</li>
	 * <li>Extract matching system interface
	 * <li>Extract system delegation connector which reference the expected system
	 * interface
	 * <li>Use delegation connector to extract referencing assembly</li>
	 * <li>Iteratively inspect if encapsulated Component is BasicComponent</li>
	 * <ul>
	 * <li>Yes: Add interface that matches the system interface</li>
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
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromSystemInterfaceToComponentInterfaceType(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtComponentInterfaceType> affectedComponentInterfaceTypes = new ArrayList<>();

		Role systemInterface = extractSystemInterfaceType(uncertainty);

		List<ProvidedDelegationConnector> providedSystemInterfaceDelegationConnectors = PalladioModelsLookupHelper
				.getAllProvidedDelegationConnectors(version.getSystem());

		for (ProvidedDelegationConnector providedSystemInterfaceDelegationConnector : providedSystemInterfaceDelegationConnectors) {

			if (!providedSystemInterfaceDelegationConnector.getOuterProvidedRole_ProvidedDelegationConnector().getId()
					.equals(systemInterface.getId())) {
				// Outer role is the actual system interface
				continue;
			}

			Role expectedInterface = providedSystemInterfaceDelegationConnector
					.getInnerProvidedRole_ProvidedDelegationConnector();

			AssemblyContext referencingAssemblyContext = providedSystemInterfaceDelegationConnector
					.getAssemblyContext_ProvidedDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			incompletePath.add(systemInterface);
			incompletePath.add(providedSystemInterfaceDelegationConnector);
			incompletePath.add(referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForExistingBasicComponents(expectedInterface, referencingAssemblyContext,
					incompletePath, uncertainty, affectedComponentInterfaceTypes);
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

			if (!requiredSystemInterfaceDelegationConnector.getOuterRequiredRole_RequiredDelegationConnector().getId()
					.equals(systemInterface.getId())) {
				// Outer role is the actual system interface
				continue;
			}

			Role expectedInterface = requiredSystemInterfaceDelegationConnector
					.getInnerRequiredRole_RequiredDelegationConnector();

			AssemblyContext referencingAssemblyContext = requiredSystemInterfaceDelegationConnector
					.getAssemblyContext_RequiredDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(requiredSystemInterfaceDelegationConnector);
			incompletePath.add(referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForExistingBasicComponents(expectedInterface, referencingAssemblyContext,
					incompletePath, uncertainty, affectedComponentInterfaceTypes);
		}

		return affectedComponentInterfaceTypes;

	}

	/**
	 * Inspect assembly context recursively. If encapsulated component is basic
	 * component, add interface that matches the expected interface. If not,
	 * recursively inspect encapsulate CompositeComponent.
	 * 
	 * @param assemblyContext
	 * @param incompletePath
	 * @param uncertainty
	 * @param affectedComponentInterfaceTypes
	 * @throws UncertaintyPropagationException
	 */
	private void inspectAssemblyContexRecursivelyForExistingBasicComponents(Role expectedInterface,
			AssemblyContext assemblyContext, List<Entity> incompletePath, Uncertainty uncertainty,
			List<UCImpactAtComponentInterfaceType> affectedComponentInterfaceTypes)
			throws UncertaintyPropagationException {

		RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();

		if (repositoryComponent instanceof BasicComponent) {
			BasicComponent basicComponent = (BasicComponent) repositoryComponent;

			List<Role> componentInterfaces = new ArrayList<>();
			componentInterfaces.addAll(basicComponent.getProvidedRoles_InterfaceProvidingEntity());
			componentInterfaces.addAll(basicComponent.getRequiredRoles_InterfaceRequiringEntity());

			for (Role componentInterface : componentInterfaces) {

				if (componentInterface.getId().equals(expectedInterface.getId())) { // MATCH!
					List<Entity> local_path = new LinkedList<>(incompletePath);
					local_path.add(basicComponent);
					local_path.add(componentInterface);

					// Create UCImpactAtSystemInterface with encapsulated CausingUncertainty
					CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
							.createCausingUncertainty(uncertaintyPropagation);
					causingUncertainty.setCausingUncertainty(uncertainty);
					causingUncertainty.getPath().addAll(local_path);

					UCImpactAtComponentInterfaceType ucImpactAtComponentInterfaceType = UncertaintyPropagationFactoryHelper
							.createUCImpactAtComponentInterfaceType();
					ucImpactAtComponentInterfaceType.setToolderived(true);
					ucImpactAtComponentInterfaceType.setAffectedElement(componentInterface);
					ucImpactAtComponentInterfaceType.getCausingElements().add(causingUncertainty);

					// Add to result set
					affectedComponentInterfaceTypes.add(ucImpactAtComponentInterfaceType);
				}

			}
		} else {
			// Loop over all assembly contexts of -> For each context, do recursive call
			for (AssemblyContext innerAssemblyContext : ((CompositeComponent) repositoryComponent)
					.getAssemblyContexts__ComposedStructure()) {
				// Copy path due to recursion
				List<Entity> local_path = new LinkedList<>(incompletePath);
				local_path.add(repositoryComponent);
				local_path.add(innerAssemblyContext);

				inspectAssemblyContexRecursivelyForExistingBasicComponents(expectedInterface, innerAssemblyContext,
						incompletePath, uncertainty, affectedComponentInterfaceTypes);
			}

		}

	}

	private Role extractSystemInterfaceType(Uncertainty uncertainty) throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof Role) {
			return (Role) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is Role");

	}

}
