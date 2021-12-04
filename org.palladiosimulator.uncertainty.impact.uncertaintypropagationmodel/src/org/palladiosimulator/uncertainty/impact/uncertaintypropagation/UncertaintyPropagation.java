/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uncertainty Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedBasicComponentBehaviours <em>Affected Basic Component Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedBasicComponentTypes <em>Affected Basic Component Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedCommunicationComponents <em>Affected Communication Components</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedCommunicationResources <em>Affected Communication Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffecteComponentInstances <em>Affecte Component Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedComponentInterfaceInstances <em>Affected Component Interface Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedComponentInterfaceTypes <em>Affected Component Interface Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedHardwareResources <em>Affected Hardware Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedSystems <em>Affected Systems</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedSystemInterface <em>Affected System Interface</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedUsageBehaviours <em>Affected Usage Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getCausingUncertainties <em>Causing Uncertainties</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getComponentInterfaceInstanceContainer <em>Component Interface Instance Container</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getBasicComponentBehaviourContainer <em>Basic Component Behaviour Container</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation()
 * @model
 * @generated
 */
public interface UncertaintyPropagation extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Affected Basic Component Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Basic Component Behaviours</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedBasicComponentBehaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtBasicComponentBehaviour> getAffectedBasicComponentBehaviours();

	/**
	 * Returns the value of the '<em><b>Affected Basic Component Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Basic Component Types</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedBasicComponentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtBasicComponentType> getAffectedBasicComponentTypes();

	/**
	 * Returns the value of the '<em><b>Affected Communication Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Communication Components</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedCommunicationComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtCommunicationComponents> getAffectedCommunicationComponents();

	/**
	 * Returns the value of the '<em><b>Affected Communication Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Communication Resources</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedCommunicationResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtCommunicationResources> getAffectedCommunicationResources();

	/**
	 * Returns the value of the '<em><b>Affecte Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affecte Component Instances</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffecteComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtComponentInstance> getAffecteComponentInstances();

	/**
	 * Returns the value of the '<em><b>Affected Component Interface Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Component Interface Instances</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedComponentInterfaceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtComponentInterfaceInstance> getAffectedComponentInterfaceInstances();

	/**
	 * Returns the value of the '<em><b>Affected Component Interface Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Component Interface Types</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedComponentInterfaceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtComponentInterfaceType> getAffectedComponentInterfaceTypes();

	/**
	 * Returns the value of the '<em><b>Affected Hardware Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Hardware Resources</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedHardwareResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtHardwareResource> getAffectedHardwareResources();

	/**
	 * Returns the value of the '<em><b>Affected Systems</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Systems</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtSystem> getAffectedSystems();

	/**
	 * Returns the value of the '<em><b>Affected System Interface</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected System Interface</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedSystemInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtSystemInterface> getAffectedSystemInterface();

	/**
	 * Returns the value of the '<em><b>Affected Usage Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Usage Behaviours</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_AffectedUsageBehaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtUsageBehaviour> getAffectedUsageBehaviours();

	/**
	 * Returns the value of the '<em><b>Causing Uncertainties</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causing Uncertainties</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_CausingUncertainties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CausingUncertainty> getCausingUncertainties();

	/**
	 * Returns the value of the '<em><b>Component Interface Instance Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Interface Instance Container</em>' containment reference.
	 * @see #setComponentInterfaceInstanceContainer(ComponentInterfaceInstanceContainer)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_ComponentInterfaceInstanceContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ComponentInterfaceInstanceContainer getComponentInterfaceInstanceContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getComponentInterfaceInstanceContainer <em>Component Interface Instance Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Interface Instance Container</em>' containment reference.
	 * @see #getComponentInterfaceInstanceContainer()
	 * @generated
	 */
	void setComponentInterfaceInstanceContainer(ComponentInterfaceInstanceContainer value);

	/**
	 * Returns the value of the '<em><b>Basic Component Behaviour Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component Behaviour Container</em>' containment reference.
	 * @see #setBasicComponentBehaviourContainer(BasicComponentBehaviourContainer)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUncertaintyPropagation_BasicComponentBehaviourContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BasicComponentBehaviourContainer getBasicComponentBehaviourContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getBasicComponentBehaviourContainer <em>Basic Component Behaviour Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Component Behaviour Container</em>' containment reference.
	 * @see #getBasicComponentBehaviourContainer()
	 * @generated
	 */
	void setBasicComponentBehaviourContainer(BasicComponentBehaviourContainer value);

} // UncertaintyPropagation
