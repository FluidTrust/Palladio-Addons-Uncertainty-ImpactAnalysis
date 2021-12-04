/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage
 * @generated
 */
public interface UncertaintyTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyTypeFactory eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uncertainty Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uncertainty Type</em>'.
	 * @generated
	 */
	UncertaintyType createUncertaintyType();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	UncertaintyTypeContainer createUncertaintyTypeContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UncertaintyTypePackage getUncertaintyTypePackage();

} //UncertaintyTypeFactory
