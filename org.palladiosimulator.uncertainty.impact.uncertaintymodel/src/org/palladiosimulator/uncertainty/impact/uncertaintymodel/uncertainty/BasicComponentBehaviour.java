/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Component Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour#getResourceDemandingSEFF <em>Resource Demanding SEFF</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getBasicComponentBehaviour()
 * @model
 * @generated
 */
public interface BasicComponentBehaviour extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Resource Demanding SEFF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Demanding SEFF</em>' reference.
	 * @see #setResourceDemandingSEFF(ResourceDemandingSEFF)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyPackage#getBasicComponentBehaviour_ResourceDemandingSEFF()
	 * @model required="true"
	 * @generated
	 */
	ResourceDemandingSEFF getResourceDemandingSEFF();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.BasicComponentBehaviour#getResourceDemandingSEFF <em>Resource Demanding SEFF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Demanding SEFF</em>' reference.
	 * @see #getResourceDemandingSEFF()
	 * @generated
	 */
	void setResourceDemandingSEFF(ResourceDemandingSEFF value);

} // BasicComponentBehaviour
