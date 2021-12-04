/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl;

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

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;

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
public class PalladioElementTypePackageImpl extends EPackageImpl implements PalladioElementTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass palladioElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass palladioElementTypeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum palladioElementTypesEEnum = null;

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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PalladioElementTypePackageImpl() {
		super(eNS_URI, PalladioElementTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PalladioElementTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PalladioElementTypePackage init() {
		if (isInited) return (PalladioElementTypePackage)EPackage.Registry.INSTANCE.getEPackage(PalladioElementTypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPalladioElementTypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PalladioElementTypePackageImpl thePalladioElementTypePackage = registeredPalladioElementTypePackage instanceof PalladioElementTypePackageImpl ? (PalladioElementTypePackageImpl)registeredPalladioElementTypePackage : new PalladioElementTypePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);
		AddPackageImpl theAddPackage = (AddPackageImpl)(registeredPackage instanceof AddPackageImpl ? registeredPackage : AddPackage.eINSTANCE);

		// Create package meta-data objects
		thePalladioElementTypePackage.createPackageContents();
		theUncertaintyPackage.createPackageContents();
		theUncertaintyTypePackage.createPackageContents();
		theUncertaintyTemplatePackage.createPackageContents();
		theAddPackage.createPackageContents();

		// Initialize created meta-data
		thePalladioElementTypePackage.initializePackageContents();
		theUncertaintyPackage.initializePackageContents();
		theUncertaintyTypePackage.initializePackageContents();
		theUncertaintyTemplatePackage.initializePackageContents();
		theAddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePalladioElementTypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PalladioElementTypePackage.eNS_URI, thePalladioElementTypePackage);
		return thePalladioElementTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalladioElementType() {
		return palladioElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalladioElementType_Type() {
		return (EAttribute)palladioElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalladioElementType_Name() {
		return (EAttribute)palladioElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalladioElementTypeContainer() {
		return palladioElementTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalladioElementTypeContainer_PalladioElementTypes() {
		return (EReference)palladioElementTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPalladioElementTypes() {
		return palladioElementTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypeFactory getPalladioElementTypeFactory() {
		return (PalladioElementTypeFactory)getEFactoryInstance();
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
		palladioElementTypeEClass = createEClass(PALLADIO_ELEMENT_TYPE);
		createEAttribute(palladioElementTypeEClass, PALLADIO_ELEMENT_TYPE__TYPE);
		createEAttribute(palladioElementTypeEClass, PALLADIO_ELEMENT_TYPE__NAME);

		palladioElementTypeContainerEClass = createEClass(PALLADIO_ELEMENT_TYPE_CONTAINER);
		createEReference(palladioElementTypeContainerEClass, PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES);

		// Create enums
		palladioElementTypesEEnum = createEEnum(PALLADIO_ELEMENT_TYPES);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		palladioElementTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(palladioElementTypeEClass, PalladioElementType.class, "PalladioElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPalladioElementType_Type(), this.getPalladioElementTypes(), "type", null, 0, 1, PalladioElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPalladioElementType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PalladioElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(palladioElementTypeContainerEClass, PalladioElementTypeContainer.class, "PalladioElementTypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalladioElementTypeContainer_PalladioElementTypes(), this.getPalladioElementType(), null, "palladioElementTypes", null, 0, -1, PalladioElementTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(palladioElementTypesEEnum, PalladioElementTypes.class, "PalladioElementTypes");
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.SYSTEM);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.HARDWARE_RESOURCE);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.BASIC_COMPONENT_TYPE);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.COMPONENT_INSTANCE);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.BASIC_COMPONENT_BEHAVIOUR);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.COMMUNICATION_COMPONENTS);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.COMMUNICATION_RESOURCES);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.SYSTEM_INTERFACE);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.COMPONENT_INTERFACE_INSTANCE);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.COMPONENT_INTERFACE_TYPE);
		addEEnumLiteral(palladioElementTypesEEnum, PalladioElementTypes.USAGE_BEHAVIOUR);

		// Create resource
		createResource(eNS_URI);
	}

} //PalladioElementTypePackageImpl
