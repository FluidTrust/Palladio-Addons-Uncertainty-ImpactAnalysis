/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncertainty Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl#getAddContainer <em>Add Container</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl#getPalladioElementTypeContainer <em>Palladio Element Type Container</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl.UncertaintyTemplateImpl#getUncertaintyTypeContainer <em>Uncertainty Type Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncertaintyTemplateImpl extends MinimalEObjectImpl.Container implements UncertaintyTemplate {
	/**
	 * The cached value of the '{@link #getAddContainer() <em>Add Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddContainer()
	 * @generated
	 * @ordered
	 */
	protected ADDContainer addContainer;

	/**
	 * The cached value of the '{@link #getPalladioElementTypeContainer() <em>Palladio Element Type Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPalladioElementTypeContainer()
	 * @generated
	 * @ordered
	 */
	protected PalladioElementTypeContainer palladioElementTypeContainer;

	/**
	 * The cached value of the '{@link #getUncertaintyTypeContainer() <em>Uncertainty Type Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertaintyTypeContainer()
	 * @generated
	 * @ordered
	 */
	protected UncertaintyTypeContainer uncertaintyTypeContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyTemplatePackage.Literals.UNCERTAINTY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDContainer getAddContainer() {
		if (addContainer != null && addContainer.eIsProxy()) {
			InternalEObject oldAddContainer = (InternalEObject)addContainer;
			addContainer = (ADDContainer)eResolveProxy(oldAddContainer);
			if (addContainer != oldAddContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__ADD_CONTAINER, oldAddContainer, addContainer));
			}
		}
		return addContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDContainer basicGetAddContainer() {
		return addContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddContainer(ADDContainer newAddContainer) {
		ADDContainer oldAddContainer = addContainer;
		addContainer = newAddContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__ADD_CONTAINER, oldAddContainer, addContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypeContainer getPalladioElementTypeContainer() {
		if (palladioElementTypeContainer != null && palladioElementTypeContainer.eIsProxy()) {
			InternalEObject oldPalladioElementTypeContainer = (InternalEObject)palladioElementTypeContainer;
			palladioElementTypeContainer = (PalladioElementTypeContainer)eResolveProxy(oldPalladioElementTypeContainer);
			if (palladioElementTypeContainer != oldPalladioElementTypeContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER, oldPalladioElementTypeContainer, palladioElementTypeContainer));
			}
		}
		return palladioElementTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypeContainer basicGetPalladioElementTypeContainer() {
		return palladioElementTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalladioElementTypeContainer(PalladioElementTypeContainer newPalladioElementTypeContainer) {
		PalladioElementTypeContainer oldPalladioElementTypeContainer = palladioElementTypeContainer;
		palladioElementTypeContainer = newPalladioElementTypeContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER, oldPalladioElementTypeContainer, palladioElementTypeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypeContainer getUncertaintyTypeContainer() {
		if (uncertaintyTypeContainer != null && uncertaintyTypeContainer.eIsProxy()) {
			InternalEObject oldUncertaintyTypeContainer = (InternalEObject)uncertaintyTypeContainer;
			uncertaintyTypeContainer = (UncertaintyTypeContainer)eResolveProxy(oldUncertaintyTypeContainer);
			if (uncertaintyTypeContainer != oldUncertaintyTypeContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER, oldUncertaintyTypeContainer, uncertaintyTypeContainer));
			}
		}
		return uncertaintyTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypeContainer basicGetUncertaintyTypeContainer() {
		return uncertaintyTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertaintyTypeContainer(UncertaintyTypeContainer newUncertaintyTypeContainer) {
		UncertaintyTypeContainer oldUncertaintyTypeContainer = uncertaintyTypeContainer;
		uncertaintyTypeContainer = newUncertaintyTypeContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER, oldUncertaintyTypeContainer, uncertaintyTypeContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__ADD_CONTAINER:
				if (resolve) return getAddContainer();
				return basicGetAddContainer();
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER:
				if (resolve) return getPalladioElementTypeContainer();
				return basicGetPalladioElementTypeContainer();
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER:
				if (resolve) return getUncertaintyTypeContainer();
				return basicGetUncertaintyTypeContainer();
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
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__ADD_CONTAINER:
				setAddContainer((ADDContainer)newValue);
				return;
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER:
				setPalladioElementTypeContainer((PalladioElementTypeContainer)newValue);
				return;
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER:
				setUncertaintyTypeContainer((UncertaintyTypeContainer)newValue);
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
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__ADD_CONTAINER:
				setAddContainer((ADDContainer)null);
				return;
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER:
				setPalladioElementTypeContainer((PalladioElementTypeContainer)null);
				return;
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER:
				setUncertaintyTypeContainer((UncertaintyTypeContainer)null);
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
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__ADD_CONTAINER:
				return addContainer != null;
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__PALLADIO_ELEMENT_TYPE_CONTAINER:
				return palladioElementTypeContainer != null;
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE__UNCERTAINTY_TYPE_CONTAINER:
				return uncertaintyTypeContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //UncertaintyTemplateImpl
