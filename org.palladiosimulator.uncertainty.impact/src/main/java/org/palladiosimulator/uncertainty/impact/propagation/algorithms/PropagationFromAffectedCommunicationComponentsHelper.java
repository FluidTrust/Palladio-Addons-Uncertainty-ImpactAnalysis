package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.model.util.PalladioModelsLookupHelper;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleTypes;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;

/**
 * Propagation algorithm for uncertainties that directly affect
 * {@link AssemblyConnector} entities
 * 
 * @author Niko
 *
 */
public class PropagationFromAffectedCommunicationComponentsHelper extends AbstractPropagationHelper {

	public PropagationFromAffectedCommunicationComponentsHelper(UCArchitectureVersion version,
			UncertaintyPropagation uncertaintyPropagation) {
		super(version, uncertaintyPropagation);
	}

	@Override
	protected List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleTypes rule) throws UncertaintyPropagationException {

		try {
			switch (rule) {
			case FROM_COMMUNICATION_COMPONENT_TO_HARDWARE_RESOURCE:
				return propagateFromCommunicationComponentsToHardwareResources(uncertainty);

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
	 * Important: CommunicationComponents are represented by the top level
	 * AssemblyConnectors. Algorithm: CommunicationComponent to HardwareResource
	 * <br>
	 * Workflow: <br>
	 * <ul>
	 * <li>Get both assemblies for given assembly connector (starting/ending). For
	 * both assemblies do:</li>
	 * <li>Retrieve allocation context</li>
	 * <li>Retrieve hardware resource</li>
	 * <li>Create ImpactElement with found path</li>
	 * </ul>
	 * 
	 * Always add current "visited" entity to path (in correct order).
	 * 
	 * @param uncertainty
	 * @return
	 * @throws UncertaintyPropagationException
	 * @throws PalladioElementNotFoundException
	 */
	private List<? extends UCImpactEntity<? extends Entity>> propagateFromCommunicationComponentsToHardwareResources(
			Uncertainty uncertainty) throws UncertaintyPropagationException, PalladioElementNotFoundException {

		List<UCImpactAtHardwareResource> affectedHardwareResources = new ArrayList<>();

		AssemblyConnector communicationComponent = extractCommunicationComponent(uncertainty);
		
		//TODO refactor method!
		
		//Create path for providing role
		AssemblyContext providingAssemblyContext = communicationComponent.getProvidingAssemblyContext_AssemblyConnector();
		Role providingRole = communicationComponent.getProvidedRole_AssemblyConnector();
		AllocationContext providingAllocationContext = PalladioModelsLookupHelper
				.getAllocationContextForGivenAssemblyContext(version.getAllocation(), providingAssemblyContext);
		ResourceContainer providingHardwareResource = providingAllocationContext.getResourceContainer_AllocationContext();
		
		
		List<Entity> providingPath = new ArrayList<>();
		providingPath.add(communicationComponent);
		providingPath.add(providingRole);
		providingPath.add(providingAssemblyContext);
		providingPath.add(providingAllocationContext);
		providingPath.add(providingHardwareResource);
		
		
		
		CausingUncertainty providingCausingUncertainty = UncertaintyPropagationFactoryHelper
				.createCausingUncertainty(this.uncertaintyPropagation);
		providingCausingUncertainty.setCausingUncertainty(uncertainty);
		providingCausingUncertainty.getPath().addAll(providingPath);

		UCImpactAtHardwareResource providingUCImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtHardwareResource();
		providingUCImpact.setAffectedElement(providingHardwareResource);
		providingUCImpact.getCausingElements().add(providingCausingUncertainty);
		providingUCImpact.setToolderived(true);
		
		
		//Create path for requiring role
		AssemblyContext requiredAssemblyContext = communicationComponent.getRequiringAssemblyContext_AssemblyConnector();
		Role requiringRole = communicationComponent.getRequiredRole_AssemblyConnector();
		AllocationContext requiringAllocationContext = PalladioModelsLookupHelper
				.getAllocationContextForGivenAssemblyContext(version.getAllocation(), requiredAssemblyContext);
		ResourceContainer requiringHardwareResource = requiringAllocationContext.getResourceContainer_AllocationContext();
		
		
		List<Entity> requiringPath = new ArrayList<>(); 
		requiringPath.add(communicationComponent);
		requiringPath.add(requiringRole);
		requiringPath.add(requiredAssemblyContext);
		requiringPath.add(requiringAllocationContext);
		requiringPath.add(requiringHardwareResource);
		
		
		
		CausingUncertainty requiringCausingUncertainty = UncertaintyPropagationFactoryHelper
				.createCausingUncertainty(this.uncertaintyPropagation);
		requiringCausingUncertainty.setCausingUncertainty(uncertainty);
		requiringCausingUncertainty.getPath().addAll(requiringPath);

		UCImpactAtHardwareResource requiringUCImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtHardwareResource();
		requiringUCImpact.setAffectedElement(requiringHardwareResource);
		requiringUCImpact.getCausingElements().add(requiringCausingUncertainty);
		requiringUCImpact.setToolderived(true);

		
		
		
		affectedHardwareResources.add(providingUCImpact);
		affectedHardwareResources.add(requiringUCImpact);
		
		return affectedHardwareResources;

	}

	private AssemblyConnector extractCommunicationComponent(Uncertainty uncertainty)
			throws UncertaintyPropagationException {
		Entity referencedElement = uncertainty.getAssignedElement().getReferencedElement();
		if (referencedElement instanceof AssemblyConnector) {
			return (AssemblyConnector) referencedElement;
		}

		throw new UncertaintyPropagationException("Uncertainty references element of type "
				+ referencedElement.getClass().getSimpleName() + " but expected type is AssemblyConnector");

	}

}
