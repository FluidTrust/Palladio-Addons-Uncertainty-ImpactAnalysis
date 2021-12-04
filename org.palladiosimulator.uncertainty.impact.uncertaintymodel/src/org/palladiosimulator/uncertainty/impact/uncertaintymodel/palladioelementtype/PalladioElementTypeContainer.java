/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer#getPalladioElementTypes <em>Palladio Element Types</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#getPalladioElementTypeContainer()
 * @model
 * @generated
 */
public interface PalladioElementTypeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Palladio Element Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio Element Types</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#getPalladioElementTypeContainer_PalladioElementTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PalladioElementType> getPalladioElementTypes();

} // PalladioElementTypeContainer
