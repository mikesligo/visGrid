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
import visGrid.Transformer_configuration;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getConnect_type <em>Connect type</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getInstall_type <em>Install type</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getPrimary_voltage <em>Primary voltage</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getSecondary_voltage <em>Secondary voltage</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getPower_rating <em>Power rating</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getPowerA_rating <em>Power Arating</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getPowerB_rating <em>Power Brating</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getPowerC_rating <em>Power Crating</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getReactance <em>Reactance</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getImpedance <em>Impedance</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getResistance1 <em>Resistance1</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getReactance1 <em>Reactance1</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getImpedance1 <em>Impedance1</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getResistance2 <em>Resistance2</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getReactance2 <em>Reactance2</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getImpedance2 <em>Impedance2</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getShunt_resistance <em>Shunt resistance</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getShunt_reactance <em>Shunt reactance</em>}</li>
 *   <li>{@link visGrid.impl.Transformer_configurationImpl#getShunt_impedance <em>Shunt impedance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Transformer_configurationImpl extends EObjectImpl implements Transformer_configuration {
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
	 * The default value of the '{@link #getInstall_type() <em>Install type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstall_type()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstall_type() <em>Install type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstall_type()
	 * @generated
	 * @ordered
	 */
	protected String install_type = INSTALL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimary_voltage() <em>Primary voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimary_voltage() <em>Primary voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary_voltage()
	 * @generated
	 * @ordered
	 */
	protected String primary_voltage = PRIMARY_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondary_voltage() <em>Secondary voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondary_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDARY_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondary_voltage() <em>Secondary voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondary_voltage()
	 * @generated
	 * @ordered
	 */
	protected String secondary_voltage = SECONDARY_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_rating() <em>Power rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_rating()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_rating() <em>Power rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_rating()
	 * @generated
	 * @ordered
	 */
	protected String power_rating = POWER_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerA_rating() <em>Power Arating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerA_rating()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_ARATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerA_rating() <em>Power Arating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerA_rating()
	 * @generated
	 * @ordered
	 */
	protected String powerA_rating = POWER_ARATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerB_rating() <em>Power Brating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerB_rating()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_BRATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerB_rating() <em>Power Brating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerB_rating()
	 * @generated
	 * @ordered
	 */
	protected String powerB_rating = POWER_BRATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerC_rating() <em>Power Crating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerC_rating()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_CRATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerC_rating() <em>Power Crating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerC_rating()
	 * @generated
	 * @ordered
	 */
	protected String powerC_rating = POWER_CRATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected static final String RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected String resistance = RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactance() <em>Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactance()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactance() <em>Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactance()
	 * @generated
	 * @ordered
	 */
	protected String reactance = REACTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance() <em>Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance() <em>Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance()
	 * @generated
	 * @ordered
	 */
	protected String impedance = IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistance1() <em>Resistance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance1()
	 * @generated
	 * @ordered
	 */
	protected static final String RESISTANCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResistance1() <em>Resistance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance1()
	 * @generated
	 * @ordered
	 */
	protected String resistance1 = RESISTANCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactance1() <em>Reactance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactance1()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTANCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactance1() <em>Reactance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactance1()
	 * @generated
	 * @ordered
	 */
	protected String reactance1 = REACTANCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance1() <em>Impedance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance1()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance1() <em>Impedance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance1()
	 * @generated
	 * @ordered
	 */
	protected String impedance1 = IMPEDANCE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getResistance2() <em>Resistance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance2()
	 * @generated
	 * @ordered
	 */
	protected static final String RESISTANCE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResistance2() <em>Resistance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance2()
	 * @generated
	 * @ordered
	 */
	protected String resistance2 = RESISTANCE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactance2() <em>Reactance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactance2()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTANCE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactance2() <em>Reactance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactance2()
	 * @generated
	 * @ordered
	 */
	protected String reactance2 = REACTANCE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpedance2() <em>Impedance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance2()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPEDANCE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpedance2() <em>Impedance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpedance2()
	 * @generated
	 * @ordered
	 */
	protected String impedance2 = IMPEDANCE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_resistance() <em>Shunt resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_resistance()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_resistance() <em>Shunt resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_resistance()
	 * @generated
	 * @ordered
	 */
	protected String shunt_resistance = SHUNT_RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_reactance() <em>Shunt reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_reactance()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_REACTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_reactance() <em>Shunt reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_reactance()
	 * @generated
	 * @ordered
	 */
	protected String shunt_reactance = SHUNT_REACTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_impedance() <em>Shunt impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_impedance()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_IMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_impedance() <em>Shunt impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_impedance()
	 * @generated
	 * @ordered
	 */
	protected String shunt_impedance = SHUNT_IMPEDANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformer_configurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getTransformer_configuration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE, oldConnect_type, connect_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstall_type() {
		return install_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstall_type(String newInstall_type) {
		String oldInstall_type = install_type;
		install_type = newInstall_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE, oldInstall_type, install_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrimary_voltage() {
		return primary_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary_voltage(String newPrimary_voltage) {
		String oldPrimary_voltage = primary_voltage;
		primary_voltage = newPrimary_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE, oldPrimary_voltage, primary_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondary_voltage() {
		return secondary_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondary_voltage(String newSecondary_voltage) {
		String oldSecondary_voltage = secondary_voltage;
		secondary_voltage = newSecondary_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE, oldSecondary_voltage, secondary_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_rating() {
		return power_rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_rating(String newPower_rating) {
		String oldPower_rating = power_rating;
		power_rating = newPower_rating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING, oldPower_rating, power_rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerA_rating() {
		return powerA_rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerA_rating(String newPowerA_rating) {
		String oldPowerA_rating = powerA_rating;
		powerA_rating = newPowerA_rating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_ARATING, oldPowerA_rating, powerA_rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerB_rating() {
		return powerB_rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerB_rating(String newPowerB_rating) {
		String oldPowerB_rating = powerB_rating;
		powerB_rating = newPowerB_rating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_BRATING, oldPowerB_rating, powerB_rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerC_rating() {
		return powerC_rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerC_rating(String newPowerC_rating) {
		String oldPowerC_rating = powerC_rating;
		powerC_rating = newPowerC_rating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_CRATING, oldPowerC_rating, powerC_rating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResistance() {
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance(String newResistance) {
		String oldResistance = resistance;
		resistance = newResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE, oldResistance, resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactance() {
		return reactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactance(String newReactance) {
		String oldReactance = reactance;
		reactance = newReactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE, oldReactance, reactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance() {
		return impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance(String newImpedance) {
		String oldImpedance = impedance;
		impedance = newImpedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE, oldImpedance, impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResistance1() {
		return resistance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance1(String newResistance1) {
		String oldResistance1 = resistance1;
		resistance1 = newResistance1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE1, oldResistance1, resistance1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactance1() {
		return reactance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactance1(String newReactance1) {
		String oldReactance1 = reactance1;
		reactance1 = newReactance1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE1, oldReactance1, reactance1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance1() {
		return impedance1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance1(String newImpedance1) {
		String oldImpedance1 = impedance1;
		impedance1 = newImpedance1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE1, oldImpedance1, impedance1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResistance2() {
		return resistance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance2(String newResistance2) {
		String oldResistance2 = resistance2;
		resistance2 = newResistance2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE2, oldResistance2, resistance2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactance2() {
		return reactance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactance2(String newReactance2) {
		String oldReactance2 = reactance2;
		reactance2 = newReactance2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE2, oldReactance2, reactance2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpedance2() {
		return impedance2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpedance2(String newImpedance2) {
		String oldImpedance2 = impedance2;
		impedance2 = newImpedance2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE2, oldImpedance2, impedance2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_resistance() {
		return shunt_resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_resistance(String newShunt_resistance) {
		String oldShunt_resistance = shunt_resistance;
		shunt_resistance = newShunt_resistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_RESISTANCE, oldShunt_resistance, shunt_resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_reactance() {
		return shunt_reactance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_reactance(String newShunt_reactance) {
		String oldShunt_reactance = shunt_reactance;
		shunt_reactance = newShunt_reactance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_REACTANCE, oldShunt_reactance, shunt_reactance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_impedance() {
		return shunt_impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_impedance(String newShunt_impedance) {
		String oldShunt_impedance = shunt_impedance;
		shunt_impedance = newShunt_impedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDANCE, oldShunt_impedance, shunt_impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECTION:
				return getConnection();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				return getName();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				return getConnect_type();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				return getInstall_type();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				return getPrimary_voltage();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				return getSecondary_voltage();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				return getPower_rating();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_ARATING:
				return getPowerA_rating();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_BRATING:
				return getPowerB_rating();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_CRATING:
				return getPowerC_rating();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE:
				return getResistance();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE:
				return getReactance();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE:
				return getImpedance();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE1:
				return getResistance1();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE1:
				return getReactance1();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE1:
				return getImpedance1();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE2:
				return getResistance2();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE2:
				return getReactance2();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE2:
				return getImpedance2();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_RESISTANCE:
				return getShunt_resistance();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_REACTANCE:
				return getShunt_reactance();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDANCE:
				return getShunt_impedance();
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
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				setConnect_type((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				setInstall_type((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				setPrimary_voltage((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				setSecondary_voltage((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				setPower_rating((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_ARATING:
				setPowerA_rating((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_BRATING:
				setPowerB_rating((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_CRATING:
				setPowerC_rating((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE:
				setResistance((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE:
				setReactance((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE:
				setImpedance((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE1:
				setResistance1((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE1:
				setReactance1((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE1:
				setImpedance1((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE2:
				setResistance2((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE2:
				setReactance2((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE2:
				setImpedance2((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_RESISTANCE:
				setShunt_resistance((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_REACTANCE:
				setShunt_reactance((String)newValue);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDANCE:
				setShunt_impedance((String)newValue);
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
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				setConnect_type(CONNECT_TYPE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				setInstall_type(INSTALL_TYPE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				setPrimary_voltage(PRIMARY_VOLTAGE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				setSecondary_voltage(SECONDARY_VOLTAGE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				setPower_rating(POWER_RATING_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_ARATING:
				setPowerA_rating(POWER_ARATING_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_BRATING:
				setPowerB_rating(POWER_BRATING_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_CRATING:
				setPowerC_rating(POWER_CRATING_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE:
				setResistance(RESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE:
				setReactance(REACTANCE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE:
				setImpedance(IMPEDANCE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE1:
				setResistance1(RESISTANCE1_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE1:
				setReactance1(REACTANCE1_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE1:
				setImpedance1(IMPEDANCE1_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE2:
				setResistance2(RESISTANCE2_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE2:
				setReactance2(REACTANCE2_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE2:
				setImpedance2(IMPEDANCE2_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_RESISTANCE:
				setShunt_resistance(SHUNT_RESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_REACTANCE:
				setShunt_reactance(SHUNT_REACTANCE_EDEFAULT);
				return;
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDANCE:
				setShunt_impedance(SHUNT_IMPEDANCE_EDEFAULT);
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
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.TRANSFORMER_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
				return CONNECT_TYPE_EDEFAULT == null ? connect_type != null : !CONNECT_TYPE_EDEFAULT.equals(connect_type);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
				return INSTALL_TYPE_EDEFAULT == null ? install_type != null : !INSTALL_TYPE_EDEFAULT.equals(install_type);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
				return PRIMARY_VOLTAGE_EDEFAULT == null ? primary_voltage != null : !PRIMARY_VOLTAGE_EDEFAULT.equals(primary_voltage);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
				return SECONDARY_VOLTAGE_EDEFAULT == null ? secondary_voltage != null : !SECONDARY_VOLTAGE_EDEFAULT.equals(secondary_voltage);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
				return POWER_RATING_EDEFAULT == null ? power_rating != null : !POWER_RATING_EDEFAULT.equals(power_rating);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_ARATING:
				return POWER_ARATING_EDEFAULT == null ? powerA_rating != null : !POWER_ARATING_EDEFAULT.equals(powerA_rating);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_BRATING:
				return POWER_BRATING_EDEFAULT == null ? powerB_rating != null : !POWER_BRATING_EDEFAULT.equals(powerB_rating);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_CRATING:
				return POWER_CRATING_EDEFAULT == null ? powerC_rating != null : !POWER_CRATING_EDEFAULT.equals(powerC_rating);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE:
				return RESISTANCE_EDEFAULT == null ? resistance != null : !RESISTANCE_EDEFAULT.equals(resistance);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE:
				return REACTANCE_EDEFAULT == null ? reactance != null : !REACTANCE_EDEFAULT.equals(reactance);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE:
				return IMPEDANCE_EDEFAULT == null ? impedance != null : !IMPEDANCE_EDEFAULT.equals(impedance);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE1:
				return RESISTANCE1_EDEFAULT == null ? resistance1 != null : !RESISTANCE1_EDEFAULT.equals(resistance1);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE1:
				return REACTANCE1_EDEFAULT == null ? reactance1 != null : !REACTANCE1_EDEFAULT.equals(reactance1);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE1:
				return IMPEDANCE1_EDEFAULT == null ? impedance1 != null : !IMPEDANCE1_EDEFAULT.equals(impedance1);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE2:
				return RESISTANCE2_EDEFAULT == null ? resistance2 != null : !RESISTANCE2_EDEFAULT.equals(resistance2);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE2:
				return REACTANCE2_EDEFAULT == null ? reactance2 != null : !REACTANCE2_EDEFAULT.equals(reactance2);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE2:
				return IMPEDANCE2_EDEFAULT == null ? impedance2 != null : !IMPEDANCE2_EDEFAULT.equals(impedance2);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_RESISTANCE:
				return SHUNT_RESISTANCE_EDEFAULT == null ? shunt_resistance != null : !SHUNT_RESISTANCE_EDEFAULT.equals(shunt_resistance);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_REACTANCE:
				return SHUNT_REACTANCE_EDEFAULT == null ? shunt_reactance != null : !SHUNT_REACTANCE_EDEFAULT.equals(shunt_reactance);
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDANCE:
				return SHUNT_IMPEDANCE_EDEFAULT == null ? shunt_impedance != null : !SHUNT_IMPEDANCE_EDEFAULT.equals(shunt_impedance);
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
		result.append(", install_type: ");
		result.append(install_type);
		result.append(", primary_voltage: ");
		result.append(primary_voltage);
		result.append(", secondary_voltage: ");
		result.append(secondary_voltage);
		result.append(", power_rating: ");
		result.append(power_rating);
		result.append(", powerA_rating: ");
		result.append(powerA_rating);
		result.append(", powerB_rating: ");
		result.append(powerB_rating);
		result.append(", powerC_rating: ");
		result.append(powerC_rating);
		result.append(", resistance: ");
		result.append(resistance);
		result.append(", reactance: ");
		result.append(reactance);
		result.append(", impedance: ");
		result.append(impedance);
		result.append(", resistance1: ");
		result.append(resistance1);
		result.append(", reactance1: ");
		result.append(reactance1);
		result.append(", impedance1: ");
		result.append(impedance1);
		result.append(", resistance2: ");
		result.append(resistance2);
		result.append(", reactance2: ");
		result.append(reactance2);
		result.append(", impedance2: ");
		result.append(impedance2);
		result.append(", shunt_resistance: ");
		result.append(shunt_resistance);
		result.append(", shunt_reactance: ");
		result.append(shunt_reactance);
		result.append(", shunt_impedance: ");
		result.append(shunt_impedance);
		result.append(')');
		return result.toString();
	}

} //Transformer_configurationImpl