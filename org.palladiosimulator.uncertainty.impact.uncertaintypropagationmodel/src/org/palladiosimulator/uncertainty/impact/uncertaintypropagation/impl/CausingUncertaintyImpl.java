/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causing Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.CausingUncertaintyImpl#getCausingUncertainty <em>Causing Uncertainty</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.impl.CausingUncertaintyImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CausingUncertaintyImpl extends IdentifierImpl implements CausingUncertainty {
	/**
	 * The cached value of the '{@link #getCausingUncertainty() <em>Causing Uncertainty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausingUncertainty()
	 * @generated
	 * @ordered
	 */
	protected Uncertainty causingUncertainty;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> path;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CausingUncertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintypropagationPackage.Literals.CAUSING_UNCERTAINTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty getCausingUncertainty() {
		if (causingUncertainty != null && causingUncertainty.eIsProxy()) {
			InternalEObject oldCausingUncertainty = (InternalEObject)causingUncertainty;
			causingUncertainty = (Uncertainty)eResolveProxy(oldCausingUncertainty);
			if (causingUncertainty != oldCausingUncertainty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintypropagationPackage.CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY, oldCausingUncertainty, causingUncertainty));
			}
		}
		return causingUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty basicGetCausingUncertainty() {
		return causingUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausingUncertainty(Uncertainty newCausingUncertainty) {
		Uncertainty oldCausingUncertainty = causingUncertainty;
		causingUncertainty = newCausingUncertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintypropagationPackage.CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY, oldCausingUncertainty, causingUncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getPath() {
		if (path == null) {
			path = new EObjectResolvingEList<Entity>(Entity.class, this, UncertaintypropagationPackage.CAUSING_UNCERTAINTY__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY:
				if (resolve) return getCausingUncertainty();
				return basicGetCausingUncertainty();
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__PATH:
				return getPath();
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
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY:
				setCausingUncertainty((Uncertainty)newValue);
				return;
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends Entity>)newValue);
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
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY:
				setCausingUncertainty((Uncertainty)null);
				return;
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__PATH:
				getPath().clear();
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
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__CAUSING_UNCERTAINTY:
				return causingUncertainty != null;
			case UncertaintypropagationPackage.CAUSING_UNCERTAINTY__PATH:
				return path != null && !path.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CausingUncertaintyImpl
