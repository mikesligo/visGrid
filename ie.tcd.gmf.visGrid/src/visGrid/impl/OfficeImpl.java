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

import visGrid.Office;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Office</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.OfficeImpl#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getFloor_height <em>Floor height</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getExterior_ua <em>Exterior ua</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getInterior_ua <em>Interior ua</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getInterior_mass <em>Interior mass</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing <em>Glazing</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__north <em>Glazing north</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__northeast <em>Glazing northeast</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__east <em>Glazing east</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__southeast <em>Glazing southeast</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__south <em>Glazing south</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__southwest <em>Glazing southwest</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__west <em>Glazing west</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__northwest <em>Glazing northwest</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__horizontal <em>Glazing horizontal</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getGlazing__coefficient <em>Glazing coefficient</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getOccupancy <em>Occupancy</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getOccupants <em>Occupants</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getTemperature_change <em>Temperature change</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getOutdoor_temperature <em>Outdoor temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getQh <em>Qh</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getQs <em>Qs</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getQi <em>Qi</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getQz <em>Qz</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac_mode <em>Hvac mode</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__cooling__balance_temperature <em>Hvac cooling balance temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__cooling__capacity <em>Hvac cooling capacity</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__cooling__capacity_perF <em>Hvac cooling capacity per F</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__cooling__design_temperature <em>Hvac cooling design temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__cooling__efficiency <em>Hvac cooling efficiency</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__cooling__cop <em>Hvac cooling cop</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__heating__balance_temperature <em>Hvac heating balance temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__heating__capacity <em>Hvac heating capacity</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__heating__capacity_perF <em>Hvac heating capacity per F</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__heating__design_temperature <em>Hvac heating design temperature</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__heating__efficiency <em>Hvac heating efficiency</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__heating__cop <em>Hvac heating cop</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__capacity <em>Lights capacity</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__fraction <em>Lights fraction</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__capacity <em>Plugs capacity</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__fraction <em>Plugs fraction</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getTotal_load <em>Total load</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getAdmittance <em>Admittance</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__demand <em>Hvac demand</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__load <em>Hvac load</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__energy <em>Hvac energy</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHvac__power_factor <em>Hvac power factor</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__demand <em>Lights demand</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__load <em>Lights load</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__energy <em>Lights energy</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__power_factor <em>Lights power factor</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__heatgain_fraction <em>Lights heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getLights__heatgain <em>Lights heatgain</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__demand <em>Plugs demand</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__load <em>Plugs load</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__energy <em>Plugs energy</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__power_factor <em>Plugs power factor</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__heatgain_fraction <em>Plugs heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getPlugs__heatgain <em>Plugs heatgain</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getControl__ventilation_fraction <em>Control ventilation fraction</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getControl__lighting_fraction <em>Control lighting fraction</em>}</li>
 *   <li>{@link visGrid.impl.OfficeImpl#getACH <em>ACH</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfficeImpl extends ConnectionImpl implements Office {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();

   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (threadLock) return;
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
        timer.schedule(new Task(), lock.size()*30);
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
	 * The default value of the '{@link #getFloor_height() <em>Floor height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor_height()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOOR_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloor_height() <em>Floor height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloor_height()
	 * @generated
	 * @ordered
	 */
	protected String floor_height = FLOOR_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExterior_ua() <em>Exterior ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_ua()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERIOR_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExterior_ua() <em>Exterior ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExterior_ua()
	 * @generated
	 * @ordered
	 */
	protected String exterior_ua = EXTERIOR_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterior_ua() <em>Interior ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_ua()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERIOR_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterior_ua() <em>Interior ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_ua()
	 * @generated
	 * @ordered
	 */
	protected String interior_ua = INTERIOR_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterior_mass() <em>Interior mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_mass()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERIOR_MASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterior_mass() <em>Interior mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterior_mass()
	 * @generated
	 * @ordered
	 */
	protected String interior_mass = INTERIOR_MASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing() <em>Glazing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing() <em>Glazing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing()
	 * @generated
	 * @ordered
	 */
	protected String glazing = GLAZING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__north() <em>Glazing north</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__north()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_NORTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__north() <em>Glazing north</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__north()
	 * @generated
	 * @ordered
	 */
	protected String glazing__north = GLAZING_NORTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__northeast() <em>Glazing northeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__northeast()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_NORTHEAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__northeast() <em>Glazing northeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__northeast()
	 * @generated
	 * @ordered
	 */
	protected String glazing__northeast = GLAZING_NORTHEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__east() <em>Glazing east</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__east()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_EAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__east() <em>Glazing east</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__east()
	 * @generated
	 * @ordered
	 */
	protected String glazing__east = GLAZING_EAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__southeast() <em>Glazing southeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__southeast()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_SOUTHEAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__southeast() <em>Glazing southeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__southeast()
	 * @generated
	 * @ordered
	 */
	protected String glazing__southeast = GLAZING_SOUTHEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__south() <em>Glazing south</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__south()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_SOUTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__south() <em>Glazing south</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__south()
	 * @generated
	 * @ordered
	 */
	protected String glazing__south = GLAZING_SOUTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__southwest() <em>Glazing southwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__southwest()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_SOUTHWEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__southwest() <em>Glazing southwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__southwest()
	 * @generated
	 * @ordered
	 */
	protected String glazing__southwest = GLAZING_SOUTHWEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__west() <em>Glazing west</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__west()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_WEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__west() <em>Glazing west</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__west()
	 * @generated
	 * @ordered
	 */
	protected String glazing__west = GLAZING_WEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__northwest() <em>Glazing northwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__northwest()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_NORTHWEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__northwest() <em>Glazing northwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__northwest()
	 * @generated
	 * @ordered
	 */
	protected String glazing__northwest = GLAZING_NORTHWEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__horizontal() <em>Glazing horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__horizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__horizontal() <em>Glazing horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__horizontal()
	 * @generated
	 * @ordered
	 */
	protected String glazing__horizontal = GLAZING_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlazing__coefficient() <em>Glazing coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__coefficient()
	 * @generated
	 * @ordered
	 */
	protected static final String GLAZING_COEFFICIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlazing__coefficient() <em>Glazing coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlazing__coefficient()
	 * @generated
	 * @ordered
	 */
	protected String glazing__coefficient = GLAZING_COEFFICIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupancy() <em>Occupancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupancy() <em>Occupancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupancy()
	 * @generated
	 * @ordered
	 */
	protected String occupancy = OCCUPANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupants() <em>Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupants()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPANTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupants() <em>Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupants()
	 * @generated
	 * @ordered
	 */
	protected String occupants = OCCUPANTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected String schedule = SCHEDULE_EDEFAULT;

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
	 * The default value of the '{@link #getTemperature_change() <em>Temperature change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature_change()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperature_change() <em>Temperature change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature_change()
	 * @generated
	 * @ordered
	 */
	protected String temperature_change = TEMPERATURE_CHANGE_EDEFAULT;

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
	 * The default value of the '{@link #getQh() <em>Qh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQh()
	 * @generated
	 * @ordered
	 */
	protected static final String QH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQh() <em>Qh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQh()
	 * @generated
	 * @ordered
	 */
	protected String qh = QH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQs() <em>Qs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQs()
	 * @generated
	 * @ordered
	 */
	protected static final String QS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQs() <em>Qs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQs()
	 * @generated
	 * @ordered
	 */
	protected String qs = QS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQi() <em>Qi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQi()
	 * @generated
	 * @ordered
	 */
	protected static final String QI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQi() <em>Qi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQi()
	 * @generated
	 * @ordered
	 */
	protected String qi = QI_EDEFAULT;

	/**
	 * The default value of the '{@link #getQz() <em>Qz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQz()
	 * @generated
	 * @ordered
	 */
	protected static final String QZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQz() <em>Qz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQz()
	 * @generated
	 * @ordered
	 */
	protected String qz = QZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac_mode() <em>Hvac mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac_mode() <em>Hvac mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac_mode()
	 * @generated
	 * @ordered
	 */
	protected String hvac_mode = HVAC_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__cooling__balance_temperature() <em>Hvac cooling balance temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__balance_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_COOLING_BALANCE_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__cooling__balance_temperature() <em>Hvac cooling balance temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__balance_temperature()
	 * @generated
	 * @ordered
	 */
	protected String hvac__cooling__balance_temperature = HVAC_COOLING_BALANCE_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__cooling__capacity() <em>Hvac cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_COOLING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__cooling__capacity() <em>Hvac cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__capacity()
	 * @generated
	 * @ordered
	 */
	protected String hvac__cooling__capacity = HVAC_COOLING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__cooling__capacity_perF() <em>Hvac cooling capacity per F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__capacity_perF()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_COOLING_CAPACITY_PER_F_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__cooling__capacity_perF() <em>Hvac cooling capacity per F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__capacity_perF()
	 * @generated
	 * @ordered
	 */
	protected String hvac__cooling__capacity_perF = HVAC_COOLING_CAPACITY_PER_F_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__cooling__design_temperature() <em>Hvac cooling design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__design_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_COOLING_DESIGN_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__cooling__design_temperature() <em>Hvac cooling design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__design_temperature()
	 * @generated
	 * @ordered
	 */
	protected String hvac__cooling__design_temperature = HVAC_COOLING_DESIGN_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__cooling__efficiency() <em>Hvac cooling efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__efficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_COOLING_EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__cooling__efficiency() <em>Hvac cooling efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__efficiency()
	 * @generated
	 * @ordered
	 */
	protected String hvac__cooling__efficiency = HVAC_COOLING_EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__cooling__cop() <em>Hvac cooling cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__cop()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_COOLING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__cooling__cop() <em>Hvac cooling cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__cooling__cop()
	 * @generated
	 * @ordered
	 */
	protected String hvac__cooling__cop = HVAC_COOLING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__heating__balance_temperature() <em>Hvac heating balance temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__balance_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_HEATING_BALANCE_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__heating__balance_temperature() <em>Hvac heating balance temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__balance_temperature()
	 * @generated
	 * @ordered
	 */
	protected String hvac__heating__balance_temperature = HVAC_HEATING_BALANCE_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__heating__capacity() <em>Hvac heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_HEATING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__heating__capacity() <em>Hvac heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__capacity()
	 * @generated
	 * @ordered
	 */
	protected String hvac__heating__capacity = HVAC_HEATING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__heating__capacity_perF() <em>Hvac heating capacity per F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__capacity_perF()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_HEATING_CAPACITY_PER_F_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__heating__capacity_perF() <em>Hvac heating capacity per F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__capacity_perF()
	 * @generated
	 * @ordered
	 */
	protected String hvac__heating__capacity_perF = HVAC_HEATING_CAPACITY_PER_F_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__heating__design_temperature() <em>Hvac heating design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__design_temperature()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_HEATING_DESIGN_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__heating__design_temperature() <em>Hvac heating design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__design_temperature()
	 * @generated
	 * @ordered
	 */
	protected String hvac__heating__design_temperature = HVAC_HEATING_DESIGN_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__heating__efficiency() <em>Hvac heating efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__efficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_HEATING_EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__heating__efficiency() <em>Hvac heating efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__efficiency()
	 * @generated
	 * @ordered
	 */
	protected String hvac__heating__efficiency = HVAC_HEATING_EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__heating__cop() <em>Hvac heating cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__cop()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_HEATING_COP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__heating__cop() <em>Hvac heating cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__heating__cop()
	 * @generated
	 * @ordered
	 */
	protected String hvac__heating__cop = HVAC_HEATING_COP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__capacity() <em>Lights capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__capacity() <em>Lights capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__capacity()
	 * @generated
	 * @ordered
	 */
	protected String lights__capacity = LIGHTS_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__fraction() <em>Lights fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__fraction() <em>Lights fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__fraction()
	 * @generated
	 * @ordered
	 */
	protected String lights__fraction = LIGHTS_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__capacity() <em>Plugs capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__capacity() <em>Plugs capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__capacity()
	 * @generated
	 * @ordered
	 */
	protected String plugs__capacity = PLUGS_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__fraction() <em>Plugs fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__fraction() <em>Plugs fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__fraction()
	 * @generated
	 * @ordered
	 */
	protected String plugs__fraction = PLUGS_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemand() <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand()
	 * @generated
	 * @ordered
	 */
	protected String demand = DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_load() <em>Total load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_load()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotal_load() <em>Total load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_load()
	 * @generated
	 * @ordered
	 */
	protected String total_load = TOTAL_LOAD_EDEFAULT;

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
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected String current = CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdmittance() <em>Admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittance()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmittance() <em>Admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmittance()
	 * @generated
	 * @ordered
	 */
	protected String admittance = ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__demand() <em>Hvac demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__demand()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__demand() <em>Hvac demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__demand()
	 * @generated
	 * @ordered
	 */
	protected String hvac__demand = HVAC_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__load() <em>Hvac load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__load()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__load() <em>Hvac load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__load()
	 * @generated
	 * @ordered
	 */
	protected String hvac__load = HVAC_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__energy() <em>Hvac energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__energy()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__energy() <em>Hvac energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__energy()
	 * @generated
	 * @ordered
	 */
	protected String hvac__energy = HVAC_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHvac__power_factor() <em>Hvac power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String HVAC_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHvac__power_factor() <em>Hvac power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHvac__power_factor()
	 * @generated
	 * @ordered
	 */
	protected String hvac__power_factor = HVAC_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__demand() <em>Lights demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__demand()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__demand() <em>Lights demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__demand()
	 * @generated
	 * @ordered
	 */
	protected String lights__demand = LIGHTS_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__load() <em>Lights load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__load()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__load() <em>Lights load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__load()
	 * @generated
	 * @ordered
	 */
	protected String lights__load = LIGHTS_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__energy() <em>Lights energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__energy()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__energy() <em>Lights energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__energy()
	 * @generated
	 * @ordered
	 */
	protected String lights__energy = LIGHTS_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__power_factor() <em>Lights power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__power_factor() <em>Lights power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__power_factor()
	 * @generated
	 * @ordered
	 */
	protected String lights__power_factor = LIGHTS_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__heatgain_fraction() <em>Lights heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_HEATGAIN_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__heatgain_fraction() <em>Lights heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected String lights__heatgain_fraction = LIGHTS_HEATGAIN_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLights__heatgain() <em>Lights heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__heatgain()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHTS_HEATGAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLights__heatgain() <em>Lights heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights__heatgain()
	 * @generated
	 * @ordered
	 */
	protected String lights__heatgain = LIGHTS_HEATGAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__demand() <em>Plugs demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__demand()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__demand() <em>Plugs demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__demand()
	 * @generated
	 * @ordered
	 */
	protected String plugs__demand = PLUGS_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__load() <em>Plugs load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__load()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_LOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__load() <em>Plugs load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__load()
	 * @generated
	 * @ordered
	 */
	protected String plugs__load = PLUGS_LOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__energy() <em>Plugs energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__energy()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__energy() <em>Plugs energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__energy()
	 * @generated
	 * @ordered
	 */
	protected String plugs__energy = PLUGS_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__power_factor() <em>Plugs power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__power_factor()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_POWER_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__power_factor() <em>Plugs power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__power_factor()
	 * @generated
	 * @ordered
	 */
	protected String plugs__power_factor = PLUGS_POWER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__heatgain_fraction() <em>Plugs heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_HEATGAIN_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__heatgain_fraction() <em>Plugs heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__heatgain_fraction()
	 * @generated
	 * @ordered
	 */
	protected String plugs__heatgain_fraction = PLUGS_HEATGAIN_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlugs__heatgain() <em>Plugs heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__heatgain()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGS_HEATGAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlugs__heatgain() <em>Plugs heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugs__heatgain()
	 * @generated
	 * @ordered
	 */
	protected String plugs__heatgain = PLUGS_HEATGAIN_EDEFAULT;

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
	 * The default value of the '{@link #getControl__ventilation_fraction() <em>Control ventilation fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl__ventilation_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_VENTILATION_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl__ventilation_fraction() <em>Control ventilation fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl__ventilation_fraction()
	 * @generated
	 * @ordered
	 */
	protected String control__ventilation_fraction = CONTROL_VENTILATION_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl__lighting_fraction() <em>Control lighting fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl__lighting_fraction()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_LIGHTING_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl__lighting_fraction() <em>Control lighting fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl__lighting_fraction()
	 * @generated
	 * @ordered
	 */
	protected String control__lighting_fraction = CONTROL_LIGHTING_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getACH() <em>ACH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACH()
	 * @generated
	 * @ordered
	 */
	protected static final String ACH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACH() <em>ACH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACH()
	 * @generated
	 * @ordered
	 */
	protected String ach = ACH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfficeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getOffice();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__FLOOR_AREA, oldFloor_area, floor_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloor_height() {
		// Generated by python script located in this directory
			if (!lock.containsKey("floor_height")) lock.put("floor_height", new Boolean(false));
			if (!(Boolean)lock.get("floor_height")){
				lock.put("floor_height", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"floor_height");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Floor_height");
					floor_height= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return floor_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor_height(String newFloor_height) {
		String oldFloor_height = floor_height;
		floor_height = newFloor_height;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__FLOOR_HEIGHT, oldFloor_height, floor_height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExterior_ua() {
		// Generated by python script located in this directory
			if (!lock.containsKey("exterior_ua")) lock.put("exterior_ua", new Boolean(false));
			if (!(Boolean)lock.get("exterior_ua")){
				lock.put("exterior_ua", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"exterior_ua");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Exterior_ua");
					exterior_ua= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return exterior_ua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior_ua(String newExterior_ua) {
		String oldExterior_ua = exterior_ua;
		exterior_ua = newExterior_ua;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__EXTERIOR_UA, oldExterior_ua, exterior_ua));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterior_ua() {
		// Generated by python script located in this directory
			if (!lock.containsKey("interior_ua")) lock.put("interior_ua", new Boolean(false));
			if (!(Boolean)lock.get("interior_ua")){
				lock.put("interior_ua", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"interior_ua");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Interior_ua");
					interior_ua= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return interior_ua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterior_ua(String newInterior_ua) {
		String oldInterior_ua = interior_ua;
		interior_ua = newInterior_ua;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__INTERIOR_UA, oldInterior_ua, interior_ua));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterior_mass() {
		// Generated by python script located in this directory
			if (!lock.containsKey("interior_mass")) lock.put("interior_mass", new Boolean(false));
			if (!(Boolean)lock.get("interior_mass")){
				lock.put("interior_mass", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"interior_mass");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Interior_mass");
					interior_mass= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return interior_mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterior_mass(String newInterior_mass) {
		String oldInterior_mass = interior_mass;
		interior_mass = newInterior_mass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__INTERIOR_MASS, oldInterior_mass, interior_mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing")) lock.put("glazing", new Boolean(false));
			if (!(Boolean)lock.get("glazing")){
				lock.put("glazing", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Glazing");
					glazing= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing(String newGlazing) {
		String oldGlazing = glazing;
		glazing = newGlazing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING, oldGlazing, glazing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__north() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__north")) lock.put("glazing__north", new Boolean(false));
			if (!(Boolean)lock.get("glazing__north")){
				lock.put("glazing__north", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20north");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20NORTH");
					glazing__north= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__north(String newGlazing__north) {
		String oldGlazing__north = glazing__north;
		glazing__north = newGlazing__north;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_NORTH, oldGlazing__north, glazing__north));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__northeast() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__northeast")) lock.put("glazing__northeast", new Boolean(false));
			if (!(Boolean)lock.get("glazing__northeast")){
				lock.put("glazing__northeast", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20northeast");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20NORTHEAST");
					glazing__northeast= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__northeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__northeast(String newGlazing__northeast) {
		String oldGlazing__northeast = glazing__northeast;
		glazing__northeast = newGlazing__northeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_NORTHEAST, oldGlazing__northeast, glazing__northeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__east() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__east")) lock.put("glazing__east", new Boolean(false));
			if (!(Boolean)lock.get("glazing__east")){
				lock.put("glazing__east", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20east");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20EAST");
					glazing__east= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__east(String newGlazing__east) {
		String oldGlazing__east = glazing__east;
		glazing__east = newGlazing__east;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_EAST, oldGlazing__east, glazing__east));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__southeast() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__southeast")) lock.put("glazing__southeast", new Boolean(false));
			if (!(Boolean)lock.get("glazing__southeast")){
				lock.put("glazing__southeast", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20southeast");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20SOUTHEAST");
					glazing__southeast= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__southeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__southeast(String newGlazing__southeast) {
		String oldGlazing__southeast = glazing__southeast;
		glazing__southeast = newGlazing__southeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_SOUTHEAST, oldGlazing__southeast, glazing__southeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__south() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__south")) lock.put("glazing__south", new Boolean(false));
			if (!(Boolean)lock.get("glazing__south")){
				lock.put("glazing__south", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20south");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20SOUTH");
					glazing__south= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__south(String newGlazing__south) {
		String oldGlazing__south = glazing__south;
		glazing__south = newGlazing__south;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_SOUTH, oldGlazing__south, glazing__south));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__southwest() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__southwest")) lock.put("glazing__southwest", new Boolean(false));
			if (!(Boolean)lock.get("glazing__southwest")){
				lock.put("glazing__southwest", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20southwest");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20SOUTHWEST");
					glazing__southwest= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__southwest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__southwest(String newGlazing__southwest) {
		String oldGlazing__southwest = glazing__southwest;
		glazing__southwest = newGlazing__southwest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_SOUTHWEST, oldGlazing__southwest, glazing__southwest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__west() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__west")) lock.put("glazing__west", new Boolean(false));
			if (!(Boolean)lock.get("glazing__west")){
				lock.put("glazing__west", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20west");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20WEST");
					glazing__west= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__west(String newGlazing__west) {
		String oldGlazing__west = glazing__west;
		glazing__west = newGlazing__west;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_WEST, oldGlazing__west, glazing__west));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__northwest() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__northwest")) lock.put("glazing__northwest", new Boolean(false));
			if (!(Boolean)lock.get("glazing__northwest")){
				lock.put("glazing__northwest", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20northwest");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20NORTHWEST");
					glazing__northwest= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__northwest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__northwest(String newGlazing__northwest) {
		String oldGlazing__northwest = glazing__northwest;
		glazing__northwest = newGlazing__northwest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_NORTHWEST, oldGlazing__northwest, glazing__northwest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__horizontal() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__horizontal")) lock.put("glazing__horizontal", new Boolean(false));
			if (!(Boolean)lock.get("glazing__horizontal")){
				lock.put("glazing__horizontal", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20horizontal");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20HORIZONTAL");
					glazing__horizontal= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__horizontal(String newGlazing__horizontal) {
		String oldGlazing__horizontal = glazing__horizontal;
		glazing__horizontal = newGlazing__horizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_HORIZONTAL, oldGlazing__horizontal, glazing__horizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlazing__coefficient() {
		// Generated by python script located in this directory
			if (!lock.containsKey("glazing__coefficient")) lock.put("glazing__coefficient", new Boolean(false));
			if (!(Boolean)lock.get("glazing__coefficient")){
				lock.put("glazing__coefficient", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"glazing%20coefficient");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"GLAZING%20COEFFICIENT");
					glazing__coefficient= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return glazing__coefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlazing__coefficient(String newGlazing__coefficient) {
		String oldGlazing__coefficient = glazing__coefficient;
		glazing__coefficient = newGlazing__coefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__GLAZING_COEFFICIENT, oldGlazing__coefficient, glazing__coefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccupancy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("occupancy")) lock.put("occupancy", new Boolean(false));
			if (!(Boolean)lock.get("occupancy")){
				lock.put("occupancy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"occupancy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Occupancy");
					occupancy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return occupancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupancy(String newOccupancy) {
		String oldOccupancy = occupancy;
		occupancy = newOccupancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__OCCUPANCY, oldOccupancy, occupancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccupants() {
		// Generated by python script located in this directory
			if (!lock.containsKey("occupants")) lock.put("occupants", new Boolean(false));
			if (!(Boolean)lock.get("occupants")){
				lock.put("occupants", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"occupants");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Occupants");
					occupants= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return occupants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupants(String newOccupants) {
		String oldOccupants = occupants;
		occupants = newOccupants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__OCCUPANTS, oldOccupants, occupants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedule() {
		// Generated by python script located in this directory
			if (!lock.containsKey("schedule")) lock.put("schedule", new Boolean(false));
			if (!(Boolean)lock.get("schedule")){
				lock.put("schedule", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"schedule");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Schedule");
					schedule= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(String newSchedule) {
		String oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__SCHEDULE, oldSchedule, schedule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__AIR_TEMPERATURE, oldAir_temperature, air_temperature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__MASS_TEMPERATURE, oldMass_temperature, mass_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemperature_change() {
		// Generated by python script located in this directory
			if (!lock.containsKey("temperature_change")) lock.put("temperature_change", new Boolean(false));
			if (!(Boolean)lock.get("temperature_change")){
				lock.put("temperature_change", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"temperature_change");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Temperature_change");
					temperature_change= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return temperature_change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature_change(String newTemperature_change) {
		String oldTemperature_change = temperature_change;
		temperature_change = newTemperature_change;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__TEMPERATURE_CHANGE, oldTemperature_change, temperature_change));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__OUTDOOR_TEMPERATURE, oldOutdoor_temperature, outdoor_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQh() {
		// Generated by python script located in this directory
			if (!lock.containsKey("qh")) lock.put("qh", new Boolean(false));
			if (!(Boolean)lock.get("qh")){
				lock.put("qh", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qh");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qh");
					qh= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQh(String newQh) {
		String oldQh = qh;
		qh = newQh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__QH, oldQh, qh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQs() {
		// Generated by python script located in this directory
			if (!lock.containsKey("qs")) lock.put("qs", new Boolean(false));
			if (!(Boolean)lock.get("qs")){
				lock.put("qs", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qs");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qs");
					qs= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQs(String newQs) {
		String oldQs = qs;
		qs = newQs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__QS, oldQs, qs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQi() {
		// Generated by python script located in this directory
			if (!lock.containsKey("qi")) lock.put("qi", new Boolean(false));
			if (!(Boolean)lock.get("qi")){
				lock.put("qi", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qi");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qi");
					qi= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQi(String newQi) {
		String oldQi = qi;
		qi = newQi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__QI, oldQi, qi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQz() {
		// Generated by python script located in this directory
			if (!lock.containsKey("qz")) lock.put("qz", new Boolean(false));
			if (!(Boolean)lock.get("qz")){
				lock.put("qz", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"qz");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Qz");
					qz= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return qz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQz(String newQz) {
		String oldQz = qz;
		qz = newQz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__QZ, oldQz, qz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac_mode() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac_mode")) lock.put("hvac_mode", new Boolean(false));
			if (!(Boolean)lock.get("hvac_mode")){
				lock.put("hvac_mode", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Hvac_mode");
					hvac_mode= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac_mode(String newHvac_mode) {
		String oldHvac_mode = hvac_mode;
		hvac_mode = newHvac_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_MODE, oldHvac_mode, hvac_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__cooling__balance_temperature() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__cooling__balance_temperature")) lock.put("hvac__cooling__balance_temperature", new Boolean(false));
			if (!(Boolean)lock.get("hvac__cooling__balance_temperature")){
				lock.put("hvac__cooling__balance_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20cooling%20balance_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20COOLING%20BALANCE_TEMPERATURE");
					hvac__cooling__balance_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__cooling__balance_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__cooling__balance_temperature(String newHvac__cooling__balance_temperature) {
		String oldHvac__cooling__balance_temperature = hvac__cooling__balance_temperature;
		hvac__cooling__balance_temperature = newHvac__cooling__balance_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_COOLING_BALANCE_TEMPERATURE, oldHvac__cooling__balance_temperature, hvac__cooling__balance_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__cooling__capacity() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__cooling__capacity")) lock.put("hvac__cooling__capacity", new Boolean(false));
			if (!(Boolean)lock.get("hvac__cooling__capacity")){
				lock.put("hvac__cooling__capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20cooling%20capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20COOLING%20CAPACITY");
					hvac__cooling__capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__cooling__capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__cooling__capacity(String newHvac__cooling__capacity) {
		String oldHvac__cooling__capacity = hvac__cooling__capacity;
		hvac__cooling__capacity = newHvac__cooling__capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY, oldHvac__cooling__capacity, hvac__cooling__capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__cooling__capacity_perF() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__cooling__capacity_perF")) lock.put("hvac__cooling__capacity_perF", new Boolean(false));
			if (!(Boolean)lock.get("hvac__cooling__capacity_perF")){
				lock.put("hvac__cooling__capacity_perF", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20cooling%20capacity_perF");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20COOLING%20CAPACITY_PERF");
					hvac__cooling__capacity_perF= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__cooling__capacity_perF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__cooling__capacity_perF(String newHvac__cooling__capacity_perF) {
		String oldHvac__cooling__capacity_perF = hvac__cooling__capacity_perF;
		hvac__cooling__capacity_perF = newHvac__cooling__capacity_perF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY_PER_F, oldHvac__cooling__capacity_perF, hvac__cooling__capacity_perF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__cooling__design_temperature() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__cooling__design_temperature")) lock.put("hvac__cooling__design_temperature", new Boolean(false));
			if (!(Boolean)lock.get("hvac__cooling__design_temperature")){
				lock.put("hvac__cooling__design_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20cooling%20design_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20COOLING%20DESIGN_TEMPERATURE");
					hvac__cooling__design_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__cooling__design_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__cooling__design_temperature(String newHvac__cooling__design_temperature) {
		String oldHvac__cooling__design_temperature = hvac__cooling__design_temperature;
		hvac__cooling__design_temperature = newHvac__cooling__design_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_COOLING_DESIGN_TEMPERATURE, oldHvac__cooling__design_temperature, hvac__cooling__design_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__cooling__efficiency() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__cooling__efficiency")) lock.put("hvac__cooling__efficiency", new Boolean(false));
			if (!(Boolean)lock.get("hvac__cooling__efficiency")){
				lock.put("hvac__cooling__efficiency", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20cooling%20efficiency");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20COOLING%20EFFICIENCY");
					hvac__cooling__efficiency= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__cooling__efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__cooling__efficiency(String newHvac__cooling__efficiency) {
		String oldHvac__cooling__efficiency = hvac__cooling__efficiency;
		hvac__cooling__efficiency = newHvac__cooling__efficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_COOLING_EFFICIENCY, oldHvac__cooling__efficiency, hvac__cooling__efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__cooling__cop() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__cooling__cop")) lock.put("hvac__cooling__cop", new Boolean(false));
			if (!(Boolean)lock.get("hvac__cooling__cop")){
				lock.put("hvac__cooling__cop", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20cooling%20cop");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20COOLING%20COP");
					hvac__cooling__cop= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__cooling__cop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__cooling__cop(String newHvac__cooling__cop) {
		String oldHvac__cooling__cop = hvac__cooling__cop;
		hvac__cooling__cop = newHvac__cooling__cop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_COOLING_COP, oldHvac__cooling__cop, hvac__cooling__cop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__heating__balance_temperature() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__heating__balance_temperature")) lock.put("hvac__heating__balance_temperature", new Boolean(false));
			if (!(Boolean)lock.get("hvac__heating__balance_temperature")){
				lock.put("hvac__heating__balance_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20heating%20balance_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20HEATING%20BALANCE_TEMPERATURE");
					hvac__heating__balance_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__heating__balance_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__heating__balance_temperature(String newHvac__heating__balance_temperature) {
		String oldHvac__heating__balance_temperature = hvac__heating__balance_temperature;
		hvac__heating__balance_temperature = newHvac__heating__balance_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_HEATING_BALANCE_TEMPERATURE, oldHvac__heating__balance_temperature, hvac__heating__balance_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__heating__capacity() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__heating__capacity")) lock.put("hvac__heating__capacity", new Boolean(false));
			if (!(Boolean)lock.get("hvac__heating__capacity")){
				lock.put("hvac__heating__capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20heating%20capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20HEATING%20CAPACITY");
					hvac__heating__capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__heating__capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__heating__capacity(String newHvac__heating__capacity) {
		String oldHvac__heating__capacity = hvac__heating__capacity;
		hvac__heating__capacity = newHvac__heating__capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY, oldHvac__heating__capacity, hvac__heating__capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__heating__capacity_perF() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__heating__capacity_perF")) lock.put("hvac__heating__capacity_perF", new Boolean(false));
			if (!(Boolean)lock.get("hvac__heating__capacity_perF")){
				lock.put("hvac__heating__capacity_perF", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20heating%20capacity_perF");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20HEATING%20CAPACITY_PERF");
					hvac__heating__capacity_perF= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__heating__capacity_perF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__heating__capacity_perF(String newHvac__heating__capacity_perF) {
		String oldHvac__heating__capacity_perF = hvac__heating__capacity_perF;
		hvac__heating__capacity_perF = newHvac__heating__capacity_perF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY_PER_F, oldHvac__heating__capacity_perF, hvac__heating__capacity_perF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__heating__design_temperature() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__heating__design_temperature")) lock.put("hvac__heating__design_temperature", new Boolean(false));
			if (!(Boolean)lock.get("hvac__heating__design_temperature")){
				lock.put("hvac__heating__design_temperature", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20heating%20design_temperature");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20HEATING%20DESIGN_TEMPERATURE");
					hvac__heating__design_temperature= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__heating__design_temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__heating__design_temperature(String newHvac__heating__design_temperature) {
		String oldHvac__heating__design_temperature = hvac__heating__design_temperature;
		hvac__heating__design_temperature = newHvac__heating__design_temperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_HEATING_DESIGN_TEMPERATURE, oldHvac__heating__design_temperature, hvac__heating__design_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__heating__efficiency() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__heating__efficiency")) lock.put("hvac__heating__efficiency", new Boolean(false));
			if (!(Boolean)lock.get("hvac__heating__efficiency")){
				lock.put("hvac__heating__efficiency", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20heating%20efficiency");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20HEATING%20EFFICIENCY");
					hvac__heating__efficiency= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__heating__efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__heating__efficiency(String newHvac__heating__efficiency) {
		String oldHvac__heating__efficiency = hvac__heating__efficiency;
		hvac__heating__efficiency = newHvac__heating__efficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_HEATING_EFFICIENCY, oldHvac__heating__efficiency, hvac__heating__efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__heating__cop() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__heating__cop")) lock.put("hvac__heating__cop", new Boolean(false));
			if (!(Boolean)lock.get("hvac__heating__cop")){
				lock.put("hvac__heating__cop", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20heating%20cop");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20HEATING%20COP");
					hvac__heating__cop= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__heating__cop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__heating__cop(String newHvac__heating__cop) {
		String oldHvac__heating__cop = hvac__heating__cop;
		hvac__heating__cop = newHvac__heating__cop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_HEATING_COP, oldHvac__heating__cop, hvac__heating__cop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__capacity() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__capacity")) lock.put("lights__capacity", new Boolean(false));
			if (!(Boolean)lock.get("lights__capacity")){
				lock.put("lights__capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20CAPACITY");
					lights__capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__capacity(String newLights__capacity) {
		String oldLights__capacity = lights__capacity;
		lights__capacity = newLights__capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_CAPACITY, oldLights__capacity, lights__capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__fraction() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__fraction")) lock.put("lights__fraction", new Boolean(false));
			if (!(Boolean)lock.get("lights__fraction")){
				lock.put("lights__fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20FRACTION");
					lights__fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__fraction(String newLights__fraction) {
		String oldLights__fraction = lights__fraction;
		lights__fraction = newLights__fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_FRACTION, oldLights__fraction, lights__fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__capacity() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__capacity")) lock.put("plugs__capacity", new Boolean(false));
			if (!(Boolean)lock.get("plugs__capacity")){
				lock.put("plugs__capacity", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20capacity");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20CAPACITY");
					plugs__capacity= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__capacity(String newPlugs__capacity) {
		String oldPlugs__capacity = plugs__capacity;
		plugs__capacity = newPlugs__capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_CAPACITY, oldPlugs__capacity, plugs__capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__fraction() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__fraction")) lock.put("plugs__fraction", new Boolean(false));
			if (!(Boolean)lock.get("plugs__fraction")){
				lock.put("plugs__fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20FRACTION");
					plugs__fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__fraction(String newPlugs__fraction) {
		String oldPlugs__fraction = plugs__fraction;
		plugs__fraction = newPlugs__fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_FRACTION, oldPlugs__fraction, plugs__fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemand() {
		// Generated by python script located in this directory
			if (!lock.containsKey("demand")) lock.put("demand", new Boolean(false));
			if (!(Boolean)lock.get("demand")){
				lock.put("demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Demand");
					demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemand(String newDemand) {
		String oldDemand = demand;
		demand = newDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__DEMAND, oldDemand, demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotal_load() {
		// Generated by python script located in this directory
			if (!lock.containsKey("total_load")) lock.put("total_load", new Boolean(false));
			if (!(Boolean)lock.get("total_load")){
				lock.put("total_load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"total_load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Total_load");
					total_load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return total_load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_load(String newTotal_load) {
		String oldTotal_load = total_load;
		total_load = newTotal_load;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__TOTAL_LOAD, oldTotal_load, total_load));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current")) lock.put("current", new Boolean(false));
			if (!(Boolean)lock.get("current")){
				lock.put("current", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"current");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Current");
					current= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(String newCurrent) {
		String oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdmittance() {
		// Generated by python script located in this directory
			if (!lock.containsKey("admittance")) lock.put("admittance", new Boolean(false));
			if (!(Boolean)lock.get("admittance")){
				lock.put("admittance", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"admittance");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Admittance");
					admittance= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmittance(String newAdmittance) {
		String oldAdmittance = admittance;
		admittance = newAdmittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__ADMITTANCE, oldAdmittance, admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__demand() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__demand")) lock.put("hvac__demand", new Boolean(false));
			if (!(Boolean)lock.get("hvac__demand")){
				lock.put("hvac__demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20DEMAND");
					hvac__demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__demand(String newHvac__demand) {
		String oldHvac__demand = hvac__demand;
		hvac__demand = newHvac__demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_DEMAND, oldHvac__demand, hvac__demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__load() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__load")) lock.put("hvac__load", new Boolean(false));
			if (!(Boolean)lock.get("hvac__load")){
				lock.put("hvac__load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20LOAD");
					hvac__load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__load(String newHvac__load) {
		String oldHvac__load = hvac__load;
		hvac__load = newHvac__load;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_LOAD, oldHvac__load, hvac__load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__energy")) lock.put("hvac__energy", new Boolean(false));
			if (!(Boolean)lock.get("hvac__energy")){
				lock.put("hvac__energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20ENERGY");
					hvac__energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__energy(String newHvac__energy) {
		String oldHvac__energy = hvac__energy;
		hvac__energy = newHvac__energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_ENERGY, oldHvac__energy, hvac__energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHvac__power_factor() {
		// Generated by python script located in this directory
			if (!lock.containsKey("hvac__power_factor")) lock.put("hvac__power_factor", new Boolean(false));
			if (!(Boolean)lock.get("hvac__power_factor")){
				lock.put("hvac__power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"hvac%20power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"HVAC%20POWER_FACTOR");
					hvac__power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return hvac__power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHvac__power_factor(String newHvac__power_factor) {
		String oldHvac__power_factor = hvac__power_factor;
		hvac__power_factor = newHvac__power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HVAC_POWER_FACTOR, oldHvac__power_factor, hvac__power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__demand() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__demand")) lock.put("lights__demand", new Boolean(false));
			if (!(Boolean)lock.get("lights__demand")){
				lock.put("lights__demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20DEMAND");
					lights__demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__demand(String newLights__demand) {
		String oldLights__demand = lights__demand;
		lights__demand = newLights__demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_DEMAND, oldLights__demand, lights__demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__load() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__load")) lock.put("lights__load", new Boolean(false));
			if (!(Boolean)lock.get("lights__load")){
				lock.put("lights__load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20LOAD");
					lights__load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__load(String newLights__load) {
		String oldLights__load = lights__load;
		lights__load = newLights__load;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_LOAD, oldLights__load, lights__load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__energy")) lock.put("lights__energy", new Boolean(false));
			if (!(Boolean)lock.get("lights__energy")){
				lock.put("lights__energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20ENERGY");
					lights__energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__energy(String newLights__energy) {
		String oldLights__energy = lights__energy;
		lights__energy = newLights__energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_ENERGY, oldLights__energy, lights__energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__power_factor() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__power_factor")) lock.put("lights__power_factor", new Boolean(false));
			if (!(Boolean)lock.get("lights__power_factor")){
				lock.put("lights__power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20POWER_FACTOR");
					lights__power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__power_factor(String newLights__power_factor) {
		String oldLights__power_factor = lights__power_factor;
		lights__power_factor = newLights__power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_POWER_FACTOR, oldLights__power_factor, lights__power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__heatgain_fraction() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__heatgain_fraction")) lock.put("lights__heatgain_fraction", new Boolean(false));
			if (!(Boolean)lock.get("lights__heatgain_fraction")){
				lock.put("lights__heatgain_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20heatgain_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20HEATGAIN_FRACTION");
					lights__heatgain_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__heatgain_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__heatgain_fraction(String newLights__heatgain_fraction) {
		String oldLights__heatgain_fraction = lights__heatgain_fraction;
		lights__heatgain_fraction = newLights__heatgain_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_HEATGAIN_FRACTION, oldLights__heatgain_fraction, lights__heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLights__heatgain() {
		// Generated by python script located in this directory
			if (!lock.containsKey("lights__heatgain")) lock.put("lights__heatgain", new Boolean(false));
			if (!(Boolean)lock.get("lights__heatgain")){
				lock.put("lights__heatgain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"lights%20heatgain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"LIGHTS%20HEATGAIN");
					lights__heatgain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return lights__heatgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLights__heatgain(String newLights__heatgain) {
		String oldLights__heatgain = lights__heatgain;
		lights__heatgain = newLights__heatgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__LIGHTS_HEATGAIN, oldLights__heatgain, lights__heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__demand() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__demand")) lock.put("plugs__demand", new Boolean(false));
			if (!(Boolean)lock.get("plugs__demand")){
				lock.put("plugs__demand", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20demand");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20DEMAND");
					plugs__demand= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__demand(String newPlugs__demand) {
		String oldPlugs__demand = plugs__demand;
		plugs__demand = newPlugs__demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_DEMAND, oldPlugs__demand, plugs__demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__load() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__load")) lock.put("plugs__load", new Boolean(false));
			if (!(Boolean)lock.get("plugs__load")){
				lock.put("plugs__load", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20load");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20LOAD");
					plugs__load= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__load(String newPlugs__load) {
		String oldPlugs__load = plugs__load;
		plugs__load = newPlugs__load;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_LOAD, oldPlugs__load, plugs__load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__energy() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__energy")) lock.put("plugs__energy", new Boolean(false));
			if (!(Boolean)lock.get("plugs__energy")){
				lock.put("plugs__energy", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20energy");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20ENERGY");
					plugs__energy= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__energy(String newPlugs__energy) {
		String oldPlugs__energy = plugs__energy;
		plugs__energy = newPlugs__energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_ENERGY, oldPlugs__energy, plugs__energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__power_factor() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__power_factor")) lock.put("plugs__power_factor", new Boolean(false));
			if (!(Boolean)lock.get("plugs__power_factor")){
				lock.put("plugs__power_factor", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20power_factor");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20POWER_FACTOR");
					plugs__power_factor= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__power_factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__power_factor(String newPlugs__power_factor) {
		String oldPlugs__power_factor = plugs__power_factor;
		plugs__power_factor = newPlugs__power_factor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_POWER_FACTOR, oldPlugs__power_factor, plugs__power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__heatgain_fraction() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__heatgain_fraction")) lock.put("plugs__heatgain_fraction", new Boolean(false));
			if (!(Boolean)lock.get("plugs__heatgain_fraction")){
				lock.put("plugs__heatgain_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20heatgain_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20HEATGAIN_FRACTION");
					plugs__heatgain_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__heatgain_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__heatgain_fraction(String newPlugs__heatgain_fraction) {
		String oldPlugs__heatgain_fraction = plugs__heatgain_fraction;
		plugs__heatgain_fraction = newPlugs__heatgain_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_HEATGAIN_FRACTION, oldPlugs__heatgain_fraction, plugs__heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlugs__heatgain() {
		// Generated by python script located in this directory
			if (!lock.containsKey("plugs__heatgain")) lock.put("plugs__heatgain", new Boolean(false));
			if (!(Boolean)lock.get("plugs__heatgain")){
				lock.put("plugs__heatgain", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"plugs%20heatgain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PLUGS%20HEATGAIN");
					plugs__heatgain= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return plugs__heatgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugs__heatgain(String newPlugs__heatgain) {
		String oldPlugs__heatgain = plugs__heatgain;
		plugs__heatgain = newPlugs__heatgain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__PLUGS_HEATGAIN, oldPlugs__heatgain, plugs__heatgain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__COOLING_SETPOINT, oldCooling_setpoint, cooling_setpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__HEATING_SETPOINT, oldHeating_setpoint, heating_setpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__THERMOSTAT_DEADBAND, oldThermostat_deadband, thermostat_deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl__ventilation_fraction() {
		// Generated by python script located in this directory
			if (!lock.containsKey("control__ventilation_fraction")) lock.put("control__ventilation_fraction", new Boolean(false));
			if (!(Boolean)lock.get("control__ventilation_fraction")){
				lock.put("control__ventilation_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"control%20ventilation_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"CONTROL%20VENTILATION_FRACTION");
					control__ventilation_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return control__ventilation_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl__ventilation_fraction(String newControl__ventilation_fraction) {
		String oldControl__ventilation_fraction = control__ventilation_fraction;
		control__ventilation_fraction = newControl__ventilation_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__CONTROL_VENTILATION_FRACTION, oldControl__ventilation_fraction, control__ventilation_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl__lighting_fraction() {
		// Generated by python script located in this directory
			if (!lock.containsKey("control__lighting_fraction")) lock.put("control__lighting_fraction", new Boolean(false));
			if (!(Boolean)lock.get("control__lighting_fraction")){
				lock.put("control__lighting_fraction", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"control%20lighting_fraction");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"CONTROL%20LIGHTING_FRACTION");
					control__lighting_fraction= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return control__lighting_fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl__lighting_fraction(String newControl__lighting_fraction) {
		String oldControl__lighting_fraction = control__lighting_fraction;
		control__lighting_fraction = newControl__lighting_fraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__CONTROL_LIGHTING_FRACTION, oldControl__lighting_fraction, control__lighting_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getACH() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ach")) lock.put("ach", new Boolean(false));
			if (!(Boolean)lock.get("ach")){
				lock.put("ach", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"ach");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Ach");
					ach= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return ach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACH(String newACH) {
		String oldACH = ach;
		ach = newACH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OFFICE__ACH, oldACH, ach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.OFFICE__FLOOR_AREA:
				return getFloor_area();
			case VisGridPackage.OFFICE__FLOOR_HEIGHT:
				return getFloor_height();
			case VisGridPackage.OFFICE__EXTERIOR_UA:
				return getExterior_ua();
			case VisGridPackage.OFFICE__INTERIOR_UA:
				return getInterior_ua();
			case VisGridPackage.OFFICE__INTERIOR_MASS:
				return getInterior_mass();
			case VisGridPackage.OFFICE__GLAZING:
				return getGlazing();
			case VisGridPackage.OFFICE__GLAZING_NORTH:
				return getGlazing__north();
			case VisGridPackage.OFFICE__GLAZING_NORTHEAST:
				return getGlazing__northeast();
			case VisGridPackage.OFFICE__GLAZING_EAST:
				return getGlazing__east();
			case VisGridPackage.OFFICE__GLAZING_SOUTHEAST:
				return getGlazing__southeast();
			case VisGridPackage.OFFICE__GLAZING_SOUTH:
				return getGlazing__south();
			case VisGridPackage.OFFICE__GLAZING_SOUTHWEST:
				return getGlazing__southwest();
			case VisGridPackage.OFFICE__GLAZING_WEST:
				return getGlazing__west();
			case VisGridPackage.OFFICE__GLAZING_NORTHWEST:
				return getGlazing__northwest();
			case VisGridPackage.OFFICE__GLAZING_HORIZONTAL:
				return getGlazing__horizontal();
			case VisGridPackage.OFFICE__GLAZING_COEFFICIENT:
				return getGlazing__coefficient();
			case VisGridPackage.OFFICE__OCCUPANCY:
				return getOccupancy();
			case VisGridPackage.OFFICE__OCCUPANTS:
				return getOccupants();
			case VisGridPackage.OFFICE__SCHEDULE:
				return getSchedule();
			case VisGridPackage.OFFICE__AIR_TEMPERATURE:
				return getAir_temperature();
			case VisGridPackage.OFFICE__MASS_TEMPERATURE:
				return getMass_temperature();
			case VisGridPackage.OFFICE__TEMPERATURE_CHANGE:
				return getTemperature_change();
			case VisGridPackage.OFFICE__OUTDOOR_TEMPERATURE:
				return getOutdoor_temperature();
			case VisGridPackage.OFFICE__QH:
				return getQh();
			case VisGridPackage.OFFICE__QS:
				return getQs();
			case VisGridPackage.OFFICE__QI:
				return getQi();
			case VisGridPackage.OFFICE__QZ:
				return getQz();
			case VisGridPackage.OFFICE__HVAC_MODE:
				return getHvac_mode();
			case VisGridPackage.OFFICE__HVAC_COOLING_BALANCE_TEMPERATURE:
				return getHvac__cooling__balance_temperature();
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY:
				return getHvac__cooling__capacity();
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY_PER_F:
				return getHvac__cooling__capacity_perF();
			case VisGridPackage.OFFICE__HVAC_COOLING_DESIGN_TEMPERATURE:
				return getHvac__cooling__design_temperature();
			case VisGridPackage.OFFICE__HVAC_COOLING_EFFICIENCY:
				return getHvac__cooling__efficiency();
			case VisGridPackage.OFFICE__HVAC_COOLING_COP:
				return getHvac__cooling__cop();
			case VisGridPackage.OFFICE__HVAC_HEATING_BALANCE_TEMPERATURE:
				return getHvac__heating__balance_temperature();
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY:
				return getHvac__heating__capacity();
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY_PER_F:
				return getHvac__heating__capacity_perF();
			case VisGridPackage.OFFICE__HVAC_HEATING_DESIGN_TEMPERATURE:
				return getHvac__heating__design_temperature();
			case VisGridPackage.OFFICE__HVAC_HEATING_EFFICIENCY:
				return getHvac__heating__efficiency();
			case VisGridPackage.OFFICE__HVAC_HEATING_COP:
				return getHvac__heating__cop();
			case VisGridPackage.OFFICE__LIGHTS_CAPACITY:
				return getLights__capacity();
			case VisGridPackage.OFFICE__LIGHTS_FRACTION:
				return getLights__fraction();
			case VisGridPackage.OFFICE__PLUGS_CAPACITY:
				return getPlugs__capacity();
			case VisGridPackage.OFFICE__PLUGS_FRACTION:
				return getPlugs__fraction();
			case VisGridPackage.OFFICE__DEMAND:
				return getDemand();
			case VisGridPackage.OFFICE__TOTAL_LOAD:
				return getTotal_load();
			case VisGridPackage.OFFICE__ENERGY:
				return getEnergy();
			case VisGridPackage.OFFICE__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.OFFICE__POWER:
				return getPower();
			case VisGridPackage.OFFICE__CURRENT:
				return getCurrent();
			case VisGridPackage.OFFICE__ADMITTANCE:
				return getAdmittance();
			case VisGridPackage.OFFICE__HVAC_DEMAND:
				return getHvac__demand();
			case VisGridPackage.OFFICE__HVAC_LOAD:
				return getHvac__load();
			case VisGridPackage.OFFICE__HVAC_ENERGY:
				return getHvac__energy();
			case VisGridPackage.OFFICE__HVAC_POWER_FACTOR:
				return getHvac__power_factor();
			case VisGridPackage.OFFICE__LIGHTS_DEMAND:
				return getLights__demand();
			case VisGridPackage.OFFICE__LIGHTS_LOAD:
				return getLights__load();
			case VisGridPackage.OFFICE__LIGHTS_ENERGY:
				return getLights__energy();
			case VisGridPackage.OFFICE__LIGHTS_POWER_FACTOR:
				return getLights__power_factor();
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN_FRACTION:
				return getLights__heatgain_fraction();
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN:
				return getLights__heatgain();
			case VisGridPackage.OFFICE__PLUGS_DEMAND:
				return getPlugs__demand();
			case VisGridPackage.OFFICE__PLUGS_LOAD:
				return getPlugs__load();
			case VisGridPackage.OFFICE__PLUGS_ENERGY:
				return getPlugs__energy();
			case VisGridPackage.OFFICE__PLUGS_POWER_FACTOR:
				return getPlugs__power_factor();
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN_FRACTION:
				return getPlugs__heatgain_fraction();
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN:
				return getPlugs__heatgain();
			case VisGridPackage.OFFICE__COOLING_SETPOINT:
				return getCooling_setpoint();
			case VisGridPackage.OFFICE__HEATING_SETPOINT:
				return getHeating_setpoint();
			case VisGridPackage.OFFICE__THERMOSTAT_DEADBAND:
				return getThermostat_deadband();
			case VisGridPackage.OFFICE__CONTROL_VENTILATION_FRACTION:
				return getControl__ventilation_fraction();
			case VisGridPackage.OFFICE__CONTROL_LIGHTING_FRACTION:
				return getControl__lighting_fraction();
			case VisGridPackage.OFFICE__ACH:
				return getACH();
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
			case VisGridPackage.OFFICE__FLOOR_AREA:
				setFloor_area((String)newValue);
				return;
			case VisGridPackage.OFFICE__FLOOR_HEIGHT:
				setFloor_height((String)newValue);
				return;
			case VisGridPackage.OFFICE__EXTERIOR_UA:
				setExterior_ua((String)newValue);
				return;
			case VisGridPackage.OFFICE__INTERIOR_UA:
				setInterior_ua((String)newValue);
				return;
			case VisGridPackage.OFFICE__INTERIOR_MASS:
				setInterior_mass((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING:
				setGlazing((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_NORTH:
				setGlazing__north((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_NORTHEAST:
				setGlazing__northeast((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_EAST:
				setGlazing__east((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_SOUTHEAST:
				setGlazing__southeast((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_SOUTH:
				setGlazing__south((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_SOUTHWEST:
				setGlazing__southwest((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_WEST:
				setGlazing__west((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_NORTHWEST:
				setGlazing__northwest((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_HORIZONTAL:
				setGlazing__horizontal((String)newValue);
				return;
			case VisGridPackage.OFFICE__GLAZING_COEFFICIENT:
				setGlazing__coefficient((String)newValue);
				return;
			case VisGridPackage.OFFICE__OCCUPANCY:
				setOccupancy((String)newValue);
				return;
			case VisGridPackage.OFFICE__OCCUPANTS:
				setOccupants((String)newValue);
				return;
			case VisGridPackage.OFFICE__SCHEDULE:
				setSchedule((String)newValue);
				return;
			case VisGridPackage.OFFICE__AIR_TEMPERATURE:
				setAir_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__MASS_TEMPERATURE:
				setMass_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__TEMPERATURE_CHANGE:
				setTemperature_change((String)newValue);
				return;
			case VisGridPackage.OFFICE__OUTDOOR_TEMPERATURE:
				setOutdoor_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__QH:
				setQh((String)newValue);
				return;
			case VisGridPackage.OFFICE__QS:
				setQs((String)newValue);
				return;
			case VisGridPackage.OFFICE__QI:
				setQi((String)newValue);
				return;
			case VisGridPackage.OFFICE__QZ:
				setQz((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_MODE:
				setHvac_mode((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_BALANCE_TEMPERATURE:
				setHvac__cooling__balance_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY:
				setHvac__cooling__capacity((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY_PER_F:
				setHvac__cooling__capacity_perF((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_DESIGN_TEMPERATURE:
				setHvac__cooling__design_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_EFFICIENCY:
				setHvac__cooling__efficiency((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_COP:
				setHvac__cooling__cop((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_BALANCE_TEMPERATURE:
				setHvac__heating__balance_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY:
				setHvac__heating__capacity((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY_PER_F:
				setHvac__heating__capacity_perF((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_DESIGN_TEMPERATURE:
				setHvac__heating__design_temperature((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_EFFICIENCY:
				setHvac__heating__efficiency((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_COP:
				setHvac__heating__cop((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_CAPACITY:
				setLights__capacity((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_FRACTION:
				setLights__fraction((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_CAPACITY:
				setPlugs__capacity((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_FRACTION:
				setPlugs__fraction((String)newValue);
				return;
			case VisGridPackage.OFFICE__DEMAND:
				setDemand((String)newValue);
				return;
			case VisGridPackage.OFFICE__TOTAL_LOAD:
				setTotal_load((String)newValue);
				return;
			case VisGridPackage.OFFICE__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.OFFICE__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.OFFICE__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.OFFICE__CURRENT:
				setCurrent((String)newValue);
				return;
			case VisGridPackage.OFFICE__ADMITTANCE:
				setAdmittance((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_DEMAND:
				setHvac__demand((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_LOAD:
				setHvac__load((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_ENERGY:
				setHvac__energy((String)newValue);
				return;
			case VisGridPackage.OFFICE__HVAC_POWER_FACTOR:
				setHvac__power_factor((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_DEMAND:
				setLights__demand((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_LOAD:
				setLights__load((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_ENERGY:
				setLights__energy((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_POWER_FACTOR:
				setLights__power_factor((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN_FRACTION:
				setLights__heatgain_fraction((String)newValue);
				return;
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN:
				setLights__heatgain((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_DEMAND:
				setPlugs__demand((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_LOAD:
				setPlugs__load((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_ENERGY:
				setPlugs__energy((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_POWER_FACTOR:
				setPlugs__power_factor((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN_FRACTION:
				setPlugs__heatgain_fraction((String)newValue);
				return;
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN:
				setPlugs__heatgain((String)newValue);
				return;
			case VisGridPackage.OFFICE__COOLING_SETPOINT:
				setCooling_setpoint((String)newValue);
				return;
			case VisGridPackage.OFFICE__HEATING_SETPOINT:
				setHeating_setpoint((String)newValue);
				return;
			case VisGridPackage.OFFICE__THERMOSTAT_DEADBAND:
				setThermostat_deadband((String)newValue);
				return;
			case VisGridPackage.OFFICE__CONTROL_VENTILATION_FRACTION:
				setControl__ventilation_fraction((String)newValue);
				return;
			case VisGridPackage.OFFICE__CONTROL_LIGHTING_FRACTION:
				setControl__lighting_fraction((String)newValue);
				return;
			case VisGridPackage.OFFICE__ACH:
				setACH((String)newValue);
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
			case VisGridPackage.OFFICE__FLOOR_AREA:
				setFloor_area(FLOOR_AREA_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__FLOOR_HEIGHT:
				setFloor_height(FLOOR_HEIGHT_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__EXTERIOR_UA:
				setExterior_ua(EXTERIOR_UA_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__INTERIOR_UA:
				setInterior_ua(INTERIOR_UA_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__INTERIOR_MASS:
				setInterior_mass(INTERIOR_MASS_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING:
				setGlazing(GLAZING_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_NORTH:
				setGlazing__north(GLAZING_NORTH_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_NORTHEAST:
				setGlazing__northeast(GLAZING_NORTHEAST_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_EAST:
				setGlazing__east(GLAZING_EAST_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_SOUTHEAST:
				setGlazing__southeast(GLAZING_SOUTHEAST_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_SOUTH:
				setGlazing__south(GLAZING_SOUTH_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_SOUTHWEST:
				setGlazing__southwest(GLAZING_SOUTHWEST_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_WEST:
				setGlazing__west(GLAZING_WEST_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_NORTHWEST:
				setGlazing__northwest(GLAZING_NORTHWEST_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_HORIZONTAL:
				setGlazing__horizontal(GLAZING_HORIZONTAL_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__GLAZING_COEFFICIENT:
				setGlazing__coefficient(GLAZING_COEFFICIENT_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__OCCUPANCY:
				setOccupancy(OCCUPANCY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__OCCUPANTS:
				setOccupants(OCCUPANTS_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__SCHEDULE:
				setSchedule(SCHEDULE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__AIR_TEMPERATURE:
				setAir_temperature(AIR_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__MASS_TEMPERATURE:
				setMass_temperature(MASS_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__TEMPERATURE_CHANGE:
				setTemperature_change(TEMPERATURE_CHANGE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__OUTDOOR_TEMPERATURE:
				setOutdoor_temperature(OUTDOOR_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__QH:
				setQh(QH_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__QS:
				setQs(QS_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__QI:
				setQi(QI_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__QZ:
				setQz(QZ_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_MODE:
				setHvac_mode(HVAC_MODE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_BALANCE_TEMPERATURE:
				setHvac__cooling__balance_temperature(HVAC_COOLING_BALANCE_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY:
				setHvac__cooling__capacity(HVAC_COOLING_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY_PER_F:
				setHvac__cooling__capacity_perF(HVAC_COOLING_CAPACITY_PER_F_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_DESIGN_TEMPERATURE:
				setHvac__cooling__design_temperature(HVAC_COOLING_DESIGN_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_EFFICIENCY:
				setHvac__cooling__efficiency(HVAC_COOLING_EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_COOLING_COP:
				setHvac__cooling__cop(HVAC_COOLING_COP_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_BALANCE_TEMPERATURE:
				setHvac__heating__balance_temperature(HVAC_HEATING_BALANCE_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY:
				setHvac__heating__capacity(HVAC_HEATING_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY_PER_F:
				setHvac__heating__capacity_perF(HVAC_HEATING_CAPACITY_PER_F_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_DESIGN_TEMPERATURE:
				setHvac__heating__design_temperature(HVAC_HEATING_DESIGN_TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_EFFICIENCY:
				setHvac__heating__efficiency(HVAC_HEATING_EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_HEATING_COP:
				setHvac__heating__cop(HVAC_HEATING_COP_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_CAPACITY:
				setLights__capacity(LIGHTS_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_FRACTION:
				setLights__fraction(LIGHTS_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_CAPACITY:
				setPlugs__capacity(PLUGS_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_FRACTION:
				setPlugs__fraction(PLUGS_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__DEMAND:
				setDemand(DEMAND_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__TOTAL_LOAD:
				setTotal_load(TOTAL_LOAD_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__ADMITTANCE:
				setAdmittance(ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_DEMAND:
				setHvac__demand(HVAC_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_LOAD:
				setHvac__load(HVAC_LOAD_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_ENERGY:
				setHvac__energy(HVAC_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HVAC_POWER_FACTOR:
				setHvac__power_factor(HVAC_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_DEMAND:
				setLights__demand(LIGHTS_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_LOAD:
				setLights__load(LIGHTS_LOAD_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_ENERGY:
				setLights__energy(LIGHTS_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_POWER_FACTOR:
				setLights__power_factor(LIGHTS_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN_FRACTION:
				setLights__heatgain_fraction(LIGHTS_HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN:
				setLights__heatgain(LIGHTS_HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_DEMAND:
				setPlugs__demand(PLUGS_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_LOAD:
				setPlugs__load(PLUGS_LOAD_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_ENERGY:
				setPlugs__energy(PLUGS_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_POWER_FACTOR:
				setPlugs__power_factor(PLUGS_POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN_FRACTION:
				setPlugs__heatgain_fraction(PLUGS_HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN:
				setPlugs__heatgain(PLUGS_HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__COOLING_SETPOINT:
				setCooling_setpoint(COOLING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__HEATING_SETPOINT:
				setHeating_setpoint(HEATING_SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__THERMOSTAT_DEADBAND:
				setThermostat_deadband(THERMOSTAT_DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__CONTROL_VENTILATION_FRACTION:
				setControl__ventilation_fraction(CONTROL_VENTILATION_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__CONTROL_LIGHTING_FRACTION:
				setControl__lighting_fraction(CONTROL_LIGHTING_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.OFFICE__ACH:
				setACH(ACH_EDEFAULT);
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
			case VisGridPackage.OFFICE__FLOOR_AREA:
				return FLOOR_AREA_EDEFAULT == null ? floor_area != null : !FLOOR_AREA_EDEFAULT.equals(floor_area);
			case VisGridPackage.OFFICE__FLOOR_HEIGHT:
				return FLOOR_HEIGHT_EDEFAULT == null ? floor_height != null : !FLOOR_HEIGHT_EDEFAULT.equals(floor_height);
			case VisGridPackage.OFFICE__EXTERIOR_UA:
				return EXTERIOR_UA_EDEFAULT == null ? exterior_ua != null : !EXTERIOR_UA_EDEFAULT.equals(exterior_ua);
			case VisGridPackage.OFFICE__INTERIOR_UA:
				return INTERIOR_UA_EDEFAULT == null ? interior_ua != null : !INTERIOR_UA_EDEFAULT.equals(interior_ua);
			case VisGridPackage.OFFICE__INTERIOR_MASS:
				return INTERIOR_MASS_EDEFAULT == null ? interior_mass != null : !INTERIOR_MASS_EDEFAULT.equals(interior_mass);
			case VisGridPackage.OFFICE__GLAZING:
				return GLAZING_EDEFAULT == null ? glazing != null : !GLAZING_EDEFAULT.equals(glazing);
			case VisGridPackage.OFFICE__GLAZING_NORTH:
				return GLAZING_NORTH_EDEFAULT == null ? glazing__north != null : !GLAZING_NORTH_EDEFAULT.equals(glazing__north);
			case VisGridPackage.OFFICE__GLAZING_NORTHEAST:
				return GLAZING_NORTHEAST_EDEFAULT == null ? glazing__northeast != null : !GLAZING_NORTHEAST_EDEFAULT.equals(glazing__northeast);
			case VisGridPackage.OFFICE__GLAZING_EAST:
				return GLAZING_EAST_EDEFAULT == null ? glazing__east != null : !GLAZING_EAST_EDEFAULT.equals(glazing__east);
			case VisGridPackage.OFFICE__GLAZING_SOUTHEAST:
				return GLAZING_SOUTHEAST_EDEFAULT == null ? glazing__southeast != null : !GLAZING_SOUTHEAST_EDEFAULT.equals(glazing__southeast);
			case VisGridPackage.OFFICE__GLAZING_SOUTH:
				return GLAZING_SOUTH_EDEFAULT == null ? glazing__south != null : !GLAZING_SOUTH_EDEFAULT.equals(glazing__south);
			case VisGridPackage.OFFICE__GLAZING_SOUTHWEST:
				return GLAZING_SOUTHWEST_EDEFAULT == null ? glazing__southwest != null : !GLAZING_SOUTHWEST_EDEFAULT.equals(glazing__southwest);
			case VisGridPackage.OFFICE__GLAZING_WEST:
				return GLAZING_WEST_EDEFAULT == null ? glazing__west != null : !GLAZING_WEST_EDEFAULT.equals(glazing__west);
			case VisGridPackage.OFFICE__GLAZING_NORTHWEST:
				return GLAZING_NORTHWEST_EDEFAULT == null ? glazing__northwest != null : !GLAZING_NORTHWEST_EDEFAULT.equals(glazing__northwest);
			case VisGridPackage.OFFICE__GLAZING_HORIZONTAL:
				return GLAZING_HORIZONTAL_EDEFAULT == null ? glazing__horizontal != null : !GLAZING_HORIZONTAL_EDEFAULT.equals(glazing__horizontal);
			case VisGridPackage.OFFICE__GLAZING_COEFFICIENT:
				return GLAZING_COEFFICIENT_EDEFAULT == null ? glazing__coefficient != null : !GLAZING_COEFFICIENT_EDEFAULT.equals(glazing__coefficient);
			case VisGridPackage.OFFICE__OCCUPANCY:
				return OCCUPANCY_EDEFAULT == null ? occupancy != null : !OCCUPANCY_EDEFAULT.equals(occupancy);
			case VisGridPackage.OFFICE__OCCUPANTS:
				return OCCUPANTS_EDEFAULT == null ? occupants != null : !OCCUPANTS_EDEFAULT.equals(occupants);
			case VisGridPackage.OFFICE__SCHEDULE:
				return SCHEDULE_EDEFAULT == null ? schedule != null : !SCHEDULE_EDEFAULT.equals(schedule);
			case VisGridPackage.OFFICE__AIR_TEMPERATURE:
				return AIR_TEMPERATURE_EDEFAULT == null ? air_temperature != null : !AIR_TEMPERATURE_EDEFAULT.equals(air_temperature);
			case VisGridPackage.OFFICE__MASS_TEMPERATURE:
				return MASS_TEMPERATURE_EDEFAULT == null ? mass_temperature != null : !MASS_TEMPERATURE_EDEFAULT.equals(mass_temperature);
			case VisGridPackage.OFFICE__TEMPERATURE_CHANGE:
				return TEMPERATURE_CHANGE_EDEFAULT == null ? temperature_change != null : !TEMPERATURE_CHANGE_EDEFAULT.equals(temperature_change);
			case VisGridPackage.OFFICE__OUTDOOR_TEMPERATURE:
				return OUTDOOR_TEMPERATURE_EDEFAULT == null ? outdoor_temperature != null : !OUTDOOR_TEMPERATURE_EDEFAULT.equals(outdoor_temperature);
			case VisGridPackage.OFFICE__QH:
				return QH_EDEFAULT == null ? qh != null : !QH_EDEFAULT.equals(qh);
			case VisGridPackage.OFFICE__QS:
				return QS_EDEFAULT == null ? qs != null : !QS_EDEFAULT.equals(qs);
			case VisGridPackage.OFFICE__QI:
				return QI_EDEFAULT == null ? qi != null : !QI_EDEFAULT.equals(qi);
			case VisGridPackage.OFFICE__QZ:
				return QZ_EDEFAULT == null ? qz != null : !QZ_EDEFAULT.equals(qz);
			case VisGridPackage.OFFICE__HVAC_MODE:
				return HVAC_MODE_EDEFAULT == null ? hvac_mode != null : !HVAC_MODE_EDEFAULT.equals(hvac_mode);
			case VisGridPackage.OFFICE__HVAC_COOLING_BALANCE_TEMPERATURE:
				return HVAC_COOLING_BALANCE_TEMPERATURE_EDEFAULT == null ? hvac__cooling__balance_temperature != null : !HVAC_COOLING_BALANCE_TEMPERATURE_EDEFAULT.equals(hvac__cooling__balance_temperature);
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY:
				return HVAC_COOLING_CAPACITY_EDEFAULT == null ? hvac__cooling__capacity != null : !HVAC_COOLING_CAPACITY_EDEFAULT.equals(hvac__cooling__capacity);
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY_PER_F:
				return HVAC_COOLING_CAPACITY_PER_F_EDEFAULT == null ? hvac__cooling__capacity_perF != null : !HVAC_COOLING_CAPACITY_PER_F_EDEFAULT.equals(hvac__cooling__capacity_perF);
			case VisGridPackage.OFFICE__HVAC_COOLING_DESIGN_TEMPERATURE:
				return HVAC_COOLING_DESIGN_TEMPERATURE_EDEFAULT == null ? hvac__cooling__design_temperature != null : !HVAC_COOLING_DESIGN_TEMPERATURE_EDEFAULT.equals(hvac__cooling__design_temperature);
			case VisGridPackage.OFFICE__HVAC_COOLING_EFFICIENCY:
				return HVAC_COOLING_EFFICIENCY_EDEFAULT == null ? hvac__cooling__efficiency != null : !HVAC_COOLING_EFFICIENCY_EDEFAULT.equals(hvac__cooling__efficiency);
			case VisGridPackage.OFFICE__HVAC_COOLING_COP:
				return HVAC_COOLING_COP_EDEFAULT == null ? hvac__cooling__cop != null : !HVAC_COOLING_COP_EDEFAULT.equals(hvac__cooling__cop);
			case VisGridPackage.OFFICE__HVAC_HEATING_BALANCE_TEMPERATURE:
				return HVAC_HEATING_BALANCE_TEMPERATURE_EDEFAULT == null ? hvac__heating__balance_temperature != null : !HVAC_HEATING_BALANCE_TEMPERATURE_EDEFAULT.equals(hvac__heating__balance_temperature);
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY:
				return HVAC_HEATING_CAPACITY_EDEFAULT == null ? hvac__heating__capacity != null : !HVAC_HEATING_CAPACITY_EDEFAULT.equals(hvac__heating__capacity);
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY_PER_F:
				return HVAC_HEATING_CAPACITY_PER_F_EDEFAULT == null ? hvac__heating__capacity_perF != null : !HVAC_HEATING_CAPACITY_PER_F_EDEFAULT.equals(hvac__heating__capacity_perF);
			case VisGridPackage.OFFICE__HVAC_HEATING_DESIGN_TEMPERATURE:
				return HVAC_HEATING_DESIGN_TEMPERATURE_EDEFAULT == null ? hvac__heating__design_temperature != null : !HVAC_HEATING_DESIGN_TEMPERATURE_EDEFAULT.equals(hvac__heating__design_temperature);
			case VisGridPackage.OFFICE__HVAC_HEATING_EFFICIENCY:
				return HVAC_HEATING_EFFICIENCY_EDEFAULT == null ? hvac__heating__efficiency != null : !HVAC_HEATING_EFFICIENCY_EDEFAULT.equals(hvac__heating__efficiency);
			case VisGridPackage.OFFICE__HVAC_HEATING_COP:
				return HVAC_HEATING_COP_EDEFAULT == null ? hvac__heating__cop != null : !HVAC_HEATING_COP_EDEFAULT.equals(hvac__heating__cop);
			case VisGridPackage.OFFICE__LIGHTS_CAPACITY:
				return LIGHTS_CAPACITY_EDEFAULT == null ? lights__capacity != null : !LIGHTS_CAPACITY_EDEFAULT.equals(lights__capacity);
			case VisGridPackage.OFFICE__LIGHTS_FRACTION:
				return LIGHTS_FRACTION_EDEFAULT == null ? lights__fraction != null : !LIGHTS_FRACTION_EDEFAULT.equals(lights__fraction);
			case VisGridPackage.OFFICE__PLUGS_CAPACITY:
				return PLUGS_CAPACITY_EDEFAULT == null ? plugs__capacity != null : !PLUGS_CAPACITY_EDEFAULT.equals(plugs__capacity);
			case VisGridPackage.OFFICE__PLUGS_FRACTION:
				return PLUGS_FRACTION_EDEFAULT == null ? plugs__fraction != null : !PLUGS_FRACTION_EDEFAULT.equals(plugs__fraction);
			case VisGridPackage.OFFICE__DEMAND:
				return DEMAND_EDEFAULT == null ? demand != null : !DEMAND_EDEFAULT.equals(demand);
			case VisGridPackage.OFFICE__TOTAL_LOAD:
				return TOTAL_LOAD_EDEFAULT == null ? total_load != null : !TOTAL_LOAD_EDEFAULT.equals(total_load);
			case VisGridPackage.OFFICE__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.OFFICE__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.OFFICE__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.OFFICE__CURRENT:
				return CURRENT_EDEFAULT == null ? current != null : !CURRENT_EDEFAULT.equals(current);
			case VisGridPackage.OFFICE__ADMITTANCE:
				return ADMITTANCE_EDEFAULT == null ? admittance != null : !ADMITTANCE_EDEFAULT.equals(admittance);
			case VisGridPackage.OFFICE__HVAC_DEMAND:
				return HVAC_DEMAND_EDEFAULT == null ? hvac__demand != null : !HVAC_DEMAND_EDEFAULT.equals(hvac__demand);
			case VisGridPackage.OFFICE__HVAC_LOAD:
				return HVAC_LOAD_EDEFAULT == null ? hvac__load != null : !HVAC_LOAD_EDEFAULT.equals(hvac__load);
			case VisGridPackage.OFFICE__HVAC_ENERGY:
				return HVAC_ENERGY_EDEFAULT == null ? hvac__energy != null : !HVAC_ENERGY_EDEFAULT.equals(hvac__energy);
			case VisGridPackage.OFFICE__HVAC_POWER_FACTOR:
				return HVAC_POWER_FACTOR_EDEFAULT == null ? hvac__power_factor != null : !HVAC_POWER_FACTOR_EDEFAULT.equals(hvac__power_factor);
			case VisGridPackage.OFFICE__LIGHTS_DEMAND:
				return LIGHTS_DEMAND_EDEFAULT == null ? lights__demand != null : !LIGHTS_DEMAND_EDEFAULT.equals(lights__demand);
			case VisGridPackage.OFFICE__LIGHTS_LOAD:
				return LIGHTS_LOAD_EDEFAULT == null ? lights__load != null : !LIGHTS_LOAD_EDEFAULT.equals(lights__load);
			case VisGridPackage.OFFICE__LIGHTS_ENERGY:
				return LIGHTS_ENERGY_EDEFAULT == null ? lights__energy != null : !LIGHTS_ENERGY_EDEFAULT.equals(lights__energy);
			case VisGridPackage.OFFICE__LIGHTS_POWER_FACTOR:
				return LIGHTS_POWER_FACTOR_EDEFAULT == null ? lights__power_factor != null : !LIGHTS_POWER_FACTOR_EDEFAULT.equals(lights__power_factor);
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN_FRACTION:
				return LIGHTS_HEATGAIN_FRACTION_EDEFAULT == null ? lights__heatgain_fraction != null : !LIGHTS_HEATGAIN_FRACTION_EDEFAULT.equals(lights__heatgain_fraction);
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN:
				return LIGHTS_HEATGAIN_EDEFAULT == null ? lights__heatgain != null : !LIGHTS_HEATGAIN_EDEFAULT.equals(lights__heatgain);
			case VisGridPackage.OFFICE__PLUGS_DEMAND:
				return PLUGS_DEMAND_EDEFAULT == null ? plugs__demand != null : !PLUGS_DEMAND_EDEFAULT.equals(plugs__demand);
			case VisGridPackage.OFFICE__PLUGS_LOAD:
				return PLUGS_LOAD_EDEFAULT == null ? plugs__load != null : !PLUGS_LOAD_EDEFAULT.equals(plugs__load);
			case VisGridPackage.OFFICE__PLUGS_ENERGY:
				return PLUGS_ENERGY_EDEFAULT == null ? plugs__energy != null : !PLUGS_ENERGY_EDEFAULT.equals(plugs__energy);
			case VisGridPackage.OFFICE__PLUGS_POWER_FACTOR:
				return PLUGS_POWER_FACTOR_EDEFAULT == null ? plugs__power_factor != null : !PLUGS_POWER_FACTOR_EDEFAULT.equals(plugs__power_factor);
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN_FRACTION:
				return PLUGS_HEATGAIN_FRACTION_EDEFAULT == null ? plugs__heatgain_fraction != null : !PLUGS_HEATGAIN_FRACTION_EDEFAULT.equals(plugs__heatgain_fraction);
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN:
				return PLUGS_HEATGAIN_EDEFAULT == null ? plugs__heatgain != null : !PLUGS_HEATGAIN_EDEFAULT.equals(plugs__heatgain);
			case VisGridPackage.OFFICE__COOLING_SETPOINT:
				return COOLING_SETPOINT_EDEFAULT == null ? cooling_setpoint != null : !COOLING_SETPOINT_EDEFAULT.equals(cooling_setpoint);
			case VisGridPackage.OFFICE__HEATING_SETPOINT:
				return HEATING_SETPOINT_EDEFAULT == null ? heating_setpoint != null : !HEATING_SETPOINT_EDEFAULT.equals(heating_setpoint);
			case VisGridPackage.OFFICE__THERMOSTAT_DEADBAND:
				return THERMOSTAT_DEADBAND_EDEFAULT == null ? thermostat_deadband != null : !THERMOSTAT_DEADBAND_EDEFAULT.equals(thermostat_deadband);
			case VisGridPackage.OFFICE__CONTROL_VENTILATION_FRACTION:
				return CONTROL_VENTILATION_FRACTION_EDEFAULT == null ? control__ventilation_fraction != null : !CONTROL_VENTILATION_FRACTION_EDEFAULT.equals(control__ventilation_fraction);
			case VisGridPackage.OFFICE__CONTROL_LIGHTING_FRACTION:
				return CONTROL_LIGHTING_FRACTION_EDEFAULT == null ? control__lighting_fraction != null : !CONTROL_LIGHTING_FRACTION_EDEFAULT.equals(control__lighting_fraction);
			case VisGridPackage.OFFICE__ACH:
				return ACH_EDEFAULT == null ? ach != null : !ACH_EDEFAULT.equals(ach);
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
		result.append(", floor_height: ");
		result.append(floor_height);
		result.append(", exterior_ua: ");
		result.append(exterior_ua);
		result.append(", interior_ua: ");
		result.append(interior_ua);
		result.append(", interior_mass: ");
		result.append(interior_mass);
		result.append(", glazing: ");
		result.append(glazing);
		result.append(", glazing__north: ");
		result.append(glazing__north);
		result.append(", glazing__northeast: ");
		result.append(glazing__northeast);
		result.append(", glazing__east: ");
		result.append(glazing__east);
		result.append(", glazing__southeast: ");
		result.append(glazing__southeast);
		result.append(", glazing__south: ");
		result.append(glazing__south);
		result.append(", glazing__southwest: ");
		result.append(glazing__southwest);
		result.append(", glazing__west: ");
		result.append(glazing__west);
		result.append(", glazing__northwest: ");
		result.append(glazing__northwest);
		result.append(", glazing__horizontal: ");
		result.append(glazing__horizontal);
		result.append(", glazing__coefficient: ");
		result.append(glazing__coefficient);
		result.append(", occupancy: ");
		result.append(occupancy);
		result.append(", occupants: ");
		result.append(occupants);
		result.append(", schedule: ");
		result.append(schedule);
		result.append(", air_temperature: ");
		result.append(air_temperature);
		result.append(", mass_temperature: ");
		result.append(mass_temperature);
		result.append(", temperature_change: ");
		result.append(temperature_change);
		result.append(", outdoor_temperature: ");
		result.append(outdoor_temperature);
		result.append(", Qh: ");
		result.append(qh);
		result.append(", Qs: ");
		result.append(qs);
		result.append(", Qi: ");
		result.append(qi);
		result.append(", Qz: ");
		result.append(qz);
		result.append(", hvac_mode: ");
		result.append(hvac_mode);
		result.append(", hvac__cooling__balance_temperature: ");
		result.append(hvac__cooling__balance_temperature);
		result.append(", hvac__cooling__capacity: ");
		result.append(hvac__cooling__capacity);
		result.append(", hvac__cooling__capacity_perF: ");
		result.append(hvac__cooling__capacity_perF);
		result.append(", hvac__cooling__design_temperature: ");
		result.append(hvac__cooling__design_temperature);
		result.append(", hvac__cooling__efficiency: ");
		result.append(hvac__cooling__efficiency);
		result.append(", hvac__cooling__cop: ");
		result.append(hvac__cooling__cop);
		result.append(", hvac__heating__balance_temperature: ");
		result.append(hvac__heating__balance_temperature);
		result.append(", hvac__heating__capacity: ");
		result.append(hvac__heating__capacity);
		result.append(", hvac__heating__capacity_perF: ");
		result.append(hvac__heating__capacity_perF);
		result.append(", hvac__heating__design_temperature: ");
		result.append(hvac__heating__design_temperature);
		result.append(", hvac__heating__efficiency: ");
		result.append(hvac__heating__efficiency);
		result.append(", hvac__heating__cop: ");
		result.append(hvac__heating__cop);
		result.append(", lights__capacity: ");
		result.append(lights__capacity);
		result.append(", lights__fraction: ");
		result.append(lights__fraction);
		result.append(", plugs__capacity: ");
		result.append(plugs__capacity);
		result.append(", plugs__fraction: ");
		result.append(plugs__fraction);
		result.append(", demand: ");
		result.append(demand);
		result.append(", total_load: ");
		result.append(total_load);
		result.append(", energy: ");
		result.append(energy);
		result.append(", power_factor: ");
		result.append(power_factor);
		result.append(", power: ");
		result.append(power);
		result.append(", current: ");
		result.append(current);
		result.append(", admittance: ");
		result.append(admittance);
		result.append(", hvac__demand: ");
		result.append(hvac__demand);
		result.append(", hvac__load: ");
		result.append(hvac__load);
		result.append(", hvac__energy: ");
		result.append(hvac__energy);
		result.append(", hvac__power_factor: ");
		result.append(hvac__power_factor);
		result.append(", lights__demand: ");
		result.append(lights__demand);
		result.append(", lights__load: ");
		result.append(lights__load);
		result.append(", lights__energy: ");
		result.append(lights__energy);
		result.append(", lights__power_factor: ");
		result.append(lights__power_factor);
		result.append(", lights__heatgain_fraction: ");
		result.append(lights__heatgain_fraction);
		result.append(", lights__heatgain: ");
		result.append(lights__heatgain);
		result.append(", plugs__demand: ");
		result.append(plugs__demand);
		result.append(", plugs__load: ");
		result.append(plugs__load);
		result.append(", plugs__energy: ");
		result.append(plugs__energy);
		result.append(", plugs__power_factor: ");
		result.append(plugs__power_factor);
		result.append(", plugs__heatgain_fraction: ");
		result.append(plugs__heatgain_fraction);
		result.append(", plugs__heatgain: ");
		result.append(plugs__heatgain);
		result.append(", cooling_setpoint: ");
		result.append(cooling_setpoint);
		result.append(", heating_setpoint: ");
		result.append(heating_setpoint);
		result.append(", thermostat_deadband: ");
		result.append(thermostat_deadband);
		result.append(", control__ventilation_fraction: ");
		result.append(control__ventilation_fraction);
		result.append(", control__lighting_fraction: ");
		result.append(control__lighting_fraction);
		result.append(", ACH: ");
		result.append(ach);
		result.append(')');
		return result.toString();
	}

} //OfficeImpl
