/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;
import java.util.HashMap;
        import java.util.Map;
        import java.util.Timer;
        import java.util.TimerTask;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.House_a;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House a</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.House_aImpl#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getGross_wall_area <em>Gross wall area</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getCeiling_height <em>Ceiling height</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getAspect_ratio <em>Aspect ratio</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getEnvelope_UA <em>Envelope UA</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getWindow_wall_ratio <em>Window wall ratio</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getGlazing_shgc <em>Glazing shgc</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getAirchange_per_hour <em>Airchange per hour</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getSolar_gain <em>Solar gain</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHeat_cool_gain <em>Heat cool gain</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getDesign_heating_capacity <em>Design heating capacity</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getDesign_cooling_capacity <em>Design cooling capacity</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHeating_COP <em>Heating COP</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getCooling_COP <em>Cooling COP</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getCOP_coeff <em>COP coeff</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getOutside_temp <em>Outside temp</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getMass_heat_coeff <em>Mass heat coeff</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getOutdoor_temperature <em>Outdoor temperature</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouse_thermal_mass <em>House thermal mass</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHeat_mode <em>Heat mode</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHc_mode <em>Hc mode</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload <em>Houseload</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__energy <em>Houseload energy</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__power <em>Houseload power</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__peak_demand <em>Houseload peak demand</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__heatgain <em>Houseload heatgain</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__heatgain_fraction <em>Houseload heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__current_fraction <em>Houseload current fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__impedance_fraction <em>Houseload impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__power_fraction <em>Houseload power fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__power_factor <em>Houseload power factor</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__constant_power <em>Houseload constant power</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__constant_current <em>Houseload constant current</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__constant_admittance <em>Houseload constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__voltage_factor <em>Houseload voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHouseload__configuration <em>Houseload configuration</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.House_aImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class House_aImpl extends ConnectionImpl implements House_a {
	// Generated by python script located in this directory
       boolean threadLock = false;       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();
   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (entry.getValue().equals(false)) return;
        }
        resetLock();
    }

    private void resetLock() {
        Timer timer = new Timer();
        class Task extends TimerTask{
            public void run() {
                threadLock = true;
                for (Map.Entry<String, Boolean> entry : lock.entrySet()){
                    entry.setValue(false);
                }
                threadLock = false;
            }   
        }
        timer.schedule(new Task(), 1000);
    }
    // END PYTHON GENERATED CODE
	/**
	 * The default value of the '{@link #getFloor_area() <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor_area()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOOR_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloor_area() <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor_area()
	 * @generated
	 * @ordered
	 */
	protected String floor_area = FLOOR_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getGross_wall_area() <em>Gross wall area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGross_wall_area()
	 * @generated
	 * @ordered
	 */
	protected static final String GROSS_WALL_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGross_wall_area() <em>Gross wall area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGross_wall_area()
	 * @generated
	 * @ordered
	 */
	protected String gross_wall_area = GROSS_WALL_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCeiling_height() <em>Ceiling height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling_height()
	 * @generated
	 * @ordered
	 */
	protected static final String CEILING_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCeiling_height() <em>Ceiling height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeiling_height()
	 * @generated
	 * @ordered
	 */
	protected String ceiling_height = CEILING_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspect_ratio() <em>Aspect ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspect_ratio() <em>Aspect ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect_ratio()
	 * @generated
	 * @ordered
	 */
	protected String aspect_ratio = ASPECT_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvelope_UA() <em>Envelope UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelope_UA()
	 * @generated
	 * @ordered
	 */
	protected static final String ENVELOPE_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvelope_UA() <em>Envelope UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelope_UA()
	 * @generated
	 * @ordered
	 */
	protected String envelope_UA = ENVELOPE_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindow_wall_ratio() <em>Window wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_wall_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOW_WALL_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindow_wall_ratio() <em>Window wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow_wall_ratio()
	 * @generated
	 * @ordered
	 */
	protected String window_wall_ratio = WINDOW_WALL_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing_shgc() <em>Glazing shgc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing_shgc()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_SHGC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing_shgc() <em>Glazing shgc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing_shgc()
	 * @generated
	 * @ordered
	 */
	protected String glazing_shgc = GLAZING_SHGC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAirchange_per_hour() <em>Airchange per hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirchange_per_hour()
	 * @generated
	 * @ordered
	 */
	protected static final String AIRCHANGE_PER_HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAirchange_per_hour() <em>Airchange per hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirchange_per_hour()
	 * @generated
	 * @ordered
	 */
	protected String airchange_per_hour = AIRCHANGE_PER_HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolar_gain() <em>Solar gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_gain()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolar_gain() <em>Solar gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar_gain()
	 * @generated
	 * @ordered
	 */
	protected String solar_gain = SOLAR_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeat_cool_gain() <em>Heat cool gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_cool_gain()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAT_COOL_GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeat_cool_gain() <em>Heat cool gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_cool_gain()
	 * @generated
	 * @ordered
	 */
	protected String heat_cool_gain = HEAT_COOL_GAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermostat_deadband() <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_deadband()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMOSTAT_DEADBAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermostat_deadband() <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermostat_deadband()
	 * @generated
	 * @ordered
	 */
	protected String thermostat_deadband = THERMOSTAT_DEADBAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_setpoint() <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_setpoint() <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String heating_setpoint = HEATING_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_setpoint() <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_setpoint() <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String cooling_setpoint = COOLING_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_heating_capacity() <em>Design heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_heating_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_HEATING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_heating_capacity() <em>Design heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_heating_capacity()
	 * @generated
	 * @ordered
	 */
	protected String design_heating_capacity = DESIGN_HEATING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesign_cooling_capacity() <em>Design cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_cooling_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_COOLING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesign_cooling_capacity() <em>Design cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesign_cooling_capacity()
	 * @generated
	 * @ordered
	 */
	protected String design_cooling_capacity = DESIGN_COOLING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_COP() <em>Heating COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_COP()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_COP() <em>Heating COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_COP()
	 * @generated
	 * @ordered
	 */
	protected String heating_COP = HEATING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCooling_COP() <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_COP()
	 * @generated
	 * @ordered
	 */
	protected static final String COOLING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCooling_COP() <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCooling_COP()
	 * @generated
	 * @ordered
	 */
	protected String cooling_COP = COOLING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOP_coeff() <em>COP coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOP_coeff()
	 * @generated
	 * @ordered
	 */
	protected static final String COP_COEFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOP_coeff() <em>COP coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOP_coeff()
	 * @generated
	 * @ordered
	 */
	protected String coP_coeff = COP_COEFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAir_temperature() <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String AIR_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAir_temperature() <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAir_temperature()
	 * @generated
	 * @ordered
	 */
	protected String air_temperature = AIR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutside_temp() <em>Outside temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutside_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTSIDE_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutside_temp() <em>Outside temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutside_temp()
	 * @generated
	 * @ordered
	 */
	protected String outside_temp = OUTSIDE_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass_temperature() <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String MASS_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMass_temperature() <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_temperature()
	 * @generated
	 * @ordered
	 */
	protected String mass_temperature = MASS_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass_heat_coeff() <em>Mass heat coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_heat_coeff()
	 * @generated
	 * @ordered
	 */
	protected static final String MASS_HEAT_COEFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMass_heat_coeff() <em>Mass heat coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass_heat_coeff()
	 * @generated
	 * @ordered
	 */
	protected String mass_heat_coeff = MASS_HEAT_COEFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutdoor_temperature() <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdoor_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDOOR_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdoor_temperature() <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdoor_temperature()
	 * @generated
	 * @ordered
	 */
	protected String outdoor_temperature = OUTDOOR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouse_thermal_mass() <em>House thermal mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse_thermal_mass()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_THERMAL_MASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouse_thermal_mass() <em>House thermal mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse_thermal_mass()
	 * @generated
	 * @ordered
	 */
	protected String house_thermal_mass = HOUSE_THERMAL_MASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeat_mode() <em>Heat mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeat_mode() <em>Heat mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeat_mode()
	 * @generated
	 * @ordered
	 */
	protected String heat_mode = HEAT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHc_mode() <em>Hc mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHc_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String HC_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHc_mode() <em>Hc mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHc_mode()
	 * @generated
	 * @ordered
	 */
	protected String hc_mode = HC_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload() <em>Houseload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload() <em>Houseload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload()
	 * @generated
	 * @ordered
	 */
	protected String houseload = HOUSELOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__energy() <em>Houseload energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__energy()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__energy() <em>Houseload energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__energy()
	 * @generated
	 * @ordered
	 */
	protected String houseload__energy = HOUSELOAD_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__power() <em>Houseload power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__power()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__power() <em>Houseload power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__power()
	 * @generated
	 * @ordered
	 */
	protected String houseload__power = HOUSELOAD_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__peak_demand() <em>Houseload peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__peak_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_PEAK_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__peak_demand() <em>Houseload peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__peak_demand()
	 * @generated
	 * @ordered
	 */
	protected String houseload__peak_demand = HOUSELOAD_PEAK_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__heatgain() <em>Houseload heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__heatgain()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_HEATGAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__heatgain() <em>Houseload heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__heatgain()
	 * @generated
	 * @ordered
	 */
	protected String houseload__heatgain = HOUSELOAD_HEATGAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__heatgain_fraction() <em>Houseload heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_HEATGAIN_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__heatgain_fraction() <em>Houseload heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected String houseload__heatgain_fraction = HOUSELOAD_HEATGAIN_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__current_fraction() <em>Houseload current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__current_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_CURRENT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__current_fraction() <em>Houseload current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__current_fraction()
	 * @generated
	 * @ordered
	 */
	protected String houseload__current_fraction = HOUSELOAD_CURRENT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__impedance_fraction() <em>Houseload impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__impedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_IMPEDANCE_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__impedance_fraction() <em>Houseload impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__impedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected String houseload__impedance_fraction = HOUSELOAD_IMPEDANCE_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__power_fraction() <em>Houseload power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__power_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_POWER_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__power_fraction() <em>Houseload power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__power_fraction()
	 * @generated
	 * @ordered
	 */
	protected String houseload__power_fraction = HOUSELOAD_POWER_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__power_factor() <em>Houseload power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__power_factor() <em>Houseload power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__power_factor()
	 * @generated
	 * @ordered
	 */
	protected String houseload__power_factor = HOUSELOAD_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__constant_power() <em>Houseload constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__constant_power()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_CONSTANT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__constant_power() <em>Houseload constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__constant_power()
	 * @generated
	 * @ordered
	 */
	protected String houseload__constant_power = HOUSELOAD_CONSTANT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__constant_current() <em>Houseload constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__constant_current()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_CONSTANT_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__constant_current() <em>Houseload constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__constant_current()
	 * @generated
	 * @ordered
	 */
	protected String houseload__constant_current = HOUSELOAD_CONSTANT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__constant_admittance() <em>Houseload constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__constant_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_CONSTANT_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__constant_admittance() <em>Houseload constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__constant_admittance()
	 * @generated
	 * @ordered
	 */
	protected String houseload__constant_admittance = HOUSELOAD_CONSTANT_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__voltage_factor() <em>Houseload voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__voltage_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_VOLTAGE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__voltage_factor() <em>Houseload voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__voltage_factor()
	 * @generated
	 * @ordered
	 */
	protected String houseload__voltage_factor = HOUSELOAD_VOLTAGE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseload__configuration() <em>Houseload configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__configuration()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSELOAD_CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseload__configuration() <em>Houseload configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseload__configuration()
	 * @generated
	 * @ordered
	 */
	protected String houseload__configuration = HOUSELOAD_CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected String shape = SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected String load = LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected static final String ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected String energy = ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected String power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeak_demand() <em>Peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeak_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String PEAK_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeak_demand() <em>Peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeak_demand()
	 * @generated
	 * @ordered
	 */
	protected String peak_demand = PEAK_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatgain() <em>Heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATGAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeatgain() <em>Heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain()
	 * @generated
	 * @ordered
	 */
	protected String heatgain = HEATGAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeatgain_fraction() <em>Heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATGAIN_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeatgain_fraction() <em>Heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected String heatgain_fraction = HEATGAIN_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_fraction() <em>Current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_fraction() <em>Current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_fraction()
	 * @generated
	 * @ordered
	 */
	protected String current_fraction = CURRENT_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance_fraction() <em>Impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance_fraction() <em>Impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance_fraction()
	 * @generated
	 * @ordered
	 */
	protected String impedance_fraction = IMPEDANCE_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_fraction() <em>Power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_fraction() <em>Power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_fraction()
	 * @generated
	 * @ordered
	 */
	protected String power_fraction = POWER_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_factor() <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_factor() <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_factor()
	 * @generated
	 * @ordered
	 */
	protected String power_factor = POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power() <em>Constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power() <em>Constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power()
	 * @generated
	 * @ordered
	 */
	protected String constant_power = CONSTANT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current() <em>Constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current() <em>Constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current()
	 * @generated
	 * @ordered
	 */
	protected String constant_current = CONSTANT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_admittance() <em>Constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_admittance() <em>Constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_admittance()
	 * @generated
	 * @ordered
	 */
	protected String constant_admittance = CONSTANT_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_factor() <em>Voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_factor() <em>Voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_factor()
	 * @generated
	 * @ordered
	 */
	protected String voltage_factor = VOLTAGE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String configuration = CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected String override = OVERRIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected House_aImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getHouse_a();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloor_area() {
		// Generated by python script located in this directory
		if (!lock.containsKey("floor_area")) lock.put("floor_area", new Boolean(false));
			if (!(Boolean)lock.get("floor_area")){
				lock.put("floor_area", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"floor_area");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Floor_area");
					floor_area= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return floor_area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor_area(String newFloor_area) {
		String oldFloor_area = floor_area;
		floor_area = newFloor_area;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__FLOOR_AREA, oldFloor_area, floor_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGross_wall_area() {
		// Generated by python script located in this directory
		if (!lock.containsKey("gross_wall_area")) lock.put("gross_wall_area", new Boolean(false));
			if (!(Boolean)lock.get("gross_wall_area")){
				lock.put("gross_wall_area", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"gross_wall_area");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Gross_wall_area");
					gross_wall_area= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return gross_wall_area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGross_wall_area(String newGross_wall_area) {
		String oldGross_wall_area = gross_wall_area;
		gross_wall_area = newGross_wall_area;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__GROSS_WALL_AREA, oldGross_wall_area, gross_wall_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCeiling_height() {
		// Generated by python script located in this directory
		if (!lock.containsKey("ceiling_height")) lock.put("ceiling_height", new Boolean(false));
			if (!(Boolean)lock.get("ceiling_height")){
				lock.put("ceiling_height", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"ceiling_height");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Ceiling_height");
					ceiling_height= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return ceiling_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCeiling_height(String newCeiling_height) {
		String oldCeiling_height = ceiling_height;
		ceiling_height = newCeiling_height;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__CEILING_HEIGHT, oldCeiling_height, ceiling_height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspect_ratio() {
		// Generated by python script located in this directory
		if (!lock.containsKey("aspect_ratio")) lock.put("aspect_ratio", new Boolean(false));
			if (!(Boolean)lock.get("aspect_ratio")){
				lock.put("aspect_ratio", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"aspect_ratio");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Aspect_ratio");
					aspect_ratio= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return aspect_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect_ratio(String newAspect_ratio) {
		String oldAspect_ratio = aspect_ratio;
		aspect_ratio = newAspect_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__ASPECT_RATIO, oldAspect_ratio, aspect_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnvelope_UA() {
		// Generated by python script located in this directory
		if (!lock.containsKey("envelope_UA")) lock.put("envelope_UA", new Boolean(false));
			if (!(Boolean)lock.get("envelope_UA")){
				lock.put("envelope_UA", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"envelope_UA");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Envelope_UA");
					envelope_UA= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return envelope_UA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvelope_UA(String newEnvelope_UA) {
		String oldEnvelope_UA = envelope_UA;
		envelope_UA = newEnvelope_UA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__ENVELOPE_UA, oldEnvelope_UA, envelope_UA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindow_wall_ratio() {
		// Generated by python script located in this directory
		if (!lock.containsKey("window_wall_ratio")) lock.put("window_wall_ratio", new Boolean(false));
			if (!(Boolean)lock.get("window_wall_ratio")){
				lock.put("window_wall_ratio", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"window_wall_ratio");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Window_wall_ratio");
					window_wall_ratio= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return window_wall_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow_wall_ratio(String newWindow_wall_ratio) {
		String oldWindow_wall_ratio = window_wall_ratio;
		window_wall_ratio = newWindow_wall_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__WINDOW_WALL_RATIO, oldWindow_wall_ratio, window_wall_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing_shgc() {
		// Generated by python script located in this directory
		if (!lock.containsKey("glazing_shgc")) lock.put("glazing_shgc", new Boolean(false));
			if (!(Boolean)lock.get("glazing_shgc")){
				lock.put("glazing_shgc", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing_shgc");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Glazing_shgc");
					glazing_shgc= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing_shgc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing_shgc(String newGlazing_shgc) {
		String oldGlazing_shgc = glazing_shgc;
		glazing_shgc = newGlazing_shgc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__GLAZING_SHGC, oldGlazing_shgc, glazing_shgc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAirchange_per_hour() {
		// Generated by python script located in this directory
		if (!lock.containsKey("airchange_per_hour")) lock.put("airchange_per_hour", new Boolean(false));
			if (!(Boolean)lock.get("airchange_per_hour")){
				lock.put("airchange_per_hour", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"airchange_per_hour");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Airchange_per_hour");
					airchange_per_hour= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return airchange_per_hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAirchange_per_hour(String newAirchange_per_hour) {
		String oldAirchange_per_hour = airchange_per_hour;
		airchange_per_hour = newAirchange_per_hour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__AIRCHANGE_PER_HOUR, oldAirchange_per_hour, airchange_per_hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolar_gain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("solar_gain")) lock.put("solar_gain", new Boolean(false));
			if (!(Boolean)lock.get("solar_gain")){
				lock.put("solar_gain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"solar_gain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Solar_gain");
					solar_gain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return solar_gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolar_gain(String newSolar_gain) {
		String oldSolar_gain = solar_gain;
		solar_gain = newSolar_gain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__SOLAR_GAIN, oldSolar_gain, solar_gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeat_cool_gain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heat_cool_gain")) lock.put("heat_cool_gain", new Boolean(false));
			if (!(Boolean)lock.get("heat_cool_gain")){
				lock.put("heat_cool_gain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heat_cool_gain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heat_cool_gain");
					heat_cool_gain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heat_cool_gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeat_cool_gain(String newHeat_cool_gain) {
		String oldHeat_cool_gain = heat_cool_gain;
		heat_cool_gain = newHeat_cool_gain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HEAT_COOL_GAIN, oldHeat_cool_gain, heat_cool_gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermostat_deadband() {
		// Generated by python script located in this directory
		if (!lock.containsKey("thermostat_deadband")) lock.put("thermostat_deadband", new Boolean(false));
			if (!(Boolean)lock.get("thermostat_deadband")){
				lock.put("thermostat_deadband", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"thermostat_deadband");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Thermostat_deadband");
					thermostat_deadband= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return thermostat_deadband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermostat_deadband(String newThermostat_deadband) {
		String oldThermostat_deadband = thermostat_deadband;
		thermostat_deadband = newThermostat_deadband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__THERMOSTAT_DEADBAND, oldThermostat_deadband, thermostat_deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_setpoint() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_setpoint")) lock.put("heating_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("heating_setpoint")){
				lock.put("heating_setpoint", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_setpoint");
					heating_setpoint= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_setpoint(String newHeating_setpoint) {
		String oldHeating_setpoint = heating_setpoint;
		heating_setpoint = newHeating_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HEATING_SETPOINT, oldHeating_setpoint, heating_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_setpoint() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_setpoint")) lock.put("cooling_setpoint", new Boolean(false));
			if (!(Boolean)lock.get("cooling_setpoint")){
				lock.put("cooling_setpoint", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_setpoint");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_setpoint");
					cooling_setpoint= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_setpoint(String newCooling_setpoint) {
		String oldCooling_setpoint = cooling_setpoint;
		cooling_setpoint = newCooling_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__COOLING_SETPOINT, oldCooling_setpoint, cooling_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_heating_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_heating_capacity")) lock.put("design_heating_capacity", new Boolean(false));
			if (!(Boolean)lock.get("design_heating_capacity")){
				lock.put("design_heating_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_heating_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_heating_capacity");
					design_heating_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_heating_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_heating_capacity(String newDesign_heating_capacity) {
		String oldDesign_heating_capacity = design_heating_capacity;
		design_heating_capacity = newDesign_heating_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__DESIGN_HEATING_CAPACITY, oldDesign_heating_capacity, design_heating_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesign_cooling_capacity() {
		// Generated by python script located in this directory
		if (!lock.containsKey("design_cooling_capacity")) lock.put("design_cooling_capacity", new Boolean(false));
			if (!(Boolean)lock.get("design_cooling_capacity")){
				lock.put("design_cooling_capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"design_cooling_capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Design_cooling_capacity");
					design_cooling_capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return design_cooling_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesign_cooling_capacity(String newDesign_cooling_capacity) {
		String oldDesign_cooling_capacity = design_cooling_capacity;
		design_cooling_capacity = newDesign_cooling_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__DESIGN_COOLING_CAPACITY, oldDesign_cooling_capacity, design_cooling_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_COP() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heating_COP")) lock.put("heating_COP", new Boolean(false));
			if (!(Boolean)lock.get("heating_COP")){
				lock.put("heating_COP", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heating_COP");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heating_COP");
					heating_COP= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heating_COP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_COP(String newHeating_COP) {
		String oldHeating_COP = heating_COP;
		heating_COP = newHeating_COP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HEATING_COP, oldHeating_COP, heating_COP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_COP() {
		// Generated by python script located in this directory
		if (!lock.containsKey("cooling_COP")) lock.put("cooling_COP", new Boolean(false));
			if (!(Boolean)lock.get("cooling_COP")){
				lock.put("cooling_COP", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"cooling_COP");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Cooling_COP");
					cooling_COP= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return cooling_COP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooling_COP(String newCooling_COP) {
		String oldCooling_COP = cooling_COP;
		cooling_COP = newCooling_COP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__COOLING_COP, oldCooling_COP, cooling_COP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCOP_coeff() {
		// Generated by python script located in this directory
		if (!lock.containsKey("coP_coeff")) lock.put("coP_coeff", new Boolean(false));
			if (!(Boolean)lock.get("coP_coeff")){
				lock.put("coP_coeff", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"coP_coeff");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"CoP_coeff");
					coP_coeff= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return coP_coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOP_coeff(String newCOP_coeff) {
		String oldCOP_coeff = coP_coeff;
		coP_coeff = newCOP_coeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__COP_COEFF, oldCOP_coeff, coP_coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("air_temperature")) lock.put("air_temperature", new Boolean(false));
			if (!(Boolean)lock.get("air_temperature")){
				lock.put("air_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"air_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Air_temperature");
					air_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return air_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAir_temperature(String newAir_temperature) {
		String oldAir_temperature = air_temperature;
		air_temperature = newAir_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__AIR_TEMPERATURE, oldAir_temperature, air_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutside_temp() {
		// Generated by python script located in this directory
		if (!lock.containsKey("outside_temp")) lock.put("outside_temp", new Boolean(false));
			if (!(Boolean)lock.get("outside_temp")){
				lock.put("outside_temp", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"outside_temp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Outside_temp");
					outside_temp= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return outside_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutside_temp(String newOutside_temp) {
		String oldOutside_temp = outside_temp;
		outside_temp = newOutside_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__OUTSIDE_TEMP, oldOutside_temp, outside_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMass_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("mass_temperature")) lock.put("mass_temperature", new Boolean(false));
			if (!(Boolean)lock.get("mass_temperature")){
				lock.put("mass_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"mass_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Mass_temperature");
					mass_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return mass_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass_temperature(String newMass_temperature) {
		String oldMass_temperature = mass_temperature;
		mass_temperature = newMass_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__MASS_TEMPERATURE, oldMass_temperature, mass_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMass_heat_coeff() {
		// Generated by python script located in this directory
		if (!lock.containsKey("mass_heat_coeff")) lock.put("mass_heat_coeff", new Boolean(false));
			if (!(Boolean)lock.get("mass_heat_coeff")){
				lock.put("mass_heat_coeff", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"mass_heat_coeff");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Mass_heat_coeff");
					mass_heat_coeff= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return mass_heat_coeff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass_heat_coeff(String newMass_heat_coeff) {
		String oldMass_heat_coeff = mass_heat_coeff;
		mass_heat_coeff = newMass_heat_coeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__MASS_HEAT_COEFF, oldMass_heat_coeff, mass_heat_coeff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutdoor_temperature() {
		// Generated by python script located in this directory
		if (!lock.containsKey("outdoor_temperature")) lock.put("outdoor_temperature", new Boolean(false));
			if (!(Boolean)lock.get("outdoor_temperature")){
				lock.put("outdoor_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"outdoor_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Outdoor_temperature");
					outdoor_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return outdoor_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutdoor_temperature(String newOutdoor_temperature) {
		String oldOutdoor_temperature = outdoor_temperature;
		outdoor_temperature = newOutdoor_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__OUTDOOR_TEMPERATURE, oldOutdoor_temperature, outdoor_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouse_thermal_mass() {
		// Generated by python script located in this directory
		if (!lock.containsKey("house_thermal_mass")) lock.put("house_thermal_mass", new Boolean(false));
			if (!(Boolean)lock.get("house_thermal_mass")){
				lock.put("house_thermal_mass", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"house_thermal_mass");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"House_thermal_mass");
					house_thermal_mass= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return house_thermal_mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse_thermal_mass(String newHouse_thermal_mass) {
		String oldHouse_thermal_mass = house_thermal_mass;
		house_thermal_mass = newHouse_thermal_mass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSE_THERMAL_MASS, oldHouse_thermal_mass, house_thermal_mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeat_mode() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heat_mode")) lock.put("heat_mode", new Boolean(false));
			if (!(Boolean)lock.get("heat_mode")){
				lock.put("heat_mode", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heat_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heat_mode");
					heat_mode= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heat_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeat_mode(String newHeat_mode) {
		String oldHeat_mode = heat_mode;
		heat_mode = newHeat_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HEAT_MODE, oldHeat_mode, heat_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHc_mode() {
		// Generated by python script located in this directory
		if (!lock.containsKey("hc_mode")) lock.put("hc_mode", new Boolean(false));
			if (!(Boolean)lock.get("hc_mode")){
				lock.put("hc_mode", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hc_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hc_mode");
					hc_mode= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hc_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHc_mode(String newHc_mode) {
		String oldHc_mode = hc_mode;
		hc_mode = newHc_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HC_MODE, oldHc_mode, hc_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload")) lock.put("houseload", new Boolean(false));
			if (!(Boolean)lock.get("houseload")){
				lock.put("houseload", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Houseload");
					houseload= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload(String newHouseload) {
		String oldHouseload = houseload;
		houseload = newHouseload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD, oldHouseload, houseload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__energy() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__energy")) lock.put("houseload__energy", new Boolean(false));
			if (!(Boolean)lock.get("houseload__energy")){
				lock.put("houseload__energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20ENERGY");
					houseload__energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__energy(String newHouseload__energy) {
		String oldHouseload__energy = houseload__energy;
		houseload__energy = newHouseload__energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_ENERGY, oldHouseload__energy, houseload__energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__power")) lock.put("houseload__power", new Boolean(false));
			if (!(Boolean)lock.get("houseload__power")){
				lock.put("houseload__power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20POWER");
					houseload__power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__power(String newHouseload__power) {
		String oldHouseload__power = houseload__power;
		houseload__power = newHouseload__power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_POWER, oldHouseload__power, houseload__power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__peak_demand() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__peak_demand")) lock.put("houseload__peak_demand", new Boolean(false));
			if (!(Boolean)lock.get("houseload__peak_demand")){
				lock.put("houseload__peak_demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20peak_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20PEAK_DEMAND");
					houseload__peak_demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__peak_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__peak_demand(String newHouseload__peak_demand) {
		String oldHouseload__peak_demand = houseload__peak_demand;
		houseload__peak_demand = newHouseload__peak_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_PEAK_DEMAND, oldHouseload__peak_demand, houseload__peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__heatgain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__heatgain")) lock.put("houseload__heatgain", new Boolean(false));
			if (!(Boolean)lock.get("houseload__heatgain")){
				lock.put("houseload__heatgain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20heatgain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20HEATGAIN");
					houseload__heatgain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__heatgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__heatgain(String newHouseload__heatgain) {
		String oldHouseload__heatgain = houseload__heatgain;
		houseload__heatgain = newHouseload__heatgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN, oldHouseload__heatgain, houseload__heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__heatgain_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__heatgain_fraction")) lock.put("houseload__heatgain_fraction", new Boolean(false));
			if (!(Boolean)lock.get("houseload__heatgain_fraction")){
				lock.put("houseload__heatgain_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20heatgain_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20HEATGAIN_FRACTION");
					houseload__heatgain_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__heatgain_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__heatgain_fraction(String newHouseload__heatgain_fraction) {
		String oldHouseload__heatgain_fraction = houseload__heatgain_fraction;
		houseload__heatgain_fraction = newHouseload__heatgain_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN_FRACTION, oldHouseload__heatgain_fraction, houseload__heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__current_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__current_fraction")) lock.put("houseload__current_fraction", new Boolean(false));
			if (!(Boolean)lock.get("houseload__current_fraction")){
				lock.put("houseload__current_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20current_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20CURRENT_FRACTION");
					houseload__current_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__current_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__current_fraction(String newHouseload__current_fraction) {
		String oldHouseload__current_fraction = houseload__current_fraction;
		houseload__current_fraction = newHouseload__current_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_CURRENT_FRACTION, oldHouseload__current_fraction, houseload__current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__impedance_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__impedance_fraction")) lock.put("houseload__impedance_fraction", new Boolean(false));
			if (!(Boolean)lock.get("houseload__impedance_fraction")){
				lock.put("houseload__impedance_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20impedance_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20IMPEDANCE_FRACTION");
					houseload__impedance_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__impedance_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__impedance_fraction(String newHouseload__impedance_fraction) {
		String oldHouseload__impedance_fraction = houseload__impedance_fraction;
		houseload__impedance_fraction = newHouseload__impedance_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_IMPEDANCE_FRACTION, oldHouseload__impedance_fraction, houseload__impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__power_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__power_fraction")) lock.put("houseload__power_fraction", new Boolean(false));
			if (!(Boolean)lock.get("houseload__power_fraction")){
				lock.put("houseload__power_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20power_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20POWER_FRACTION");
					houseload__power_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__power_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__power_fraction(String newHouseload__power_fraction) {
		String oldHouseload__power_fraction = houseload__power_fraction;
		houseload__power_fraction = newHouseload__power_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FRACTION, oldHouseload__power_fraction, houseload__power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__power_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__power_factor")) lock.put("houseload__power_factor", new Boolean(false));
			if (!(Boolean)lock.get("houseload__power_factor")){
				lock.put("houseload__power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20POWER_FACTOR");
					houseload__power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__power_factor(String newHouseload__power_factor) {
		String oldHouseload__power_factor = houseload__power_factor;
		houseload__power_factor = newHouseload__power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FACTOR, oldHouseload__power_factor, houseload__power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__constant_power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__constant_power")) lock.put("houseload__constant_power", new Boolean(false));
			if (!(Boolean)lock.get("houseload__constant_power")){
				lock.put("houseload__constant_power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20constant_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20CONSTANT_POWER");
					houseload__constant_power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__constant_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__constant_power(String newHouseload__constant_power) {
		String oldHouseload__constant_power = houseload__constant_power;
		houseload__constant_power = newHouseload__constant_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_POWER, oldHouseload__constant_power, houseload__constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__constant_current() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__constant_current")) lock.put("houseload__constant_current", new Boolean(false));
			if (!(Boolean)lock.get("houseload__constant_current")){
				lock.put("houseload__constant_current", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20constant_current");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20CONSTANT_CURRENT");
					houseload__constant_current= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__constant_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__constant_current(String newHouseload__constant_current) {
		String oldHouseload__constant_current = houseload__constant_current;
		houseload__constant_current = newHouseload__constant_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_CURRENT, oldHouseload__constant_current, houseload__constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__constant_admittance() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__constant_admittance")) lock.put("houseload__constant_admittance", new Boolean(false));
			if (!(Boolean)lock.get("houseload__constant_admittance")){
				lock.put("houseload__constant_admittance", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20constant_admittance");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20CONSTANT_ADMITTANCE");
					houseload__constant_admittance= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__constant_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__constant_admittance(String newHouseload__constant_admittance) {
		String oldHouseload__constant_admittance = houseload__constant_admittance;
		houseload__constant_admittance = newHouseload__constant_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_ADMITTANCE, oldHouseload__constant_admittance, houseload__constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__voltage_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__voltage_factor")) lock.put("houseload__voltage_factor", new Boolean(false));
			if (!(Boolean)lock.get("houseload__voltage_factor")){
				lock.put("houseload__voltage_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20voltage_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20VOLTAGE_FACTOR");
					houseload__voltage_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__voltage_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__voltage_factor(String newHouseload__voltage_factor) {
		String oldHouseload__voltage_factor = houseload__voltage_factor;
		houseload__voltage_factor = newHouseload__voltage_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_VOLTAGE_FACTOR, oldHouseload__voltage_factor, houseload__voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseload__configuration() {
		// Generated by python script located in this directory
		if (!lock.containsKey("houseload__configuration")) lock.put("houseload__configuration", new Boolean(false));
			if (!(Boolean)lock.get("houseload__configuration")){
				lock.put("houseload__configuration", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"houseload%20configuration");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HOUSELOAD%20CONFIGURATION");
					houseload__configuration= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return houseload__configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseload__configuration(String newHouseload__configuration) {
		String oldHouseload__configuration = houseload__configuration;
		houseload__configuration = newHouseload__configuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HOUSELOAD_CONFIGURATION, oldHouseload__configuration, houseload__configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShape() {
		// Generated by python script located in this directory
		if (!lock.containsKey("shape")) lock.put("shape", new Boolean(false));
			if (!(Boolean)lock.get("shape")){
				lock.put("shape", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"shape");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Shape");
					shape= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(String newShape) {
		String oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad() {
		// Generated by python script located in this directory
		if (!lock.containsKey("load")) lock.put("load", new Boolean(false));
			if (!(Boolean)lock.get("load")){
				lock.put("load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Load");
					load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(String newLoad) {
		String oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergy() {
		// Generated by python script located in this directory
		if (!lock.containsKey("energy")) lock.put("energy", new Boolean(false));
			if (!(Boolean)lock.get("energy")){
				lock.put("energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Energy");
					energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergy(String newEnergy) {
		String oldEnergy = energy;
		energy = newEnergy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower() {
		// Generated by python script located in this directory
		if (!lock.containsKey("power")) lock.put("power", new Boolean(false));
			if (!(Boolean)lock.get("power")){
				lock.put("power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power");
					power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(String newPower) {
		String oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeak_demand() {
		// Generated by python script located in this directory
		if (!lock.containsKey("peak_demand")) lock.put("peak_demand", new Boolean(false));
			if (!(Boolean)lock.get("peak_demand")){
				lock.put("peak_demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"peak_demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Peak_demand");
					peak_demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return peak_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeak_demand(String newPeak_demand) {
		String oldPeak_demand = peak_demand;
		peak_demand = newPeak_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__PEAK_DEMAND, oldPeak_demand, peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heatgain")) lock.put("heatgain", new Boolean(false));
			if (!(Boolean)lock.get("heatgain")){
				lock.put("heatgain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heatgain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heatgain");
					heatgain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heatgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatgain(String newHeatgain) {
		String oldHeatgain = heatgain;
		heatgain = newHeatgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HEATGAIN, oldHeatgain, heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("heatgain_fraction")) lock.put("heatgain_fraction", new Boolean(false));
			if (!(Boolean)lock.get("heatgain_fraction")){
				lock.put("heatgain_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"heatgain_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Heatgain_fraction");
					heatgain_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return heatgain_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeatgain_fraction(String newHeatgain_fraction) {
		String oldHeatgain_fraction = heatgain_fraction;
		heatgain_fraction = newHeatgain_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("current_fraction")) lock.put("current_fraction", new Boolean(false));
			if (!(Boolean)lock.get("current_fraction")){
				lock.put("current_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"current_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current_fraction");
					current_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return current_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_fraction(String newCurrent_fraction) {
		String oldCurrent_fraction = current_fraction;
		current_fraction = newCurrent_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("impedance_fraction")) lock.put("impedance_fraction", new Boolean(false));
			if (!(Boolean)lock.get("impedance_fraction")){
				lock.put("impedance_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"impedance_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Impedance_fraction");
					impedance_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return impedance_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance_fraction(String newImpedance_fraction) {
		String oldImpedance_fraction = impedance_fraction;
		impedance_fraction = newImpedance_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_fraction() {
		// Generated by python script located in this directory
		if (!lock.containsKey("power_fraction")) lock.put("power_fraction", new Boolean(false));
			if (!(Boolean)lock.get("power_fraction")){
				lock.put("power_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"power_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_fraction");
					power_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return power_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_fraction(String newPower_fraction) {
		String oldPower_fraction = power_fraction;
		power_fraction = newPower_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__POWER_FRACTION, oldPower_fraction, power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("power_factor")) lock.put("power_factor", new Boolean(false));
			if (!(Boolean)lock.get("power_factor")){
				lock.put("power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Power_factor");
					power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_factor(String newPower_factor) {
		String oldPower_factor = power_factor;
		power_factor = newPower_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__POWER_FACTOR, oldPower_factor, power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power() {
		// Generated by python script located in this directory
		if (!lock.containsKey("constant_power")) lock.put("constant_power", new Boolean(false));
			if (!(Boolean)lock.get("constant_power")){
				lock.put("constant_power", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"constant_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Constant_power");
					constant_power= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return constant_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power(String newConstant_power) {
		String oldConstant_power = constant_power;
		constant_power = newConstant_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__CONSTANT_POWER, oldConstant_power, constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current() {
		// Generated by python script located in this directory
		if (!lock.containsKey("constant_current")) lock.put("constant_current", new Boolean(false));
			if (!(Boolean)lock.get("constant_current")){
				lock.put("constant_current", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"constant_current");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Constant_current");
					constant_current= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return constant_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current(String newConstant_current) {
		String oldConstant_current = constant_current;
		constant_current = newConstant_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__CONSTANT_CURRENT, oldConstant_current, constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_admittance() {
		// Generated by python script located in this directory
		if (!lock.containsKey("constant_admittance")) lock.put("constant_admittance", new Boolean(false));
			if (!(Boolean)lock.get("constant_admittance")){
				lock.put("constant_admittance", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"constant_admittance");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Constant_admittance");
					constant_admittance= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return constant_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_admittance(String newConstant_admittance) {
		String oldConstant_admittance = constant_admittance;
		constant_admittance = newConstant_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_factor() {
		// Generated by python script located in this directory
		if (!lock.containsKey("voltage_factor")) lock.put("voltage_factor", new Boolean(false));
			if (!(Boolean)lock.get("voltage_factor")){
				lock.put("voltage_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"voltage_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Voltage_factor");
					voltage_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return voltage_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_factor(String newVoltage_factor) {
		String oldVoltage_factor = voltage_factor;
		voltage_factor = newVoltage_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
		// Generated by python script located in this directory
		if (!lock.containsKey("configuration")) lock.put("configuration", new Boolean(false));
			if (!(Boolean)lock.get("configuration")){
				lock.put("configuration", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"configuration");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Configuration");
					configuration= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(String newConfiguration) {
		String oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverride() {
		// Generated by python script located in this directory
		if (!lock.containsKey("override")) lock.put("override", new Boolean(false));
			if (!(Boolean)lock.get("override")){
				lock.put("override", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"override");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Override");
					override= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return override;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverride(String newOverride) {
		String oldOverride = override;
		override = newOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HOUSE_A__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.HOUSE_A__FLOOR_AREA:
				return getFloor_area();
			case VisGridPackage.HOUSE_A__GROSS_WALL_AREA:
				return getGross_wall_area();
			case VisGridPackage.HOUSE_A__CEILING_HEIGHT:
				return getCeiling_height();
			case VisGridPackage.HOUSE_A__ASPECT_RATIO:
				return getAspect_ratio();
			case VisGridPackage.HOUSE_A__ENVELOPE_UA:
				return getEnvelope_UA();
			case VisGridPackage.HOUSE_A__WINDOW_WALL_RATIO:
				return getWindow_wall_ratio();
			case VisGridPackage.HOUSE_A__GLAZING_SHGC:
				return getGlazing_shgc();
			case VisGridPackage.HOUSE_A__AIRCHANGE_PER_HOUR:
				return getAirchange_per_hour();
			case VisGridPackage.HOUSE_A__SOLAR_GAIN:
				return getSolar_gain();
			case VisGridPackage.HOUSE_A__HEAT_COOL_GAIN:
				return getHeat_cool_gain();
			case VisGridPackage.HOUSE_A__THERMOSTAT_DEADBAND:
				return getThermostat_deadband();
			case VisGridPackage.HOUSE_A__HEATING_SETPOINT:
				return getHeating_setpoint();
			case VisGridPackage.HOUSE_A__COOLING_SETPOINT:
				return getCooling_setpoint();
			case VisGridPackage.HOUSE_A__DESIGN_HEATING_CAPACITY:
				return getDesign_heating_capacity();
			case VisGridPackage.HOUSE_A__DESIGN_COOLING_CAPACITY:
				return getDesign_cooling_capacity();
			case VisGridPackage.HOUSE_A__HEATING_COP:
				return getHeating_COP();
			case VisGridPackage.HOUSE_A__COOLING_COP:
				return getCooling_COP();
			case VisGridPackage.HOUSE_A__COP_COEFF:
				return getCOP_coeff();
			case VisGridPackage.HOUSE_A__AIR_TEMPERATURE:
				return getAir_temperature();
			case VisGridPackage.HOUSE_A__OUTSIDE_TEMP:
				return getOutside_temp();
			case VisGridPackage.HOUSE_A__MASS_TEMPERATURE:
				return getMass_temperature();
			case VisGridPackage.HOUSE_A__MASS_HEAT_COEFF:
				return getMass_heat_coeff();
			case VisGridPackage.HOUSE_A__OUTDOOR_TEMPERATURE:
				return getOutdoor_temperature();
			case VisGridPackage.HOUSE_A__HOUSE_THERMAL_MASS:
				return getHouse_thermal_mass();
			case VisGridPackage.HOUSE_A__HEAT_MODE:
				return getHeat_mode();
			case VisGridPackage.HOUSE_A__HC_MODE:
				return getHc_mode();
			case VisGridPackage.HOUSE_A__HOUSELOAD:
				return getHouseload();
			case VisGridPackage.HOUSE_A__HOUSELOAD_ENERGY:
				return getHouseload__energy();
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER:
				return getHouseload__power();
			case VisGridPackage.HOUSE_A__HOUSELOAD_PEAK_DEMAND:
				return getHouseload__peak_demand();
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN:
				return getHouseload__heatgain();
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN_FRACTION:
				return getHouseload__heatgain_fraction();
			case VisGridPackage.HOUSE_A__HOUSELOAD_CURRENT_FRACTION:
				return getHouseload__current_fraction();
			case VisGridPackage.HOUSE_A__HOUSELOAD_IMPEDANCE_FRACTION:
				return getHouseload__impedance_fraction();
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FRACTION:
				return getHouseload__power_fraction();
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FACTOR:
				return getHouseload__power_factor();
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_POWER:
				return getHouseload__constant_power();
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_CURRENT:
				return getHouseload__constant_current();
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_ADMITTANCE:
				return getHouseload__constant_admittance();
			case VisGridPackage.HOUSE_A__HOUSELOAD_VOLTAGE_FACTOR:
				return getHouseload__voltage_factor();
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONFIGURATION:
				return getHouseload__configuration();
			case VisGridPackage.HOUSE_A__SHAPE:
				return getShape();
			case VisGridPackage.HOUSE_A__LOAD:
				return getLoad();
			case VisGridPackage.HOUSE_A__ENERGY:
				return getEnergy();
			case VisGridPackage.HOUSE_A__POWER:
				return getPower();
			case VisGridPackage.HOUSE_A__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.HOUSE_A__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.HOUSE_A__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.HOUSE_A__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.HOUSE_A__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.HOUSE_A__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.HOUSE_A__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.HOUSE_A__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.HOUSE_A__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.HOUSE_A__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.HOUSE_A__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.HOUSE_A__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.HOUSE_A__OVERRIDE:
				return getOverride();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.HOUSE_A__FLOOR_AREA:
				setFloor_area((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__GROSS_WALL_AREA:
				setGross_wall_area((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__CEILING_HEIGHT:
				setCeiling_height((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__ASPECT_RATIO:
				setAspect_ratio((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__ENVELOPE_UA:
				setEnvelope_UA((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__WINDOW_WALL_RATIO:
				setWindow_wall_ratio((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__GLAZING_SHGC:
				setGlazing_shgc((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__AIRCHANGE_PER_HOUR:
				setAirchange_per_hour((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__SOLAR_GAIN:
				setSolar_gain((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HEAT_COOL_GAIN:
				setHeat_cool_gain((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__THERMOSTAT_DEADBAND:
				setThermostat_deadband((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HEATING_SETPOINT:
				setHeating_setpoint((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__COOLING_SETPOINT:
				setCooling_setpoint((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__DESIGN_HEATING_CAPACITY:
				setDesign_heating_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__DESIGN_COOLING_CAPACITY:
				setDesign_cooling_capacity((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HEATING_COP:
				setHeating_COP((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__COOLING_COP:
				setCooling_COP((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__COP_COEFF:
				setCOP_coeff((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__AIR_TEMPERATURE:
				setAir_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__OUTSIDE_TEMP:
				setOutside_temp((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__MASS_TEMPERATURE:
				setMass_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__MASS_HEAT_COEFF:
				setMass_heat_coeff((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__OUTDOOR_TEMPERATURE:
				setOutdoor_temperature((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSE_THERMAL_MASS:
				setHouse_thermal_mass((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HEAT_MODE:
				setHeat_mode((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HC_MODE:
				setHc_mode((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD:
				setHouseload((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_ENERGY:
				setHouseload__energy((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER:
				setHouseload__power((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_PEAK_DEMAND:
				setHouseload__peak_demand((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN:
				setHouseload__heatgain((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN_FRACTION:
				setHouseload__heatgain_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CURRENT_FRACTION:
				setHouseload__current_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_IMPEDANCE_FRACTION:
				setHouseload__impedance_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FRACTION:
				setHouseload__power_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FACTOR:
				setHouseload__power_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_POWER:
				setHouseload__constant_power((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_CURRENT:
				setHouseload__constant_current((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_ADMITTANCE:
				setHouseload__constant_admittance((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_VOLTAGE_FACTOR:
				setHouseload__voltage_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONFIGURATION:
				setHouseload__configuration((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.HOUSE_A__OVERRIDE:
				setOverride((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisGridPackage.HOUSE_A__FLOOR_AREA:
				setFloor_area(FLOOR_AREA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__GROSS_WALL_AREA:
				setGross_wall_area(GROSS_WALL_AREA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__CEILING_HEIGHT:
				setCeiling_height(CEILING_HEIGHT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__ASPECT_RATIO:
				setAspect_ratio(ASPECT_RATIO_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__ENVELOPE_UA:
				setEnvelope_UA(ENVELOPE_UA_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__WINDOW_WALL_RATIO:
				setWindow_wall_ratio(WINDOW_WALL_RATIO_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__GLAZING_SHGC:
				setGlazing_shgc(GLAZING_SHGC_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__AIRCHANGE_PER_HOUR:
				setAirchange_per_hour(AIRCHANGE_PER_HOUR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__SOLAR_GAIN:
				setSolar_gain(SOLAR_GAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HEAT_COOL_GAIN:
				setHeat_cool_gain(HEAT_COOL_GAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__THERMOSTAT_DEADBAND:
				setThermostat_deadband(THERMOSTAT_DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HEATING_SETPOINT:
				setHeating_setpoint(HEATING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__COOLING_SETPOINT:
				setCooling_setpoint(COOLING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__DESIGN_HEATING_CAPACITY:
				setDesign_heating_capacity(DESIGN_HEATING_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__DESIGN_COOLING_CAPACITY:
				setDesign_cooling_capacity(DESIGN_COOLING_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HEATING_COP:
				setHeating_COP(HEATING_COP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__COOLING_COP:
				setCooling_COP(COOLING_COP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__COP_COEFF:
				setCOP_coeff(COP_COEFF_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__AIR_TEMPERATURE:
				setAir_temperature(AIR_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__OUTSIDE_TEMP:
				setOutside_temp(OUTSIDE_TEMP_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__MASS_TEMPERATURE:
				setMass_temperature(MASS_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__MASS_HEAT_COEFF:
				setMass_heat_coeff(MASS_HEAT_COEFF_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__OUTDOOR_TEMPERATURE:
				setOutdoor_temperature(OUTDOOR_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSE_THERMAL_MASS:
				setHouse_thermal_mass(HOUSE_THERMAL_MASS_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HEAT_MODE:
				setHeat_mode(HEAT_MODE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HC_MODE:
				setHc_mode(HC_MODE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD:
				setHouseload(HOUSELOAD_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_ENERGY:
				setHouseload__energy(HOUSELOAD_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER:
				setHouseload__power(HOUSELOAD_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_PEAK_DEMAND:
				setHouseload__peak_demand(HOUSELOAD_PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN:
				setHouseload__heatgain(HOUSELOAD_HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN_FRACTION:
				setHouseload__heatgain_fraction(HOUSELOAD_HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CURRENT_FRACTION:
				setHouseload__current_fraction(HOUSELOAD_CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_IMPEDANCE_FRACTION:
				setHouseload__impedance_fraction(HOUSELOAD_IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FRACTION:
				setHouseload__power_fraction(HOUSELOAD_POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FACTOR:
				setHouseload__power_factor(HOUSELOAD_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_POWER:
				setHouseload__constant_power(HOUSELOAD_CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_CURRENT:
				setHouseload__constant_current(HOUSELOAD_CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_ADMITTANCE:
				setHouseload__constant_admittance(HOUSELOAD_CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_VOLTAGE_FACTOR:
				setHouseload__voltage_factor(HOUSELOAD_VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONFIGURATION:
				setHouseload__configuration(HOUSELOAD_CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.HOUSE_A__OVERRIDE:
				setOverride(OVERRIDE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisGridPackage.HOUSE_A__FLOOR_AREA:
				return FLOOR_AREA_EDEFAULT == null ? floor_area != null : !FLOOR_AREA_EDEFAULT.equals(floor_area);
			case VisGridPackage.HOUSE_A__GROSS_WALL_AREA:
				return GROSS_WALL_AREA_EDEFAULT == null ? gross_wall_area != null : !GROSS_WALL_AREA_EDEFAULT.equals(gross_wall_area);
			case VisGridPackage.HOUSE_A__CEILING_HEIGHT:
				return CEILING_HEIGHT_EDEFAULT == null ? ceiling_height != null : !CEILING_HEIGHT_EDEFAULT.equals(ceiling_height);
			case VisGridPackage.HOUSE_A__ASPECT_RATIO:
				return ASPECT_RATIO_EDEFAULT == null ? aspect_ratio != null : !ASPECT_RATIO_EDEFAULT.equals(aspect_ratio);
			case VisGridPackage.HOUSE_A__ENVELOPE_UA:
				return ENVELOPE_UA_EDEFAULT == null ? envelope_UA != null : !ENVELOPE_UA_EDEFAULT.equals(envelope_UA);
			case VisGridPackage.HOUSE_A__WINDOW_WALL_RATIO:
				return WINDOW_WALL_RATIO_EDEFAULT == null ? window_wall_ratio != null : !WINDOW_WALL_RATIO_EDEFAULT.equals(window_wall_ratio);
			case VisGridPackage.HOUSE_A__GLAZING_SHGC:
				return GLAZING_SHGC_EDEFAULT == null ? glazing_shgc != null : !GLAZING_SHGC_EDEFAULT.equals(glazing_shgc);
			case VisGridPackage.HOUSE_A__AIRCHANGE_PER_HOUR:
				return AIRCHANGE_PER_HOUR_EDEFAULT == null ? airchange_per_hour != null : !AIRCHANGE_PER_HOUR_EDEFAULT.equals(airchange_per_hour);
			case VisGridPackage.HOUSE_A__SOLAR_GAIN:
				return SOLAR_GAIN_EDEFAULT == null ? solar_gain != null : !SOLAR_GAIN_EDEFAULT.equals(solar_gain);
			case VisGridPackage.HOUSE_A__HEAT_COOL_GAIN:
				return HEAT_COOL_GAIN_EDEFAULT == null ? heat_cool_gain != null : !HEAT_COOL_GAIN_EDEFAULT.equals(heat_cool_gain);
			case VisGridPackage.HOUSE_A__THERMOSTAT_DEADBAND:
				return THERMOSTAT_DEADBAND_EDEFAULT == null ? thermostat_deadband != null : !THERMOSTAT_DEADBAND_EDEFAULT.equals(thermostat_deadband);
			case VisGridPackage.HOUSE_A__HEATING_SETPOINT:
				return HEATING_SETPOINT_EDEFAULT == null ? heating_setpoint != null : !HEATING_SETPOINT_EDEFAULT.equals(heating_setpoint);
			case VisGridPackage.HOUSE_A__COOLING_SETPOINT:
				return COOLING_SETPOINT_EDEFAULT == null ? cooling_setpoint != null : !COOLING_SETPOINT_EDEFAULT.equals(cooling_setpoint);
			case VisGridPackage.HOUSE_A__DESIGN_HEATING_CAPACITY:
				return DESIGN_HEATING_CAPACITY_EDEFAULT == null ? design_heating_capacity != null : !DESIGN_HEATING_CAPACITY_EDEFAULT.equals(design_heating_capacity);
			case VisGridPackage.HOUSE_A__DESIGN_COOLING_CAPACITY:
				return DESIGN_COOLING_CAPACITY_EDEFAULT == null ? design_cooling_capacity != null : !DESIGN_COOLING_CAPACITY_EDEFAULT.equals(design_cooling_capacity);
			case VisGridPackage.HOUSE_A__HEATING_COP:
				return HEATING_COP_EDEFAULT == null ? heating_COP != null : !HEATING_COP_EDEFAULT.equals(heating_COP);
			case VisGridPackage.HOUSE_A__COOLING_COP:
				return COOLING_COP_EDEFAULT == null ? cooling_COP != null : !COOLING_COP_EDEFAULT.equals(cooling_COP);
			case VisGridPackage.HOUSE_A__COP_COEFF:
				return COP_COEFF_EDEFAULT == null ? coP_coeff != null : !COP_COEFF_EDEFAULT.equals(coP_coeff);
			case VisGridPackage.HOUSE_A__AIR_TEMPERATURE:
				return AIR_TEMPERATURE_EDEFAULT == null ? air_temperature != null : !AIR_TEMPERATURE_EDEFAULT.equals(air_temperature);
			case VisGridPackage.HOUSE_A__OUTSIDE_TEMP:
				return OUTSIDE_TEMP_EDEFAULT == null ? outside_temp != null : !OUTSIDE_TEMP_EDEFAULT.equals(outside_temp);
			case VisGridPackage.HOUSE_A__MASS_TEMPERATURE:
				return MASS_TEMPERATURE_EDEFAULT == null ? mass_temperature != null : !MASS_TEMPERATURE_EDEFAULT.equals(mass_temperature);
			case VisGridPackage.HOUSE_A__MASS_HEAT_COEFF:
				return MASS_HEAT_COEFF_EDEFAULT == null ? mass_heat_coeff != null : !MASS_HEAT_COEFF_EDEFAULT.equals(mass_heat_coeff);
			case VisGridPackage.HOUSE_A__OUTDOOR_TEMPERATURE:
				return OUTDOOR_TEMPERATURE_EDEFAULT == null ? outdoor_temperature != null : !OUTDOOR_TEMPERATURE_EDEFAULT.equals(outdoor_temperature);
			case VisGridPackage.HOUSE_A__HOUSE_THERMAL_MASS:
				return HOUSE_THERMAL_MASS_EDEFAULT == null ? house_thermal_mass != null : !HOUSE_THERMAL_MASS_EDEFAULT.equals(house_thermal_mass);
			case VisGridPackage.HOUSE_A__HEAT_MODE:
				return HEAT_MODE_EDEFAULT == null ? heat_mode != null : !HEAT_MODE_EDEFAULT.equals(heat_mode);
			case VisGridPackage.HOUSE_A__HC_MODE:
				return HC_MODE_EDEFAULT == null ? hc_mode != null : !HC_MODE_EDEFAULT.equals(hc_mode);
			case VisGridPackage.HOUSE_A__HOUSELOAD:
				return HOUSELOAD_EDEFAULT == null ? houseload != null : !HOUSELOAD_EDEFAULT.equals(houseload);
			case VisGridPackage.HOUSE_A__HOUSELOAD_ENERGY:
				return HOUSELOAD_ENERGY_EDEFAULT == null ? houseload__energy != null : !HOUSELOAD_ENERGY_EDEFAULT.equals(houseload__energy);
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER:
				return HOUSELOAD_POWER_EDEFAULT == null ? houseload__power != null : !HOUSELOAD_POWER_EDEFAULT.equals(houseload__power);
			case VisGridPackage.HOUSE_A__HOUSELOAD_PEAK_DEMAND:
				return HOUSELOAD_PEAK_DEMAND_EDEFAULT == null ? houseload__peak_demand != null : !HOUSELOAD_PEAK_DEMAND_EDEFAULT.equals(houseload__peak_demand);
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN:
				return HOUSELOAD_HEATGAIN_EDEFAULT == null ? houseload__heatgain != null : !HOUSELOAD_HEATGAIN_EDEFAULT.equals(houseload__heatgain);
			case VisGridPackage.HOUSE_A__HOUSELOAD_HEATGAIN_FRACTION:
				return HOUSELOAD_HEATGAIN_FRACTION_EDEFAULT == null ? houseload__heatgain_fraction != null : !HOUSELOAD_HEATGAIN_FRACTION_EDEFAULT.equals(houseload__heatgain_fraction);
			case VisGridPackage.HOUSE_A__HOUSELOAD_CURRENT_FRACTION:
				return HOUSELOAD_CURRENT_FRACTION_EDEFAULT == null ? houseload__current_fraction != null : !HOUSELOAD_CURRENT_FRACTION_EDEFAULT.equals(houseload__current_fraction);
			case VisGridPackage.HOUSE_A__HOUSELOAD_IMPEDANCE_FRACTION:
				return HOUSELOAD_IMPEDANCE_FRACTION_EDEFAULT == null ? houseload__impedance_fraction != null : !HOUSELOAD_IMPEDANCE_FRACTION_EDEFAULT.equals(houseload__impedance_fraction);
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FRACTION:
				return HOUSELOAD_POWER_FRACTION_EDEFAULT == null ? houseload__power_fraction != null : !HOUSELOAD_POWER_FRACTION_EDEFAULT.equals(houseload__power_fraction);
			case VisGridPackage.HOUSE_A__HOUSELOAD_POWER_FACTOR:
				return HOUSELOAD_POWER_FACTOR_EDEFAULT == null ? houseload__power_factor != null : !HOUSELOAD_POWER_FACTOR_EDEFAULT.equals(houseload__power_factor);
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_POWER:
				return HOUSELOAD_CONSTANT_POWER_EDEFAULT == null ? houseload__constant_power != null : !HOUSELOAD_CONSTANT_POWER_EDEFAULT.equals(houseload__constant_power);
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_CURRENT:
				return HOUSELOAD_CONSTANT_CURRENT_EDEFAULT == null ? houseload__constant_current != null : !HOUSELOAD_CONSTANT_CURRENT_EDEFAULT.equals(houseload__constant_current);
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONSTANT_ADMITTANCE:
				return HOUSELOAD_CONSTANT_ADMITTANCE_EDEFAULT == null ? houseload__constant_admittance != null : !HOUSELOAD_CONSTANT_ADMITTANCE_EDEFAULT.equals(houseload__constant_admittance);
			case VisGridPackage.HOUSE_A__HOUSELOAD_VOLTAGE_FACTOR:
				return HOUSELOAD_VOLTAGE_FACTOR_EDEFAULT == null ? houseload__voltage_factor != null : !HOUSELOAD_VOLTAGE_FACTOR_EDEFAULT.equals(houseload__voltage_factor);
			case VisGridPackage.HOUSE_A__HOUSELOAD_CONFIGURATION:
				return HOUSELOAD_CONFIGURATION_EDEFAULT == null ? houseload__configuration != null : !HOUSELOAD_CONFIGURATION_EDEFAULT.equals(houseload__configuration);
			case VisGridPackage.HOUSE_A__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.HOUSE_A__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.HOUSE_A__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.HOUSE_A__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.HOUSE_A__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.HOUSE_A__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.HOUSE_A__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.HOUSE_A__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.HOUSE_A__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.HOUSE_A__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.HOUSE_A__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.HOUSE_A__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.HOUSE_A__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.HOUSE_A__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.HOUSE_A__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.HOUSE_A__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.HOUSE_A__OVERRIDE:
				return OVERRIDE_EDEFAULT == null ? override != null : !OVERRIDE_EDEFAULT.equals(override);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (floor_area: ");
		result.append(floor_area);
		result.append(", gross_wall_area: ");
		result.append(gross_wall_area);
		result.append(", ceiling_height: ");
		result.append(ceiling_height);
		result.append(", aspect_ratio: ");
		result.append(aspect_ratio);
		result.append(", envelope_UA: ");
		result.append(envelope_UA);
		result.append(", window_wall_ratio: ");
		result.append(window_wall_ratio);
		result.append(", glazing_shgc: ");
		result.append(glazing_shgc);
		result.append(", airchange_per_hour: ");
		result.append(airchange_per_hour);
		result.append(", solar_gain: ");
		result.append(solar_gain);
		result.append(", heat_cool_gain: ");
		result.append(heat_cool_gain);
		result.append(", thermostat_deadband: ");
		result.append(thermostat_deadband);
		result.append(", heating_setpoint: ");
		result.append(heating_setpoint);
		result.append(", cooling_setpoint: ");
		result.append(cooling_setpoint);
		result.append(", design_heating_capacity: ");
		result.append(design_heating_capacity);
		result.append(", design_cooling_capacity: ");
		result.append(design_cooling_capacity);
		result.append(", heating_COP: ");
		result.append(heating_COP);
		result.append(", cooling_COP: ");
		result.append(cooling_COP);
		result.append(", COP_coeff: ");
		result.append(coP_coeff);
		result.append(", air_temperature: ");
		result.append(air_temperature);
		result.append(", outside_temp: ");
		result.append(outside_temp);
		result.append(", mass_temperature: ");
		result.append(mass_temperature);
		result.append(", mass_heat_coeff: ");
		result.append(mass_heat_coeff);
		result.append(", outdoor_temperature: ");
		result.append(outdoor_temperature);
		result.append(", house_thermal_mass: ");
		result.append(house_thermal_mass);
		result.append(", heat_mode: ");
		result.append(heat_mode);
		result.append(", hc_mode: ");
		result.append(hc_mode);
		result.append(", houseload: ");
		result.append(houseload);
		result.append(", houseload__energy: ");
		result.append(houseload__energy);
		result.append(", houseload__power: ");
		result.append(houseload__power);
		result.append(", houseload__peak_demand: ");
		result.append(houseload__peak_demand);
		result.append(", houseload__heatgain: ");
		result.append(houseload__heatgain);
		result.append(", houseload__heatgain_fraction: ");
		result.append(houseload__heatgain_fraction);
		result.append(", houseload__current_fraction: ");
		result.append(houseload__current_fraction);
		result.append(", houseload__impedance_fraction: ");
		result.append(houseload__impedance_fraction);
		result.append(", houseload__power_fraction: ");
		result.append(houseload__power_fraction);
		result.append(", houseload__power_factor: ");
		result.append(houseload__power_factor);
		result.append(", houseload__constant_power: ");
		result.append(houseload__constant_power);
		result.append(", houseload__constant_current: ");
		result.append(houseload__constant_current);
		result.append(", houseload__constant_admittance: ");
		result.append(houseload__constant_admittance);
		result.append(", houseload__voltage_factor: ");
		result.append(houseload__voltage_factor);
		result.append(", houseload__configuration: ");
		result.append(houseload__configuration);
		result.append(", shape: ");
		result.append(shape);
		result.append(", load: ");
		result.append(load);
		result.append(", energy: ");
		result.append(energy);
		result.append(", power: ");
		result.append(power);
		result.append(", peak_demand: ");
		result.append(peak_demand);
		result.append(", heatgain: ");
		result.append(heatgain);
		result.append(", heatgain_fraction: ");
		result.append(heatgain_fraction);
		result.append(", current_fraction: ");
		result.append(current_fraction);
		result.append(", impedance_fraction: ");
		result.append(impedance_fraction);
		result.append(", power_fraction: ");
		result.append(power_fraction);
		result.append(", power_factor: ");
		result.append(power_factor);
		result.append(", constant_power: ");
		result.append(constant_power);
		result.append(", constant_current: ");
		result.append(constant_current);
		result.append(", constant_admittance: ");
		result.append(constant_admittance);
		result.append(", voltage_factor: ");
		result.append(voltage_factor);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(", override: ");
		result.append(override);
		result.append(')');
		return result.toString();
	}

} //House_aImpl
