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

import org.eclipse.emf.common.util.ResourceLocator;

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

import visGrid.House_a;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.House_a} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class House_aItemProvider
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
	public House_aItemProvider(AdapterFactory adapterFactory) {
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

			addConnectionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addFloor_areaPropertyDescriptor(object);
			addGross_wall_areaPropertyDescriptor(object);
			addCeiling_heightPropertyDescriptor(object);
			addAspect_ratioPropertyDescriptor(object);
			addEnvelope_UAPropertyDescriptor(object);
			addWindow_wall_ratioPropertyDescriptor(object);
			addGlazing_shgcPropertyDescriptor(object);
			addAirchange_per_hourPropertyDescriptor(object);
			addSolar_gainPropertyDescriptor(object);
			addHeat_cool_gainPropertyDescriptor(object);
			addThermostat_deadbandPropertyDescriptor(object);
			addHeating_setpointPropertyDescriptor(object);
			addCooling_setpointPropertyDescriptor(object);
			addDesign_heating_capacityPropertyDescriptor(object);
			addDesign_cooling_capacityPropertyDescriptor(object);
			addHeating_COPPropertyDescriptor(object);
			addCooling_COPPropertyDescriptor(object);
			addCOP_coeffPropertyDescriptor(object);
			addAir_temperaturePropertyDescriptor(object);
			addOutside_tempPropertyDescriptor(object);
			addMass_temperaturePropertyDescriptor(object);
			addMass_heat_coeffPropertyDescriptor(object);
			addOutdoor_temperaturePropertyDescriptor(object);
			addHouse_thermal_massPropertyDescriptor(object);
			addHeat_modePropertyDescriptor(object);
			addHc_modePropertyDescriptor(object);
			addHouseloadPropertyDescriptor(object);
			addHouseload__energyPropertyDescriptor(object);
			addHouseload__powerPropertyDescriptor(object);
			addHouseload__peak_demandPropertyDescriptor(object);
			addHouseload__heatgainPropertyDescriptor(object);
			addHouseload__heatgain_fractionPropertyDescriptor(object);
			addHouseload__current_fractionPropertyDescriptor(object);
			addHouseload__impedance_fractionPropertyDescriptor(object);
			addHouseload__power_fractionPropertyDescriptor(object);
			addHouseload__power_factorPropertyDescriptor(object);
			addHouseload__constant_powerPropertyDescriptor(object);
			addHouseload__constant_currentPropertyDescriptor(object);
			addHouseload__constant_admittancePropertyDescriptor(object);
			addHouseload__voltage_factorPropertyDescriptor(object);
			addHouseload__configurationPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_Connection_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Connection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_House_a_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_name_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Name(),
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
				 getString("_UI_House_a_floor_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_floor_area_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Floor_area(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gross wall area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGross_wall_areaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_gross_wall_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_gross_wall_area_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Gross_wall_area(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ceiling height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCeiling_heightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_ceiling_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_ceiling_height_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Ceiling_height(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aspect ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspect_ratioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_aspect_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_aspect_ratio_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Aspect_ratio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Envelope UA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvelope_UAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_envelope_UA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_envelope_UA_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Envelope_UA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Window wall ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindow_wall_ratioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_window_wall_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_window_wall_ratio_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Window_wall_ratio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing shgc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing_shgcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_glazing_shgc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_glazing_shgc_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Glazing_shgc(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Airchange per hour feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAirchange_per_hourPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_airchange_per_hour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_airchange_per_hour_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Airchange_per_hour(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar gain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_gainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_solar_gain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_solar_gain_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Solar_gain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heat cool gain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeat_cool_gainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_heat_cool_gain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_heat_cool_gain_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Heat_cool_gain(),
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
				 getString("_UI_House_a_thermostat_deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_thermostat_deadband_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Thermostat_deadband(),
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
				 getString("_UI_House_a_heating_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_heating_setpoint_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Heating_setpoint(),
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
				 getString("_UI_House_a_cooling_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_cooling_setpoint_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Cooling_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design heating capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_heating_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_design_heating_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_design_heating_capacity_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Design_heating_capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design cooling capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_cooling_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_design_cooling_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_design_cooling_capacity_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Design_cooling_capacity(),
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
				 getString("_UI_House_a_heating_COP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_heating_COP_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Heating_COP(),
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
				 getString("_UI_House_a_cooling_COP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_cooling_COP_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Cooling_COP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the COP coeff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCOP_coeffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_COP_coeff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_COP_coeff_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_COP_coeff(),
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
				 getString("_UI_House_a_air_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_air_temperature_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Air_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outside temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutside_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_outside_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_outside_temp_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Outside_temp(),
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
				 getString("_UI_House_a_mass_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_mass_temperature_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Mass_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass heat coeff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMass_heat_coeffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_mass_heat_coeff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_mass_heat_coeff_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Mass_heat_coeff(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outdoor temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutdoor_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_outdoor_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_outdoor_temperature_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Outdoor_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the House thermal mass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouse_thermal_massPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_house_thermal_mass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_house_thermal_mass_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_House_thermal_mass(),
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
				 getString("_UI_House_a_heat_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_heat_mode_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Heat_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hc mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHc_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_hc_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_hc_mode_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Hc_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__energy_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__power_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload peak demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__peak_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__peak_demand_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__peak_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__heatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__heatgain_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__heatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__heatgain_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload current fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__current_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__current_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__current_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload impedance fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__impedance_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__impedance_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__impedance_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__power_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__power_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__power_factor_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload constant power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__constant_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__constant_power_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__constant_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload constant current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__constant_currentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__constant_current_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__constant_current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload constant admittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__constant_admittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__constant_admittance_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__constant_admittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload voltage factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__voltage_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__voltage_factor_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__voltage_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Houseload configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouseload__configurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_houseload__configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_houseload__configuration_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Houseload__configuration(),
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
				 getString("_UI_House_a_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_shape_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Shape(),
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
				 getString("_UI_House_a_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_load_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Load(),
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
				 getString("_UI_House_a_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_energy_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Energy(),
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
				 getString("_UI_House_a_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_power_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Power(),
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
				 getString("_UI_House_a_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_peak_demand_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Peak_demand(),
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
				 getString("_UI_House_a_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_heatgain_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Heatgain(),
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
				 getString("_UI_House_a_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_heatgain_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Heatgain_fraction(),
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
				 getString("_UI_House_a_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_current_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Current_fraction(),
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
				 getString("_UI_House_a_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_impedance_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Impedance_fraction(),
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
				 getString("_UI_House_a_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_power_fraction_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Power_fraction(),
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
				 getString("_UI_House_a_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_power_factor_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Power_factor(),
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
				 getString("_UI_House_a_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_constant_power_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Constant_power(),
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
				 getString("_UI_House_a_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_constant_current_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Constant_current(),
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
				 getString("_UI_House_a_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_constant_admittance_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Constant_admittance(),
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
				 getString("_UI_House_a_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_voltage_factor_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Voltage_factor(),
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
				 getString("_UI_House_a_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_configuration_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Configuration(),
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
				 getString("_UI_House_a_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_override_feature", "_UI_House_a_type"),
				 VisGridPackage.eINSTANCE.getHouse_a_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns House_a.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/House_a"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((House_a)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_House_a_type") :
			getString("_UI_House_a_type") + " " + label;
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

		switch (notification.getFeatureID(House_a.class)) {
			case VisGridPackage.HOUSE_A__NAME:
			case VisGridPackage.HOUSE_A__FLOOR_AREA:
			case VisGridPackage.HOUSE_A__GROSS_WALL_AREA:
			case VisGridPackage.HOUSE_A__CEILING_HEIGHT:
			case VisGridPackage.HOUSE_A__ASPECT_RATIO:
			case VisGridPackage.HOUSE_A__ENVELOPE_UA:
			case VisGridPackage.HOUSE_A__WINDOW_WALL_RATIO:
			case VisGridPackage.HOUSE_A__GLAZING_SHGC:
			case VisGridPackage.HOUSE_A__AIRCHANGE_PER_HOUR:
			case VisGridPackage.HOUSE_A__SOLAR_GAIN:
			case VisGridPackage.HOUSE_A__HEAT_COOL_GAIN:
			case VisGridPackage.HOUSE_A__THERMOSTAT_DEADBAND:
			case VisGridPackage.HOUSE_A__HEATING_SETPOINT:
			case VisGridPackage.HOUSE_A__COOLING_SETPOINT:
			case VisGridPackage.HOUSE_A__DESIGN_HEATING_CAPACITY:
			case VisGridPackage.HOUSE_A__DESIGN_COOLING_CAPACITY:
			case VisGridPackage.HOUSE_A__HEATING_COP:
			case VisGridPackage.HOUSE_A__COOLING_COP:
			case VisGridPackage.HOUSE_A__COP_COEFF:
			case VisGridPackage.HOUSE_A__AIR_TEMPERATURE:
			case VisGridPackage.HOUSE_A__OUTSIDE_TEMP:
			case VisGridPackage.HOUSE_A__MASS_TEMPERATURE:
			case VisGridPackage.HOUSE_A__MASS_HEAT_COEFF:
			case VisGridPackage.HOUSE_A__OUTDOOR_TEMPERATURE:
			case VisGridPackage.HOUSE_A__HOUSE_THERMAL_MASS:
			case VisGridPackage.HOUSE_A__HEAT_MODE:
			case VisGridPackage.HOUSE_A__HC_MODE:
			case VisGridPackage.HOUSE_A__HOUSELOAD:
			case VisGridPackage.HOUSE_A__HOUSELOAD_ENERGY:
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER:
			case VisGridPackage.HOUSE_A__HOUSELOAD_PEAK_DEMAND:
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN:
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN_FRACTION:
			case VisGridPackage.HOUSE_A__HOUSELOAD_CURRENT_FRACTION:
			case VisGridPackage.HOUSE_A__HOUSELOAD_IMPEDANCE_FRACTION:
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FRACTION:
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FACTOR:
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_POWER:
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_CURRENT:
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_ADMITTANCE:
			case VisGridPackage.HOUSE_A__HOUSELOAD_VOLTAGE_FACTOR:
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONFIGURATION:
			case VisGridPackage.HOUSE_A__SHAPE:
			case VisGridPackage.HOUSE_A__LOAD:
			case VisGridPackage.HOUSE_A__ENERGY:
			case VisGridPackage.HOUSE_A__POWER:
			case VisGridPackage.HOUSE_A__PEAK_DEMAND:
			case VisGridPackage.HOUSE_A__HEATGAIN:
			case VisGridPackage.HOUSE_A__HEATGAIN_FRACTION:
			case VisGridPackage.HOUSE_A__CURRENT_FRACTION:
			case VisGridPackage.HOUSE_A__IMPEDANCE_FRACTION:
			case VisGridPackage.HOUSE_A__POWER_FRACTION:
			case VisGridPackage.HOUSE_A__POWER_FACTOR:
			case VisGridPackage.HOUSE_A__CONSTANT_POWER:
			case VisGridPackage.HOUSE_A__CONSTANT_CURRENT:
			case VisGridPackage.HOUSE_A__CONSTANT_ADMITTANCE:
			case VisGridPackage.HOUSE_A__VOLTAGE_FACTOR:
			case VisGridPackage.HOUSE_A__CONFIGURATION:
			case VisGridPackage.HOUSE_A__OVERRIDE:
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
		return VisGridEditPlugin.INSTANCE;
	}

}
