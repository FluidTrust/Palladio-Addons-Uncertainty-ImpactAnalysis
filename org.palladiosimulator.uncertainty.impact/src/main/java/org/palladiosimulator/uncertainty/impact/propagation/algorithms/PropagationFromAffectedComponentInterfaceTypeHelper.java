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
				return propagateFromComponentInterfaceTypeToSystemInterfaces(uncertainty);

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
