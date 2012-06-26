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
import visGrid.Diesel_dg;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diesel dg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getGen_mode <em>Gen mode</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getGen_status <em>Gen status</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getRated_kV <em>Rated kV</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getRs <em>Rs</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getXs <em>Xs</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getRg <em>Rg</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getXg <em>Xg</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getEfA <em>Ef A</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getEfB <em>Ef B</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getEfC <em>Ef C</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPower_A_sch <em>Power Asch</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPower_B_sch <em>Power Bsch</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPower_C_sch <em>Power Csch</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getEfA_sch <em>Ef Asch</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getEfB_sch <em>Ef Bsch</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getEfC_sch <em>Ef Csch</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getSlackBus <em>Slack Bus</em>}</li>
 *   <li>{@link visGrid.impl.Diesel_dgImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Diesel_dgImpl extends EObjectImpl implements Diesel_dg {
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
	 * The default value of the '{@link #getGen_mode() <em>Gen mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGen_mode() <em>Gen mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_mode()
	 * @generated
	 * @ordered
	 */
	protected String gen_mode = GEN_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGen_status() <em>Gen status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_status()
	 * @generated
	 * @ordered
	 */
	protected static final String GEN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGen_status() <em>Gen status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGen_status()
	 * @generated
	 * @ordered
	 */
	protected String gen_status = GEN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_kVA() <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kVA()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_KVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_kVA() <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kVA()
	 * @generated
	 * @ordered
	 */
	protected String rated_kVA = RATED_KVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_kV() <em>Rated kV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kV()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_KV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_kV() <em>Rated kV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kV()
	 * @generated
	 * @ordered
	 */
	protected String rated_kV = RATED_KV_EDEFAULT;

	/**
	 * The default value of the '{@link #getRs() <em>Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRs()
	 * @generated
	 * @ordered
	 */
	protected static final String RS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRs() <em>Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRs()
	 * @generated
	 * @ordered
	 */
	protected String rs = RS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXs() <em>Xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXs()
	 * @generated
	 * @ordered
	 */
	protected static final String XS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXs() <em>Xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXs()
	 * @generated
	 * @ordered
	 */
	protected String xs = XS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRg() <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected static final String RG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected String rg = RG_EDEFAULT;

	/**
	 * The default value of the '{@link #getXg() <em>Xg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXg()
	 * @generated
	 * @ordered
	 */
	protected static final String XG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXg() <em>Xg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXg()
	 * @generated
	 * @ordered
	 */
	protected String xg = XG_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_A() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_A() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected String voltage_A = VOLTAGE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_B() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_B() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected String voltage_B = VOLTAGE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_C() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_C() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected String voltage_C = VOLTAGE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_A() <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_A() <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_A()
	 * @generated
	 * @ordered
	 */
	protected String current_A = CURRENT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_B() <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_B() <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_B()
	 * @generated
	 * @ordered
	 */
	protected String current_B = CURRENT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_C() <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_C() <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_C()
	 * @generated
	 * @ordered
	 */
	protected String current_C = CURRENT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfA() <em>Ef A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfA()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfA() <em>Ef A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfA()
	 * @generated
	 * @ordered
	 */
	protected String efA = EF_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfB() <em>Ef B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfB()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfB() <em>Ef B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfB()
	 * @generated
	 * @ordered
	 */
	protected String efB = EF_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfC() <em>Ef C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfC()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfC() <em>Ef C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfC()
	 * @generated
	 * @ordered
	 */
	protected String efC = EF_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_A() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_A() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A()
	 * @generated
	 * @ordered
	 */
	protected String power_A = POWER_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_B() <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_B() <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B()
	 * @generated
	 * @ordered
	 */
	protected String power_B = POWER_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_C() <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_C() <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C()
	 * @generated
	 * @ordered
	 */
	protected String power_C = POWER_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_A_sch() <em>Power Asch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A_sch()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_ASCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_A_sch() <em>Power Asch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A_sch()
	 * @generated
	 * @ordered
	 */
	protected String power_A_sch = POWER_ASCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_B_sch() <em>Power Bsch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B_sch()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_BSCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_B_sch() <em>Power Bsch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B_sch()
	 * @generated
	 * @ordered
	 */
	protected String power_B_sch = POWER_BSCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_C_sch() <em>Power Csch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C_sch()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_CSCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_C_sch() <em>Power Csch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C_sch()
	 * @generated
	 * @ordered
	 */
	protected String power_C_sch = POWER_CSCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfA_sch() <em>Ef Asch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfA_sch()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_ASCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfA_sch() <em>Ef Asch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfA_sch()
	 * @generated
	 * @ordered
	 */
	protected String efA_sch = EF_ASCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfB_sch() <em>Ef Bsch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfB_sch()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_BSCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfB_sch() <em>Ef Bsch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfB_sch()
	 * @generated
	 * @ordered
	 */
	protected String efB_sch = EF_BSCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfC_sch() <em>Ef Csch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfC_sch()
	 * @generated
	 * @ordered
	 */
	protected static final String EF_CSCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfC_sch() <em>Ef Csch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfC_sch()
	 * @generated
	 * @ordered
	 */
	protected String efC_sch = EF_CSCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlackBus() <em>Slack Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlackBus()
	 * @generated
	 * @ordered
	 */
	protected static final String SLACK_BUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlackBus() <em>Slack Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlackBus()
	 * @generated
	 * @ordered
	 */
	protected String slackBus = SLACK_BUS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Diesel_dgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getDiesel_dg();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.DIESEL_DG__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGen_mode() {
		return gen_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGen_mode(String newGen_mode) {
		String oldGen_mode = gen_mode;
		gen_mode = newGen_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__GEN_MODE, oldGen_mode, gen_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGen_status() {
		return gen_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGen_status(String newGen_status) {
		String oldGen_status = gen_status;
		gen_status = newGen_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__GEN_STATUS, oldGen_status, gen_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_kVA() {
		return rated_kVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_kVA(String newRated_kVA) {
		String oldRated_kVA = rated_kVA;
		rated_kVA = newRated_kVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__RATED_KVA, oldRated_kVA, rated_kVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_kV() {
		return rated_kV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_kV(String newRated_kV) {
		String oldRated_kV = rated_kV;
		rated_kV = newRated_kV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__RATED_KV, oldRated_kV, rated_kV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRs() {
		return rs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRs(String newRs) {
		String oldRs = rs;
		rs = newRs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__RS, oldRs, rs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXs() {
		return xs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXs(String newXs) {
		String oldXs = xs;
		xs = newXs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__XS, oldXs, xs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRg(String newRg) {
		String oldRg = rg;
		rg = newRg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__RG, oldRg, rg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXg() {
		return xg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXg(String newXg) {
		String oldXg = xg;
		xg = newXg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__XG, oldXg, xg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_A() {
		return voltage_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_A(String newVoltage_A) {
		String oldVoltage_A = voltage_A;
		voltage_A = newVoltage_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__VOLTAGE_A, oldVoltage_A, voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_B() {
		return voltage_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_B(String newVoltage_B) {
		String oldVoltage_B = voltage_B;
		voltage_B = newVoltage_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__VOLTAGE_B, oldVoltage_B, voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_C() {
		return voltage_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_C(String newVoltage_C) {
		String oldVoltage_C = voltage_C;
		voltage_C = newVoltage_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__VOLTAGE_C, oldVoltage_C, voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_A() {
		return current_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_A(String newCurrent_A) {
		String oldCurrent_A = current_A;
		current_A = newCurrent_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__CURRENT_A, oldCurrent_A, current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_B() {
		return current_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_B(String newCurrent_B) {
		String oldCurrent_B = current_B;
		current_B = newCurrent_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__CURRENT_B, oldCurrent_B, current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_C() {
		return current_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_C(String newCurrent_C) {
		String oldCurrent_C = current_C;
		current_C = newCurrent_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__CURRENT_C, oldCurrent_C, current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfA() {
		return efA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfA(String newEfA) {
		String oldEfA = efA;
		efA = newEfA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__EF_A, oldEfA, efA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfB() {
		return efB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfB(String newEfB) {
		String oldEfB = efB;
		efB = newEfB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__EF_B, oldEfB, efB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfC() {
		return efC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfC(String newEfC) {
		String oldEfC = efC;
		efC = newEfC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__EF_C, oldEfC, efC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A() {
		return power_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_A(String newPower_A) {
		String oldPower_A = power_A;
		power_A = newPower_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__POWER_A, oldPower_A, power_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B() {
		return power_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_B(String newPower_B) {
		String oldPower_B = power_B;
		power_B = newPower_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__POWER_B, oldPower_B, power_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C() {
		return power_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_C(String newPower_C) {
		String oldPower_C = power_C;
		power_C = newPower_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__POWER_C, oldPower_C, power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A_sch() {
		return power_A_sch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_A_sch(String newPower_A_sch) {
		String oldPower_A_sch = power_A_sch;
		power_A_sch = newPower_A_sch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__POWER_ASCH, oldPower_A_sch, power_A_sch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B_sch() {
		return power_B_sch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_B_sch(String newPower_B_sch) {
		String oldPower_B_sch = power_B_sch;
		power_B_sch = newPower_B_sch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__POWER_BSCH, oldPower_B_sch, power_B_sch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C_sch() {
		return power_C_sch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_C_sch(String newPower_C_sch) {
		String oldPower_C_sch = power_C_sch;
		power_C_sch = newPower_C_sch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__POWER_CSCH, oldPower_C_sch, power_C_sch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfA_sch() {
		return efA_sch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfA_sch(String newEfA_sch) {
		String oldEfA_sch = efA_sch;
		efA_sch = newEfA_sch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__EF_ASCH, oldEfA_sch, efA_sch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfB_sch() {
		return efB_sch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfB_sch(String newEfB_sch) {
		String oldEfB_sch = efB_sch;
		efB_sch = newEfB_sch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__EF_BSCH, oldEfB_sch, efB_sch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfC_sch() {
		return efC_sch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfC_sch(String newEfC_sch) {
		String oldEfC_sch = efC_sch;
		efC_sch = newEfC_sch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__EF_CSCH, oldEfC_sch, efC_sch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlackBus() {
		return slackBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlackBus(String newSlackBus) {
		String oldSlackBus = slackBus;
		slackBus = newSlackBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__SLACK_BUS, oldSlackBus, slackBus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DIESEL_DG__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.DIESEL_DG__CONNECTION:
				return getConnection();
			case VisGridPackage.DIESEL_DG__NAME:
				return getName();
			case VisGridPackage.DIESEL_DG__GEN_MODE:
				return getGen_mode();
			case VisGridPackage.DIESEL_DG__GEN_STATUS:
				return getGen_status();
			case VisGridPackage.DIESEL_DG__RATED_KVA:
				return getRated_kVA();
			case VisGridPackage.DIESEL_DG__RATED_KV:
				return getRated_kV();
			case VisGridPackage.DIESEL_DG__RS:
				return getRs();
			case VisGridPackage.DIESEL_DG__XS:
				return getXs();
			case VisGridPackage.DIESEL_DG__RG:
				return getRg();
			case VisGridPackage.DIESEL_DG__XG:
				return getXg();
			case VisGridPackage.DIESEL_DG__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.DIESEL_DG__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.DIESEL_DG__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.DIESEL_DG__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.DIESEL_DG__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.DIESEL_DG__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.DIESEL_DG__EF_A:
				return getEfA();
			case VisGridPackage.DIESEL_DG__EF_B:
				return getEfB();
			case VisGridPackage.DIESEL_DG__EF_C:
				return getEfC();
			case VisGridPackage.DIESEL_DG__POWER_A:
				return getPower_A();
			case VisGridPackage.DIESEL_DG__POWER_B:
				return getPower_B();
			case VisGridPackage.DIESEL_DG__POWER_C:
				return getPower_C();
			case VisGridPackage.DIESEL_DG__POWER_ASCH:
				return getPower_A_sch();
			case VisGridPackage.DIESEL_DG__POWER_BSCH:
				return getPower_B_sch();
			case VisGridPackage.DIESEL_DG__POWER_CSCH:
				return getPower_C_sch();
			case VisGridPackage.DIESEL_DG__EF_ASCH:
				return getEfA_sch();
			case VisGridPackage.DIESEL_DG__EF_BSCH:
				return getEfB_sch();
			case VisGridPackage.DIESEL_DG__EF_CSCH:
				return getEfC_sch();
			case VisGridPackage.DIESEL_DG__SLACK_BUS:
				return getSlackBus();
			case VisGridPackage.DIESEL_DG__PHASES:
				return getPhases();
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
			case VisGridPackage.DIESEL_DG__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.DIESEL_DG__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__GEN_MODE:
				setGen_mode((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__GEN_STATUS:
				setGen_status((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__RATED_KVA:
				setRated_kVA((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__RATED_KV:
				setRated_kV((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__RS:
				setRs((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__XS:
				setXs((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__RG:
				setRg((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__XG:
				setXg((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__EF_A:
				setEfA((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__EF_B:
				setEfB((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__EF_C:
				setEfC((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__POWER_ASCH:
				setPower_A_sch((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__POWER_BSCH:
				setPower_B_sch((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__POWER_CSCH:
				setPower_C_sch((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__EF_ASCH:
				setEfA_sch((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__EF_BSCH:
				setEfB_sch((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__EF_CSCH:
				setEfC_sch((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__SLACK_BUS:
				setSlackBus((String)newValue);
				return;
			case VisGridPackage.DIESEL_DG__PHASES:
				setPhases((String)newValue);
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
			case VisGridPackage.DIESEL_DG__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.DIESEL_DG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__GEN_MODE:
				setGen_mode(GEN_MODE_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__GEN_STATUS:
				setGen_status(GEN_STATUS_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__RATED_KVA:
				setRated_kVA(RATED_KVA_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__RATED_KV:
				setRated_kV(RATED_KV_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__RS:
				setRs(RS_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__XS:
				setXs(XS_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__RG:
				setRg(RG_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__XG:
				setXg(XG_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__EF_A:
				setEfA(EF_A_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__EF_B:
				setEfB(EF_B_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__EF_C:
				setEfC(EF_C_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__POWER_ASCH:
				setPower_A_sch(POWER_ASCH_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__POWER_BSCH:
				setPower_B_sch(POWER_BSCH_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__POWER_CSCH:
				setPower_C_sch(POWER_CSCH_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__EF_ASCH:
				setEfA_sch(EF_ASCH_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__EF_BSCH:
				setEfB_sch(EF_BSCH_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__EF_CSCH:
				setEfC_sch(EF_CSCH_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__SLACK_BUS:
				setSlackBus(SLACK_BUS_EDEFAULT);
				return;
			case VisGridPackage.DIESEL_DG__PHASES:
				setPhases(PHASES_EDEFAULT);
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
			case VisGridPackage.DIESEL_DG__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.DIESEL_DG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.DIESEL_DG__GEN_MODE:
				return GEN_MODE_EDEFAULT == null ? gen_mode != null : !GEN_MODE_EDEFAULT.equals(gen_mode);
			case VisGridPackage.DIESEL_DG__GEN_STATUS:
				return GEN_STATUS_EDEFAULT == null ? gen_status != null : !GEN_STATUS_EDEFAULT.equals(gen_status);
			case VisGridPackage.DIESEL_DG__RATED_KVA:
				return RATED_KVA_EDEFAULT == null ? rated_kVA != null : !RATED_KVA_EDEFAULT.equals(rated_kVA);
			case VisGridPackage.DIESEL_DG__RATED_KV:
				return RATED_KV_EDEFAULT == null ? rated_kV != null : !RATED_KV_EDEFAULT.equals(rated_kV);
			case VisGridPackage.DIESEL_DG__RS:
				return RS_EDEFAULT == null ? rs != null : !RS_EDEFAULT.equals(rs);
			case VisGridPackage.DIESEL_DG__XS:
				return XS_EDEFAULT == null ? xs != null : !XS_EDEFAULT.equals(xs);
			case VisGridPackage.DIESEL_DG__RG:
				return RG_EDEFAULT == null ? rg != null : !RG_EDEFAULT.equals(rg);
			case VisGridPackage.DIESEL_DG__XG:
				return XG_EDEFAULT == null ? xg != null : !XG_EDEFAULT.equals(xg);
			case VisGridPackage.DIESEL_DG__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.DIESEL_DG__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.DIESEL_DG__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.DIESEL_DG__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.DIESEL_DG__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.DIESEL_DG__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.DIESEL_DG__EF_A:
				return EF_A_EDEFAULT == null ? efA != null : !EF_A_EDEFAULT.equals(efA);
			case VisGridPackage.DIESEL_DG__EF_B:
				return EF_B_EDEFAULT == null ? efB != null : !EF_B_EDEFAULT.equals(efB);
			case VisGridPackage.DIESEL_DG__EF_C:
				return EF_C_EDEFAULT == null ? efC != null : !EF_C_EDEFAULT.equals(efC);
			case VisGridPackage.DIESEL_DG__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.DIESEL_DG__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.DIESEL_DG__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.DIESEL_DG__POWER_ASCH:
				return POWER_ASCH_EDEFAULT == null ? power_A_sch != null : !POWER_ASCH_EDEFAULT.equals(power_A_sch);
			case VisGridPackage.DIESEL_DG__POWER_BSCH:
				return POWER_BSCH_EDEFAULT == null ? power_B_sch != null : !POWER_BSCH_EDEFAULT.equals(power_B_sch);
			case VisGridPackage.DIESEL_DG__POWER_CSCH:
				return POWER_CSCH_EDEFAULT == null ? power_C_sch != null : !POWER_CSCH_EDEFAULT.equals(power_C_sch);
			case VisGridPackage.DIESEL_DG__EF_ASCH:
				return EF_ASCH_EDEFAULT == null ? efA_sch != null : !EF_ASCH_EDEFAULT.equals(efA_sch);
			case VisGridPackage.DIESEL_DG__EF_BSCH:
				return EF_BSCH_EDEFAULT == null ? efB_sch != null : !EF_BSCH_EDEFAULT.equals(efB_sch);
			case VisGridPackage.DIESEL_DG__EF_CSCH:
				return EF_CSCH_EDEFAULT == null ? efC_sch != null : !EF_CSCH_EDEFAULT.equals(efC_sch);
			case VisGridPackage.DIESEL_DG__SLACK_BUS:
				return SLACK_BUS_EDEFAULT == null ? slackBus != null : !SLACK_BUS_EDEFAULT.equals(slackBus);
			case VisGridPackage.DIESEL_DG__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
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
		result.append(", Gen_mode: ");
		result.append(gen_mode);
		result.append(", Gen_status: ");
		result.append(gen_status);
		result.append(", Rated_kVA: ");
		result.append(rated_kVA);
		result.append(", Rated_kV: ");
		result.append(rated_kV);
		result.append(", Rs: ");
		result.append(rs);
		result.append(", Xs: ");
		result.append(xs);
		result.append(", Rg: ");
		result.append(rg);
		result.append(", Xg: ");
		result.append(xg);
		result.append(", voltage_A: ");
		result.append(voltage_A);
		result.append(", voltage_B: ");
		result.append(voltage_B);
		result.append(", voltage_C: ");
		result.append(voltage_C);
		result.append(", current_A: ");
		result.append(current_A);
		result.append(", current_B: ");
		result.append(current_B);
		result.append(", current_C: ");
		result.append(current_C);
		result.append(", EfA: ");
		result.append(efA);
		result.append(", EfB: ");
		result.append(efB);
		result.append(", EfC: ");
		result.append(efC);
		result.append(", power_A: ");
		result.append(power_A);
		result.append(", power_B: ");
		result.append(power_B);
		result.append(", power_C: ");
		result.append(power_C);
		result.append(", power_A_sch: ");
		result.append(power_A_sch);
		result.append(", power_B_sch: ");
		result.append(power_B_sch);
		result.append(", power_C_sch: ");
		result.append(power_C_sch);
		result.append(", EfA_sch: ");
		result.append(efA_sch);
		result.append(", EfB_sch: ");
		result.append(efB_sch);
		result.append(", EfC_sch: ");
		result.append(efC_sch);
		result.append(", SlackBus: ");
		result.append(slackBus);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //Diesel_dgImpl