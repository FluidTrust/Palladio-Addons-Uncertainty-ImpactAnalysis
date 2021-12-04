/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.seff.SeffPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.AddPackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypePackageImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

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
public class UncertaintyPackageImpl extends EPackageImpl implements UncertaintyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass palladioElementWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInterfaceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicComponentBehaviourEClass = null;

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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UncertaintyPackageImpl() {
		super(eNS_URI, UncertaintyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UncertaintyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UncertaintyPackage init() {
		if (isInited) return (UncertaintyPackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUncertaintyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UncertaintyPackageImpl theUncertaintyPackage = registeredUncertaintyPackage instanceof UncertaintyPackageImpl ? (UncertaintyPackageImpl)registeredUncertaintyPackage : new UncertaintyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UncertaintyTypePackage.eNS_URI);
		UncertaintyTypePackageImpl theUncertaintyTypePackage = (UncertaintyTypePackageImpl)(registeredPackage instanceof UncertaintyTypePackageImpl ? registeredPackage : UncertaintyTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UncertaintyTemplatePackage.eNS_URI);
		UncertaintyTemplatePackageImpl theUncertaintyTemplatePackage = (UncertaintyTemplatePackageImpl)(registeredPackage instanceof UncertaintyTemplatePackageImpl ? registeredPackage : UncertaintyTemplatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PalladioElementTypePackage.eNS_URI);
		PalladioElementTypePackageImpl thePalladioElementTypePackage = (PalladioElementTypePackageImpl)(registeredPackage instanceof PalladioElementTypePackageImpl ? registeredPackage : PalladioElementTypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);
		AddPackageImpl theAddPackage = (AddPackageImpl)(registeredPackage instanceof AddPackageImpl ? registeredPackage : AddPackage.eINSTANCE);

		// Create package meta-data objects
		theUncertaintyPackage.createPackageContents();
		theUncertaintyTypePackage.createPackageContents();
		theUncertaintyTemplatePackage.createPackageContents();
		thePalladioElementTypePackage.createPackageContents();
		theAddPackage.createPackageContents();

		// Initialize created meta-data
		theUncertaintyPackage.initializePackageContents();
		theUncertaintyTypePackage.initializePackageContents();
		theUncertaintyTemplatePackage.initializePackageContents();
		thePalladioElementTypePackage.initializePackageContents();
		theAddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUncertaintyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UncertaintyPackage.eNS_URI, theUncertaintyPackage);
		return theUncertaintyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalladioElementWrapper() {
		return palladioElementWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalladioElementWrapper_ReferencedElement() {
		return (EReference)palladioElementWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertainty() {
		return uncertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_Name() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertainty_AssignedElement() {
		return (EReference)uncertaintyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertainty_UncertaintyType() {
		return (EReference)uncertaintyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertaintyContainer() {
		return uncertaintyContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyContainer_Uncertainties() {
		return (EReference)uncertaintyContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyContainer_UncertaintyTemplate() {
		return (EReference)uncertaintyContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyContainer_BasicComponentBehaviours() {
		return (EReference)uncertaintyContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyContainer_ComponentInterfaceInstances() {
		return (EReference)uncertaintyContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInterfaceInstance() {
		return componentInterfaceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterfaceInstance_AssemblyContext() {
		return (EReference)componentInterfaceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterfaceInstance_Interface() {
		return (EReference)componentInterfaceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicComponentBehaviour() {
		return basicComponentBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicComponentBehaviour_ResourceDemandingSEFF() {
		return (EReference)basicComponentBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFactory getUncertaintyFactory() {
		return (UncertaintyFactory)getEFactoryInstance();
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
		palladioElementWrapperEClass = createEClass(PALLADIO_ELEMENT_WRAPPER);
		createEReference(palladioElementWrapperEClass, PALLADIO_ELEMENT_WRAPPER__REFERENCED_ELEMENT);

		uncertaintyEClass = createEClass(UNCERTAINTY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__NAME);
		createEReference(uncertaintyEClass, UNCERTAINTY__ASSIGNED_ELEMENT);
		createEReference(uncertaintyEClass, UNCERTAINTY__UNCERTAINTY_TYPE);

		uncertaintyContainerEClass = createEClass(UNCERTAINTY_CONTAINER);
		createEReference(uncertaintyContainerEClass, UNCERTAINTY_CONTAINER__UNCERTAINTIES);
		createEReference(uncertaintyContainerEClass, UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE);
		createEReference(uncertaintyContainerEClass, UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS);
		createEReference(uncertaintyContainerEClass, UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES);

		componentInterfaceInstanceEClass = createEClass(COMPONENT_INTERFACE_INSTANCE);
		createEReference(componentInterfaceInstanceEClass, COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT);
		createEReference(componentInterfaceInstanceEClass, COMPONENT_INTERFACE_INSTANCE__INTERFACE);

		basicComponentBehaviourEClass = createEClass(BASIC_COMPONENT_BEHAVIOUR);
		createEReference(basicComponentBehaviourEClass, BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF);
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
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		UncertaintyTypePackage theUncertaintyTypePackage = (UncertaintyTypePackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyTypePackage.eNS_URI);
		UncertaintyTemplatePackage theUncertaintyTemplatePackage = (UncertaintyTemplatePackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyTemplatePackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uncertaintyEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		componentInterfaceInstanceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		basicComponentBehaviourEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(palladioElementWrapperEClass, PalladioElementWrapper.class, "PalladioElementWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPalladioElementWrapper_ReferencedElement(), theEntityPackage.getEntity(), null, "referencedElement", null, 1, 1, PalladioElementWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncertaintyEClass, Uncertainty.class, "Uncertainty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUncertainty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertainty_AssignedElement(), this.getPalladioElementWrapper(), null, "assignedElement", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertainty_UncertaintyType(), theUncertaintyTypePackage.getUncertaintyType(), null, "uncertaintyType", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncertaintyContainerEClass, UncertaintyContainer.class, "UncertaintyContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUncertaintyContainer_Uncertainties(), this.getUncertainty(), null, "uncertainties", null, 0, -1, UncertaintyContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyContainer_UncertaintyTemplate(), theUncertaintyTemplatePackage.getUncertaintyTemplate(), null, "uncertaintyTemplate", null, 1, 1, UncertaintyContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyContainer_BasicComponentBehaviours(), this.getBasicComponentBehaviour(), null, "basicComponentBehaviours", null, 0, -1, UncertaintyContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyContainer_ComponentInterfaceInstances(), this.getComponentInterfaceInstance(), null, "componentInterfaceInstances", null, 0, -1, UncertaintyContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInterfaceInstanceEClass, ComponentInterfaceInstance.class, "ComponentInterfaceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInterfaceInstance_AssemblyContext(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext", null, 1, 1, ComponentInterfaceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInterfaceInstance_Interface(), theRepositoryPackage.getRole(), null, "interface", null, 1, 1, ComponentInterfaceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicComponentBehaviourEClass, BasicComponentBehaviour.class, "BasicComponentBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicComponentBehaviour_ResourceDemandingSEFF(), theSeffPackage.getResourceDemandingSEFF(), null, "resourceDemandingSEFF", null, 1, 1, BasicComponentBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UncertaintyPackageImpl
