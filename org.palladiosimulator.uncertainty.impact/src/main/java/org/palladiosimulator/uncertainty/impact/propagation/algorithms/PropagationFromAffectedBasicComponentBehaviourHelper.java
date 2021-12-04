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
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleType;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

/**
 * Propagation algorithm for uncertainties that directly affect
 * {@link BasicComponentBehaviour} entities
 * 
 * @author Niko
 *
 */
public class PropagationFromAffectedBasicComponentBehaviourHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedBasicComponentBehaviourHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleType rule) throws UncertaintyPropagationException {
		try {
			switch (rule) {

			case FROM_BASIC_COMPONENT_BEHAVIOUR_TO_SYSTEM_INTERFACE:

				return propagateFromBasicComponentBehaviourToSystemInterface(uncertainty);

			// TODO implement other algorithms

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
	 * Algorithm: BasicComponentBehaviour to SystemInterface <br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Retrieve all system interfaces</li>
	 * <li>For each interface: Extract referencing assembly</li>
	 * <li>For each assembly: iteratively inspect if encapsulated Component is
	 * BasicComponent</li>
	 * <ul>
	 * <li>Yes: Check if one of the SEFFs (=BasicComponentBehaviour) match the
	 * expected. If yes, add original system interface to result list</li>
	 * <li>No: Recursively check all encapsulated components</li>
	 * </ul>
	 * </ul>
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @throws UncertaintyPropagationExceptiono
	 * @throws PalladioElementNotFoundException
	 * @throws
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromBasicComponentBehaviourToSystemInterface(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		// Result
		List<UCImpactAtSystemInterface> affectedSystemInterfaces = new ArrayList<>();

		// Starting element
		BasicComponentBehaviour basicComponentBehaviour = extractBasicComponentBehaviour(uncertainty);

		List<ProvidedDelegationConnector> providedSystemInterfaces = PalladioModelsLookupHelper
				.getAllProvidedDelegationConnectors(version.getSystem());

		for (ProvidedDelegationConnector providedSystemInterface : providedSystemInterfaces) {

			// Outer provided role represents system interface
			Role systemInterface = providedSystemInterface.getOuterProvidedRole_ProvidedDelegationConnector();
			AssemblyContext referencingAssemblyContext = providedSystemInterface
					.getAssemblyContext_ProvidedDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(0, providedSystemInterface);
			incompletePath.add(0, referencingAssemblyContext);
			
			inspectAssemblyContexRecursivelyForMatchingBasicComponentBehaviour(referencingAssemblyContext,
					basicComponentBehaviour, incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
		}

		/*
		 * Due to palladio implementation, we need to inspect required and provided
		 * delegation connectors separately.
		 * (ProvidedDelegationConnector,RequiredDelegationConnector do not have common
		 * super type with required methods)
		 */

		List<RequiredDelegationConnector> requiredSystemInterfaces = PalladioModelsLookupHelper
				.getAllRequiredDelegationConnectors(version.getSystem());

		for (RequiredDelegationConnector requiredSystemInterface : requiredSystemInterfaces) {

			// Outer required role also represents system interface
			Role systemInterface = requiredSystemInterface.getOuterRequiredRole_RequiredDelegationConnector();
			AssemblyContext referencingAssemblyContext = requiredSystemInterface
					.getAssemblyContext_RequiredDelegationConnector();

			List<Entity> incompletePath = new LinkedList<>();
			// Prepend as reverse order is required
			incompletePath.add(systemInterface);
			incompletePath.add(0, requiredSystemInterface);
			incompletePath.add(0, referencingAssemblyContext);

			inspectAssemblyContexRecursivelyForMatchingBasicComponentBehaviour(referencingAssemblyContext,
					basicComponentBehaviour, incompletePath, uncertainty, systemInterface, affectedSystemInterfaces);
		}

		return affectedSystemInterfaces;

	}

	/**
	 * Inspect assembly context recursively. If encapsulated component is basic
	 * component, check all BasicComponentBehaviours (=SEFFs) if one of them matches
	 * the expected. If yes, path from System interface to BasicComponentBehaviour
	 * is found and system interfaces needs to be added to affected system
	 * Interfaces. If not found, ignore this path. If encapsulated component is
	 * composite component, inspect assemblies of this component. Remember: In this
	 * case, we need to build the path in the reverse order as we need impact from
	 * BasicComponentBehaviour to SystemInterface but can only traverse
	 * PalladioModel from SystemInterfaces to BasicComponentBehaviours. Ugly but
	 * necessary.
	 * 
	 * @param assemblyContext
	 * @param basicComponentBehaviour
	 * @param incompletePath
	 * @param uncertainty
	 * @param systemInterface
	 * @param affectedSystemInterfaces
	 * @throws UncertaintyPropagationException
	 */
	private void inspectAssemblyContexRecursivelyForMatchingBasicComponentBehaviour(AssemblyContext assemblyContext,
			BasicComponentBehaviour basicComponentBehaviour, List<Entity> incompletePath, Uncertainty uncertainty,
			Role systemInterface, List<UCImpactAtSystemInterface> affectedSystemInterfaces)
			throws UncertaintyPropagationException {

		RepositoryComponent repositoryComponent = assemblyContext.getEncapsulatedComponent__AssemblyContext();

		if (repositoryComponent instanceof BasicComponent) {
			BasicComponent basicComponent = (BasicComponent) repositoryComponent;

			List<ServiceEffectSpecification> seffs = basicComponent.getServiceEffectSpecifications__BasicComponent();
			for (ServiceEffectSpecification seff : seffs) {
				// Need to work with RDSeff as Seff does not extends from Identifier
				if (!(seff instanceof ResourceDemandingSEFF)) {
					throw new UncertaintyPropagationException("Seff should be instance of RDSeff here.");
				}
				ResourceDemandingSEFF rdSeff = (ResourceDemandingSEFF) seff;
				if (rdSeff.getId().equals(basicComponentBehaviour.getResourceDemandingSEFF().getId())) { // MATCH!
					List<Entity> local_path = new LinkedList<>(incompletePath);
					local_path.add(0, basicComponent);
					local_path.add(0, basicComponentBehaviour);

					// Create UCImpactAtHardwareResource with encapsulated CausingUncertainty
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

				inspectAssemblyContexRecursivelyForMatchingBasicComponentBehaviour(innerAssemblyContext,
						basicComponentBehaviour, incompletePath, uncertainty, systemInterface,
						affectedSystemInterfaces);
			}

		}

	}

	private static BasicComponentBehaviour extractBasicComponentBehaviour(Uncertainty uncertainty)
			throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof BasicComponentBehaviour) {
			/*
			 * RDSEFF is encapsulated in self-defined wrapper entity, as SEFF itself does
			 * not inherit from Entity. However, the BasicComponentBehaviour has the same ID
			 * as the encapsulated SEFF. Therefore, it is not necessary to return RDSEFF
			 */
			return ((BasicComponentBehaviour) referencedElement);
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is System");

	}

}
