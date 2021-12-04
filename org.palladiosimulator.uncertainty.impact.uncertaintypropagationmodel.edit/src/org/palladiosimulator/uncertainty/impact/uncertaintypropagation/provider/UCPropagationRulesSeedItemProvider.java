/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.AbstractSeedModificationsItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintypropagationPackage;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagationmodel.provider.UCImpactMarksEditPlugin;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UCPropagationRulesSeedItemProvider extends AbstractSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UCPropagationRulesSeedItemProvider(AdapterFactory adapterFactory) {
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

			addCausingUncertaintiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Causing Uncertainties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCausingUncertaintiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UCPropagationRulesSeed_causingUncertainties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UCPropagationRulesSeed_causingUncertainties_feature", "_UI_UCPropagationRulesSeed_type"),
				 UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS);
			childrenFeatures.add(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES);
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
	 * This returns UCPropagationRulesSeed.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UCPropagationRulesSeed"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_UCPropagationRulesSeed_type");
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

		switch (notification.getFeatureID(UCPropagationRulesSeed.class)) {
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS:
			case UncertaintypropagationPackage.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES:
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
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_BEHAVIOURS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtBasicComponentBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_BASIC_COMPONENT_TYPES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtBasicComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_COMPONENTS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtCommunicationComponents()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMMUNICATION_RESOURCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtCommunicationResources()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INSTANCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_INSTANCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtComponentInterfaceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_COMPONENT_INTERFACE_TYPES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtComponentInterfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_HARDWARE_RESOURCES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtHardwareResource()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEMS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtSystem()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_SYSTEM_INTERFACES,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtSystemInterface()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__AFFECTED_USAGE_BEHAVIOURS,
				 UncertaintypropagationFactory.eINSTANCE.createUCImpactAtUsageBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(UncertaintypropagationPackage.Literals.UC_PROPAGATION_RULES_SEED__CAUSING_UNCERTAINTIES,
				 UncertaintypropagationFactory.eINSTANCE.createCausingUncertainty()));
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
