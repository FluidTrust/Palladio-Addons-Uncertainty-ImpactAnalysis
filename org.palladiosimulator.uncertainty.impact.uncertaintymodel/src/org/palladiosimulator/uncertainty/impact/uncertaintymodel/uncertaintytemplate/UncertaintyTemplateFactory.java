/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage
 * @generated
 */
public interface UncertaintyTemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyTemplateFactory eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Uncertainty Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uncertainty Template</em>'.
	 * @generated
	 */
	UncertaintyTemplate createUncertaintyTemplate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UncertaintyTemplatePackage getUncertaintyTemplatePackage();

} //UncertaintyTemplateFactory
