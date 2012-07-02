/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Freezer;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freezer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.FreezerImpl#getSize <em>Size</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getRated_capacity <em>Rated capacity</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getSetpoint <em>Setpoint</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getNext_time <em>Next time</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getEvent_temp <em>Event temp</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getUA <em>UA</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getState <em>State</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.FreezerImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreezerImpl extends ConnectionImpl implements Freezer {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_capacity() <em>Rated capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_capacity()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_capacity() <em>Rated capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_capacity()
	 * @generated
	 * @ordered
	 */
	protected String rated_capacity = RATED_CAPACITY_EDEFAULT;

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
	 * The default value of the '{@link #getSetpoint() <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String SETPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetpoint() <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetpoint()
	 * @generated
	 * @ordered
	 */
	protected String setpoint = SETPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadband()
	 * @generated
	 * @ordered
	 */
	protected static final String DEADBAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadband()
	 * @generated
	 * @ordered
	 */
	protected String deadband = DEADBAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNext_time() <em>Next time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext_time()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNext_time() <em>Next time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext_time()
	 * @generated
	 * @ordered
	 */
	protected String next_time = NEXT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent_temp() <em>Event temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent_temp() <em>Event temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_temp()
	 * @generated
	 * @ordered
	 */
	protected String event_temp = EVENT_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getUA() <em>UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUA()
	 * @generated
	 * @ordered
	 */
	protected static final String UA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUA() <em>UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUA()
	 * @generated
	 * @ordered
	 */
	protected String ua = UA_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

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
	protected FreezerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getFreezer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_capacity() {
		return rated_capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_capacity(String newRated_capacity) {
		String oldRated_capacity = rated_capacity;
		rated_capacity = newRated_capacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__RATED_CAPACITY, oldRated_capacity, rated_capacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetpoint() {
		return setpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetpoint(String newSetpoint) {
		String oldSetpoint = setpoint;
		setpoint = newSetpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__SETPOINT, oldSetpoint, setpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadband() {
		return deadband;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadband(String newDeadband) {
		String oldDeadband = deadband;
		deadband = newDeadband;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__DEADBAND, oldDeadband, deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNext_time() {
		return next_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext_time(String newNext_time) {
		String oldNext_time = next_time;
		next_time = newNext_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__NEXT_TIME, oldNext_time, next_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent_temp() {
		return event_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent_temp(String newEvent_temp) {
		String oldEvent_temp = event_temp;
		event_temp = newEvent_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__EVENT_TEMP, oldEvent_temp, event_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUA() {
		return ua;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUA(String newUA) {
		String oldUA = ua;
		ua = newUA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__UA, oldUA, ua));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShape() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnergy() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__ENERGY, oldEnergy, energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeak_demand() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__PEAK_DEMAND, oldPeak_demand, peak_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__HEATGAIN, oldHeatgain, heatgain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeatgain_fraction() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_fraction() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance_fraction() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_fraction() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__POWER_FRACTION, oldPower_fraction, power_fraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_factor() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__POWER_FACTOR, oldPower_factor, power_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__CONSTANT_POWER, oldConstant_power, constant_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__CONSTANT_CURRENT, oldConstant_current, constant_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_admittance() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_factor() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfiguration() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverride() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREEZER__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.FREEZER__SIZE:
				return getSize();
			case VisGridPackage.FREEZER__RATED_CAPACITY:
				return getRated_capacity();
			case VisGridPackage.FREEZER__TEMPERATURE:
				return getTemperature();
			case VisGridPackage.FREEZER__SETPOINT:
				return getSetpoint();
			case VisGridPackage.FREEZER__DEADBAND:
				return getDeadband();
			case VisGridPackage.FREEZER__NEXT_TIME:
				return getNext_time();
			case VisGridPackage.FREEZER__OUTPUT:
				return getOutput();
			case VisGridPackage.FREEZER__EVENT_TEMP:
				return getEvent_temp();
			case VisGridPackage.FREEZER__UA:
				return getUA();
			case VisGridPackage.FREEZER__STATE:
				return getState();
			case VisGridPackage.FREEZER__SHAPE:
				return getShape();
			case VisGridPackage.FREEZER__LOAD:
				return getLoad();
			case VisGridPackage.FREEZER__ENERGY:
				return getEnergy();
			case VisGridPackage.FREEZER__POWER:
				return getPower();
			case VisGridPackage.FREEZER__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.FREEZER__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.FREEZER__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.FREEZER__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.FREEZER__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.FREEZER__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.FREEZER__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.FREEZER__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.FREEZER__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.FREEZER__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.FREEZER__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.FREEZER__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.FREEZER__OVERRIDE:
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
			case VisGridPackage.FREEZER__SIZE:
				setSize((String)newValue);
				return;
			case VisGridPackage.FREEZER__RATED_CAPACITY:
				setRated_capacity((String)newValue);
				return;
			case VisGridPackage.FREEZER__TEMPERATURE:
				setTemperature((String)newValue);
				return;
			case VisGridPackage.FREEZER__SETPOINT:
				setSetpoint((String)newValue);
				return;
			case VisGridPackage.FREEZER__DEADBAND:
				setDeadband((String)newValue);
				return;
			case VisGridPackage.FREEZER__NEXT_TIME:
				setNext_time((String)newValue);
				return;
			case VisGridPackage.FREEZER__OUTPUT:
				setOutput((String)newValue);
				return;
			case VisGridPackage.FREEZER__EVENT_TEMP:
				setEvent_temp((String)newValue);
				return;
			case VisGridPackage.FREEZER__UA:
				setUA((String)newValue);
				return;
			case VisGridPackage.FREEZER__STATE:
				setState((String)newValue);
				return;
			case VisGridPackage.FREEZER__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.FREEZER__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.FREEZER__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.FREEZER__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.FREEZER__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.FREEZER__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.FREEZER__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.FREEZER__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.FREEZER__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.FREEZER__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.FREEZER__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.FREEZER__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.FREEZER__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.FREEZER__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.FREEZER__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.FREEZER__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.FREEZER__OVERRIDE:
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
			case VisGridPackage.FREEZER__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__RATED_CAPACITY:
				setRated_capacity(RATED_CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__SETPOINT:
				setSetpoint(SETPOINT_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__DEADBAND:
				setDeadband(DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__NEXT_TIME:
				setNext_time(NEXT_TIME_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__EVENT_TEMP:
				setEvent_temp(EVENT_TEMP_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__UA:
				setUA(UA_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.FREEZER__OVERRIDE:
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
			case VisGridPackage.FREEZER__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case VisGridPackage.FREEZER__RATED_CAPACITY:
				return RATED_CAPACITY_EDEFAULT == null ? rated_capacity != null : !RATED_CAPACITY_EDEFAULT.equals(rated_capacity);
			case VisGridPackage.FREEZER__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? temperature != null : !TEMPERATURE_EDEFAULT.equals(temperature);
			case VisGridPackage.FREEZER__SETPOINT:
				return SETPOINT_EDEFAULT == null ? setpoint != null : !SETPOINT_EDEFAULT.equals(setpoint);
			case VisGridPackage.FREEZER__DEADBAND:
				return DEADBAND_EDEFAULT == null ? deadband != null : !DEADBAND_EDEFAULT.equals(deadband);
			case VisGridPackage.FREEZER__NEXT_TIME:
				return NEXT_TIME_EDEFAULT == null ? next_time != null : !NEXT_TIME_EDEFAULT.equals(next_time);
			case VisGridPackage.FREEZER__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case VisGridPackage.FREEZER__EVENT_TEMP:
				return EVENT_TEMP_EDEFAULT == null ? event_temp != null : !EVENT_TEMP_EDEFAULT.equals(event_temp);
			case VisGridPackage.FREEZER__UA:
				return UA_EDEFAULT == null ? ua != null : !UA_EDEFAULT.equals(ua);
			case VisGridPackage.FREEZER__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case VisGridPackage.FREEZER__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.FREEZER__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.FREEZER__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.FREEZER__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.FREEZER__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.FREEZER__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.FREEZER__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.FREEZER__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.FREEZER__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.FREEZER__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.FREEZER__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.FREEZER__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.FREEZER__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.FREEZER__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.FREEZER__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.FREEZER__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.FREEZER__OVERRIDE:
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
		result.append(" (size: ");
		result.append(size);
		result.append(", rated_capacity: ");
		result.append(rated_capacity);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", setpoint: ");
		result.append(setpoint);
		result.append(", deadband: ");
		result.append(deadband);
		result.append(", next_time: ");
		result.append(next_time);
		result.append(", output: ");
		result.append(output);
		result.append(", event_temp: ");
		result.append(event_temp);
		result.append(", UA: ");
		result.append(ua);
		result.append(", state: ");
		result.append(state);
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

} //FreezerImpl
