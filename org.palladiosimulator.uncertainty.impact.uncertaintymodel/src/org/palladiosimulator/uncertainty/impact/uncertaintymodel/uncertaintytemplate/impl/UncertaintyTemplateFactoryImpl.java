/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytemplate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyTemplateFactoryImpl extends EFactoryImpl implements UncertaintyTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UncertaintyTemplateFactory init() {
		try {
			UncertaintyTemplateFactory theUncertaintyTemplateFactory = (UncertaintyTemplateFactory)EPackage.Registry.INSTANCE.getEFactory(UncertaintyTemplatePackage.eNS_URI);
			if (theUncertaintyTemplateFactory != null) {
				return theUncertaintyTemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UncertaintyTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTemplateFactoryImpl() {
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
			case UncertaintyTemplatePackage.UNCERTAINTY_TEMPLATE: return createUncertaintyTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTemplate createUncertaintyTemplate() {
		UncertaintyTemplateImpl uncertaintyTemplate = new UncertaintyTemplateImpl();
		return uncertaintyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTemplatePackage getUncertaintyTemplatePackage() {
		return (UncertaintyTemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UncertaintyTemplatePackage getPackage() {
		return UncertaintyTemplatePackage.eINSTANCE;
	}

} //UncertaintyTemplateFactoryImpl
