/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getAssignedElement <em>Assigned Element</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getUncertaintyType <em>Uncertainty Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertainty()
 * @model
 * @generated
 */
public interface Uncertainty extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertainty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Element</em>' containment reference.
	 * @see #setAssignedElement(PalladioElementWrapper)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertainty_AssignedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PalladioElementWrapper getAssignedElement();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getAssignedElement <em>Assigned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Element</em>' containment reference.
	 * @see #getAssignedElement()
	 * @generated
	 */
	void setAssignedElement(PalladioElementWrapper value);

	/**
	 * Returns the value of the '<em><b>Uncertainty Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty Type</em>' reference.
	 * @see #setUncertaintyType(UncertaintyType)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getUncertainty_UncertaintyType()
	 * @model required="true"
	 * @generated
	 */
	UncertaintyType getUncertaintyType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getUncertaintyType <em>Uncertainty Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty Type</em>' reference.
	 * @see #getUncertaintyType()
	 * @generated
	 */
	void setUncertaintyType(UncertaintyType value);

} // Uncertainty
