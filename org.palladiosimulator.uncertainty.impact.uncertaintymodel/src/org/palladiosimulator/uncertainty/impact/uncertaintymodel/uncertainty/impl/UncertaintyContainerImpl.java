/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl#getUncertainties <em>Uncertainties</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl#getUncertaintyTemplate <em>Uncertainty Template</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl#getBasicComponentBehaviours <em>Basic Component Behaviours</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyContainerImpl#getComponentInterfaceInstances <em>Component Interface Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncertaintyContainerImpl extends MinimalEObjectImpl.Container implements UncertaintyContainer {
	/**
	 * The cached value of the '{@link #getUncertainties() <em>Uncertainties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertainties()
	 * @generated
	 * @ordered
	 */
	protected EList<Uncertainty> uncertainties;

	/**
	 * The cached value of the '{@link #getUncertaintyTemplate() <em>Uncertainty Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertaintyTemplate()
	 * @generated
	 * @ordered
	 */
	protected UncertaintyTemplate uncertaintyTemplate;

	/**
	 * The cached value of the '{@link #getBasicComponentBehaviours() <em>Basic Component Behaviours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicComponentBehaviours()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicComponentBehaviour> basicComponentBehaviours;

	/**
	 * The cached value of the '{@link #getComponentInterfaceInstances() <em>Component Interface Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInterfaceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterfaceInstance> componentInterfaceInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyPackage.Literals.UNCERTAINTY_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uncertainty> getUncertainties() {
		if (uncertainties == null) {
			uncertainties = new EObjectContainmentEList<Uncertainty>(Uncertainty.class, this, UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTIES);
		}
		return uncertainties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTemplate getUncertaintyTemplate() {
		if (uncertaintyTemplate != null && uncertaintyTemplate.eIsProxy()) {
			InternalEObject oldUncertaintyTemplate = (InternalEObject)uncertaintyTemplate;
			uncertaintyTemplate = (UncertaintyTemplate)eResolveProxy(oldUncertaintyTemplate);
			if (uncertaintyTemplate != oldUncertaintyTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE, oldUncertaintyTemplate, uncertaintyTemplate));
			}
		}
		return uncertaintyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTemplate basicGetUncertaintyTemplate() {
		return uncertaintyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertaintyTemplate(UncertaintyTemplate newUncertaintyTemplate) {
		UncertaintyTemplate oldUncertaintyTemplate = uncertaintyTemplate;
		uncertaintyTemplate = newUncertaintyTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE, oldUncertaintyTemplate, uncertaintyTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicComponentBehaviour> getBasicComponentBehaviours() {
		if (basicComponentBehaviours == null) {
			basicComponentBehaviours = new EObjectContainmentEList<BasicComponentBehaviour>(BasicComponentBehaviour.class, this, UncertaintyPackage.UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS);
		}
		return basicComponentBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterfaceInstance> getComponentInterfaceInstances() {
		if (componentInterfaceInstances == null) {
			componentInterfaceInstances = new EObjectContainmentEList<ComponentInterfaceInstance>(ComponentInterfaceInstance.class, this, UncertaintyPackage.UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES);
		}
		return componentInterfaceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTIES:
				return ((InternalEList<?>)getUncertainties()).basicRemove(otherEnd, msgs);
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				return ((InternalEList<?>)getBasicComponentBehaviours()).basicRemove(otherEnd, msgs);
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
				return ((InternalEList<?>)getComponentInterfaceInstances()).basicRemove(otherEnd, msgs);
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
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTIES:
				return getUncertainties();
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE:
				if (resolve) return getUncertaintyTemplate();
				return basicGetUncertaintyTemplate();
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				return getBasicComponentBehaviours();
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
				return getComponentInterfaceInstances();
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
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTIES:
				getUncertainties().clear();
				getUncertainties().addAll((Collection<? extends Uncertainty>)newValue);
				return;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE:
				setUncertaintyTemplate((UncertaintyTemplate)newValue);
				return;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				getBasicComponentBehaviours().clear();
				getBasicComponentBehaviours().addAll((Collection<? extends BasicComponentBehaviour>)newValue);
				return;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
				getComponentInterfaceInstances().clear();
				getComponentInterfaceInstances().addAll((Collection<? extends ComponentInterfaceInstance>)newValue);
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
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTIES:
				getUncertainties().clear();
				return;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE:
				setUncertaintyTemplate((UncertaintyTemplate)null);
				return;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				getBasicComponentBehaviours().clear();
				return;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
				getComponentInterfaceInstances().clear();
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
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTIES:
				return uncertainties != null && !uncertainties.isEmpty();
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__UNCERTAINTY_TEMPLATE:
				return uncertaintyTemplate != null;
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				return basicComponentBehaviours != null && !basicComponentBehaviours.isEmpty();
			case UncertaintyPackage.UNCERTAINTY_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
				return componentInterfaceInstances != null && !componentInterfaceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UncertaintyContainerImpl
