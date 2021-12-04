/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
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
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UC Propagation Rules Seed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedBasicComponentBehaviours <em>Affected Basic Component Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedBasicComponentTypes <em>Affected Basic Component Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedCommunicationComponents <em>Affected Communication Components</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedCommunicationResources <em>Affected Communication Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedComponentInstances <em>Affected Component Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedComponentInterfaceInstances <em>Affected Component Interface Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedComponentInterfaceTypes <em>Affected Component Interface Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedHardwareResources <em>Affected Hardware Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedSystems <em>Affected Systems</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedSystemInterfaces <em>Affected System Interfaces</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getAffectedUsageBehaviours <em>Affected Usage Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UCPropagationRulesSeedImpl#getCausingUncertainties <em>Causing Uncertainties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UCPropagationRulesSeedImpl extends AbstractSeedModificationsImpl implements UCPropagationRulesSeed {
	/**
	 * The cached value of the '{@link #getAffectedBasicComponentBehaviours() <em>Affected Basic Component Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedBasicComponentBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtBasicComponentBehaviour> affectedBasicComponentBehaviours;

	/**
	 * The cached value of the '{@link #getAffectedBasicComponentTypes() <em>Affected Basic Component Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedBasicComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtBasicComponentType> affectedBasicComponentTypes;

	/**
	 * The cached value of the '{@link #getAffectedCommunicationComponents() <em>Affected Communication Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedCommunicationComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtCommunicationComponents> affectedCommunicationComponents;

	/**
	 * The cached value of the '{@link #getAffectedCommunicationResources() <em>Affected Communication Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedCommunicationResources()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtCommunicationResources> affectedCommunicationResources;

	/**
	 * The cached value of the '{@link #getAffectedComponentInstances() <em>Affected Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtComponentInstance> affectedComponentInstances;

	/**
	 * The cached value of the '{@link #getAffectedComponentInterfaceInstances() <em>Affected Component Interface Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedComponentInterfaceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtComponentInterfaceInstance> affectedComponentInterfaceInstances;

	/**
	 * The cached value of the '{@link #getAffectedComponentInterfaceTypes() <em>Affected Component Interface Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedComponentInterfaceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtComponentInterfaceType> affectedComponentInterfaceTypes;

	/**
	 * The cached value of the '{@link #getAffectedHardwareResources() <em>Affected Hardware Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedHardwareResources()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtHardwareResource> affectedHardwareResources;

	/**
	 * The cached value of the '{@link #getAffectedSystems() <em>Affected Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtSystem> affectedSystems;

	/**
	 * The cached value of the '{@link #getAffectedSystemInterfaces() <em>Affected System Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedSystemInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtSystemInterface> affectedSystemInterfaces;

	/**
	 * The cached value of the '{@link #getAffectedUsageBehaviours() <em>Affected Usage Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedUsageBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtUsageBehaviour> affectedUsageBehaviours;

	/**
	 * The cached value of the '{@link #getCausingUncertainties() <em>Causing Uncertainties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausingUncertainties()
	 * @generated
	 * @ordered
	 */
	protected EList<CausingUncertainty> causingUncertainties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCPropagationRulesSeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtBasicComponentBehaviour> getAffectedBasicComponentBehaviours() {
		if (affectedBasicComponentBehaviours == null) {
			affectedBasicComponentBehaviours = new EObjectContainmentEList<UCImpactAtBasicComponentBehaviour>(UCImpactAtBasicComponentBehaviour.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS);
		}
		return affectedBasicComponentBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtBasicComponentType> getAffectedBasicComponentTypes() {
		if (affectedBasicComponentTypes == null) {
			affectedBasicComponentTypes = new EObjectContainmentEList<UCImpactAtBasicComponentType>(UCImpactAtBasicComponentType.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES);
		}
		return affectedBasicComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtCommunicationComponents> getAffectedCommunicationComponents() {
		if (affectedCommunicationComponents == null) {
			affectedCommunicationComponents = new EObjectContainmentEList<UCImpactAtCommunicationComponents>(UCImpactAtCommunicationComponents.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS);
		}
		return affectedCommunicationComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtCommunicationResources> getAffectedCommunicationResources() {
		if (affectedCommunicationResources == null) {
			affectedCommunicationResources = new EObjectContainmentEList<UCImpactAtCommunicationResources>(UCImpactAtCommunicationResources.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES);
		}
		return affectedCommunicationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtComponentInstance> getAffectedComponentInstances() {
		if (affectedComponentInstances == null) {
			affectedComponentInstances = new EObjectContainmentEList<UCImpactAtComponentInstance>(UCImpactAtComponentInstance.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES);
		}
		return affectedComponentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtComponentInterfaceInstance> getAffectedComponentInterfaceInstances() {
		if (affectedComponentInterfaceInstances == null) {
			affectedComponentInterfaceInstances = new EObjectContainmentEList<UCImpactAtComponentInterfaceInstance>(UCImpactAtComponentInterfaceInstance.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES);
		}
		return affectedComponentInterfaceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtComponentInterfaceType> getAffectedComponentInterfaceTypes() {
		if (affectedComponentInterfaceTypes == null) {
			affectedComponentInterfaceTypes = new EObjectContainmentEList<UCImpactAtComponentInterfaceType>(UCImpactAtComponentInterfaceType.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES);
		}
		return affectedComponentInterfaceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtHardwareResource> getAffectedHardwareResources() {
		if (affectedHardwareResources == null) {
			affectedHardwareResources = new EObjectContainmentEList<UCImpactAtHardwareResource>(UCImpactAtHardwareResource.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES);
		}
		return affectedHardwareResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtSystem> getAffectedSystems() {
		if (affectedSystems == null) {
			affectedSystems = new EObjectContainmentEList<UCImpactAtSystem>(UCImpactAtSystem.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS);
		}
		return affectedSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtSystemInterface> getAffectedSystemInterfaces() {
		if (affectedSystemInterfaces == null) {
			affectedSystemInterfaces = new EObjectContainmentEList<UCImpactAtSystemInterface>(UCImpactAtSystemInterface.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES);
		}
		return affectedSystemInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtUsageBehaviour> getAffectedUsageBehaviours() {
		if (affectedUsageBehaviours == null) {
			affectedUsageBehaviours = new EObjectContainmentEList<UCImpactAtUsageBehaviour>(UCImpactAtUsageBehaviour.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS);
		}
		return affectedUsageBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CausingUncertainty> getCausingUncertainties() {
		if (causingUncertainties == null) {
			causingUncertainties = new EObjectContainmentEList<CausingUncertainty>(CausingUncertainty.class, this, UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES);
		}
		return causingUncertainties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				return ((InternalEList<?>)getAffectedBasicComponentBehaviours()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES:
				return ((InternalEList<?>)getAffectedBasicComponentTypes()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS:
				return ((InternalEList<?>)getAffectedCommunicationComponents()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES:
				return ((InternalEList<?>)getAffectedCommunicationResources()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES:
				return ((InternalEList<?>)getAffectedComponentInstances()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				return ((InternalEList<?>)getAffectedComponentInterfaceInstances()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES:
				return ((InternalEList<?>)getAffectedComponentInterfaceTypes()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES:
				return ((InternalEList<?>)getAffectedHardwareResources()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS:
				return ((InternalEList<?>)getAffectedSystems()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES:
				return ((InternalEList<?>)getAffectedSystemInterfaces()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS:
				return ((InternalEList<?>)getAffectedUsageBehaviours()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES:
				return ((InternalEList<?>)getCausingUncertainties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				return getAffectedBasicComponentBehaviours();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES:
				return getAffectedBasicComponentTypes();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS:
				return getAffectedCommunicationComponents();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES:
				return getAffectedCommunicationResources();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES:
				return getAffectedComponentInstances();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				return getAffectedComponentInterfaceInstances();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES:
				return getAffectedComponentInterfaceTypes();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES:
				return getAffectedHardwareResources();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS:
				return getAffectedSystems();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES:
				return getAffectedSystemInterfaces();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS:
				return getAffectedUsageBehaviours();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES:
				return getCausingUncertainties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				getAffectedBasicComponentBehaviours().clear();
				getAffectedBasicComponentBehaviours().addAll((Collection<? extends UCImpactAtBasicComponentBehaviour>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES:
				getAffectedBasicComponentTypes().clear();
				getAffectedBasicComponentTypes().addAll((Collection<? extends UCImpactAtBasicComponentType>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS:
				getAffectedCommunicationComponents().clear();
				getAffectedCommunicationComponents().addAll((Collection<? extends UCImpactAtCommunicationComponents>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES:
				getAffectedCommunicationResources().clear();
				getAffectedCommunicationResources().addAll((Collection<? extends UCImpactAtCommunicationResources>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES:
				getAffectedComponentInstances().clear();
				getAffectedComponentInstances().addAll((Collection<? extends UCImpactAtComponentInstance>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				getAffectedComponentInterfaceInstances().clear();
				getAffectedComponentInterfaceInstances().addAll((Collection<? extends UCImpactAtComponentInterfaceInstance>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES:
				getAffectedComponentInterfaceTypes().clear();
				getAffectedComponentInterfaceTypes().addAll((Collection<? extends UCImpactAtComponentInterfaceType>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES:
				getAffectedHardwareResources().clear();
				getAffectedHardwareResources().addAll((Collection<? extends UCImpactAtHardwareResource>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS:
				getAffectedSystems().clear();
				getAffectedSystems().addAll((Collection<? extends UCImpactAtSystem>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES:
				getAffectedSystemInterfaces().clear();
				getAffectedSystemInterfaces().addAll((Collection<? extends UCImpactAtSystemInterface>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS:
				getAffectedUsageBehaviours().clear();
				getAffectedUsageBehaviours().addAll((Collection<? extends UCImpactAtUsageBehaviour>)newValue);
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES:
				getCausingUncertainties().clear();
				getCausingUncertainties().addAll((Collection<? extends CausingUncertainty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				getAffectedBasicComponentBehaviours().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES:
				getAffectedBasicComponentTypes().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS:
				getAffectedCommunicationComponents().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES:
				getAffectedCommunicationResources().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES:
				getAffectedComponentInstances().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				getAffectedComponentInterfaceInstances().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES:
				getAffectedComponentInterfaceTypes().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES:
				getAffectedHardwareResources().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS:
				getAffectedSystems().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES:
				getAffectedSystemInterfaces().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS:
				getAffectedUsageBehaviours().clear();
				return;
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES:
				getCausingUncertainties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				return affectedBasicComponentBehaviours != null && !affectedBasicComponentBehaviours.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES:
				return affectedBasicComponentTypes != null && !affectedBasicComponentTypes.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS:
				return affectedCommunicationComponents != null && !affectedCommunicationComponents.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES:
				return affectedCommunicationResources != null && !affectedCommunicationResources.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES:
				return affectedComponentInstances != null && !affectedComponentInstances.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				return affectedComponentInterfaceInstances != null && !affectedComponentInterfaceInstances.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES:
				return affectedComponentInterfaceTypes != null && !affectedComponentInterfaceTypes.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES:
				return affectedHardwareResources != null && !affectedHardwareResources.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS:
				return affectedSystems != null && !affectedSystems.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES:
				return affectedSystemInterfaces != null && !affectedSystemInterfaces.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS:
				return affectedUsageBehaviours != null && !affectedUsageBehaviours.isEmpty();
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES:
				return causingUncertainties != null && !causingUncertainties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UCPropagationRulesSeedImpl
