/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Causing Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getCausingUncertainty <em>Causing Uncertainty</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getCausingUncertainty()
 * @model
 * @generated
 */
public interface CausingUncertainty extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Causing Uncertainty</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causing Uncertainty</em>' reference.
	 * @see #setCausingUncertainty(Uncertainty)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getCausingUncertainty_CausingUncertainty()
	 * @model required="true"
	 * @generated
	 */
	Uncertainty getCausingUncertainty();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty#getCausingUncertainty <em>Causing Uncertainty</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causing Uncertainty</em>' reference.
	 * @see #getCausingUncertainty()
	 * @generated
	 */
	void setCausingUncertainty(Uncertainty value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.entity.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage#getCausingUncertainty_Path()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getPath();

} // CausingUncertainty
