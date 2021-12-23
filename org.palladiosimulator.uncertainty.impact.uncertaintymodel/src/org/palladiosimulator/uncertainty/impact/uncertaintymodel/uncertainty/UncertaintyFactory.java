/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage
 * @generated
 */
public interface UncertaintyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyFactory eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Wrapper</em>'.
	 * @generated
	 */
	ElementWrapper createElementWrapper();

	/**
	 * Returns a new object of class '<em>Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uncertainty</em>'.
	 * @generated
	 */
	Uncertainty createUncertainty();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	UncertaintyContainer createUncertaintyContainer();

	/**
	 * Returns a new object of class '<em>Component Interface Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Interface Instance</em>'.
	 * @generated
	 */
	ComponentInterfaceInstance createComponentInterfaceInstance();

	/**
	 * Returns a new object of class '<em>Basic Component Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Component Behaviour</em>'.
	 * @generated
	 */
	BasicComponentBehaviour createBasicComponentBehaviour();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UncertaintyPackage getUncertaintyPackage();

} //UncertaintyFactory
