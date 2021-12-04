/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl#getAssignedElement <em>Assigned Element</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.UncertaintyImpl#getUncertaintyType <em>Uncertainty Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncertaintyImpl extends IdentifierImpl implements Uncertainty {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedElement() <em>Assigned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedElement()
	 * @generated
	 * @ordered
	 */
	protected PalladioElementWrapper assignedElement;

	/**
	 * The cached value of the '{@link #getUncertaintyType() <em>Uncertainty Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertaintyType()
	 * @generated
	 * @ordered
	 */
	protected UncertaintyType uncertaintyType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyPackage.Literals.UNCERTAINTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UNCERTAINTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementWrapper getAssignedElement() {
		return assignedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedElement(PalladioElementWrapper newAssignedElement, NotificationChain msgs) {
		PalladioElementWrapper oldAssignedElement = assignedElement;
		assignedElement = newAssignedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT, oldAssignedElement, newAssignedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedElement(PalladioElementWrapper newAssignedElement) {
		if (newAssignedElement != assignedElement) {
			NotificationChain msgs = null;
			if (assignedElement != null)
				msgs = ((InternalEObject)assignedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT, null, msgs);
			if (newAssignedElement != null)
				msgs = ((InternalEObject)newAssignedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT, null, msgs);
			msgs = basicSetAssignedElement(newAssignedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT, newAssignedElement, newAssignedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyType getUncertaintyType() {
		if (uncertaintyType != null && uncertaintyType.eIsProxy()) {
			InternalEObject oldUncertaintyType = (InternalEObject)uncertaintyType;
			uncertaintyType = (UncertaintyType)eResolveProxy(oldUncertaintyType);
			if (uncertaintyType != oldUncertaintyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyPackage.UNCERTAINTY__UNCERTAINTY_TYPE, oldUncertaintyType, uncertaintyType));
			}
		}
		return uncertaintyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyType basicGetUncertaintyType() {
		return uncertaintyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertaintyType(UncertaintyType newUncertaintyType) {
		UncertaintyType oldUncertaintyType = uncertaintyType;
		uncertaintyType = newUncertaintyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.UNCERTAINTY__UNCERTAINTY_TYPE, oldUncertaintyType, uncertaintyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT:
				return basicSetAssignedElement(null, msgs);
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
			case UncertaintyPackage.UNCERTAINTY__NAME:
				return getName();
			case UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT:
				return getAssignedElement();
			case UncertaintyPackage.UNCERTAINTY__UNCERTAINTY_TYPE:
				if (resolve) return getUncertaintyType();
				return basicGetUncertaintyType();
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
			case UncertaintyPackage.UNCERTAINTY__NAME:
				setName((String)newValue);
				return;
			case UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT:
				setAssignedElement((PalladioElementWrapper)newValue);
				return;
			case UncertaintyPackage.UNCERTAINTY__UNCERTAINTY_TYPE:
				setUncertaintyType((UncertaintyType)newValue);
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
			case UncertaintyPackage.UNCERTAINTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT:
				setAssignedElement((PalladioElementWrapper)null);
				return;
			case UncertaintyPackage.UNCERTAINTY__UNCERTAINTY_TYPE:
				setUncertaintyType((UncertaintyType)null);
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
			case UncertaintyPackage.UNCERTAINTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UncertaintyPackage.UNCERTAINTY__ASSIGNED_ELEMENT:
				return assignedElement != null;
			case UncertaintyPackage.UNCERTAINTY__UNCERTAINTY_TYPE:
				return uncertaintyType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UncertaintyImpl
