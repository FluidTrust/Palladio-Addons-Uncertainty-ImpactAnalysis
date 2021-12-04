/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface Instance Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer#getComponentInterfaceInstances <em>Component Interface Instances</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getComponentInterfaceInstanceContainer()
 * @model
 * @generated
 */
public interface ComponentInterfaceInstanceContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Interface Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.ComponentInterfaceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Interface Instances</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getComponentInterfaceInstanceContainer_ComponentInterfaceInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInterfaceInstance> getComponentInterfaceInstances();

} // ComponentInterfaceInstanceContainer
