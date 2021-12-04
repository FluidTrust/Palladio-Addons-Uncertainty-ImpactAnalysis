/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage
 * @generated
 */
public interface PalladioElementTypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PalladioElementTypeFactory eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Palladio Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Palladio Element Type</em>'.
	 * @generated
	 */
	PalladioElementType createPalladioElementType();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	PalladioElementTypeContainer createPalladioElementTypeContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PalladioElementTypePackage getPalladioElementTypePackage();

} //PalladioElementTypeFactory
