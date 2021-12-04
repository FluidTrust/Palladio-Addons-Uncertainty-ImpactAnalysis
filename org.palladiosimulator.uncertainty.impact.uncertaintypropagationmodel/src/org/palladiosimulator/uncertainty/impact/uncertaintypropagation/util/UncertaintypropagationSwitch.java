/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.util;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage
 * @generated
 */
public class UncertaintypropagationSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UncertaintypropagationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintypropagationSwitch() {
		if (modelPackage == null) {
			modelPackage = UncertaintypropagationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UncertaintypropagationPackage.ABSTRACT_UC_IMPACT_REPOSITORY: {
				AbstractUCImpactRepository<?> abstractUCImpactRepository = (AbstractUCImpactRepository<?>)theEObject;
				T1 result = caseAbstractUCImpactRepository(abstractUCImpactRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractUCImpactRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_REPOSITORY: {
				UCImpactRepository ucImpactRepository = (UCImpactRepository)theEObject;
				T1 result = caseUCImpactRepository(ucImpactRepository);
				if (result == null) result = caseAbstractUCImpactRepository(ucImpactRepository);
				if (result == null) result = caseAbstractModificationRepository(ucImpactRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED: {
				UCPropagationRulesSeed ucPropagationRulesSeed = (UCPropagationRulesSeed)theEObject;
				T1 result = caseUCPropagationRulesSeed(ucPropagationRulesSeed);
				if (result == null) result = caseAbstractSeedModifications(ucPropagationRulesSeed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_ENTITY: {
				UCImpactEntity<?> ucImpactEntity = (UCImpactEntity<?>)theEObject;
				T1 result = caseUCImpactEntity(ucImpactEntity);
				if (result == null) result = caseAbstractModification(ucImpactEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY: {
				CausingUncertainty causingUncertainty = (CausingUncertainty)theEObject;
				T1 result = caseCausingUncertainty(causingUncertainty);
				if (result == null) result = caseIdentifier(causingUncertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION: {
				UncertaintyPropagation uncertaintyPropagation = (UncertaintyPropagation)theEObject;
				T1 result = caseUncertaintyPropagation(uncertaintyPropagation);
				if (result == null) result = caseChangePropagationStep(uncertaintyPropagation);
				if (result == null) result = caseAbstractChangePropagationStep(uncertaintyPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR: {
				UCImpactAtBasicComponentBehaviour ucImpactAtBasicComponentBehaviour = (UCImpactAtBasicComponentBehaviour)theEObject;
				T1 result = caseUCImpactAtBasicComponentBehaviour(ucImpactAtBasicComponentBehaviour);
				if (result == null) result = caseUCImpactEntity(ucImpactAtBasicComponentBehaviour);
				if (result == null) result = caseAbstractModification(ucImpactAtBasicComponentBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_BASIC_COMPONENT_TYPE: {
				UCImpactAtBasicComponentType ucImpactAtBasicComponentType = (UCImpactAtBasicComponentType)theEObject;
				T1 result = caseUCImpactAtBasicComponentType(ucImpactAtBasicComponentType);
				if (result == null) result = caseUCImpactEntity(ucImpactAtBasicComponentType);
				if (result == null) result = caseAbstractModification(ucImpactAtBasicComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMMUNICATION_COMPONENTS: {
				UCImpactAtCommunicationComponents ucImpactAtCommunicationComponents = (UCImpactAtCommunicationComponents)theEObject;
				T1 result = caseUCImpactAtCommunicationComponents(ucImpactAtCommunicationComponents);
				if (result == null) result = caseUCImpactEntity(ucImpactAtCommunicationComponents);
				if (result == null) result = caseAbstractModification(ucImpactAtCommunicationComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMMUNICATION_RESOURCES: {
				UCImpactAtCommunicationResources ucImpactAtCommunicationResources = (UCImpactAtCommunicationResources)theEObject;
				T1 result = caseUCImpactAtCommunicationResources(ucImpactAtCommunicationResources);
				if (result == null) result = caseUCImpactEntity(ucImpactAtCommunicationResources);
				if (result == null) result = caseAbstractModification(ucImpactAtCommunicationResources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMPONENT_INSTANCE: {
				UCImpactAtComponentInstance ucImpactAtComponentInstance = (UCImpactAtComponentInstance)theEObject;
				T1 result = caseUCImpactAtComponentInstance(ucImpactAtComponentInstance);
				if (result == null) result = caseUCImpactEntity(ucImpactAtComponentInstance);
				if (result == null) result = caseAbstractModification(ucImpactAtComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE: {
				UCImpactAtComponentInterfaceInstance ucImpactAtComponentInterfaceInstance = (UCImpactAtComponentInterfaceInstance)theEObject;
				T1 result = caseUCImpactAtComponentInterfaceInstance(ucImpactAtComponentInterfaceInstance);
				if (result == null) result = caseUCImpactEntity(ucImpactAtComponentInterfaceInstance);
				if (result == null) result = caseAbstractModification(ucImpactAtComponentInterfaceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE: {
				UCImpactAtComponentInterfaceType ucImpactAtComponentInterfaceType = (UCImpactAtComponentInterfaceType)theEObject;
				T1 result = caseUCImpactAtComponentInterfaceType(ucImpactAtComponentInterfaceType);
				if (result == null) result = caseUCImpactEntity(ucImpactAtComponentInterfaceType);
				if (result == null) result = caseAbstractModification(ucImpactAtComponentInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_HARDWARE_RESOURCE: {
				UCImpactAtHardwareResource ucImpactAtHardwareResource = (UCImpactAtHardwareResource)theEObject;
				T1 result = caseUCImpactAtHardwareResource(ucImpactAtHardwareResource);
				if (result == null) result = caseUCImpactEntity(ucImpactAtHardwareResource);
				if (result == null) result = caseAbstractModification(ucImpactAtHardwareResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_SYSTEM: {
				UCImpactAtSystem ucImpactAtSystem = (UCImpactAtSystem)theEObject;
				T1 result = caseUCImpactAtSystem(ucImpactAtSystem);
				if (result == null) result = caseUCImpactEntity(ucImpactAtSystem);
				if (result == null) result = caseAbstractModification(ucImpactAtSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_SYSTEM_INTERFACE: {
				UCImpactAtSystemInterface ucImpactAtSystemInterface = (UCImpactAtSystemInterface)theEObject;
				T1 result = caseUCImpactAtSystemInterface(ucImpactAtSystemInterface);
				if (result == null) result = caseUCImpactEntity(ucImpactAtSystemInterface);
				if (result == null) result = caseAbstractModification(ucImpactAtSystemInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.UC_IMPACT_AT_USAGE_BEHAVIOUR: {
				UCImpactAtUsageBehaviour ucImpactAtUsageBehaviour = (UCImpactAtUsageBehaviour)theEObject;
				T1 result = caseUCImpactAtUsageBehaviour(ucImpactAtUsageBehaviour);
				if (result == null) result = caseUCImpactEntity(ucImpactAtUsageBehaviour);
				if (result == null) result = caseAbstractModification(ucImpactAtUsageBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER: {
				ComponentInterfaceInstanceContainer componentInterfaceInstanceContainer = (ComponentInterfaceInstanceContainer)theEObject;
				T1 result = caseComponentInterfaceInstanceContainer(componentInterfaceInstanceContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER: {
				BasicComponentBehaviourContainer basicComponentBehaviourContainer = (BasicComponentBehaviourContainer)theEObject;
				T1 result = caseBasicComponentBehaviourContainer(basicComponentBehaviourContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract UC Impact Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract UC Impact Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends UCPropagationRulesSeed> T1 caseAbstractUCImpactRepository(AbstractUCImpactRepository<S> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactRepository(UCImpactRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Propagation Rules Seed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Propagation Rules Seed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCPropagationRulesSeed(UCPropagationRulesSeed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseUCImpactEntity(UCImpactEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Causing Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Causing Uncertainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCausingUncertainty(CausingUncertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uncertainty Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uncertainty Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUncertaintyPropagation(UncertaintyPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Basic Component Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Basic Component Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtBasicComponentBehaviour(UCImpactAtBasicComponentBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Basic Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Basic Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtBasicComponentType(UCImpactAtBasicComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Communication Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Communication Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtCommunicationComponents(UCImpactAtCommunicationComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Communication Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Communication Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtCommunicationResources(UCImpactAtCommunicationResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtComponentInstance(UCImpactAtComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Component Interface Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Component Interface Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtComponentInterfaceInstance(UCImpactAtComponentInterfaceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Component Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Component Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtComponentInterfaceType(UCImpactAtComponentInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Hardware Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Hardware Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtHardwareResource(UCImpactAtHardwareResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtSystem(UCImpactAtSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At System Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At System Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtSystemInterface(UCImpactAtSystemInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UC Impact At Usage Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UC Impact At Usage Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUCImpactAtUsageBehaviour(UCImpactAtUsageBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Interface Instance Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Interface Instance Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComponentInterfaceInstanceContainer(ComponentInterfaceInstanceContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Component Behaviour Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Component Behaviour Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicComponentBehaviourContainer(BasicComponentBehaviourContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //UncertaintypropagationSwitch
