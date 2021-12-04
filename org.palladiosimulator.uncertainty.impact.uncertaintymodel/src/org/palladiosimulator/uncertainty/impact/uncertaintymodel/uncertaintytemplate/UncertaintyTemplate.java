/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDContainer;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeContainer;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uncertainty Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getAddContainer <em>Add Container</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getPalladioElementTypeContainer <em>Palladio Element Type Container</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getUncertaintyTypeContainer <em>Uncertainty Type Container</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage#getUncertaintyTemplate()
 * @model
 * @generated
 */
public interface UncertaintyTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Add Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Container</em>' reference.
	 * @see #setAddContainer(ADDContainer)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage#getUncertaintyTemplate_AddContainer()
	 * @model required="true"
	 * @generated
	 */
	ADDContainer getAddContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getAddContainer <em>Add Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Container</em>' reference.
	 * @see #getAddContainer()
	 * @generated
	 */
	void setAddContainer(ADDContainer value);

	/**
	 * Returns the value of the '<em><b>Palladio Element Type Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palladio Element Type Container</em>' reference.
	 * @see #setPalladioElementTypeContainer(PalladioElementTypeContainer)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage#getUncertaintyTemplate_PalladioElementTypeContainer()
	 * @model required="true"
	 * @generated
	 */
	PalladioElementTypeContainer getPalladioElementTypeContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getPalladioElementTypeContainer <em>Palladio Element Type Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palladio Element Type Container</em>' reference.
	 * @see #getPalladioElementTypeContainer()
	 * @generated
	 */
	void setPalladioElementTypeContainer(PalladioElementTypeContainer value);

	/**
	 * Returns the value of the '<em><b>Uncertainty Type Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty Type Container</em>' reference.
	 * @see #setUncertaintyTypeContainer(UncertaintyTypeContainer)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplatePackage#getUncertaintyTemplate_UncertaintyTypeContainer()
	 * @model required="true"
	 * @generated
	 */
	UncertaintyTypeContainer getUncertaintyTypeContainer();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.UncertaintyTemplate#getUncertaintyTypeContainer <em>Uncertainty Type Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty Type Container</em>' reference.
	 * @see #getUncertaintyTypeContainer()
	 * @generated
	 */
	void setUncertaintyTypeContainer(UncertaintyTypeContainer value);

} // UncertaintyTemplate
