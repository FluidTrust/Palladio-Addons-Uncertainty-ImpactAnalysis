/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeFactory
 * @model kind="package"
 * @generated
 */
public interface PalladioElementTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "palladioelementtype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/palladioElementType";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "palladioelementtype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PalladioElementTypePackage eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeImpl <em>Palladio Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl#getPalladioElementType()
	 * @generated
	 */
	int PALLADIO_ELEMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE__TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Palladio Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Palladio Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE_OPERATION_COUNT =  0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeContainerImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl#getPalladioElementTypeContainer()
	 * @generated
	 */
	int PALLADIO_ELEMENT_TYPE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Palladio Element Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_TYPE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes <em>Palladio Element Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl#getPalladioElementTypes()
	 * @generated
	 */
	int PALLADIO_ELEMENT_TYPES = 2;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType <em>Palladio Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palladio Element Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType
	 * @generated
	 */
	EClass getPalladioElementType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getType()
	 * @see #getPalladioElementType()
	 * @generated
	 */
	EAttribute getPalladioElementType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType#getName()
	 * @see #getPalladioElementType()
	 * @generated
	 */
	EAttribute getPalladioElementType_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer
	 * @generated
	 */
	EClass getPalladioElementTypeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer#getPalladioElementTypes <em>Palladio Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Palladio Element Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer#getPalladioElementTypes()
	 * @see #getPalladioElementTypeContainer()
	 * @generated
	 */
	EReference getPalladioElementTypeContainer_PalladioElementTypes();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes <em>Palladio Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Palladio Element Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes
	 * @generated
	 */
	EEnum getPalladioElementTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PalladioElementTypeFactory getPalladioElementTypeFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeImpl <em>Palladio Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl#getPalladioElementType()
		 * @generated
		 */
		EClass PALLADIO_ELEMENT_TYPE = eINSTANCE.getPalladioElementType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALLADIO_ELEMENT_TYPE__TYPE = eINSTANCE.getPalladioElementType_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PALLADIO_ELEMENT_TYPE__NAME = eINSTANCE.getPalladioElementType_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeContainerImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl#getPalladioElementTypeContainer()
		 * @generated
		 */
		EClass PALLADIO_ELEMENT_TYPE_CONTAINER = eINSTANCE.getPalladioElementTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Palladio Element Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES = eINSTANCE.getPalladioElementTypeContainer_PalladioElementTypes();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes <em>Palladio Element Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl#getPalladioElementTypes()
		 * @generated
		 */
		EEnum PALLADIO_ELEMENT_TYPES = eINSTANCE.getPalladioElementTypes();

	}

} //PalladioElementTypePackage
