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
import visGrid.Relay;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RelayImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getTimeDial <em>Time Dial</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getSetCurrent <em>Set Current</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelayImpl extends EObjectImpl implements Relay {
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
	 * The default value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected static final String CURVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected String curve = CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeDial() <em>Time Dial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDial()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeDial() <em>Time Dial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDial()
	 * @generated
	 * @ordered
	 */
	protected String timeDial = TIME_DIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetCurrent() <em>Set Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetCurrent() <em>Set Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetCurrent()
	 * @generated
	 * @ordered
	 */
	protected String setCurrent = SET_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRelay();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.RELAY__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RELAY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve(String newCurve) {
		String oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RELAY__CURVE, oldCurve, curve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeDial() {
		return timeDial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDial(String newTimeDial) {
		String oldTimeDial = timeDial;
		timeDial = newTimeDial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RELAY__TIME_DIAL, oldTimeDial, timeDial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetCurrent() {
		return setCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetCurrent(String newSetCurrent) {
		String oldSetCurrent = setCurrent;
		setCurrent = newSetCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RELAY__SET_CURRENT, oldSetCurrent, setCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RELAY__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.RELAY__CONNECTION:
				return getConnection();
			case VisGridPackage.RELAY__NAME:
				return getName();
			case VisGridPackage.RELAY__CURVE:
				return getCurve();
			case VisGridPackage.RELAY__TIME_DIAL:
				return getTimeDial();
			case VisGridPackage.RELAY__SET_CURRENT:
				return getSetCurrent();
			case VisGridPackage.RELAY__STATE:
				return getState();
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
			case VisGridPackage.RELAY__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.RELAY__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.RELAY__CURVE:
				setCurve((String)newValue);
				return;
			case VisGridPackage.RELAY__TIME_DIAL:
				setTimeDial((String)newValue);
				return;
			case VisGridPackage.RELAY__SET_CURRENT:
				setSetCurrent((String)newValue);
				return;
			case VisGridPackage.RELAY__STATE:
				setState((String)newValue);
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
			case VisGridPackage.RELAY__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.RELAY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.RELAY__CURVE:
				setCurve(CURVE_EDEFAULT);
				return;
			case VisGridPackage.RELAY__TIME_DIAL:
				setTimeDial(TIME_DIAL_EDEFAULT);
				return;
			case VisGridPackage.RELAY__SET_CURRENT:
				setSetCurrent(SET_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.RELAY__STATE:
				setState(STATE_EDEFAULT);
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
			case VisGridPackage.RELAY__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.RELAY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.RELAY__CURVE:
				return CURVE_EDEFAULT == null ? curve != null : !CURVE_EDEFAULT.equals(curve);
			case VisGridPackage.RELAY__TIME_DIAL:
				return TIME_DIAL_EDEFAULT == null ? timeDial != null : !TIME_DIAL_EDEFAULT.equals(timeDial);
			case VisGridPackage.RELAY__SET_CURRENT:
				return SET_CURRENT_EDEFAULT == null ? setCurrent != null : !SET_CURRENT_EDEFAULT.equals(setCurrent);
			case VisGridPackage.RELAY__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(", Curve: ");
		result.append(curve);
		result.append(", TimeDial: ");
		result.append(timeDial);
		result.append(", SetCurrent: ");
		result.append(setCurrent);
		result.append(", State: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //RelayImpl