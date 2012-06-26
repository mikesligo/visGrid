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

import visGrid.VisGridPackage;
import visGrid.Waterheater;

/**
 * This is the item provider adapter for a {@link visGrid.Waterheater} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterheaterItemProvider
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
	public WaterheaterItemProvider(AdapterFactory adapterFactory) {
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
			addTank_volumePropertyDescriptor(object);
			addTank_UAPropertyDescriptor(object);
			addTank_diameterPropertyDescriptor(object);
			addWater_demandPropertyDescriptor(object);
			addHeating_element_capacityPropertyDescriptor(object);
			addInlet_water_temperaturePropertyDescriptor(object);
			addHeat_modePropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addTank_setpointPropertyDescriptor(object);
			addThermostat_deadbandPropertyDescriptor(object);
			addTemperaturePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addDemandPropertyDescriptor(object);
			addActual_loadPropertyDescriptor(object);
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
				 getString("_UI_Waterheater_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_name_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tank volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTank_volumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_tank_volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_tank_volume_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Tank_volume(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tank UA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTank_UAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_tank_UA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_tank_UA_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Tank_UA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tank diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTank_diameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_tank_diameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_tank_diameter_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Tank_diameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Water demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWater_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_water_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_water_demand_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Water_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating element capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_element_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_heating_element_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_heating_element_capacity_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Heating_element_capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inlet water temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInlet_water_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_inlet_water_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_inlet_water_temperature_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Inlet_water_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heat mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeat_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_heat_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_heat_mode_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Heat_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Waterheater_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_location_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Location(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tank setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTank_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_tank_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_tank_setpoint_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Tank_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermostat deadband feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermostat_deadbandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_thermostat_deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_thermostat_deadband_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Thermostat_deadband(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_temperature_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_height_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Height(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDemandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_demand_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActual_loadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Waterheater_actual_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_actual_load_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Actual_load(),
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
				 getString("_UI_Waterheater_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_shape_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Shape(),
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
				 getString("_UI_Waterheater_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_load_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Load(),
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
				 getString("_UI_Waterheater_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_energy_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Energy(),
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
				 getString("_UI_Waterheater_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_power_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Power(),
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
				 getString("_UI_Waterheater_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_peak_demand_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Peak_demand(),
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
				 getString("_UI_Waterheater_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_heatgain_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Heatgain(),
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
				 getString("_UI_Waterheater_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_heatgain_fraction_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Heatgain_fraction(),
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
				 getString("_UI_Waterheater_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_current_fraction_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Current_fraction(),
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
				 getString("_UI_Waterheater_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_impedance_fraction_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Impedance_fraction(),
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
				 getString("_UI_Waterheater_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_power_fraction_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Power_fraction(),
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
				 getString("_UI_Waterheater_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_power_factor_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Power_factor(),
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
				 getString("_UI_Waterheater_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_constant_power_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Constant_power(),
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
				 getString("_UI_Waterheater_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_constant_current_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Constant_current(),
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
				 getString("_UI_Waterheater_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_constant_admittance_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Constant_admittance(),
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
				 getString("_UI_Waterheater_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_voltage_factor_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Voltage_factor(),
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
				 getString("_UI_Waterheater_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_configuration_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Configuration(),
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
				 getString("_UI_Waterheater_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Waterheater_override_feature", "_UI_Waterheater_type"),
				 VisGridPackage.eINSTANCE.getWaterheater_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Waterheater.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Waterheater"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Waterheater)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Waterheater_type") :
			getString("_UI_Waterheater_type") + " " + label;
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

		switch (notification.getFeatureID(Waterheater.class)) {
			case VisGridPackage.WATERHEATER__NAME:
			case VisGridPackage.WATERHEATER__TANK_VOLUME:
			case VisGridPackage.WATERHEATER__TANK_UA:
			case VisGridPackage.WATERHEATER__TANK_DIAMETER:
			case VisGridPackage.WATERHEATER__WATER_DEMAND:
			case VisGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
			case VisGridPackage.WATERHEATER__INLET_WATER_TEMPERATURE:
			case VisGridPackage.WATERHEATER__HEAT_MODE:
			case VisGridPackage.WATERHEATER__LOCATION:
			case VisGridPackage.WATERHEATER__TANK_SETPOINT:
			case VisGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
			case VisGridPackage.WATERHEATER__TEMPERATURE:
			case VisGridPackage.WATERHEATER__HEIGHT:
			case VisGridPackage.WATERHEATER__DEMAND:
			case VisGridPackage.WATERHEATER__ACTUAL_LOAD:
			case VisGridPackage.WATERHEATER__SHAPE:
			case VisGridPackage.WATERHEATER__LOAD:
			case VisGridPackage.WATERHEATER__ENERGY:
			case VisGridPackage.WATERHEATER__POWER:
			case VisGridPackage.WATERHEATER__PEAK_DEMAND:
			case VisGridPackage.WATERHEATER__HEATGAIN:
			case VisGridPackage.WATERHEATER__HEATGAIN_FRACTION:
			case VisGridPackage.WATERHEATER__CURRENT_FRACTION:
			case VisGridPackage.WATERHEATER__IMPEDANCE_FRACTION:
			case VisGridPackage.WATERHEATER__POWER_FRACTION:
			case VisGridPackage.WATERHEATER__POWER_FACTOR:
			case VisGridPackage.WATERHEATER__CONSTANT_POWER:
			case VisGridPackage.WATERHEATER__CONSTANT_CURRENT:
			case VisGridPackage.WATERHEATER__CONSTANT_ADMITTANCE:
			case VisGridPackage.WATERHEATER__VOLTAGE_FACTOR:
			case VisGridPackage.WATERHEATER__CONFIGURATION:
			case VisGridPackage.WATERHEATER__OVERRIDE:
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
