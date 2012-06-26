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
import visGrid.Evcharger;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evcharger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.EvchargerImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getCharger_type <em>Charger type</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getVehicle_type <em>Vehicle type</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getState <em>State</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getP_go_home <em>Pgo home</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getP_go_work <em>Pgo work</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getWork_dist <em>Work dist</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getCharge <em>Charge</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getCharge_at_work <em>Charge at work</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getCharge_throttle <em>Charge throttle</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getDemand_profile <em>Demand profile</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.EvchargerImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvchargerImpl extends EObjectImpl implements Evcharger {
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
	 * The default value of the '{@link #getCharger_type() <em>Charger type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharger_type()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharger_type() <em>Charger type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharger_type()
	 * @generated
	 * @ordered
	 */
	protected String charger_type = CHARGER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicle_type() <em>Vehicle type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle_type()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicle_type() <em>Vehicle type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle_type()
	 * @generated
	 * @ordered
	 */
	protected String vehicle_type = VEHICLE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getP_go_home() <em>Pgo home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_go_home()
	 * @generated
	 * @ordered
	 */
	protected static final String PGO_HOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_go_home() <em>Pgo home</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_go_home()
	 * @generated
	 * @ordered
	 */
	protected String p_go_home = PGO_HOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getP_go_work() <em>Pgo work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_go_work()
	 * @generated
	 * @ordered
	 */
	protected static final String PGO_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_go_work() <em>Pgo work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_go_work()
	 * @generated
	 * @ordered
	 */
	protected String p_go_work = PGO_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWork_dist() <em>Work dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork_dist()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_DIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWork_dist() <em>Work dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork_dist()
	 * @generated
	 * @ordered
	 */
	protected String work_dist = WORK_DIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected String capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharge() <em>Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge()
	 * @generated
	 * @ordered
	 */
	protected String charge = CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharge_at_work() <em>Charge at work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge_at_work()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGE_AT_WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharge_at_work() <em>Charge at work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge_at_work()
	 * @generated
	 * @ordered
	 */
	protected String charge_at_work = CHARGE_AT_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharge_throttle() <em>Charge throttle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge_throttle()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGE_THROTTLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharge_throttle() <em>Charge throttle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharge_throttle()
	 * @generated
	 * @ordered
	 */
	protected String charge_throttle = CHARGE_THROTTLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemand_profile() <em>Demand profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand_profile()
	 * @generated
	 * @ordered
	 */
	protected static final String DEMAND_PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDemand_profile() <em>Demand profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemand_profile()
	 * @generated
	 * @ordered
	 */
	protected String demand_profile = DEMAND_PROFILE_EDEFAULT;

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
	protected EvchargerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getEvcharger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.EVCHARGER__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharger_type() {
		return charger_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharger_type(String newCharger_type) {
		String oldCharger_type = charger_type;
		charger_type = newCharger_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CHARGER_TYPE, oldCharger_type, charger_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicle_type() {
		return vehicle_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle_type(String newVehicle_type) {
		String oldVehicle_type = vehicle_type;
		vehicle_type = newVehicle_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__VEHICLE_TYPE, oldVehicle_type, vehicle_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_go_home() {
		return p_go_home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_go_home(String newP_go_home) {
		String oldP_go_home = p_go_home;
		p_go_home = newP_go_home;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__PGO_HOME, oldP_go_home, p_go_home));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_go_work() {
		return p_go_work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_go_work(String newP_go_work) {
		String oldP_go_work = p_go_work;
		p_go_work = newP_go_work;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__PGO_WORK, oldP_go_work, p_go_work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWork_dist() {
		return work_dist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork_dist(String newWork_dist) {
		String oldWork_dist = work_dist;
		work_dist = newWork_dist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__WORK_DIST, oldWork_dist, work_dist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(String newCapacity) {
		String oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharge() {
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharge(String newCharge) {
		String oldCharge = charge;
		charge = newCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CHARGE, oldCharge, charge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharge_at_work() {
		return charge_at_work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharge_at_work(String newCharge_at_work) {
		String oldCharge_at_work = charge_at_work;
		charge_at_work = newCharge_at_work;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CHARGE_AT_WORK, oldCharge_at_work, charge_at_work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharge_throttle() {
		return charge_throttle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharge_throttle(String newCharge_throttle) {
		String oldCharge_throttle = charge_throttle;
		charge_throttle = newCharge_throttle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CHARGE_THROTTLE, oldCharge_throttle, charge_throttle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDemand_profile() {
		return demand_profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemand_profile(String newDemand_profile) {
		String oldDemand_profile = demand_profile;
		demand_profile = newDemand_profile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__DEMAND_PROFILE, oldDemand_profile, demand_profile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__SHAPE, oldShape, shape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__LOAD, oldLoad, load));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__POWER, oldPower, power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__PEAK_DEMAND, oldPeak_demand, peak_demand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__HEATGAIN, oldHeatgain, heatgain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__POWER_FRACTION, oldPower_fraction, power_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CONSTANT_POWER, oldConstant_power, constant_power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CONSTANT_CURRENT, oldConstant_current, constant_current));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__CONFIGURATION, oldConfiguration, configuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.EVCHARGER__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.EVCHARGER__CONNECTION:
				return getConnection();
			case VisGridPackage.EVCHARGER__NAME:
				return getName();
			case VisGridPackage.EVCHARGER__CHARGER_TYPE:
				return getCharger_type();
			case VisGridPackage.EVCHARGER__VEHICLE_TYPE:
				return getVehicle_type();
			case VisGridPackage.EVCHARGER__STATE:
				return getState();
			case VisGridPackage.EVCHARGER__PGO_HOME:
				return getP_go_home();
			case VisGridPackage.EVCHARGER__PGO_WORK:
				return getP_go_work();
			case VisGridPackage.EVCHARGER__WORK_DIST:
				return getWork_dist();
			case VisGridPackage.EVCHARGER__CAPACITY:
				return getCapacity();
			case VisGridPackage.EVCHARGER__CHARGE:
				return getCharge();
			case VisGridPackage.EVCHARGER__CHARGE_AT_WORK:
				return getCharge_at_work();
			case VisGridPackage.EVCHARGER__CHARGE_THROTTLE:
				return getCharge_throttle();
			case VisGridPackage.EVCHARGER__DEMAND_PROFILE:
				return getDemand_profile();
			case VisGridPackage.EVCHARGER__SHAPE:
				return getShape();
			case VisGridPackage.EVCHARGER__LOAD:
				return getLoad();
			case VisGridPackage.EVCHARGER__ENERGY:
				return getEnergy();
			case VisGridPackage.EVCHARGER__POWER:
				return getPower();
			case VisGridPackage.EVCHARGER__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.EVCHARGER__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.EVCHARGER__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.EVCHARGER__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.EVCHARGER__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.EVCHARGER__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.EVCHARGER__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.EVCHARGER__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.EVCHARGER__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.EVCHARGER__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.EVCHARGER__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.EVCHARGER__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.EVCHARGER__OVERRIDE:
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
			case VisGridPackage.EVCHARGER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.EVCHARGER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CHARGER_TYPE:
				setCharger_type((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__VEHICLE_TYPE:
				setVehicle_type((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__STATE:
				setState((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__PGO_HOME:
				setP_go_home((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__PGO_WORK:
				setP_go_work((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__WORK_DIST:
				setWork_dist((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CAPACITY:
				setCapacity((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CHARGE:
				setCharge((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CHARGE_AT_WORK:
				setCharge_at_work((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CHARGE_THROTTLE:
				setCharge_throttle((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__DEMAND_PROFILE:
				setDemand_profile((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.EVCHARGER__OVERRIDE:
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
			case VisGridPackage.EVCHARGER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.EVCHARGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CHARGER_TYPE:
				setCharger_type(CHARGER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__VEHICLE_TYPE:
				setVehicle_type(VEHICLE_TYPE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__PGO_HOME:
				setP_go_home(PGO_HOME_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__PGO_WORK:
				setP_go_work(PGO_WORK_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__WORK_DIST:
				setWork_dist(WORK_DIST_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CHARGE:
				setCharge(CHARGE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CHARGE_AT_WORK:
				setCharge_at_work(CHARGE_AT_WORK_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CHARGE_THROTTLE:
				setCharge_throttle(CHARGE_THROTTLE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__DEMAND_PROFILE:
				setDemand_profile(DEMAND_PROFILE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.EVCHARGER__OVERRIDE:
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
			case VisGridPackage.EVCHARGER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.EVCHARGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.EVCHARGER__CHARGER_TYPE:
				return CHARGER_TYPE_EDEFAULT == null ? charger_type != null : !CHARGER_TYPE_EDEFAULT.equals(charger_type);
			case VisGridPackage.EVCHARGER__VEHICLE_TYPE:
				return VEHICLE_TYPE_EDEFAULT == null ? vehicle_type != null : !VEHICLE_TYPE_EDEFAULT.equals(vehicle_type);
			case VisGridPackage.EVCHARGER__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case VisGridPackage.EVCHARGER__PGO_HOME:
				return PGO_HOME_EDEFAULT == null ? p_go_home != null : !PGO_HOME_EDEFAULT.equals(p_go_home);
			case VisGridPackage.EVCHARGER__PGO_WORK:
				return PGO_WORK_EDEFAULT == null ? p_go_work != null : !PGO_WORK_EDEFAULT.equals(p_go_work);
			case VisGridPackage.EVCHARGER__WORK_DIST:
				return WORK_DIST_EDEFAULT == null ? work_dist != null : !WORK_DIST_EDEFAULT.equals(work_dist);
			case VisGridPackage.EVCHARGER__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case VisGridPackage.EVCHARGER__CHARGE:
				return CHARGE_EDEFAULT == null ? charge != null : !CHARGE_EDEFAULT.equals(charge);
			case VisGridPackage.EVCHARGER__CHARGE_AT_WORK:
				return CHARGE_AT_WORK_EDEFAULT == null ? charge_at_work != null : !CHARGE_AT_WORK_EDEFAULT.equals(charge_at_work);
			case VisGridPackage.EVCHARGER__CHARGE_THROTTLE:
				return CHARGE_THROTTLE_EDEFAULT == null ? charge_throttle != null : !CHARGE_THROTTLE_EDEFAULT.equals(charge_throttle);
			case VisGridPackage.EVCHARGER__DEMAND_PROFILE:
				return DEMAND_PROFILE_EDEFAULT == null ? demand_profile != null : !DEMAND_PROFILE_EDEFAULT.equals(demand_profile);
			case VisGridPackage.EVCHARGER__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.EVCHARGER__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.EVCHARGER__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.EVCHARGER__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.EVCHARGER__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.EVCHARGER__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.EVCHARGER__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.EVCHARGER__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.EVCHARGER__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.EVCHARGER__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.EVCHARGER__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.EVCHARGER__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.EVCHARGER__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.EVCHARGER__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.EVCHARGER__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.EVCHARGER__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.EVCHARGER__OVERRIDE:
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
		result.append(", charger_type: ");
		result.append(charger_type);
		result.append(", vehicle_type: ");
		result.append(vehicle_type);
		result.append(", state: ");
		result.append(state);
		result.append(", p_go_home: ");
		result.append(p_go_home);
		result.append(", p_go_work: ");
		result.append(p_go_work);
		result.append(", work_dist: ");
		result.append(work_dist);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", charge: ");
		result.append(charge);
		result.append(", charge_at_work: ");
		result.append(charge_at_work);
		result.append(", charge_throttle: ");
		result.append(charge_throttle);
		result.append(", demand_profile: ");
		result.append(demand_profile);
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

} //EvchargerImpl