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
import visGrid.Solar;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.SolarImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getPanel_type <em>Panel type</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getNoct <em>Noct</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getTcell <em>Tcell</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getTambient <em>Tambient</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getInsolation <em>Insolation</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getRated_Insolation <em>Rated Insolation</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getVoc_Max <em>Voc Max</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getVoc <em>Voc</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getArea <em>Area</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.impl.SolarImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolarImpl extends EObjectImpl implements Solar {
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
	 * The default value of the '{@link #getGenerator_mode() <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator_mode() <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_mode()
	 * @generated
	 * @ordered
	 */
	protected String generator_mode = GENERATOR_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator_status() <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_status()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator_status() <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_status()
	 * @generated
	 * @ordered
	 */
	protected String generator_status = GENERATOR_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPanel_type() <em>Panel type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel_type()
	 * @generated
	 * @ordered
	 */
	protected static final String PANEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanel_type() <em>Panel type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanel_type()
	 * @generated
	 * @ordered
	 */
	protected String panel_type = PANEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_type() <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_type()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_type() <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_type()
	 * @generated
	 * @ordered
	 */
	protected String power_type = POWER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoct() <em>Noct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoct()
	 * @generated
	 * @ordered
	 */
	protected static final String NOCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoct() <em>Noct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoct()
	 * @generated
	 * @ordered
	 */
	protected String noct = NOCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTcell() <em>Tcell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcell()
	 * @generated
	 * @ordered
	 */
	protected static final String TCELL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTcell() <em>Tcell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcell()
	 * @generated
	 * @ordered
	 */
	protected String tcell = TCELL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTambient() <em>Tambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTambient()
	 * @generated
	 * @ordered
	 */
	protected static final String TAMBIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTambient() <em>Tambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTambient()
	 * @generated
	 * @ordered
	 */
	protected String tambient = TAMBIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsolation() <em>Insolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsolation()
	 * @generated
	 * @ordered
	 */
	protected static final String INSOLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsolation() <em>Insolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsolation()
	 * @generated
	 * @ordered
	 */
	protected String insolation = INSOLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRinternal() <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRinternal()
	 * @generated
	 * @ordered
	 */
	protected static final String RINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRinternal() <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRinternal()
	 * @generated
	 * @ordered
	 */
	protected String rinternal = RINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRated_Insolation() <em>Rated Insolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_Insolation()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_INSOLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_Insolation() <em>Rated Insolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_Insolation()
	 * @generated
	 * @ordered
	 */
	protected String rated_Insolation = RATED_INSOLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getV_Max() <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Max()
	 * @generated
	 * @ordered
	 */
	protected static final String VMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_Max() <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Max()
	 * @generated
	 * @ordered
	 */
	protected String v_Max = VMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoc_Max() <em>Voc Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoc_Max()
	 * @generated
	 * @ordered
	 */
	protected static final String VOC_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoc_Max() <em>Voc Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoc_Max()
	 * @generated
	 * @ordered
	 */
	protected String voc_Max = VOC_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoc() <em>Voc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoc()
	 * @generated
	 * @ordered
	 */
	protected static final String VOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoc() <em>Voc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoc()
	 * @generated
	 * @ordered
	 */
	protected String voc = VOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFICIENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfficiency()
	 * @generated
	 * @ordered
	 */
	protected String efficiency = EFFICIENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

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
	 * The default value of the '{@link #getV_Out() <em>VOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String VOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_Out() <em>VOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Out()
	 * @generated
	 * @ordered
	 */
	protected String v_Out = VOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_Out() <em>IOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String IOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_Out() <em>IOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Out()
	 * @generated
	 * @ordered
	 */
	protected String i_Out = IOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVA_Out() <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVA_Out() <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_Out()
	 * @generated
	 * @ordered
	 */
	protected String vA_Out = VA_OUT_EDEFAULT;

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
	protected SolarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getSolar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.SOLAR__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator_mode() {
		return generator_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator_mode(String newGenerator_mode) {
		String oldGenerator_mode = generator_mode;
		generator_mode = newGenerator_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__GENERATOR_MODE, oldGenerator_mode, generator_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator_status() {
		return generator_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator_status(String newGenerator_status) {
		String oldGenerator_status = generator_status;
		generator_status = newGenerator_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__GENERATOR_STATUS, oldGenerator_status, generator_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanel_type() {
		return panel_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanel_type(String newPanel_type) {
		String oldPanel_type = panel_type;
		panel_type = newPanel_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__PANEL_TYPE, oldPanel_type, panel_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_type() {
		return power_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_type(String newPower_type) {
		String oldPower_type = power_type;
		power_type = newPower_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__POWER_TYPE, oldPower_type, power_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNoct() {
		return noct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoct(String newNoct) {
		String oldNoct = noct;
		noct = newNoct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__NOCT, oldNoct, noct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTcell() {
		return tcell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcell(String newTcell) {
		String oldTcell = tcell;
		tcell = newTcell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__TCELL, oldTcell, tcell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTambient() {
		return tambient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTambient(String newTambient) {
		String oldTambient = tambient;
		tambient = newTambient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__TAMBIENT, oldTambient, tambient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsolation() {
		return insolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsolation(String newInsolation) {
		String oldInsolation = insolation;
		insolation = newInsolation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__INSOLATION, oldInsolation, insolation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRinternal() {
		return rinternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRinternal(String newRinternal) {
		String oldRinternal = rinternal;
		rinternal = newRinternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__RINTERNAL, oldRinternal, rinternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_Insolation() {
		return rated_Insolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_Insolation(String newRated_Insolation) {
		String oldRated_Insolation = rated_Insolation;
		rated_Insolation = newRated_Insolation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__RATED_INSOLATION, oldRated_Insolation, rated_Insolation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_Max() {
		return v_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_Max(String newV_Max) {
		String oldV_Max = v_Max;
		v_Max = newV_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__VMAX, oldV_Max, v_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoc_Max() {
		return voc_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoc_Max(String newVoc_Max) {
		String oldVoc_Max = voc_Max;
		voc_Max = newVoc_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__VOC_MAX, oldVoc_Max, voc_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoc() {
		return voc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoc(String newVoc) {
		String oldVoc = voc;
		voc = newVoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__VOC, oldVoc, voc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEfficiency() {
		return efficiency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEfficiency(String newEfficiency) {
		String oldEfficiency = efficiency;
		efficiency = newEfficiency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__EFFICIENCY, oldEfficiency, efficiency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__AREA, oldArea, area));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__RATED_KVA, oldRated_kVA, rated_kVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_Out() {
		return v_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_Out(String newV_Out) {
		String oldV_Out = v_Out;
		v_Out = newV_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__VOUT, oldV_Out, v_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_Out() {
		return i_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_Out(String newI_Out) {
		String oldI_Out = i_Out;
		i_Out = newI_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__IOUT, oldI_Out, i_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVA_Out() {
		return vA_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVA_Out(String newVA_Out) {
		String oldVA_Out = vA_Out;
		vA_Out = newVA_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__VA_OUT, oldVA_Out, vA_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SOLAR__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.SOLAR__CONNECTION:
				return getConnection();
			case VisGridPackage.SOLAR__NAME:
				return getName();
			case VisGridPackage.SOLAR__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.SOLAR__GENERATOR_STATUS:
				return getGenerator_status();
			case VisGridPackage.SOLAR__PANEL_TYPE:
				return getPanel_type();
			case VisGridPackage.SOLAR__POWER_TYPE:
				return getPower_type();
			case VisGridPackage.SOLAR__NOCT:
				return getNoct();
			case VisGridPackage.SOLAR__TCELL:
				return getTcell();
			case VisGridPackage.SOLAR__TAMBIENT:
				return getTambient();
			case VisGridPackage.SOLAR__INSOLATION:
				return getInsolation();
			case VisGridPackage.SOLAR__RINTERNAL:
				return getRinternal();
			case VisGridPackage.SOLAR__RATED_INSOLATION:
				return getRated_Insolation();
			case VisGridPackage.SOLAR__VMAX:
				return getV_Max();
			case VisGridPackage.SOLAR__VOC_MAX:
				return getVoc_Max();
			case VisGridPackage.SOLAR__VOC:
				return getVoc();
			case VisGridPackage.SOLAR__EFFICIENCY:
				return getEfficiency();
			case VisGridPackage.SOLAR__AREA:
				return getArea();
			case VisGridPackage.SOLAR__RATED_KVA:
				return getRated_kVA();
			case VisGridPackage.SOLAR__VOUT:
				return getV_Out();
			case VisGridPackage.SOLAR__IOUT:
				return getI_Out();
			case VisGridPackage.SOLAR__VA_OUT:
				return getVA_Out();
			case VisGridPackage.SOLAR__PHASES:
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
			case VisGridPackage.SOLAR__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.SOLAR__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.SOLAR__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.SOLAR__GENERATOR_STATUS:
				setGenerator_status((String)newValue);
				return;
			case VisGridPackage.SOLAR__PANEL_TYPE:
				setPanel_type((String)newValue);
				return;
			case VisGridPackage.SOLAR__POWER_TYPE:
				setPower_type((String)newValue);
				return;
			case VisGridPackage.SOLAR__NOCT:
				setNoct((String)newValue);
				return;
			case VisGridPackage.SOLAR__TCELL:
				setTcell((String)newValue);
				return;
			case VisGridPackage.SOLAR__TAMBIENT:
				setTambient((String)newValue);
				return;
			case VisGridPackage.SOLAR__INSOLATION:
				setInsolation((String)newValue);
				return;
			case VisGridPackage.SOLAR__RINTERNAL:
				setRinternal((String)newValue);
				return;
			case VisGridPackage.SOLAR__RATED_INSOLATION:
				setRated_Insolation((String)newValue);
				return;
			case VisGridPackage.SOLAR__VMAX:
				setV_Max((String)newValue);
				return;
			case VisGridPackage.SOLAR__VOC_MAX:
				setVoc_Max((String)newValue);
				return;
			case VisGridPackage.SOLAR__VOC:
				setVoc((String)newValue);
				return;
			case VisGridPackage.SOLAR__EFFICIENCY:
				setEfficiency((String)newValue);
				return;
			case VisGridPackage.SOLAR__AREA:
				setArea((String)newValue);
				return;
			case VisGridPackage.SOLAR__RATED_KVA:
				setRated_kVA((String)newValue);
				return;
			case VisGridPackage.SOLAR__VOUT:
				setV_Out((String)newValue);
				return;
			case VisGridPackage.SOLAR__IOUT:
				setI_Out((String)newValue);
				return;
			case VisGridPackage.SOLAR__VA_OUT:
				setVA_Out((String)newValue);
				return;
			case VisGridPackage.SOLAR__PHASES:
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
			case VisGridPackage.SOLAR__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.SOLAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__GENERATOR_STATUS:
				setGenerator_status(GENERATOR_STATUS_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__PANEL_TYPE:
				setPanel_type(PANEL_TYPE_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__POWER_TYPE:
				setPower_type(POWER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__NOCT:
				setNoct(NOCT_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__TCELL:
				setTcell(TCELL_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__TAMBIENT:
				setTambient(TAMBIENT_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__INSOLATION:
				setInsolation(INSOLATION_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__RINTERNAL:
				setRinternal(RINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__RATED_INSOLATION:
				setRated_Insolation(RATED_INSOLATION_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__VMAX:
				setV_Max(VMAX_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__VOC_MAX:
				setVoc_Max(VOC_MAX_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__VOC:
				setVoc(VOC_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__EFFICIENCY:
				setEfficiency(EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__RATED_KVA:
				setRated_kVA(RATED_KVA_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__VOUT:
				setV_Out(VOUT_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__IOUT:
				setI_Out(IOUT_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__VA_OUT:
				setVA_Out(VA_OUT_EDEFAULT);
				return;
			case VisGridPackage.SOLAR__PHASES:
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
			case VisGridPackage.SOLAR__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.SOLAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.SOLAR__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.SOLAR__GENERATOR_STATUS:
				return GENERATOR_STATUS_EDEFAULT == null ? generator_status != null : !GENERATOR_STATUS_EDEFAULT.equals(generator_status);
			case VisGridPackage.SOLAR__PANEL_TYPE:
				return PANEL_TYPE_EDEFAULT == null ? panel_type != null : !PANEL_TYPE_EDEFAULT.equals(panel_type);
			case VisGridPackage.SOLAR__POWER_TYPE:
				return POWER_TYPE_EDEFAULT == null ? power_type != null : !POWER_TYPE_EDEFAULT.equals(power_type);
			case VisGridPackage.SOLAR__NOCT:
				return NOCT_EDEFAULT == null ? noct != null : !NOCT_EDEFAULT.equals(noct);
			case VisGridPackage.SOLAR__TCELL:
				return TCELL_EDEFAULT == null ? tcell != null : !TCELL_EDEFAULT.equals(tcell);
			case VisGridPackage.SOLAR__TAMBIENT:
				return TAMBIENT_EDEFAULT == null ? tambient != null : !TAMBIENT_EDEFAULT.equals(tambient);
			case VisGridPackage.SOLAR__INSOLATION:
				return INSOLATION_EDEFAULT == null ? insolation != null : !INSOLATION_EDEFAULT.equals(insolation);
			case VisGridPackage.SOLAR__RINTERNAL:
				return RINTERNAL_EDEFAULT == null ? rinternal != null : !RINTERNAL_EDEFAULT.equals(rinternal);
			case VisGridPackage.SOLAR__RATED_INSOLATION:
				return RATED_INSOLATION_EDEFAULT == null ? rated_Insolation != null : !RATED_INSOLATION_EDEFAULT.equals(rated_Insolation);
			case VisGridPackage.SOLAR__VMAX:
				return VMAX_EDEFAULT == null ? v_Max != null : !VMAX_EDEFAULT.equals(v_Max);
			case VisGridPackage.SOLAR__VOC_MAX:
				return VOC_MAX_EDEFAULT == null ? voc_Max != null : !VOC_MAX_EDEFAULT.equals(voc_Max);
			case VisGridPackage.SOLAR__VOC:
				return VOC_EDEFAULT == null ? voc != null : !VOC_EDEFAULT.equals(voc);
			case VisGridPackage.SOLAR__EFFICIENCY:
				return EFFICIENCY_EDEFAULT == null ? efficiency != null : !EFFICIENCY_EDEFAULT.equals(efficiency);
			case VisGridPackage.SOLAR__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
			case VisGridPackage.SOLAR__RATED_KVA:
				return RATED_KVA_EDEFAULT == null ? rated_kVA != null : !RATED_KVA_EDEFAULT.equals(rated_kVA);
			case VisGridPackage.SOLAR__VOUT:
				return VOUT_EDEFAULT == null ? v_Out != null : !VOUT_EDEFAULT.equals(v_Out);
			case VisGridPackage.SOLAR__IOUT:
				return IOUT_EDEFAULT == null ? i_Out != null : !IOUT_EDEFAULT.equals(i_Out);
			case VisGridPackage.SOLAR__VA_OUT:
				return VA_OUT_EDEFAULT == null ? vA_Out != null : !VA_OUT_EDEFAULT.equals(vA_Out);
			case VisGridPackage.SOLAR__PHASES:
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
		result.append(", generator_mode: ");
		result.append(generator_mode);
		result.append(", generator_status: ");
		result.append(generator_status);
		result.append(", panel_type: ");
		result.append(panel_type);
		result.append(", power_type: ");
		result.append(power_type);
		result.append(", noct: ");
		result.append(noct);
		result.append(", Tcell: ");
		result.append(tcell);
		result.append(", Tambient: ");
		result.append(tambient);
		result.append(", Insolation: ");
		result.append(insolation);
		result.append(", Rinternal: ");
		result.append(rinternal);
		result.append(", Rated_Insolation: ");
		result.append(rated_Insolation);
		result.append(", V_Max: ");
		result.append(v_Max);
		result.append(", Voc_Max: ");
		result.append(voc_Max);
		result.append(", Voc: ");
		result.append(voc);
		result.append(", efficiency: ");
		result.append(efficiency);
		result.append(", area: ");
		result.append(area);
		result.append(", Rated_kVA: ");
		result.append(rated_kVA);
		result.append(", V_Out: ");
		result.append(v_Out);
		result.append(", I_Out: ");
		result.append(i_Out);
		result.append(", VA_Out: ");
		result.append(vA_Out);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //SolarImpl