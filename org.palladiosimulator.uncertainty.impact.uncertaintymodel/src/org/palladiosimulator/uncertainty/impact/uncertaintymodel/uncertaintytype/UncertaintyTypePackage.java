/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeFactory
 * @model kind="package"
 * @generated
 */
public interface UncertaintyTypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uncertaintytype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uncertaintyType";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uncertaintytype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UncertaintyTypePackage eINSTANCE = org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl <em>Uncertainty Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getUncertaintyType()
	 * @generated
	 */
	int UNCERTAINTY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Impact On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__IMPACT_ON = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignable Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__RESOLVED_BY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__LOCATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Information Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__NATURE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Manageability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__MANAGEABILITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Impact On Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Severity Of Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__RESOLUTION_TIME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Root Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE__ROOT_CAUSE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Uncertainty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Uncertainty Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @ordered
	 */
	int UNCERTAINTY_TYPE_OPERATION_COUNT =  0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeContainerImpl
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getUncertaintyTypeContainer()
	 * @generated
	 */
	int UNCERTAINTY_TYPE_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Uncertainty Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_TYPE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature <em>Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 2;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location <em>Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability <em>Information Availability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getInformationAvailability()
	 * @generated
	 */
	int INFORMATION_AVAILABILITY = 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability <em>Manageability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getManageability()
	 * @generated
	 */
	int MANAGEABILITY = 5;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality <em>Impact On Confidentiality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getImpactOnConfidentiality()
	 * @generated
	 */
	int IMPACT_ON_CONFIDENTIALITY = 6;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact <em>Severity Of Impact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getSeverityOfImpact()
	 * @generated
	 */
	int SEVERITY_OF_IMPACT = 7;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime <em>Resolution Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getResolutionTime()
	 * @generated
	 */
	int RESOLUTION_TIME = 8;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause <em>Root Cause</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getRootCause()
	 * @generated
	 */
	int ROOT_CAUSE = 9;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType <em>Uncertainty Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType
	 * @generated
	 */
	EClass getUncertaintyType();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getName()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOn <em>Impact On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impact On</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOn()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EReference getUncertaintyType_ImpactOn();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getAssignableElementType <em>Assignable Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignable Element Type</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getAssignableElementType()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EReference getUncertaintyType_AssignableElementType();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved By</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolvedBy()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EReference getUncertaintyType_ResolvedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getLocation()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getInformationAvailability <em>Information Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information Availability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getInformationAvailability()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_InformationAvailability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getNature()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_Nature();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getManageability <em>Manageability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manageability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getManageability()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_Manageability();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOnConfidentiality <em>Impact On Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impact On Confidentiality</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getImpactOnConfidentiality()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_ImpactOnConfidentiality();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getSeverityOfImpact <em>Severity Of Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Of Impact</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getSeverityOfImpact()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_SeverityOfImpact();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolutionTime <em>Resolution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Time</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getResolutionTime()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_ResolutionTime();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getRootCause <em>Root Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Cause</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType#getRootCause()
	 * @see #getUncertaintyType()
	 * @generated
	 */
	EAttribute getUncertaintyType_RootCause();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer
	 * @generated
	 */
	EClass getUncertaintyTypeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer#getUncertaintyTypes <em>Uncertainty Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uncertainty Types</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeContainer#getUncertaintyTypes()
	 * @see #getUncertaintyTypeContainer()
	 * @generated
	 */
	EReference getUncertaintyTypeContainer_UncertaintyTypes();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nature</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature
	 * @generated
	 */
	EEnum getNature();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location
	 * @generated
	 */
	EEnum getLocation();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability <em>Information Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Information Availability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability
	 * @generated
	 */
	EEnum getInformationAvailability();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability <em>Manageability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Manageability</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability
	 * @generated
	 */
	EEnum getManageability();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality <em>Impact On Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Impact On Confidentiality</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality
	 * @generated
	 */
	EEnum getImpactOnConfidentiality();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact <em>Severity Of Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Of Impact</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact
	 * @generated
	 */
	EEnum getSeverityOfImpact();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime <em>Resolution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution Time</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime
	 * @generated
	 */
	EEnum getResolutionTime();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause <em>Root Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Root Cause</em>'.
	 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause
	 * @generated
	 */
	EEnum getRootCause();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UncertaintyTypeFactory getUncertaintyTypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl <em>Uncertainty Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getUncertaintyType()
		 * @generated
		 */
		EClass UNCERTAINTY_TYPE = eINSTANCE.getUncertaintyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__NAME = eINSTANCE.getUncertaintyType_Name();

		/**
		 * The meta object literal for the '<em><b>Impact On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TYPE__IMPACT_ON = eINSTANCE.getUncertaintyType_ImpactOn();

		/**
		 * The meta object literal for the '<em><b>Assignable Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE = eINSTANCE.getUncertaintyType_AssignableElementType();

		/**
		 * The meta object literal for the '<em><b>Resolved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TYPE__RESOLVED_BY = eINSTANCE.getUncertaintyType_ResolvedBy();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__LOCATION = eINSTANCE.getUncertaintyType_Location();

		/**
		 * The meta object literal for the '<em><b>Information Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY = eINSTANCE.getUncertaintyType_InformationAvailability();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__NATURE = eINSTANCE.getUncertaintyType_Nature();

		/**
		 * The meta object literal for the '<em><b>Manageability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__MANAGEABILITY = eINSTANCE.getUncertaintyType_Manageability();

		/**
		 * The meta object literal for the '<em><b>Impact On Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY = eINSTANCE.getUncertaintyType_ImpactOnConfidentiality();

		/**
		 * The meta object literal for the '<em><b>Severity Of Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT = eINSTANCE.getUncertaintyType_SeverityOfImpact();

		/**
		 * The meta object literal for the '<em><b>Resolution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__RESOLUTION_TIME = eINSTANCE.getUncertaintyType_ResolutionTime();

		/**
		 * The meta object literal for the '<em><b>Root Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY_TYPE__ROOT_CAUSE = eINSTANCE.getUncertaintyType_RootCause();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeContainerImpl
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getUncertaintyTypeContainer()
		 * @generated
		 */
		EClass UNCERTAINTY_TYPE_CONTAINER = eINSTANCE.getUncertaintyTypeContainer();

		/**
		 * The meta object literal for the '<em><b>Uncertainty Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCERTAINTY_TYPE_CONTAINER__UNCERTAINTY_TYPES = eINSTANCE.getUncertaintyTypeContainer_UncertaintyTypes();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature <em>Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getNature()
		 * @generated
		 */
		EEnum NATURE = eINSTANCE.getNature();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location <em>Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getLocation()
		 * @generated
		 */
		EEnum LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability <em>Information Availability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getInformationAvailability()
		 * @generated
		 */
		EEnum INFORMATION_AVAILABILITY = eINSTANCE.getInformationAvailability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability <em>Manageability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getManageability()
		 * @generated
		 */
		EEnum MANAGEABILITY = eINSTANCE.getManageability();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality <em>Impact On Confidentiality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getImpactOnConfidentiality()
		 * @generated
		 */
		EEnum IMPACT_ON_CONFIDENTIALITY = eINSTANCE.getImpactOnConfidentiality();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact <em>Severity Of Impact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getSeverityOfImpact()
		 * @generated
		 */
		EEnum SEVERITY_OF_IMPACT = eINSTANCE.getSeverityOfImpact();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime <em>Resolution Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getResolutionTime()
		 * @generated
		 */
		EEnum RESOLUTION_TIME = eINSTANCE.getResolutionTime();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause <em>Root Cause</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause
		 * @see org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypePackageImpl#getRootCause()
		 * @generated
		 */
		EEnum ROOT_CAUSE = eINSTANCE.getRootCause();

	}

} //UncertaintyTypePackage
