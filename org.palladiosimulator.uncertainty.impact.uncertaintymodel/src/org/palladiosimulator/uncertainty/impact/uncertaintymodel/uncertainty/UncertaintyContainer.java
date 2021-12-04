/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertainties <em>Uncertainties</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertaintyTemplate <em>Uncertainty Template</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getBasicComponentBehaviours <em>Basic Component Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getComponentInterfaceInstances <em>Component Interface Instances</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertaintyContainer()
 * @model
 * @generated
 */
public interface UncertaintyContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Uncertainties</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainties</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertaintyContainer_Uncertainties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uncertainty> getUncertainties();

	/**
	 * Returns the value of the '<em><b>Uncertainty Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty Template</em>' reference.
	 * @see #setUncertaintyTemplate(UncertaintyTemplate)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertaintyContainer_UncertaintyTemplate()
	 * @model required="true"
	 * @generated
	 */
	UncertaintyTemplate getUncertaintyTemplate();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertaintyTemplate <em>Uncertainty Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty Template</em>' reference.
	 * @see #getUncertaintyTemplate()
	 * @generated
	 */
	void setUncertaintyTemplate(UncertaintyTemplate value);

	/**
	 * Returns the value of the '<em><b>Basic Component Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component Behaviours</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertaintyContainer_BasicComponentBehaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicComponentBehaviour> getBasicComponentBehaviours();

	/**
	 * Returns the value of the '<em><b>Component Interface Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Interface Instances</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertaintyContainer_ComponentInterfaceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInterfaceInstance> getComponentInterfaceInstances();

} // UncertaintyContainer
