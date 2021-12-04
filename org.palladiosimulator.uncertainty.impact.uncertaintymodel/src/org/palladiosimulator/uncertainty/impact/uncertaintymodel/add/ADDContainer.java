/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADD Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer#getAdds <em>Adds</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADDContainer()
 * @model
 * @generated
 */
public interface ADDContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Adds</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adds</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADDContainer_Adds()
	 * @model containment="true"
	 * @generated
	 */
	EList<ADD> getAdds();

} // ADDContainer
