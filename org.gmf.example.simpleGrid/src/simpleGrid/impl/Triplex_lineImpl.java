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
import simpleGrid.Triplex_line;
import simpleGrid.Triplex_meter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getLength <em>Length</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getTriplex_line_configuration <em>Triplex line configuration</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getTriplex_meter <em>Triplex meter</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getFrom <em>From</em>}</li>
 *   <li>{@link simpleGrid.impl.Triplex_lineImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_lineImpl extends EObjectImpl implements Triplex_line {
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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

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
	 * The cached value of the '{@link #getTriplex_line_configuration() <em>Triplex line configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_Line_configuration> triplex_line_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_meter() <em>Triplex meter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_meter()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_meter> triplex_meter;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Triplex_lineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.TRIPLEX_LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_Line_configuration> getTriplex_line_configuration() {
		if (triplex_line_configuration == null) {
			triplex_line_configuration = new EObjectResolvingEList<Triplex_Line_configuration>(Triplex_Line_configuration.class, this, SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION);
		}
		return triplex_line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_meter> getTriplex_meter() {
		if (triplex_meter == null) {
			triplex_meter = new EObjectResolvingEList<Triplex_meter>(Triplex_meter.class, this, SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_METER);
		}
		return triplex_meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRIPLEX_LINE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.TRIPLEX_LINE__NAME:
				return getName();
			case SimpleGridPackage.TRIPLEX_LINE__LENGTH:
				return getLength();
			case SimpleGridPackage.TRIPLEX_LINE__PHASES:
				return getPhases();
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION:
				return getTriplex_line_configuration();
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_METER:
				return getTriplex_meter();
			case SimpleGridPackage.TRIPLEX_LINE__FROM:
				return getFrom();
			case SimpleGridPackage.TRIPLEX_LINE__TO:
				return getTo();
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
			case SimpleGridPackage.TRIPLEX_LINE__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__LENGTH:
				setLength((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__PHASES:
				setPhases((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				getTriplex_line_configuration().addAll((Collection<? extends Triplex_Line_configuration>)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_METER:
				getTriplex_meter().clear();
				getTriplex_meter().addAll((Collection<? extends Triplex_meter>)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__FROM:
				setFrom((String)newValue);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__TO:
				setTo((String)newValue);
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
			case SimpleGridPackage.TRIPLEX_LINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				return;
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_METER:
				getTriplex_meter().clear();
				return;
			case SimpleGridPackage.TRIPLEX_LINE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case SimpleGridPackage.TRIPLEX_LINE__TO:
				setTo(TO_EDEFAULT);
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
			case SimpleGridPackage.TRIPLEX_LINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.TRIPLEX_LINE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case SimpleGridPackage.TRIPLEX_LINE__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION:
				return triplex_line_configuration != null && !triplex_line_configuration.isEmpty();
			case SimpleGridPackage.TRIPLEX_LINE__TRIPLEX_METER:
				return triplex_meter != null && !triplex_meter.isEmpty();
			case SimpleGridPackage.TRIPLEX_LINE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case SimpleGridPackage.TRIPLEX_LINE__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(", length: ");
		result.append(length);
		result.append(", phases: ");
		result.append(phases);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //Triplex_lineImpl
