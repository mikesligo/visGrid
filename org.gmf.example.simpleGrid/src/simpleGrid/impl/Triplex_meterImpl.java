/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simpleGrid.House;
import simpleGrid.SimpleGridPackage;
import simpleGrid.Triplex_meter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.Triplex_meterImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_meterImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_meterImpl#getNormal_voltages <em>Normal voltages</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_meterImpl#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_meterImpl extends EObjectImpl implements Triplex_meter {
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
	 * The default value of the '{@link #getNormal_voltages() <em>Normal voltages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal_voltages()
	 * @generated
	 * @ordered
	 */
	protected static final String NORMAL_VOLTAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormal_voltages() <em>Normal voltages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormal_voltages()
	 * @generated
	 * @ordered
	 */
	protected String normal_voltages = NORMAL_VOLTAGES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHouse() <em>House</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse()
	 * @generated
	 * @ordered
	 */
	protected EList<House> house;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Triplex_meterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.TRIPLEX_METER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_METER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_METER__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNormal_voltages() {
		return normal_voltages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormal_voltages(String newNormal_voltages) {
		String oldNormal_voltages = normal_voltages;
		normal_voltages = newNormal_voltages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_METER__NORMAL_VOLTAGES, oldNormal_voltages, normal_voltages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getHouse() {
		if (house == null) {
			house = new EObjectResolvingEList<House>(House.class, this, SimpleGridPackage.TRIPLEX_METER__HOUSE);
		}
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.TRIPLEX_METER__NAME:
				return getName();
			case SimpleGridPackage.TRIPLEX_METER__PHASES:
				return getPhases();
			case SimpleGridPackage.TRIPLEX_METER__NORMAL_VOLTAGES:
				return getNormal_voltages();
			case SimpleGridPackage.TRIPLEX_METER__HOUSE:
				return getHouse();
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
			case SimpleGridPackage.TRIPLEX_METER__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_METER__PHASES:
				setPhases((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_METER__NORMAL_VOLTAGES:
				setNormal_voltages((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_METER__HOUSE:
				getHouse().clear();
				getHouse().addAll((Collection<? extends House>)newValue);
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
			case SimpleGridPackage.TRIPLEX_METER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_METER__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_METER__NORMAL_VOLTAGES:
				setNormal_voltages(NORMAL_VOLTAGES_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_METER__HOUSE:
				getHouse().clear();
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
			case SimpleGridPackage.TRIPLEX_METER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.TRIPLEX_METER__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case SimpleGridPackage.TRIPLEX_METER__NORMAL_VOLTAGES:
				return NORMAL_VOLTAGES_EDEFAULT == null ? normal_voltages != null : !NORMAL_VOLTAGES_EDEFAULT.equals(normal_voltages);
			case SimpleGridPackage.TRIPLEX_METER__HOUSE:
				return house != null && !house.isEmpty();
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
		result.append(", phases: ");
		result.append(phases);
		result.append(", normal_voltages: ");
		result.append(normal_voltages);
		result.append(')');
		return result.toString();
	}

} //Triplex_meterImpl
