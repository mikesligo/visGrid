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

import visGrid.Capbank;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capbank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.CapbankImpl#getKVARrated <em>KVA Rrated</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getVrated <em>Vrated</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getState <em>State</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getCTlink <em>CTlink</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getPTnode <em>PTnode</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getVARopen <em>VA Ropen</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getVARclose <em>VA Rclose</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getVopen <em>Vopen</em>}</li>
 *   <li>{@link visGrid.impl.CapbankImpl#getVclose <em>Vclose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapbankImpl extends ConnectionImpl implements Capbank {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getKVARrated() <em>KVA Rrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKVARrated()
	 * @generated
	 * @ordered
	 */
	protected static final String KVA_RRATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKVARrated() <em>KVA Rrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKVARrated()
	 * @generated
	 * @ordered
	 */
	protected String kvaRrated = KVA_RRATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVrated() <em>Vrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrated()
	 * @generated
	 * @ordered
	 */
	protected static final String VRATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVrated() <em>Vrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVrated()
	 * @generated
	 * @ordered
	 */
	protected String vrated = VRATED_EDEFAULT;

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
	 * The default value of the '{@link #getCTlink() <em>CTlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTlink()
	 * @generated
	 * @ordered
	 */
	protected static final String CTLINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTlink() <em>CTlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTlink()
	 * @generated
	 * @ordered
	 */
	protected String cTlink = CTLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPTnode() <em>PTnode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTnode()
	 * @generated
	 * @ordered
	 */
	protected static final String PTNODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPTnode() <em>PTnode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTnode()
	 * @generated
	 * @ordered
	 */
	protected String pTnode = PTNODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVARopen() <em>VA Ropen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARopen()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_ROPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVARopen() <em>VA Ropen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARopen()
	 * @generated
	 * @ordered
	 */
	protected String vaRopen = VA_ROPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVARclose() <em>VA Rclose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARclose()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_RCLOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVARclose() <em>VA Rclose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARclose()
	 * @generated
	 * @ordered
	 */
	protected String vaRclose = VA_RCLOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVopen() <em>Vopen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVopen()
	 * @generated
	 * @ordered
	 */
	protected static final String VOPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVopen() <em>Vopen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVopen()
	 * @generated
	 * @ordered
	 */
	protected String vopen = VOPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVclose() <em>Vclose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVclose()
	 * @generated
	 * @ordered
	 */
	protected static final String VCLOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVclose() <em>Vclose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVclose()
	 * @generated
	 * @ordered
	 */
	protected String vclose = VCLOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapbankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getCapbank();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKVARrated() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"kvaRrated");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"KvaRrated");
				kvaRrated= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return kvaRrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKVARrated(String newKVARrated) {
		String oldKVARrated = kvaRrated;
		kvaRrated = newKVARrated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__KVA_RRATED, oldKVARrated, kvaRrated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVrated() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vrated");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Vrated");
				vrated= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVrated(String newVrated) {
		String oldVrated = vrated;
		vrated = newVrated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__VRATED, oldVrated, vrated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		// Generated by python script located in this directory
		if (!lock){
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTlink() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"cTlink");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"CTlink");
				cTlink= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cTlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTlink(String newCTlink) {
		String oldCTlink = cTlink;
		cTlink = newCTlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__CTLINK, oldCTlink, cTlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPTnode() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"pTnode");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"PTnode");
				pTnode= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return pTnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTnode(String newPTnode) {
		String oldPTnode = pTnode;
		pTnode = newPTnode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__PTNODE, oldPTnode, pTnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVARopen() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vaRopen");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"VaRopen");
				vaRopen= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vaRopen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVARopen(String newVARopen) {
		String oldVARopen = vaRopen;
		vaRopen = newVARopen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__VA_ROPEN, oldVARopen, vaRopen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVARclose() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vaRclose");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"VaRclose");
				vaRclose= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vaRclose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVARclose(String newVARclose) {
		String oldVARclose = vaRclose;
		vaRclose = newVARclose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__VA_RCLOSE, oldVARclose, vaRclose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVopen() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vopen");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Vopen");
				vopen= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vopen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVopen(String newVopen) {
		String oldVopen = vopen;
		vopen = newVopen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__VOPEN, oldVopen, vopen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVclose() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"vclose");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Vclose");
				vclose= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vclose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVclose(String newVclose) {
		String oldVclose = vclose;
		vclose = newVclose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CAPBANK__VCLOSE, oldVclose, vclose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CAPBANK__KVA_RRATED:
				return getKVARrated();
			case VisGridPackage.CAPBANK__VRATED:
				return getVrated();
			case VisGridPackage.CAPBANK__STATE:
				return getState();
			case VisGridPackage.CAPBANK__CTLINK:
				return getCTlink();
			case VisGridPackage.CAPBANK__PTNODE:
				return getPTnode();
			case VisGridPackage.CAPBANK__VA_ROPEN:
				return getVARopen();
			case VisGridPackage.CAPBANK__VA_RCLOSE:
				return getVARclose();
			case VisGridPackage.CAPBANK__VOPEN:
				return getVopen();
			case VisGridPackage.CAPBANK__VCLOSE:
				return getVclose();
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
			case VisGridPackage.CAPBANK__KVA_RRATED:
				setKVARrated((String)newValue);
				return;
			case VisGridPackage.CAPBANK__VRATED:
				setVrated((String)newValue);
				return;
			case VisGridPackage.CAPBANK__STATE:
				setState((String)newValue);
				return;
			case VisGridPackage.CAPBANK__CTLINK:
				setCTlink((String)newValue);
				return;
			case VisGridPackage.CAPBANK__PTNODE:
				setPTnode((String)newValue);
				return;
			case VisGridPackage.CAPBANK__VA_ROPEN:
				setVARopen((String)newValue);
				return;
			case VisGridPackage.CAPBANK__VA_RCLOSE:
				setVARclose((String)newValue);
				return;
			case VisGridPackage.CAPBANK__VOPEN:
				setVopen((String)newValue);
				return;
			case VisGridPackage.CAPBANK__VCLOSE:
				setVclose((String)newValue);
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
			case VisGridPackage.CAPBANK__KVA_RRATED:
				setKVARrated(KVA_RRATED_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__VRATED:
				setVrated(VRATED_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__STATE:
				setState(STATE_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__CTLINK:
				setCTlink(CTLINK_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__PTNODE:
				setPTnode(PTNODE_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__VA_ROPEN:
				setVARopen(VA_ROPEN_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__VA_RCLOSE:
				setVARclose(VA_RCLOSE_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__VOPEN:
				setVopen(VOPEN_EDEFAULT);
				return;
			case VisGridPackage.CAPBANK__VCLOSE:
				setVclose(VCLOSE_EDEFAULT);
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
			case VisGridPackage.CAPBANK__KVA_RRATED:
				return KVA_RRATED_EDEFAULT == null ? kvaRrated != null : !KVA_RRATED_EDEFAULT.equals(kvaRrated);
			case VisGridPackage.CAPBANK__VRATED:
				return VRATED_EDEFAULT == null ? vrated != null : !VRATED_EDEFAULT.equals(vrated);
			case VisGridPackage.CAPBANK__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case VisGridPackage.CAPBANK__CTLINK:
				return CTLINK_EDEFAULT == null ? cTlink != null : !CTLINK_EDEFAULT.equals(cTlink);
			case VisGridPackage.CAPBANK__PTNODE:
				return PTNODE_EDEFAULT == null ? pTnode != null : !PTNODE_EDEFAULT.equals(pTnode);
			case VisGridPackage.CAPBANK__VA_ROPEN:
				return VA_ROPEN_EDEFAULT == null ? vaRopen != null : !VA_ROPEN_EDEFAULT.equals(vaRopen);
			case VisGridPackage.CAPBANK__VA_RCLOSE:
				return VA_RCLOSE_EDEFAULT == null ? vaRclose != null : !VA_RCLOSE_EDEFAULT.equals(vaRclose);
			case VisGridPackage.CAPBANK__VOPEN:
				return VOPEN_EDEFAULT == null ? vopen != null : !VOPEN_EDEFAULT.equals(vopen);
			case VisGridPackage.CAPBANK__VCLOSE:
				return VCLOSE_EDEFAULT == null ? vclose != null : !VCLOSE_EDEFAULT.equals(vclose);
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
		result.append(" (KVARrated: ");
		result.append(kvaRrated);
		result.append(", Vrated: ");
		result.append(vrated);
		result.append(", state: ");
		result.append(state);
		result.append(", CTlink: ");
		result.append(cTlink);
		result.append(", PTnode: ");
		result.append(pTnode);
		result.append(", VARopen: ");
		result.append(vaRopen);
		result.append(", VARclose: ");
		result.append(vaRclose);
		result.append(", Vopen: ");
		result.append(vopen);
		result.append(", Vclose: ");
		result.append(vclose);
		result.append(')');
		return result.toString();
	}

} //CapbankImpl
