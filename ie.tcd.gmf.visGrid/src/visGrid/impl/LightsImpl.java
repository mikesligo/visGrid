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

import visGrid.Lights;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lights</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.LightsImpl#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getInstalled_power <em>Installed power</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getPower_density <em>Power density</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getCurtailment <em>Curtailment</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.LightsImpl#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LightsImpl extends ConnectionImpl implements Lights {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected String placement = PLACEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstalled_power() <em>Installed power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalled_power()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALLED_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstalled_power() <em>Installed power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalled_power()
	 * @generated
	 * @ordered
	 */
	protected String installed_power = INSTALLED_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_density() <em>Power density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_density()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_DENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_density() <em>Power density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_density()
	 * @generated
	 * @ordered
	 */
	protected String power_density = POWER_DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurtailment() <em>Curtailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailment()
	 * @generated
	 * @ordered
	 */
	protected static final String CURTAILMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurtailment() <em>Curtailment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtailment()
	 * @generated
	 * @ordered
	 */
	protected String curtailment = CURTAILMENT_EDEFAULT;

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
	protected LightsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getLights();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(String newPlacement) {
		String oldPlacement = placement;
		placement = newPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__PLACEMENT, oldPlacement, placement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstalled_power() {
		return installed_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstalled_power(String newInstalled_power) {
		String oldInstalled_power = installed_power;
		installed_power = newInstalled_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__INSTALLED_POWER, oldInstalled_power, installed_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_density() {
		return power_density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_density(String newPower_density) {
		String oldPower_density = power_density;
		power_density = newPower_density;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__POWER_DENSITY, oldPower_density, power_density));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurtailment() {
		return curtailment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurtailment(String newCurtailment) {
		String oldCurtailment = curtailment;
		curtailment = newCurtailment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__CURTAILMENT, oldCurtailment, curtailment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__DEMAND, oldDemand, demand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__SHAPE, oldShape, shape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__LOAD, oldLoad, load));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__POWER, oldPower, power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__PEAK_DEMAND, oldPeak_demand, peak_demand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__HEATGAIN, oldHeatgain, heatgain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__HEATGAIN_FRACTION, oldHeatgain_fraction, heatgain_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__CURRENT_FRACTION, oldCurrent_fraction, current_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__IMPEDANCE_FRACTION, oldImpedance_fraction, impedance_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__POWER_FRACTION, oldPower_fraction, power_fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__POWER_FACTOR, oldPower_factor, power_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__CONSTANT_POWER, oldConstant_power, constant_power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__CONSTANT_CURRENT, oldConstant_current, constant_current));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__CONSTANT_ADMITTANCE, oldConstant_admittance, constant_admittance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__VOLTAGE_FACTOR, oldVoltage_factor, voltage_factor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__CONFIGURATION, oldConfiguration, configuration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LIGHTS__OVERRIDE, oldOverride, override));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.LIGHTS__TYPE:
				return getType();
			case VisGridPackage.LIGHTS__PLACEMENT:
				return getPlacement();
			case VisGridPackage.LIGHTS__INSTALLED_POWER:
				return getInstalled_power();
			case VisGridPackage.LIGHTS__POWER_DENSITY:
				return getPower_density();
			case VisGridPackage.LIGHTS__CURTAILMENT:
				return getCurtailment();
			case VisGridPackage.LIGHTS__DEMAND:
				return getDemand();
			case VisGridPackage.LIGHTS__SHAPE:
				return getShape();
			case VisGridPackage.LIGHTS__LOAD:
				return getLoad();
			case VisGridPackage.LIGHTS__ENERGY:
				return getEnergy();
			case VisGridPackage.LIGHTS__POWER:
				return getPower();
			case VisGridPackage.LIGHTS__PEAK_DEMAND:
				return getPeak_demand();
			case VisGridPackage.LIGHTS__HEATGAIN:
				return getHeatgain();
			case VisGridPackage.LIGHTS__HEATGAIN_FRACTION:
				return getHeatgain_fraction();
			case VisGridPackage.LIGHTS__CURRENT_FRACTION:
				return getCurrent_fraction();
			case VisGridPackage.LIGHTS__IMPEDANCE_FRACTION:
				return getImpedance_fraction();
			case VisGridPackage.LIGHTS__POWER_FRACTION:
				return getPower_fraction();
			case VisGridPackage.LIGHTS__POWER_FACTOR:
				return getPower_factor();
			case VisGridPackage.LIGHTS__CONSTANT_POWER:
				return getConstant_power();
			case VisGridPackage.LIGHTS__CONSTANT_CURRENT:
				return getConstant_current();
			case VisGridPackage.LIGHTS__CONSTANT_ADMITTANCE:
				return getConstant_admittance();
			case VisGridPackage.LIGHTS__VOLTAGE_FACTOR:
				return getVoltage_factor();
			case VisGridPackage.LIGHTS__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.LIGHTS__OVERRIDE:
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
			case VisGridPackage.LIGHTS__TYPE:
				setType((String)newValue);
				return;
			case VisGridPackage.LIGHTS__PLACEMENT:
				setPlacement((String)newValue);
				return;
			case VisGridPackage.LIGHTS__INSTALLED_POWER:
				setInstalled_power((String)newValue);
				return;
			case VisGridPackage.LIGHTS__POWER_DENSITY:
				setPower_density((String)newValue);
				return;
			case VisGridPackage.LIGHTS__CURTAILMENT:
				setCurtailment((String)newValue);
				return;
			case VisGridPackage.LIGHTS__DEMAND:
				setDemand((String)newValue);
				return;
			case VisGridPackage.LIGHTS__SHAPE:
				setShape((String)newValue);
				return;
			case VisGridPackage.LIGHTS__LOAD:
				setLoad((String)newValue);
				return;
			case VisGridPackage.LIGHTS__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.LIGHTS__POWER:
				setPower((String)newValue);
				return;
			case VisGridPackage.LIGHTS__PEAK_DEMAND:
				setPeak_demand((String)newValue);
				return;
			case VisGridPackage.LIGHTS__HEATGAIN:
				setHeatgain((String)newValue);
				return;
			case VisGridPackage.LIGHTS__HEATGAIN_FRACTION:
				setHeatgain_fraction((String)newValue);
				return;
			case VisGridPackage.LIGHTS__CURRENT_FRACTION:
				setCurrent_fraction((String)newValue);
				return;
			case VisGridPackage.LIGHTS__IMPEDANCE_FRACTION:
				setImpedance_fraction((String)newValue);
				return;
			case VisGridPackage.LIGHTS__POWER_FRACTION:
				setPower_fraction((String)newValue);
				return;
			case VisGridPackage.LIGHTS__POWER_FACTOR:
				setPower_factor((String)newValue);
				return;
			case VisGridPackage.LIGHTS__CONSTANT_POWER:
				setConstant_power((String)newValue);
				return;
			case VisGridPackage.LIGHTS__CONSTANT_CURRENT:
				setConstant_current((String)newValue);
				return;
			case VisGridPackage.LIGHTS__CONSTANT_ADMITTANCE:
				setConstant_admittance((String)newValue);
				return;
			case VisGridPackage.LIGHTS__VOLTAGE_FACTOR:
				setVoltage_factor((String)newValue);
				return;
			case VisGridPackage.LIGHTS__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.LIGHTS__OVERRIDE:
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
			case VisGridPackage.LIGHTS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__PLACEMENT:
				setPlacement(PLACEMENT_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__INSTALLED_POWER:
				setInstalled_power(INSTALLED_POWER_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__POWER_DENSITY:
				setPower_density(POWER_DENSITY_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__CURTAILMENT:
				setCurtailment(CURTAILMENT_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__DEMAND:
				setDemand(DEMAND_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__PEAK_DEMAND:
				setPeak_demand(PEAK_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__HEATGAIN:
				setHeatgain(HEATGAIN_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__HEATGAIN_FRACTION:
				setHeatgain_fraction(HEATGAIN_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__CURRENT_FRACTION:
				setCurrent_fraction(CURRENT_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__IMPEDANCE_FRACTION:
				setImpedance_fraction(IMPEDANCE_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__POWER_FRACTION:
				setPower_fraction(POWER_FRACTION_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__POWER_FACTOR:
				setPower_factor(POWER_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__CONSTANT_POWER:
				setConstant_power(CONSTANT_POWER_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__CONSTANT_CURRENT:
				setConstant_current(CONSTANT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__CONSTANT_ADMITTANCE:
				setConstant_admittance(CONSTANT_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__VOLTAGE_FACTOR:
				setVoltage_factor(VOLTAGE_FACTOR_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.LIGHTS__OVERRIDE:
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
			case VisGridPackage.LIGHTS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VisGridPackage.LIGHTS__PLACEMENT:
				return PLACEMENT_EDEFAULT == null ? placement != null : !PLACEMENT_EDEFAULT.equals(placement);
			case VisGridPackage.LIGHTS__INSTALLED_POWER:
				return INSTALLED_POWER_EDEFAULT == null ? installed_power != null : !INSTALLED_POWER_EDEFAULT.equals(installed_power);
			case VisGridPackage.LIGHTS__POWER_DENSITY:
				return POWER_DENSITY_EDEFAULT == null ? power_density != null : !POWER_DENSITY_EDEFAULT.equals(power_density);
			case VisGridPackage.LIGHTS__CURTAILMENT:
				return CURTAILMENT_EDEFAULT == null ? curtailment != null : !CURTAILMENT_EDEFAULT.equals(curtailment);
			case VisGridPackage.LIGHTS__DEMAND:
				return DEMAND_EDEFAULT == null ? demand != null : !DEMAND_EDEFAULT.equals(demand);
			case VisGridPackage.LIGHTS__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case VisGridPackage.LIGHTS__LOAD:
				return LOAD_EDEFAULT == null ? load != null : !LOAD_EDEFAULT.equals(load);
			case VisGridPackage.LIGHTS__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.LIGHTS__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case VisGridPackage.LIGHTS__PEAK_DEMAND:
				return PEAK_DEMAND_EDEFAULT == null ? peak_demand != null : !PEAK_DEMAND_EDEFAULT.equals(peak_demand);
			case VisGridPackage.LIGHTS__HEATGAIN:
				return HEATGAIN_EDEFAULT == null ? heatgain != null : !HEATGAIN_EDEFAULT.equals(heatgain);
			case VisGridPackage.LIGHTS__HEATGAIN_FRACTION:
				return HEATGAIN_FRACTION_EDEFAULT == null ? heatgain_fraction != null : !HEATGAIN_FRACTION_EDEFAULT.equals(heatgain_fraction);
			case VisGridPackage.LIGHTS__CURRENT_FRACTION:
				return CURRENT_FRACTION_EDEFAULT == null ? current_fraction != null : !CURRENT_FRACTION_EDEFAULT.equals(current_fraction);
			case VisGridPackage.LIGHTS__IMPEDANCE_FRACTION:
				return IMPEDANCE_FRACTION_EDEFAULT == null ? impedance_fraction != null : !IMPEDANCE_FRACTION_EDEFAULT.equals(impedance_fraction);
			case VisGridPackage.LIGHTS__POWER_FRACTION:
				return POWER_FRACTION_EDEFAULT == null ? power_fraction != null : !POWER_FRACTION_EDEFAULT.equals(power_fraction);
			case VisGridPackage.LIGHTS__POWER_FACTOR:
				return POWER_FACTOR_EDEFAULT == null ? power_factor != null : !POWER_FACTOR_EDEFAULT.equals(power_factor);
			case VisGridPackage.LIGHTS__CONSTANT_POWER:
				return CONSTANT_POWER_EDEFAULT == null ? constant_power != null : !CONSTANT_POWER_EDEFAULT.equals(constant_power);
			case VisGridPackage.LIGHTS__CONSTANT_CURRENT:
				return CONSTANT_CURRENT_EDEFAULT == null ? constant_current != null : !CONSTANT_CURRENT_EDEFAULT.equals(constant_current);
			case VisGridPackage.LIGHTS__CONSTANT_ADMITTANCE:
				return CONSTANT_ADMITTANCE_EDEFAULT == null ? constant_admittance != null : !CONSTANT_ADMITTANCE_EDEFAULT.equals(constant_admittance);
			case VisGridPackage.LIGHTS__VOLTAGE_FACTOR:
				return VOLTAGE_FACTOR_EDEFAULT == null ? voltage_factor != null : !VOLTAGE_FACTOR_EDEFAULT.equals(voltage_factor);
			case VisGridPackage.LIGHTS__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.LIGHTS__OVERRIDE:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", placement: ");
		result.append(placement);
		result.append(", installed_power: ");
		result.append(installed_power);
		result.append(", power_density: ");
		result.append(power_density);
		result.append(", curtailment: ");
		result.append(curtailment);
		result.append(", demand: ");
		result.append(demand);
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

} //LightsImpl
