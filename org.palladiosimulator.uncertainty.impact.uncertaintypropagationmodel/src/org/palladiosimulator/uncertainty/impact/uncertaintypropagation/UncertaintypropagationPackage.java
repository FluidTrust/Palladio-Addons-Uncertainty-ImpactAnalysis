/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

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
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory
 * @model kind="package"
 * @generated
 */
public interface UncertaintypropagationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uncertaintypropagation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uncertaintyPropagation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uncertaintypropagation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintypropagationPackage eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.AbstractUCImpactRepositoryImpl <em>Abstract UC Impact Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.AbstractUCImpactRepositoryImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getAbstractUCImpactRepository()
	 * @generated
	 */
	int ABSTRACT_UC_IMPACT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UC_IMPACT_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UC_IMPACT_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract UC Impact Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UC_IMPACT_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract UC Impact Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UC_IMPACT_REPOSITORY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactRepositoryImpl <em>UC Impact Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactRepositoryImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactRepository()
	 * @generated
	 */
	int UC_IMPACT_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_UC_IMPACT_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_UC_IMPACT_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>UC Impact Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_REPOSITORY_FEATURE_COUNT = ABSTRACT_UC_IMPACT_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_REPOSITORY_OPERATION_COUNT = ABSTRACT_UC_IMPACT_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl <em>UC Propagation Rules Seed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCPropagationRulesSeed()
	 * @generated
	 */
	int UC_PROPAGATION_RULES_SEED = 2;

	/**
	 * The feature id for the '<em><b>Affected Basic Component Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Basic Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Affected Communication Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Affected Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affected Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Affected Component Interface Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Affected Component Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Affected Hardware Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Affected Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Affected System Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Affected Usage Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Causing Uncertainties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>UC Propagation Rules Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>UC Propagation Rules Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_PROPAGATION_RULES_SEED_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactEntityImpl <em>UC Impact Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactEntityImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactEntity()
	 * @generated
	 */
	int UC_IMPACT_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_ENTITY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.CausingUncertaintyImpl <em>Causing Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.CausingUncertaintyImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getCausingUncertainty()
	 * @generated
	 */
	int CAUSING_UNCERTAINTY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSING_UNCERTAINTY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Causing Uncertainty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSING_UNCERTAINTY__PATH = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Causing Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSING_UNCERTAINTY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Causing Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int CAUSING_UNCERTAINTY_OPERATION_COUNT =  0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl <em>Uncertainty Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUncertaintyPropagation()
	 * @generated
	 */
	int UNCERTAINTY_PROPAGATION = 5;

	/**
	 * The feature id for the '<em><b>Affected Basic Component Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affected Basic Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Affected Communication Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Affected Communication Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affecte Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Affected Component Interface Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Affected Component Interface Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Affected Hardware Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Affected Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Affected System Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Affected Usage Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Causing Uncertainties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Component Interface Instance Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Basic Component Behaviour Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Uncertainty Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Uncertainty Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_PROPAGATION_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentBehaviourImpl <em>UC Impact At Basic Component Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentBehaviourImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtBasicComponentBehaviour()
	 * @generated
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Basic Component Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Basic Component Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentTypeImpl <em>UC Impact At Basic Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentTypeImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtBasicComponentType()
	 * @generated
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Basic Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Basic Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_BASIC_COMPONENT_TYPE_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationComponentsImpl <em>UC Impact At Communication Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationComponentsImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtCommunicationComponents()
	 * @generated
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Communication Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Communication Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_COMPONENTS_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationResourcesImpl <em>UC Impact At Communication Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationResourcesImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtCommunicationResources()
	 * @generated
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Communication Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Communication Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMMUNICATION_RESOURCES_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInstanceImpl <em>UC Impact At Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInstanceImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtComponentInstance()
	 * @generated
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INSTANCE_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceInstanceImpl <em>UC Impact At Component Interface Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceInstanceImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtComponentInterfaceInstance()
	 * @generated
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Component Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Component Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceTypeImpl <em>UC Impact At Component Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceTypeImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtComponentInterfaceType()
	 * @generated
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Component Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Component Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtHardwareResourceImpl <em>UC Impact At Hardware Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtHardwareResourceImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtHardwareResource()
	 * @generated
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Hardware Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Hardware Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_HARDWARE_RESOURCE_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemImpl <em>UC Impact At System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtSystem()
	 * @generated
	 */
	int UC_IMPACT_AT_SYSTEM = 14;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemInterfaceImpl <em>UC Impact At System Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemInterfaceImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtSystemInterface()
	 * @generated
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At System Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At System Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_SYSTEM_INTERFACE_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtUsageBehaviourImpl <em>UC Impact At Usage Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtUsageBehaviourImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtUsageBehaviour()
	 * @generated
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR = 16;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR__AFFECTED_ELEMENT = UC_IMPACT_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR__CAUSING_ELEMENTS = UC_IMPACT_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR__ID = UC_IMPACT_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR__TOOLDERIVED = UC_IMPACT_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR__USER_DECISION = UC_IMPACT_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>UC Impact At Usage Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR_FEATURE_COUNT = UC_IMPACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UC Impact At Usage Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UC_IMPACT_AT_USAGE_BEHAVIOUR_OPERATION_COUNT = UC_IMPACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.ComponentInterfaceInstanceContainerImpl <em>Component Interface Instance Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.ComponentInterfaceInstanceContainerImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getComponentInterfaceInstanceContainer()
	 * @generated
	 */
	int COMPONENT_INTERFACE_INSTANCE_CONTAINER = 17;

	/**
	 * The feature id for the '<em><b>Component Interface Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Component Interface Instance Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Interface Instance Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_INSTANCE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.BasicComponentBehaviourContainerImpl <em>Basic Component Behaviour Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.BasicComponentBehaviourContainerImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getBasicComponentBehaviourContainer()
	 * @generated
	 */
	int BASIC_COMPONENT_BEHAVIOUR_CONTAINER = 18;

	/**
	 * The feature id for the '<em><b>Basic Component Behaviours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS = 0;

	/**
	 * The number of structural features of the '<em>Basic Component Behaviour Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Basic Component Behaviour Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_COMPONENT_BEHAVIOUR_CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository <em>Abstract UC Impact Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract UC Impact Repository</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.AbstractUCImpactRepository
	 * @generated
	 */
	EClass getAbstractUCImpactRepository();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository <em>UC Impact Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact Repository</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository
	 * @generated
	 */
	EClass getUCImpactRepository();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed <em>UC Propagation Rules Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Propagation Rules Seed</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed
	 * @generated
	 */
	EClass getUCPropagationRulesSeed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedBasicComponentBehaviours <em>Affected Basic Component Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Basic Component Behaviours</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedBasicComponentBehaviours()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedBasicComponentBehaviours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedBasicComponentTypes <em>Affected Basic Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Basic Component Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedBasicComponentTypes()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedBasicComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedCommunicationComponents <em>Affected Communication Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Communication Components</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedCommunicationComponents()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedCommunicationComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedCommunicationResources <em>Affected Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Communication Resources</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedCommunicationResources()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedCommunicationResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInstances <em>Affected Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Component Instances</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInstances()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInterfaceInstances <em>Affected Component Interface Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Component Interface Instances</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInterfaceInstances()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedComponentInterfaceInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInterfaceTypes <em>Affected Component Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Component Interface Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedComponentInterfaceTypes()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedComponentInterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedHardwareResources <em>Affected Hardware Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Hardware Resources</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedHardwareResources()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedHardwareResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedSystems <em>Affected Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Systems</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedSystems()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedSystems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedSystemInterfaces <em>Affected System Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected System Interfaces</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedSystemInterfaces()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedSystemInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedUsageBehaviours <em>Affected Usage Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Usage Behaviours</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getAffectedUsageBehaviours()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_AffectedUsageBehaviours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getCausingUncertainties <em>Causing Uncertainties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causing Uncertainties</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed#getCausingUncertainties()
	 * @see #getUCPropagationRulesSeed()
	 * @generated
	 */
	EReference getUCPropagationRulesSeed_CausingUncertainties();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity <em>UC Impact Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact Entity</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactEntity
	 * @generated
	 */
	EClass getUCImpactEntity();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty <em>Causing Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Causing Uncertainty</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty
	 * @generated
	 */
	EClass getCausingUncertainty();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getCausingUncertainty <em>Causing Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Causing Uncertainty</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getCausingUncertainty()
	 * @see #getCausingUncertainty()
	 * @generated
	 */
	EReference getCausingUncertainty_CausingUncertainty();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Path</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getPath()
	 * @see #getCausingUncertainty()
	 * @generated
	 */
	EReference getCausingUncertainty_Path();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation <em>Uncertainty Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty Propagation</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation
	 * @generated
	 */
	EClass getUncertaintyPropagation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedBasicComponentBehaviours <em>Affected Basic Component Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Basic Component Behaviours</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedBasicComponentBehaviours()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedBasicComponentBehaviours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedBasicComponentTypes <em>Affected Basic Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Basic Component Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedBasicComponentTypes()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedBasicComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedCommunicationComponents <em>Affected Communication Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Communication Components</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedCommunicationComponents()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedCommunicationComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedCommunicationResources <em>Affected Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Communication Resources</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedCommunicationResources()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedCommunicationResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffecteComponentInstances <em>Affecte Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affecte Component Instances</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffecteComponentInstances()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffecteComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedComponentInterfaceInstances <em>Affected Component Interface Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Component Interface Instances</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedComponentInterfaceInstances()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedComponentInterfaceInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedComponentInterfaceTypes <em>Affected Component Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Component Interface Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedComponentInterfaceTypes()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedComponentInterfaceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedHardwareResources <em>Affected Hardware Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Hardware Resources</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedHardwareResources()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedHardwareResources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedSystems <em>Affected Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Systems</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedSystems()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedSystems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedSystemInterface <em>Affected System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected System Interface</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedSystemInterface()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedSystemInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedUsageBehaviours <em>Affected Usage Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affected Usage Behaviours</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getAffectedUsageBehaviours()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_AffectedUsageBehaviours();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getCausingUncertainties <em>Causing Uncertainties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Causing Uncertainties</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getCausingUncertainties()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_CausingUncertainties();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getComponentInterfaceInstanceContainer <em>Component Interface Instance Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Interface Instance Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getComponentInterfaceInstanceContainer()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_ComponentInterfaceInstanceContainer();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getBasicComponentBehaviourContainer <em>Basic Component Behaviour Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Component Behaviour Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation#getBasicComponentBehaviourContainer()
	 * @see #getUncertaintyPropagation()
	 * @generated
	 */
	EReference getUncertaintyPropagation_BasicComponentBehaviourContainer();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour <em>UC Impact At Basic Component Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Basic Component Behaviour</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour
	 * @generated
	 */
	EClass getUCImpactAtBasicComponentBehaviour();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType <em>UC Impact At Basic Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Basic Component Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType
	 * @generated
	 */
	EClass getUCImpactAtBasicComponentType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents <em>UC Impact At Communication Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Communication Components</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents
	 * @generated
	 */
	EClass getUCImpactAtCommunicationComponents();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources <em>UC Impact At Communication Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Communication Resources</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources
	 * @generated
	 */
	EClass getUCImpactAtCommunicationResources();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance <em>UC Impact At Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Component Instance</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance
	 * @generated
	 */
	EClass getUCImpactAtComponentInstance();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance <em>UC Impact At Component Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Component Interface Instance</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance
	 * @generated
	 */
	EClass getUCImpactAtComponentInterfaceInstance();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType <em>UC Impact At Component Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Component Interface Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType
	 * @generated
	 */
	EClass getUCImpactAtComponentInterfaceType();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource <em>UC Impact At Hardware Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Hardware Resource</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource
	 * @generated
	 */
	EClass getUCImpactAtHardwareResource();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem <em>UC Impact At System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At System</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem
	 * @generated
	 */
	EClass getUCImpactAtSystem();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface <em>UC Impact At System Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At System Interface</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface
	 * @generated
	 */
	EClass getUCImpactAtSystemInterface();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour <em>UC Impact At Usage Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UC Impact At Usage Behaviour</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour
	 * @generated
	 */
	EClass getUCImpactAtUsageBehaviour();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer <em>Component Interface Instance Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface Instance Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer
	 * @generated
	 */
	EClass getComponentInterfaceInstanceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer#getComponentInterfaceInstances <em>Component Interface Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Interface Instances</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer#getComponentInterfaceInstances()
	 * @see #getComponentInterfaceInstanceContainer()
	 * @generated
	 */
	EReference getComponentInterfaceInstanceContainer_ComponentInterfaceInstances();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer <em>Basic Component Behaviour Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Component Behaviour Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer
	 * @generated
	 */
	EClass getBasicComponentBehaviourContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer#getBasicComponentBehaviours <em>Basic Component Behaviours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Component Behaviours</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer#getBasicComponentBehaviours()
	 * @see #getBasicComponentBehaviourContainer()
	 * @generated
	 */
	EReference getBasicComponentBehaviourContainer_BasicComponentBehaviours();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UncertaintypropagationFactory getUncertaintypropagationFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.AbstractUCImpactRepositoryImpl <em>Abstract UC Impact Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.AbstractUCImpactRepositoryImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getAbstractUCImpactRepository()
		 * @generated
		 */
		EClass ABSTRACT_UC_IMPACT_REPOSITORY = eINSTANCE.getAbstractUCImpactRepository();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactRepositoryImpl <em>UC Impact Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactRepositoryImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactRepository()
		 * @generated
		 */
		EClass UC_IMPACT_REPOSITORY = eINSTANCE.getUCImpactRepository();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl <em>UC Propagation Rules Seed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCPropagationRulesSeed()
		 * @generated
		 */
		EClass UC_PROPAGATION_RULES_SEED = eINSTANCE.getUCPropagationRulesSeed();

		/**
		 * The meta object literal for the '<em><b>Affected Basic Component Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS = eINSTANCE.getUCPropagationRulesSeed_AffectedBasicComponentBehaviours();

		/**
		 * The meta object literal for the '<em><b>Affected Basic Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES = eINSTANCE.getUCPropagationRulesSeed_AffectedBasicComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Affected Communication Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS = eINSTANCE.getUCPropagationRulesSeed_AffectedCommunicationComponents();

		/**
		 * The meta object literal for the '<em><b>Affected Communication Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES = eINSTANCE.getUCPropagationRulesSeed_AffectedCommunicationResources();

		/**
		 * The meta object literal for the '<em><b>Affected Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES = eINSTANCE.getUCPropagationRulesSeed_AffectedComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Affected Component Interface Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES = eINSTANCE.getUCPropagationRulesSeed_AffectedComponentInterfaceInstances();

		/**
		 * The meta object literal for the '<em><b>Affected Component Interface Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES = eINSTANCE.getUCPropagationRulesSeed_AffectedComponentInterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Affected Hardware Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES = eINSTANCE.getUCPropagationRulesSeed_AffectedHardwareResources();

		/**
		 * The meta object literal for the '<em><b>Affected Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS = eINSTANCE.getUCPropagationRulesSeed_AffectedSystems();

		/**
		 * The meta object literal for the '<em><b>Affected System Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES = eINSTANCE.getUCPropagationRulesSeed_AffectedSystemInterfaces();

		/**
		 * The meta object literal for the '<em><b>Affected Usage Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS = eINSTANCE.getUCPropagationRulesSeed_AffectedUsageBehaviours();

		/**
		 * The meta object literal for the '<em><b>Causing Uncertainties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES = eINSTANCE.getUCPropagationRulesSeed_CausingUncertainties();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactEntityImpl <em>UC Impact Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactEntityImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactEntity()
		 * @generated
		 */
		EClass UC_IMPACT_ENTITY = eINSTANCE.getUCImpactEntity();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.CausingUncertaintyImpl <em>Causing Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.CausingUncertaintyImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getCausingUncertainty()
		 * @generated
		 */
		EClass CAUSING_UNCERTAINTY = eINSTANCE.getCausingUncertainty();

		/**
		 * The meta object literal for the '<em><b>Causing Uncertainty</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY = eINSTANCE.getCausingUncertainty_CausingUncertainty();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAUSING_UNCERTAINTY__PATH = eINSTANCE.getCausingUncertainty_Path();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl <em>Uncertainty Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUncertaintyPropagation()
		 * @generated
		 */
		EClass UNCERTAINTY_PROPAGATION = eINSTANCE.getUncertaintyPropagation();

		/**
		 * The meta object literal for the '<em><b>Affected Basic Component Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS = eINSTANCE.getUncertaintyPropagation_AffectedBasicComponentBehaviours();

		/**
		 * The meta object literal for the '<em><b>Affected Basic Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES = eINSTANCE.getUncertaintyPropagation_AffectedBasicComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Affected Communication Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS = eINSTANCE.getUncertaintyPropagation_AffectedCommunicationComponents();

		/**
		 * The meta object literal for the '<em><b>Affected Communication Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES = eINSTANCE.getUncertaintyPropagation_AffectedCommunicationResources();

		/**
		 * The meta object literal for the '<em><b>Affecte Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES = eINSTANCE.getUncertaintyPropagation_AffecteComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Affected Component Interface Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES = eINSTANCE.getUncertaintyPropagation_AffectedComponentInterfaceInstances();

		/**
		 * The meta object literal for the '<em><b>Affected Component Interface Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES = eINSTANCE.getUncertaintyPropagation_AffectedComponentInterfaceTypes();

		/**
		 * The meta object literal for the '<em><b>Affected Hardware Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES = eINSTANCE.getUncertaintyPropagation_AffectedHardwareResources();

		/**
		 * The meta object literal for the '<em><b>Affected Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS = eINSTANCE.getUncertaintyPropagation_AffectedSystems();

		/**
		 * The meta object literal for the '<em><b>Affected System Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE = eINSTANCE.getUncertaintyPropagation_AffectedSystemInterface();

		/**
		 * The meta object literal for the '<em><b>Affected Usage Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS = eINSTANCE.getUncertaintyPropagation_AffectedUsageBehaviours();

		/**
		 * The meta object literal for the '<em><b>Causing Uncertainties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES = eINSTANCE.getUncertaintyPropagation_CausingUncertainties();

		/**
		 * The meta object literal for the '<em><b>Component Interface Instance Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER = eINSTANCE.getUncertaintyPropagation_ComponentInterfaceInstanceContainer();

		/**
		 * The meta object literal for the '<em><b>Basic Component Behaviour Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER = eINSTANCE.getUncertaintyPropagation_BasicComponentBehaviourContainer();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentBehaviourImpl <em>UC Impact At Basic Component Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentBehaviourImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtBasicComponentBehaviour()
		 * @generated
		 */
		EClass UC_IMPACT_AT_BASIC_COMPONENT_BEHAVIOUR = eINSTANCE.getUCImpactAtBasicComponentBehaviour();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentTypeImpl <em>UC Impact At Basic Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtBasicComponentTypeImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtBasicComponentType()
		 * @generated
		 */
		EClass UC_IMPACT_AT_BASIC_COMPONENT_TYPE = eINSTANCE.getUCImpactAtBasicComponentType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationComponentsImpl <em>UC Impact At Communication Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationComponentsImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtCommunicationComponents()
		 * @generated
		 */
		EClass UC_IMPACT_AT_COMMUNICATION_COMPONENTS = eINSTANCE.getUCImpactAtCommunicationComponents();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationResourcesImpl <em>UC Impact At Communication Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtCommunicationResourcesImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtCommunicationResources()
		 * @generated
		 */
		EClass UC_IMPACT_AT_COMMUNICATION_RESOURCES = eINSTANCE.getUCImpactAtCommunicationResources();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInstanceImpl <em>UC Impact At Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInstanceImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtComponentInstance()
		 * @generated
		 */
		EClass UC_IMPACT_AT_COMPONENT_INSTANCE = eINSTANCE.getUCImpactAtComponentInstance();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceInstanceImpl <em>UC Impact At Component Interface Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceInstanceImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtComponentInterfaceInstance()
		 * @generated
		 */
		EClass UC_IMPACT_AT_COMPONENT_INTERFACE_INSTANCE = eINSTANCE.getUCImpactAtComponentInterfaceInstance();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceTypeImpl <em>UC Impact At Component Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtComponentInterfaceTypeImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtComponentInterfaceType()
		 * @generated
		 */
		EClass UC_IMPACT_AT_COMPONENT_INTERFACE_TYPE = eINSTANCE.getUCImpactAtComponentInterfaceType();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtHardwareResourceImpl <em>UC Impact At Hardware Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtHardwareResourceImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtHardwareResource()
		 * @generated
		 */
		EClass UC_IMPACT_AT_HARDWARE_RESOURCE = eINSTANCE.getUCImpactAtHardwareResource();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemImpl <em>UC Impact At System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtSystem()
		 * @generated
		 */
		EClass UC_IMPACT_AT_SYSTEM = eINSTANCE.getUCImpactAtSystem();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemInterfaceImpl <em>UC Impact At System Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtSystemInterfaceImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtSystemInterface()
		 * @generated
		 */
		EClass UC_IMPACT_AT_SYSTEM_INTERFACE = eINSTANCE.getUCImpactAtSystemInterface();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtUsageBehaviourImpl <em>UC Impact At Usage Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCImpactAtUsageBehaviourImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getUCImpactAtUsageBehaviour()
		 * @generated
		 */
		EClass UC_IMPACT_AT_USAGE_BEHAVIOUR = eINSTANCE.getUCImpactAtUsageBehaviour();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.ComponentInterfaceInstanceContainerImpl <em>Component Interface Instance Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.ComponentInterfaceInstanceContainerImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getComponentInterfaceInstanceContainer()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE_INSTANCE_CONTAINER = eINSTANCE.getComponentInterfaceInstanceContainer();

		/**
		 * The meta object literal for the '<em><b>Component Interface Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES = eINSTANCE.getComponentInterfaceInstanceContainer_ComponentInterfaceInstances();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.BasicComponentBehaviourContainerImpl <em>Basic Component Behaviour Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.BasicComponentBehaviourContainerImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintypropagationPackageImpl#getBasicComponentBehaviourContainer()
		 * @generated
		 */
		EClass BASIC_COMPONENT_BEHAVIOUR_CONTAINER = eINSTANCE.getBasicComponentBehaviourContainer();

		/**
		 * The meta object literal for the '<em><b>Basic Component Behaviours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS = eINSTANCE.getBasicComponentBehaviourContainer_BasicComponentBehaviours();

	}

} //UncertaintypropagationPackage
