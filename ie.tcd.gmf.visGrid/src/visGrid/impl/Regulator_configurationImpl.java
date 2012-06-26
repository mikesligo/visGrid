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
import visGrid.Regulator_configuration;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulator configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getConnect_type <em>Connect type</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getBand_center <em>Band center</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getBand_width <em>Band width</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getTime_delay <em>Time delay</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getDwell_time <em>Dwell time</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getRaise_taps <em>Raise taps</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getLower_taps <em>Lower taps</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCurrent_transducer_ratio <em>Current transducer ratio</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getPower_transducer_ratio <em>Power transducer ratio</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCompensator_r_setting_A <em>Compensator rsetting A</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCompensator_r_setting_B <em>Compensator rsetting B</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCompensator_r_setting_C <em>Compensator rsetting C</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCompensator_x_setting_A <em>Compensator xsetting A</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCompensator_x_setting_B <em>Compensator xsetting B</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCompensator_x_setting_C <em>Compensator xsetting C</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getCT_phase <em>CT phase</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getPT_phase <em>PT phase</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getRegulation <em>Regulation</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getControl_level <em>Control level</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getControl <em>Control</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getTap_pos_A <em>Tap pos A</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getTap_pos_B <em>Tap pos B</em>}</li>
 *   <li>{@link visGrid.impl.Regulator_configurationImpl#getTap_pos_C <em>Tap pos C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Regulator_configurationImpl extends EObjectImpl implements Regulator_configuration {
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
	 * The default value of the '{@link #getConnect_type() <em>Connect type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect_type()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnect_type() <em>Connect type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect_type()
	 * @generated
	 * @ordered
	 */
	protected String connect_type = CONNECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBand_center() <em>Band center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBand_center()
	 * @generated
	 * @ordered
	 */
	protected static final String BAND_CENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBand_center() <em>Band center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBand_center()
	 * @generated
	 * @ordered
	 */
	protected String band_center = BAND_CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBand_width() <em>Band width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBand_width()
	 * @generated
	 * @ordered
	 */
	protected static final String BAND_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBand_width() <em>Band width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBand_width()
	 * @generated
	 * @ordered
	 */
	protected String band_width = BAND_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime_delay() <em>Time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_delay()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_delay() <em>Time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_delay()
	 * @generated
	 * @ordered
	 */
	protected String time_delay = TIME_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDwell_time() <em>Dwell time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDwell_time()
	 * @generated
	 * @ordered
	 */
	protected static final String DWELL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDwell_time() <em>Dwell time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDwell_time()
	 * @generated
	 * @ordered
	 */
	protected String dwell_time = DWELL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRaise_taps() <em>Raise taps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaise_taps()
	 * @generated
	 * @ordered
	 */
	protected static final String RAISE_TAPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRaise_taps() <em>Raise taps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaise_taps()
	 * @generated
	 * @ordered
	 */
	protected String raise_taps = RAISE_TAPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower_taps() <em>Lower taps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_taps()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_TAPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLower_taps() <em>Lower taps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_taps()
	 * @generated
	 * @ordered
	 */
	protected String lower_taps = LOWER_TAPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_transducer_ratio() <em>Current transducer ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_transducer_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_TRANSDUCER_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_transducer_ratio() <em>Current transducer ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_transducer_ratio()
	 * @generated
	 * @ordered
	 */
	protected String current_transducer_ratio = CURRENT_TRANSDUCER_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_transducer_ratio() <em>Power transducer ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_transducer_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_TRANSDUCER_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_transducer_ratio() <em>Power transducer ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_transducer_ratio()
	 * @generated
	 * @ordered
	 */
	protected String power_transducer_ratio = POWER_TRANSDUCER_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensator_r_setting_A() <em>Compensator rsetting A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_r_setting_A()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATOR_RSETTING_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensator_r_setting_A() <em>Compensator rsetting A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_r_setting_A()
	 * @generated
	 * @ordered
	 */
	protected String compensator_r_setting_A = COMPENSATOR_RSETTING_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensator_r_setting_B() <em>Compensator rsetting B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_r_setting_B()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATOR_RSETTING_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensator_r_setting_B() <em>Compensator rsetting B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_r_setting_B()
	 * @generated
	 * @ordered
	 */
	protected String compensator_r_setting_B = COMPENSATOR_RSETTING_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensator_r_setting_C() <em>Compensator rsetting C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_r_setting_C()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATOR_RSETTING_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensator_r_setting_C() <em>Compensator rsetting C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_r_setting_C()
	 * @generated
	 * @ordered
	 */
	protected String compensator_r_setting_C = COMPENSATOR_RSETTING_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensator_x_setting_A() <em>Compensator xsetting A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_x_setting_A()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATOR_XSETTING_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensator_x_setting_A() <em>Compensator xsetting A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_x_setting_A()
	 * @generated
	 * @ordered
	 */
	protected String compensator_x_setting_A = COMPENSATOR_XSETTING_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensator_x_setting_B() <em>Compensator xsetting B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_x_setting_B()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATOR_XSETTING_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensator_x_setting_B() <em>Compensator xsetting B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_x_setting_B()
	 * @generated
	 * @ordered
	 */
	protected String compensator_x_setting_B = COMPENSATOR_XSETTING_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompensator_x_setting_C() <em>Compensator xsetting C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_x_setting_C()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPENSATOR_XSETTING_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompensator_x_setting_C() <em>Compensator xsetting C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompensator_x_setting_C()
	 * @generated
	 * @ordered
	 */
	protected String compensator_x_setting_C = COMPENSATOR_XSETTING_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getCT_phase() <em>CT phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCT_phase()
	 * @generated
	 * @ordered
	 */
	protected static final String CT_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCT_phase() <em>CT phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCT_phase()
	 * @generated
	 * @ordered
	 */
	protected String cT_phase = CT_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPT_phase() <em>PT phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPT_phase()
	 * @generated
	 * @ordered
	 */
	protected static final String PT_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPT_phase() <em>PT phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPT_phase()
	 * @generated
	 * @ordered
	 */
	protected String pT_phase = PT_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegulation() <em>Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulation()
	 * @generated
	 * @ordered
	 */
	protected static final String REGULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegulation() <em>Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulation()
	 * @generated
	 * @ordered
	 */
	protected String regulation = REGULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl_level() <em>Control level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl_level()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl_level() <em>Control level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl_level()
	 * @generated
	 * @ordered
	 */
	protected String control_level = CONTROL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected String control = CONTROL_EDEFAULT;

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
	 * The default value of the '{@link #getTap_pos_A() <em>Tap pos A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTap_pos_A()
	 * @generated
	 * @ordered
	 */
	protected static final String TAP_POS_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTap_pos_A() <em>Tap pos A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTap_pos_A()
	 * @generated
	 * @ordered
	 */
	protected String tap_pos_A = TAP_POS_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getTap_pos_B() <em>Tap pos B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTap_pos_B()
	 * @generated
	 * @ordered
	 */
	protected static final String TAP_POS_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTap_pos_B() <em>Tap pos B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTap_pos_B()
	 * @generated
	 * @ordered
	 */
	protected String tap_pos_B = TAP_POS_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getTap_pos_C() <em>Tap pos C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTap_pos_C()
	 * @generated
	 * @ordered
	 */
	protected static final String TAP_POS_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTap_pos_C() <em>Tap pos C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTap_pos_C()
	 * @generated
	 * @ordered
	 */
	protected String tap_pos_C = TAP_POS_C_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Regulator_configurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRegulator_configuration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.REGULATOR_CONFIGURATION__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnect_type() {
		return connect_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnect_type(String newConnect_type) {
		String oldConnect_type = connect_type;
		connect_type = newConnect_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__CONNECT_TYPE, oldConnect_type, connect_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBand_center() {
		return band_center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBand_center(String newBand_center) {
		String oldBand_center = band_center;
		band_center = newBand_center;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__BAND_CENTER, oldBand_center, band_center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBand_width() {
		return band_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBand_width(String newBand_width) {
		String oldBand_width = band_width;
		band_width = newBand_width;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__BAND_WIDTH, oldBand_width, band_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime_delay() {
		return time_delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime_delay(String newTime_delay) {
		String oldTime_delay = time_delay;
		time_delay = newTime_delay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__TIME_DELAY, oldTime_delay, time_delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDwell_time() {
		return dwell_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDwell_time(String newDwell_time) {
		String oldDwell_time = dwell_time;
		dwell_time = newDwell_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__DWELL_TIME, oldDwell_time, dwell_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRaise_taps() {
		return raise_taps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaise_taps(String newRaise_taps) {
		String oldRaise_taps = raise_taps;
		raise_taps = newRaise_taps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__RAISE_TAPS, oldRaise_taps, raise_taps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLower_taps() {
		return lower_taps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower_taps(String newLower_taps) {
		String oldLower_taps = lower_taps;
		lower_taps = newLower_taps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__LOWER_TAPS, oldLower_taps, lower_taps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_transducer_ratio() {
		return current_transducer_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_transducer_ratio(String newCurrent_transducer_ratio) {
		String oldCurrent_transducer_ratio = current_transducer_ratio;
		current_transducer_ratio = newCurrent_transducer_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__CURRENT_TRANSDUCER_RATIO, oldCurrent_transducer_ratio, current_transducer_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_transducer_ratio() {
		return power_transducer_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_transducer_ratio(String newPower_transducer_ratio) {
		String oldPower_transducer_ratio = power_transducer_ratio;
		power_transducer_ratio = newPower_transducer_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__POWER_TRANSDUCER_RATIO, oldPower_transducer_ratio, power_transducer_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensator_r_setting_A() {
		return compensator_r_setting_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensator_r_setting_A(String newCompensator_r_setting_A) {
		String oldCompensator_r_setting_A = compensator_r_setting_A;
		compensator_r_setting_A = newCompensator_r_setting_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_A, oldCompensator_r_setting_A, compensator_r_setting_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensator_r_setting_B() {
		return compensator_r_setting_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensator_r_setting_B(String newCompensator_r_setting_B) {
		String oldCompensator_r_setting_B = compensator_r_setting_B;
		compensator_r_setting_B = newCompensator_r_setting_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_B, oldCompensator_r_setting_B, compensator_r_setting_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensator_r_setting_C() {
		return compensator_r_setting_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensator_r_setting_C(String newCompensator_r_setting_C) {
		String oldCompensator_r_setting_C = compensator_r_setting_C;
		compensator_r_setting_C = newCompensator_r_setting_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_C, oldCompensator_r_setting_C, compensator_r_setting_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensator_x_setting_A() {
		return compensator_x_setting_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensator_x_setting_A(String newCompensator_x_setting_A) {
		String oldCompensator_x_setting_A = compensator_x_setting_A;
		compensator_x_setting_A = newCompensator_x_setting_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_A, oldCompensator_x_setting_A, compensator_x_setting_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensator_x_setting_B() {
		return compensator_x_setting_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensator_x_setting_B(String newCompensator_x_setting_B) {
		String oldCompensator_x_setting_B = compensator_x_setting_B;
		compensator_x_setting_B = newCompensator_x_setting_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_B, oldCompensator_x_setting_B, compensator_x_setting_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompensator_x_setting_C() {
		return compensator_x_setting_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompensator_x_setting_C(String newCompensator_x_setting_C) {
		String oldCompensator_x_setting_C = compensator_x_setting_C;
		compensator_x_setting_C = newCompensator_x_setting_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_C, oldCompensator_x_setting_C, compensator_x_setting_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCT_phase() {
		return cT_phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCT_phase(String newCT_phase) {
		String oldCT_phase = cT_phase;
		cT_phase = newCT_phase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__CT_PHASE, oldCT_phase, cT_phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPT_phase() {
		return pT_phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPT_phase(String newPT_phase) {
		String oldPT_phase = pT_phase;
		pT_phase = newPT_phase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__PT_PHASE, oldPT_phase, pT_phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegulation() {
		return regulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulation(String newRegulation) {
		String oldRegulation = regulation;
		regulation = newRegulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__REGULATION, oldRegulation, regulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl_level() {
		return control_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl_level(String newControl_level) {
		String oldControl_level = control_level;
		control_level = newControl_level;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__CONTROL_LEVEL, oldControl_level, control_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(String newControl) {
		String oldControl = control;
		control = newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__CONTROL, oldControl, control));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTap_pos_A() {
		return tap_pos_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTap_pos_A(String newTap_pos_A) {
		String oldTap_pos_A = tap_pos_A;
		tap_pos_A = newTap_pos_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_A, oldTap_pos_A, tap_pos_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTap_pos_B() {
		return tap_pos_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTap_pos_B(String newTap_pos_B) {
		String oldTap_pos_B = tap_pos_B;
		tap_pos_B = newTap_pos_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_B, oldTap_pos_B, tap_pos_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTap_pos_C() {
		return tap_pos_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTap_pos_C(String newTap_pos_C) {
		String oldTap_pos_C = tap_pos_C;
		tap_pos_C = newTap_pos_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_C, oldTap_pos_C, tap_pos_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECTION:
				return getConnection();
			case VisGridPackage.REGULATOR_CONFIGURATION__NAME:
				return getName();
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECT_TYPE:
				return getConnect_type();
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_CENTER:
				return getBand_center();
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_WIDTH:
				return getBand_width();
			case VisGridPackage.REGULATOR_CONFIGURATION__TIME_DELAY:
				return getTime_delay();
			case VisGridPackage.REGULATOR_CONFIGURATION__DWELL_TIME:
				return getDwell_time();
			case VisGridPackage.REGULATOR_CONFIGURATION__RAISE_TAPS:
				return getRaise_taps();
			case VisGridPackage.REGULATOR_CONFIGURATION__LOWER_TAPS:
				return getLower_taps();
			case VisGridPackage.REGULATOR_CONFIGURATION__CURRENT_TRANSDUCER_RATIO:
				return getCurrent_transducer_ratio();
			case VisGridPackage.REGULATOR_CONFIGURATION__POWER_TRANSDUCER_RATIO:
				return getPower_transducer_ratio();
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_A:
				return getCompensator_r_setting_A();
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_B:
				return getCompensator_r_setting_B();
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_C:
				return getCompensator_r_setting_C();
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_A:
				return getCompensator_x_setting_A();
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_B:
				return getCompensator_x_setting_B();
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_C:
				return getCompensator_x_setting_C();
			case VisGridPackage.REGULATOR_CONFIGURATION__CT_PHASE:
				return getCT_phase();
			case VisGridPackage.REGULATOR_CONFIGURATION__PT_PHASE:
				return getPT_phase();
			case VisGridPackage.REGULATOR_CONFIGURATION__REGULATION:
				return getRegulation();
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL_LEVEL:
				return getControl_level();
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL:
				return getControl();
			case VisGridPackage.REGULATOR_CONFIGURATION__TYPE:
				return getType();
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_A:
				return getTap_pos_A();
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_B:
				return getTap_pos_B();
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_C:
				return getTap_pos_C();
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
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECT_TYPE:
				setConnect_type((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_CENTER:
				setBand_center((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_WIDTH:
				setBand_width((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TIME_DELAY:
				setTime_delay((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__DWELL_TIME:
				setDwell_time((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__RAISE_TAPS:
				setRaise_taps((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__LOWER_TAPS:
				setLower_taps((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CURRENT_TRANSDUCER_RATIO:
				setCurrent_transducer_ratio((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__POWER_TRANSDUCER_RATIO:
				setPower_transducer_ratio((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_A:
				setCompensator_r_setting_A((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_B:
				setCompensator_r_setting_B((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_C:
				setCompensator_r_setting_C((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_A:
				setCompensator_x_setting_A((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_B:
				setCompensator_x_setting_B((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_C:
				setCompensator_x_setting_C((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CT_PHASE:
				setCT_phase((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__PT_PHASE:
				setPT_phase((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__REGULATION:
				setRegulation((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL_LEVEL:
				setControl_level((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL:
				setControl((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TYPE:
				setType((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_A:
				setTap_pos_A((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_B:
				setTap_pos_B((String)newValue);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_C:
				setTap_pos_C((String)newValue);
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
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECT_TYPE:
				setConnect_type(CONNECT_TYPE_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_CENTER:
				setBand_center(BAND_CENTER_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_WIDTH:
				setBand_width(BAND_WIDTH_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TIME_DELAY:
				setTime_delay(TIME_DELAY_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__DWELL_TIME:
				setDwell_time(DWELL_TIME_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__RAISE_TAPS:
				setRaise_taps(RAISE_TAPS_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__LOWER_TAPS:
				setLower_taps(LOWER_TAPS_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CURRENT_TRANSDUCER_RATIO:
				setCurrent_transducer_ratio(CURRENT_TRANSDUCER_RATIO_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__POWER_TRANSDUCER_RATIO:
				setPower_transducer_ratio(POWER_TRANSDUCER_RATIO_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_A:
				setCompensator_r_setting_A(COMPENSATOR_RSETTING_A_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_B:
				setCompensator_r_setting_B(COMPENSATOR_RSETTING_B_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_C:
				setCompensator_r_setting_C(COMPENSATOR_RSETTING_C_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_A:
				setCompensator_x_setting_A(COMPENSATOR_XSETTING_A_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_B:
				setCompensator_x_setting_B(COMPENSATOR_XSETTING_B_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_C:
				setCompensator_x_setting_C(COMPENSATOR_XSETTING_C_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CT_PHASE:
				setCT_phase(CT_PHASE_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__PT_PHASE:
				setPT_phase(PT_PHASE_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__REGULATION:
				setRegulation(REGULATION_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL_LEVEL:
				setControl_level(CONTROL_LEVEL_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL:
				setControl(CONTROL_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_A:
				setTap_pos_A(TAP_POS_A_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_B:
				setTap_pos_B(TAP_POS_B_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_C:
				setTap_pos_C(TAP_POS_C_EDEFAULT);
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
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.REGULATOR_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECT_TYPE:
				return CONNECT_TYPE_EDEFAULT == null ? connect_type != null : !CONNECT_TYPE_EDEFAULT.equals(connect_type);
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_CENTER:
				return BAND_CENTER_EDEFAULT == null ? band_center != null : !BAND_CENTER_EDEFAULT.equals(band_center);
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_WIDTH:
				return BAND_WIDTH_EDEFAULT == null ? band_width != null : !BAND_WIDTH_EDEFAULT.equals(band_width);
			case VisGridPackage.REGULATOR_CONFIGURATION__TIME_DELAY:
				return TIME_DELAY_EDEFAULT == null ? time_delay != null : !TIME_DELAY_EDEFAULT.equals(time_delay);
			case VisGridPackage.REGULATOR_CONFIGURATION__DWELL_TIME:
				return DWELL_TIME_EDEFAULT == null ? dwell_time != null : !DWELL_TIME_EDEFAULT.equals(dwell_time);
			case VisGridPackage.REGULATOR_CONFIGURATION__RAISE_TAPS:
				return RAISE_TAPS_EDEFAULT == null ? raise_taps != null : !RAISE_TAPS_EDEFAULT.equals(raise_taps);
			case VisGridPackage.REGULATOR_CONFIGURATION__LOWER_TAPS:
				return LOWER_TAPS_EDEFAULT == null ? lower_taps != null : !LOWER_TAPS_EDEFAULT.equals(lower_taps);
			case VisGridPackage.REGULATOR_CONFIGURATION__CURRENT_TRANSDUCER_RATIO:
				return CURRENT_TRANSDUCER_RATIO_EDEFAULT == null ? current_transducer_ratio != null : !CURRENT_TRANSDUCER_RATIO_EDEFAULT.equals(current_transducer_ratio);
			case VisGridPackage.REGULATOR_CONFIGURATION__POWER_TRANSDUCER_RATIO:
				return POWER_TRANSDUCER_RATIO_EDEFAULT == null ? power_transducer_ratio != null : !POWER_TRANSDUCER_RATIO_EDEFAULT.equals(power_transducer_ratio);
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_A:
				return COMPENSATOR_RSETTING_A_EDEFAULT == null ? compensator_r_setting_A != null : !COMPENSATOR_RSETTING_A_EDEFAULT.equals(compensator_r_setting_A);
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_B:
				return COMPENSATOR_RSETTING_B_EDEFAULT == null ? compensator_r_setting_B != null : !COMPENSATOR_RSETTING_B_EDEFAULT.equals(compensator_r_setting_B);
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_C:
				return COMPENSATOR_RSETTING_C_EDEFAULT == null ? compensator_r_setting_C != null : !COMPENSATOR_RSETTING_C_EDEFAULT.equals(compensator_r_setting_C);
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_A:
				return COMPENSATOR_XSETTING_A_EDEFAULT == null ? compensator_x_setting_A != null : !COMPENSATOR_XSETTING_A_EDEFAULT.equals(compensator_x_setting_A);
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_B:
				return COMPENSATOR_XSETTING_B_EDEFAULT == null ? compensator_x_setting_B != null : !COMPENSATOR_XSETTING_B_EDEFAULT.equals(compensator_x_setting_B);
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_C:
				return COMPENSATOR_XSETTING_C_EDEFAULT == null ? compensator_x_setting_C != null : !COMPENSATOR_XSETTING_C_EDEFAULT.equals(compensator_x_setting_C);
			case VisGridPackage.REGULATOR_CONFIGURATION__CT_PHASE:
				return CT_PHASE_EDEFAULT == null ? cT_phase != null : !CT_PHASE_EDEFAULT.equals(cT_phase);
			case VisGridPackage.REGULATOR_CONFIGURATION__PT_PHASE:
				return PT_PHASE_EDEFAULT == null ? pT_phase != null : !PT_PHASE_EDEFAULT.equals(pT_phase);
			case VisGridPackage.REGULATOR_CONFIGURATION__REGULATION:
				return REGULATION_EDEFAULT == null ? regulation != null : !REGULATION_EDEFAULT.equals(regulation);
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL_LEVEL:
				return CONTROL_LEVEL_EDEFAULT == null ? control_level != null : !CONTROL_LEVEL_EDEFAULT.equals(control_level);
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL:
				return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
			case VisGridPackage.REGULATOR_CONFIGURATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_A:
				return TAP_POS_A_EDEFAULT == null ? tap_pos_A != null : !TAP_POS_A_EDEFAULT.equals(tap_pos_A);
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_B:
				return TAP_POS_B_EDEFAULT == null ? tap_pos_B != null : !TAP_POS_B_EDEFAULT.equals(tap_pos_B);
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_C:
				return TAP_POS_C_EDEFAULT == null ? tap_pos_C != null : !TAP_POS_C_EDEFAULT.equals(tap_pos_C);
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
		result.append(", connect_type: ");
		result.append(connect_type);
		result.append(", band_center: ");
		result.append(band_center);
		result.append(", band_width: ");
		result.append(band_width);
		result.append(", time_delay: ");
		result.append(time_delay);
		result.append(", dwell_time: ");
		result.append(dwell_time);
		result.append(", raise_taps: ");
		result.append(raise_taps);
		result.append(", lower_taps: ");
		result.append(lower_taps);
		result.append(", current_transducer_ratio: ");
		result.append(current_transducer_ratio);
		result.append(", power_transducer_ratio: ");
		result.append(power_transducer_ratio);
		result.append(", compensator_r_setting_A: ");
		result.append(compensator_r_setting_A);
		result.append(", compensator_r_setting_B: ");
		result.append(compensator_r_setting_B);
		result.append(", compensator_r_setting_C: ");
		result.append(compensator_r_setting_C);
		result.append(", compensator_x_setting_A: ");
		result.append(compensator_x_setting_A);
		result.append(", compensator_x_setting_B: ");
		result.append(compensator_x_setting_B);
		result.append(", compensator_x_setting_C: ");
		result.append(compensator_x_setting_C);
		result.append(", CT_phase: ");
		result.append(cT_phase);
		result.append(", PT_phase: ");
		result.append(pT_phase);
		result.append(", regulation: ");
		result.append(regulation);
		result.append(", control_level: ");
		result.append(control_level);
		result.append(", Control: ");
		result.append(control);
		result.append(", Type: ");
		result.append(type);
		result.append(", tap_pos_A: ");
		result.append(tap_pos_A);
		result.append(", tap_pos_B: ");
		result.append(tap_pos_B);
		result.append(", tap_pos_C: ");
		result.append(tap_pos_C);
		result.append(')');
		return result.toString();
	}

} //Regulator_configurationImpl