/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component Behaviour Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer#getBasicComponentBehaviours <em>Basic Component Behaviours</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getBasicComponentBehaviourContainer()
 * @model
 * @generated
 */
public interface BasicComponentBehaviourContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic Component Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Component Behaviours</em>' containment reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getBasicComponentBehaviourContainer_BasicComponentBehaviours()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicComponentBehaviour> getBasicComponentBehaviours();

} // BasicComponentBehaviourContainer
