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

import visGrid.Evcharger;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Evcharger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EvchargerItemProvider
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
	public EvchargerItemProvider(AdapterFactory adapterFactory) {
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

			addCharger_typePropertyDescriptor(object);
			addVehicle_typePropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addP_go_homePropertyDescriptor(object);
			addP_go_workPropertyDescriptor(object);
			addWork_distPropertyDescriptor(object);
			addCapacityPropertyDescriptor(object);
			addChargePropertyDescriptor(object);
			addCharge_at_workPropertyDescriptor(object);
			addCharge_throttlePropertyDescriptor(object);
			addDemand_profilePropertyDescriptor(object);
			addShapePropertyDescriptor(object);
			addLoadPropertyDescriptor(object);
			addEnergyPropertyDescriptor(object);
			addPowerPropertyDescriptor(object);
			addPeak_demandPropertyDescriptor(object);
			addHeatgainPropertyDescriptor(object);
			addHeatgain_fractionPropertyDescriptor(object);
			addCurrent_fractionPropertyDescriptor(object);
			addImpedance_fractionPropertyDescriptor(object);
			addPower_fractionPropertyDescriptor(object);
			addPower_factorPropertyDescriptor(object);
			addConstant_powerPropertyDescriptor(object);
			addConstant_currentPropertyDescriptor(object);
			addConstant_admittancePropertyDescriptor(object);
			addVoltage_factorPropertyDescriptor(object);
			addConfigurationPropertyDescriptor(object);
			addOverridePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Charger type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharger_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_charger_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_charger_type_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Charger_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vehicle type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVehicle_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_vehicle_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_vehicle_type_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Vehicle_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_state_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_State(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pgo home feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addP_go_homePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_p_go_home_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_p_go_home_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_P_go_home(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pgo work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addP_go_workPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_p_go_work_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_p_go_work_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_P_go_work(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work dist feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWork_distPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_work_dist_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_work_dist_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Work_dist(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_capacity_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Charge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChargePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_charge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_charge_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Charge(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Charge at work feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharge_at_workPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_charge_at_work_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_charge_at_work_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Charge_at_work(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Charge throttle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharge_throttlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_charge_throttle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_charge_throttle_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Charge_throttle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Demand profile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDemand_profilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_demand_profile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_demand_profile_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Demand_profile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_shape_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Shape(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_load_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_energy_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_power_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeak_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_peak_demand_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Peak_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_heatgain_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_heatgain_fraction_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_current_fraction_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Current_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_impedance_fraction_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Impedance_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_power_fraction_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_power_factor_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_constant_power_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Constant_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_currentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_constant_current_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Constant_current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant admittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_admittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_constant_admittance_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Constant_admittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_voltage_factor_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Voltage_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_configuration_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Configuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Evcharger_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Evcharger_override_feature", "_UI_Evcharger_type"),
				 VisGridPackage.eINSTANCE.getEvcharger_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Evcharger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Evcharger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Evcharger)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Evcharger_type") :
			getString("_UI_Evcharger_type") + " " + label;
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

		switch (notification.getFeatureID(Evcharger.class)) {
			case VisGridPackage.EVCHARGER__CHARGER_TYPE:
			case VisGridPackage.EVCHARGER__VEHICLE_TYPE:
			case VisGridPackage.EVCHARGER__STATE:
			case VisGridPackage.EVCHARGER__PGO_HOME:
			case VisGridPackage.EVCHARGER__PGO_WORK:
			case VisGridPackage.EVCHARGER__WORK_DIST:
			case VisGridPackage.EVCHARGER__CAPACITY:
			case VisGridPackage.EVCHARGER__CHARGE:
			case VisGridPackage.EVCHARGER__CHARGE_AT_WORK:
			case VisGridPackage.EVCHARGER__CHARGE_THROTTLE:
			case VisGridPackage.EVCHARGER__DEMAND_PROFILE:
			case VisGridPackage.EVCHARGER__SHAPE:
			case VisGridPackage.EVCHARGER__LOAD:
			case VisGridPackage.EVCHARGER__ENERGY:
			case VisGridPackage.EVCHARGER__POWER:
			case VisGridPackage.EVCHARGER__PEAK_DEMAND:
			case VisGridPackage.EVCHARGER__HEATGAIN:
			case VisGridPackage.EVCHARGER__HEATGAIN_FRACTION:
			case VisGridPackage.EVCHARGER__CURRENT_FRACTION:
			case VisGridPackage.EVCHARGER__IMPEDANCE_FRACTION:
			case VisGridPackage.EVCHARGER__POWER_FRACTION:
			case VisGridPackage.EVCHARGER__POWER_FACTOR:
			case VisGridPackage.EVCHARGER__CONSTANT_POWER:
			case VisGridPackage.EVCHARGER__CONSTANT_CURRENT:
			case VisGridPackage.EVCHARGER__CONSTANT_ADMITTANCE:
			case VisGridPackage.EVCHARGER__VOLTAGE_FACTOR:
			case VisGridPackage.EVCHARGER__CONFIGURATION:
			case VisGridPackage.EVCHARGER__OVERRIDE:
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
