/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplateFactory
 * @model kind="package"
 * @generated
 */
public interface UncertaintyTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uncertaintytemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uncertaintyTemplate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uncertaintytemplate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyTemplatePackage eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl <em>Uncertainty Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplatePackageImpl#getUncertaintyTemplate()
	 * @generated
	 */
	int UNCERTAINTY_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Add Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TEMPLATE__ADD_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Palladio Element Type Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Uncertainty Type Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER = 2;

	/**
	 * The number of structural features of the '<em>Uncertainty Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TEMPLATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Uncertainty Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TEMPLATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate <em>Uncertainty Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty Template</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate
	 * @generated
	 */
	EClass getUncertaintyTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getAddContainer <em>Add Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getAddContainer()
	 * @see #getUncertaintyTemplate()
	 * @generated
	 */
	EReference getUncertaintyTemplate_AddContainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getPalladioElementTypeContainer <em>Palladio Element Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palladio Element Type Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getPalladioElementTypeContainer()
	 * @see #getUncertaintyTemplate()
	 * @generated
	 */
	EReference getUncertaintyTemplate_PalladioElementTypeContainer();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getUncertaintyTypeContainer <em>Uncertainty Type Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uncertainty Type Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getUncertaintyTypeContainer()
	 * @see #getUncertaintyTemplate()
	 * @generated
	 */
	EReference getUncertaintyTemplate_UncertaintyTypeContainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UncertaintyTemplateFactory getUncertaintyTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl <em>Uncertainty Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplatePackageImpl#getUncertaintyTemplate()
		 * @generated
		 */
		EClass UNCERTAINTY_TEMPLATE = eINSTANCE.getUncertaintyTemplate();

		/**
		 * The meta object literal for the '<em><b>Add Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TEMPLATE__ADD_CONTAINER = eINSTANCE.getUncertaintyTemplate_AddContainer();

		/**
		 * The meta object literal for the '<em><b>Palladio Element Type Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER = eINSTANCE.getUncertaintyTemplate_PalladioElementTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Uncertainty Type Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER = eINSTANCE.getUncertaintyTemplate_UncertaintyTypeContainer();

	}

} //UncertaintyTemplatePackage
