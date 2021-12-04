/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddFactoryImpl extends EFactoryImpl implements AddFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AddFactory init() {
		try {
			AddFactory theAddFactory = (AddFactory)EPackage.Registry.INSTANCE.getEFactory(AddPackage.eNS_URI);
			if (theAddFactory != null) {
				return theAddFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AddFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddFactoryImpl() {
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
			case AddPackage.ADD_CONTAINER: return createADDContainer();
			case AddPackage.ADD: return createADD();
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
			case AddPackage.ADD_CLASS:
				return createADDClassFromString(eDataType, initialValue);
			case AddPackage.AMOUNT_OF_ALTERNATIVES:
				return createAmountOfAlternativesFromString(eDataType, initialValue);
			case AddPackage.PROBABILITY_OF_REVISABILITY:
				return createProbabilityOfRevisabilityFromString(eDataType, initialValue);
			case AddPackage.POSSIBILITY_OF_REVISABILITY:
				return createPossibilityOfRevisabilityFromString(eDataType, initialValue);
			case AddPackage.COSTS_OF_REVISION:
				return createCostsOfRevisionFromString(eDataType, initialValue);
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
			case AddPackage.ADD_CLASS:
				return convertADDClassToString(eDataType, instanceValue);
			case AddPackage.AMOUNT_OF_ALTERNATIVES:
				return convertAmountOfAlternativesToString(eDataType, instanceValue);
			case AddPackage.PROBABILITY_OF_REVISABILITY:
				return convertProbabilityOfRevisabilityToString(eDataType, instanceValue);
			case AddPackage.POSSIBILITY_OF_REVISABILITY:
				return convertPossibilityOfRevisabilityToString(eDataType, instanceValue);
			case AddPackage.COSTS_OF_REVISION:
				return convertCostsOfRevisionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDContainer createADDContainer() {
		ADDContainerImpl addContainer = new ADDContainerImpl();
		return addContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADD createADD() {
		ADDImpl add = new ADDImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDClass createADDClassFromString(EDataType eDataType, String initialValue) {
		ADDClass result = ADDClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertADDClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountOfAlternatives createAmountOfAlternativesFromString(EDataType eDataType, String initialValue) {
		AmountOfAlternatives result = AmountOfAlternatives.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmountOfAlternativesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityOfRevisability createProbabilityOfRevisabilityFromString(EDataType eDataType, String initialValue) {
		ProbabilityOfRevisability result = ProbabilityOfRevisability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbabilityOfRevisabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibilityOfRevisability createPossibilityOfRevisabilityFromString(EDataType eDataType, String initialValue) {
		PossibilityOfRevisability result = PossibilityOfRevisability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPossibilityOfRevisabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostsOfRevision createCostsOfRevisionFromString(EDataType eDataType, String initialValue) {
		CostsOfRevision result = CostsOfRevision.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCostsOfRevisionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPackage getAddPackage() {
		return (AddPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AddPackage getPackage() {
		return AddPackage.eINSTANCE;
	}

} //AddFactoryImpl
