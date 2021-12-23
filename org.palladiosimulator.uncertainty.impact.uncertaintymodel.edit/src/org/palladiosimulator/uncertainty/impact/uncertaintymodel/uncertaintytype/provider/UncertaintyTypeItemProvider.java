/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.provider.UncertaintyModelEditPlugin;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypePackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintyTypeItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addResolvedByPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addInformationAvailabilityPropertyDescriptor(object);
			addNaturePropertyDescriptor(object);
			addManageabilityPropertyDescriptor(object);
			addImpactOnConfidentialityPropertyDescriptor(object);
			addSeverityOfImpactPropertyDescriptor(object);
			addResolutionTimePropertyDescriptor(object);
			addRootCausePropertyDescriptor(object);
			addAssignableElementTypePropertyDescriptor(object);
			addImpactOnElementTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_name_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolved By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_resolvedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_resolvedBy_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__RESOLVED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_location_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Information Availability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInformationAvailabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_informationAvailability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_informationAvailability_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_nature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_nature_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__NATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Manageability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManageabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_manageability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_manageability_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__MANAGEABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impact On Confidentiality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpactOnConfidentialityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_impactOnConfidentiality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_impactOnConfidentiality_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Severity Of Impact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeverityOfImpactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_severityOfImpact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_severityOfImpact_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_resolutionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_resolutionTime_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__RESOLUTION_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Cause feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootCausePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_rootCause_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_rootCause_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__ROOT_CAUSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assignable Element Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignableElementTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_assignableElementType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_assignableElementType_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impact On Element Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpactOnElementTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UncertaintyType_impactOnElementTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UncertaintyType_impactOnElementTypes_feature", "_UI_UncertaintyType_type"),
				 UncertaintyTypePackage.Literals.UNCERTAINTY_TYPE__IMPACT_ON_ELEMENT_TYPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns UncertaintyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UncertaintyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UncertaintyType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UncertaintyType_type") :
			getString("_UI_UncertaintyType_type") + " " + label;
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

		switch (notification.getFeatureID(UncertaintyType.class)) {
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NAME:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__LOCATION:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__INFORMATION_AVAILABILITY:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__NATURE:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__MANAGEABILITY:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_CONFIDENTIALITY:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__SEVERITY_OF_IMPACT:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__RESOLUTION_TIME:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ROOT_CAUSE:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__ASSIGNABLE_ELEMENT_TYPE:
			case UncertaintyTypePackage.UNCERTAINTY_TYPE__IMPACT_ON_ELEMENT_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UncertaintyModelEditPlugin.INSTANCE;
	}

}
