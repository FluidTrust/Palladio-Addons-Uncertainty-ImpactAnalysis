/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAddClass <em>Add Class</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAmountOfAlternatives <em>Amount Of Alternatives</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getProbabilityOfRevisability <em>Probability Of Revisability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getPossibilityOfRevisability <em>Possibility Of Revisability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getCostsOfRevision <em>Costs Of Revision</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD()
 * @model
 * @generated
 */
public interface ADD extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Add Class</b></em>' attribute.
	 * The default value is <code>"STRUCTURAL_DECISION"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Class</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass
	 * @see #setAddClass(ADDClass)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD_AddClass()
	 * @model default="STRUCTURAL_DECISION"
	 * @generated
	 */
	ADDClass getAddClass();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAddClass <em>Add Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Class</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass
	 * @see #getAddClass()
	 * @generated
	 */
	void setAddClass(ADDClass value);

	/**
	 * Returns the value of the '<em><b>Amount Of Alternatives</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Alternatives</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives
	 * @see #setAmountOfAlternatives(AmountOfAlternatives)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD_AmountOfAlternatives()
	 * @model
	 * @generated
	 */
	AmountOfAlternatives getAmountOfAlternatives();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getAmountOfAlternatives <em>Amount Of Alternatives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Alternatives</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives
	 * @see #getAmountOfAlternatives()
	 * @generated
	 */
	void setAmountOfAlternatives(AmountOfAlternatives value);

	/**
	 * Returns the value of the '<em><b>Probability Of Revisability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Of Revisability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability
	 * @see #setProbabilityOfRevisability(ProbabilityOfRevisability)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD_ProbabilityOfRevisability()
	 * @model
	 * @generated
	 */
	ProbabilityOfRevisability getProbabilityOfRevisability();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getProbabilityOfRevisability <em>Probability Of Revisability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Of Revisability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability
	 * @see #getProbabilityOfRevisability()
	 * @generated
	 */
	void setProbabilityOfRevisability(ProbabilityOfRevisability value);

	/**
	 * Returns the value of the '<em><b>Possibility Of Revisability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possibility Of Revisability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability
	 * @see #setPossibilityOfRevisability(PossibilityOfRevisability)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD_PossibilityOfRevisability()
	 * @model
	 * @generated
	 */
	PossibilityOfRevisability getPossibilityOfRevisability();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getPossibilityOfRevisability <em>Possibility Of Revisability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possibility Of Revisability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability
	 * @see #getPossibilityOfRevisability()
	 * @generated
	 */
	void setPossibilityOfRevisability(PossibilityOfRevisability value);

	/**
	 * Returns the value of the '<em><b>Costs Of Revision</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs Of Revision</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision
	 * @see #setCostsOfRevision(CostsOfRevision)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddPackage#getADD_CostsOfRevision()
	 * @model
	 * @generated
	 */
	CostsOfRevision getCostsOfRevision();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD#getCostsOfRevision <em>Costs Of Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs Of Revision</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision
	 * @see #getCostsOfRevision()
	 * @generated
	 */
	void setCostsOfRevision(CostsOfRevision value);

} // ADD
