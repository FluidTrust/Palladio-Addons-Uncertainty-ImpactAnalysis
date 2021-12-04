/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl;

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

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplatePackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyTypePackageImpl extends EPackageImpl implements UncertaintyTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyTypeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum natureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum informationAvailabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manageabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactOnConfidentialityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityOfImpactEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rootCauseEEnum = null;

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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UncertaintyTypePackageImpl() {
		super(eNS_URI, UncertaintyTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UncertaintyTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UncertaintyTypePackage init() {
		if (isInited) return (UncertaintyTypePackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyTypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUncertaintyTypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UncertaintyTypePackageImpl theUncertaintyTypePackage = registeredUncertaintyTypePackage instanceof UncertaintyTypePackageImpl ? (UncertaintyTypePackageImpl)registeredUncertaintyTypePackage : new UncertaintyTypePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UncertaintyTemplatePackage.eNS_URI);
		UncertaintyTemplatePackageImpl theUncertaintyTemplatePackage = (UncertaintyTemplatePackageImpl)(registeredPackage instanceof UncertaintyTemplatePackageImpl ? registeredPackage : UncertaintyTemplatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioElementTypePackage.eNS_URI);
		PalladioElementTypePackageImpl thePalladioElementTypePackage = (PalladioElementTypePackageImpl)(registeredPackage instanceof PalladioElementTypePackageImpl ? registeredPackage : PalladioElementTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);
		AddPackageImpl theAddPackage = (AddPackageImpl)(registeredPackage instanceof AddPackageImpl ? registeredPackage : AddPackage.eINSTANCE);

		// Create package meta-data objects
		theUncertaintyTypePackage.createPackageContents();
		theUncertaintyPackage.createPackageContents();
		theUncertaintyTemplatePackage.createPackageContents();
		thePalladioElementTypePackage.createPackageContents();
		theAddPackage.createPackageContents();

		// Initialize created meta-data
		theUncertaintyTypePackage.initializePackageContents();
		theUncertaintyPackage.initializePackageContents();
		theUncertaintyTemplatePackage.initializePackageContents();
		thePalladioElementTypePackage.initializePackageContents();
		theAddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUncertaintyTypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UncertaintyTypePackage.eNS_URI, theUncertaintyTypePackage);
		return theUncertaintyTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertaintyType() {
		return uncertaintyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_Name() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyType_ImpactOn() {
		return (EReference)uncertaintyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyType_AssignableElementType() {
		return (EReference)uncertaintyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyType_ResolvedBy() {
		return (EReference)uncertaintyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_Location() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_InformationAvailability() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_Nature() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_Manageability() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_ImpactOnConfidentiality() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_SeverityOfImpact() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_ResolutionTime() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertaintyType_RootCause() {
		return (EAttribute)uncertaintyTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertaintyTypeContainer() {
		return uncertaintyTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyTypeContainer_UncertaintyTypes() {
		return (EReference)uncertaintyTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNature() {
		return natureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocation() {
		return locationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInformationAvailability() {
		return informationAvailabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManageability() {
		return manageabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImpactOnConfidentiality() {
		return impactOnConfidentialityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverityOfImpact() {
		return severityOfImpactEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolutionTime() {
		return resolutionTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRootCause() {
		return rootCauseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypeFactory getUncertaintyTypeFactory() {
		return (UncertaintyTypeFactory)getEFactoryInstance();
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
		uncertaintyTypeEClass = createEClass(UNCERTAINTY_TYPE);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__NAME);
		createEReference(uncertaintyTypeEClass, UNCERTAINTY_TYPE__IMPACT_ON);
		createEReference(uncertaintyTypeEClass, UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE);
		createEReference(uncertaintyTypeEClass, UNCERTAINTY_TYPE__RESOLVED_BY);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__LOCATION);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__NATURE);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__MANAGEABILITY);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__RESOLUTION_TIME);
		createEAttribute(uncertaintyTypeEClass, UNCERTAINTY_TYPE__ROOT_CAUSE);

		uncertaintyTypeContainerEClass = createEClass(UNCERTAINTY_TYPE_CONTAINER);
		createEReference(uncertaintyTypeContainerEClass, UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES);

		// Create enums
		natureEEnum = createEEnum(NATURE);
		locationEEnum = createEEnum(LOCATION);
		informationAvailabilityEEnum = createEEnum(INFORMATION_AVAILABILITY);
		manageabilityEEnum = createEEnum(MANAGEABILITY);
		impactOnConfidentialityEEnum = createEEnum(IMPACT_ON_CONFIDENTIALITY);
		severityOfImpactEEnum = createEEnum(SEVERITY_OF_IMPACT);
		resolutionTimeEEnum = createEEnum(RESOLUTION_TIME);
		rootCauseEEnum = createEEnum(ROOT_CAUSE);
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
		PalladioElementTypePackage thePalladioElementTypePackage = (PalladioElementTypePackage)EPackage.Registry.INSTANCE.getEPackage(PalladioElementTypePackage.eNS_URI);
		AddPackage theAddPackage = (AddPackage)EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uncertaintyTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(uncertaintyTypeEClass, UncertaintyType.class, "UncertaintyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUncertaintyType_Name(), theEcorePackage.getEString(), "name", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyType_ImpactOn(), thePalladioElementTypePackage.getPalladioElementType(), null, "impactOn", null, 1, -1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyType_AssignableElementType(), thePalladioElementTypePackage.getPalladioElementType(), null, "assignableElementType", null, 1, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyType_ResolvedBy(), theAddPackage.getADD(), null, "resolvedBy", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_Location(), this.getLocation(), "location", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_InformationAvailability(), this.getInformationAvailability(), "informationAvailability", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_Nature(), this.getNature(), "nature", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_Manageability(), this.getManageability(), "manageability", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_ImpactOnConfidentiality(), this.getImpactOnConfidentiality(), "impactOnConfidentiality", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_SeverityOfImpact(), this.getSeverityOfImpact(), "severityOfImpact", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_ResolutionTime(), this.getResolutionTime(), "resolutionTime", null, 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertaintyType_RootCause(), this.getRootCause(), "rootCause", "ASSUMPTION", 0, 1, UncertaintyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncertaintyTypeContainerEClass, UncertaintyTypeContainer.class, "UncertaintyTypeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUncertaintyTypeContainer_UncertaintyTypes(), this.getUncertaintyType(), null, "uncertaintyTypes", null, 0, -1, UncertaintyTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(natureEEnum, Nature.class, "Nature");
		addEEnumLiteral(natureEEnum, Nature.ALEATORY);
		addEEnumLiteral(natureEEnum, Nature.EPISTEMIC);

		initEEnum(locationEEnum, Location.class, "Location");
		addEEnumLiteral(locationEEnum, Location.SYSTEM_STRUCTURE);
		addEEnumLiteral(locationEEnum, Location.SYSTEM_BEHAVIOUR);
		addEEnumLiteral(locationEEnum, Location.SYSTEM_ENVIRONMENT);
		addEEnumLiteral(locationEEnum, Location.INPUT);

		initEEnum(informationAvailabilityEEnum, InformationAvailability.class, "InformationAvailability");
		addEEnumLiteral(informationAvailabilityEEnum, InformationAvailability.STATISTICAL_UNCERTAINTY);
		addEEnumLiteral(informationAvailabilityEEnum, InformationAvailability.SCENARIO_UNCERTAINTY);
		addEEnumLiteral(informationAvailabilityEEnum, InformationAvailability.RECOGNIZED_IGNORANCE);

		initEEnum(manageabilityEEnum, Manageability.class, "Manageability");
		addEEnumLiteral(manageabilityEEnum, Manageability.FULLY_REDUCIBLE);
		addEEnumLiteral(manageabilityEEnum, Manageability.PARTIAL_REDUCIBLE);
		addEEnumLiteral(manageabilityEEnum, Manageability.IRREDUCIBLE);

		initEEnum(impactOnConfidentialityEEnum, ImpactOnConfidentiality.class, "ImpactOnConfidentiality");
		addEEnumLiteral(impactOnConfidentialityEEnum, ImpactOnConfidentiality.DIRECT);
		addEEnumLiteral(impactOnConfidentialityEEnum, ImpactOnConfidentiality.INDIRECT);
		addEEnumLiteral(impactOnConfidentialityEEnum, ImpactOnConfidentiality.NONE);

		initEEnum(severityOfImpactEEnum, SeverityOfImpact.class, "SeverityOfImpact");
		addEEnumLiteral(severityOfImpactEEnum, SeverityOfImpact.HIGH);
		addEEnumLiteral(severityOfImpactEEnum, SeverityOfImpact.LOW);
		addEEnumLiteral(severityOfImpactEEnum, SeverityOfImpact.NONE);

		initEEnum(resolutionTimeEEnum, ResolutionTime.class, "ResolutionTime");
		addEEnumLiteral(resolutionTimeEEnum, ResolutionTime.REQUIREMENTS_TIME);
		addEEnumLiteral(resolutionTimeEEnum, ResolutionTime.DESIGN_TIME);
		addEEnumLiteral(resolutionTimeEEnum, ResolutionTime.DEPLOYMENT_TIME);
		addEEnumLiteral(resolutionTimeEEnum, ResolutionTime.RUN_TIME);
		addEEnumLiteral(resolutionTimeEEnum, ResolutionTime.NEVER);

		initEEnum(rootCauseEEnum, RootCause.class, "RootCause");
		addEEnumLiteral(rootCauseEEnum, RootCause.ASSUMPTION);
		addEEnumLiteral(rootCauseEEnum, RootCause.MISSING_INFORMATION);

		// Create resource
		createResource(eNS_URI);
	}

} //UncertaintyTypePackageImpl
