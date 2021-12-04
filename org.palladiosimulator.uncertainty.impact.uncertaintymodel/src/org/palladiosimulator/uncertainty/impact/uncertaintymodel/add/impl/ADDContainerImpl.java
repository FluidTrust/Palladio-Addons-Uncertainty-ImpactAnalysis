/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADD Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl.ADDContainerImpl#getAdds <em>Adds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADDContainerImpl extends MinimalEObjectImpl.Container implements ADDContainer {
	/**
	 * The cached value of the '{@link #getAdds() <em>Adds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdds()
	 * @generated
	 * @ordered
	 */
	protected EList<ADD> adds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADDContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddPackage.Literals.ADD_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADD> getAdds() {
		if (adds == null) {
			adds = new EObjectContainmentEList<ADD>(ADD.class, this, AddPackage.ADD_CONTAINER__ADDS);
		}
		return adds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddPackage.ADD_CONTAINER__ADDS:
				return ((InternalEList<?>)getAdds()).basicRemove(otherEnd, msgs);
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
			case AddPackage.ADD_CONTAINER__ADDS:
				return getAdds();
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
			case AddPackage.ADD_CONTAINER__ADDS:
				getAdds().clear();
				getAdds().addAll((Collection<? extends ADD>)newValue);
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
			case AddPackage.ADD_CONTAINER__ADDS:
				getAdds().clear();
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
			case AddPackage.ADD_CONTAINER__ADDS:
				return adds != null && !adds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ADDContainerImpl
