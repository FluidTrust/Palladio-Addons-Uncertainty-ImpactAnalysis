package org.palladiosimulator.uncertainty.impact.propagation;

import java.util.List;
import java.util.Set;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.uncertainty.impact.exception.InitializePropagationException;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyPropagationFactoryHelper;
import org.palladiosimulator.uncertainty.impact.propagation.util.UncertaintyTypesToUCImpactTypeResolver;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
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
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;

/**
 * This class instantiates the propagation input. For each uncertainty, a
 * respective {@link UCImpactEntity} is created. The concrete UCImpactEntity
 * (for instance {@link UCImpactAtBasicComponentType}) is defined via the
 * {@link UncertaintyType} defined by the actual {@link Uncertainty}. If some
 * uncertainties affect the same architectural element, the actual
 * UCImpactEntity is only created once. The affectedElement corresponds to the
 * affected architectural element. The causing elements (List!) correspond to
 * the uncertainties.
 * 
 * @author Niko
 *
 */
public class UCImpactPropagationAnalysisInitializer {
	
	private UCImpactPropagationAnalysisInitializer() {
		
	}
	

	/**
	 * For each uncertainty, create (or add to) a typed {@link UCImpactEntity} that
	 * references i) the element affected by the uncertainty ii) the uncertainty.
	 * <br>
	 * It is important to understand that two uncertainties referencing the same
	 * architectural element result in one typed instance of {@link UCImpactEntity}
	 * which references the (common) architectural element and both uncertainties
	 * which have an impact on this element.
	 * 
	 * @param version
	 * @param uncertainties
	 * @return
	 * @throws InitializePropagationException
	 */
	public static UCArchitectureVersion addUncertaintyImpactEntitiesToArchitectureVersion(UCArchitectureVersion version,
			List<Uncertainty> uncertainties) throws InitializePropagationException {

		checkIfVersionIsValid(version);

		for (Uncertainty uncertainty : uncertainties) {

			addUncertaintyToRulesSeed(version, uncertainty);
		}

		return version;
	}

	/**
	 * 
	 * @param version
	 * @param uncertainty
	 * @throws InitializePropagationException
	 */
	private static void addUncertaintyToRulesSeed(UCArchitectureVersion version, Uncertainty uncertainty)
			throws InitializePropagationException {

		UCPropagationRulesSeed seedModifications = version.getModificationMarkRepository().getSeedModifications();

		ArchitecturalElementTypes type = uncertainty.getUncertaintyType().getAssignableElementType();

		Class<? extends UCImpactEntity<? extends Entity>> ucImpactClass = UncertaintyTypesToUCImpactTypeResolver
				.resolve(type);

		if (addUncertaintyIfUCImpactAlreadyExists(version, ucImpactClass, uncertainty)) {
			/*
			 * UCImpact entity with desired type at element (defined by uncertainty) already
			 * exists -> Only add uncertainty to list of causing elements
			 */
			return;
		}

		/*
		 * Based on the type of the element, create typed UCImpactEntity and add
		 * uncertainty as previously explained.
		 */
		switch (type) {
		case BASIC_COMPONENT_BEHAVIOUR:
			seedModifications.getAffectedBasicComponentBehaviours()
					.add(createUncertaintyImpactAtBasicComponentBehaviour(version, uncertainty));
			break;
		case BASIC_COMPONENT_TYPE:
			seedModifications.getAffectedBasicComponentTypes()
					.add(createUncertaintyImpactAtBasicComponentType(version, uncertainty));
			break;
		case COMMUNICATION_COMPONENT:
			seedModifications.getAffectedCommunicationComponents()
					.add(createUncertaintyImpactAtCommunicationComponent(version, uncertainty));
			break;
		case COMMUNICATION_RESOURCE:
			seedModifications.getAffectedCommunicationResources()
					.add(createUncertaintyImpactAtCommunicationResources(version, uncertainty));
			break;
		case COMPONENT_INSTANCE:
			seedModifications.getAffectedComponentInstances()
					.add(createUncertaintyImpactAtComponentInstance(version, uncertainty));
			break;
		case COMPONENT_INTERFACE_INSTANCE:
			seedModifications.getAffectedComponentInterfaceInstances()
					.add(createUncertaintyImpactAtComponentInterfaceInstance(version, uncertainty));
			break;
		case COMPONENT_INTERFACE_TYPE:
			seedModifications.getAffectedComponentInterfaceTypes()
					.add(createUncertaintyImpactAtComponentInterfaceType(version, uncertainty));
			break;
		case HARDWARE_RESOURCE:
			seedModifications.getAffectedHardwareResources()
					.add(createUncertaintyImpactAtHardwareResource(version, uncertainty));
			break;
		case SYSTEM:
			seedModifications.getAffectedSystems().add(createUncertaintyImpactAtSystem(version, uncertainty));
			break;
		case SYSTEM_INTERFACE:
			seedModifications.getAffectedSystemInterfaces()
					.add(createUncertaintyImpactAtSystemInterface(version, uncertainty));
			break;
		case USAGE_BEHAVIOUR:
			seedModifications.getAffectedUsageBehaviours()
					.add(createUncertaintyImpactAtUsageBehaiour(version, uncertainty));
			break;
		default:
			throw new InitializePropagationException("Type " + type + " not supported!");
		}

	}

	private static UCImpactAtBasicComponentBehaviour createUncertaintyImpactAtBasicComponentBehaviour(
			UCArchitectureVersion version, Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtBasicComponentBehaviour ucImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtBasicComponentBehaviour();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, BasicComponentBehaviour.class);
	}

	private static UCImpactAtBasicComponentType createUncertaintyImpactAtBasicComponentType(
			UCArchitectureVersion version, Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtBasicComponentType ucImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtBasicComponentType();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, BasicComponent.class);
	}

	private static UCImpactAtCommunicationComponents createUncertaintyImpactAtCommunicationComponent(
			UCArchitectureVersion version, Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtCommunicationComponents ucImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtCommunicationComponents();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, AssemblyConnector.class);
	}

	private static UCImpactAtCommunicationResources createUncertaintyImpactAtCommunicationResources(
			UCArchitectureVersion version, Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtCommunicationResources ucImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtCommunicationResources();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, LinkingResource.class);
	}

	private static UCImpactAtComponentInstance createUncertaintyImpactAtComponentInstance(UCArchitectureVersion version,
			Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtComponentInstance ucImpact = UncertaintyPropagationFactoryHelper.createUCImpactAtComponentInstance();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, AssemblyContext.class);

	}

	private static UCImpactAtComponentInterfaceInstance createUncertaintyImpactAtComponentInterfaceInstance(
			UCArchitectureVersion version, Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtComponentInterfaceInstance ucImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtComponentInterfaceInstance();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, ComponentInterfaceInstance.class);

	}

	private static UCImpactAtComponentInterfaceType createUncertaintyImpactAtComponentInterfaceType(
			UCArchitectureVersion version, Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtComponentInterfaceType ucImpact = UncertaintyPropagationFactoryHelper
				.createUCImpactAtComponentInterfaceType();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, Role.class);
	}

	private static UCImpactAtHardwareResource createUncertaintyImpactAtHardwareResource(UCArchitectureVersion version,
			Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtHardwareResource ucImpact = UncertaintyPropagationFactoryHelper.createUCImpactAtHardwareResource();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, ResourceContainer.class);
	}

	private static UCImpactAtSystem createUncertaintyImpactAtSystem(UCArchitectureVersion version,
			Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtSystem ucImpact = UncertaintyPropagationFactoryHelper.createUCImpactAtSystem();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty,
				org.palladiosimulator.pcm.system.System.class);
	}

	private static UCImpactAtSystemInterface createUncertaintyImpactAtSystemInterface(UCArchitectureVersion version,
			Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtSystemInterface ucImpact = UncertaintyPropagationFactoryHelper.createUCImpactAtSystemInterface();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, Role.class);
	}

	private static UCImpactAtUsageBehaviour createUncertaintyImpactAtUsageBehaiour(UCArchitectureVersion version,
			Uncertainty uncertainty) throws InitializePropagationException {
		UCImpactAtUsageBehaviour ucImpact = UncertaintyPropagationFactoryHelper.createUCImpactAtUsageBehaviour();

		return initUncertaintyImpactEntity(version, ucImpact, uncertainty, EntryLevelSystemCall.class);
	}

	/**
	 * Helper method to initialize typed UCImpactEntity. First, it checks whether
	 * the expected type of the affectedElement matches the provided type (=clazz).
	 * Second, it generates a {@link CausingUncertainty}, which is used to wrap a
	 * usual uncertainty. We wrap uncertainties, as we also want to add additional
	 * path information (which can be stored in an {@link CausingUncertainty}
	 * object)
	 * 
	 * @param <S>
	 * @param <T>
	 * @param ucImpact
	 * @param uncertainty
	 * @param clazz
	 * @return
	 * @throws InitializePropagationException
	 */
	@SuppressWarnings("unchecked")
	private static <S extends Entity, T extends UCImpactEntity<S>> T initUncertaintyImpactEntity(
			UCArchitectureVersion version, T ucImpact, Uncertainty uncertainty, Class<S> clazz)
			throws InitializePropagationException {

		// Extract affected element
		Entity entity = uncertainty.getAssignedElement().getReferencedElement();

		// Only initialize if type of affected element matches given clazz
		if (clazz.isAssignableFrom(entity.getClass())) {
			ucImpact.setAffectedElement((S) entity);

			/*
			 * CausingUncertainty wraps the uncertainty, as we reuse CausingUncertainties to
			 * add path information
			 */
			CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
					.createCausingUncertainty(version.getUncertaintyImpactRepository().getSeedModifications());
			causingUncertainty.setCausingUncertainty(uncertainty);

			ucImpact.getCausingElements().add(causingUncertainty);

			return ucImpact;
		}

		throw new InitializePropagationException("Propagation could not be initialized. Uncertainty '"
				+ uncertainty.getName() + "' is expected to reference an element of type " + clazz.getSimpleName()
				+ " but actually references element of type " + entity.getClass().getSimpleName());
	}

	/**
	 * Check if uncertainty impact for given impact class and same assigned element
	 * (specified by uncertainty) already exists. If yes, add uncertainty to causing
	 * elements. If no, return.
	 * 
	 * @param <T>
	 * @param version
	 * @param ruleTypeClass
	 * @param uncertainty
	 * @return
	 */
	private static <T extends UCImpactEntity<? extends Entity>> boolean addUncertaintyIfUCImpactAlreadyExists(
			final UCArchitectureVersion version, final Class<T> ucImpactClass, final Uncertainty uncertainty) {

		Set<T> existingUncertaintyImpacts = ArchitectureModelLookup.lookUpAllSeedModificationMarksOfAType(version,
				ucImpactClass);
		for (T existingUncertaintyImpact : existingUncertaintyImpacts) {
			if (existingUncertaintyImpact.getAffectedElement().getId()
					.equals(uncertainty.getAssignedElement().getReferencedElement().getId())) {

				CausingUncertainty causingUncertainty = UncertaintyPropagationFactoryHelper
						.createCausingUncertainty(version.getUncertaintyImpactRepository().getSeedModifications());
				causingUncertainty.setCausingUncertainty(uncertainty);
				existingUncertaintyImpact.getCausingElements().add(causingUncertainty);
				return true;
			}
		}

		return false;

	}

	private static void checkIfVersionIsValid(UCArchitectureVersion version) throws InitializePropagationException {
		AbstractUCImpactRepository<?> modificationMarkRepository = version.getModificationMarkRepository();
		if (modificationMarkRepository == null) {
			throw new InitializePropagationException("ModificationMarkReository is not set");
		}

		if (modificationMarkRepository.getSeedModifications() == null) {
			throw new InitializePropagationException("UCPropagationSeed is not set");
		}

	}
}
