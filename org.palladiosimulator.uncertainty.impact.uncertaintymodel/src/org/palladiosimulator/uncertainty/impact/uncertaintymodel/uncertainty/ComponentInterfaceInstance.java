/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getComponentInterfaceInstance()
 * @model
 * @generated
 */
public interface ComponentInterfaceInstance extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getComponentInterfaceInstance_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Role)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getComponentInterfaceInstance_Interface()
	 * @model required="true"
	 * @generated
	 */
	Role getInterface();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Role value);

} // ComponentInterfaceInstance
