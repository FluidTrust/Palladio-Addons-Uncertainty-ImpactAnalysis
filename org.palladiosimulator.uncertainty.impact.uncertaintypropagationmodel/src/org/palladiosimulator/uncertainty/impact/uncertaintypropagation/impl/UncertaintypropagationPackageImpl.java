/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.system.SystemPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintypropagationPackageImpl extends EPackageImpl implements UncertaintypropagationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractUCImpactRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucPropagationRulesSeedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causingUncertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtBasicComponentBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtBasicComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtCommunicationComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtCommunicationResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtComponentInterfaceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtComponentInterfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtHardwareResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtSystemInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ucImpactAtUsageBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInterfaceInstanceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicComponentBehaviourContainerEClass = null;

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
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UncertaintypropagationPackageImpl() {
		super(eNS_URI, UncertaintypropagationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UncertaintypropagationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UncertaintypropagationPackage init() {
		if (isInited) return (UncertaintypropagationPackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintypropagationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUncertaintypropagationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UncertaintypropagationPackageImpl theUncertaintypropagationPackage = registeredUncertaintypropagationPackage instanceof UncertaintypropagationPackageImpl ? (UncertaintypropagationPackageImpl)registeredUncertaintypropagationPackage : new UncertaintypropagationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UncertaintyPackage.eINSTANCE.eClass();
		UncertaintyTypePackage.eINSTANCE.eClass();
		UncertaintyTemplatePackage.eINSTANCE.eClass();
		PalladioElementTypePackage.eINSTANCE.eClass();
		AddPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUncertaintypropagationPackage.createPackageContents();

		// Initialize created meta-data
		theUncertaintypropagationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUncertaintypropagationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UncertaintypropagationPackage.eNS_URI, theUncertaintypropagationPackage);
		return theUncertaintypropagationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractUCImpactRepository() {
		return abstractUCImpactRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactRepository() {
		return ucImpactRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCPropagationRulesSeed() {
		return ucPropagationRulesSeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedBasicComponentBehaviours() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedBasicComponentTypes() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedCommunicationComponents() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedCommunicationResources() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedComponentInstances() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedComponentInterfaceInstances() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedComponentInterfaceTypes() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedHardwareResources() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedSystems() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedSystemInterfaces() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_AffectedUsageBehaviours() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUCPropagationRulesSeed_CausingUncertainties() {
		return (EReference)ucPropagationRulesSeedEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactEntity() {
		return ucImpactEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCausingUncertainty() {
		return causingUncertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCausingUncertainty_CausingUncertainty() {
		return (EReference)causingUncertaintyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCausingUncertainty_Path() {
		return (EReference)causingUncertaintyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertaintyPropagation() {
		return uncertaintyPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedBasicComponentBehaviours() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedBasicComponentTypes() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedCommunicationComponents() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedCommunicationResources() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffecteComponentInstances() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedComponentInterfaceInstances() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedComponentInterfaceTypes() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedHardwareResources() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedSystems() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedSystemInterface() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_AffectedUsageBehaviours() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_CausingUncertainties() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_ComponentInterfaceInstanceContainer() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUncertaintyPropagation_BasicComponentBehaviourContainer() {
		return (EReference)uncertaintyPropagationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtBasicComponentBehaviour() {
		return ucImpactAtBasicComponentBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtBasicComponentType() {
		return ucImpactAtBasicComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtCommunicationComponents() {
		return ucImpactAtCommunicationComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtCommunicationResources() {
		return ucImpactAtCommunicationResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtComponentInstance() {
		return ucImpactAtComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtComponentInterfaceInstance() {
		return ucImpactAtComponentInterfaceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtComponentInterfaceType() {
		return ucImpactAtComponentInterfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtHardwareResource() {
		return ucImpactAtHardwareResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtSystem() {
		return ucImpactAtSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtSystemInterface() {
		return ucImpactAtSystemInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUCImpactAtUsageBehaviour() {
		return ucImpactAtUsageBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInterfaceInstanceContainer() {
		return componentInterfaceInstanceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInterfaceInstanceContainer_ComponentInterfaceInstances() {
		return (EReference)componentInterfaceInstanceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicComponentBehaviourContainer() {
		return basicComponentBehaviourContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicComponentBehaviourContainer_BasicComponentBehaviours() {
		return (EReference)basicComponentBehaviourContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintypropagationFactory getUncertaintypropagationFactory() {
		return (UncertaintypropagationFactory)getEFactoryInstance();
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
		abstractUCImpactRepositoryEClass = createEClass(ABSTRACT_UC_IMPACT_REPOSITORY);

		ucImpactRepositoryEClass = createEClass(UC_IMPACT_REPOSITORY);

		ucPropagationRulesSeedEClass = createEClass(UC_PROPAGATION_RULES_SEED);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS);
		createEReference(ucPropagationRulesSeedEClass, UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES);

		ucImpactEntityEClass = createEClass(UC_IMPACT_ENTITY);

		causingUncertaintyEClass = createEClass(CAUSING_UNCERTAINTY);
		createEReference(causingUncertaintyEClass, CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY);
		createEReference(causingUncertaintyEClass, CAUSING_UNCERTAINTY__PATH);

		uncertaintyPropagationEClass = createEClass(UNCERTAINTY_PROPAGATION);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER);
		createEReference(uncertaintyPropagationEClass, UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER);

		ucImpactAtBasicComponentBehaviourEClass = createEClass(UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR);

		ucImpactAtBasicComponentTypeEClass = createEClass(UC_IMPACT_AT_BASIC_COMPONENT_TYPE);

		ucImpactAtCommunicationComponentsEClass = createEClass(UC_IMPACT_AT_COMMUNICATION_COMPONENTS);

		ucImpactAtCommunicationResourcesEClass = createEClass(UC_IMPACT_AT_COMMUNICATION_RESOURCES);

		ucImpactAtComponentInstanceEClass = createEClass(UC_IMPACT_AT_COMPONENT_INSTANCE);

		ucImpactAtComponentInterfaceInstanceEClass = createEClass(UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE);

		ucImpactAtComponentInterfaceTypeEClass = createEClass(UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE);

		ucImpactAtHardwareResourceEClass = createEClass(UC_IMPACT_AT_HARDWARE_RESOURCE);

		ucImpactAtSystemEClass = createEClass(UC_IMPACT_AT_SYSTEM);

		ucImpactAtSystemInterfaceEClass = createEClass(UC_IMPACT_AT_SYSTEM_INTERFACE);

		ucImpactAtUsageBehaviourEClass = createEClass(UC_IMPACT_AT_USAGE_BEHAVIOUR);

		componentInterfaceInstanceContainerEClass = createEClass(COMPONENT_INTERFACE_INSTANCE_CONTAINER);
		createEReference(componentInterfaceInstanceContainerEClass, COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES);

		basicComponentBehaviourContainerEClass = createEClass(BASIC_COMPONENT_BEHAVIOUR_CONTAINER);
		createEReference(basicComponentBehaviourContainerEClass, BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS);
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
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		UncertaintyPackage theUncertaintyPackage = (UncertaintyPackage)EPackage.Registry.INSTANCE.getEPackage(UncertaintyPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractUCImpactRepositoryEClass_S = addETypeParameter(abstractUCImpactRepositoryEClass, "S");
		ETypeParameter ucImpactEntityEClass_T = addETypeParameter(ucImpactEntityEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getUCPropagationRulesSeed());
		abstractUCImpactRepositoryEClass_S.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntity());
		ucImpactEntityEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractUCImpactRepositoryEClass_S);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractUCImpactRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractUCImpactRepository());
		g2 = createEGenericType(this.getUCPropagationRulesSeed());
		g1.getETypeArguments().add(g2);
		ucImpactRepositoryEClass.getEGenericSuperTypes().add(g1);
		ucPropagationRulesSeedEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(ucImpactEntityEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCausingUncertainty());
		g1.getETypeArguments().add(g2);
		ucImpactEntityEClass.getEGenericSuperTypes().add(g1);
		causingUncertaintyEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		uncertaintyPropagationEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theUncertaintyPackage.getBasicComponentBehaviour());
		g1.getETypeArguments().add(g2);
		ucImpactAtBasicComponentBehaviourEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theRepositoryPackage.getBasicComponent());
		g1.getETypeArguments().add(g2);
		ucImpactAtBasicComponentTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theCompositionPackage.getAssemblyConnector());
		g1.getETypeArguments().add(g2);
		ucImpactAtCommunicationComponentsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theResourceenvironmentPackage.getLinkingResource());
		g1.getETypeArguments().add(g2);
		ucImpactAtCommunicationResourcesEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theCompositionPackage.getAssemblyContext());
		g1.getETypeArguments().add(g2);
		ucImpactAtComponentInstanceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theUncertaintyPackage.getComponentInterfaceInstance());
		g1.getETypeArguments().add(g2);
		ucImpactAtComponentInterfaceInstanceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theRepositoryPackage.getRole());
		g1.getETypeArguments().add(g2);
		ucImpactAtComponentInterfaceTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theResourceenvironmentPackage.getResourceContainer());
		g1.getETypeArguments().add(g2);
		ucImpactAtHardwareResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theSystemPackage.getSystem());
		g1.getETypeArguments().add(g2);
		ucImpactAtSystemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theRepositoryPackage.getRole());
		g1.getETypeArguments().add(g2);
		ucImpactAtSystemInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUCImpactEntity());
		g2 = createEGenericType(theUsagemodelPackage.getEntryLevelSystemCall());
		g1.getETypeArguments().add(g2);
		ucImpactAtUsageBehaviourEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractUCImpactRepositoryEClass, AbstractUCImpactRepository.class, "AbstractUCImpactRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactRepositoryEClass, UCImpactRepository.class, "UCImpactRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucPropagationRulesSeedEClass, UCPropagationRulesSeed.class, "UCPropagationRulesSeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUCPropagationRulesSeed_AffectedBasicComponentBehaviours(), this.getUCImpactAtBasicComponentBehaviour(), null, "affectedBasicComponentBehaviours", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedBasicComponentTypes(), this.getUCImpactAtBasicComponentType(), null, "affectedBasicComponentTypes", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedCommunicationComponents(), this.getUCImpactAtCommunicationComponents(), null, "affectedCommunicationComponents", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedCommunicationResources(), this.getUCImpactAtCommunicationResources(), null, "affectedCommunicationResources", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedComponentInstances(), this.getUCImpactAtComponentInstance(), null, "affectedComponentInstances", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedComponentInterfaceInstances(), this.getUCImpactAtComponentInterfaceInstance(), null, "affectedComponentInterfaceInstances", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedComponentInterfaceTypes(), this.getUCImpactAtComponentInterfaceType(), null, "affectedComponentInterfaceTypes", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedHardwareResources(), this.getUCImpactAtHardwareResource(), null, "affectedHardwareResources", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedSystems(), this.getUCImpactAtSystem(), null, "affectedSystems", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedSystemInterfaces(), this.getUCImpactAtSystemInterface(), null, "affectedSystemInterfaces", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_AffectedUsageBehaviours(), this.getUCImpactAtUsageBehaviour(), null, "affectedUsageBehaviours", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUCPropagationRulesSeed_CausingUncertainties(), this.getCausingUncertainty(), null, "causingUncertainties", null, 0, -1, UCPropagationRulesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucImpactEntityEClass, UCImpactEntity.class, "UCImpactEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(causingUncertaintyEClass, CausingUncertainty.class, "CausingUncertainty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCausingUncertainty_CausingUncertainty(), theUncertaintyPackage.getUncertainty(), null, "causingUncertainty", null, 1, 1, CausingUncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCausingUncertainty_Path(), theEntityPackage.getEntity(), null, "path", null, 1, -1, CausingUncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncertaintyPropagationEClass, UncertaintyPropagation.class, "UncertaintyPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUncertaintyPropagation_AffectedBasicComponentBehaviours(), this.getUCImpactAtBasicComponentBehaviour(), null, "affectedBasicComponentBehaviours", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedBasicComponentTypes(), this.getUCImpactAtBasicComponentType(), null, "affectedBasicComponentTypes", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedCommunicationComponents(), this.getUCImpactAtCommunicationComponents(), null, "affectedCommunicationComponents", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedCommunicationResources(), this.getUCImpactAtCommunicationResources(), null, "affectedCommunicationResources", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffecteComponentInstances(), this.getUCImpactAtComponentInstance(), null, "affecteComponentInstances", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedComponentInterfaceInstances(), this.getUCImpactAtComponentInterfaceInstance(), null, "affectedComponentInterfaceInstances", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedComponentInterfaceTypes(), this.getUCImpactAtComponentInterfaceType(), null, "affectedComponentInterfaceTypes", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedHardwareResources(), this.getUCImpactAtHardwareResource(), null, "affectedHardwareResources", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedSystems(), this.getUCImpactAtSystem(), null, "affectedSystems", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedSystemInterface(), this.getUCImpactAtSystemInterface(), null, "affectedSystemInterface", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_AffectedUsageBehaviours(), this.getUCImpactAtUsageBehaviour(), null, "affectedUsageBehaviours", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_CausingUncertainties(), this.getCausingUncertainty(), null, "causingUncertainties", null, 0, -1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_ComponentInterfaceInstanceContainer(), this.getComponentInterfaceInstanceContainer(), null, "componentInterfaceInstanceContainer", null, 1, 1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUncertaintyPropagation_BasicComponentBehaviourContainer(), this.getBasicComponentBehaviourContainer(), null, "basicComponentBehaviourContainer", null, 1, 1, UncertaintyPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ucImpactAtBasicComponentBehaviourEClass, UCImpactAtBasicComponentBehaviour.class, "UCImpactAtBasicComponentBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtBasicComponentTypeEClass, UCImpactAtBasicComponentType.class, "UCImpactAtBasicComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtCommunicationComponentsEClass, UCImpactAtCommunicationComponents.class, "UCImpactAtCommunicationComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtCommunicationResourcesEClass, UCImpactAtCommunicationResources.class, "UCImpactAtCommunicationResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtComponentInstanceEClass, UCImpactAtComponentInstance.class, "UCImpactAtComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtComponentInterfaceInstanceEClass, UCImpactAtComponentInterfaceInstance.class, "UCImpactAtComponentInterfaceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtComponentInterfaceTypeEClass, UCImpactAtComponentInterfaceType.class, "UCImpactAtComponentInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtHardwareResourceEClass, UCImpactAtHardwareResource.class, "UCImpactAtHardwareResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtSystemEClass, UCImpactAtSystem.class, "UCImpactAtSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtSystemInterfaceEClass, UCImpactAtSystemInterface.class, "UCImpactAtSystemInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ucImpactAtUsageBehaviourEClass, UCImpactAtUsageBehaviour.class, "UCImpactAtUsageBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInterfaceInstanceContainerEClass, ComponentInterfaceInstanceContainer.class, "ComponentInterfaceInstanceContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInterfaceInstanceContainer_ComponentInterfaceInstances(), theUncertaintyPackage.getComponentInterfaceInstance(), null, "componentInterfaceInstances", null, 0, -1, ComponentInterfaceInstanceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicComponentBehaviourContainerEClass, BasicComponentBehaviourContainer.class, "BasicComponentBehaviourContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicComponentBehaviourContainer_BasicComponentBehaviours(), theUncertaintyPackage.getBasicComponentBehaviour(), null, "basicComponentBehaviours", null, 0, -1, BasicComponentBehaviourContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UncertaintypropagationPackageImpl
