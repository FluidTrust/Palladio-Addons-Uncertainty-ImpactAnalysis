/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyFactoryImpl extends EFactoryImpl implements UncertaintyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UncertaintyFactory init() {
		try {
			UncertaintyFactory theUncertaintyFactory = (UncertaintyFactory)EPackage.Registry.INSTANCE.getEFactory(UncertaintyPackage.eNS_URI);
			if (theUncertaintyFactory != null) {
				return theUncertaintyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UncertaintyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFactoryImpl() {
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
			case UncertaintyPackage.PALLADIO_ELEMENT_WRAPPER: return createPalladioElementWrapper();
			case UncertaintyPackage.UNCERTAINTY: return createUncertainty();
			case UncertaintyPackage.UNCERTAINTY_CONTAINER: return createUncertaintyContainer();
			case UncertaintyPackage.COMPONENT_INTERFACE_INSTANCE: return createComponentInterfaceInstance();
			case UncertaintyPackage.BASIC_COMPONENT_BEHAVIOUR: return createBasicComponentBehaviour();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PalladioElementWrapper createPalladioElementWrapper() {
		PalladioElementWrapperImpl palladioElementWrapper = new PalladioElementWrapperImpl();
		return palladioElementWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty createUncertainty() {
		UncertaintyImpl uncertainty = new UncertaintyImpl();
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyContainer createUncertaintyContainer() {
		UncertaintyContainerImpl uncertaintyContainer = new UncertaintyContainerImpl();
		return uncertaintyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceInstance createComponentInterfaceInstance() {
		ComponentInterfaceInstanceImpl componentInterfaceInstance = new ComponentInterfaceInstanceImpl();
		return componentInterfaceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicComponentBehaviour createBasicComponentBehaviour() {
		BasicComponentBehaviourImpl basicComponentBehaviour = new BasicComponentBehaviourImpl();
		return basicComponentBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyPackage getUncertaintyPackage() {
		return (UncertaintyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UncertaintyPackage getPackage() {
		return UncertaintyPackage.eINSTANCE;
	}

} //UncertaintyFactoryImpl
