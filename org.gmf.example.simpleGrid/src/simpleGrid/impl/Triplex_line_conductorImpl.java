/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import simpleGrid.SimpleGridPackage;
import simpleGrid.Triplex_line_conductor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex line conductor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.Triplex_line_conductorImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_line_conductorImpl#getGeometric_mean_radius <em>Geometric mean radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_line_conductorImpl extends EObjectImpl implements Triplex_line_conductor {
	/**
	 * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected static final String RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected String resistance = RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeometric_mean_radius() <em>Geometric mean radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometric_mean_radius()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRIC_MEAN_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometric_mean_radius() <em>Geometric mean radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometric_mean_radius()
	 * @generated
	 * @ordered
	 */
	protected String geometric_mean_radius = GEOMETRIC_MEAN_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Triplex_line_conductorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.TRIPLEX_LINE_CONDUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResistance() {
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance(String newResistance) {
		String oldResistance = resistance;
		resistance = newResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE, oldResistance, resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometric_mean_radius() {
		return geometric_mean_radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometric_mean_radius(String newGeometric_mean_radius) {
		String oldGeometric_mean_radius = geometric_mean_radius;
		geometric_mean_radius = newGeometric_mean_radius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS, oldGeometric_mean_radius, geometric_mean_radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				return getResistance();
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				return getGeometric_mean_radius();
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
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				setResistance((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				setGeometric_mean_radius((String)newValue);
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
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				setResistance(RESISTANCE_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				setGeometric_mean_radius(GEOMETRIC_MEAN_RADIUS_EDEFAULT);
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
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				return RESISTANCE_EDEFAULT == null ? resistance != null : !RESISTANCE_EDEFAULT.equals(resistance);
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				return GEOMETRIC_MEAN_RADIUS_EDEFAULT == null ? geometric_mean_radius != null : !GEOMETRIC_MEAN_RADIUS_EDEFAULT.equals(geometric_mean_radius);
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
		result.append(" (resistance: ");
		result.append(resistance);
		result.append(", geometric_mean_radius: ");
		result.append(geometric_mean_radius);
		result.append(')');
		return result.toString();
	}

} //Triplex_line_conductorImpl
