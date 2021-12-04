/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Propagation Rules Seed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedBasicComponentBehaviours <em>Affected Basic Component Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedBasicComponentTypes <em>Affected Basic Component Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedCommunicationComponents <em>Affected Communication Components</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedCommunicationResources <em>Affected Communication Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInstances <em>Affected Component Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInterfaceInstances <em>Affected Component Interface Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInterfaceTypes <em>Affected Component Interface Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedHardwareResources <em>Affected Hardware Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedSystems <em>Affected Systems</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedSystemInterfaces <em>Affected System Interfaces</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedUsageBehaviours <em>Affected Usage Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getCausingUncertainties <em>Causing Uncertainties</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed()
 * @model
 * @generated
 */
public interface UCPropagationRulesSeed extends AbstractSeedModifications {
	/**
	 * Returns the value of the '<em><b>Affected Basic Component Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Basic Component Behaviours</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedBasicComponentBehaviours()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedBasicComponentTypes()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedCommunicationComponents()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedCommunicationResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtCommunicationResources> getAffectedCommunicationResources();

	/**
	 * Returns the value of the '<em><b>Affected Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Component Instances</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtComponentInstance> getAffectedComponentInstances();

	/**
	 * Returns the value of the '<em><b>Affected Component Interface Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Component Interface Instances</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedComponentInterfaceInstances()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedComponentInterfaceTypes()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedHardwareResources()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtSystem> getAffectedSystems();

	/**
	 * Returns the value of the '<em><b>Affected System Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected System Interfaces</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedSystemInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<UCImpactAtSystemInterface> getAffectedSystemInterfaces();

	/**
	 * Returns the value of the '<em><b>Affected Usage Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Usage Behaviours</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_AffectedUsageBehaviours()
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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getUCPropagationRulesSeed_CausingUncertainties()
	 * @model containment="true"
	 * @generated
	 */
	EList<CausingUncertainty> getCausingUncertainties();

} // UCPropagationRulesSeed
