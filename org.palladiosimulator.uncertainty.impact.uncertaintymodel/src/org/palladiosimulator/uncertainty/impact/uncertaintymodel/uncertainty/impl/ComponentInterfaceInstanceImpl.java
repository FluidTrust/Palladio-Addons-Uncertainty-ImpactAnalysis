/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.repository.Role;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.ComponentInterfaceInstanceImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl.ComponentInterfaceInstanceImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceInstanceImpl extends EntityImpl implements ComponentInterfaceInstance {
	/**
	 * The cached value of the '{@link #getAssemblyContext() <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyContext()
	 * @generated
	 * @ordered
	 */
	protected AssemblyContext assemblyContext;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Role interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyPackage.Literals.COMPONENT_INTERFACE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		if (assemblyContext != null && ((EObject)assemblyContext).eIsProxy()) {
			InternalEObject oldAssemblyContext = (InternalEObject)assemblyContext;
			assemblyContext = (AssemblyContext)eResolveProxy(oldAssemblyContext);
			if (assemblyContext != oldAssemblyContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
			}
		}
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return assemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		AssemblyContext oldAssemblyContext = assemblyContext;
		assemblyContext = newAssemblyContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT, oldAssemblyContext, assemblyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getInterface() {
		if (interface_ != null && ((EObject)interface_).eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (Role)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Role newInterface) {
		Role oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
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
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
				return;
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__INTERFACE:
				setInterface((Role)newValue);
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
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
				return;
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__INTERFACE:
				setInterface((Role)null);
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
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__ASSEMBLY_CONTEXT:
				return assemblyContext != null;
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE__INTERFACE:
				return interface_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentInterfaceInstanceImpl
