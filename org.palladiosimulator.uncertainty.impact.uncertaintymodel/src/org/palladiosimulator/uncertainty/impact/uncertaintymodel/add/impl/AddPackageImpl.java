/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplatePackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddPackageImpl extends EPackageImpl implements AddPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amountOfAlternativesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum probabilityOfRevisabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum possibilityOfRevisabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum costsOfRevisionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AddPackageImpl() {
		super(eNS_URI, AddFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AddPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AddPackage init() {
		if (isInited) return (AddPackage)EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAddPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AddPackageImpl theAddPackage = registeredAddPackage instanceof AddPackageImpl ? (AddPackageImpl)registeredAddPackage : new AddPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UncertaintyPackage.eNS_URI);
		UncertaintyPackageImpl theUncertaintyPackage = (UncertaintyPackageImpl)(registeredPackage instanceof UncertaintyPackageImpl ? registeredPackage : UncertaintyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UncertaintyTypePackage.eNS_URI);
		UncertaintyTypePackageImpl theUncertaintyTypePackage = (UncertaintyTypePackageImpl)(registeredPackage instanceof UncertaintyTypePackageImpl ? registeredPackage : UncertaintyTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UncertaintyTemplatePackage.eNS_URI);
		UncertaintyTemplatePackageImpl theUncertaintyTemplatePackage = (UncertaintyTemplatePackageImpl)(registeredPackage instanceof UncertaintyTemplatePackageImpl ? registeredPackage : UncertaintyTemplatePackage.eINSTANCE);

		// Create package meta-data objects
		theAddPackage.createPackageContents();
		theUncertaintyPackage.createPackageContents();
		theUncertaintyTypePackage.createPackageContents();
		theUncertaintyTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theAddPackage.initializePackageContents();
		theUncertaintyPackage.initializePackageContents();
		theUncertaintyTypePackage.initializePackageContents();
		theUncertaintyTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAddPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AddPackage.eNS_URI, theAddPackage);
		return theAddPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADDContainer() {
		return addContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADDContainer_Adds() {
		return (EReference)addContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADD() {
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADD_Name() {
		return (EAttribute)addEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADD_AddClass() {
		return (EAttribute)addEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADD_AmountOfAlternatives() {
		return (EAttribute)addEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADD_ProbabilityOfRevisability() {
		return (EAttribute)addEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADD_PossibilityOfRevisability() {
		return (EAttribute)addEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADD_CostsOfRevision() {
		return (EAttribute)addEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getADDClass() {
		return addClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAmountOfAlternatives() {
		return amountOfAlternativesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProbabilityOfRevisability() {
		return probabilityOfRevisabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPossibilityOfRevisability() {
		return possibilityOfRevisabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCostsOfRevision() {
		return costsOfRevisionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddFactory getAddFactory() {
		return (AddFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addContainerEClass = createEClass(ADD_CONTAINER);
		createEReference(addContainerEClass, ADD_CONTAINER__ADDS);

		addEClass = createEClass(ADD);
		createEAttribute(addEClass, ADD__NAME);
		createEAttribute(addEClass, ADD__ADD_CLASS);
		createEAttribute(addEClass, ADD__AMOUNT_OF_ALTERNATIVES);
		createEAttribute(addEClass, ADD__PROBABILITY_OF_REVISABILITY);
		createEAttribute(addEClass, ADD__POSSIBILITY_OF_REVISABILITY);
		createEAttribute(addEClass, ADD__COSTS_OF_REVISION);

		// Create enums
		addClassEEnum = createEEnum(ADD_CLASS);
		amountOfAlternativesEEnum = createEEnum(AMOUNT_OF_ALTERNATIVES);
		probabilityOfRevisabilityEEnum = createEEnum(PROBABILITY_OF_REVISABILITY);
		possibilityOfRevisabilityEEnum = createEEnum(POSSIBILITY_OF_REVISABILITY);
		costsOfRevisionEEnum = createEEnum(COSTS_OF_REVISION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(addContainerEClass, ADDContainer.class, "ADDContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getADDContainer_Adds(), this.getADD(), null, "adds", null, 0, -1, ADDContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEClass, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, "ADD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADD_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADD_AddClass(), this.getADDClass(), "addClass", "STRUCTURAL_DECISION", 0, 1, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADD_AmountOfAlternatives(), this.getAmountOfAlternatives(), "amountOfAlternatives", null, 0, 1, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADD_ProbabilityOfRevisability(), this.getProbabilityOfRevisability(), "probabilityOfRevisability", null, 0, 1, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADD_PossibilityOfRevisability(), this.getPossibilityOfRevisability(), "possibilityOfRevisability", null, 0, 1, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADD_CostsOfRevision(), this.getCostsOfRevision(), "costsOfRevision", null, 0, 1, org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(addClassEEnum, ADDClass.class, "ADDClass");
		addEEnumLiteral(addClassEEnum, ADDClass.STRUCTURAL_DECISION);
		addEEnumLiteral(addClassEEnum, ADDClass.BEHAVIOURAL_DECISION);
		addEEnumLiteral(addClassEEnum, ADDClass.PROPERTY_DECISION);
		addEEnumLiteral(addClassEEnum, ADDClass.EXECUTIVE_DECISION);

		initEEnum(amountOfAlternativesEEnum, AmountOfAlternatives.class, "AmountOfAlternatives");
		addEEnumLiteral(amountOfAlternativesEEnum, AmountOfAlternatives.CLOSED_SET);
		addEEnumLiteral(amountOfAlternativesEEnum, AmountOfAlternatives.OPEN_SET);

		initEEnum(probabilityOfRevisabilityEEnum, ProbabilityOfRevisability.class, "ProbabilityOfRevisability");
		addEEnumLiteral(probabilityOfRevisabilityEEnum, ProbabilityOfRevisability.LIKELY);
		addEEnumLiteral(probabilityOfRevisabilityEEnum, ProbabilityOfRevisability.UNLIKELY);

		initEEnum(possibilityOfRevisabilityEEnum, PossibilityOfRevisability.class, "PossibilityOfRevisability");
		addEEnumLiteral(possibilityOfRevisabilityEEnum, PossibilityOfRevisability.YES);
		addEEnumLiteral(possibilityOfRevisabilityEEnum, PossibilityOfRevisability.NO);

		initEEnum(costsOfRevisionEEnum, CostsOfRevision.class, "CostsOfRevision");
		addEEnumLiteral(costsOfRevisionEEnum, CostsOfRevision.HIGH);
		addEEnumLiteral(costsOfRevisionEEnum, CostsOfRevision.LOW);

		// Create resource
		createResource(eNS_URI);
	}

} //AddPackageImpl
