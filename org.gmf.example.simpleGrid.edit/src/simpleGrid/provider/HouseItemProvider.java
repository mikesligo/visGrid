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

import simpleGrid.House;
import simpleGrid.SimpleGridPackage;

/**
 * This is the item provider adapter for a {@link simpleGrid.House} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HouseItemProvider
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
	public HouseItemProvider(AdapterFactory adapterFactory) {
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
			addSchedule_skewPropertyDescriptor(object);
			addAir_temperaturePropertyDescriptor(object);
			addFloor_areaPropertyDescriptor(object);
			addCooling_setpointPropertyDescriptor(object);
			addHeating_setpointPropertyDescriptor(object);
			addThermal_integrity_levelPropertyDescriptor(object);
			addMotor_modelPropertyDescriptor(object);
			addMotor_efficiencyPropertyDescriptor(object);
			addMass_temperaturePropertyDescriptor(object);
			addHeating_system_typePropertyDescriptor(object);
			addHeating_COPPropertyDescriptor(object);
			addAuxiliary_strategyPropertyDescriptor(object);
			addAuxiliary_system_typePropertyDescriptor(object);
			addCooling_COPPropertyDescriptor(object);
			addWaterheaterPropertyDescriptor(object);
			addParentPropertyDescriptor(object);
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
				 getString("_UI_House_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_name_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule skew feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedule_skewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_schedule_skew_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_schedule_skew_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__SCHEDULE_SKEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Air temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAir_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_air_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_air_temperature_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__AIR_TEMPERATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floor area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloor_areaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_floor_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_floor_area_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__FLOOR_AREA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_cooling_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_cooling_setpoint_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__COOLING_SETPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_heating_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heating_setpoint_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__HEATING_SETPOINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermal integrity level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermal_integrity_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_thermal_integrity_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_thermal_integrity_level_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__THERMAL_INTEGRITY_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Motor model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMotor_modelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_motor_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_motor_model_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__MOTOR_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Motor efficiency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMotor_efficiencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_motor_efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_motor_efficiency_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__MOTOR_EFFICIENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMass_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_mass_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_mass_temperature_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__MASS_TEMPERATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating system type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_system_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_heating_system_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heating_system_type_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__HEATING_SYSTEM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating COP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_COPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_heating_COP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heating_COP_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__HEATING_COP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auxiliary strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuxiliary_strategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_auxiliary_strategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_auxiliary_strategy_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__AUXILIARY_STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auxiliary system type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuxiliary_system_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_auxiliary_system_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_auxiliary_system_type_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__AUXILIARY_SYSTEM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling COP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_COPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_cooling_COP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_cooling_COP_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__COOLING_COP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waterheater feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaterheaterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_waterheater_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_waterheater_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__WATERHEATER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_parent_feature", "_UI_House_type"),
				 SimpleGridPackage.Literals.HOUSE__PARENT,
				 true,
				 false,
				 true,
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
			childrenFeatures.add(SimpleGridPackage.Literals.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT);
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
	 * This returns House.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/House"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((House)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_House_type") :
			getString("_UI_House_type") + " " + label;
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

		switch (notification.getFeatureID(House.class)) {
			case SimpleGridPackage.HOUSE__NAME:
			case SimpleGridPackage.HOUSE__SCHEDULE_SKEW:
			case SimpleGridPackage.HOUSE__AIR_TEMPERATURE:
			case SimpleGridPackage.HOUSE__FLOOR_AREA:
			case SimpleGridPackage.HOUSE__COOLING_SETPOINT:
			case SimpleGridPackage.HOUSE__HEATING_SETPOINT:
			case SimpleGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
			case SimpleGridPackage.HOUSE__MOTOR_MODEL:
			case SimpleGridPackage.HOUSE__MOTOR_EFFICIENCY:
			case SimpleGridPackage.HOUSE__MASS_TEMPERATURE:
			case SimpleGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
			case SimpleGridPackage.HOUSE__HEATING_COP:
			case SimpleGridPackage.HOUSE__AUXILIARY_STRATEGY:
			case SimpleGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
			case SimpleGridPackage.HOUSE__COOLING_COP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimpleGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
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
				(SimpleGridPackage.Literals.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT,
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
