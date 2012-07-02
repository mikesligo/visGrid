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

import visGrid.Power_electronics;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power electronics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getConverter_type <em>Converter type</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getSwitch_type <em>Switch type</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getFilter_type <em>Filter type</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getFilter_implementation <em>Filter implementation</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getFilter_frequency <em>Filter frequency</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getRated_kW <em>Rated kW</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getMax_P <em>Max P</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getMin_P <em>Min P</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getRated_kV <em>Rated kV</em>}</li>
 *   <li>{@link visGrid.impl.Power_electronicsImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Power_electronicsImpl extends ConnectionImpl implements Power_electronics {
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
	 * The default value of the '{@link #getConverter_type() <em>Converter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverter_type()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConverter_type() <em>Converter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverter_type()
	 * @generated
	 * @ordered
	 */
	protected String converter_type = CONVERTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwitch_type() <em>Switch type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch_type()
	 * @generated
	 * @ordered
	 */
	protected static final String SWITCH_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwitch_type() <em>Switch type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch_type()
	 * @generated
	 * @ordered
	 */
	protected String switch_type = SWITCH_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter_type() <em>Filter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_type()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter_type() <em>Filter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_type()
	 * @generated
	 * @ordered
	 */
	protected String filter_type = FILTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter_implementation() <em>Filter implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_implementation()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter_implementation() <em>Filter implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_implementation()
	 * @generated
	 * @ordered
	 */
	protected String filter_implementation = FILTER_IMPLEMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter_frequency() <em>Filter frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_frequency()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter_frequency() <em>Filter frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_frequency()
	 * @generated
	 * @ordered
	 */
	protected String filter_frequency = FILTER_FREQUENCY_EDEFAULT;

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
	 * The default value of the '{@link #getRated_kW() <em>Rated kW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kW()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_KW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRated_kW() <em>Rated kW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRated_kW()
	 * @generated
	 * @ordered
	 */
	protected String rated_kW = RATED_KW_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_P() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_P()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_P() <em>Max P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_P()
	 * @generated
	 * @ordered
	 */
	protected String max_P = MAX_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_P() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_P()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_P() <em>Min P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_P()
	 * @generated
	 * @ordered
	 */
	protected String min_P = MIN_P_EDEFAULT;

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
	protected Power_electronicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getPower_electronics();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__GENERATOR_MODE, oldGenerator_mode, generator_mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__GENERATOR_STATUS, oldGenerator_status, generator_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConverter_type() {
		return converter_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverter_type(String newConverter_type) {
		String oldConverter_type = converter_type;
		converter_type = newConverter_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__CONVERTER_TYPE, oldConverter_type, converter_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwitch_type() {
		return switch_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch_type(String newSwitch_type) {
		String oldSwitch_type = switch_type;
		switch_type = newSwitch_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__SWITCH_TYPE, oldSwitch_type, switch_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter_type() {
		return filter_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter_type(String newFilter_type) {
		String oldFilter_type = filter_type;
		filter_type = newFilter_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__FILTER_TYPE, oldFilter_type, filter_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter_implementation() {
		return filter_implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter_implementation(String newFilter_implementation) {
		String oldFilter_implementation = filter_implementation;
		filter_implementation = newFilter_implementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__FILTER_IMPLEMENTATION, oldFilter_implementation, filter_implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter_frequency() {
		return filter_frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter_frequency(String newFilter_frequency) {
		String oldFilter_frequency = filter_frequency;
		filter_frequency = newFilter_frequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__FILTER_FREQUENCY, oldFilter_frequency, filter_frequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__POWER_TYPE, oldPower_type, power_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRated_kW() {
		return rated_kW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRated_kW(String newRated_kW) {
		String oldRated_kW = rated_kW;
		rated_kW = newRated_kW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__RATED_KW, oldRated_kW, rated_kW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_P() {
		return max_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_P(String newMax_P) {
		String oldMax_P = max_P;
		max_P = newMax_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__MAX_P, oldMax_P, max_P));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_P() {
		return min_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_P(String newMin_P) {
		String oldMin_P = min_P;
		min_P = newMin_P;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__MIN_P, oldMin_P, min_P));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__RATED_KVA, oldRated_kVA, rated_kVA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__RATED_KV, oldRated_kV, rated_kV));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.POWER_ELECTRONICS__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_STATUS:
				return getGenerator_status();
			case VisGridPackage.POWER_ELECTRONICS__CONVERTER_TYPE:
				return getConverter_type();
			case VisGridPackage.POWER_ELECTRONICS__SWITCH_TYPE:
				return getSwitch_type();
			case VisGridPackage.POWER_ELECTRONICS__FILTER_TYPE:
				return getFilter_type();
			case VisGridPackage.POWER_ELECTRONICS__FILTER_IMPLEMENTATION:
				return getFilter_implementation();
			case VisGridPackage.POWER_ELECTRONICS__FILTER_FREQUENCY:
				return getFilter_frequency();
			case VisGridPackage.POWER_ELECTRONICS__POWER_TYPE:
				return getPower_type();
			case VisGridPackage.POWER_ELECTRONICS__RATED_KW:
				return getRated_kW();
			case VisGridPackage.POWER_ELECTRONICS__MAX_P:
				return getMax_P();
			case VisGridPackage.POWER_ELECTRONICS__MIN_P:
				return getMin_P();
			case VisGridPackage.POWER_ELECTRONICS__RATED_KVA:
				return getRated_kVA();
			case VisGridPackage.POWER_ELECTRONICS__RATED_KV:
				return getRated_kV();
			case VisGridPackage.POWER_ELECTRONICS__PHASES:
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
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_STATUS:
				setGenerator_status((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__CONVERTER_TYPE:
				setConverter_type((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__SWITCH_TYPE:
				setSwitch_type((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__FILTER_TYPE:
				setFilter_type((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__FILTER_IMPLEMENTATION:
				setFilter_implementation((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__FILTER_FREQUENCY:
				setFilter_frequency((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__POWER_TYPE:
				setPower_type((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__RATED_KW:
				setRated_kW((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__MAX_P:
				setMax_P((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__MIN_P:
				setMin_P((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__RATED_KVA:
				setRated_kVA((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__RATED_KV:
				setRated_kV((String)newValue);
				return;
			case VisGridPackage.POWER_ELECTRONICS__PHASES:
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
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_STATUS:
				setGenerator_status(GENERATOR_STATUS_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__CONVERTER_TYPE:
				setConverter_type(CONVERTER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__SWITCH_TYPE:
				setSwitch_type(SWITCH_TYPE_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__FILTER_TYPE:
				setFilter_type(FILTER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__FILTER_IMPLEMENTATION:
				setFilter_implementation(FILTER_IMPLEMENTATION_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__FILTER_FREQUENCY:
				setFilter_frequency(FILTER_FREQUENCY_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__POWER_TYPE:
				setPower_type(POWER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__RATED_KW:
				setRated_kW(RATED_KW_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__MAX_P:
				setMax_P(MAX_P_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__MIN_P:
				setMin_P(MIN_P_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__RATED_KVA:
				setRated_kVA(RATED_KVA_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__RATED_KV:
				setRated_kV(RATED_KV_EDEFAULT);
				return;
			case VisGridPackage.POWER_ELECTRONICS__PHASES:
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
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.POWER_ELECTRONICS__GENERATOR_STATUS:
				return GENERATOR_STATUS_EDEFAULT == null ? generator_status != null : !GENERATOR_STATUS_EDEFAULT.equals(generator_status);
			case VisGridPackage.POWER_ELECTRONICS__CONVERTER_TYPE:
				return CONVERTER_TYPE_EDEFAULT == null ? converter_type != null : !CONVERTER_TYPE_EDEFAULT.equals(converter_type);
			case VisGridPackage.POWER_ELECTRONICS__SWITCH_TYPE:
				return SWITCH_TYPE_EDEFAULT == null ? switch_type != null : !SWITCH_TYPE_EDEFAULT.equals(switch_type);
			case VisGridPackage.POWER_ELECTRONICS__FILTER_TYPE:
				return FILTER_TYPE_EDEFAULT == null ? filter_type != null : !FILTER_TYPE_EDEFAULT.equals(filter_type);
			case VisGridPackage.POWER_ELECTRONICS__FILTER_IMPLEMENTATION:
				return FILTER_IMPLEMENTATION_EDEFAULT == null ? filter_implementation != null : !FILTER_IMPLEMENTATION_EDEFAULT.equals(filter_implementation);
			case VisGridPackage.POWER_ELECTRONICS__FILTER_FREQUENCY:
				return FILTER_FREQUENCY_EDEFAULT == null ? filter_frequency != null : !FILTER_FREQUENCY_EDEFAULT.equals(filter_frequency);
			case VisGridPackage.POWER_ELECTRONICS__POWER_TYPE:
				return POWER_TYPE_EDEFAULT == null ? power_type != null : !POWER_TYPE_EDEFAULT.equals(power_type);
			case VisGridPackage.POWER_ELECTRONICS__RATED_KW:
				return RATED_KW_EDEFAULT == null ? rated_kW != null : !RATED_KW_EDEFAULT.equals(rated_kW);
			case VisGridPackage.POWER_ELECTRONICS__MAX_P:
				return MAX_P_EDEFAULT == null ? max_P != null : !MAX_P_EDEFAULT.equals(max_P);
			case VisGridPackage.POWER_ELECTRONICS__MIN_P:
				return MIN_P_EDEFAULT == null ? min_P != null : !MIN_P_EDEFAULT.equals(min_P);
			case VisGridPackage.POWER_ELECTRONICS__RATED_KVA:
				return RATED_KVA_EDEFAULT == null ? rated_kVA != null : !RATED_KVA_EDEFAULT.equals(rated_kVA);
			case VisGridPackage.POWER_ELECTRONICS__RATED_KV:
				return RATED_KV_EDEFAULT == null ? rated_kV != null : !RATED_KV_EDEFAULT.equals(rated_kV);
			case VisGridPackage.POWER_ELECTRONICS__PHASES:
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
		result.append(", converter_type: ");
		result.append(converter_type);
		result.append(", switch_type: ");
		result.append(switch_type);
		result.append(", filter_type: ");
		result.append(filter_type);
		result.append(", filter_implementation: ");
		result.append(filter_implementation);
		result.append(", filter_frequency: ");
		result.append(filter_frequency);
		result.append(", power_type: ");
		result.append(power_type);
		result.append(", Rated_kW: ");
		result.append(rated_kW);
		result.append(", Max_P: ");
		result.append(max_P);
		result.append(", Min_P: ");
		result.append(min_P);
		result.append(", Rated_kVA: ");
		result.append(rated_kVA);
		result.append(", Rated_kV: ");
		result.append(rated_kV);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //Power_electronicsImpl
