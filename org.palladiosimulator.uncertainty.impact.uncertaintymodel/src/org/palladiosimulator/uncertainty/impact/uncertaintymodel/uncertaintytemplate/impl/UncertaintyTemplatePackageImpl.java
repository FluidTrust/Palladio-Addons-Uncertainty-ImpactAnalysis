/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplateFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyTemplatePackageImpl extends EPackageImpl implements UncertaintyTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyTemplateEClass = null;

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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UncertaintyTemplatePackageImpl() {
		super(eNS_URI, UncertaintyTemplateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UncertaintyTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UncertaintyTemplatePackage init() {
		if (isInited) return (UncertaintyTemplatePackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyTemplatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUncertaintyTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UncertaintyTemplatePackageImpl theUncertaintyTemplatePackage = registeredUncertaintyTemplatePackage instanceof UncertaintyTemplatePackageImpl ? (UncertaintyTemplatePackageImpl)registeredUncertaintyTemplatePackage : new UncertaintyTemplatePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);
		AddPackageImpl theAddPackage = (AddPackageImpl)(registeredPackage instanceof AddPackageImpl ? registeredPackage : AddPackage.eINSTANCE);

		// Create package meta-data objects
		theUncertaintyTemplatePackage.createPackageContents();
		theUncertaintyPackage.createPackageContents();
		theUncertaintyTypePackage.createPackageContents();
		theAddPackage.createPackageContents();

		// Initialize created meta-data
		theUncertaintyTemplatePackage.initializePackageContents();
		theUncertaintyPackage.initializePackageContents();
		theUncertaintyTypePackage.initializePackageContents();
		theAddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUncertaintyTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UncertaintyTemplatePackage.eNS_URI, theUncertaintyTemplatePackage);
		return theUncertaintyTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertaintyTemplate() {
		return uncertaintyTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyTemplate_AddContainer() {
		return (EReference)uncertaintyTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyTemplate_UncertaintyTypeContainer() {
		return (EReference)uncertaintyTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTemplateFactory getUncertaintyTemplateFactory() {
		return (UncertaintyTemplateFactory)getEFactoryInstance();
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
		uncertaintyTemplateEClass = createEClass(UNCERTAINTY_TEMPLATE);
		createEReference(uncertaintyTemplateEClass, UNCERTAINTY_TEMPLATE__ADD_CONTAINER);
		createEReference(uncertaintyTemplateEClass, UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER);
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
		AddPackage theAddPackage = (AddPackage)EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);
		UncertaintyTypePackage theUncertaintyTypePackage = (UncertaintyTypePackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(uncertaintyTemplateEClass, UncertaintyTemplate.class, "UncertaintyTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUncertaintyTemplate_AddContainer(), theAddPackage.getADDContainer(), null, "addContainer", null, 1, 1, UncertaintyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyTemplate_UncertaintyTypeContainer(), theUncertaintyTypePackage.getUncertaintyTypeContainer(), null, "uncertaintyTypeContainer", null, 1, 1, UncertaintyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UncertaintyTemplatePackageImpl
