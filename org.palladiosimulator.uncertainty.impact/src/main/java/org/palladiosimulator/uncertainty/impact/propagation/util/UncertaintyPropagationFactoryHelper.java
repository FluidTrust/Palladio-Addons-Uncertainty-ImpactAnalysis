package org.palladiosimulator.uncertainty.impact.propagation.util;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer;
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
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory;

/**
 * Utility class to create uncertainty propagation entities. Always use this
 * class instead of using factory alone as some entities need to be added to the
 * correct container so that the persistence will work correctly.
 * 
 * @author Niko
 *
 */
public class UncertaintyPropagationFactoryHelper {
	
private UncertaintyPropagationFactoryHelper() {
		
	}

	private static final UncertaintypropagationFactory factory = UncertaintypropagationFactory.eINSTANCE;

	public static CausingUncertainty createCausingUncertainty(UncertaintyPropagation uncertaintyPropagation) {
		/*
		 * As any EObjects needs to be in a containment, we need to create a
		 * CausingUncertainty and add it to an existing containment. Necessary, as we
		 * use it in UCImpactEntity<T extends Entity> extends AbstractModification
		 * (causingElements) which is defined by the KAMP Modificationmarks model but
		 * did not set the containment flag --> Hack necessary, as otherwise the KAMP
		 * Modificationmarks model had to be cahnged
		 */
		CausingUncertainty cu = factory.createCausingUncertainty();
		uncertaintyPropagation.getCausingUncertainties().add(cu);

		return cu;

	}

	
	public static CausingUncertainty createCausingUncertainty(UCPropagationRulesSeed seed) {
		/*
		 * See comment above
		 */
		CausingUncertainty cu = factory.createCausingUncertainty();
		seed.getCausingUncertainties().add(cu);

		return cu;

	}

	public static UncertaintyPropagation createUncertaintyPropagation() {
		return factory.createUncertaintyPropagation();
	}

	public static UCImpactAtBasicComponentBehaviour createUCImpactAtBasicComponentBehaviour() {
		return factory.createUCImpactAtBasicComponentBehaviour();
	}

	public static UCImpactAtBasicComponentType createUCImpactAtBasicComponentType() {
		return factory.createUCImpactAtBasicComponentType();
	}

	public static UCImpactAtCommunicationComponents createUCImpactAtCommunicationComponents() {
		return factory.createUCImpactAtCommunicationComponents();
	}

	public static UCImpactAtCommunicationResources createUCImpactAtCommunicationResources() {
		return factory.createUCImpactAtCommunicationResources();
	}

	public static UCImpactAtComponentInstance createUCImpactAtComponentInstance() {
		return factory.createUCImpactAtComponentInstance();
	}

	public static UCImpactAtComponentInterfaceInstance createUCImpactAtComponentInterfaceInstance() {
		return factory.createUCImpactAtComponentInterfaceInstance();
	}

	public static UCImpactAtComponentInterfaceType createUCImpactAtComponentInterfaceType() {
		return factory.createUCImpactAtComponentInterfaceType();
	}

	public static UCImpactAtHardwareResource createUCImpactAtHardwareResource() {
		return factory.createUCImpactAtHardwareResource();
	}

	public static UCImpactAtSystem createUCImpactAtSystem() {
		return factory.createUCImpactAtSystem();
	}

	public static UCImpactAtSystemInterface createUCImpactAtSystemInterface() {
		return factory.createUCImpactAtSystemInterface();
	}

	public static UCImpactAtUsageBehaviour createUCImpactAtUsageBehaviour() {
		return factory.createUCImpactAtUsageBehaviour();
	}

	public static AbstractUCImpactRepository<UCPropagationRulesSeed> createUCImpactRepository() {
		return factory.createUCImpactRepository();
	}

	public static UCPropagationRulesSeed createUCPropagationRulesSeed() {
		return factory.createUCPropagationRulesSeed();
	}

	public static BasicComponentBehaviourContainer createBasicComponentBehaviourContainer() {
		return factory.createBasicComponentBehaviourContainer();
	}

	public static ComponentInterfaceInstanceContainer createComponentInterfaceInstanceContainer() {
		return factory.createComponentInterfaceInstanceContainer();
	}

}
