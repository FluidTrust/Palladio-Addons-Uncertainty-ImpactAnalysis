/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

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
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer#getUncertaintyTypes <em>Uncertainty Types</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyTypeContainer()
 * @model
 * @generated
 */
public interface UncertaintyTypeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Uncertainty Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty Types</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyTypeContainer_UncertaintyTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UncertaintyType> getUncertaintyTypes();

} // UncertaintyTypeContainer
