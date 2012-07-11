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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Fuse;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.FuseImpl#getTimeConstant <em>Time Constant</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getSetCurrent <em>Set Current</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getSetBase <em>Set Base</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getSetScale <em>Set Scale</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getSetCurve <em>Set Curve</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getTresetAvg <em>Treset Avg</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getTresetStd <em>Treset Std</em>}</li>
 *   <li>{@link visGrid.impl.FuseImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuseImpl extends ConnectionImpl implements Fuse {
	// Generated by python script located in this directory
       boolean threadLock = false;       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();
   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (entry.getValue().equals(false)) return;
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
        timer.schedule(new Task(), 1000);
    }
    // END PYTHON GENERATED CODE
	/**
	 * The default value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_CONSTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeConstant() <em>Time Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstant()
	 * @generated
	 * @ordered
	 */
	protected String timeConstant = TIME_CONSTANT_EDEFAULT;

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
	 * The default value of the '{@link #getSetBase() <em>Set Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetBase()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetBase() <em>Set Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetBase()
	 * @generated
	 * @ordered
	 */
	protected String setBase = SET_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetScale() <em>Set Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetScale() <em>Set Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetScale()
	 * @generated
	 * @ordered
	 */
	protected String setScale = SET_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetCurve() <em>Set Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetCurve()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_CURVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetCurve() <em>Set Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetCurve()
	 * @generated
	 * @ordered
	 */
	protected String setCurve = SET_CURVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTresetAvg() <em>Treset Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTresetAvg()
	 * @generated
	 * @ordered
	 */
	protected static final String TRESET_AVG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTresetAvg() <em>Treset Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTresetAvg()
	 * @generated
	 * @ordered
	 */
	protected String tresetAvg = TRESET_AVG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTresetStd() <em>Treset Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTresetStd()
	 * @generated
	 * @ordered
	 */
	protected static final String TRESET_STD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTresetStd() <em>Treset Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTresetStd()
	 * @generated
	 * @ordered
	 */
	protected String tresetStd = TRESET_STD_EDEFAULT;

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
	protected FuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getFuse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeConstant() {
		// Generated by python script located in this directory
		if (!lock.containsKey("timeConstant")) lock.put("timeConstant", new Boolean(false));
			if (!(Boolean)lock.get("timeConstant")){
				lock.put("timeConstant", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"timeConstant");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"TimeConstant");
					timeConstant= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return timeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConstant(String newTimeConstant) {
		String oldTimeConstant = timeConstant;
		timeConstant = newTimeConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__TIME_CONSTANT, oldTimeConstant, timeConstant));
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
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"setCurrent");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SetCurrent");
					setCurrent= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__SET_CURRENT, oldSetCurrent, setCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetBase() {
		// Generated by python script located in this directory
		if (!lock.containsKey("setBase")) lock.put("setBase", new Boolean(false));
			if (!(Boolean)lock.get("setBase")){
				lock.put("setBase", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"setBase");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SetBase");
					setBase= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return setBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetBase(String newSetBase) {
		String oldSetBase = setBase;
		setBase = newSetBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__SET_BASE, oldSetBase, setBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetScale() {
		// Generated by python script located in this directory
		if (!lock.containsKey("setScale")) lock.put("setScale", new Boolean(false));
			if (!(Boolean)lock.get("setScale")){
				lock.put("setScale", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"setScale");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SetScale");
					setScale= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return setScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetScale(String newSetScale) {
		String oldSetScale = setScale;
		setScale = newSetScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__SET_SCALE, oldSetScale, setScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetCurve() {
		// Generated by python script located in this directory
		if (!lock.containsKey("setCurve")) lock.put("setCurve", new Boolean(false));
			if (!(Boolean)lock.get("setCurve")){
				lock.put("setCurve", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"setCurve");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"SetCurve");
					setCurve= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return setCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetCurve(String newSetCurve) {
		String oldSetCurve = setCurve;
		setCurve = newSetCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__SET_CURVE, oldSetCurve, setCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTresetAvg() {
		// Generated by python script located in this directory
		if (!lock.containsKey("tresetAvg")) lock.put("tresetAvg", new Boolean(false));
			if (!(Boolean)lock.get("tresetAvg")){
				lock.put("tresetAvg", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"tresetAvg");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"TresetAvg");
					tresetAvg= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return tresetAvg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTresetAvg(String newTresetAvg) {
		String oldTresetAvg = tresetAvg;
		tresetAvg = newTresetAvg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__TRESET_AVG, oldTresetAvg, tresetAvg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTresetStd() {
		// Generated by python script located in this directory
		if (!lock.containsKey("tresetStd")) lock.put("tresetStd", new Boolean(false));
			if (!(Boolean)lock.get("tresetStd")){
				lock.put("tresetStd", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"tresetStd");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"TresetStd");
					tresetStd= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return tresetStd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTresetStd(String newTresetStd) {
		String oldTresetStd = tresetStd;
		tresetStd = newTresetStd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__TRESET_STD, oldTresetStd, tresetStd));
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
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"state");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"State");
					state= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.FUSE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.FUSE__TIME_CONSTANT:
				return getTimeConstant();
			case VisGridPackage.FUSE__SET_CURRENT:
				return getSetCurrent();
			case VisGridPackage.FUSE__SET_BASE:
				return getSetBase();
			case VisGridPackage.FUSE__SET_SCALE:
				return getSetScale();
			case VisGridPackage.FUSE__SET_CURVE:
				return getSetCurve();
			case VisGridPackage.FUSE__TRESET_AVG:
				return getTresetAvg();
			case VisGridPackage.FUSE__TRESET_STD:
				return getTresetStd();
			case VisGridPackage.FUSE__STATE:
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
			case VisGridPackage.FUSE__TIME_CONSTANT:
				setTimeConstant((String)newValue);
				return;
			case VisGridPackage.FUSE__SET_CURRENT:
				setSetCurrent((String)newValue);
				return;
			case VisGridPackage.FUSE__SET_BASE:
				setSetBase((String)newValue);
				return;
			case VisGridPackage.FUSE__SET_SCALE:
				setSetScale((String)newValue);
				return;
			case VisGridPackage.FUSE__SET_CURVE:
				setSetCurve((String)newValue);
				return;
			case VisGridPackage.FUSE__TRESET_AVG:
				setTresetAvg((String)newValue);
				return;
			case VisGridPackage.FUSE__TRESET_STD:
				setTresetStd((String)newValue);
				return;
			case VisGridPackage.FUSE__STATE:
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
			case VisGridPackage.FUSE__TIME_CONSTANT:
				setTimeConstant(TIME_CONSTANT_EDEFAULT);
				return;
			case VisGridPackage.FUSE__SET_CURRENT:
				setSetCurrent(SET_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.FUSE__SET_BASE:
				setSetBase(SET_BASE_EDEFAULT);
				return;
			case VisGridPackage.FUSE__SET_SCALE:
				setSetScale(SET_SCALE_EDEFAULT);
				return;
			case VisGridPackage.FUSE__SET_CURVE:
				setSetCurve(SET_CURVE_EDEFAULT);
				return;
			case VisGridPackage.FUSE__TRESET_AVG:
				setTresetAvg(TRESET_AVG_EDEFAULT);
				return;
			case VisGridPackage.FUSE__TRESET_STD:
				setTresetStd(TRESET_STD_EDEFAULT);
				return;
			case VisGridPackage.FUSE__STATE:
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
			case VisGridPackage.FUSE__TIME_CONSTANT:
				return TIME_CONSTANT_EDEFAULT == null ? timeConstant != null : !TIME_CONSTANT_EDEFAULT.equals(timeConstant);
			case VisGridPackage.FUSE__SET_CURRENT:
				return SET_CURRENT_EDEFAULT == null ? setCurrent != null : !SET_CURRENT_EDEFAULT.equals(setCurrent);
			case VisGridPackage.FUSE__SET_BASE:
				return SET_BASE_EDEFAULT == null ? setBase != null : !SET_BASE_EDEFAULT.equals(setBase);
			case VisGridPackage.FUSE__SET_SCALE:
				return SET_SCALE_EDEFAULT == null ? setScale != null : !SET_SCALE_EDEFAULT.equals(setScale);
			case VisGridPackage.FUSE__SET_CURVE:
				return SET_CURVE_EDEFAULT == null ? setCurve != null : !SET_CURVE_EDEFAULT.equals(setCurve);
			case VisGridPackage.FUSE__TRESET_AVG:
				return TRESET_AVG_EDEFAULT == null ? tresetAvg != null : !TRESET_AVG_EDEFAULT.equals(tresetAvg);
			case VisGridPackage.FUSE__TRESET_STD:
				return TRESET_STD_EDEFAULT == null ? tresetStd != null : !TRESET_STD_EDEFAULT.equals(tresetStd);
			case VisGridPackage.FUSE__STATE:
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
		result.append(" (TimeConstant: ");
		result.append(timeConstant);
		result.append(", SetCurrent: ");
		result.append(setCurrent);
		result.append(", SetBase: ");
		result.append(setBase);
		result.append(", SetScale: ");
		result.append(setScale);
		result.append(", SetCurve: ");
		result.append(setCurve);
		result.append(", TresetAvg: ");
		result.append(tresetAvg);
		result.append(", TresetStd: ");
		result.append(tresetStd);
		result.append(", State: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //FuseImpl
