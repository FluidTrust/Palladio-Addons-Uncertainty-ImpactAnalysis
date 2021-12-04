/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PalladioElementTypeFactoryImpl extends EFactoryImpl implements PalladioElementTypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PalladioElementTypeFactory init() {
		try {
			PalladioElementTypeFactory thePalladioElementTypeFactory = (PalladioElementTypeFactory)EPackage.Registry.INSTANCE.getEFactory(PalladioElementTypePackage.eNS_URI);
			if (thePalladioElementTypeFactory != null) {
				return thePalladioElementTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PalladioElementTypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypeFactoryImpl() {
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE: return createPalladioElementType();
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPE_CONTAINER: return createPalladioElementTypeContainer();
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPES:
				return createPalladioElementTypesFromString(eDataType, initialValue);
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
			case PalladioElementTypePackage.PALLADIO_ELEMENT_TYPES:
				return convertPalladioElementTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementType createPalladioElementType() {
		PalladioElementTypeImpl palladioElementType = new PalladioElementTypeImpl();
		return palladioElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypeContainer createPalladioElementTypeContainer() {
		PalladioElementTypeContainerImpl palladioElementTypeContainer = new PalladioElementTypeContainerImpl();
		return palladioElementTypeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypes createPalladioElementTypesFromString(EDataType eDataType, String initialValue) {
		PalladioElementTypes result = PalladioElementTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPalladioElementTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementTypePackage getPalladioElementTypePackage() {
		return (PalladioElementTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PalladioElementTypePackage getPackage() {
		return PalladioElementTypePackage.eINSTANCE;
	}

} //PalladioElementTypeFactoryImpl
