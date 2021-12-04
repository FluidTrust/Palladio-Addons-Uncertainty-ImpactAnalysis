/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Component Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.BasicComponentBehaviourImpl#getResourceDemandingSEFF <em>Resource Demanding SEFF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicComponentBehaviourImpl extends EntityImpl implements BasicComponentBehaviour {
	/**
	 * The cached value of the '{@link #getResourceDemandingSEFF() <em>Resource Demanding SEFF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceDemandingSEFF()
	 * @generated
	 * @ordered
	 */
	protected ResourceDemandingSEFF resourceDemandingSEFF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicComponentBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyPackage.Literals.BASIC_COMPONENT_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDemandingSEFF getResourceDemandingSEFF() {
		if (resourceDemandingSEFF != null && ((EObject)resourceDemandingSEFF).eIsProxy()) {
			InternalEObject oldResourceDemandingSEFF = (InternalEObject)resourceDemandingSEFF;
			resourceDemandingSEFF = (ResourceDemandingSEFF)eResolveProxy(oldResourceDemandingSEFF);
			if (resourceDemandingSEFF != oldResourceDemandingSEFF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF, oldResourceDemandingSEFF, resourceDemandingSEFF));
			}
		}
		return resourceDemandingSEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDemandingSEFF basicGetResourceDemandingSEFF() {
		return resourceDemandingSEFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceDemandingSEFF(ResourceDemandingSEFF newResourceDemandingSEFF) {
		ResourceDemandingSEFF oldResourceDemandingSEFF = resourceDemandingSEFF;
		resourceDemandingSEFF = newResourceDemandingSEFF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF, oldResourceDemandingSEFF, resourceDemandingSEFF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF:
				if (resolve) return getResourceDemandingSEFF();
				return basicGetResourceDemandingSEFF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF:
				setResourceDemandingSEFF((ResourceDemandingSEFF)newValue);
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
			case UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF:
				setResourceDemandingSEFF((ResourceDemandingSEFF)null);
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
			case UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR__RESOURCE_DEMANDING_SEFF:
				return resourceDemandingSEFF != null;
		}
		return super.eIsSet(featureID);
	}

} //BasicComponentBehaviourImpl
