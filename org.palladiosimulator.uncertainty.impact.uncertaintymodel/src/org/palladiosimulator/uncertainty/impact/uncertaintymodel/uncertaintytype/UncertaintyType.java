/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uncertainty Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getInformationAvailability <em>Information Availability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getNature <em>Nature</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getManageability <em>Manageability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOnConfidentiality <em>Impact On Confidentiality</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getSeverityOfImpact <em>Severity Of Impact</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolutionTime <em>Resolution Time</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getRootCause <em>Root Cause</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getAssignableElementType <em>Assignable Element Type</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOnElementTypes <em>Impact On Element Types</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType()
 * @model
 * @generated
 */
public interface UncertaintyType extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference.
	 * @see #setResolvedBy(ADD)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_ResolvedBy()
	 * @model
	 * @generated
	 */
	ADD getResolvedBy();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolvedBy <em>Resolved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved By</em>' reference.
	 * @see #getResolvedBy()
	 * @generated
	 */
	void setResolvedBy(ADD value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location
	 * @see #setLocation(Location)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Information Availability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Availability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability
	 * @see #setInformationAvailability(InformationAvailability)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_InformationAvailability()
	 * @model
	 * @generated
	 */
	InformationAvailability getInformationAvailability();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getInformationAvailability <em>Information Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Availability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability
	 * @see #getInformationAvailability()
	 * @generated
	 */
	void setInformationAvailability(InformationAvailability value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature
	 * @see #setNature(Nature)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_Nature()
	 * @model
	 * @generated
	 */
	Nature getNature();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(Nature value);

	/**
	 * Returns the value of the '<em><b>Manageability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manageability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability
	 * @see #setManageability(Manageability)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_Manageability()
	 * @model
	 * @generated
	 */
	Manageability getManageability();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getManageability <em>Manageability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manageability</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability
	 * @see #getManageability()
	 * @generated
	 */
	void setManageability(Manageability value);

	/**
	 * Returns the value of the '<em><b>Impact On Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact On Confidentiality</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality
	 * @see #setImpactOnConfidentiality(ImpactOnConfidentiality)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_ImpactOnConfidentiality()
	 * @model
	 * @generated
	 */
	ImpactOnConfidentiality getImpactOnConfidentiality();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOnConfidentiality <em>Impact On Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact On Confidentiality</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality
	 * @see #getImpactOnConfidentiality()
	 * @generated
	 */
	void setImpactOnConfidentiality(ImpactOnConfidentiality value);

	/**
	 * Returns the value of the '<em><b>Severity Of Impact</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity Of Impact</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact
	 * @see #setSeverityOfImpact(SeverityOfImpact)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_SeverityOfImpact()
	 * @model
	 * @generated
	 */
	SeverityOfImpact getSeverityOfImpact();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getSeverityOfImpact <em>Severity Of Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity Of Impact</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact
	 * @see #getSeverityOfImpact()
	 * @generated
	 */
	void setSeverityOfImpact(SeverityOfImpact value);

	/**
	 * Returns the value of the '<em><b>Resolution Time</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Time</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime
	 * @see #setResolutionTime(ResolutionTime)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_ResolutionTime()
	 * @model
	 * @generated
	 */
	ResolutionTime getResolutionTime();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolutionTime <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Time</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime
	 * @see #getResolutionTime()
	 * @generated
	 */
	void setResolutionTime(ResolutionTime value);

	/**
	 * Returns the value of the '<em><b>Root Cause</b></em>' attribute.
	 * The default value is <code>"ASSUMPTION"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Cause</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause
	 * @see #setRootCause(RootCause)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_RootCause()
	 * @model default="ASSUMPTION"
	 * @generated
	 */
	RootCause getRootCause();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getRootCause <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Cause</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause
	 * @see #getRootCause()
	 * @generated
	 */
	void setRootCause(RootCause value);

	/**
	 * Returns the value of the '<em><b>Assignable Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignable Element Type</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes
	 * @see #setAssignableElementType(ArchitecturalElementTypes)
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_AssignableElementType()
	 * @model
	 * @generated
	 */
	ArchitecturalElementTypes getAssignableElementType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getAssignableElementType <em>Assignable Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignable Element Type</em>' attribute.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes
	 * @see #getAssignableElementType()
	 * @generated
	 */
	void setAssignableElementType(ArchitecturalElementTypes value);

	/**
	 * Returns the value of the '<em><b>Impact On Element Types</b></em>' attribute list.
	 * The list contents are of type {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes}.
	 * The literals are from the enumeration {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact On Element Types</em>' attribute list.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ArchitecturalElementTypes
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage#getUncertaintyType_ImpactOnElementTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArchitecturalElementTypes> getImpactOnElementTypes();

} // UncertaintyType
