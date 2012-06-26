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
import visGrid.Regulator;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RegulatorImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getVmax <em>Vmax</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getVmin <em>Vmin</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getVstep <em>Vstep</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getCTlink <em>CTlink</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getPTbus <em>PTbus</em>}</li>
 *   <li>{@link visGrid.impl.RegulatorImpl#getTimeDelay <em>Time Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulatorImpl extends EObjectImpl implements Regulator {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmax()
	 * @generated
	 * @ordered
	 */
	protected static final String VMAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmax() <em>Vmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmax()
	 * @generated
	 * @ordered
	 */
	protected String vmax = VMAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmin()
	 * @generated
	 * @ordered
	 */
	protected static final String VMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmin() <em>Vmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmin()
	 * @generated
	 * @ordered
	 */
	protected String vmin = VMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVstep() <em>Vstep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVstep()
	 * @generated
	 * @ordered
	 */
	protected static final String VSTEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVstep() <em>Vstep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVstep()
	 * @generated
	 * @ordered
	 */
	protected String vstep = VSTEP_EDEFAULT;

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
	 * The default value of the '{@link #getPTbus() <em>PTbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTbus()
	 * @generated
	 * @ordered
	 */
	protected static final String PTBUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPTbus() <em>PTbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTbus()
	 * @generated
	 * @ordered
	 */
	protected String pTbus = PTBUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeDelay() <em>Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeDelay() <em>Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected String timeDelay = TIME_DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRegulator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.REGULATOR__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmax() {
		return vmax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmax(String newVmax) {
		String oldVmax = vmax;
		vmax = newVmax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__VMAX, oldVmax, vmax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmin() {
		return vmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmin(String newVmin) {
		String oldVmin = vmin;
		vmin = newVmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__VMIN, oldVmin, vmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVstep() {
		return vstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVstep(String newVstep) {
		String oldVstep = vstep;
		vstep = newVstep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__VSTEP, oldVstep, vstep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTlink() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__CTLINK, oldCTlink, cTlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPTbus() {
		return pTbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTbus(String newPTbus) {
		String oldPTbus = pTbus;
		pTbus = newPTbus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__PTBUS, oldPTbus, pTbus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeDelay() {
		return timeDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDelay(String newTimeDelay) {
		String oldTimeDelay = timeDelay;
		timeDelay = newTimeDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.REGULATOR__TIME_DELAY, oldTimeDelay, timeDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.REGULATOR__CONNECTION:
				return getConnection();
			case VisGridPackage.REGULATOR__NAME:
				return getName();
			case VisGridPackage.REGULATOR__TYPE:
				return getType();
			case VisGridPackage.REGULATOR__VMAX:
				return getVmax();
			case VisGridPackage.REGULATOR__VMIN:
				return getVmin();
			case VisGridPackage.REGULATOR__VSTEP:
				return getVstep();
			case VisGridPackage.REGULATOR__CTLINK:
				return getCTlink();
			case VisGridPackage.REGULATOR__PTBUS:
				return getPTbus();
			case VisGridPackage.REGULATOR__TIME_DELAY:
				return getTimeDelay();
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
			case VisGridPackage.REGULATOR__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.REGULATOR__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.REGULATOR__TYPE:
				setType((String)newValue);
				return;
			case VisGridPackage.REGULATOR__VMAX:
				setVmax((String)newValue);
				return;
			case VisGridPackage.REGULATOR__VMIN:
				setVmin((String)newValue);
				return;
			case VisGridPackage.REGULATOR__VSTEP:
				setVstep((String)newValue);
				return;
			case VisGridPackage.REGULATOR__CTLINK:
				setCTlink((String)newValue);
				return;
			case VisGridPackage.REGULATOR__PTBUS:
				setPTbus((String)newValue);
				return;
			case VisGridPackage.REGULATOR__TIME_DELAY:
				setTimeDelay((String)newValue);
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
			case VisGridPackage.REGULATOR__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.REGULATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__VMAX:
				setVmax(VMAX_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__VMIN:
				setVmin(VMIN_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__VSTEP:
				setVstep(VSTEP_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__CTLINK:
				setCTlink(CTLINK_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__PTBUS:
				setPTbus(PTBUS_EDEFAULT);
				return;
			case VisGridPackage.REGULATOR__TIME_DELAY:
				setTimeDelay(TIME_DELAY_EDEFAULT);
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
			case VisGridPackage.REGULATOR__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.REGULATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.REGULATOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case VisGridPackage.REGULATOR__VMAX:
				return VMAX_EDEFAULT == null ? vmax != null : !VMAX_EDEFAULT.equals(vmax);
			case VisGridPackage.REGULATOR__VMIN:
				return VMIN_EDEFAULT == null ? vmin != null : !VMIN_EDEFAULT.equals(vmin);
			case VisGridPackage.REGULATOR__VSTEP:
				return VSTEP_EDEFAULT == null ? vstep != null : !VSTEP_EDEFAULT.equals(vstep);
			case VisGridPackage.REGULATOR__CTLINK:
				return CTLINK_EDEFAULT == null ? cTlink != null : !CTLINK_EDEFAULT.equals(cTlink);
			case VisGridPackage.REGULATOR__PTBUS:
				return PTBUS_EDEFAULT == null ? pTbus != null : !PTBUS_EDEFAULT.equals(pTbus);
			case VisGridPackage.REGULATOR__TIME_DELAY:
				return TIME_DELAY_EDEFAULT == null ? timeDelay != null : !TIME_DELAY_EDEFAULT.equals(timeDelay);
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
		result.append(", Type: ");
		result.append(type);
		result.append(", Vmax: ");
		result.append(vmax);
		result.append(", Vmin: ");
		result.append(vmin);
		result.append(", Vstep: ");
		result.append(vstep);
		result.append(", CTlink: ");
		result.append(cTlink);
		result.append(", PTbus: ");
		result.append(pTbus);
		result.append(", TimeDelay: ");
		result.append(timeDelay);
		result.append(')');
		return result.toString();
	}

} //RegulatorImpl