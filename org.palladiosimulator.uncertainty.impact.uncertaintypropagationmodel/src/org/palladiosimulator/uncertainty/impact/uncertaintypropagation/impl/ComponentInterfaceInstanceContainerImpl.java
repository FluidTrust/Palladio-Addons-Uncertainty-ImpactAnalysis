/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface Instance Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.ComponentInterfaceInstanceContainerImpl#getComponentInterfaceInstances <em>Component Interface Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceInstanceContainerImpl extends MinimalEObjectImpl.Container implements ComponentInterfaceInstanceContainer {
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
	protected ComponentInterfaceInstanceContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintypropagationPackage.Literals.COMPONENT_INTERFACE_INSTANCE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterfaceInstance> getComponentInterfaceInstances() {
		if (componentInterfaceInstances == null) {
			componentInterfaceInstances = new EObjectContainmentEList<ComponentInterfaceInstance>(ComponentInterfaceInstance.class, this, UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES);
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
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
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
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
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
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
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
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
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
			case UncertaintypropagationPackage.COMPONENT_INTERFACE_INSTANCE_CONTAINER__COMPONENT_INTERFACE_INSTANCES:
				return componentInterfaceInstances != null && !componentInterfaceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInterfaceInstanceContainerImpl
