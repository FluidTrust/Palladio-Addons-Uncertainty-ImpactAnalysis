/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintypropagationFactoryImpl extends EFactoryImpl implements UncertaintypropagationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UncertaintypropagationFactory init() {
		try {
			UncertaintypropagationFactory theUncertaintypropagationFactory = (UncertaintypropagationFactory)EPackage.Registry.INSTANCE.getEFactory(UncertaintypropagationPackage.eNS_URI);
			if (theUncertaintypropagationFactory != null) {
				return theUncertaintypropagationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UncertaintypropagationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintypropagationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UncertaintypropagationPackage.UC_IMPACT_REPOSITORY: return createUCImpactRepository();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED: return createUCPropagationRulesSeed();
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY: return createCausingUncertainty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION: return createUncertaintyPropagation();
			case UncertaintypropagationPackage.UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR: return createUCImpactAtBasicComponentBehaviour();
			case UncertaintypropagationPackage.UC_IMPACT_AT_BASIC_COMPONENT_TYPE: return createUCImpactAtBasicComponentType();
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMMUNICATION_COMPONENTS: return createUCImpactAtCommunicationComponents();
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMMUNICATION_RESOURCES: return createUCImpactAtCommunicationResources();
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMPONENT_INSTANCE: return createUCImpactAtComponentInstance();
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE: return createUCImpactAtComponentInterfaceInstance();
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE: return createUCImpactAtComponentInterfaceType();
			case UncertaintypropagationPackage.UC_IMPACT_AT_HARDWARE_RESOURCE: return createUCImpactAtHardwareResource();
			case UncertaintypropagationPackage.UC_IMPACT_AT_SYSTEM: return createUCImpactAtSystem();
			case UncertaintypropagationPackage.UC_IMPACT_AT_SYSTEM_INTERFACE: return createUCImpactAtSystemInterface();
			case UncertaintypropagationPackage.UC_IMPACT_AT_USAGE_BEHAVIOUR: return createUCImpactAtUsageBehaviour();
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER: return createComponentInterfaceInstanceContainer();
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER: return createBasicComponentBehaviourContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactRepository createUCImpactRepository() {
		UCImpactRepositoryImpl ucImpactRepository = new UCImpactRepositoryImpl();
		return ucImpactRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCPropagationRulesSeed createUCPropagationRulesSeed() {
		UCPropagationRulesSeedImpl ucPropagationRulesSeed = new UCPropagationRulesSeedImpl();
		return ucPropagationRulesSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausingUncertainty createCausingUncertainty() {
		CausingUncertaintyImpl causingUncertainty = new CausingUncertaintyImpl();
		return causingUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyPropagation createUncertaintyPropagation() {
		UncertaintyPropagationImpl uncertaintyPropagation = new UncertaintyPropagationImpl();
		return uncertaintyPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtBasicComponentBehaviour createUCImpactAtBasicComponentBehaviour() {
		UCImpactAtBasicComponentBehaviourImpl ucImpactAtBasicComponentBehaviour = new UCImpactAtBasicComponentBehaviourImpl();
		return ucImpactAtBasicComponentBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtBasicComponentType createUCImpactAtBasicComponentType() {
		UCImpactAtBasicComponentTypeImpl ucImpactAtBasicComponentType = new UCImpactAtBasicComponentTypeImpl();
		return ucImpactAtBasicComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtCommunicationComponents createUCImpactAtCommunicationComponents() {
		UCImpactAtCommunicationComponentsImpl ucImpactAtCommunicationComponents = new UCImpactAtCommunicationComponentsImpl();
		return ucImpactAtCommunicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtCommunicationResources createUCImpactAtCommunicationResources() {
		UCImpactAtCommunicationResourcesImpl ucImpactAtCommunicationResources = new UCImpactAtCommunicationResourcesImpl();
		return ucImpactAtCommunicationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtComponentInstance createUCImpactAtComponentInstance() {
		UCImpactAtComponentInstanceImpl ucImpactAtComponentInstance = new UCImpactAtComponentInstanceImpl();
		return ucImpactAtComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtComponentInterfaceInstance createUCImpactAtComponentInterfaceInstance() {
		UCImpactAtComponentInterfaceInstanceImpl ucImpactAtComponentInterfaceInstance = new UCImpactAtComponentInterfaceInstanceImpl();
		return ucImpactAtComponentInterfaceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtComponentInterfaceType createUCImpactAtComponentInterfaceType() {
		UCImpactAtComponentInterfaceTypeImpl ucImpactAtComponentInterfaceType = new UCImpactAtComponentInterfaceTypeImpl();
		return ucImpactAtComponentInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtHardwareResource createUCImpactAtHardwareResource() {
		UCImpactAtHardwareResourceImpl ucImpactAtHardwareResource = new UCImpactAtHardwareResourceImpl();
		return ucImpactAtHardwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtSystem createUCImpactAtSystem() {
		UCImpactAtSystemImpl ucImpactAtSystem = new UCImpactAtSystemImpl();
		return ucImpactAtSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtSystemInterface createUCImpactAtSystemInterface() {
		UCImpactAtSystemInterfaceImpl ucImpactAtSystemInterface = new UCImpactAtSystemInterfaceImpl();
		return ucImpactAtSystemInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCImpactAtUsageBehaviour createUCImpactAtUsageBehaviour() {
		UCImpactAtUsageBehaviourImpl ucImpactAtUsageBehaviour = new UCImpactAtUsageBehaviourImpl();
		return ucImpactAtUsageBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceInstanceContainer createComponentInterfaceInstanceContainer() {
		ComponentInterfaceInstanceContainerImpl componentInterfaceInstanceContainer = new ComponentInterfaceInstanceContainerImpl();
		return componentInterfaceInstanceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponentBehaviourContainer createBasicComponentBehaviourContainer() {
		BasicComponentBehaviourContainerImpl basicComponentBehaviourContainer = new BasicComponentBehaviourContainerImpl();
		return basicComponentBehaviourContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintypropagationPackage getUncertaintypropagationPackage() {
		return (UncertaintypropagationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UncertaintypropagationPackage getPackage() {
		return UncertaintypropagationPackage.eINSTANCE;
	}

} //UncertaintypropagationFactoryImpl
