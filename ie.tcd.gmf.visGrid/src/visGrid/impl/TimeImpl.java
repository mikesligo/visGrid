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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import visGrid.Time;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.TimeImpl#getSimulatorTime <em>Simulator Time</em>}</li>
 *   <li>{@link visGrid.impl.TimeImpl#getRealtime <em>Realtime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeImpl extends EObjectImpl implements Time {
	/**
	 * The default value of the '{@link #getSimulatorTime() <em>Simulator Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulatorTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMULATOR_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimulatorTime() <em>Simulator Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulatorTime()
	 * @generated
	 * @ordered
	 */
	protected String simulatorTime = SIMULATOR_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRealtime() <em>Realtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtime()
	 * @generated
	 * @ordered
	 */
	protected static final String REALTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealtime() <em>Realtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtime()
	 * @generated
	 * @ordered
	 */
	protected String realtime = REALTIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimulatorTime() {
		simulatorTime = http.Property.getValue("simtime");
		return simulatorTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulatorTime(String newSimulatorTime) {
		String oldSimulatorTime = simulatorTime;
		simulatorTime = newSimulatorTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TIME__SIMULATOR_TIME, oldSimulatorTime, simulatorTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRealtime() {
		realtime = http.Property.getValue("realtime");
		return realtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtime(String newRealtime) {
		String oldRealtime = realtime;
		realtime = newRealtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TIME__REALTIME, oldRealtime, realtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.TIME__SIMULATOR_TIME:
				return getSimulatorTime();
			case VisGridPackage.TIME__REALTIME:
				return getRealtime();
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
			case VisGridPackage.TIME__SIMULATOR_TIME:
				setSimulatorTime((String)newValue);
				return;
			case VisGridPackage.TIME__REALTIME:
				setRealtime((String)newValue);
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
			case VisGridPackage.TIME__SIMULATOR_TIME:
				setSimulatorTime(SIMULATOR_TIME_EDEFAULT);
				return;
			case VisGridPackage.TIME__REALTIME:
				setRealtime(REALTIME_EDEFAULT);
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
			case VisGridPackage.TIME__SIMULATOR_TIME:
				return SIMULATOR_TIME_EDEFAULT == null ? simulatorTime != null : !SIMULATOR_TIME_EDEFAULT.equals(simulatorTime);
			case VisGridPackage.TIME__REALTIME:
				return REALTIME_EDEFAULT == null ? realtime != null : !REALTIME_EDEFAULT.equals(realtime);
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
		result.append(" (SimulatorTime: ");
		result.append(simulatorTime);
		result.append(", Realtime: ");
		result.append(realtime);
		result.append(')');
		return result.toString();
	}

} //TimeImpl
