/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeContainerImpl#getUncertaintyTypes <em>Uncertainty Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncertaintyTypeContainerImpl extends MinimalEObjectImpl.Container implements UncertaintyTypeContainer {
	/**
	 * The cached value of the '{@link #getUncertaintyTypes() <em>Uncertainty Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertaintyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UncertaintyType> uncertaintyTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UncertaintyType> getUncertaintyTypes() {
		if (uncertaintyTypes == null) {
			uncertaintyTypes = new EObjectContainmentEList<UncertaintyType>(UncertaintyType.class, this, UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES);
		}
		return uncertaintyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES:
				return ((InternalEList<?>)getUncertaintyTypes()).basicRemove(otherEnd, msgs);
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
			case UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES:
				return getUncertaintyTypes();
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
			case UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES:
				getUncertaintyTypes().clear();
				getUncertaintyTypes().addAll((Collection<? extends UncertaintyType>)newValue);
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
			case UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES:
				getUncertaintyTypes().clear();
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
			case UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES:
				return uncertaintyTypes != null && !uncertaintyTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UncertaintyTypeContainerImpl
