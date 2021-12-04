/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage
 * @generated
 */
public interface AddFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddFactory eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ADD Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADD Container</em>'.
	 * @generated
	 */
	ADDContainer createADDContainer();

	/**
	 * Returns a new object of class '<em>ADD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADD</em>'.
	 * @generated
	 */
	ADD createADD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AddPackage getAddPackage();

} //AddFactory
