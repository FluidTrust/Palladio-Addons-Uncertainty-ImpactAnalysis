/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palladio Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#getPalladioElementType()
 * @model
 * @generated
 */
public interface PalladioElementType extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes
	 * @see #setType(PalladioElementTypes)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#getPalladioElementType_Type()
	 * @model
	 * @generated
	 */
	PalladioElementTypes getType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PalladioElementTypes value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#getPalladioElementType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PalladioElementType
