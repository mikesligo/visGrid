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
import visGrid.Meter;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.MeterImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getMeter <em>Meter</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine1_current <em>Line1 current</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine2_current <em>Line2 current</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine3_current <em>Line3 current</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine1_admittance <em>Line1 admittance</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine2_admittance <em>Line2 admittance</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine3_admittance <em>Line3 admittance</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine1_power <em>Line1 power</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine2_power <em>Line2 power</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine3_power <em>Line3 power</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine1_volts <em>Line1 volts</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine2_volts <em>Line2 volts</em>}</li>
 *   <li>{@link visGrid.impl.MeterImpl#getLine3_volts <em>Line3 volts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeterImpl extends EObjectImpl implements Meter {
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
	 * The default value of the '{@link #getMeter() <em>Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected static final String METER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected String meter = METER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine1_current() <em>Line1 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_current()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE1_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine1_current() <em>Line1 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_current()
	 * @generated
	 * @ordered
	 */
	protected String line1_current = LINE1_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine2_current() <em>Line2 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_current()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE2_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine2_current() <em>Line2 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_current()
	 * @generated
	 * @ordered
	 */
	protected String line2_current = LINE2_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine3_current() <em>Line3 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_current()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE3_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine3_current() <em>Line3 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_current()
	 * @generated
	 * @ordered
	 */
	protected String line3_current = LINE3_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine1_admittance() <em>Line1 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE1_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine1_admittance() <em>Line1 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_admittance()
	 * @generated
	 * @ordered
	 */
	protected String line1_admittance = LINE1_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine2_admittance() <em>Line2 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE2_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine2_admittance() <em>Line2 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_admittance()
	 * @generated
	 * @ordered
	 */
	protected String line2_admittance = LINE2_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine3_admittance() <em>Line3 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_admittance()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE3_ADMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine3_admittance() <em>Line3 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_admittance()
	 * @generated
	 * @ordered
	 */
	protected String line3_admittance = LINE3_ADMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine1_power() <em>Line1 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_power()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE1_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine1_power() <em>Line1 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_power()
	 * @generated
	 * @ordered
	 */
	protected String line1_power = LINE1_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine2_power() <em>Line2 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_power()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE2_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine2_power() <em>Line2 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_power()
	 * @generated
	 * @ordered
	 */
	protected String line2_power = LINE2_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine3_power() <em>Line3 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_power()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE3_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine3_power() <em>Line3 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_power()
	 * @generated
	 * @ordered
	 */
	protected String line3_power = LINE3_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine1_volts() <em>Line1 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_volts()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE1_VOLTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine1_volts() <em>Line1 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine1_volts()
	 * @generated
	 * @ordered
	 */
	protected String line1_volts = LINE1_VOLTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine2_volts() <em>Line2 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_volts()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE2_VOLTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine2_volts() <em>Line2 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine2_volts()
	 * @generated
	 * @ordered
	 */
	protected String line2_volts = LINE2_VOLTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine3_volts() <em>Line3 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_volts()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE3_VOLTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLine3_volts() <em>Line3 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine3_volts()
	 * @generated
	 * @ordered
	 */
	protected String line3_volts = LINE3_VOLTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getMeter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.METER__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__DEMAND, oldDemand, demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeter() {
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeter(String newMeter) {
		String oldMeter = meter;
		meter = newMeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__METER, oldMeter, meter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine1_current() {
		return line1_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine1_current(String newLine1_current) {
		String oldLine1_current = line1_current;
		line1_current = newLine1_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE1_CURRENT, oldLine1_current, line1_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine2_current() {
		return line2_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine2_current(String newLine2_current) {
		String oldLine2_current = line2_current;
		line2_current = newLine2_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE2_CURRENT, oldLine2_current, line2_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine3_current() {
		return line3_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine3_current(String newLine3_current) {
		String oldLine3_current = line3_current;
		line3_current = newLine3_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE3_CURRENT, oldLine3_current, line3_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine1_admittance() {
		return line1_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine1_admittance(String newLine1_admittance) {
		String oldLine1_admittance = line1_admittance;
		line1_admittance = newLine1_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE1_ADMITTANCE, oldLine1_admittance, line1_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine2_admittance() {
		return line2_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine2_admittance(String newLine2_admittance) {
		String oldLine2_admittance = line2_admittance;
		line2_admittance = newLine2_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE2_ADMITTANCE, oldLine2_admittance, line2_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine3_admittance() {
		return line3_admittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine3_admittance(String newLine3_admittance) {
		String oldLine3_admittance = line3_admittance;
		line3_admittance = newLine3_admittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE3_ADMITTANCE, oldLine3_admittance, line3_admittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine1_power() {
		return line1_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine1_power(String newLine1_power) {
		String oldLine1_power = line1_power;
		line1_power = newLine1_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE1_POWER, oldLine1_power, line1_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine2_power() {
		return line2_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine2_power(String newLine2_power) {
		String oldLine2_power = line2_power;
		line2_power = newLine2_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE2_POWER, oldLine2_power, line2_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine3_power() {
		return line3_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine3_power(String newLine3_power) {
		String oldLine3_power = line3_power;
		line3_power = newLine3_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE3_POWER, oldLine3_power, line3_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine1_volts() {
		return line1_volts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine1_volts(String newLine1_volts) {
		String oldLine1_volts = line1_volts;
		line1_volts = newLine1_volts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE1_VOLTS, oldLine1_volts, line1_volts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine2_volts() {
		return line2_volts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine2_volts(String newLine2_volts) {
		String oldLine2_volts = line2_volts;
		line2_volts = newLine2_volts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE2_VOLTS, oldLine2_volts, line2_volts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLine3_volts() {
		return line3_volts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine3_volts(String newLine3_volts) {
		String oldLine3_volts = line3_volts;
		line3_volts = newLine3_volts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.METER__LINE3_VOLTS, oldLine3_volts, line3_volts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.METER__CONNECTION:
				return getConnection();
			case VisGridPackage.METER__NAME:
				return getName();
			case VisGridPackage.METER__TYPE:
				return getType();
			case VisGridPackage.METER__DEMAND:
				return getDemand();
			case VisGridPackage.METER__METER:
				return getMeter();
			case VisGridPackage.METER__LINE1_CURRENT:
				return getLine1_current();
			case VisGridPackage.METER__LINE2_CURRENT:
				return getLine2_current();
			case VisGridPackage.METER__LINE3_CURRENT:
				return getLine3_current();
			case VisGridPackage.METER__LINE1_ADMITTANCE:
				return getLine1_admittance();
			case VisGridPackage.METER__LINE2_ADMITTANCE:
				return getLine2_admittance();
			case VisGridPackage.METER__LINE3_ADMITTANCE:
				return getLine3_admittance();
			case VisGridPackage.METER__LINE1_POWER:
				return getLine1_power();
			case VisGridPackage.METER__LINE2_POWER:
				return getLine2_power();
			case VisGridPackage.METER__LINE3_POWER:
				return getLine3_power();
			case VisGridPackage.METER__LINE1_VOLTS:
				return getLine1_volts();
			case VisGridPackage.METER__LINE2_VOLTS:
				return getLine2_volts();
			case VisGridPackage.METER__LINE3_VOLTS:
				return getLine3_volts();
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
			case VisGridPackage.METER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.METER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.METER__TYPE:
				setType((String)newValue);
				return;
			case VisGridPackage.METER__DEMAND:
				setDemand((String)newValue);
				return;
			case VisGridPackage.METER__METER:
				setMeter((String)newValue);
				return;
			case VisGridPackage.METER__LINE1_CURRENT:
				setLine1_current((String)newValue);
				return;
			case VisGridPackage.METER__LINE2_CURRENT:
				setLine2_current((String)newValue);
				return;
			case VisGridPackage.METER__LINE3_CURRENT:
				setLine3_current((String)newValue);
				return;
			case VisGridPackage.METER__LINE1_ADMITTANCE:
				setLine1_admittance((String)newValue);
				return;
			case VisGridPackage.METER__LINE2_ADMITTANCE:
				setLine2_admittance((String)newValue);
				return;
			case VisGridPackage.METER__LINE3_ADMITTANCE:
				setLine3_admittance((String)newValue);
				return;
			case VisGridPackage.METER__LINE1_POWER:
				setLine1_power((String)newValue);
				return;
			case VisGridPackage.METER__LINE2_POWER:
				setLine2_power((String)newValue);
				return;
			case VisGridPackage.METER__LINE3_POWER:
				setLine3_power((String)newValue);
				return;
			case VisGridPackage.METER__LINE1_VOLTS:
				setLine1_volts((String)newValue);
				return;
			case VisGridPackage.METER__LINE2_VOLTS:
				setLine2_volts((String)newValue);
				return;
			case VisGridPackage.METER__LINE3_VOLTS:
				setLine3_volts((String)newValue);
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
			case VisGridPackage.METER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.METER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.METER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VisGridPackage.METER__DEMAND:
				setDemand(DEMAND_EDEFAULT);
				return;
			case VisGridPackage.METER__METER:
				setMeter(METER_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE1_CURRENT:
				setLine1_current(LINE1_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE2_CURRENT:
				setLine2_current(LINE2_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE3_CURRENT:
				setLine3_current(LINE3_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE1_ADMITTANCE:
				setLine1_admittance(LINE1_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE2_ADMITTANCE:
				setLine2_admittance(LINE2_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE3_ADMITTANCE:
				setLine3_admittance(LINE3_ADMITTANCE_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE1_POWER:
				setLine1_power(LINE1_POWER_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE2_POWER:
				setLine2_power(LINE2_POWER_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE3_POWER:
				setLine3_power(LINE3_POWER_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE1_VOLTS:
				setLine1_volts(LINE1_VOLTS_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE2_VOLTS:
				setLine2_volts(LINE2_VOLTS_EDEFAULT);
				return;
			case VisGridPackage.METER__LINE3_VOLTS:
				setLine3_volts(LINE3_VOLTS_EDEFAULT);
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
			case VisGridPackage.METER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.METER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.METER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VisGridPackage.METER__DEMAND:
				return DEMAND_EDEFAULT == null ? demand != null : !DEMAND_EDEFAULT.equals(demand);
			case VisGridPackage.METER__METER:
				return METER_EDEFAULT == null ? meter != null : !METER_EDEFAULT.equals(meter);
			case VisGridPackage.METER__LINE1_CURRENT:
				return LINE1_CURRENT_EDEFAULT == null ? line1_current != null : !LINE1_CURRENT_EDEFAULT.equals(line1_current);
			case VisGridPackage.METER__LINE2_CURRENT:
				return LINE2_CURRENT_EDEFAULT == null ? line2_current != null : !LINE2_CURRENT_EDEFAULT.equals(line2_current);
			case VisGridPackage.METER__LINE3_CURRENT:
				return LINE3_CURRENT_EDEFAULT == null ? line3_current != null : !LINE3_CURRENT_EDEFAULT.equals(line3_current);
			case VisGridPackage.METER__LINE1_ADMITTANCE:
				return LINE1_ADMITTANCE_EDEFAULT == null ? line1_admittance != null : !LINE1_ADMITTANCE_EDEFAULT.equals(line1_admittance);
			case VisGridPackage.METER__LINE2_ADMITTANCE:
				return LINE2_ADMITTANCE_EDEFAULT == null ? line2_admittance != null : !LINE2_ADMITTANCE_EDEFAULT.equals(line2_admittance);
			case VisGridPackage.METER__LINE3_ADMITTANCE:
				return LINE3_ADMITTANCE_EDEFAULT == null ? line3_admittance != null : !LINE3_ADMITTANCE_EDEFAULT.equals(line3_admittance);
			case VisGridPackage.METER__LINE1_POWER:
				return LINE1_POWER_EDEFAULT == null ? line1_power != null : !LINE1_POWER_EDEFAULT.equals(line1_power);
			case VisGridPackage.METER__LINE2_POWER:
				return LINE2_POWER_EDEFAULT == null ? line2_power != null : !LINE2_POWER_EDEFAULT.equals(line2_power);
			case VisGridPackage.METER__LINE3_POWER:
				return LINE3_POWER_EDEFAULT == null ? line3_power != null : !LINE3_POWER_EDEFAULT.equals(line3_power);
			case VisGridPackage.METER__LINE1_VOLTS:
				return LINE1_VOLTS_EDEFAULT == null ? line1_volts != null : !LINE1_VOLTS_EDEFAULT.equals(line1_volts);
			case VisGridPackage.METER__LINE2_VOLTS:
				return LINE2_VOLTS_EDEFAULT == null ? line2_volts != null : !LINE2_VOLTS_EDEFAULT.equals(line2_volts);
			case VisGridPackage.METER__LINE3_VOLTS:
				return LINE3_VOLTS_EDEFAULT == null ? line3_volts != null : !LINE3_VOLTS_EDEFAULT.equals(line3_volts);
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
		result.append(", type: ");
		result.append(type);
		result.append(", demand: ");
		result.append(demand);
		result.append(", meter: ");
		result.append(meter);
		result.append(", line1_current: ");
		result.append(line1_current);
		result.append(", line2_current: ");
		result.append(line2_current);
		result.append(", line3_current: ");
		result.append(line3_current);
		result.append(", line1_admittance: ");
		result.append(line1_admittance);
		result.append(", line2_admittance: ");
		result.append(line2_admittance);
		result.append(", line3_admittance: ");
		result.append(line3_admittance);
		result.append(", line1_power: ");
		result.append(line1_power);
		result.append(", line2_power: ");
		result.append(line2_power);
		result.append(", line3_power: ");
		result.append(line3_power);
		result.append(", line1_volts: ");
		result.append(line1_volts);
		result.append(", line2_volts: ");
		result.append(line2_volts);
		result.append(", line3_volts: ");
		result.append(line3_volts);
		result.append(')');
		return result.toString();
	}

} //MeterImpl