/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simpleGrid.SimpleGridPackage;
import simpleGrid.Transformer_configuration;

/**
 * This is the item provider adapter for a {@link simpleGrid.Transformer_configuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Transformer_configurationItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer_configurationItemProvider(AdapterFactory adapterFactory) {
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
			addConnect_typePropertyDescriptor(object);
			addInstall_typePropertyDescriptor(object);
			addPower_ratingPropertyDescriptor(object);
			addImpedencePropertyDescriptor(object);
			addImpedence1PropertyDescriptor(object);
			addImpedence2PropertyDescriptor(object);
			addShunt_impedencePropertyDescriptor(object);
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
				 getString("_UI_Transformer_configuration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_name_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connect type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnect_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_connect_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_connect_type_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__CONNECT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Install type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstall_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_install_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_install_type_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__INSTALL_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power rating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_ratingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_power_rating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_power_rating_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__POWER_RATING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_impedence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_impedence_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__IMPEDENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedence1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedence1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_impedence1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_impedence1_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__IMPEDENCE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedence2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedence2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_impedence2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_impedence2_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__IMPEDENCE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt impedence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_impedencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_shunt_impedence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_shunt_impedence_feature", "_UI_Transformer_configuration_type"),
				 SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE);
			childrenFeatures.add(SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE);
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
	 * This returns Transformer_configuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transformer_configuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transformer_configuration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Transformer_configuration_type") :
			getString("_UI_Transformer_configuration_type") + " " + label;
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

		switch (notification.getFeatureID(Transformer_configuration.class)) {
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__NAME:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE1:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__IMPEDENCE2:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
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
				(SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE,
				 ""));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE,
				 ""));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimpleGridEditPlugin.INSTANCE;
	}

}
