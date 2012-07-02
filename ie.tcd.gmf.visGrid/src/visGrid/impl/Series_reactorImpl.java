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

import visGrid.Series_reactor;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series reactor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_A_impedance <em>Phase Aimpedance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_A_resistance <em>Phase Aresistance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_A_reactance <em>Phase Areactance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_B_impedance <em>Phase Bimpedance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_B_resistance <em>Phase Bresistance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_B_reactance <em>Phase Breactance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_C_impedance <em>Phase Cimpedance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_C_resistance <em>Phase Cresistance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhase_C_reactance <em>Phase Creactance</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getRated_current_limit <em>Rated current limit</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getFrom <em>From</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getTo <em>To</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_in <em>Power in</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_out <em>Power out</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_losses <em>Power losses</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_in_A <em>Power in A</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_in_B <em>Power in B</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_in_C <em>Power in C</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_out_A <em>Power out A</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_out_B <em>Power out B</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_out_C <em>Power out C</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_losses_A <em>Power losses A</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_losses_B <em>Power losses B</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPower_losses_C <em>Power losses C</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getFlow_direction <em>Flow direction</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.Series_reactorImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Series_reactorImpl extends ConnectionImpl implements Series_reactor {
	/**
	 * The default value of the '{@link #getPhase_A_impedance() <em>Phase Aimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_A_impedance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_AIMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_A_impedance() <em>Phase Aimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_A_impedance()
	 * @generated
	 * @ordered
	 */
	protected String phase_A_impedance = PHASE_AIMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_A_resistance() <em>Phase Aresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_A_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_ARESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_A_resistance() <em>Phase Aresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_A_resistance()
	 * @generated
	 * @ordered
	 */
	protected String phase_A_resistance = PHASE_ARESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_A_reactance() <em>Phase Areactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_A_reactance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_AREACTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_A_reactance() <em>Phase Areactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_A_reactance()
	 * @generated
	 * @ordered
	 */
	protected String phase_A_reactance = PHASE_AREACTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_B_impedance() <em>Phase Bimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_B_impedance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BIMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_B_impedance() <em>Phase Bimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_B_impedance()
	 * @generated
	 * @ordered
	 */
	protected String phase_B_impedance = PHASE_BIMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_B_resistance() <em>Phase Bresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_B_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BRESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_B_resistance() <em>Phase Bresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_B_resistance()
	 * @generated
	 * @ordered
	 */
	protected String phase_B_resistance = PHASE_BRESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_B_reactance() <em>Phase Breactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_B_reactance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BREACTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_B_reactance() <em>Phase Breactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_B_reactance()
	 * @generated
	 * @ordered
	 */
	protected String phase_B_reactance = PHASE_BREACTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_C_impedance() <em>Phase Cimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_C_impedance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CIMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_C_impedance() <em>Phase Cimpedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_C_impedance()
	 * @generated
	 * @ordered
	 */
	protected String phase_C_impedance = PHASE_CIMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_C_resistance() <em>Phase Cresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_C_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CRESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_C_resistance() <em>Phase Cresistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_C_resistance()
	 * @generated
	 * @ordered
	 */
	protected String phase_C_resistance = PHASE_CRESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase_C_reactance() <em>Phase Creactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_C_reactance()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CREACTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase_C_reactance() <em>Phase Creactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase_C_reactance()
	 * @generated
	 * @ordered
	 */
	protected String phase_C_reactance = PHASE_CREACTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_current_limit() <em>Rated current limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_current_limit()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_CURRENT_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_current_limit() <em>Rated current limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_current_limit()
	 * @generated
	 * @ordered
	 */
	protected String rated_current_limit = RATED_CURRENT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_in() <em>Power in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_in() <em>Power in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in()
	 * @generated
	 * @ordered
	 */
	protected String power_in = POWER_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_out() <em>Power out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_out() <em>Power out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out()
	 * @generated
	 * @ordered
	 */
	protected String power_out = POWER_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_losses() <em>Power losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_LOSSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_losses() <em>Power losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses()
	 * @generated
	 * @ordered
	 */
	protected String power_losses = POWER_LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_in_A() <em>Power in A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in_A()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_IN_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_in_A() <em>Power in A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in_A()
	 * @generated
	 * @ordered
	 */
	protected String power_in_A = POWER_IN_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_in_B() <em>Power in B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in_B()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_IN_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_in_B() <em>Power in B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in_B()
	 * @generated
	 * @ordered
	 */
	protected String power_in_B = POWER_IN_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_in_C() <em>Power in C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in_C()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_IN_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_in_C() <em>Power in C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_in_C()
	 * @generated
	 * @ordered
	 */
	protected String power_in_C = POWER_IN_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_out_A() <em>Power out A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out_A()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_OUT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_out_A() <em>Power out A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out_A()
	 * @generated
	 * @ordered
	 */
	protected String power_out_A = POWER_OUT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_out_B() <em>Power out B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out_B()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_OUT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_out_B() <em>Power out B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out_B()
	 * @generated
	 * @ordered
	 */
	protected String power_out_B = POWER_OUT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_out_C() <em>Power out C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out_C()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_OUT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_out_C() <em>Power out C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_out_C()
	 * @generated
	 * @ordered
	 */
	protected String power_out_C = POWER_OUT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_losses_A() <em>Power losses A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses_A()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_LOSSES_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_losses_A() <em>Power losses A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses_A()
	 * @generated
	 * @ordered
	 */
	protected String power_losses_A = POWER_LOSSES_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_losses_B() <em>Power losses B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses_B()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_LOSSES_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_losses_B() <em>Power losses B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses_B()
	 * @generated
	 * @ordered
	 */
	protected String power_losses_B = POWER_LOSSES_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_losses_C() <em>Power losses C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses_C()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_LOSSES_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_losses_C() <em>Power losses C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_losses_C()
	 * @generated
	 * @ordered
	 */
	protected String power_losses_C = POWER_LOSSES_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlow_direction() <em>Flow direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow_direction()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlow_direction() <em>Flow direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow_direction()
	 * @generated
	 * @ordered
	 */
	protected String flow_direction = FLOW_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected String phases = PHASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominal_voltage() <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominal_voltage() <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected String nominal_voltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Series_reactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getSeries_reactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_A_impedance() {
		return phase_A_impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_A_impedance(String newPhase_A_impedance) {
		String oldPhase_A_impedance = phase_A_impedance;
		phase_A_impedance = newPhase_A_impedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_AIMPEDANCE, oldPhase_A_impedance, phase_A_impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_A_resistance() {
		return phase_A_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_A_resistance(String newPhase_A_resistance) {
		String oldPhase_A_resistance = phase_A_resistance;
		phase_A_resistance = newPhase_A_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_ARESISTANCE, oldPhase_A_resistance, phase_A_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_A_reactance() {
		return phase_A_reactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_A_reactance(String newPhase_A_reactance) {
		String oldPhase_A_reactance = phase_A_reactance;
		phase_A_reactance = newPhase_A_reactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_AREACTANCE, oldPhase_A_reactance, phase_A_reactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_B_impedance() {
		return phase_B_impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_B_impedance(String newPhase_B_impedance) {
		String oldPhase_B_impedance = phase_B_impedance;
		phase_B_impedance = newPhase_B_impedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_BIMPEDANCE, oldPhase_B_impedance, phase_B_impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_B_resistance() {
		return phase_B_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_B_resistance(String newPhase_B_resistance) {
		String oldPhase_B_resistance = phase_B_resistance;
		phase_B_resistance = newPhase_B_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_BRESISTANCE, oldPhase_B_resistance, phase_B_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_B_reactance() {
		return phase_B_reactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_B_reactance(String newPhase_B_reactance) {
		String oldPhase_B_reactance = phase_B_reactance;
		phase_B_reactance = newPhase_B_reactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_BREACTANCE, oldPhase_B_reactance, phase_B_reactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_C_impedance() {
		return phase_C_impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_C_impedance(String newPhase_C_impedance) {
		String oldPhase_C_impedance = phase_C_impedance;
		phase_C_impedance = newPhase_C_impedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_CIMPEDANCE, oldPhase_C_impedance, phase_C_impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_C_resistance() {
		return phase_C_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_C_resistance(String newPhase_C_resistance) {
		String oldPhase_C_resistance = phase_C_resistance;
		phase_C_resistance = newPhase_C_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_CRESISTANCE, oldPhase_C_resistance, phase_C_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase_C_reactance() {
		return phase_C_reactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase_C_reactance(String newPhase_C_reactance) {
		String oldPhase_C_reactance = phase_C_reactance;
		phase_C_reactance = newPhase_C_reactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASE_CREACTANCE, oldPhase_C_reactance, phase_C_reactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_current_limit() {
		return rated_current_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_current_limit(String newRated_current_limit) {
		String oldRated_current_limit = rated_current_limit;
		rated_current_limit = newRated_current_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__RATED_CURRENT_LIMIT, oldRated_current_limit, rated_current_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_in() {
		return power_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_in(String newPower_in) {
		String oldPower_in = power_in;
		power_in = newPower_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_IN, oldPower_in, power_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_out() {
		return power_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_out(String newPower_out) {
		String oldPower_out = power_out;
		power_out = newPower_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_OUT, oldPower_out, power_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_losses() {
		return power_losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_losses(String newPower_losses) {
		String oldPower_losses = power_losses;
		power_losses = newPower_losses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_LOSSES, oldPower_losses, power_losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_in_A() {
		return power_in_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_in_A(String newPower_in_A) {
		String oldPower_in_A = power_in_A;
		power_in_A = newPower_in_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_IN_A, oldPower_in_A, power_in_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_in_B() {
		return power_in_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_in_B(String newPower_in_B) {
		String oldPower_in_B = power_in_B;
		power_in_B = newPower_in_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_IN_B, oldPower_in_B, power_in_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_in_C() {
		return power_in_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_in_C(String newPower_in_C) {
		String oldPower_in_C = power_in_C;
		power_in_C = newPower_in_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_IN_C, oldPower_in_C, power_in_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_out_A() {
		return power_out_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_out_A(String newPower_out_A) {
		String oldPower_out_A = power_out_A;
		power_out_A = newPower_out_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_OUT_A, oldPower_out_A, power_out_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_out_B() {
		return power_out_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_out_B(String newPower_out_B) {
		String oldPower_out_B = power_out_B;
		power_out_B = newPower_out_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_OUT_B, oldPower_out_B, power_out_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_out_C() {
		return power_out_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_out_C(String newPower_out_C) {
		String oldPower_out_C = power_out_C;
		power_out_C = newPower_out_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_OUT_C, oldPower_out_C, power_out_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_losses_A() {
		return power_losses_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_losses_A(String newPower_losses_A) {
		String oldPower_losses_A = power_losses_A;
		power_losses_A = newPower_losses_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_LOSSES_A, oldPower_losses_A, power_losses_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_losses_B() {
		return power_losses_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_losses_B(String newPower_losses_B) {
		String oldPower_losses_B = power_losses_B;
		power_losses_B = newPower_losses_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_LOSSES_B, oldPower_losses_B, power_losses_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_losses_C() {
		return power_losses_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_losses_C(String newPower_losses_C) {
		String oldPower_losses_C = power_losses_C;
		power_losses_C = newPower_losses_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__POWER_LOSSES_C, oldPower_losses_C, power_losses_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlow_direction() {
		return flow_direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlow_direction(String newFlow_direction) {
		String oldFlow_direction = flow_direction;
		flow_direction = newFlow_direction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__FLOW_DIRECTION, oldFlow_direction, flow_direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhases(String newPhases) {
		String oldPhases = phases;
		phases = newPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominal_voltage() {
		return nominal_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominal_voltage(String newNominal_voltage) {
		String oldNominal_voltage = nominal_voltage;
		nominal_voltage = newNominal_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SERIES_REACTOR__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.SERIES_REACTOR__PHASE_AIMPEDANCE:
				return getPhase_A_impedance();
			case VisGridPackage.SERIES_REACTOR__PHASE_ARESISTANCE:
				return getPhase_A_resistance();
			case VisGridPackage.SERIES_REACTOR__PHASE_AREACTANCE:
				return getPhase_A_reactance();
			case VisGridPackage.SERIES_REACTOR__PHASE_BIMPEDANCE:
				return getPhase_B_impedance();
			case VisGridPackage.SERIES_REACTOR__PHASE_BRESISTANCE:
				return getPhase_B_resistance();
			case VisGridPackage.SERIES_REACTOR__PHASE_BREACTANCE:
				return getPhase_B_reactance();
			case VisGridPackage.SERIES_REACTOR__PHASE_CIMPEDANCE:
				return getPhase_C_impedance();
			case VisGridPackage.SERIES_REACTOR__PHASE_CRESISTANCE:
				return getPhase_C_resistance();
			case VisGridPackage.SERIES_REACTOR__PHASE_CREACTANCE:
				return getPhase_C_reactance();
			case VisGridPackage.SERIES_REACTOR__RATED_CURRENT_LIMIT:
				return getRated_current_limit();
			case VisGridPackage.SERIES_REACTOR__STATUS:
				return getStatus();
			case VisGridPackage.SERIES_REACTOR__FROM:
				return getFrom();
			case VisGridPackage.SERIES_REACTOR__TO:
				return getTo();
			case VisGridPackage.SERIES_REACTOR__POWER_IN:
				return getPower_in();
			case VisGridPackage.SERIES_REACTOR__POWER_OUT:
				return getPower_out();
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES:
				return getPower_losses();
			case VisGridPackage.SERIES_REACTOR__POWER_IN_A:
				return getPower_in_A();
			case VisGridPackage.SERIES_REACTOR__POWER_IN_B:
				return getPower_in_B();
			case VisGridPackage.SERIES_REACTOR__POWER_IN_C:
				return getPower_in_C();
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_A:
				return getPower_out_A();
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_B:
				return getPower_out_B();
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_C:
				return getPower_out_C();
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_A:
				return getPower_losses_A();
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_B:
				return getPower_losses_B();
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_C:
				return getPower_losses_C();
			case VisGridPackage.SERIES_REACTOR__FLOW_DIRECTION:
				return getFlow_direction();
			case VisGridPackage.SERIES_REACTOR__PHASES:
				return getPhases();
			case VisGridPackage.SERIES_REACTOR__NOMINAL_VOLTAGE:
				return getNominal_voltage();
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
			case VisGridPackage.SERIES_REACTOR__PHASE_AIMPEDANCE:
				setPhase_A_impedance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_ARESISTANCE:
				setPhase_A_resistance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_AREACTANCE:
				setPhase_A_reactance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_BIMPEDANCE:
				setPhase_B_impedance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_BRESISTANCE:
				setPhase_B_resistance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_BREACTANCE:
				setPhase_B_reactance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_CIMPEDANCE:
				setPhase_C_impedance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_CRESISTANCE:
				setPhase_C_resistance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_CREACTANCE:
				setPhase_C_reactance((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__RATED_CURRENT_LIMIT:
				setRated_current_limit((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__STATUS:
				setStatus((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__FROM:
				setFrom((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__TO:
				setTo((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN:
				setPower_in((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT:
				setPower_out((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES:
				setPower_losses((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN_A:
				setPower_in_A((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN_B:
				setPower_in_B((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN_C:
				setPower_in_C((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_A:
				setPower_out_A((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_B:
				setPower_out_B((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_C:
				setPower_out_C((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_A:
				setPower_losses_A((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_B:
				setPower_losses_B((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_C:
				setPower_losses_C((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__FLOW_DIRECTION:
				setFlow_direction((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.SERIES_REACTOR__NOMINAL_VOLTAGE:
				setNominal_voltage((String)newValue);
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
			case VisGridPackage.SERIES_REACTOR__PHASE_AIMPEDANCE:
				setPhase_A_impedance(PHASE_AIMPEDANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_ARESISTANCE:
				setPhase_A_resistance(PHASE_ARESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_AREACTANCE:
				setPhase_A_reactance(PHASE_AREACTANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_BIMPEDANCE:
				setPhase_B_impedance(PHASE_BIMPEDANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_BRESISTANCE:
				setPhase_B_resistance(PHASE_BRESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_BREACTANCE:
				setPhase_B_reactance(PHASE_BREACTANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_CIMPEDANCE:
				setPhase_C_impedance(PHASE_CIMPEDANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_CRESISTANCE:
				setPhase_C_resistance(PHASE_CRESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASE_CREACTANCE:
				setPhase_C_reactance(PHASE_CREACTANCE_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__RATED_CURRENT_LIMIT:
				setRated_current_limit(RATED_CURRENT_LIMIT_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__TO:
				setTo(TO_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN:
				setPower_in(POWER_IN_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT:
				setPower_out(POWER_OUT_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES:
				setPower_losses(POWER_LOSSES_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN_A:
				setPower_in_A(POWER_IN_A_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN_B:
				setPower_in_B(POWER_IN_B_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_IN_C:
				setPower_in_C(POWER_IN_C_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_A:
				setPower_out_A(POWER_OUT_A_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_B:
				setPower_out_B(POWER_OUT_B_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_C:
				setPower_out_C(POWER_OUT_C_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_A:
				setPower_losses_A(POWER_LOSSES_A_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_B:
				setPower_losses_B(POWER_LOSSES_B_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_C:
				setPower_losses_C(POWER_LOSSES_C_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__FLOW_DIRECTION:
				setFlow_direction(FLOW_DIRECTION_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.SERIES_REACTOR__NOMINAL_VOLTAGE:
				setNominal_voltage(NOMINAL_VOLTAGE_EDEFAULT);
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
			case VisGridPackage.SERIES_REACTOR__PHASE_AIMPEDANCE:
				return PHASE_AIMPEDANCE_EDEFAULT == null ? phase_A_impedance != null : !PHASE_AIMPEDANCE_EDEFAULT.equals(phase_A_impedance);
			case VisGridPackage.SERIES_REACTOR__PHASE_ARESISTANCE:
				return PHASE_ARESISTANCE_EDEFAULT == null ? phase_A_resistance != null : !PHASE_ARESISTANCE_EDEFAULT.equals(phase_A_resistance);
			case VisGridPackage.SERIES_REACTOR__PHASE_AREACTANCE:
				return PHASE_AREACTANCE_EDEFAULT == null ? phase_A_reactance != null : !PHASE_AREACTANCE_EDEFAULT.equals(phase_A_reactance);
			case VisGridPackage.SERIES_REACTOR__PHASE_BIMPEDANCE:
				return PHASE_BIMPEDANCE_EDEFAULT == null ? phase_B_impedance != null : !PHASE_BIMPEDANCE_EDEFAULT.equals(phase_B_impedance);
			case VisGridPackage.SERIES_REACTOR__PHASE_BRESISTANCE:
				return PHASE_BRESISTANCE_EDEFAULT == null ? phase_B_resistance != null : !PHASE_BRESISTANCE_EDEFAULT.equals(phase_B_resistance);
			case VisGridPackage.SERIES_REACTOR__PHASE_BREACTANCE:
				return PHASE_BREACTANCE_EDEFAULT == null ? phase_B_reactance != null : !PHASE_BREACTANCE_EDEFAULT.equals(phase_B_reactance);
			case VisGridPackage.SERIES_REACTOR__PHASE_CIMPEDANCE:
				return PHASE_CIMPEDANCE_EDEFAULT == null ? phase_C_impedance != null : !PHASE_CIMPEDANCE_EDEFAULT.equals(phase_C_impedance);
			case VisGridPackage.SERIES_REACTOR__PHASE_CRESISTANCE:
				return PHASE_CRESISTANCE_EDEFAULT == null ? phase_C_resistance != null : !PHASE_CRESISTANCE_EDEFAULT.equals(phase_C_resistance);
			case VisGridPackage.SERIES_REACTOR__PHASE_CREACTANCE:
				return PHASE_CREACTANCE_EDEFAULT == null ? phase_C_reactance != null : !PHASE_CREACTANCE_EDEFAULT.equals(phase_C_reactance);
			case VisGridPackage.SERIES_REACTOR__RATED_CURRENT_LIMIT:
				return RATED_CURRENT_LIMIT_EDEFAULT == null ? rated_current_limit != null : !RATED_CURRENT_LIMIT_EDEFAULT.equals(rated_current_limit);
			case VisGridPackage.SERIES_REACTOR__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case VisGridPackage.SERIES_REACTOR__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case VisGridPackage.SERIES_REACTOR__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case VisGridPackage.SERIES_REACTOR__POWER_IN:
				return POWER_IN_EDEFAULT == null ? power_in != null : !POWER_IN_EDEFAULT.equals(power_in);
			case VisGridPackage.SERIES_REACTOR__POWER_OUT:
				return POWER_OUT_EDEFAULT == null ? power_out != null : !POWER_OUT_EDEFAULT.equals(power_out);
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES:
				return POWER_LOSSES_EDEFAULT == null ? power_losses != null : !POWER_LOSSES_EDEFAULT.equals(power_losses);
			case VisGridPackage.SERIES_REACTOR__POWER_IN_A:
				return POWER_IN_A_EDEFAULT == null ? power_in_A != null : !POWER_IN_A_EDEFAULT.equals(power_in_A);
			case VisGridPackage.SERIES_REACTOR__POWER_IN_B:
				return POWER_IN_B_EDEFAULT == null ? power_in_B != null : !POWER_IN_B_EDEFAULT.equals(power_in_B);
			case VisGridPackage.SERIES_REACTOR__POWER_IN_C:
				return POWER_IN_C_EDEFAULT == null ? power_in_C != null : !POWER_IN_C_EDEFAULT.equals(power_in_C);
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_A:
				return POWER_OUT_A_EDEFAULT == null ? power_out_A != null : !POWER_OUT_A_EDEFAULT.equals(power_out_A);
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_B:
				return POWER_OUT_B_EDEFAULT == null ? power_out_B != null : !POWER_OUT_B_EDEFAULT.equals(power_out_B);
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_C:
				return POWER_OUT_C_EDEFAULT == null ? power_out_C != null : !POWER_OUT_C_EDEFAULT.equals(power_out_C);
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_A:
				return POWER_LOSSES_A_EDEFAULT == null ? power_losses_A != null : !POWER_LOSSES_A_EDEFAULT.equals(power_losses_A);
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_B:
				return POWER_LOSSES_B_EDEFAULT == null ? power_losses_B != null : !POWER_LOSSES_B_EDEFAULT.equals(power_losses_B);
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_C:
				return POWER_LOSSES_C_EDEFAULT == null ? power_losses_C != null : !POWER_LOSSES_C_EDEFAULT.equals(power_losses_C);
			case VisGridPackage.SERIES_REACTOR__FLOW_DIRECTION:
				return FLOW_DIRECTION_EDEFAULT == null ? flow_direction != null : !FLOW_DIRECTION_EDEFAULT.equals(flow_direction);
			case VisGridPackage.SERIES_REACTOR__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.SERIES_REACTOR__NOMINAL_VOLTAGE:
				return NOMINAL_VOLTAGE_EDEFAULT == null ? nominal_voltage != null : !NOMINAL_VOLTAGE_EDEFAULT.equals(nominal_voltage);
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
		result.append(" (phase_A_impedance: ");
		result.append(phase_A_impedance);
		result.append(", phase_A_resistance: ");
		result.append(phase_A_resistance);
		result.append(", phase_A_reactance: ");
		result.append(phase_A_reactance);
		result.append(", phase_B_impedance: ");
		result.append(phase_B_impedance);
		result.append(", phase_B_resistance: ");
		result.append(phase_B_resistance);
		result.append(", phase_B_reactance: ");
		result.append(phase_B_reactance);
		result.append(", phase_C_impedance: ");
		result.append(phase_C_impedance);
		result.append(", phase_C_resistance: ");
		result.append(phase_C_resistance);
		result.append(", phase_C_reactance: ");
		result.append(phase_C_reactance);
		result.append(", rated_current_limit: ");
		result.append(rated_current_limit);
		result.append(", status: ");
		result.append(status);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", power_in: ");
		result.append(power_in);
		result.append(", power_out: ");
		result.append(power_out);
		result.append(", power_losses: ");
		result.append(power_losses);
		result.append(", power_in_A: ");
		result.append(power_in_A);
		result.append(", power_in_B: ");
		result.append(power_in_B);
		result.append(", power_in_C: ");
		result.append(power_in_C);
		result.append(", power_out_A: ");
		result.append(power_out_A);
		result.append(", power_out_B: ");
		result.append(power_out_B);
		result.append(", power_out_C: ");
		result.append(power_out_C);
		result.append(", power_losses_A: ");
		result.append(power_losses_A);
		result.append(", power_losses_B: ");
		result.append(power_losses_B);
		result.append(", power_losses_C: ");
		result.append(power_losses_C);
		result.append(", flow_direction: ");
		result.append(flow_direction);
		result.append(", phases: ");
		result.append(phases);
		result.append(", nominal_voltage: ");
		result.append(nominal_voltage);
		result.append(')');
		return result.toString();
	}

} //Series_reactorImpl
