/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl.PalladioElementTypeContainerImpl#getPalladioElementTypes <em>Palladio Element Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PalladioElementTypeContainerImpl extends MinimalEObjectImpl.Container implements PalladioElementTypeContainer {
	/**
	 * The cached value of the '{@link #getPalladioElementTypes() <em>Palladio Element Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalladioElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PalladioElementType> palladioElementTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PalladioElementTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PalladioElementTypePackage.Literals.PALLADIO_ELEMENT_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PalladioElementType> getPalladioElementTypes() {
		if (palladioElementTypes == null) {
			palladioElementTypes = new EObjectContainmentEList<PalladioElementType>(PalladioElementType.class, this, PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES);
		}
		return palladioElementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES:
				return ((InternalEList<?>)getPalladioElementTypes()).basicRemove(otherEnd, msgs);
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES:
				return getPalladioElementTypes();
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES:
				getPalladioElementTypes().clear();
				getPalladioElementTypes().addAll((Collection<? extends PalladioElementType>)newValue);
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES:
				getPalladioElementTypes().clear();
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER__PALLADIO_ELEMENT_TYPES:
				return palladioElementTypes != null && !palladioElementTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PalladioElementTypeContainerImpl
