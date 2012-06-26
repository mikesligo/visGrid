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
import visGrid.Dc_dc_converter;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dc dc converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getDc_dc_converter_type <em>Dc dc converter type</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getVdc <em>Vdc</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getP_Out <em>POut</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getQ_Out <em>QOut</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getService_ratio <em>Service ratio</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getV_In <em>VIn</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getI_In <em>IIn</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getVA_In <em>VA In</em>}</li>
 *   <li>{@link visGrid.impl.Dc_dc_converterImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dc_dc_converterImpl extends EObjectImpl implements Dc_dc_converter {
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
	 * The default value of the '{@link #getDc_dc_converter_type() <em>Dc dc converter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc_dc_converter_type()
	 * @generated
	 * @ordered
	 */
	protected static final String DC_DC_CONVERTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDc_dc_converter_type() <em>Dc dc converter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc_dc_converter_type()
	 * @generated
	 * @ordered
	 */
	protected String dc_dc_converter_type = DC_DC_CONVERTER_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getVdc() <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdc()
	 * @generated
	 * @ordered
	 */
	protected static final String VDC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVdc() <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdc()
	 * @generated
	 * @ordered
	 */
	protected String vdc = VDC_EDEFAULT;

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
	 * The default value of the '{@link #getP_Out() <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String POUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_Out() <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Out()
	 * @generated
	 * @ordered
	 */
	protected String p_Out = POUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ_Out() <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String QOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ_Out() <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ_Out()
	 * @generated
	 * @ordered
	 */
	protected String q_Out = QOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getService_ratio() <em>Service ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_ratio()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService_ratio() <em>Service ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_ratio()
	 * @generated
	 * @ordered
	 */
	protected String service_ratio = SERVICE_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getV_In() <em>VIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_In()
	 * @generated
	 * @ordered
	 */
	protected static final String VIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_In() <em>VIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_In()
	 * @generated
	 * @ordered
	 */
	protected String v_In = VIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_In() <em>IIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_In()
	 * @generated
	 * @ordered
	 */
	protected static final String IIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_In() <em>IIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_In()
	 * @generated
	 * @ordered
	 */
	protected String i_In = IIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVA_In() <em>VA In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_In()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVA_In() <em>VA In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_In()
	 * @generated
	 * @ordered
	 */
	protected String vA_In = VA_IN_EDEFAULT;

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
	protected Dc_dc_converterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getDc_dc_converter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.DC_DC_CONVERTER__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDc_dc_converter_type() {
		return dc_dc_converter_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDc_dc_converter_type(String newDc_dc_converter_type) {
		String oldDc_dc_converter_type = dc_dc_converter_type;
		dc_dc_converter_type = newDc_dc_converter_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__DC_DC_CONVERTER_TYPE, oldDc_dc_converter_type, dc_dc_converter_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__GENERATOR_MODE, oldGenerator_mode, generator_mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__VOUT, oldV_Out, v_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__IOUT, oldI_Out, i_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVdc() {
		return vdc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdc(String newVdc) {
		String oldVdc = vdc;
		vdc = newVdc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__VDC, oldVdc, vdc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__VA_OUT, oldVA_Out, vA_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_Out() {
		return p_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_Out(String newP_Out) {
		String oldP_Out = p_Out;
		p_Out = newP_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__POUT, oldP_Out, p_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQ_Out() {
		return q_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ_Out(String newQ_Out) {
		String oldQ_Out = q_Out;
		q_Out = newQ_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__QOUT, oldQ_Out, q_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getService_ratio() {
		return service_ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService_ratio(String newService_ratio) {
		String oldService_ratio = service_ratio;
		service_ratio = newService_ratio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__SERVICE_RATIO, oldService_ratio, service_ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_In() {
		return v_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_In(String newV_In) {
		String oldV_In = v_In;
		v_In = newV_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__VIN, oldV_In, v_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_In() {
		return i_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_In(String newI_In) {
		String oldI_In = i_In;
		i_In = newI_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__IIN, oldI_In, i_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVA_In() {
		return vA_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVA_In(String newVA_In) {
		String oldVA_In = vA_In;
		vA_In = newVA_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__VA_IN, oldVA_In, vA_In));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.DC_DC_CONVERTER__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.DC_DC_CONVERTER__CONNECTION:
				return getConnection();
			case VisGridPackage.DC_DC_CONVERTER__NAME:
				return getName();
			case VisGridPackage.DC_DC_CONVERTER__DC_DC_CONVERTER_TYPE:
				return getDc_dc_converter_type();
			case VisGridPackage.DC_DC_CONVERTER__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.DC_DC_CONVERTER__VOUT:
				return getV_Out();
			case VisGridPackage.DC_DC_CONVERTER__IOUT:
				return getI_Out();
			case VisGridPackage.DC_DC_CONVERTER__VDC:
				return getVdc();
			case VisGridPackage.DC_DC_CONVERTER__VA_OUT:
				return getVA_Out();
			case VisGridPackage.DC_DC_CONVERTER__POUT:
				return getP_Out();
			case VisGridPackage.DC_DC_CONVERTER__QOUT:
				return getQ_Out();
			case VisGridPackage.DC_DC_CONVERTER__SERVICE_RATIO:
				return getService_ratio();
			case VisGridPackage.DC_DC_CONVERTER__VIN:
				return getV_In();
			case VisGridPackage.DC_DC_CONVERTER__IIN:
				return getI_In();
			case VisGridPackage.DC_DC_CONVERTER__VA_IN:
				return getVA_In();
			case VisGridPackage.DC_DC_CONVERTER__PHASES:
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
			case VisGridPackage.DC_DC_CONVERTER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__DC_DC_CONVERTER_TYPE:
				setDc_dc_converter_type((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VOUT:
				setV_Out((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__IOUT:
				setI_Out((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VDC:
				setVdc((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VA_OUT:
				setVA_Out((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__POUT:
				setP_Out((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__QOUT:
				setQ_Out((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__SERVICE_RATIO:
				setService_ratio((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VIN:
				setV_In((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__IIN:
				setI_In((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VA_IN:
				setVA_In((String)newValue);
				return;
			case VisGridPackage.DC_DC_CONVERTER__PHASES:
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
			case VisGridPackage.DC_DC_CONVERTER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.DC_DC_CONVERTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__DC_DC_CONVERTER_TYPE:
				setDc_dc_converter_type(DC_DC_CONVERTER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VOUT:
				setV_Out(VOUT_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__IOUT:
				setI_Out(IOUT_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VDC:
				setVdc(VDC_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VA_OUT:
				setVA_Out(VA_OUT_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__POUT:
				setP_Out(POUT_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__QOUT:
				setQ_Out(QOUT_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__SERVICE_RATIO:
				setService_ratio(SERVICE_RATIO_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VIN:
				setV_In(VIN_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__IIN:
				setI_In(IIN_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__VA_IN:
				setVA_In(VA_IN_EDEFAULT);
				return;
			case VisGridPackage.DC_DC_CONVERTER__PHASES:
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
			case VisGridPackage.DC_DC_CONVERTER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.DC_DC_CONVERTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.DC_DC_CONVERTER__DC_DC_CONVERTER_TYPE:
				return DC_DC_CONVERTER_TYPE_EDEFAULT == null ? dc_dc_converter_type != null : !DC_DC_CONVERTER_TYPE_EDEFAULT.equals(dc_dc_converter_type);
			case VisGridPackage.DC_DC_CONVERTER__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.DC_DC_CONVERTER__VOUT:
				return VOUT_EDEFAULT == null ? v_Out != null : !VOUT_EDEFAULT.equals(v_Out);
			case VisGridPackage.DC_DC_CONVERTER__IOUT:
				return IOUT_EDEFAULT == null ? i_Out != null : !IOUT_EDEFAULT.equals(i_Out);
			case VisGridPackage.DC_DC_CONVERTER__VDC:
				return VDC_EDEFAULT == null ? vdc != null : !VDC_EDEFAULT.equals(vdc);
			case VisGridPackage.DC_DC_CONVERTER__VA_OUT:
				return VA_OUT_EDEFAULT == null ? vA_Out != null : !VA_OUT_EDEFAULT.equals(vA_Out);
			case VisGridPackage.DC_DC_CONVERTER__POUT:
				return POUT_EDEFAULT == null ? p_Out != null : !POUT_EDEFAULT.equals(p_Out);
			case VisGridPackage.DC_DC_CONVERTER__QOUT:
				return QOUT_EDEFAULT == null ? q_Out != null : !QOUT_EDEFAULT.equals(q_Out);
			case VisGridPackage.DC_DC_CONVERTER__SERVICE_RATIO:
				return SERVICE_RATIO_EDEFAULT == null ? service_ratio != null : !SERVICE_RATIO_EDEFAULT.equals(service_ratio);
			case VisGridPackage.DC_DC_CONVERTER__VIN:
				return VIN_EDEFAULT == null ? v_In != null : !VIN_EDEFAULT.equals(v_In);
			case VisGridPackage.DC_DC_CONVERTER__IIN:
				return IIN_EDEFAULT == null ? i_In != null : !IIN_EDEFAULT.equals(i_In);
			case VisGridPackage.DC_DC_CONVERTER__VA_IN:
				return VA_IN_EDEFAULT == null ? vA_In != null : !VA_IN_EDEFAULT.equals(vA_In);
			case VisGridPackage.DC_DC_CONVERTER__PHASES:
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
		result.append(", dc_dc_converter_type: ");
		result.append(dc_dc_converter_type);
		result.append(", generator_mode: ");
		result.append(generator_mode);
		result.append(", V_Out: ");
		result.append(v_Out);
		result.append(", I_Out: ");
		result.append(i_Out);
		result.append(", Vdc: ");
		result.append(vdc);
		result.append(", VA_Out: ");
		result.append(vA_Out);
		result.append(", P_Out: ");
		result.append(p_Out);
		result.append(", Q_Out: ");
		result.append(q_Out);
		result.append(", service_ratio: ");
		result.append(service_ratio);
		result.append(", V_In: ");
		result.append(v_In);
		result.append(", I_In: ");
		result.append(i_In);
		result.append(", VA_In: ");
		result.append(vA_In);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //Dc_dc_converterImpl