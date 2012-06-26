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
import visGrid.Overhead_line;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overhead line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getLength <em>Length</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getFrom <em>From</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getTo <em>To</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_in <em>Power in</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_out <em>Power out</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_losses <em>Power losses</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_in_A <em>Power in A</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_in_B <em>Power in B</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_in_C <em>Power in C</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_out_A <em>Power out A</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_out_B <em>Power out B</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_out_C <em>Power out C</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_losses_A <em>Power losses A</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_losses_B <em>Power losses B</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPower_losses_C <em>Power losses C</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getFlow_direction <em>Flow direction</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.Overhead_lineImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Overhead_lineImpl extends EObjectImpl implements Overhead_line {
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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

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
	protected Overhead_lineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getOverhead_line();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.OVERHEAD_LINE__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__CONFIGURATION, oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__TO, oldTo, to));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_IN, oldPower_in, power_in));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_OUT, oldPower_out, power_out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_LOSSES, oldPower_losses, power_losses));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_IN_A, oldPower_in_A, power_in_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_IN_B, oldPower_in_B, power_in_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_IN_C, oldPower_in_C, power_in_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_OUT_A, oldPower_out_A, power_out_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_OUT_B, oldPower_out_B, power_out_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_OUT_C, oldPower_out_C, power_out_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_A, oldPower_losses_A, power_losses_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_B, oldPower_losses_B, power_losses_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_C, oldPower_losses_C, power_losses_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__FLOW_DIRECTION, oldFlow_direction, flow_direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__PHASES, oldPhases, phases));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.OVERHEAD_LINE__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.OVERHEAD_LINE__CONNECTION:
				return getConnection();
			case VisGridPackage.OVERHEAD_LINE__NAME:
				return getName();
			case VisGridPackage.OVERHEAD_LINE__CONFIGURATION:
				return getConfiguration();
			case VisGridPackage.OVERHEAD_LINE__LENGTH:
				return getLength();
			case VisGridPackage.OVERHEAD_LINE__STATUS:
				return getStatus();
			case VisGridPackage.OVERHEAD_LINE__FROM:
				return getFrom();
			case VisGridPackage.OVERHEAD_LINE__TO:
				return getTo();
			case VisGridPackage.OVERHEAD_LINE__POWER_IN:
				return getPower_in();
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT:
				return getPower_out();
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES:
				return getPower_losses();
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_A:
				return getPower_in_A();
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_B:
				return getPower_in_B();
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_C:
				return getPower_in_C();
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_A:
				return getPower_out_A();
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_B:
				return getPower_out_B();
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_C:
				return getPower_out_C();
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_A:
				return getPower_losses_A();
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_B:
				return getPower_losses_B();
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_C:
				return getPower_losses_C();
			case VisGridPackage.OVERHEAD_LINE__FLOW_DIRECTION:
				return getFlow_direction();
			case VisGridPackage.OVERHEAD_LINE__PHASES:
				return getPhases();
			case VisGridPackage.OVERHEAD_LINE__NOMINAL_VOLTAGE:
				return getNominal_voltage();
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
			case VisGridPackage.OVERHEAD_LINE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__CONFIGURATION:
				setConfiguration((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__LENGTH:
				setLength((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__STATUS:
				setStatus((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__FROM:
				setFrom((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__TO:
				setTo((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN:
				setPower_in((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT:
				setPower_out((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES:
				setPower_losses((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_A:
				setPower_in_A((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_B:
				setPower_in_B((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_C:
				setPower_in_C((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_A:
				setPower_out_A((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_B:
				setPower_out_B((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_C:
				setPower_out_C((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_A:
				setPower_losses_A((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_B:
				setPower_losses_B((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_C:
				setPower_losses_C((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__FLOW_DIRECTION:
				setFlow_direction((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.OVERHEAD_LINE__NOMINAL_VOLTAGE:
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
			case VisGridPackage.OVERHEAD_LINE__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.OVERHEAD_LINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__CONFIGURATION:
				setConfiguration(CONFIGURATION_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__TO:
				setTo(TO_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN:
				setPower_in(POWER_IN_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT:
				setPower_out(POWER_OUT_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES:
				setPower_losses(POWER_LOSSES_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_A:
				setPower_in_A(POWER_IN_A_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_B:
				setPower_in_B(POWER_IN_B_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_C:
				setPower_in_C(POWER_IN_C_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_A:
				setPower_out_A(POWER_OUT_A_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_B:
				setPower_out_B(POWER_OUT_B_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_C:
				setPower_out_C(POWER_OUT_C_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_A:
				setPower_losses_A(POWER_LOSSES_A_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_B:
				setPower_losses_B(POWER_LOSSES_B_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_C:
				setPower_losses_C(POWER_LOSSES_C_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__FLOW_DIRECTION:
				setFlow_direction(FLOW_DIRECTION_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.OVERHEAD_LINE__NOMINAL_VOLTAGE:
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
			case VisGridPackage.OVERHEAD_LINE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.OVERHEAD_LINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.OVERHEAD_LINE__CONFIGURATION:
				return CONFIGURATION_EDEFAULT == null ? configuration != null : !CONFIGURATION_EDEFAULT.equals(configuration);
			case VisGridPackage.OVERHEAD_LINE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case VisGridPackage.OVERHEAD_LINE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case VisGridPackage.OVERHEAD_LINE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case VisGridPackage.OVERHEAD_LINE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case VisGridPackage.OVERHEAD_LINE__POWER_IN:
				return POWER_IN_EDEFAULT == null ? power_in != null : !POWER_IN_EDEFAULT.equals(power_in);
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT:
				return POWER_OUT_EDEFAULT == null ? power_out != null : !POWER_OUT_EDEFAULT.equals(power_out);
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES:
				return POWER_LOSSES_EDEFAULT == null ? power_losses != null : !POWER_LOSSES_EDEFAULT.equals(power_losses);
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_A:
				return POWER_IN_A_EDEFAULT == null ? power_in_A != null : !POWER_IN_A_EDEFAULT.equals(power_in_A);
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_B:
				return POWER_IN_B_EDEFAULT == null ? power_in_B != null : !POWER_IN_B_EDEFAULT.equals(power_in_B);
			case VisGridPackage.OVERHEAD_LINE__POWER_IN_C:
				return POWER_IN_C_EDEFAULT == null ? power_in_C != null : !POWER_IN_C_EDEFAULT.equals(power_in_C);
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_A:
				return POWER_OUT_A_EDEFAULT == null ? power_out_A != null : !POWER_OUT_A_EDEFAULT.equals(power_out_A);
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_B:
				return POWER_OUT_B_EDEFAULT == null ? power_out_B != null : !POWER_OUT_B_EDEFAULT.equals(power_out_B);
			case VisGridPackage.OVERHEAD_LINE__POWER_OUT_C:
				return POWER_OUT_C_EDEFAULT == null ? power_out_C != null : !POWER_OUT_C_EDEFAULT.equals(power_out_C);
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_A:
				return POWER_LOSSES_A_EDEFAULT == null ? power_losses_A != null : !POWER_LOSSES_A_EDEFAULT.equals(power_losses_A);
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_B:
				return POWER_LOSSES_B_EDEFAULT == null ? power_losses_B != null : !POWER_LOSSES_B_EDEFAULT.equals(power_losses_B);
			case VisGridPackage.OVERHEAD_LINE__POWER_LOSSES_C:
				return POWER_LOSSES_C_EDEFAULT == null ? power_losses_C != null : !POWER_LOSSES_C_EDEFAULT.equals(power_losses_C);
			case VisGridPackage.OVERHEAD_LINE__FLOW_DIRECTION:
				return FLOW_DIRECTION_EDEFAULT == null ? flow_direction != null : !FLOW_DIRECTION_EDEFAULT.equals(flow_direction);
			case VisGridPackage.OVERHEAD_LINE__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.OVERHEAD_LINE__NOMINAL_VOLTAGE:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(", length: ");
		result.append(length);
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

} //Overhead_lineImpl