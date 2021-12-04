/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncertainty Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedBasicComponentBehaviours <em>Affected Basic Component Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedBasicComponentTypes <em>Affected Basic Component Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedCommunicationComponents <em>Affected Communication Components</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedCommunicationResources <em>Affected Communication Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffecteComponentInstances <em>Affecte Component Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedComponentInterfaceInstances <em>Affected Component Interface Instances</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedComponentInterfaceTypes <em>Affected Component Interface Types</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedHardwareResources <em>Affected Hardware Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedSystems <em>Affected Systems</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedSystemInterface <em>Affected System Interface</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getAffectedUsageBehaviours <em>Affected Usage Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getCausingUncertainties <em>Causing Uncertainties</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getComponentInterfaceInstanceContainer <em>Component Interface Instance Container</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.UncertaintyPropagationImpl#getBasicComponentBehaviourContainer <em>Basic Component Behaviour Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncertaintyPropagationImpl extends ChangePropagationStepImpl implements UncertaintyPropagation {
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
	 * The cached value of the '{@link #getAffecteComponentInstances() <em>Affecte Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffecteComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtComponentInstance> affecteComponentInstances;

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
	 * The cached value of the '{@link #getAffectedSystemInterface() <em>Affected System Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffectedSystemInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<UCImpactAtSystemInterface> affectedSystemInterface;

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
	 * The cached value of the '{@link #getComponentInterfaceInstanceContainer() <em>Component Interface Instance Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInterfaceInstanceContainer()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterfaceInstanceContainer componentInterfaceInstanceContainer;

	/**
	 * The cached value of the '{@link #getBasicComponentBehaviourContainer() <em>Basic Component Behaviour Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicComponentBehaviourContainer()
	 * @generated
	 * @ordered
	 */
	protected BasicComponentBehaviourContainer basicComponentBehaviourContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtBasicComponentBehaviour> getAffectedBasicComponentBehaviours() {
		if (affectedBasicComponentBehaviours == null) {
			affectedBasicComponentBehaviours = new EObjectContainmentEList<UCImpactAtBasicComponentBehaviour>(UCImpactAtBasicComponentBehaviour.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS);
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
			affectedBasicComponentTypes = new EObjectContainmentEList<UCImpactAtBasicComponentType>(UCImpactAtBasicComponentType.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES);
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
			affectedCommunicationComponents = new EObjectContainmentEList<UCImpactAtCommunicationComponents>(UCImpactAtCommunicationComponents.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS);
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
			affectedCommunicationResources = new EObjectContainmentEList<UCImpactAtCommunicationResources>(UCImpactAtCommunicationResources.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES);
		}
		return affectedCommunicationResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtComponentInstance> getAffecteComponentInstances() {
		if (affecteComponentInstances == null) {
			affecteComponentInstances = new EObjectContainmentEList<UCImpactAtComponentInstance>(UCImpactAtComponentInstance.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES);
		}
		return affecteComponentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtComponentInterfaceInstance> getAffectedComponentInterfaceInstances() {
		if (affectedComponentInterfaceInstances == null) {
			affectedComponentInterfaceInstances = new EObjectContainmentEList<UCImpactAtComponentInterfaceInstance>(UCImpactAtComponentInterfaceInstance.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES);
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
			affectedComponentInterfaceTypes = new EObjectContainmentEList<UCImpactAtComponentInterfaceType>(UCImpactAtComponentInterfaceType.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES);
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
			affectedHardwareResources = new EObjectContainmentEList<UCImpactAtHardwareResource>(UCImpactAtHardwareResource.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES);
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
			affectedSystems = new EObjectContainmentEList<UCImpactAtSystem>(UCImpactAtSystem.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS);
		}
		return affectedSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtSystemInterface> getAffectedSystemInterface() {
		if (affectedSystemInterface == null) {
			affectedSystemInterface = new EObjectContainmentEList<UCImpactAtSystemInterface>(UCImpactAtSystemInterface.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE);
		}
		return affectedSystemInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UCImpactAtUsageBehaviour> getAffectedUsageBehaviours() {
		if (affectedUsageBehaviours == null) {
			affectedUsageBehaviours = new EObjectContainmentEList<UCImpactAtUsageBehaviour>(UCImpactAtUsageBehaviour.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS);
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
			causingUncertainties = new EObjectContainmentEList<CausingUncertainty>(CausingUncertainty.class, this, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES);
		}
		return causingUncertainties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceInstanceContainer getComponentInterfaceInstanceContainer() {
		return componentInterfaceInstanceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInterfaceInstanceContainer(ComponentInterfaceInstanceContainer newComponentInterfaceInstanceContainer, NotificationChain msgs) {
		ComponentInterfaceInstanceContainer oldComponentInterfaceInstanceContainer = componentInterfaceInstanceContainer;
		componentInterfaceInstanceContainer = newComponentInterfaceInstanceContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER, oldComponentInterfaceInstanceContainer, newComponentInterfaceInstanceContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInterfaceInstanceContainer(ComponentInterfaceInstanceContainer newComponentInterfaceInstanceContainer) {
		if (newComponentInterfaceInstanceContainer != componentInterfaceInstanceContainer) {
			NotificationChain msgs = null;
			if (componentInterfaceInstanceContainer != null)
				msgs = ((InternalEObject)componentInterfaceInstanceContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER, null, msgs);
			if (newComponentInterfaceInstanceContainer != null)
				msgs = ((InternalEObject)newComponentInterfaceInstanceContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER, null, msgs);
			msgs = basicSetComponentInterfaceInstanceContainer(newComponentInterfaceInstanceContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER, newComponentInterfaceInstanceContainer, newComponentInterfaceInstanceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponentBehaviourContainer getBasicComponentBehaviourContainer() {
		return basicComponentBehaviourContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicComponentBehaviourContainer(BasicComponentBehaviourContainer newBasicComponentBehaviourContainer, NotificationChain msgs) {
		BasicComponentBehaviourContainer oldBasicComponentBehaviourContainer = basicComponentBehaviourContainer;
		basicComponentBehaviourContainer = newBasicComponentBehaviourContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER, oldBasicComponentBehaviourContainer, newBasicComponentBehaviourContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicComponentBehaviourContainer(BasicComponentBehaviourContainer newBasicComponentBehaviourContainer) {
		if (newBasicComponentBehaviourContainer != basicComponentBehaviourContainer) {
			NotificationChain msgs = null;
			if (basicComponentBehaviourContainer != null)
				msgs = ((InternalEObject)basicComponentBehaviourContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER, null, msgs);
			if (newBasicComponentBehaviourContainer != null)
				msgs = ((InternalEObject)newBasicComponentBehaviourContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER, null, msgs);
			msgs = basicSetBasicComponentBehaviourContainer(newBasicComponentBehaviourContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER, newBasicComponentBehaviourContainer, newBasicComponentBehaviourContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				return ((InternalEList<?>)getAffectedBasicComponentBehaviours()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES:
				return ((InternalEList<?>)getAffectedBasicComponentTypes()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS:
				return ((InternalEList<?>)getAffectedCommunicationComponents()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES:
				return ((InternalEList<?>)getAffectedCommunicationResources()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES:
				return ((InternalEList<?>)getAffecteComponentInstances()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				return ((InternalEList<?>)getAffectedComponentInterfaceInstances()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES:
				return ((InternalEList<?>)getAffectedComponentInterfaceTypes()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES:
				return ((InternalEList<?>)getAffectedHardwareResources()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS:
				return ((InternalEList<?>)getAffectedSystems()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE:
				return ((InternalEList<?>)getAffectedSystemInterface()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS:
				return ((InternalEList<?>)getAffectedUsageBehaviours()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES:
				return ((InternalEList<?>)getCausingUncertainties()).basicRemove(otherEnd, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER:
				return basicSetComponentInterfaceInstanceContainer(null, msgs);
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER:
				return basicSetBasicComponentBehaviourContainer(null, msgs);
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
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				return getAffectedBasicComponentBehaviours();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES:
				return getAffectedBasicComponentTypes();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS:
				return getAffectedCommunicationComponents();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES:
				return getAffectedCommunicationResources();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES:
				return getAffecteComponentInstances();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				return getAffectedComponentInterfaceInstances();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES:
				return getAffectedComponentInterfaceTypes();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES:
				return getAffectedHardwareResources();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS:
				return getAffectedSystems();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE:
				return getAffectedSystemInterface();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS:
				return getAffectedUsageBehaviours();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES:
				return getCausingUncertainties();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER:
				return getComponentInterfaceInstanceContainer();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER:
				return getBasicComponentBehaviourContainer();
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
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				getAffectedBasicComponentBehaviours().clear();
				getAffectedBasicComponentBehaviours().addAll((Collection<? extends UCImpactAtBasicComponentBehaviour>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES:
				getAffectedBasicComponentTypes().clear();
				getAffectedBasicComponentTypes().addAll((Collection<? extends UCImpactAtBasicComponentType>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS:
				getAffectedCommunicationComponents().clear();
				getAffectedCommunicationComponents().addAll((Collection<? extends UCImpactAtCommunicationComponents>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES:
				getAffectedCommunicationResources().clear();
				getAffectedCommunicationResources().addAll((Collection<? extends UCImpactAtCommunicationResources>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES:
				getAffecteComponentInstances().clear();
				getAffecteComponentInstances().addAll((Collection<? extends UCImpactAtComponentInstance>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				getAffectedComponentInterfaceInstances().clear();
				getAffectedComponentInterfaceInstances().addAll((Collection<? extends UCImpactAtComponentInterfaceInstance>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES:
				getAffectedComponentInterfaceTypes().clear();
				getAffectedComponentInterfaceTypes().addAll((Collection<? extends UCImpactAtComponentInterfaceType>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES:
				getAffectedHardwareResources().clear();
				getAffectedHardwareResources().addAll((Collection<? extends UCImpactAtHardwareResource>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS:
				getAffectedSystems().clear();
				getAffectedSystems().addAll((Collection<? extends UCImpactAtSystem>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE:
				getAffectedSystemInterface().clear();
				getAffectedSystemInterface().addAll((Collection<? extends UCImpactAtSystemInterface>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS:
				getAffectedUsageBehaviours().clear();
				getAffectedUsageBehaviours().addAll((Collection<? extends UCImpactAtUsageBehaviour>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES:
				getCausingUncertainties().clear();
				getCausingUncertainties().addAll((Collection<? extends CausingUncertainty>)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER:
				setComponentInterfaceInstanceContainer((ComponentInterfaceInstanceContainer)newValue);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER:
				setBasicComponentBehaviourContainer((BasicComponentBehaviourContainer)newValue);
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
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				getAffectedBasicComponentBehaviours().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES:
				getAffectedBasicComponentTypes().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS:
				getAffectedCommunicationComponents().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES:
				getAffectedCommunicationResources().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES:
				getAffecteComponentInstances().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				getAffectedComponentInterfaceInstances().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES:
				getAffectedComponentInterfaceTypes().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES:
				getAffectedHardwareResources().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS:
				getAffectedSystems().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE:
				getAffectedSystemInterface().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS:
				getAffectedUsageBehaviours().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES:
				getCausingUncertainties().clear();
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER:
				setComponentInterfaceInstanceContainer((ComponentInterfaceInstanceContainer)null);
				return;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER:
				setBasicComponentBehaviourContainer((BasicComponentBehaviourContainer)null);
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
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
				return affectedBasicComponentBehaviours != null && !affectedBasicComponentBehaviours.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES:
				return affectedBasicComponentTypes != null && !affectedBasicComponentTypes.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS:
				return affectedCommunicationComponents != null && !affectedCommunicationComponents.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES:
				return affectedCommunicationResources != null && !affectedCommunicationResources.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES:
				return affecteComponentInstances != null && !affecteComponentInstances.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
				return affectedComponentInterfaceInstances != null && !affectedComponentInterfaceInstances.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES:
				return affectedComponentInterfaceTypes != null && !affectedComponentInterfaceTypes.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES:
				return affectedHardwareResources != null && !affectedHardwareResources.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS:
				return affectedSystems != null && !affectedSystems.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE:
				return affectedSystemInterface != null && !affectedSystemInterface.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS:
				return affectedUsageBehaviours != null && !affectedUsageBehaviours.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES:
				return causingUncertainties != null && !causingUncertainties.isEmpty();
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER:
				return componentInterfaceInstanceContainer != null;
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER:
				return basicComponentBehaviourContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //UncertaintyPropagationImpl
