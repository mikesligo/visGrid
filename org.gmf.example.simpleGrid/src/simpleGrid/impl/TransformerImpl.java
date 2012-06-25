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
import simpleGrid.Transformer;
import simpleGrid.Transformer_configuration;
import simpleGrid.Triplex_node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getTransformer_configuration <em>Transformer configuration</em>}</li>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getGroupid <em>Groupid</em>}</li>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getTriplex_node <em>Triplex node</em>}</li>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getFrom <em>From</em>}</li>
 *   <li>{@link simpleGrid.impl.TransformerImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformerImpl extends EObjectImpl implements Transformer {
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
	 * The cached value of the '{@link #getTransformer_configuration() <em>Transformer configuration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer_configuration> transformer_configuration;

	/**
	 * The default value of the '{@link #getGroupid() <em>Groupid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupid()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUPID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupid() <em>Groupid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupid()
	 * @generated
	 * @ordered
	 */
	protected String groupid = GROUPID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriplex_node() <em>Triplex node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_node()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_node> triplex_node;

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
	protected TransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.TRANSFORMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer_configuration> getTransformer_configuration() {
		if (transformer_configuration == null) {
			transformer_configuration = new EObjectResolvingEList<Transformer_configuration>(Transformer_configuration.class, this, SimpleGridPackage.TRANSFORMER__TRANSFORMER_CONFIGURATION);
		}
		return transformer_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupid() {
		return groupid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupid(String newGroupid) {
		String oldGroupid = groupid;
		groupid = newGroupid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER__GROUPID, oldGroupid, groupid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_node> getTriplex_node() {
		if (triplex_node == null) {
			triplex_node = new EObjectResolvingEList<Triplex_node>(Triplex_node.class, this, SimpleGridPackage.TRANSFORMER__TRIPLEX_NODE);
		}
		return triplex_node;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.TRANSFORMER__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.TRANSFORMER__NAME:
				return getName();
			case SimpleGridPackage.TRANSFORMER__PHASES:
				return getPhases();
			case SimpleGridPackage.TRANSFORMER__TRANSFORMER_CONFIGURATION:
				return getTransformer_configuration();
			case SimpleGridPackage.TRANSFORMER__GROUPID:
				return getGroupid();
			case SimpleGridPackage.TRANSFORMER__TRIPLEX_NODE:
				return getTriplex_node();
			case SimpleGridPackage.TRANSFORMER__FROM:
				return getFrom();
			case SimpleGridPackage.TRANSFORMER__TO:
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
			case SimpleGridPackage.TRANSFORMER__NAME:
				setName((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER__PHASES:
				setPhases((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				getTransformer_configuration().addAll((Collection<? extends Transformer_configuration>)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER__GROUPID:
				setGroupid((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER__TRIPLEX_NODE:
				getTriplex_node().clear();
				getTriplex_node().addAll((Collection<? extends Triplex_node>)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER__FROM:
				setFrom((String)newValue);
				return;
			case SimpleGridPackage.TRANSFORMER__TO:
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
			case SimpleGridPackage.TRANSFORMER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				return;
			case SimpleGridPackage.TRANSFORMER__GROUPID:
				setGroupid(GROUPID_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER__TRIPLEX_NODE:
				getTriplex_node().clear();
				return;
			case SimpleGridPackage.TRANSFORMER__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case SimpleGridPackage.TRANSFORMER__TO:
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
			case SimpleGridPackage.TRANSFORMER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimpleGridPackage.TRANSFORMER__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case SimpleGridPackage.TRANSFORMER__TRANSFORMER_CONFIGURATION:
				return transformer_configuration != null && !transformer_configuration.isEmpty();
			case SimpleGridPackage.TRANSFORMER__GROUPID:
				return GROUPID_EDEFAULT == null ? groupid != null : !GROUPID_EDEFAULT.equals(groupid);
			case SimpleGridPackage.TRANSFORMER__TRIPLEX_NODE:
				return triplex_node != null && !triplex_node.isEmpty();
			case SimpleGridPackage.TRANSFORMER__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case SimpleGridPackage.TRANSFORMER__TO:
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
		result.append(", phases: ");
		result.append(phases);
		result.append(", groupid: ");
		result.append(groupid);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //TransformerImpl
