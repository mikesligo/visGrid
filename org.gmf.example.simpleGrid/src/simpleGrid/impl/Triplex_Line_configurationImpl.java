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

import simpleGrid.SimpleGridPackage;
import simpleGrid.Triplex_Line_configuration;
import simpleGrid.Triplex_line_conductor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex Line configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.Triplex_Line_configurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_Line_configurationImpl#getInsulation_thickness <em>Insulation thickness</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_Line_configurationImpl#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_Line_configurationImpl#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_Line_configurationImpl extends EObjectImpl implements Triplex_Line_configuration {
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
	 * The default value of the '{@link #getInsulation_thickness() <em>Insulation thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulation_thickness()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULATION_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulation_thickness() <em>Insulation thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulation_thickness()
	 * @generated
	 * @ordered
	 */
	protected String insulation_thickness = INSULATION_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiameter() <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameter()
	 * @generated
	 * @ordered
	 */
	protected String diameter = DIAMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriplex_line_conductor() <em>Triplex line conductor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line_conductor> triplex_line_conductor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Triplex_Line_configurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.TRIPLEX_LINE_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsulation_thickness() {
		return insulation_thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulation_thickness(String newInsulation_thickness) {
		String oldInsulation_thickness = insulation_thickness;
		insulation_thickness = newInsulation_thickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS, oldInsulation_thickness, insulation_thickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiameter() {
		return diameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiameter(String newDiameter) {
		String oldDiameter = diameter;
		diameter = newDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__DIAMETER, oldDiameter, diameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line_conductor> getTriplex_line_conductor() {
		if (triplex_line_conductor == null) {
			triplex_line_conductor = new EObjectResolvingEList<Triplex_line_conductor>(Triplex_line_conductor.class, this, SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR);
		}
		return triplex_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__NAME:
				return getName();
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS:
				return getInsulation_thickness();
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__DIAMETER:
				return getDiameter();
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR:
				return getTriplex_line_conductor();
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
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS:
				setInsulation_thickness((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__DIAMETER:
				setDiameter((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				getTriplex_line_conductor().addAll((Collection<? extends Triplex_line_conductor>)newValue);
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
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS:
				setInsulation_thickness(INSULATION_THICKNESS_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__DIAMETER:
				setDiameter(DIAMETER_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
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
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS:
				return INSULATION_THICKNESS_EDEFAULT == null ? insulation_thickness != null : !INSULATION_THICKNESS_EDEFAULT.equals(insulation_thickness);
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__DIAMETER:
				return DIAMETER_EDEFAULT == null ? diameter != null : !DIAMETER_EDEFAULT.equals(diameter);
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR:
				return triplex_line_conductor != null && !triplex_line_conductor.isEmpty();
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
		result.append(", insulation_thickness: ");
		result.append(insulation_thickness);
		result.append(", diameter: ");
		result.append(diameter);
		result.append(')');
		return result.toString();
	}

} //Triplex_Line_configurationImpl
