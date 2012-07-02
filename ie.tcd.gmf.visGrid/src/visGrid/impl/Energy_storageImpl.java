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

import visGrid.Energy_storage;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getI_Max <em>IMax</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getE_Max <em>EMax</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getV_In <em>VIn</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getI_In <em>IIn</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getV_Internal <em>VInternal</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getI_Internal <em>IInternal</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getI_Prev <em>IPrev</em>}</li>
 *   <li>{@link visGrid.impl.Energy_storageImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Energy_storageImpl extends ConnectionImpl implements Energy_storage {
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
	 * The default value of the '{@link #getI_Max() <em>IMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Max()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_Max() <em>IMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Max()
	 * @generated
	 * @ordered
	 */
	protected String i_Max = IMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getE_Max() <em>EMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_Max()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getE_Max() <em>EMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getE_Max()
	 * @generated
	 * @ordered
	 */
	protected String e_Max = EMAX_EDEFAULT;

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
	 * The default value of the '{@link #getV_Internal() <em>VInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Internal()
	 * @generated
	 * @ordered
	 */
	protected static final String VINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_Internal() <em>VInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Internal()
	 * @generated
	 * @ordered
	 */
	protected String v_Internal = VINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_Internal() <em>IInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Internal()
	 * @generated
	 * @ordered
	 */
	protected static final String IINTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_Internal() <em>IInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Internal()
	 * @generated
	 * @ordered
	 */
	protected String i_Internal = IINTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_Prev() <em>IPrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Prev()
	 * @generated
	 * @ordered
	 */
	protected static final String IPREV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_Prev() <em>IPrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Prev()
	 * @generated
	 * @ordered
	 */
	protected String i_Prev = IPREV_EDEFAULT;

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
	protected Energy_storageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getEnergy_storage();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__GENERATOR_MODE, oldGenerator_mode, generator_mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__GENERATOR_STATUS, oldGenerator_status, generator_status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__POWER_TYPE, oldPower_type, power_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__RINTERNAL, oldRinternal, rinternal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__VMAX, oldV_Max, v_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_Max() {
		return i_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_Max(String newI_Max) {
		String oldI_Max = i_Max;
		i_Max = newI_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__IMAX, oldI_Max, i_Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getE_Max() {
		return e_Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setE_Max(String newE_Max) {
		String oldE_Max = e_Max;
		e_Max = newE_Max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__EMAX, oldE_Max, e_Max));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__ENERGY, oldEnergy, energy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__EFFICIENCY, oldEfficiency, efficiency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__RATED_KVA, oldRated_kVA, rated_kVA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__VOUT, oldV_Out, v_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__IOUT, oldI_Out, i_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__VA_OUT, oldVA_Out, vA_Out));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__VIN, oldV_In, v_In));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__IIN, oldI_In, i_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_Internal() {
		return v_Internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_Internal(String newV_Internal) {
		String oldV_Internal = v_Internal;
		v_Internal = newV_Internal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__VINTERNAL, oldV_Internal, v_Internal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_Internal() {
		return i_Internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_Internal(String newI_Internal) {
		String oldI_Internal = i_Internal;
		i_Internal = newI_Internal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__IINTERNAL, oldI_Internal, i_Internal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_Prev() {
		return i_Prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_Prev(String newI_Prev) {
		String oldI_Prev = i_Prev;
		i_Prev = newI_Prev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__IPREV, oldI_Prev, i_Prev));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.ENERGY_STORAGE__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_STATUS:
				return getGenerator_status();
			case VisGridPackage.ENERGY_STORAGE__POWER_TYPE:
				return getPower_type();
			case VisGridPackage.ENERGY_STORAGE__RINTERNAL:
				return getRinternal();
			case VisGridPackage.ENERGY_STORAGE__VMAX:
				return getV_Max();
			case VisGridPackage.ENERGY_STORAGE__IMAX:
				return getI_Max();
			case VisGridPackage.ENERGY_STORAGE__EMAX:
				return getE_Max();
			case VisGridPackage.ENERGY_STORAGE__ENERGY:
				return getEnergy();
			case VisGridPackage.ENERGY_STORAGE__EFFICIENCY:
				return getEfficiency();
			case VisGridPackage.ENERGY_STORAGE__RATED_KVA:
				return getRated_kVA();
			case VisGridPackage.ENERGY_STORAGE__VOUT:
				return getV_Out();
			case VisGridPackage.ENERGY_STORAGE__IOUT:
				return getI_Out();
			case VisGridPackage.ENERGY_STORAGE__VA_OUT:
				return getVA_Out();
			case VisGridPackage.ENERGY_STORAGE__VIN:
				return getV_In();
			case VisGridPackage.ENERGY_STORAGE__IIN:
				return getI_In();
			case VisGridPackage.ENERGY_STORAGE__VINTERNAL:
				return getV_Internal();
			case VisGridPackage.ENERGY_STORAGE__IINTERNAL:
				return getI_Internal();
			case VisGridPackage.ENERGY_STORAGE__IPREV:
				return getI_Prev();
			case VisGridPackage.ENERGY_STORAGE__PHASES:
				return getPhases();
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
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_STATUS:
				setGenerator_status((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__POWER_TYPE:
				setPower_type((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__RINTERNAL:
				setRinternal((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__VMAX:
				setV_Max((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__IMAX:
				setI_Max((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__EMAX:
				setE_Max((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__ENERGY:
				setEnergy((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__EFFICIENCY:
				setEfficiency((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__RATED_KVA:
				setRated_kVA((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__VOUT:
				setV_Out((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__IOUT:
				setI_Out((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__VA_OUT:
				setVA_Out((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__VIN:
				setV_In((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__IIN:
				setI_In((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__VINTERNAL:
				setV_Internal((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__IINTERNAL:
				setI_Internal((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__IPREV:
				setI_Prev((String)newValue);
				return;
			case VisGridPackage.ENERGY_STORAGE__PHASES:
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
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_STATUS:
				setGenerator_status(GENERATOR_STATUS_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__POWER_TYPE:
				setPower_type(POWER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__RINTERNAL:
				setRinternal(RINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__VMAX:
				setV_Max(VMAX_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__IMAX:
				setI_Max(IMAX_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__EMAX:
				setE_Max(EMAX_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__ENERGY:
				setEnergy(ENERGY_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__EFFICIENCY:
				setEfficiency(EFFICIENCY_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__RATED_KVA:
				setRated_kVA(RATED_KVA_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__VOUT:
				setV_Out(VOUT_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__IOUT:
				setI_Out(IOUT_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__VA_OUT:
				setVA_Out(VA_OUT_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__VIN:
				setV_In(VIN_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__IIN:
				setI_In(IIN_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__VINTERNAL:
				setV_Internal(VINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__IINTERNAL:
				setI_Internal(IINTERNAL_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__IPREV:
				setI_Prev(IPREV_EDEFAULT);
				return;
			case VisGridPackage.ENERGY_STORAGE__PHASES:
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
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_STATUS:
				return GENERATOR_STATUS_EDEFAULT == null ? generator_status != null : !GENERATOR_STATUS_EDEFAULT.equals(generator_status);
			case VisGridPackage.ENERGY_STORAGE__POWER_TYPE:
				return POWER_TYPE_EDEFAULT == null ? power_type != null : !POWER_TYPE_EDEFAULT.equals(power_type);
			case VisGridPackage.ENERGY_STORAGE__RINTERNAL:
				return RINTERNAL_EDEFAULT == null ? rinternal != null : !RINTERNAL_EDEFAULT.equals(rinternal);
			case VisGridPackage.ENERGY_STORAGE__VMAX:
				return VMAX_EDEFAULT == null ? v_Max != null : !VMAX_EDEFAULT.equals(v_Max);
			case VisGridPackage.ENERGY_STORAGE__IMAX:
				return IMAX_EDEFAULT == null ? i_Max != null : !IMAX_EDEFAULT.equals(i_Max);
			case VisGridPackage.ENERGY_STORAGE__EMAX:
				return EMAX_EDEFAULT == null ? e_Max != null : !EMAX_EDEFAULT.equals(e_Max);
			case VisGridPackage.ENERGY_STORAGE__ENERGY:
				return ENERGY_EDEFAULT == null ? energy != null : !ENERGY_EDEFAULT.equals(energy);
			case VisGridPackage.ENERGY_STORAGE__EFFICIENCY:
				return EFFICIENCY_EDEFAULT == null ? efficiency != null : !EFFICIENCY_EDEFAULT.equals(efficiency);
			case VisGridPackage.ENERGY_STORAGE__RATED_KVA:
				return RATED_KVA_EDEFAULT == null ? rated_kVA != null : !RATED_KVA_EDEFAULT.equals(rated_kVA);
			case VisGridPackage.ENERGY_STORAGE__VOUT:
				return VOUT_EDEFAULT == null ? v_Out != null : !VOUT_EDEFAULT.equals(v_Out);
			case VisGridPackage.ENERGY_STORAGE__IOUT:
				return IOUT_EDEFAULT == null ? i_Out != null : !IOUT_EDEFAULT.equals(i_Out);
			case VisGridPackage.ENERGY_STORAGE__VA_OUT:
				return VA_OUT_EDEFAULT == null ? vA_Out != null : !VA_OUT_EDEFAULT.equals(vA_Out);
			case VisGridPackage.ENERGY_STORAGE__VIN:
				return VIN_EDEFAULT == null ? v_In != null : !VIN_EDEFAULT.equals(v_In);
			case VisGridPackage.ENERGY_STORAGE__IIN:
				return IIN_EDEFAULT == null ? i_In != null : !IIN_EDEFAULT.equals(i_In);
			case VisGridPackage.ENERGY_STORAGE__VINTERNAL:
				return VINTERNAL_EDEFAULT == null ? v_Internal != null : !VINTERNAL_EDEFAULT.equals(v_Internal);
			case VisGridPackage.ENERGY_STORAGE__IINTERNAL:
				return IINTERNAL_EDEFAULT == null ? i_Internal != null : !IINTERNAL_EDEFAULT.equals(i_Internal);
			case VisGridPackage.ENERGY_STORAGE__IPREV:
				return IPREV_EDEFAULT == null ? i_Prev != null : !IPREV_EDEFAULT.equals(i_Prev);
			case VisGridPackage.ENERGY_STORAGE__PHASES:
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
		result.append(" (generator_mode: ");
		result.append(generator_mode);
		result.append(", generator_status: ");
		result.append(generator_status);
		result.append(", power_type: ");
		result.append(power_type);
		result.append(", Rinternal: ");
		result.append(rinternal);
		result.append(", V_Max: ");
		result.append(v_Max);
		result.append(", I_Max: ");
		result.append(i_Max);
		result.append(", E_Max: ");
		result.append(e_Max);
		result.append(", Energy: ");
		result.append(energy);
		result.append(", efficiency: ");
		result.append(efficiency);
		result.append(", Rated_kVA: ");
		result.append(rated_kVA);
		result.append(", V_Out: ");
		result.append(v_Out);
		result.append(", I_Out: ");
		result.append(i_Out);
		result.append(", VA_Out: ");
		result.append(vA_Out);
		result.append(", V_In: ");
		result.append(v_In);
		result.append(", I_In: ");
		result.append(i_In);
		result.append(", V_Internal: ");
		result.append(v_Internal);
		result.append(", I_Internal: ");
		result.append(i_Internal);
		result.append(", I_Prev: ");
		result.append(i_Prev);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //Energy_storageImpl
