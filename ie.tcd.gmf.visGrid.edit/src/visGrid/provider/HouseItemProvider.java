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

import visGrid.House;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.House} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HouseItemProvider
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

			addWeatherPropertyDescriptor(object);
			addFloor_areaPropertyDescriptor(object);
			addGross_wall_areaPropertyDescriptor(object);
			addCeiling_heightPropertyDescriptor(object);
			addAspect_ratioPropertyDescriptor(object);
			addEnvelope_UAPropertyDescriptor(object);
			addWindow_wall_ratioPropertyDescriptor(object);
			addNumber_of_doorsPropertyDescriptor(object);
			addExterior_wall_fractionPropertyDescriptor(object);
			addInterior_exterior_wall_ratioPropertyDescriptor(object);
			addExterior_ceiling_fractionPropertyDescriptor(object);
			addExterior_floor_fractionPropertyDescriptor(object);
			addWindow_shadingPropertyDescriptor(object);
			addWindow_exterior_transmission_coefficientPropertyDescriptor(object);
			addSolar_heatgain_factorPropertyDescriptor(object);
			addAirchange_per_hourPropertyDescriptor(object);
			addAirchange_UAPropertyDescriptor(object);
			addInternal_gainPropertyDescriptor(object);
			addSolar_gainPropertyDescriptor(object);
			addHeat_cool_gainPropertyDescriptor(object);
			addThermostat_deadbandPropertyDescriptor(object);
			addThermostat_cycle_timePropertyDescriptor(object);
			addThermostat_last_cycle_timePropertyDescriptor(object);
			addHeating_setpointPropertyDescriptor(object);
			addCooling_setpointPropertyDescriptor(object);
			addDesign_heating_setpointPropertyDescriptor(object);
			addDesign_cooling_setpointPropertyDescriptor(object);
			addDesign_heating_capacityPropertyDescriptor(object);
			addDesign_cooling_capacityPropertyDescriptor(object);
			addAdj_heating_capPropertyDescriptor(object);
			addSys_rated_capPropertyDescriptor(object);
			addCooling_design_temperaturePropertyDescriptor(object);
			addHeating_design_temperaturePropertyDescriptor(object);
			addDesign_peak_solarPropertyDescriptor(object);
			addDesign_internal_gainsPropertyDescriptor(object);
			addAir_heat_fractionPropertyDescriptor(object);
			addAuxiliary_heat_capacityPropertyDescriptor(object);
			addAux_heat_deadbandPropertyDescriptor(object);
			addAux_heat_temperature_lockoutPropertyDescriptor(object);
			addAux_heat_time_delayPropertyDescriptor(object);
			addCooling_supply_air_tempPropertyDescriptor(object);
			addHeating_supply_air_tempPropertyDescriptor(object);
			addDuct_pressure_dropPropertyDescriptor(object);
			addFan_design_powerPropertyDescriptor(object);
			addFan_low_power_fractionPropertyDescriptor(object);
			addFan_powerPropertyDescriptor(object);
			addFan_design_airflowPropertyDescriptor(object);
			addFan_impedance_fractionPropertyDescriptor(object);
			addFan_power_fractionPropertyDescriptor(object);
			addFan_current_fractionPropertyDescriptor(object);
			addFan_power_factorPropertyDescriptor(object);
			addHeating_demandPropertyDescriptor(object);
			addCooling_demandPropertyDescriptor(object);
			addHeating_COPPropertyDescriptor(object);
			addCooling_COPPropertyDescriptor(object);
			addAdj_heating_copPropertyDescriptor(object);
			addAir_temperaturePropertyDescriptor(object);
			addOutdoor_temperaturePropertyDescriptor(object);
			addMass_heat_capacityPropertyDescriptor(object);
			addMass_heat_coeffPropertyDescriptor(object);
			addMass_temperaturePropertyDescriptor(object);
			addAir_volumePropertyDescriptor(object);
			addAir_massPropertyDescriptor(object);
			addAir_heat_capacityPropertyDescriptor(object);
			addLatent_load_fractionPropertyDescriptor(object);
			addTotal_thermal_mass_per_floor_areaPropertyDescriptor(object);
			addInterior_surface_heat_transfer_coeffPropertyDescriptor(object);
			addNumber_of_storiesPropertyDescriptor(object);
			addSystem_typePropertyDescriptor(object);
			addAuxiliary_strategyPropertyDescriptor(object);
			addSystem_modePropertyDescriptor(object);
			addHeating_system_typePropertyDescriptor(object);
			addCooling_system_typePropertyDescriptor(object);
			addAuxiliary_system_typePropertyDescriptor(object);
			addFan_typePropertyDescriptor(object);
			addThermal_integrity_levelPropertyDescriptor(object);
			addGlass_typePropertyDescriptor(object);
			addWindow_framePropertyDescriptor(object);
			addGlazing_treatmentPropertyDescriptor(object);
			addGlazing_layersPropertyDescriptor(object);
			addMotor_modelPropertyDescriptor(object);
			addMotor_efficiencyPropertyDescriptor(object);
			addHvac_motor_efficiencyPropertyDescriptor(object);
			addHvac_motor_loss_power_factorPropertyDescriptor(object);
			addRroofPropertyDescriptor(object);
			addRwallPropertyDescriptor(object);
			addRfloorPropertyDescriptor(object);
			addRwindowsPropertyDescriptor(object);
			addRdoorsPropertyDescriptor(object);
			addHvac_breaker_ratingPropertyDescriptor(object);
			addHvac_power_factorPropertyDescriptor(object);
			addHvac_loadPropertyDescriptor(object);
			addPanelPropertyDescriptor(object);
			addPanel__energyPropertyDescriptor(object);
			addPanel__powerPropertyDescriptor(object);
			addPanel__peak_demandPropertyDescriptor(object);
			addPanel__heatgainPropertyDescriptor(object);
			addPanel__heatgain_fractionPropertyDescriptor(object);
			addPanel__current_fractionPropertyDescriptor(object);
			addPanel__impedance_fractionPropertyDescriptor(object);
			addPanel__power_fractionPropertyDescriptor(object);
			addPanel__power_factorPropertyDescriptor(object);
			addPanel__constant_powerPropertyDescriptor(object);
			addPanel__constant_currentPropertyDescriptor(object);
			addPanel__constant_admittancePropertyDescriptor(object);
			addPanel__voltage_factorPropertyDescriptor(object);
			addPanel__configurationPropertyDescriptor(object);
			addDesign_internal_gain_densityPropertyDescriptor(object);
			addAPropertyDescriptor(object);
			addBPropertyDescriptor(object);
			addCPropertyDescriptor(object);
			addDPropertyDescriptor(object);
			addC1PropertyDescriptor(object);
			addC2PropertyDescriptor(object);
			addA3PropertyDescriptor(object);
			addA4PropertyDescriptor(object);
			addK1PropertyDescriptor(object);
			addK2PropertyDescriptor(object);
			addR1PropertyDescriptor(object);
			addR2PropertyDescriptor(object);
			addTeqPropertyDescriptor(object);
			addTeventPropertyDescriptor(object);
			addQiPropertyDescriptor(object);
			addQaPropertyDescriptor(object);
			addQmPropertyDescriptor(object);
			addQhPropertyDescriptor(object);
			addDTairPropertyDescriptor(object);
			addSol_incPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Weather feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeatherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_weather_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_weather_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Weather(),
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
				 VisGridPackage.eINSTANCE.getHouse_Floor_area(),
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
				 getString("_UI_House_gross_wall_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_gross_wall_area_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Gross_wall_area(),
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
				 getString("_UI_House_ceiling_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_ceiling_height_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Ceiling_height(),
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
				 getString("_UI_House_aspect_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_aspect_ratio_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Aspect_ratio(),
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
				 getString("_UI_House_envelope_UA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_envelope_UA_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Envelope_UA(),
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
				 getString("_UI_House_window_wall_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_window_wall_ratio_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Window_wall_ratio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number of doors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumber_of_doorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_number_of_doors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_number_of_doors_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Number_of_doors(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exterior wall fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExterior_wall_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_exterior_wall_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_exterior_wall_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Exterior_wall_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interior exterior wall ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterior_exterior_wall_ratioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_interior_exterior_wall_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_interior_exterior_wall_ratio_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Interior_exterior_wall_ratio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exterior ceiling fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExterior_ceiling_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_exterior_ceiling_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_exterior_ceiling_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Exterior_ceiling_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exterior floor fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExterior_floor_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_exterior_floor_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_exterior_floor_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Exterior_floor_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Window shading feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindow_shadingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_window_shading_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_window_shading_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Window_shading(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Window exterior transmission coefficient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindow_exterior_transmission_coefficientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_window_exterior_transmission_coefficient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_window_exterior_transmission_coefficient_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Window_exterior_transmission_coefficient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar heatgain factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_heatgain_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_solar_heatgain_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_solar_heatgain_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Solar_heatgain_factor(),
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
				 getString("_UI_House_airchange_per_hour_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_airchange_per_hour_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Airchange_per_hour(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Airchange UA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAirchange_UAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_airchange_UA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_airchange_UA_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Airchange_UA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Internal gain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInternal_gainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_internal_gain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_internal_gain_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Internal_gain(),
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
				 getString("_UI_House_solar_gain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_solar_gain_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Solar_gain(),
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
				 getString("_UI_House_heat_cool_gain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heat_cool_gain_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Heat_cool_gain(),
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
				 getString("_UI_House_thermostat_deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_thermostat_deadband_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Thermostat_deadband(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermostat cycle time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermostat_cycle_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_thermostat_cycle_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_thermostat_cycle_time_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Thermostat_cycle_time(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermostat last cycle time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermostat_last_cycle_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_thermostat_last_cycle_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_thermostat_last_cycle_time_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Thermostat_last_cycle_time(),
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
				 VisGridPackage.eINSTANCE.getHouse_Heating_setpoint(),
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
				 VisGridPackage.eINSTANCE.getHouse_Cooling_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design heating setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_heating_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_design_heating_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_heating_setpoint_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_heating_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design cooling setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_cooling_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_design_cooling_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_cooling_setpoint_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_cooling_setpoint(),
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
				 getString("_UI_House_design_heating_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_heating_capacity_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_heating_capacity(),
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
				 getString("_UI_House_design_cooling_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_cooling_capacity_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_cooling_capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adj heating cap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdj_heating_capPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_adj_heating_cap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_adj_heating_cap_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Adj_heating_cap(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sys rated cap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSys_rated_capPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_sys_rated_cap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_sys_rated_cap_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Sys_rated_cap(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling design temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_design_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_cooling_design_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_cooling_design_temperature_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Cooling_design_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating design temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_design_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_heating_design_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heating_design_temperature_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Heating_design_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design peak solar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_peak_solarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_design_peak_solar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_peak_solar_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_peak_solar(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design internal gains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_internal_gainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_design_internal_gains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_internal_gains_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_internal_gains(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Air heat fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAir_heat_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_air_heat_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_air_heat_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Air_heat_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auxiliary heat capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuxiliary_heat_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_auxiliary_heat_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_auxiliary_heat_capacity_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Auxiliary_heat_capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aux heat deadband feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAux_heat_deadbandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_aux_heat_deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_aux_heat_deadband_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Aux_heat_deadband(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aux heat temperature lockout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAux_heat_temperature_lockoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_aux_heat_temperature_lockout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_aux_heat_temperature_lockout_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Aux_heat_temperature_lockout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aux heat time delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAux_heat_time_delayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_aux_heat_time_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_aux_heat_time_delay_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Aux_heat_time_delay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling supply air temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_supply_air_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_cooling_supply_air_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_cooling_supply_air_temp_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Cooling_supply_air_temp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating supply air temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_supply_air_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_heating_supply_air_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heating_supply_air_temp_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Heating_supply_air_temp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duct pressure drop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuct_pressure_dropPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_duct_pressure_drop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_duct_pressure_drop_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Duct_pressure_drop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan design power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_design_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_design_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_design_power_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_design_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan low power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_low_power_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_low_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_low_power_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_low_power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_power_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan design airflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_design_airflowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_design_airflow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_design_airflow_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_design_airflow(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan impedance fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_impedance_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_impedance_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_impedance_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_power_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_power_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan current fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_current_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_current_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_current_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_power_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_heating_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heating_demand_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Heating_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_cooling_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_cooling_demand_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Cooling_demand(),
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
				 VisGridPackage.eINSTANCE.getHouse_Heating_COP(),
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
				 VisGridPackage.eINSTANCE.getHouse_Cooling_COP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adj heating cop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdj_heating_copPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_adj_heating_cop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_adj_heating_cop_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Adj_heating_cop(),
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
				 VisGridPackage.eINSTANCE.getHouse_Air_temperature(),
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
				 getString("_UI_House_outdoor_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_outdoor_temperature_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Outdoor_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass heat capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMass_heat_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_mass_heat_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_mass_heat_capacity_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Mass_heat_capacity(),
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
				 getString("_UI_House_mass_heat_coeff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_mass_heat_coeff_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Mass_heat_coeff(),
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
				 VisGridPackage.eINSTANCE.getHouse_Mass_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Air volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAir_volumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_air_volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_air_volume_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Air_volume(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Air mass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAir_massPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_air_mass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_air_mass_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Air_mass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Air heat capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAir_heat_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_air_heat_capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_air_heat_capacity_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Air_heat_capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Latent load fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatent_load_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_latent_load_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_latent_load_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Latent_load_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total thermal mass per floor area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotal_thermal_mass_per_floor_areaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_total_thermal_mass_per_floor_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_total_thermal_mass_per_floor_area_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Total_thermal_mass_per_floor_area(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interior surface heat transfer coeff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterior_surface_heat_transfer_coeffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_interior_surface_heat_transfer_coeff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_interior_surface_heat_transfer_coeff_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Interior_surface_heat_transfer_coeff(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number of stories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumber_of_storiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_number_of_stories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_number_of_stories_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Number_of_stories(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystem_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_system_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_system_type_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_System_type(),
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
				 VisGridPackage.eINSTANCE.getHouse_Auxiliary_strategy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystem_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_system_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_system_mode_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_System_mode(),
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
				 VisGridPackage.eINSTANCE.getHouse_Heating_system_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling system type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_system_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_cooling_system_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_cooling_system_type_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Cooling_system_type(),
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
				 VisGridPackage.eINSTANCE.getHouse_Auxiliary_system_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fan type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFan_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_fan_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_fan_type_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Fan_type(),
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
				 VisGridPackage.eINSTANCE.getHouse_Thermal_integrity_level(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glass type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlass_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_glass_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_glass_type_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Glass_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Window frame feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindow_framePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_window_frame_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_window_frame_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Window_frame(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing treatment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing_treatmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_glazing_treatment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_glazing_treatment_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Glazing_treatment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing layers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing_layersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_glazing_layers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_glazing_layers_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Glazing_layers(),
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
				 VisGridPackage.eINSTANCE.getHouse_Motor_model(),
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
				 VisGridPackage.eINSTANCE.getHouse_Motor_efficiency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac motor efficiency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac_motor_efficiencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_hvac_motor_efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_hvac_motor_efficiency_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Hvac_motor_efficiency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac motor loss power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac_motor_loss_power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_hvac_motor_loss_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_hvac_motor_loss_power_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Hvac_motor_loss_power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rroof feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRroofPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Rroof_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Rroof_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Rroof(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rwall feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRwallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Rwall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Rwall_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Rwall(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rfloor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRfloorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Rfloor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Rfloor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Rfloor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rwindows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRwindowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Rwindows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Rwindows_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Rwindows(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rdoors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRdoorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Rdoors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Rdoors_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Rdoors(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac breaker rating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac_breaker_ratingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_hvac_breaker_rating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_hvac_breaker_rating_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Hvac_breaker_rating(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac_power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_hvac_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_hvac_power_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Hvac_power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac_loadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_hvac_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_hvac_load_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Hvac_load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__energy_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__power_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel peak demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__peak_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__peak_demand_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__peak_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__heatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__heatgain_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__heatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__heatgain_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel current fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__current_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__current_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__current_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel impedance fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__impedance_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__impedance_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__impedance_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__power_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__power_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__power_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel constant power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__constant_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__constant_power_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__constant_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel constant current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__constant_currentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__constant_current_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__constant_current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel constant admittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__constant_admittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__constant_admittance_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__constant_admittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel voltage factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__voltage_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__voltage_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__voltage_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel__configurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_panel__configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_panel__configuration_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Panel__configuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Design internal gain density feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesign_internal_gain_densityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_design_internal_gain_density_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_design_internal_gain_density_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Design_internal_gain_density(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_a_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_a_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_b_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_b_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_c_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_c_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the D feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_d_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_d_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_D(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_c1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_c1_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_C1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the C2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addC2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_c2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_c2_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_C2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the A3 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addA3PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_A3_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_A3_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_A3(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the A4 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addA4PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_A4_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_A4_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_A4(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the K1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addK1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_k1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_k1_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_K1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the K2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addK2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_k2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_k2_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_K2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_r1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_r1_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_R1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the R2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addR2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_r2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_r2_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_R2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Teq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Teq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Teq_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Teq(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tevent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTeventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Tevent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Tevent_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Tevent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Qi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Qi_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Qi(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qa feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Qa_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Qa_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Qa(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Qm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Qm_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Qm(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQhPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_Qh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_Qh_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Qh(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the DTair feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDTairPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_dTair_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_dTair_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_DTair(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sol inc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSol_incPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_House_sol_inc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_sol_inc_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Sol_inc(),
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
				 getString("_UI_House_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_shape_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Shape(),
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
				 getString("_UI_House_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_load_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Load(),
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
				 getString("_UI_House_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_energy_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Energy(),
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
				 getString("_UI_House_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_power_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Power(),
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
				 getString("_UI_House_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_peak_demand_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Peak_demand(),
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
				 getString("_UI_House_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heatgain_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Heatgain(),
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
				 getString("_UI_House_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_heatgain_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Heatgain_fraction(),
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
				 getString("_UI_House_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_current_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Current_fraction(),
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
				 getString("_UI_House_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_impedance_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Impedance_fraction(),
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
				 getString("_UI_House_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_power_fraction_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Power_fraction(),
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
				 getString("_UI_House_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_power_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Power_factor(),
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
				 getString("_UI_House_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_constant_power_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Constant_power(),
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
				 getString("_UI_House_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_constant_current_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Constant_current(),
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
				 getString("_UI_House_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_constant_admittance_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Constant_admittance(),
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
				 getString("_UI_House_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_voltage_factor_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Voltage_factor(),
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
				 getString("_UI_House_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_configuration_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Configuration(),
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
				 getString("_UI_House_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_House_override_feature", "_UI_House_type"),
				 VisGridPackage.eINSTANCE.getHouse_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			case VisGridPackage.HOUSE__WEATHER:
			case VisGridPackage.HOUSE__FLOOR_AREA:
			case VisGridPackage.HOUSE__GROSS_WALL_AREA:
			case VisGridPackage.HOUSE__CEILING_HEIGHT:
			case VisGridPackage.HOUSE__ASPECT_RATIO:
			case VisGridPackage.HOUSE__ENVELOPE_UA:
			case VisGridPackage.HOUSE__WINDOW_WALL_RATIO:
			case VisGridPackage.HOUSE__NUMBER_OF_DOORS:
			case VisGridPackage.HOUSE__EXTERIOR_WALL_FRACTION:
			case VisGridPackage.HOUSE__INTERIOR_EXTERIOR_WALL_RATIO:
			case VisGridPackage.HOUSE__EXTERIOR_CEILING_FRACTION:
			case VisGridPackage.HOUSE__EXTERIOR_FLOOR_FRACTION:
			case VisGridPackage.HOUSE__WINDOW_SHADING:
			case VisGridPackage.HOUSE__WINDOW_EXTERIOR_TRANSMISSION_COEFFICIENT:
			case VisGridPackage.HOUSE__SOLAR_HEATGAIN_FACTOR:
			case VisGridPackage.HOUSE__AIRCHANGE_PER_HOUR:
			case VisGridPackage.HOUSE__AIRCHANGE_UA:
			case VisGridPackage.HOUSE__INTERNAL_GAIN:
			case VisGridPackage.HOUSE__SOLAR_GAIN:
			case VisGridPackage.HOUSE__HEAT_COOL_GAIN:
			case VisGridPackage.HOUSE__THERMOSTAT_DEADBAND:
			case VisGridPackage.HOUSE__THERMOSTAT_CYCLE_TIME:
			case VisGridPackage.HOUSE__THERMOSTAT_LAST_CYCLE_TIME:
			case VisGridPackage.HOUSE__HEATING_SETPOINT:
			case VisGridPackage.HOUSE__COOLING_SETPOINT:
			case VisGridPackage.HOUSE__DESIGN_HEATING_SETPOINT:
			case VisGridPackage.HOUSE__DESIGN_COOLING_SETPOINT:
			case VisGridPackage.HOUSE__DESIGN_HEATING_CAPACITY:
			case VisGridPackage.HOUSE__DESIGN_COOLING_CAPACITY:
			case VisGridPackage.HOUSE__ADJ_HEATING_CAP:
			case VisGridPackage.HOUSE__SYS_RATED_CAP:
			case VisGridPackage.HOUSE__COOLING_DESIGN_TEMPERATURE:
			case VisGridPackage.HOUSE__HEATING_DESIGN_TEMPERATURE:
			case VisGridPackage.HOUSE__DESIGN_PEAK_SOLAR:
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAINS:
			case VisGridPackage.HOUSE__AIR_HEAT_FRACTION:
			case VisGridPackage.HOUSE__AUXILIARY_HEAT_CAPACITY:
			case VisGridPackage.HOUSE__AUX_HEAT_DEADBAND:
			case VisGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
			case VisGridPackage.HOUSE__AUX_HEAT_TIME_DELAY:
			case VisGridPackage.HOUSE__COOLING_SUPPLY_AIR_TEMP:
			case VisGridPackage.HOUSE__HEATING_SUPPLY_AIR_TEMP:
			case VisGridPackage.HOUSE__DUCT_PRESSURE_DROP:
			case VisGridPackage.HOUSE__FAN_DESIGN_POWER:
			case VisGridPackage.HOUSE__FAN_LOW_POWER_FRACTION:
			case VisGridPackage.HOUSE__FAN_POWER:
			case VisGridPackage.HOUSE__FAN_DESIGN_AIRFLOW:
			case VisGridPackage.HOUSE__FAN_IMPEDANCE_FRACTION:
			case VisGridPackage.HOUSE__FAN_POWER_FRACTION:
			case VisGridPackage.HOUSE__FAN_CURRENT_FRACTION:
			case VisGridPackage.HOUSE__FAN_POWER_FACTOR:
			case VisGridPackage.HOUSE__HEATING_DEMAND:
			case VisGridPackage.HOUSE__COOLING_DEMAND:
			case VisGridPackage.HOUSE__HEATING_COP:
			case VisGridPackage.HOUSE__COOLING_COP:
			case VisGridPackage.HOUSE__ADJ_HEATING_COP:
			case VisGridPackage.HOUSE__AIR_TEMPERATURE:
			case VisGridPackage.HOUSE__OUTDOOR_TEMPERATURE:
			case VisGridPackage.HOUSE__MASS_HEAT_CAPACITY:
			case VisGridPackage.HOUSE__MASS_HEAT_COEFF:
			case VisGridPackage.HOUSE__MASS_TEMPERATURE:
			case VisGridPackage.HOUSE__AIR_VOLUME:
			case VisGridPackage.HOUSE__AIR_MASS:
			case VisGridPackage.HOUSE__AIR_HEAT_CAPACITY:
			case VisGridPackage.HOUSE__LATENT_LOAD_FRACTION:
			case VisGridPackage.HOUSE__TOTAL_THERMAL_MASS_PER_FLOOR_AREA:
			case VisGridPackage.HOUSE__INTERIOR_SURFACE_HEAT_TRANSFER_COEFF:
			case VisGridPackage.HOUSE__NUMBER_OF_STORIES:
			case VisGridPackage.HOUSE__SYSTEM_TYPE:
			case VisGridPackage.HOUSE__AUXILIARY_STRATEGY:
			case VisGridPackage.HOUSE__SYSTEM_MODE:
			case VisGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
			case VisGridPackage.HOUSE__COOLING_SYSTEM_TYPE:
			case VisGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
			case VisGridPackage.HOUSE__FAN_TYPE:
			case VisGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
			case VisGridPackage.HOUSE__GLASS_TYPE:
			case VisGridPackage.HOUSE__WINDOW_FRAME:
			case VisGridPackage.HOUSE__GLAZING_TREATMENT:
			case VisGridPackage.HOUSE__GLAZING_LAYERS:
			case VisGridPackage.HOUSE__MOTOR_MODEL:
			case VisGridPackage.HOUSE__MOTOR_EFFICIENCY:
			case VisGridPackage.HOUSE__HVAC_MOTOR_EFFICIENCY:
			case VisGridPackage.HOUSE__HVAC_MOTOR_LOSS_POWER_FACTOR:
			case VisGridPackage.HOUSE__RROOF:
			case VisGridPackage.HOUSE__RWALL:
			case VisGridPackage.HOUSE__RFLOOR:
			case VisGridPackage.HOUSE__RWINDOWS:
			case VisGridPackage.HOUSE__RDOORS:
			case VisGridPackage.HOUSE__HVAC_BREAKER_RATING:
			case VisGridPackage.HOUSE__HVAC_POWER_FACTOR:
			case VisGridPackage.HOUSE__HVAC_LOAD:
			case VisGridPackage.HOUSE__PANEL:
			case VisGridPackage.HOUSE__PANEL_ENERGY:
			case VisGridPackage.HOUSE__PANEL_POWER:
			case VisGridPackage.HOUSE__PANEL_PEAK_DEMAND:
			case VisGridPackage.HOUSE__PANEL_HEATGAIN:
			case VisGridPackage.HOUSE__PANEL_HEATGAIN_FRACTION:
			case VisGridPackage.HOUSE__PANEL_CURRENT_FRACTION:
			case VisGridPackage.HOUSE__PANEL_IMPEDANCE_FRACTION:
			case VisGridPackage.HOUSE__PANEL_POWER_FRACTION:
			case VisGridPackage.HOUSE__PANEL_POWER_FACTOR:
			case VisGridPackage.HOUSE__PANEL_CONSTANT_POWER:
			case VisGridPackage.HOUSE__PANEL_CONSTANT_CURRENT:
			case VisGridPackage.HOUSE__PANEL_CONSTANT_ADMITTANCE:
			case VisGridPackage.HOUSE__PANEL_VOLTAGE_FACTOR:
			case VisGridPackage.HOUSE__PANEL_CONFIGURATION:
			case VisGridPackage.HOUSE__DESIGN_INTERNAL_GAIN_DENSITY:
			case VisGridPackage.HOUSE__A:
			case VisGridPackage.HOUSE__B:
			case VisGridPackage.HOUSE__C:
			case VisGridPackage.HOUSE__D:
			case VisGridPackage.HOUSE__C1:
			case VisGridPackage.HOUSE__C2:
			case VisGridPackage.HOUSE__A3:
			case VisGridPackage.HOUSE__A4:
			case VisGridPackage.HOUSE__K1:
			case VisGridPackage.HOUSE__K2:
			case VisGridPackage.HOUSE__R1:
			case VisGridPackage.HOUSE__R2:
			case VisGridPackage.HOUSE__TEQ:
			case VisGridPackage.HOUSE__TEVENT:
			case VisGridPackage.HOUSE__QI:
			case VisGridPackage.HOUSE__QA:
			case VisGridPackage.HOUSE__QM:
			case VisGridPackage.HOUSE__QH:
			case VisGridPackage.HOUSE__DTAIR:
			case VisGridPackage.HOUSE__SOL_INC:
			case VisGridPackage.HOUSE__SHAPE:
			case VisGridPackage.HOUSE__LOAD:
			case VisGridPackage.HOUSE__ENERGY:
			case VisGridPackage.HOUSE__POWER:
			case VisGridPackage.HOUSE__PEAK_DEMAND:
			case VisGridPackage.HOUSE__HEATGAIN:
			case VisGridPackage.HOUSE__HEATGAIN_FRACTION:
			case VisGridPackage.HOUSE__CURRENT_FRACTION:
			case VisGridPackage.HOUSE__IMPEDANCE_FRACTION:
			case VisGridPackage.HOUSE__POWER_FRACTION:
			case VisGridPackage.HOUSE__POWER_FACTOR:
			case VisGridPackage.HOUSE__CONSTANT_POWER:
			case VisGridPackage.HOUSE__CONSTANT_CURRENT:
			case VisGridPackage.HOUSE__CONSTANT_ADMITTANCE:
			case VisGridPackage.HOUSE__VOLTAGE_FACTOR:
			case VisGridPackage.HOUSE__CONFIGURATION:
			case VisGridPackage.HOUSE__OVERRIDE:
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
