/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyTypeFactoryImpl extends EFactoryImpl implements UncertaintyTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UncertaintyTypeFactory init() {
		try {
			UncertaintyTypeFactory theUncertaintyTypeFactory = (UncertaintyTypeFactory)EPackage.Registry.INSTANCE.getEFactory(UncertaintyTypePackage.eNS_URI);
			if (theUncertaintyTypeFactory != null) {
				return theUncertaintyTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UncertaintyTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UncertaintyTypePackage.UNCERTAINTY_TYPE: return createUncertaintyType();
			case UncertaintyTypePackage.UNCERTAINTY_TYPE_CONTAINER: return createUncertaintyTypeContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UncertaintyTypePackage.NATURE:
				return createNatureFromString(eDataType, initialValue);
			case UncertaintyTypePackage.LOCATION:
				return createLocationFromString(eDataType, initialValue);
			case UncertaintyTypePackage.INFORMATION_AVAILABILITY:
				return createInformationAvailabilityFromString(eDataType, initialValue);
			case UncertaintyTypePackage.MANAGEABILITY:
				return createManageabilityFromString(eDataType, initialValue);
			case UncertaintyTypePackage.IMPACT_ON_CONFIDENTIALITY:
				return createImpactOnConfidentialityFromString(eDataType, initialValue);
			case UncertaintyTypePackage.SEVERITY_OF_IMPACT:
				return createSeverityOfImpactFromString(eDataType, initialValue);
			case UncertaintyTypePackage.RESOLUTION_TIME:
				return createResolutionTimeFromString(eDataType, initialValue);
			case UncertaintyTypePackage.ROOT_CAUSE:
				return createRootCauseFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UncertaintyTypePackage.NATURE:
				return convertNatureToString(eDataType, instanceValue);
			case UncertaintyTypePackage.LOCATION:
				return convertLocationToString(eDataType, instanceValue);
			case UncertaintyTypePackage.INFORMATION_AVAILABILITY:
				return convertInformationAvailabilityToString(eDataType, instanceValue);
			case UncertaintyTypePackage.MANAGEABILITY:
				return convertManageabilityToString(eDataType, instanceValue);
			case UncertaintyTypePackage.IMPACT_ON_CONFIDENTIALITY:
				return convertImpactOnConfidentialityToString(eDataType, instanceValue);
			case UncertaintyTypePackage.SEVERITY_OF_IMPACT:
				return convertSeverityOfImpactToString(eDataType, instanceValue);
			case UncertaintyTypePackage.RESOLUTION_TIME:
				return convertResolutionTimeToString(eDataType, instanceValue);
			case UncertaintyTypePackage.ROOT_CAUSE:
				return convertRootCauseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyType createUncertaintyType() {
		UncertaintyTypeImpl uncertaintyType = new UncertaintyTypeImpl();
		return uncertaintyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypeContainer createUncertaintyTypeContainer() {
		UncertaintyTypeContainerImpl uncertaintyTypeContainer = new UncertaintyTypeContainerImpl();
		return uncertaintyTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nature createNatureFromString(EDataType eDataType, String initialValue) {
		Nature result = Nature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocationFromString(EDataType eDataType, String initialValue) {
		Location result = Location.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationAvailability createInformationAvailabilityFromString(EDataType eDataType, String initialValue) {
		InformationAvailability result = InformationAvailability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInformationAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manageability createManageabilityFromString(EDataType eDataType, String initialValue) {
		Manageability result = Manageability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManageabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactOnConfidentiality createImpactOnConfidentialityFromString(EDataType eDataType, String initialValue) {
		ImpactOnConfidentiality result = ImpactOnConfidentiality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactOnConfidentialityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityOfImpact createSeverityOfImpactFromString(EDataType eDataType, String initialValue) {
		SeverityOfImpact result = SeverityOfImpact.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityOfImpactToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionTime createResolutionTimeFromString(EDataType eDataType, String initialValue) {
		ResolutionTime result = ResolutionTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootCause createRootCauseFromString(EDataType eDataType, String initialValue) {
		RootCause result = RootCause.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRootCauseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypePackage getUncertaintyTypePackage() {
		return (UncertaintyTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UncertaintyTypePackage getPackage() {
		return UncertaintyTypePackage.eINSTANCE;
	}

} //UncertaintyTypeFactoryImpl
