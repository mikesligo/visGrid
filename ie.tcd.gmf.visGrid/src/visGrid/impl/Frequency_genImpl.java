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
import visGrid.Frequency_gen;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getFrequency_Mode <em>Frequency Mode</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getFreqChange <em>Freq Change</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getM <em>M</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getD <em>D</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getRated_power <em>Rated power</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getGen_power <em>Gen power</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getLoad_power <em>Load power</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getGov_delay <em>Gov delay</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getRamp_rate <em>Ramp rate</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getLow_Freq_OI <em>Low Freq OI</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getHigh_Freq_OI <em>High Freq OI</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getAvg24 <em>Avg24</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getStd24 <em>Std24</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getAvg168 <em>Avg168</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getStd168 <em>Std168</em>}</li>
 *   <li>{@link visGrid.impl.Frequency_genImpl#getNum_Resp_Eqs <em>Num Resp Eqs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Frequency_genImpl extends EObjectImpl implements Frequency_gen {
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
	 * The default value of the '{@link #getFrequency_Mode() <em>Frequency Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency_Mode()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency_Mode() <em>Frequency Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency_Mode()
	 * @generated
	 * @ordered
	 */
	protected String frequency_Mode = FREQUENCY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected String frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreqChange() <em>Freq Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqChange()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQ_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreqChange() <em>Freq Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqChange()
	 * @generated
	 * @ordered
	 */
	protected String freqChange = FREQ_CHANGE_EDEFAULT;

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
	 * The default value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final String TOLERANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected String tolerance = TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final String M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected String m = M_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final String D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected String d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_power() <em>Rated power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_power()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_power() <em>Rated power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_power()
	 * @generated
	 * @ordered
	 */
	protected String rated_power = RATED_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGen_power() <em>Gen power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_power()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGen_power() <em>Gen power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_power()
	 * @generated
	 * @ordered
	 */
	protected String gen_power = GEN_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoad_power() <em>Load power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_power()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad_power() <em>Load power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_power()
	 * @generated
	 * @ordered
	 */
	protected String load_power = LOAD_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGov_delay() <em>Gov delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGov_delay()
	 * @generated
	 * @ordered
	 */
	protected static final String GOV_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGov_delay() <em>Gov delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGov_delay()
	 * @generated
	 * @ordered
	 */
	protected String gov_delay = GOV_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamp_rate() <em>Ramp rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamp_rate()
	 * @generated
	 * @ordered
	 */
	protected static final String RAMP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamp_rate() <em>Ramp rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamp_rate()
	 * @generated
	 * @ordered
	 */
	protected String ramp_rate = RAMP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLow_Freq_OI() <em>Low Freq OI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow_Freq_OI()
	 * @generated
	 * @ordered
	 */
	protected static final String LOW_FREQ_OI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLow_Freq_OI() <em>Low Freq OI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow_Freq_OI()
	 * @generated
	 * @ordered
	 */
	protected String low_Freq_OI = LOW_FREQ_OI_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigh_Freq_OI() <em>High Freq OI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh_Freq_OI()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGH_FREQ_OI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHigh_Freq_OI() <em>High Freq OI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh_Freq_OI()
	 * @generated
	 * @ordered
	 */
	protected String high_Freq_OI = HIGH_FREQ_OI_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvg24() <em>Avg24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg24()
	 * @generated
	 * @ordered
	 */
	protected static final String AVG24_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvg24() <em>Avg24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg24()
	 * @generated
	 * @ordered
	 */
	protected String avg24 = AVG24_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd24() <em>Std24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd24()
	 * @generated
	 * @ordered
	 */
	protected static final String STD24_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStd24() <em>Std24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd24()
	 * @generated
	 * @ordered
	 */
	protected String std24 = STD24_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvg168() <em>Avg168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg168()
	 * @generated
	 * @ordered
	 */
	protected static final String AVG168_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvg168() <em>Avg168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvg168()
	 * @generated
	 * @ordered
	 */
	protected String avg168 = AVG168_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd168() <em>Std168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd168()
	 * @generated
	 * @ordered
	 */
	protected static final String STD168_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStd168() <em>Std168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd168()
	 * @generated
	 * @ordered
	 */
	protected String std168 = STD168_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_Resp_Eqs() <em>Num Resp Eqs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_Resp_Eqs()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_RESP_EQS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNum_Resp_Eqs() <em>Num Resp Eqs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_Resp_Eqs()
	 * @generated
	 * @ordered
	 */
	protected String num_Resp_Eqs = NUM_RESP_EQS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Frequency_genImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getFrequency_gen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.FREQUENCY_GEN__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency_Mode() {
		return frequency_Mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency_Mode(String newFrequency_Mode) {
		String oldFrequency_Mode = frequency_Mode;
		frequency_Mode = newFrequency_Mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__FREQUENCY_MODE, oldFrequency_Mode, frequency_Mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		String oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreqChange() {
		return freqChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreqChange(String newFreqChange) {
		String oldFreqChange = freqChange;
		freqChange = newFreqChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__FREQ_CHANGE, oldFreqChange, freqChange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__DEADBAND, oldDeadband, deadband));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTolerance() {
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTolerance(String newTolerance) {
		String oldTolerance = tolerance;
		tolerance = newTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__TOLERANCE, oldTolerance, tolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(String newM) {
		String oldM = m;
		m = newM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__M, oldM, m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(String newD) {
		String oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_power() {
		return rated_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_power(String newRated_power) {
		String oldRated_power = rated_power;
		rated_power = newRated_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__RATED_POWER, oldRated_power, rated_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGen_power() {
		return gen_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGen_power(String newGen_power) {
		String oldGen_power = gen_power;
		gen_power = newGen_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__GEN_POWER, oldGen_power, gen_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad_power() {
		return load_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad_power(String newLoad_power) {
		String oldLoad_power = load_power;
		load_power = newLoad_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__LOAD_POWER, oldLoad_power, load_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGov_delay() {
		return gov_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGov_delay(String newGov_delay) {
		String oldGov_delay = gov_delay;
		gov_delay = newGov_delay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__GOV_DELAY, oldGov_delay, gov_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamp_rate() {
		return ramp_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamp_rate(String newRamp_rate) {
		String oldRamp_rate = ramp_rate;
		ramp_rate = newRamp_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__RAMP_RATE, oldRamp_rate, ramp_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLow_Freq_OI() {
		return low_Freq_OI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow_Freq_OI(String newLow_Freq_OI) {
		String oldLow_Freq_OI = low_Freq_OI;
		low_Freq_OI = newLow_Freq_OI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__LOW_FREQ_OI, oldLow_Freq_OI, low_Freq_OI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHigh_Freq_OI() {
		return high_Freq_OI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh_Freq_OI(String newHigh_Freq_OI) {
		String oldHigh_Freq_OI = high_Freq_OI;
		high_Freq_OI = newHigh_Freq_OI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__HIGH_FREQ_OI, oldHigh_Freq_OI, high_Freq_OI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvg24() {
		return avg24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvg24(String newAvg24) {
		String oldAvg24 = avg24;
		avg24 = newAvg24;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__AVG24, oldAvg24, avg24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStd24() {
		return std24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd24(String newStd24) {
		String oldStd24 = std24;
		std24 = newStd24;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__STD24, oldStd24, std24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvg168() {
		return avg168;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvg168(String newAvg168) {
		String oldAvg168 = avg168;
		avg168 = newAvg168;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__AVG168, oldAvg168, avg168));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStd168() {
		return std168;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd168(String newStd168) {
		String oldStd168 = std168;
		std168 = newStd168;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__STD168, oldStd168, std168));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNum_Resp_Eqs() {
		return num_Resp_Eqs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_Resp_Eqs(String newNum_Resp_Eqs) {
		String oldNum_Resp_Eqs = num_Resp_Eqs;
		num_Resp_Eqs = newNum_Resp_Eqs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FREQUENCY_GEN__NUM_RESP_EQS, oldNum_Resp_Eqs, num_Resp_Eqs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.FREQUENCY_GEN__CONNECTION:
				return getConnection();
			case VisGridPackage.FREQUENCY_GEN__NAME:
				return getName();
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY_MODE:
				return getFrequency_Mode();
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY:
				return getFrequency();
			case VisGridPackage.FREQUENCY_GEN__FREQ_CHANGE:
				return getFreqChange();
			case VisGridPackage.FREQUENCY_GEN__DEADBAND:
				return getDeadband();
			case VisGridPackage.FREQUENCY_GEN__TOLERANCE:
				return getTolerance();
			case VisGridPackage.FREQUENCY_GEN__M:
				return getM();
			case VisGridPackage.FREQUENCY_GEN__D:
				return getD();
			case VisGridPackage.FREQUENCY_GEN__RATED_POWER:
				return getRated_power();
			case VisGridPackage.FREQUENCY_GEN__GEN_POWER:
				return getGen_power();
			case VisGridPackage.FREQUENCY_GEN__LOAD_POWER:
				return getLoad_power();
			case VisGridPackage.FREQUENCY_GEN__GOV_DELAY:
				return getGov_delay();
			case VisGridPackage.FREQUENCY_GEN__RAMP_RATE:
				return getRamp_rate();
			case VisGridPackage.FREQUENCY_GEN__LOW_FREQ_OI:
				return getLow_Freq_OI();
			case VisGridPackage.FREQUENCY_GEN__HIGH_FREQ_OI:
				return getHigh_Freq_OI();
			case VisGridPackage.FREQUENCY_GEN__AVG24:
				return getAvg24();
			case VisGridPackage.FREQUENCY_GEN__STD24:
				return getStd24();
			case VisGridPackage.FREQUENCY_GEN__AVG168:
				return getAvg168();
			case VisGridPackage.FREQUENCY_GEN__STD168:
				return getStd168();
			case VisGridPackage.FREQUENCY_GEN__NUM_RESP_EQS:
				return getNum_Resp_Eqs();
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
			case VisGridPackage.FREQUENCY_GEN__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY_MODE:
				setFrequency_Mode((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY:
				setFrequency((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__FREQ_CHANGE:
				setFreqChange((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__DEADBAND:
				setDeadband((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__TOLERANCE:
				setTolerance((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__M:
				setM((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__D:
				setD((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__RATED_POWER:
				setRated_power((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__GEN_POWER:
				setGen_power((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__LOAD_POWER:
				setLoad_power((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__GOV_DELAY:
				setGov_delay((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__RAMP_RATE:
				setRamp_rate((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__LOW_FREQ_OI:
				setLow_Freq_OI((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__HIGH_FREQ_OI:
				setHigh_Freq_OI((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__AVG24:
				setAvg24((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__STD24:
				setStd24((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__AVG168:
				setAvg168((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__STD168:
				setStd168((String)newValue);
				return;
			case VisGridPackage.FREQUENCY_GEN__NUM_RESP_EQS:
				setNum_Resp_Eqs((String)newValue);
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
			case VisGridPackage.FREQUENCY_GEN__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.FREQUENCY_GEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY_MODE:
				setFrequency_Mode(FREQUENCY_MODE_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__FREQ_CHANGE:
				setFreqChange(FREQ_CHANGE_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__DEADBAND:
				setDeadband(DEADBAND_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__TOLERANCE:
				setTolerance(TOLERANCE_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__M:
				setM(M_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__D:
				setD(D_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__RATED_POWER:
				setRated_power(RATED_POWER_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__GEN_POWER:
				setGen_power(GEN_POWER_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__LOAD_POWER:
				setLoad_power(LOAD_POWER_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__GOV_DELAY:
				setGov_delay(GOV_DELAY_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__RAMP_RATE:
				setRamp_rate(RAMP_RATE_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__LOW_FREQ_OI:
				setLow_Freq_OI(LOW_FREQ_OI_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__HIGH_FREQ_OI:
				setHigh_Freq_OI(HIGH_FREQ_OI_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__AVG24:
				setAvg24(AVG24_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__STD24:
				setStd24(STD24_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__AVG168:
				setAvg168(AVG168_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__STD168:
				setStd168(STD168_EDEFAULT);
				return;
			case VisGridPackage.FREQUENCY_GEN__NUM_RESP_EQS:
				setNum_Resp_Eqs(NUM_RESP_EQS_EDEFAULT);
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
			case VisGridPackage.FREQUENCY_GEN__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.FREQUENCY_GEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY_MODE:
				return FREQUENCY_MODE_EDEFAULT == null ? frequency_Mode != null : !FREQUENCY_MODE_EDEFAULT.equals(frequency_Mode);
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
			case VisGridPackage.FREQUENCY_GEN__FREQ_CHANGE:
				return FREQ_CHANGE_EDEFAULT == null ? freqChange != null : !FREQ_CHANGE_EDEFAULT.equals(freqChange);
			case VisGridPackage.FREQUENCY_GEN__DEADBAND:
				return DEADBAND_EDEFAULT == null ? deadband != null : !DEADBAND_EDEFAULT.equals(deadband);
			case VisGridPackage.FREQUENCY_GEN__TOLERANCE:
				return TOLERANCE_EDEFAULT == null ? tolerance != null : !TOLERANCE_EDEFAULT.equals(tolerance);
			case VisGridPackage.FREQUENCY_GEN__M:
				return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
			case VisGridPackage.FREQUENCY_GEN__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case VisGridPackage.FREQUENCY_GEN__RATED_POWER:
				return RATED_POWER_EDEFAULT == null ? rated_power != null : !RATED_POWER_EDEFAULT.equals(rated_power);
			case VisGridPackage.FREQUENCY_GEN__GEN_POWER:
				return GEN_POWER_EDEFAULT == null ? gen_power != null : !GEN_POWER_EDEFAULT.equals(gen_power);
			case VisGridPackage.FREQUENCY_GEN__LOAD_POWER:
				return LOAD_POWER_EDEFAULT == null ? load_power != null : !LOAD_POWER_EDEFAULT.equals(load_power);
			case VisGridPackage.FREQUENCY_GEN__GOV_DELAY:
				return GOV_DELAY_EDEFAULT == null ? gov_delay != null : !GOV_DELAY_EDEFAULT.equals(gov_delay);
			case VisGridPackage.FREQUENCY_GEN__RAMP_RATE:
				return RAMP_RATE_EDEFAULT == null ? ramp_rate != null : !RAMP_RATE_EDEFAULT.equals(ramp_rate);
			case VisGridPackage.FREQUENCY_GEN__LOW_FREQ_OI:
				return LOW_FREQ_OI_EDEFAULT == null ? low_Freq_OI != null : !LOW_FREQ_OI_EDEFAULT.equals(low_Freq_OI);
			case VisGridPackage.FREQUENCY_GEN__HIGH_FREQ_OI:
				return HIGH_FREQ_OI_EDEFAULT == null ? high_Freq_OI != null : !HIGH_FREQ_OI_EDEFAULT.equals(high_Freq_OI);
			case VisGridPackage.FREQUENCY_GEN__AVG24:
				return AVG24_EDEFAULT == null ? avg24 != null : !AVG24_EDEFAULT.equals(avg24);
			case VisGridPackage.FREQUENCY_GEN__STD24:
				return STD24_EDEFAULT == null ? std24 != null : !STD24_EDEFAULT.equals(std24);
			case VisGridPackage.FREQUENCY_GEN__AVG168:
				return AVG168_EDEFAULT == null ? avg168 != null : !AVG168_EDEFAULT.equals(avg168);
			case VisGridPackage.FREQUENCY_GEN__STD168:
				return STD168_EDEFAULT == null ? std168 != null : !STD168_EDEFAULT.equals(std168);
			case VisGridPackage.FREQUENCY_GEN__NUM_RESP_EQS:
				return NUM_RESP_EQS_EDEFAULT == null ? num_Resp_Eqs != null : !NUM_RESP_EQS_EDEFAULT.equals(num_Resp_Eqs);
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
		result.append(", Frequency_Mode: ");
		result.append(frequency_Mode);
		result.append(", Frequency: ");
		result.append(frequency);
		result.append(", FreqChange: ");
		result.append(freqChange);
		result.append(", Deadband: ");
		result.append(deadband);
		result.append(", Tolerance: ");
		result.append(tolerance);
		result.append(", M: ");
		result.append(m);
		result.append(", D: ");
		result.append(d);
		result.append(", Rated_power: ");
		result.append(rated_power);
		result.append(", Gen_power: ");
		result.append(gen_power);
		result.append(", Load_power: ");
		result.append(load_power);
		result.append(", Gov_delay: ");
		result.append(gov_delay);
		result.append(", Ramp_rate: ");
		result.append(ramp_rate);
		result.append(", Low_Freq_OI: ");
		result.append(low_Freq_OI);
		result.append(", High_Freq_OI: ");
		result.append(high_Freq_OI);
		result.append(", avg24: ");
		result.append(avg24);
		result.append(", std24: ");
		result.append(std24);
		result.append(", avg168: ");
		result.append(avg168);
		result.append(", std168: ");
		result.append(std168);
		result.append(", Num_Resp_Eqs: ");
		result.append(num_Resp_Eqs);
		result.append(')');
		return result.toString();
	}

} //Frequency_genImpl