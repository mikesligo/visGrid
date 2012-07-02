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

import visGrid.Comm;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.CommImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link visGrid.impl.CommImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link visGrid.impl.CommImpl#getBitrate <em>Bitrate</em>}</li>
 *   <li>{@link visGrid.impl.CommImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommImpl extends ConnectionImpl implements Comm {
	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected String latency = LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected String reliability = RELIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitrate() <em>Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitrate()
	 * @generated
	 * @ordered
	 */
	protected static final String BITRATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitrate() <em>Bitrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitrate()
	 * @generated
	 * @ordered
	 */
	protected String bitrate = BITRATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getComm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(String newLatency) {
		String oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.COMM__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(String newReliability) {
		String oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.COMM__RELIABILITY, oldReliability, reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBitrate() {
		return bitrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitrate(String newBitrate) {
		String oldBitrate = bitrate;
		bitrate = newBitrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.COMM__BITRATE, oldBitrate, bitrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.COMM__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.COMM__LATENCY:
				return getLatency();
			case VisGridPackage.COMM__RELIABILITY:
				return getReliability();
			case VisGridPackage.COMM__BITRATE:
				return getBitrate();
			case VisGridPackage.COMM__TIMEOUT:
				return getTimeout();
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
			case VisGridPackage.COMM__LATENCY:
				setLatency((String)newValue);
				return;
			case VisGridPackage.COMM__RELIABILITY:
				setReliability((String)newValue);
				return;
			case VisGridPackage.COMM__BITRATE:
				setBitrate((String)newValue);
				return;
			case VisGridPackage.COMM__TIMEOUT:
				setTimeout((String)newValue);
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
			case VisGridPackage.COMM__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case VisGridPackage.COMM__RELIABILITY:
				setReliability(RELIABILITY_EDEFAULT);
				return;
			case VisGridPackage.COMM__BITRATE:
				setBitrate(BITRATE_EDEFAULT);
				return;
			case VisGridPackage.COMM__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case VisGridPackage.COMM__LATENCY:
				return LATENCY_EDEFAULT == null ? latency != null : !LATENCY_EDEFAULT.equals(latency);
			case VisGridPackage.COMM__RELIABILITY:
				return RELIABILITY_EDEFAULT == null ? reliability != null : !RELIABILITY_EDEFAULT.equals(reliability);
			case VisGridPackage.COMM__BITRATE:
				return BITRATE_EDEFAULT == null ? bitrate != null : !BITRATE_EDEFAULT.equals(bitrate);
			case VisGridPackage.COMM__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
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
		result.append(" (latency: ");
		result.append(latency);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", bitrate: ");
		result.append(bitrate);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //CommImpl
