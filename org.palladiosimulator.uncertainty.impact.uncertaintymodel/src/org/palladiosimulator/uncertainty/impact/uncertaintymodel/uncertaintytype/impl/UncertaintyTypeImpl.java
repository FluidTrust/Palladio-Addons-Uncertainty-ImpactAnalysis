/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncertainty Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getImpactOn <em>Impact On</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getAssignableElementType <em>Assignable Element Type</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getInformationAvailability <em>Information Availability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getManageability <em>Manageability</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getImpactOnConfidentiality <em>Impact On Confidentiality</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getSeverityOfImpact <em>Severity Of Impact</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getResolutionTime <em>Resolution Time</em>}</li>
 *   <li>{@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl.UncertaintyTypeImpl#getRootCause <em>Root Cause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncertaintyTypeImpl extends IdentifierImpl implements UncertaintyType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImpactOn() <em>Impact On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactOn()
	 * @generated
	 * @ordered
	 */
	protected EList<PalladioElementType> impactOn;

	/**
	 * The cached value of the '{@link #getAssignableElementType() <em>Assignable Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignableElementType()
	 * @generated
	 * @ordered
	 */
	protected PalladioElementType assignableElementType;

	/**
	 * The cached value of the '{@link #getResolvedBy() <em>Resolved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedBy()
	 * @generated
	 * @ordered
	 */
	protected ADD resolvedBy;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final Location LOCATION_EDEFAULT = Location.SYSTEM_STRUCTURE;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformationAvailability() <em>Information Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final InformationAvailability INFORMATION_AVAILABILITY_EDEFAULT = InformationAvailability.STATISTICAL_UNCERTAINTY;

	/**
	 * The cached value of the '{@link #getInformationAvailability() <em>Information Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationAvailability()
	 * @generated
	 * @ordered
	 */
	protected InformationAvailability informationAvailability = INFORMATION_AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final Nature NATURE_EDEFAULT = Nature.ALEATORY;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected Nature nature = NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getManageability() <em>Manageability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageability()
	 * @generated
	 * @ordered
	 */
	protected static final Manageability MANAGEABILITY_EDEFAULT = Manageability.FULLY_REDUCIBLE;

	/**
	 * The cached value of the '{@link #getManageability() <em>Manageability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManageability()
	 * @generated
	 * @ordered
	 */
	protected Manageability manageability = MANAGEABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpactOnConfidentiality() <em>Impact On Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactOnConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final ImpactOnConfidentiality IMPACT_ON_CONFIDENTIALITY_EDEFAULT = ImpactOnConfidentiality.DIRECT;

	/**
	 * The cached value of the '{@link #getImpactOnConfidentiality() <em>Impact On Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpactOnConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected ImpactOnConfidentiality impactOnConfidentiality = IMPACT_ON_CONFIDENTIALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverityOfImpact() <em>Severity Of Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityOfImpact()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityOfImpact SEVERITY_OF_IMPACT_EDEFAULT = SeverityOfImpact.HIGH;

	/**
	 * The cached value of the '{@link #getSeverityOfImpact() <em>Severity Of Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityOfImpact()
	 * @generated
	 * @ordered
	 */
	protected SeverityOfImpact severityOfImpact = SEVERITY_OF_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionTime() <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final ResolutionTime RESOLUTION_TIME_EDEFAULT = ResolutionTime.REQUIREMENTS_TIME;

	/**
	 * The cached value of the '{@link #getResolutionTime() <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionTime()
	 * @generated
	 * @ordered
	 */
	protected ResolutionTime resolutionTime = RESOLUTION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected static final RootCause ROOT_CAUSE_EDEFAULT = RootCause.ASSUMPTION;

	/**
	 * The cached value of the '{@link #getRootCause() <em>Root Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCause()
	 * @generated
	 * @ordered
	 */
	protected RootCause rootCause = ROOT_CAUSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PalladioElementType> getImpactOn() {
		if (impactOn == null) {
			impactOn = new EObjectResolvingEList<PalladioElementType>(PalladioElementType.class, this, UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON);
		}
		return impactOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementType getAssignableElementType() {
		if (assignableElementType != null && assignableElementType.eIsProxy()) {
			InternalEObject oldAssignableElementType = (InternalEObject)assignableElementType;
			assignableElementType = (PalladioElementType)eResolveProxy(oldAssignableElementType);
			if (assignableElementType != oldAssignableElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE, oldAssignableElementType, assignableElementType));
			}
		}
		return assignableElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementType basicGetAssignableElementType() {
		return assignableElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignableElementType(PalladioElementType newAssignableElementType) {
		PalladioElementType oldAssignableElementType = assignableElementType;
		assignableElementType = newAssignableElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE, oldAssignableElementType, assignableElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADD getResolvedBy() {
		if (resolvedBy != null && resolvedBy.eIsProxy()) {
			InternalEObject oldResolvedBy = (InternalEObject)resolvedBy;
			resolvedBy = (ADD)eResolveProxy(oldResolvedBy);
			if (resolvedBy != oldResolvedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLVED_BY, oldResolvedBy, resolvedBy));
			}
		}
		return resolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADD basicGetResolvedBy() {
		return resolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedBy(ADD newResolvedBy) {
		ADD oldResolvedBy = resolvedBy;
		resolvedBy = newResolvedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLVED_BY, oldResolvedBy, resolvedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationAvailability getInformationAvailability() {
		return informationAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationAvailability(InformationAvailability newInformationAvailability) {
		InformationAvailability oldInformationAvailability = informationAvailability;
		informationAvailability = newInformationAvailability == null ? INFORMATION_AVAILABILITY_EDEFAULT : newInformationAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY, oldInformationAvailability, informationAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(Nature newNature) {
		Nature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manageability getManageability() {
		return manageability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManageability(Manageability newManageability) {
		Manageability oldManageability = manageability;
		manageability = newManageability == null ? MANAGEABILITY_EDEFAULT : newManageability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__MANAGEABILITY, oldManageability, manageability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactOnConfidentiality getImpactOnConfidentiality() {
		return impactOnConfidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactOnConfidentiality(ImpactOnConfidentiality newImpactOnConfidentiality) {
		ImpactOnConfidentiality oldImpactOnConfidentiality = impactOnConfidentiality;
		impactOnConfidentiality = newImpactOnConfidentiality == null ? IMPACT_ON_CONFIDENTIALITY_EDEFAULT : newImpactOnConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY, oldImpactOnConfidentiality, impactOnConfidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityOfImpact getSeverityOfImpact() {
		return severityOfImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverityOfImpact(SeverityOfImpact newSeverityOfImpact) {
		SeverityOfImpact oldSeverityOfImpact = severityOfImpact;
		severityOfImpact = newSeverityOfImpact == null ? SEVERITY_OF_IMPACT_EDEFAULT : newSeverityOfImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT, oldSeverityOfImpact, severityOfImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionTime getResolutionTime() {
		return resolutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionTime(ResolutionTime newResolutionTime) {
		ResolutionTime oldResolutionTime = resolutionTime;
		resolutionTime = newResolutionTime == null ? RESOLUTION_TIME_EDEFAULT : newResolutionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLUTION_TIME, oldResolutionTime, resolutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootCause getRootCause() {
		return rootCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootCause(RootCause newRootCause) {
		RootCause oldRootCause = rootCause;
		rootCause = newRootCause == null ? ROOT_CAUSE_EDEFAULT : newRootCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UncertaintyTypePackage.UNCERTAINTY_TYPE__ROOT_CAUSE, oldRootCause, rootCause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NAME:
				return getName();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON:
				return getImpactOn();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE:
				if (resolve) return getAssignableElementType();
				return basicGetAssignableElementType();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLVED_BY:
				if (resolve) return getResolvedBy();
				return basicGetResolvedBy();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__LOCATION:
				return getLocation();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY:
				return getInformationAvailability();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NATURE:
				return getNature();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__MANAGEABILITY:
				return getManageability();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY:
				return getImpactOnConfidentiality();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT:
				return getSeverityOfImpact();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLUTION_TIME:
				return getResolutionTime();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ROOT_CAUSE:
				return getRootCause();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NAME:
				setName((String)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON:
				getImpactOn().clear();
				getImpactOn().addAll((Collection<? extends PalladioElementType>)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE:
				setAssignableElementType((PalladioElementType)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLVED_BY:
				setResolvedBy((ADD)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__LOCATION:
				setLocation((Location)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY:
				setInformationAvailability((InformationAvailability)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NATURE:
				setNature((Nature)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__MANAGEABILITY:
				setManageability((Manageability)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY:
				setImpactOnConfidentiality((ImpactOnConfidentiality)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT:
				setSeverityOfImpact((SeverityOfImpact)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLUTION_TIME:
				setResolutionTime((ResolutionTime)newValue);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ROOT_CAUSE:
				setRootCause((RootCause)newValue);
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
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON:
				getImpactOn().clear();
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE:
				setAssignableElementType((PalladioElementType)null);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLVED_BY:
				setResolvedBy((ADD)null);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY:
				setInformationAvailability(INFORMATION_AVAILABILITY_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__MANAGEABILITY:
				setManageability(MANAGEABILITY_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY:
				setImpactOnConfidentiality(IMPACT_ON_CONFIDENTIALITY_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT:
				setSeverityOfImpact(SEVERITY_OF_IMPACT_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLUTION_TIME:
				setResolutionTime(RESOLUTION_TIME_EDEFAULT);
				return;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ROOT_CAUSE:
				setRootCause(ROOT_CAUSE_EDEFAULT);
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
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON:
				return impactOn != null && !impactOn.isEmpty();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE:
				return assignableElementType != null;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLVED_BY:
				return resolvedBy != null;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__LOCATION:
				return location != LOCATION_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY:
				return informationAvailability != INFORMATION_AVAILABILITY_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NATURE:
				return nature != NATURE_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__MANAGEABILITY:
				return manageability != MANAGEABILITY_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY:
				return impactOnConfidentiality != IMPACT_ON_CONFIDENTIALITY_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT:
				return severityOfImpact != SEVERITY_OF_IMPACT_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLUTION_TIME:
				return resolutionTime != RESOLUTION_TIME_EDEFAULT;
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ROOT_CAUSE:
				return rootCause != ROOT_CAUSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", location: ");
		result.append(location);
		result.append(", informationAvailability: ");
		result.append(informationAvailability);
		result.append(", nature: ");
		result.append(nature);
		result.append(", manageability: ");
		result.append(manageability);
		result.append(", impactOnConfidentiality: ");
		result.append(impactOnConfidentiality);
		result.append(", severityOfImpact: ");
		result.append(severityOfImpact);
		result.append(", resolutionTime: ");
		result.append(resolutionTime);
		result.append(", rootCause: ");
		result.append(rootCause);
		result.append(')');
		return result.toString();
	}

} //UncertaintyTypeImpl
