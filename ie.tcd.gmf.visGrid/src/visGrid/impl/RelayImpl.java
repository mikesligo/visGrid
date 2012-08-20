/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;
import java.util.HashMap;
        import java.util.Map;
        import java.util.Timer;
        import java.util.TimerTask;
        import java.io.File;
        import java.net.URI;
        import java.net.URISyntaxException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Relay;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RelayImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getTimeDial <em>Time Dial</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getSetCurrent <em>Set Current</em>}</li>
 *   <li>{@link visGrid.impl.RelayImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelayImpl extends ConnectionImpl implements Relay {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();

   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (threadLock) return;
            if (entry.getValue() == false) return;
        }
        resetLock();
    }

    private void resetLock() {
        Timer timer = new Timer();
        class Task extends TimerTask{
            public void run() {
                threadLock = true;
                for (Map.Entry<String, Boolean> entry : lock.entrySet()){
                    entry.setValue(false);
                }
                threadLock = false;
            }   
        }
        timer.schedule(new Task(), lock.size()*30);
    }
    // END PYTHON GENERATED CODE
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
	public String getCurve() {
		// Generated by python script located in this directory
			if (!lock.containsKey("curve")) lock.put("curve", new Boolean(false));
			if (!(Boolean)lock.get("curve")){
				lock.put("curve", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"curve");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Curve");
					curve= val;
			}
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
		// Generated by python script located in this directory
			if (!lock.containsKey("timeDial")) lock.put("timeDial", new Boolean(false));
			if (!(Boolean)lock.get("timeDial")){
				lock.put("timeDial", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"timeDial");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"TimeDial");
					timeDial= val;
			}
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
		// Generated by python script located in this directory
			if (!lock.containsKey("setCurrent")) lock.put("setCurrent", new Boolean(false));
			if (!(Boolean)lock.get("setCurrent")){
				lock.put("setCurrent", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"setCurrent");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"SetCurrent");
					setCurrent= val;
			}
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
		// Generated by python script located in this directory
			if (!lock.containsKey("state")) lock.put("state", new Boolean(false));
			if (!(Boolean)lock.get("state")){
				lock.put("state", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"state");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"State");
					state= val;
			}
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
		result.append(" (Curve: ");
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
