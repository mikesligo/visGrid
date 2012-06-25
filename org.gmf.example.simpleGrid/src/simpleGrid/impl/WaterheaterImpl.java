/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import simpleGrid.SimpleGridPackage;
import simpleGrid.Waterheater;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waterheater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getTank_volume <em>Tank volume</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getTank_setpoint <em>Tank setpoint</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getTank_UA <em>Tank UA</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getSchedule_skew <em>Schedule skew</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getDemand_skew <em>Demand skew</em>}</li>
 *   <li>{@link simpleGrid.impl.WaterheaterImpl#getHeating_element_capacity <em>Heating element capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterheaterImpl extends EObjectImpl implements Waterheater {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_volume() <em>Tank volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_volume()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_volume() <em>Tank volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_volume()
	 * @generated
	 * @ordered
	 */
	protected String tank_volume = TANK_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_setpoint() <em>Tank setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_setpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_setpoint() <em>Tank setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_setpoint()
	 * @generated
	 * @ordered
	 */
	protected String tank_setpoint = TANK_SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected String temperature = TEMPERATURE_EDEFAULT;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTank_UA() <em>Tank UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_UA()
	 * @generated
	 * @ordered
	 */
	protected static final String TANK_UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTank_UA() <em>Tank UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTank_UA()
	 * @generated
	 * @ordered
	 */
	protected String tank_UA = TANK_UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedule_skew() <em>Schedule skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule_skew()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedule_skew() <em>Schedule skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule_skew()
	 * @generated
	 * @ordered
	 */
	protected String schedule_skew = SCHEDULE_SKEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemand_skew() <em>Demand skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand_skew()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMAND_SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemand_skew() <em>Demand skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand_skew()
	 * @generated
	 * @ordered
	 */
	protected String demand_skew = DEMAND_SKEW_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeating_element_capacity() <em>Heating element capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_element_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_ELEMENT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_element_capacity() <em>Heating element capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_element_capacity()
	 * @generated
	 * @ordered
	 */
	protected String heating_element_capacity = HEATING_ELEMENT_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterheaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.WATERHEATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_volume() {
		return tank_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_volume(String newTank_volume) {
		String oldTank_volume = tank_volume;
		tank_volume = newTank_volume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__TANK_VOLUME, oldTank_volume, tank_volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_setpoint() {
		return tank_setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_setpoint(String newTank_setpoint) {
		String oldTank_setpoint = tank_setpoint;
		tank_setpoint = newTank_setpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__TANK_SETPOINT, oldTank_setpoint, tank_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(String newTemperature) {
		String oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermostat_deadband() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__THERMOSTAT_DEADBAND, oldThermostat_deadband, thermostat_deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTank_UA() {
		return tank_UA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTank_UA(String newTank_UA) {
		String oldTank_UA = tank_UA;
		tank_UA = newTank_UA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__TANK_UA, oldTank_UA, tank_UA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedule_skew() {
		return schedule_skew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule_skew(String newSchedule_skew) {
		String oldSchedule_skew = schedule_skew;
		schedule_skew = newSchedule_skew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__SCHEDULE_SKEW, oldSchedule_skew, schedule_skew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemand_skew() {
		return demand_skew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemand_skew(String newDemand_skew) {
		String oldDemand_skew = demand_skew;
		demand_skew = newDemand_skew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__DEMAND_SKEW, oldDemand_skew, demand_skew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_element_capacity() {
		return heating_element_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_element_capacity(String newHeating_element_capacity) {
		String oldHeating_element_capacity = heating_element_capacity;
		heating_element_capacity = newHeating_element_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY, oldHeating_element_capacity, heating_element_capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.WATERHEATER__NAME:
				return getName();
			case SimpleGridPackage.WATERHEATER__TANK_VOLUME:
				return getTank_volume();
			case SimpleGridPackage.WATERHEATER__TANK_SETPOINT:
				return getTank_setpoint();
			case SimpleGridPackage.WATERHEATER__TEMPERATURE:
				return getTemperature();
			case SimpleGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				return getThermostat_deadband();
			case SimpleGridPackage.WATERHEATER__LOCATION:
				return getLocation();
			case SimpleGridPackage.WATERHEATER__TANK_UA:
				return getTank_UA();
			case SimpleGridPackage.WATERHEATER__SCHEDULE_SKEW:
				return getSchedule_skew();
			case SimpleGridPackage.WATERHEATER__DEMAND_SKEW:
				return getDemand_skew();
			case SimpleGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				return getHeating_element_capacity();
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
			case SimpleGridPackage.WATERHEATER__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__TANK_VOLUME:
				setTank_volume((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__TANK_SETPOINT:
				setTank_setpoint((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__TEMPERATURE:
				setTemperature((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				setThermostat_deadband((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__LOCATION:
				setLocation((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__TANK_UA:
				setTank_UA((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__SCHEDULE_SKEW:
				setSchedule_skew((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__DEMAND_SKEW:
				setDemand_skew((String)newValue);
				return;
			case SimpleGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				setHeating_element_capacity((String)newValue);
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
			case SimpleGridPackage.WATERHEATER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__TANK_VOLUME:
				setTank_volume(TANK_VOLUME_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__TANK_SETPOINT:
				setTank_setpoint(TANK_SETPOINT_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				setThermostat_deadband(THERMOSTAT_DEADBAND_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__TANK_UA:
				setTank_UA(TANK_UA_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__SCHEDULE_SKEW:
				setSchedule_skew(SCHEDULE_SKEW_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__DEMAND_SKEW:
				setDemand_skew(DEMAND_SKEW_EDEFAULT);
				return;
			case SimpleGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				setHeating_element_capacity(HEATING_ELEMENT_CAPACITY_EDEFAULT);
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
			case SimpleGridPackage.WATERHEATER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.WATERHEATER__TANK_VOLUME:
				return TANK_VOLUME_EDEFAULT == null ? tank_volume != null : !TANK_VOLUME_EDEFAULT.equals(tank_volume);
			case SimpleGridPackage.WATERHEATER__TANK_SETPOINT:
				return TANK_SETPOINT_EDEFAULT == null ? tank_setpoint != null : !TANK_SETPOINT_EDEFAULT.equals(tank_setpoint);
			case SimpleGridPackage.WATERHEATER__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case SimpleGridPackage.WATERHEATER__THERMOSTAT_DEADBAND:
				return THERMOSTAT_DEADBAND_EDEFAULT == null ? thermostat_deadband != null : !THERMOSTAT_DEADBAND_EDEFAULT.equals(thermostat_deadband);
			case SimpleGridPackage.WATERHEATER__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case SimpleGridPackage.WATERHEATER__TANK_UA:
				return TANK_UA_EDEFAULT == null ? tank_UA != null : !TANK_UA_EDEFAULT.equals(tank_UA);
			case SimpleGridPackage.WATERHEATER__SCHEDULE_SKEW:
				return SCHEDULE_SKEW_EDEFAULT == null ? schedule_skew != null : !SCHEDULE_SKEW_EDEFAULT.equals(schedule_skew);
			case SimpleGridPackage.WATERHEATER__DEMAND_SKEW:
				return DEMAND_SKEW_EDEFAULT == null ? demand_skew != null : !DEMAND_SKEW_EDEFAULT.equals(demand_skew);
			case SimpleGridPackage.WATERHEATER__HEATING_ELEMENT_CAPACITY:
				return HEATING_ELEMENT_CAPACITY_EDEFAULT == null ? heating_element_capacity != null : !HEATING_ELEMENT_CAPACITY_EDEFAULT.equals(heating_element_capacity);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", tank_volume: ");
		result.append(tank_volume);
		result.append(", tank_setpoint: ");
		result.append(tank_setpoint);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", thermostat_deadband: ");
		result.append(thermostat_deadband);
		result.append(", location: ");
		result.append(location);
		result.append(", tank_UA: ");
		result.append(tank_UA);
		result.append(", schedule_skew: ");
		result.append(schedule_skew);
		result.append(", demand_skew: ");
		result.append(demand_skew);
		result.append(", heating_element_capacity: ");
		result.append(heating_element_capacity);
		result.append(')');
		return result.toString();
	}

} //WaterheaterImpl
