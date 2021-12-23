/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

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
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddFactory
 * @model kind="package"
 * @generated
 */
public interface AddPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "add";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/add";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "add";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddPackage eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDContainerImpl <em>ADD Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDContainerImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getADDContainer()
	 * @generated
	 */
	int ADD_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Adds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONTAINER__ADDS = 0;

	/**
	 * The number of structural features of the '<em>ADD Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ADD Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl <em>ADD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getADD()
	 * @generated
	 */
	int ADD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ADD_CLASS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount Of Alternatives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__AMOUNT_OF_ALTERNATIVES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Probability Of Revisability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__PROBABILITY_OF_REVISABILITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Possibility Of Revisability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__POSSIBILITY_OF_REVISABILITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Costs Of Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__COSTS_OF_REVISION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ADD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>ADD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass <em>ADD Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getADDClass()
	 * @generated
	 */
	int ADD_CLASS = 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives <em>Amount Of Alternatives</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getAmountOfAlternatives()
	 * @generated
	 */
	int AMOUNT_OF_ALTERNATIVES = 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability <em>Probability Of Revisability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getProbabilityOfRevisability()
	 * @generated
	 */
	int PROBABILITY_OF_REVISABILITY = 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability <em>Possibility Of Revisability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getPossibilityOfRevisability()
	 * @generated
	 */
	int POSSIBILITY_OF_REVISABILITY = 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision <em>Costs Of Revision</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getCostsOfRevision()
	 * @generated
	 */
	int COSTS_OF_REVISION = 6;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer <em>ADD Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADD Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer
	 * @generated
	 */
	EClass getADDContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer#getAdds <em>Adds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adds</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer#getAdds()
	 * @see #getADDContainer()
	 * @generated
	 */
	EReference getADDContainer_Adds();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD <em>ADD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADD</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD
	 * @generated
	 */
	EClass getADD();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getName()
	 * @see #getADD()
	 * @generated
	 */
	EAttribute getADD_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAddClass <em>Add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Class</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAddClass()
	 * @see #getADD()
	 * @generated
	 */
	EAttribute getADD_AddClass();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAmountOfAlternatives <em>Amount Of Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Alternatives</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAmountOfAlternatives()
	 * @see #getADD()
	 * @generated
	 */
	EAttribute getADD_AmountOfAlternatives();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getProbabilityOfRevisability <em>Probability Of Revisability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability Of Revisability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getProbabilityOfRevisability()
	 * @see #getADD()
	 * @generated
	 */
	EAttribute getADD_ProbabilityOfRevisability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getPossibilityOfRevisability <em>Possibility Of Revisability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Possibility Of Revisability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getPossibilityOfRevisability()
	 * @see #getADD()
	 * @generated
	 */
	EAttribute getADD_PossibilityOfRevisability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getCostsOfRevision <em>Costs Of Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs Of Revision</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getCostsOfRevision()
	 * @see #getADD()
	 * @generated
	 */
	EAttribute getADD_CostsOfRevision();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass <em>ADD Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ADD Class</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass
	 * @generated
	 */
	EEnum getADDClass();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives <em>Amount Of Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Amount Of Alternatives</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives
	 * @generated
	 */
	EEnum getAmountOfAlternatives();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability <em>Probability Of Revisability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Probability Of Revisability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability
	 * @generated
	 */
	EEnum getProbabilityOfRevisability();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability <em>Possibility Of Revisability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Possibility Of Revisability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability
	 * @generated
	 */
	EEnum getPossibilityOfRevisability();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision <em>Costs Of Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Costs Of Revision</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision
	 * @generated
	 */
	EEnum getCostsOfRevision();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AddFactory getAddFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDContainerImpl <em>ADD Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDContainerImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getADDContainer()
		 * @generated
		 */
		EClass ADD_CONTAINER = eINSTANCE.getADDContainer();

		/**
		 * The meta object literal for the '<em><b>Adds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CONTAINER__ADDS = eINSTANCE.getADDContainer_Adds();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl <em>ADD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getADD()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getADD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__NAME = eINSTANCE.getADD_Name();

		/**
		 * The meta object literal for the '<em><b>Add Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__ADD_CLASS = eINSTANCE.getADD_AddClass();

		/**
		 * The meta object literal for the '<em><b>Amount Of Alternatives</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__AMOUNT_OF_ALTERNATIVES = eINSTANCE.getADD_AmountOfAlternatives();

		/**
		 * The meta object literal for the '<em><b>Probability Of Revisability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__PROBABILITY_OF_REVISABILITY = eINSTANCE.getADD_ProbabilityOfRevisability();

		/**
		 * The meta object literal for the '<em><b>Possibility Of Revisability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__POSSIBILITY_OF_REVISABILITY = eINSTANCE.getADD_PossibilityOfRevisability();

		/**
		 * The meta object literal for the '<em><b>Costs Of Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__COSTS_OF_REVISION = eINSTANCE.getADD_CostsOfRevision();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass <em>ADD Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getADDClass()
		 * @generated
		 */
		EEnum ADD_CLASS = eINSTANCE.getADDClass();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives <em>Amount Of Alternatives</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getAmountOfAlternatives()
		 * @generated
		 */
		EEnum AMOUNT_OF_ALTERNATIVES = eINSTANCE.getAmountOfAlternatives();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability <em>Probability Of Revisability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getProbabilityOfRevisability()
		 * @generated
		 */
		EEnum PROBABILITY_OF_REVISABILITY = eINSTANCE.getProbabilityOfRevisability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability <em>Possibility Of Revisability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getPossibilityOfRevisability()
		 * @generated
		 */
		EEnum POSSIBILITY_OF_REVISABILITY = eINSTANCE.getPossibilityOfRevisability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision <em>Costs Of Revision</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl#getCostsOfRevision()
		 * @generated
		 */
		EEnum COSTS_OF_REVISION = eINSTANCE.getCostsOfRevision();

	}

} //AddPackage
