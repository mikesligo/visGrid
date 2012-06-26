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
import visGrid.VisGridPackage;
import visGrid.Volt_var_control;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volt var control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Volt_var_controlImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Volt_var_controlImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Volt_var_controlImpl#getQualification_time <em>Qualification time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Volt_var_controlImpl extends EObjectImpl implements Volt_var_control {
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
	 * The default value of the '{@link #getQualification_time() <em>Qualification time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification_time()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification_time() <em>Qualification time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification_time()
	 * @generated
	 * @ordered
	 */
	protected String qualification_time = QUALIFICATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Volt_var_controlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getVolt_var_control();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.VOLT_VAR_CONTROL__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.VOLT_VAR_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualification_time() {
		return qualification_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualification_time(String newQualification_time) {
		String oldQualification_time = qualification_time;
		qualification_time = newQualification_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.VOLT_VAR_CONTROL__QUALIFICATION_TIME, oldQualification_time, qualification_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.VOLT_VAR_CONTROL__CONNECTION:
				return getConnection();
			case VisGridPackage.VOLT_VAR_CONTROL__NAME:
				return getName();
			case VisGridPackage.VOLT_VAR_CONTROL__QUALIFICATION_TIME:
				return getQualification_time();
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
			case VisGridPackage.VOLT_VAR_CONTROL__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.VOLT_VAR_CONTROL__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.VOLT_VAR_CONTROL__QUALIFICATION_TIME:
				setQualification_time((String)newValue);
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
			case VisGridPackage.VOLT_VAR_CONTROL__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.VOLT_VAR_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.VOLT_VAR_CONTROL__QUALIFICATION_TIME:
				setQualification_time(QUALIFICATION_TIME_EDEFAULT);
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
			case VisGridPackage.VOLT_VAR_CONTROL__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.VOLT_VAR_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.VOLT_VAR_CONTROL__QUALIFICATION_TIME:
				return QUALIFICATION_TIME_EDEFAULT == null ? qualification_time != null : !QUALIFICATION_TIME_EDEFAULT.equals(qualification_time);
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
		result.append(", qualification_time: ");
		result.append(qualification_time);
		result.append(')');
		return result.toString();
	}

} //Volt_var_controlImpl