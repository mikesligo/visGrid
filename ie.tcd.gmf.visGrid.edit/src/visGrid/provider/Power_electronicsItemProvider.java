/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Power_electronics;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Power_electronics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Power_electronicsItemProvider
	extends ConnectionItemProvider
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
	public Power_electronicsItemProvider(AdapterFactory adapterFactory) {
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
			addGenerator_modePropertyDescriptor(object);
			addGenerator_statusPropertyDescriptor(object);
			addConverter_typePropertyDescriptor(object);
			addSwitch_typePropertyDescriptor(object);
			addFilter_typePropertyDescriptor(object);
			addFilter_implementationPropertyDescriptor(object);
			addFilter_frequencyPropertyDescriptor(object);
			addPower_typePropertyDescriptor(object);
			addRated_kWPropertyDescriptor(object);
			addMax_PPropertyDescriptor(object);
			addMin_PPropertyDescriptor(object);
			addRated_kVAPropertyDescriptor(object);
			addRated_kVPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
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
				 getString("_UI_Power_electronics_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_name_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerator_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_generator_mode_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Generator_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerator_statusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_generator_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_generator_status_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Generator_status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Converter type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConverter_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_converter_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_converter_type_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Converter_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Switch type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwitch_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_switch_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_switch_type_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Switch_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilter_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_filter_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_filter_type_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Filter_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilter_implementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_filter_implementation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_filter_implementation_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Filter_implementation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilter_frequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_filter_frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_filter_frequency_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Filter_frequency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_power_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_power_type_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Power_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated kW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_kWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_Rated_kW_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_Rated_kW_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Rated_kW(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max P feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_PPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_Max_P_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_Max_P_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Max_P(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min P feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_PPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_Min_P_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_Min_P_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Min_P(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated kVA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_kVAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_Rated_kVA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_Rated_kVA_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Rated_kVA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated kV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_kVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_Rated_kV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_Rated_kV_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Rated_kV(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Power_electronics_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Power_electronics_phases_feature", "_UI_Power_electronics_type"),
				 VisGridPackage.eINSTANCE.getPower_electronics_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Power_electronics.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Power_electronics"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Power_electronics)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Power_electronics_type") :
			getString("_UI_Power_electronics_type") + " " + label;
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

		switch (notification.getFeatureID(Power_electronics.class)) {
			case VisGridPackage.POWER_ELECTRONICS__NAME:
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_MODE:
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_STATUS:
			case VisGridPackage.POWER_ELECTRONICS__CONVERTER_TYPE:
			case VisGridPackage.POWER_ELECTRONICS__SWITCH_TYPE:
			case VisGridPackage.POWER_ELECTRONICS__FILTER_TYPE:
			case VisGridPackage.POWER_ELECTRONICS__FILTER_IMPLEMENTATION:
			case VisGridPackage.POWER_ELECTRONICS__FILTER_FREQUENCY:
			case VisGridPackage.POWER_ELECTRONICS__POWER_TYPE:
			case VisGridPackage.POWER_ELECTRONICS__RATED_KW:
			case VisGridPackage.POWER_ELECTRONICS__MAX_P:
			case VisGridPackage.POWER_ELECTRONICS__MIN_P:
			case VisGridPackage.POWER_ELECTRONICS__RATED_KVA:
			case VisGridPackage.POWER_ELECTRONICS__RATED_KV:
			case VisGridPackage.POWER_ELECTRONICS__PHASES:
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

}
