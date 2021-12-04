/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ChangePropagationStepItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagationmodel.provider.UCImpactMarksEditPlugin;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyPropagationItemProvider extends ChangePropagationStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyPropagationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UncertaintyPropagation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UncertaintyPropagation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UncertaintyPropagation_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UncertaintyPropagation.class)) {
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER:
			case UncertaintypropagationPackage.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_BEHAVIOURS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtBasicComponentBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_BASIC_COMPONENT_TYPES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtBasicComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_COMPONENTS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtCommunicationComponents()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMMUNICATION_RESOURCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtCommunicationResources()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTE_COMPONENT_INSTANCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_INSTANCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtComponentInterfaceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_COMPONENT_INTERFACE_TYPES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtComponentInterfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_HARDWARE_RESOURCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtHardwareResource()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEMS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtSystem()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_SYSTEM_INTERFACE,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtSystemInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__AFFECTED_USAGE_BEHAVIOURS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtUsageBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__CAUSING_UNCERTAINTIES,
				 UncertaintypropagationFactory.eINSTANCE.createCausingUncertainty()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__COMPONENT_INTERFACE_INSTANCE_CONTAINER,
				 UncertaintypropagationFactory.eINSTANCE.createComponentInterfaceInstanceContainer()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UNCERTAINTY_PROPAGATION__BASIC_COMPONENT_BEHAVIOUR_CONTAINER,
				 UncertaintypropagationFactory.eINSTANCE.createBasicComponentBehaviourContainer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UCImpactMarksEditPlugin.INSTANCE;
	}

}
