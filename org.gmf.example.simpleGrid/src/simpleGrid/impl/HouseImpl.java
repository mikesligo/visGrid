/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import java.io.IOException;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simpleGrid.House;
import simpleGrid.SimpleGridPackage;
import simpleGrid.Waterheater;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.HouseImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getSchedule_skew <em>Schedule skew</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getThermal_integrity_level <em>Thermal integrity level</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getMotor_model <em>Motor model</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getMotor_efficiency <em>Motor efficiency</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getHeating_system_type <em>Heating system type</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getHeating_COP <em>Heating COP</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getAuxiliary_strategy <em>Auxiliary strategy</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getAuxiliary_system_type <em>Auxiliary system type</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getCooling_COP <em>Cooling COP</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getWaterheater <em>Waterheater</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link simpleGrid.impl.HouseImpl#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HouseImpl extends EObjectImpl implements House {
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
	 * The default value of the '{@link #getThermal_integrity_level() <em>Thermal integrity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermal_integrity_level()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_INTEGRITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermal_integrity_level() <em>Thermal integrity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermal_integrity_level()
	 * @generated
	 * @ordered
	 */
	protected String thermal_integrity_level = THERMAL_INTEGRITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotor_model() <em>Motor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_model()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTOR_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotor_model() <em>Motor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_model()
	 * @generated
	 * @ordered
	 */
	protected String motor_model = MOTOR_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotor_efficiency() <em>Motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_efficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTOR_EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotor_efficiency() <em>Motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_efficiency()
	 * @generated
	 * @ordered
	 */
	protected String motor_efficiency = MOTOR_EFFICIENCY_EDEFAULT;

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
	 * The default value of the '{@link #getHeating_system_type() <em>Heating system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_system_type()
	 * @generated
	 * @ordered
	 */
	protected static final String HEATING_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeating_system_type() <em>Heating system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeating_system_type()
	 * @generated
	 * @ordered
	 */
	protected String heating_system_type = HEATING_SYSTEM_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getAuxiliary_strategy() <em>Auxiliary strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_strategy()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARY_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliary_strategy() <em>Auxiliary strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_strategy()
	 * @generated
	 * @ordered
	 */
	protected String auxiliary_strategy = AUXILIARY_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliary_system_type() <em>Auxiliary system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_system_type()
	 * @generated
	 * @ordered
	 */
	protected static final String AUXILIARY_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuxiliary_system_type() <em>Auxiliary system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliary_system_type()
	 * @generated
	 * @ordered
	 */
	protected String auxiliary_system_type = AUXILIARY_SYSTEM_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getWaterheater() <em>Waterheater</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterheater()
	 * @generated
	 * @ordered
	 */
	protected EList<Waterheater> waterheater;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux_heat_temperature_lockout() <em>Aux heat temperature lockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_temperature_lockout()
	 * @generated
	 * @ordered
	 */
	protected static final String AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux_heat_temperature_lockout() <em>Aux heat temperature lockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux_heat_temperature_lockout()
	 * @generated
	 * @ordered
	 */
	protected String aux_heat_temperature_lockout = AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.HOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --> 
	 * @generated NOT
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__SCHEDULE_SKEW, oldSchedule_skew, schedule_skew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAir_temperature() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__AIR_TEMPERATURE, oldAir_temperature, air_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloor_area() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__FLOOR_AREA, oldFloor_area, floor_area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_setpoint() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__COOLING_SETPOINT, oldCooling_setpoint, cooling_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_setpoint() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__HEATING_SETPOINT, oldHeating_setpoint, heating_setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermal_integrity_level() {
		return thermal_integrity_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermal_integrity_level(String newThermal_integrity_level) {
		String oldThermal_integrity_level = thermal_integrity_level;
		thermal_integrity_level = newThermal_integrity_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL, oldThermal_integrity_level, thermal_integrity_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotor_model() {
		return motor_model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor_model(String newMotor_model) {
		String oldMotor_model = motor_model;
		motor_model = newMotor_model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__MOTOR_MODEL, oldMotor_model, motor_model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotor_efficiency() {
		return motor_efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor_efficiency(String newMotor_efficiency) {
		String oldMotor_efficiency = motor_efficiency;
		motor_efficiency = newMotor_efficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__MOTOR_EFFICIENCY, oldMotor_efficiency, motor_efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMass_temperature() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__MASS_TEMPERATURE, oldMass_temperature, mass_temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_system_type() {
		return heating_system_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeating_system_type(String newHeating_system_type) {
		String oldHeating_system_type = heating_system_type;
		heating_system_type = newHeating_system_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__HEATING_SYSTEM_TYPE, oldHeating_system_type, heating_system_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeating_COP() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__HEATING_COP, oldHeating_COP, heating_COP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxiliary_strategy() {
		return auxiliary_strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliary_strategy(String newAuxiliary_strategy) {
		String oldAuxiliary_strategy = auxiliary_strategy;
		auxiliary_strategy = newAuxiliary_strategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__AUXILIARY_STRATEGY, oldAuxiliary_strategy, auxiliary_strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuxiliary_system_type() {
		return auxiliary_system_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliary_system_type(String newAuxiliary_system_type) {
		String oldAuxiliary_system_type = auxiliary_system_type;
		auxiliary_system_type = newAuxiliary_system_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE, oldAuxiliary_system_type, auxiliary_system_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCooling_COP() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__COOLING_COP, oldCooling_COP, cooling_COP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Waterheater> getWaterheater() {
		if (waterheater == null) {
			waterheater = new EObjectResolvingEList<Waterheater>(Waterheater.class, this, SimpleGridPackage.HOUSE__WATERHEATER);
		}
		return waterheater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAux_heat_temperature_lockout() {
		return aux_heat_temperature_lockout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux_heat_temperature_lockout(String newAux_heat_temperature_lockout) {
		String oldAux_heat_temperature_lockout = aux_heat_temperature_lockout;
		aux_heat_temperature_lockout = newAux_heat_temperature_lockout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT, oldAux_heat_temperature_lockout, aux_heat_temperature_lockout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleGridPackage.HOUSE__NAME:
			return getName();
		case SimpleGridPackage.HOUSE__SCHEDULE_SKEW:
			return getSchedule_skew();
		case SimpleGridPackage.HOUSE__AIR_TEMPERATURE:
			return getAir_temperature();
		case SimpleGridPackage.HOUSE__FLOOR_AREA:
			return getFloor_area();
		case SimpleGridPackage.HOUSE__COOLING_SETPOINT:
			return getCooling_setpoint();
		case SimpleGridPackage.HOUSE__HEATING_SETPOINT:
			return getHeating_setpoint();
		case SimpleGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
			return getThermal_integrity_level();
		case SimpleGridPackage.HOUSE__MOTOR_MODEL:
			return getMotor_model();
		case SimpleGridPackage.HOUSE__MOTOR_EFFICIENCY:
			return getMotor_efficiency();
		case SimpleGridPackage.HOUSE__MASS_TEMPERATURE:
			return getMass_temperature();
		case SimpleGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
			return getHeating_system_type();
		case SimpleGridPackage.HOUSE__HEATING_COP:
			return getHeating_COP();
		case SimpleGridPackage.HOUSE__AUXILIARY_STRATEGY:
			return getAuxiliary_strategy();
		case SimpleGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
			return getAuxiliary_system_type();
		case SimpleGridPackage.HOUSE__COOLING_COP:
			return getCooling_COP();
		case SimpleGridPackage.HOUSE__WATERHEATER:
			return getWaterheater();
		case SimpleGridPackage.HOUSE__PARENT:
			return getParent();
		case SimpleGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
			return getAux_heat_temperature_lockout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleGridPackage.HOUSE__NAME:
			setName((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__SCHEDULE_SKEW:
			setSchedule_skew((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__AIR_TEMPERATURE:
			setAir_temperature((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__FLOOR_AREA:
			setFloor_area((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__COOLING_SETPOINT:
			setCooling_setpoint((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__HEATING_SETPOINT:
			setHeating_setpoint((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
			setThermal_integrity_level((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__MOTOR_MODEL:
			setMotor_model((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__MOTOR_EFFICIENCY:
			setMotor_efficiency((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__MASS_TEMPERATURE:
			setMass_temperature((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
			setHeating_system_type((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__HEATING_COP:
			setHeating_COP((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__AUXILIARY_STRATEGY:
			setAuxiliary_strategy((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
			setAuxiliary_system_type((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__COOLING_COP:
			setCooling_COP((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__WATERHEATER:
			getWaterheater().clear();
			getWaterheater().addAll((Collection<? extends Waterheater>)newValue);
			return;
		case SimpleGridPackage.HOUSE__PARENT:
			setParent((String)newValue);
			return;
		case SimpleGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
			setAux_heat_temperature_lockout((String)newValue);
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
		case SimpleGridPackage.HOUSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__SCHEDULE_SKEW:
			setSchedule_skew(SCHEDULE_SKEW_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__AIR_TEMPERATURE:
			setAir_temperature(AIR_TEMPERATURE_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__FLOOR_AREA:
			setFloor_area(FLOOR_AREA_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__COOLING_SETPOINT:
			setCooling_setpoint(COOLING_SETPOINT_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__HEATING_SETPOINT:
			setHeating_setpoint(HEATING_SETPOINT_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
			setThermal_integrity_level(THERMAL_INTEGRITY_LEVEL_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__MOTOR_MODEL:
			setMotor_model(MOTOR_MODEL_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__MOTOR_EFFICIENCY:
			setMotor_efficiency(MOTOR_EFFICIENCY_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__MASS_TEMPERATURE:
			setMass_temperature(MASS_TEMPERATURE_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
			setHeating_system_type(HEATING_SYSTEM_TYPE_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__HEATING_COP:
			setHeating_COP(HEATING_COP_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__AUXILIARY_STRATEGY:
			setAuxiliary_strategy(AUXILIARY_STRATEGY_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
			setAuxiliary_system_type(AUXILIARY_SYSTEM_TYPE_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__COOLING_COP:
			setCooling_COP(COOLING_COP_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__WATERHEATER:
			getWaterheater().clear();
			return;
		case SimpleGridPackage.HOUSE__PARENT:
			setParent(PARENT_EDEFAULT);
			return;
		case SimpleGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
			setAux_heat_temperature_lockout(AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT);
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
		case SimpleGridPackage.HOUSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimpleGridPackage.HOUSE__SCHEDULE_SKEW:
			return SCHEDULE_SKEW_EDEFAULT == null ? schedule_skew != null : !SCHEDULE_SKEW_EDEFAULT.equals(schedule_skew);
		case SimpleGridPackage.HOUSE__AIR_TEMPERATURE:
			return AIR_TEMPERATURE_EDEFAULT == null ? air_temperature != null : !AIR_TEMPERATURE_EDEFAULT.equals(air_temperature);
		case SimpleGridPackage.HOUSE__FLOOR_AREA:
			return FLOOR_AREA_EDEFAULT == null ? floor_area != null : !FLOOR_AREA_EDEFAULT.equals(floor_area);
		case SimpleGridPackage.HOUSE__COOLING_SETPOINT:
			return COOLING_SETPOINT_EDEFAULT == null ? cooling_setpoint != null : !COOLING_SETPOINT_EDEFAULT.equals(cooling_setpoint);
		case SimpleGridPackage.HOUSE__HEATING_SETPOINT:
			return HEATING_SETPOINT_EDEFAULT == null ? heating_setpoint != null : !HEATING_SETPOINT_EDEFAULT.equals(heating_setpoint);
		case SimpleGridPackage.HOUSE__THERMAL_INTEGRITY_LEVEL:
			return THERMAL_INTEGRITY_LEVEL_EDEFAULT == null ? thermal_integrity_level != null : !THERMAL_INTEGRITY_LEVEL_EDEFAULT.equals(thermal_integrity_level);
		case SimpleGridPackage.HOUSE__MOTOR_MODEL:
			return MOTOR_MODEL_EDEFAULT == null ? motor_model != null : !MOTOR_MODEL_EDEFAULT.equals(motor_model);
		case SimpleGridPackage.HOUSE__MOTOR_EFFICIENCY:
			return MOTOR_EFFICIENCY_EDEFAULT == null ? motor_efficiency != null : !MOTOR_EFFICIENCY_EDEFAULT.equals(motor_efficiency);
		case SimpleGridPackage.HOUSE__MASS_TEMPERATURE:
			return MASS_TEMPERATURE_EDEFAULT == null ? mass_temperature != null : !MASS_TEMPERATURE_EDEFAULT.equals(mass_temperature);
		case SimpleGridPackage.HOUSE__HEATING_SYSTEM_TYPE:
			return HEATING_SYSTEM_TYPE_EDEFAULT == null ? heating_system_type != null : !HEATING_SYSTEM_TYPE_EDEFAULT.equals(heating_system_type);
		case SimpleGridPackage.HOUSE__HEATING_COP:
			return HEATING_COP_EDEFAULT == null ? heating_COP != null : !HEATING_COP_EDEFAULT.equals(heating_COP);
		case SimpleGridPackage.HOUSE__AUXILIARY_STRATEGY:
			return AUXILIARY_STRATEGY_EDEFAULT == null ? auxiliary_strategy != null : !AUXILIARY_STRATEGY_EDEFAULT.equals(auxiliary_strategy);
		case SimpleGridPackage.HOUSE__AUXILIARY_SYSTEM_TYPE:
			return AUXILIARY_SYSTEM_TYPE_EDEFAULT == null ? auxiliary_system_type != null : !AUXILIARY_SYSTEM_TYPE_EDEFAULT.equals(auxiliary_system_type);
		case SimpleGridPackage.HOUSE__COOLING_COP:
			return COOLING_COP_EDEFAULT == null ? cooling_COP != null : !COOLING_COP_EDEFAULT.equals(cooling_COP);
		case SimpleGridPackage.HOUSE__WATERHEATER:
			return waterheater != null && !waterheater.isEmpty();
		case SimpleGridPackage.HOUSE__PARENT:
			return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
		case SimpleGridPackage.HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT:
			return AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT == null ? aux_heat_temperature_lockout != null : !AUX_HEAT_TEMPERATURE_LOCKOUT_EDEFAULT.equals(aux_heat_temperature_lockout);
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
		result.append(", schedule_skew: ");
		result.append(schedule_skew);
		result.append(", air_temperature: ");
		result.append(air_temperature);
		result.append(", floor_area: ");
		result.append(floor_area);
		result.append(", cooling_setpoint: ");
		result.append(cooling_setpoint);
		result.append(", heating_setpoint: ");
		result.append(heating_setpoint);
		result.append(", thermal_integrity_level: ");
		result.append(thermal_integrity_level);
		result.append(", motor_model: ");
		result.append(motor_model);
		result.append(", motor_efficiency: ");
		result.append(motor_efficiency);
		result.append(", mass_temperature: ");
		result.append(mass_temperature);
		result.append(", heating_system_type: ");
		result.append(heating_system_type);
		result.append(", heating_COP: ");
		result.append(heating_COP);
		result.append(", auxiliary_strategy: ");
		result.append(auxiliary_strategy);
		result.append(", auxiliary_system_type: ");
		result.append(auxiliary_system_type);
		result.append(", cooling_COP: ");
		result.append(cooling_COP);
		result.append(", parent: ");
		result.append(parent);
		result.append(", aux_heat_temperature_lockout: ");
		result.append(aux_heat_temperature_lockout);
		result.append(')');
		return result.toString();
	}

} //HouseImpl
