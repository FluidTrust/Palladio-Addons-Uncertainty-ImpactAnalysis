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

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Component Behaviour Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.BasicComponentBehaviourContainerImpl#getBasicComponentBehaviours <em>Basic Component Behaviours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicComponentBehaviourContainerImpl extends MinimalEObjectImpl.Container implements BasicComponentBehaviourContainer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicComponentBehaviourContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintypropagationPackage.Literals.BASIC_COMPONENT_BEHAVIOUR_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicComponentBehaviour> getBasicComponentBehaviours() {
		if (basicComponentBehaviours == null) {
			basicComponentBehaviours = new EObjectContainmentEList<BasicComponentBehaviour>(BasicComponentBehaviour.class, this, UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS);
		}
		return basicComponentBehaviours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				return ((InternalEList<?>)getBasicComponentBehaviours()).basicRemove(otherEnd, msgs);
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
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				return getBasicComponentBehaviours();
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
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				getBasicComponentBehaviours().clear();
				getBasicComponentBehaviours().addAll((Collection<? extends BasicComponentBehaviour>)newValue);
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
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				getBasicComponentBehaviours().clear();
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
			case UncertaintypropagationPackage.BASIC_COMPONENT_BEHAVIOUR_CONTAINER__BASIC_COMPONENT_BEHAVIOURS:
				return basicComponentBehaviours != null && !basicComponentBehaviours.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicComponentBehaviourContainerImpl
