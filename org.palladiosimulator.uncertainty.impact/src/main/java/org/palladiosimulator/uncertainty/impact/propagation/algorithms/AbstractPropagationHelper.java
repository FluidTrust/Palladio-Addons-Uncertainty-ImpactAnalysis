package org.palladiosimulator.uncertainty.impact.propagation.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyPropagationException;
import org.palladiosimulator.uncertainty.impact.propagation.UCArchitectureVersion;
import org.palladiosimulator.uncertainty.impact.propagation.util.PropagationRuleType;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationTypeToRuleResolver;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.util.UncertaintypropagationSwitch;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;

/**
 * Super class for all propagation algorithm implementations. Classes only need
 * to implement actual propagation for specific uncertainty and given rule. It
 * is up to the implementing class which type of {@link UCImpactEntity} are
 * created. However, the calling classes might rely on a specific type. <br>
 * The basic task of this class is to call propagate for a list of
 * uncertainties. This list is extracted from a list of {@link UCImpactEntity}
 * which a contains the propagation input. Further, it iterates over the created
 * {@link UCImpactEntity} and adds or merges them to the output (=
 * {@link UncertaintyPropagation}). Merging takes place, if two
 * {@link UCImpactEntity} of the same type reference the same architectural
 * element. Be aware that {@link UCImpactEntity} serves for both, input and
 * output of the propagation.
 * 
 * @author Niko
 *
 */
public abstract class AbstractPropagationHelper {

	// Can and should be used in implementing classes
	protected final UCArchitectureVersion version;
	protected final UncertaintyPropagation uncertaintyPropagation;

	public AbstractPropagationHelper(UCArchitectureVersion version, UncertaintyPropagation uncertaintyPropagation) {
		this.version = version;
		this.uncertaintyPropagation = uncertaintyPropagation;
	}

	/**
	 * Implement propagation for given uncertainty and given propagation rule
	 * 
	 * @param uncertainty
	 * @param rule
	 * @throws UncertaintyPropagationException
	 */
	protected abstract List<? extends UCImpactEntity<? extends Entity>> propagateUncertainty(Uncertainty uncertainty,
			PropagationRuleType rule) throws UncertaintyPropagationException;

	/**
	 * Calculates Propagation for given input. Input is represented by List of
	 * {@link UCImpactEntity} which contain the input uncertainties.
	 * 
	 * @param affectedEntities
	 * @throws UncertaintyPropagationException
	 */
	public void propagate(List<? extends UCImpactEntity<? extends Entity>> affectedEntities)
			throws UncertaintyPropagationException {
		List<Uncertainty> uncertainties = new ArrayList<>();

		// Collect all uncertainties that have to be propagated
		for (UCImpactEntity<? extends Entity> affectedEntity : affectedEntities) {
			uncertainties.addAll(affectedEntity.getCausingElements().stream().map(x -> x.getCausingUncertainty())
					.collect(Collectors.toList()));
		}

		/*
		 * Do propagation for each uncertainty. Uncertainty might have impact on various
		 * element types. For each type, calculate propagation.
		 */
		for (Uncertainty uncertainty : uncertainties) {

			// Starting element type
			PalladioElementTypes from = uncertainty.getUncertaintyType().getAssignableElementType().getType();

			// Ending element types
			List<PalladioElementTypes> tos = uncertainty.getUncertaintyType().getImpactOn().stream()
					.map(PalladioElementType::getType).collect(Collectors.toList());

			for (PalladioElementTypes to : tos) {
				// resolve propagation rule based on type tuple <from,to>
				PropagationRuleType rule = UncertaintyPropagationTypeToRuleResolver.resolve(from, to);

				// Do propagation (method is implemented by sub-classes)
				List<? extends UCImpactEntity<? extends Entity>> uncertaintyImpacts = propagateUncertainty(uncertainty,
						rule);

				// Persist propagation results
				addOrMergeUCImpacts(uncertaintyImpacts);

			}

		}

	}

	private void addOrMergeUCImpacts(List<? extends UCImpactEntity<? extends Entity>> ucImpacts)
			throws UncertaintyPropagationException {
		for (UCImpactEntity<? extends Entity> uncertaintyImpact : ucImpacts) {

			/*
			 * Switch internally delegates to the correct method based on the actual type of
			 * the given UCImpactEntity
			 */
			Switch<Boolean> ucImpactEntitySwitch = new SwitchForAddingOrMergingUCImpactEntities();
			if (!ucImpactEntitySwitch.doSwitch(uncertaintyImpact)) {
				throw new UncertaintyPropagationException(
						"UncertaintyImpact of type " + uncertaintyImpact.getClass().getSimpleName() + " is unknown!");
			}

		}

	}

	/**
	 * Helper class that enables switching over typed UCImpactEntities. This
	 * circumvents usage of multiple "instanceof" which is a known anti-pattern
	 * although EMF Switches do pretty much the same in the background. However,
	 * using switches has the advantage that we can easily extend the 'cases' and do
	 * not need to cast each team to the correct type
	 * 
	 * @author Niko
	 *
	 */
	private class SwitchForAddingOrMergingUCImpactEntities extends UncertaintypropagationSwitch<Boolean> {

		public Boolean caseUCImpactAtBasicComponentBehaviour(UCImpactAtBasicComponentBehaviour ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtBasicComponentBehaviour.class, ucImpact)) {
				uncertaintyPropagation.getAffectedBasicComponentBehaviours().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtBasicComponentType(UCImpactAtBasicComponentType ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtBasicComponentType.class, ucImpact)) {
				uncertaintyPropagation.getAffectedBasicComponentTypes().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtCommunicationComponents(UCImpactAtCommunicationComponents ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtCommunicationComponents.class, ucImpact)) {
				uncertaintyPropagation.getAffectedCommunicationComponents().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtCommunicationResources(UCImpactAtCommunicationResources ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtCommunicationResources.class, ucImpact)) {
				uncertaintyPropagation.getAffectedCommunicationResources().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtComponentInstance(UCImpactAtComponentInstance ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtComponentInstance.class, ucImpact)) {
				uncertaintyPropagation.getAffecteComponentInstances().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtComponentInterfaceInstance(UCImpactAtComponentInterfaceInstance ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtComponentInterfaceInstance.class, ucImpact)) {
				uncertaintyPropagation.getAffectedComponentInterfaceInstances().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtComponentInterfaceType(UCImpactAtComponentInterfaceType ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtComponentInterfaceType.class, ucImpact)) {
				uncertaintyPropagation.getAffectedComponentInterfaceTypes().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtHardwareResource(UCImpactAtHardwareResource ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtHardwareResource.class, ucImpact)) {
				uncertaintyPropagation.getAffectedHardwareResources().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtSystem(UCImpactAtSystem ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtSystem.class, ucImpact)) {
				uncertaintyPropagation.getAffectedSystems().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtSystemInterface(UCImpactAtSystemInterface ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtSystemInterface.class, ucImpact)) {
				uncertaintyPropagation.getAffectedSystemInterface().add(ucImpact);
			}
			return true;
		};

		public Boolean caseUCImpactAtUsageBehaviour(UCImpactAtUsageBehaviour ucImpact) {
			if (!addCausingUncertaintiesIfUCImpactAlreadyExists(UCImpactAtUsageBehaviour.class, ucImpact)) {
				uncertaintyPropagation.getAffectedUsageBehaviours().add(ucImpact);
			}
			return true;
		};

		public Boolean defaultCase(EObject object) {
			return false;

		};

		/**
		 * Check if uncertainty impact for given impact class and same affected element
		 * already exists. If yes, add causing uncertainties to causing elements. If no,
		 * return.
		 * 
		 * @param <T>
		 * @param version
		 * @param ruleTypeClass
		 * @param causingUncertainty
		 * @return
		 */
		private <T extends UCImpactEntity<? extends Entity>> boolean addCausingUncertaintiesIfUCImpactAlreadyExists(
				final Class<T> ucImpactClass, T ucImpact) {

			Set<T> existingUncertaintyImpacts = ArchitectureModelLookup.lookUpAllCalculatedMarksOfAType(version,
					ucImpactClass);
			for (T existingUncertaintyImpact : existingUncertaintyImpacts) {
				if (existingUncertaintyImpact.getAffectedElement().getId()
						.equals(ucImpact.getAffectedElement().getId())) {
					existingUncertaintyImpact.getCausingElements().addAll(ucImpact.getCausingElements());
					return true;
				}
			}

			return false;

		}

	}

}
