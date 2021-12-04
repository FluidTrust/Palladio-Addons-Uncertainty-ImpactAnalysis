/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory
 * @model kind="package"
 * @generated
 */
public interface UncertaintyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uncertainty";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uncertainty";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uncertainty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyPackage eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.PalladioElementWrapperImpl <em>Palladio Element Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.PalladioElementWrapperImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getPalladioElementWrapper()
	 * @generated
	 */
	int PALLADIO_ELEMENT_WRAPPER = 0;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_WRAPPER__REFERENCED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Palladio Element Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_WRAPPER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Palladio Element Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PALLADIO_ELEMENT_WRAPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getUncertainty()
	 * @generated
	 */
	int UNCERTAINTY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__ASSIGNED_ELEMENT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uncertainty Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__UNCERTAINTY_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int UNCERTAINTY_OPERATION_COUNT =  0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getUncertaintyContainer()
	 * @generated
	 */
	int UNCERTAINTY_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Uncertainties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_CONTAINER__UNCERTAINTIES = 0;

	/**
	 * The feature id for the '<em><b>Uncertainty Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Basic Component Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS = 2;

	/**
	 * The feature id for the '<em><b>Component Interface Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES = 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.ComponentInterfaceInstanceImpl <em>Component Interface Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.ComponentInterfaceInstanceImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getComponentInterfaceInstance()
	 * @generated
	 */
	int COMPONENT_INTERFACE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE__INTERFACE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE_OPERATION_COUNT =  0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.BasicComponentBehaviourImpl <em>Basic Component Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.BasicComponentBehaviourImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getBasicComponentBehaviour()
	 * @generated
	 */
	int BASIC_COMPONENT_BEHAVIOUR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR__ID = EntityPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Resource Demanding SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Component Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Component Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR_OPERATION_COUNT =   0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper <em>Palladio Element Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Palladio Element Wrapper</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper
	 * @generated
	 */
	EClass getPalladioElementWrapper();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper#getReferencedElement()
	 * @see #getPalladioElementWrapper()
	 * @generated
	 */
	EReference getPalladioElementWrapper_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty
	 * @generated
	 */
	EClass getUncertainty();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getName()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getAssignedElement <em>Assigned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Element</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getAssignedElement()
	 * @see #getUncertainty()
	 * @generated
	 */
	EReference getUncertainty_AssignedElement();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getUncertaintyType <em>Uncertainty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uncertainty Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty#getUncertaintyType()
	 * @see #getUncertainty()
	 * @generated
	 */
	EReference getUncertainty_UncertaintyType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer
	 * @generated
	 */
	EClass getUncertaintyContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertainties <em>Uncertainties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uncertainties</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertainties()
	 * @see #getUncertaintyContainer()
	 * @generated
	 */
	EReference getUncertaintyContainer_Uncertainties();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertaintyTemplate <em>Uncertainty Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uncertainty Template</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getUncertaintyTemplate()
	 * @see #getUncertaintyContainer()
	 * @generated
	 */
	EReference getUncertaintyContainer_UncertaintyTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getBasicComponentBehaviours <em>Basic Component Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Component Behaviours</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getBasicComponentBehaviours()
	 * @see #getUncertaintyContainer()
	 * @generated
	 */
	EReference getUncertaintyContainer_BasicComponentBehaviours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getComponentInterfaceInstances <em>Component Interface Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Interface Instances</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer#getComponentInterfaceInstances()
	 * @see #getUncertaintyContainer()
	 * @generated
	 */
	EReference getUncertaintyContainer_ComponentInterfaceInstances();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance <em>Component Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface Instance</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance
	 * @generated
	 */
	EClass getComponentInterfaceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getAssemblyContext <em>Assembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assembly Context</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getAssemblyContext()
	 * @see #getComponentInterfaceInstance()
	 * @generated
	 */
	EReference getComponentInterfaceInstance_AssemblyContext();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getInterface()
	 * @see #getComponentInterfaceInstance()
	 * @generated
	 */
	EReference getComponentInterfaceInstance_Interface();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour <em>Basic Component Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component Behaviour</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour
	 * @generated
	 */
	EClass getBasicComponentBehaviour();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour#getResourceDemandingSEFF <em>Resource Demanding SEFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Demanding SEFF</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour#getResourceDemandingSEFF()
	 * @see #getBasicComponentBehaviour()
	 * @generated
	 */
	EReference getBasicComponentBehaviour_ResourceDemandingSEFF();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UncertaintyFactory getUncertaintyFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.PalladioElementWrapperImpl <em>Palladio Element Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.PalladioElementWrapperImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getPalladioElementWrapper()
		 * @generated
		 */
		EClass PALLADIO_ELEMENT_WRAPPER = eINSTANCE.getPalladioElementWrapper();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PALLADIO_ELEMENT_WRAPPER__REFERENCED_ELEMENT = eINSTANCE.getPalladioElementWrapper_ReferencedElement();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getUncertainty()
		 * @generated
		 */
		EClass UNCERTAINTY = eINSTANCE.getUncertainty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__NAME = eINSTANCE.getUncertainty_Name();

		/**
		 * The meta object literal for the '<em><b>Assigned Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY__ASSIGNED_ELEMENT = eINSTANCE.getUncertainty_AssignedElement();

		/**
		 * The meta object literal for the '<em><b>Uncertainty Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY__UNCERTAINTY_TYPE = eINSTANCE.getUncertainty_UncertaintyType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getUncertaintyContainer()
		 * @generated
		 */
		EClass UNCERTAINTY_CONTAINER = eINSTANCE.getUncertaintyContainer();

		/**
		 * The meta object literal for the '<em><b>Uncertainties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_CONTAINER__UNCERTAINTIES = eINSTANCE.getUncertaintyContainer_Uncertainties();

		/**
		 * The meta object literal for the '<em><b>Uncertainty Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE = eINSTANCE.getUncertaintyContainer_UncertaintyTemplate();

		/**
		 * The meta object literal for the '<em><b>Basic Component Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS = eINSTANCE.getUncertaintyContainer_BasicComponentBehaviours();

		/**
		 * The meta object literal for the '<em><b>Component Interface Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES = eINSTANCE.getUncertaintyContainer_ComponentInterfaceInstances();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.ComponentInterfaceInstanceImpl <em>Component Interface Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.ComponentInterfaceInstanceImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getComponentInterfaceInstance()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE_INSTANCE = eINSTANCE.getComponentInterfaceInstance();

		/**
		 * The meta object literal for the '<em><b>Assembly Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT = eINSTANCE.getComponentInterfaceInstance_AssemblyContext();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE_INSTANCE__INTERFACE = eINSTANCE.getComponentInterfaceInstance_Interface();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.BasicComponentBehaviourImpl <em>Basic Component Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.BasicComponentBehaviourImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyPackageImpl#getBasicComponentBehaviour()
		 * @generated
		 */
		EClass BASIC_COMPONENT_BEHAVIOUR = eINSTANCE.getBasicComponentBehaviour();

		/**
		 * The meta object literal for the '<em><b>Resource Demanding SEFF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF = eINSTANCE.getBasicComponentBehaviour_ResourceDemandingSEFF();

	}

} //UncertaintyPackage
