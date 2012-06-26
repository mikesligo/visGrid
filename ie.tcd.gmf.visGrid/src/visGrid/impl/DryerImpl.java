/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import visGrid.Connections;
import visGrid.Dryer;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dryer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.DryerImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getMotor_power <em>Motor power</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getCoil_power <em>Coil power</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getCircuit_split <em>Circuit split</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getStall_voltage <em>Stall voltage</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getStart_voltage <em>Start voltage</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getStall_impedance <em>Stall impedance</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getTrip_delay <em>Trip delay</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getReset_delay <em>Reset delay</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getState <em>State</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.DryerImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DryerImpl extends EObjectImpl implements Dryer {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> connection;

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
	 * The default value of the '{@link #getMotor_power() <em>Motor power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_power()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTOR_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotor_power() <em>Motor power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor_power()
	 * @generated
	 * @ordered
	 */
	protected String motor_power = MOTOR_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoil_power() <em>Coil power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoil_power()
	 * @generated
	 * @ordered
	 */
	protected static final String COIL_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoil_power() <em>Coil power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoil_power()
	 * @generated
	 * @ordered
	 */
	protected String coil_power = COIL_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCircuit_split() <em>Circuit split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit_split()
	 * @generated
	 * @ordered
	 */
	protected static final String CIRCUIT_SPLIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCircuit_split() <em>Circuit split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit_split()
	 * @generated
	 * @ordered
	 */
	protected String circuit_split = CIRCUIT_SPLIT_EDEFAULT;

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
	 * The default value of the '{@link #getQueue() <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected String queue = QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStall_voltage() <em>Stall voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStall_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String STALL_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStall_voltage() <em>Stall voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStall_voltage()
	 * @generated
	 * @ordered
	 */
	protected String stall_voltage = STALL_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart_voltage() <em>Start voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String START_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart_voltage() <em>Start voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_voltage()
	 * @generated
	 * @ordered
	 */
	protected String start_voltage = START_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStall_impedance() <em>Stall impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStall_impedance()
	 * @generated
	 * @ordered
	 */
	protected static final String STALL_IMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStall_impedance() <em>Stall impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStall_impedance()
	 * @generated
	 * @ordered
	 */
	protected String stall_impedance = STALL_IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrip_delay() <em>Trip delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrip_delay()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIP_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrip_delay() <em>Trip delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrip_delay()
	 * @generated
	 * @ordered
	 */
	protected String trip_delay = TRIP_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReset_delay() <em>Reset delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset_delay()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReset_delay() <em>Reset delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset_delay()
	 * @generated
	 * @ordered
	 */
	protected String reset_delay = RESET_DELAY_EDEFAULT;

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
	protected DryerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getDryer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.DRYER__CONNECTION);
		}
		return connection;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotor_power() {
		return motor_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotor_power(String newMotor_power) {
		String oldMotor_power = motor_power;
		motor_power = newMotor_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__MOTOR_POWER, oldMotor_power, motor_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoil_power() {
		return coil_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoil_power(String newCoil_power) {
		String oldCoil_power = coil_power;
		coil_power = newCoil_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__COIL_POWER, oldCoil_power, coil_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCircuit_split() {
		return circuit_split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit_split(String newCircuit_split) {
		String oldCircuit_split = circuit_split;
		circuit_split = newCircuit_split;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__CIRCUIT_SPLIT, oldCircuit_split, circuit_split));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemand() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__DEMAND, oldDemand, demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueue(String newQueue) {
		String oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__QUEUE, oldQueue, queue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStall_voltage() {
		return stall_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStall_voltage(String newStall_voltage) {
		String oldStall_voltage = stall_voltage;
		stall_voltage = newStall_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__STALL_VOLTAGE, oldStall_voltage, stall_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStart_voltage() {
		return start_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_voltage(String newStart_voltage) {
		String oldStart_voltage = start_voltage;
		start_voltage = newStart_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__START_VOLTAGE, oldStart_voltage, start_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStall_impedance() {
		return stall_impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStall_impedance(String newStall_impedance) {
		String oldStall_impedance = stall_impedance;
		stall_impedance = newStall_impedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__STALL_IMPEDANCE, oldStall_impedance, stall_impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrip_delay() {
		return trip_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrip_delay(String newTrip_delay) {
		String oldTrip_delay = trip_delay;
		trip_delay = newTrip_delay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__TRIP_DELAY, oldTrip_delay, trip_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReset_delay() {
		return reset_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset_delay(String newReset_delay) {
		String oldReset_delay = reset_delay;
		reset_delay = newReset_delay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__RESET_DELAY, oldReset_delay, reset_delay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__SHAPE, oldShape, shape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__LOAD, oldLoad, load));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__POWER, oldPower, power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__PEAK_DEMAND, oldPeak_demand, peak_demand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__HEATGAIN, oldHeatgain, heatgain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__POWER_FRACTION, oldPower_fraction, power_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__CONSTANT_POWER, oldConstant_power, constant_power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__CONSTANT_CURRENT, oldConstant_current, constant_current));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__CONFIGURATION, oldConfiguration, configuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DRYER__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.DRYER__CONNECTION:
				return getConnection();
			case VisGridPackage.DRYER__NAME:
				return getName();
			case VisGridPackage.DRYER__MOTOR_POWER:
				return getMotor_power();
			case VisGridPackage.DRYER__COIL_POWER:
				return getCoil_power();
			case VisGridPackage.DRYER__CIRCUIT_SPLIT:
				return getCircuit_split();
			case VisGridPackage.DRYER__DEMAND:
				return getDemand();
			case VisGridPackage.DRYER__QUEUE:
				return getQueue();
			case VisGridPackage.DRYER__STALL_VOLTAGE:
				return getStall_voltage();
			case VisGridPackage.DRYER__START_VOLTAGE:
				return getStart_voltage();
			case VisGridPackage.DRYER__STALL_IMPEDANCE:
				return getStall_impedance();
			case VisGridPackage.DRYER__TRIP_DELAY:
				return getTrip_delay();
			case VisGridPackage.DRYER__RESET_DELAY:
				return getReset_delay();
			case VisGridPackage.DRYER__STATE:
				return getState();
			case VisGridPackage.DRYER__SHAPE:
				return getShape();
			case VisGridPackage.DRYER__LOAD:
				return getLoad();
			case VisGridPackage.DRYER__ENERGY:
				return getEnergy();
			case VisGridPackage.DRYER__POWER:
				return getPower();
			case VisGridPackage.DRYER__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.DRYER__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.DRYER__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.DRYER__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.DRYER__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.DRYER__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.DRYER__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.DRYER__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.DRYER__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.DRYER__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.DRYER__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.DRYER__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.DRYER__OVERRIDE:
				return getOverride();
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
			case VisGridPackage.DRYER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.DRYER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.DRYER__MOTOR_POWER:
				setMotor_power((String)newValue);
				return;
			case VisGridPackage.DRYER__COIL_POWER:
				setCoil_power((String)newValue);
				return;
			case VisGridPackage.DRYER__CIRCUIT_SPLIT:
				setCircuit_split((String)newValue);
				return;
			case VisGridPackage.DRYER__DEMAND:
				setDemand((String)newValue);
				return;
			case VisGridPackage.DRYER__QUEUE:
				setQueue((String)newValue);
				return;
			case VisGridPackage.DRYER__STALL_VOLTAGE:
				setStall_voltage((String)newValue);
				return;
			case VisGridPackage.DRYER__START_VOLTAGE:
				setStart_voltage((String)newValue);
				return;
			case VisGridPackage.DRYER__STALL_IMPEDANCE:
				setStall_impedance((String)newValue);
				return;
			case VisGridPackage.DRYER__TRIP_DELAY:
				setTrip_delay((String)newValue);
				return;
			case VisGridPackage.DRYER__RESET_DELAY:
				setReset_delay((String)newValue);
				return;
			case VisGridPackage.DRYER__STATE:
				setState((String)newValue);
				return;
			case VisGridPackage.DRYER__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.DRYER__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.DRYER__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.DRYER__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.DRYER__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.DRYER__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.DRYER__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.DRYER__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.DRYER__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.DRYER__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.DRYER__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.DRYER__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.DRYER__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.DRYER__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.DRYER__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.DRYER__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.DRYER__OVERRIDE:
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
			case VisGridPackage.DRYER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.DRYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.DRYER__MOTOR_POWER:
				setMotor_power(MOTOR_POWER_EDEFAULT);
				return;
			case VisGridPackage.DRYER__COIL_POWER:
				setCoil_power(COIL_POWER_EDEFAULT);
				return;
			case VisGridPackage.DRYER__CIRCUIT_SPLIT:
				setCircuit_split(CIRCUIT_SPLIT_EDEFAULT);
				return;
			case VisGridPackage.DRYER__DEMAND:
				setDemand(DEMAND_EDEFAULT);
				return;
			case VisGridPackage.DRYER__QUEUE:
				setQueue(QUEUE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__STALL_VOLTAGE:
				setStall_voltage(STALL_VOLTAGE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__START_VOLTAGE:
				setStart_voltage(START_VOLTAGE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__STALL_IMPEDANCE:
				setStall_impedance(STALL_IMPEDANCE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__TRIP_DELAY:
				setTrip_delay(TRIP_DELAY_EDEFAULT);
				return;
			case VisGridPackage.DRYER__RESET_DELAY:
				setReset_delay(RESET_DELAY_EDEFAULT);
				return;
			case VisGridPackage.DRYER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.DRYER__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.DRYER__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.DRYER__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.DRYER__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.DRYER__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.DRYER__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.DRYER__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.DRYER__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.DRYER__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.DRYER__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.DRYER__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.DRYER__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.DRYER__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.DRYER__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.DRYER__OVERRIDE:
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
			case VisGridPackage.DRYER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.DRYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.DRYER__MOTOR_POWER:
				return MOTOR_POWER_EDEFAULT == null ? motor_power != null : !MOTOR_POWER_EDEFAULT.equals(motor_power);
			case VisGridPackage.DRYER__COIL_POWER:
				return COIL_POWER_EDEFAULT == null ? coil_power != null : !COIL_POWER_EDEFAULT.equals(coil_power);
			case VisGridPackage.DRYER__CIRCUIT_SPLIT:
				return CIRCUIT_SPLIT_EDEFAULT == null ? circuit_split != null : !CIRCUIT_SPLIT_EDEFAULT.equals(circuit_split);
			case VisGridPackage.DRYER__DEMAND:
				return DEMAND_EDEFAULT == null ? demand != null : !DEMAND_EDEFAULT.equals(demand);
			case VisGridPackage.DRYER__QUEUE:
				return QUEUE_EDEFAULT == null ? queue != null : !QUEUE_EDEFAULT.equals(queue);
			case VisGridPackage.DRYER__STALL_VOLTAGE:
				return STALL_VOLTAGE_EDEFAULT == null ? stall_voltage != null : !STALL_VOLTAGE_EDEFAULT.equals(stall_voltage);
			case VisGridPackage.DRYER__START_VOLTAGE:
				return START_VOLTAGE_EDEFAULT == null ? start_voltage != null : !START_VOLTAGE_EDEFAULT.equals(start_voltage);
			case VisGridPackage.DRYER__STALL_IMPEDANCE:
				return STALL_IMPEDANCE_EDEFAULT == null ? stall_impedance != null : !STALL_IMPEDANCE_EDEFAULT.equals(stall_impedance);
			case VisGridPackage.DRYER__TRIP_DELAY:
				return TRIP_DELAY_EDEFAULT == null ? trip_delay != null : !TRIP_DELAY_EDEFAULT.equals(trip_delay);
			case VisGridPackage.DRYER__RESET_DELAY:
				return RESET_DELAY_EDEFAULT == null ? reset_delay != null : !RESET_DELAY_EDEFAULT.equals(reset_delay);
			case VisGridPackage.DRYER__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case VisGridPackage.DRYER__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.DRYER__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.DRYER__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.DRYER__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.DRYER__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.DRYER__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.DRYER__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.DRYER__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.DRYER__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.DRYER__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.DRYER__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.DRYER__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.DRYER__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.DRYER__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.DRYER__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.DRYER__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.DRYER__OVERRIDE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", motor_power: ");
		result.append(motor_power);
		result.append(", coil_power: ");
		result.append(coil_power);
		result.append(", circuit_split: ");
		result.append(circuit_split);
		result.append(", demand: ");
		result.append(demand);
		result.append(", queue: ");
		result.append(queue);
		result.append(", stall_voltage: ");
		result.append(stall_voltage);
		result.append(", start_voltage: ");
		result.append(start_voltage);
		result.append(", stall_impedance: ");
		result.append(stall_impedance);
		result.append(", trip_delay: ");
		result.append(trip_delay);
		result.append(", reset_delay: ");
		result.append(reset_delay);
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

} //DryerImpl