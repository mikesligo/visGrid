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
import visGrid.Link;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.LinkImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.LinkImpl#getY <em>Y</em>}</li>
 *   <li>{@link visGrid.impl.LinkImpl#getI <em>I</em>}</li>
 *   <li>{@link visGrid.impl.LinkImpl#getB <em>B</em>}</li>
 *   <li>{@link visGrid.impl.LinkImpl#getFrom <em>From</em>}</li>
 *   <li>{@link visGrid.impl.LinkImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends EObjectImpl implements Link {
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
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getI() <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected static final String I_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI() <em>I</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI()
	 * @generated
	 * @ordered
	 */
	protected String i = I_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final String B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected String b = B_EDEFAULT;

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
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.LINK__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LINK__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI() {
		return i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI(String newI) {
		String oldI = i;
		i = newI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LINK__I, oldI, i));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(String newB) {
		String oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LINK__B, oldB, b));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LINK__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LINK__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.LINK__CONNECTION:
				return getConnection();
			case VisGridPackage.LINK__NAME:
				return getName();
			case VisGridPackage.LINK__Y:
				return getY();
			case VisGridPackage.LINK__I:
				return getI();
			case VisGridPackage.LINK__B:
				return getB();
			case VisGridPackage.LINK__FROM:
				return getFrom();
			case VisGridPackage.LINK__TO:
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
			case VisGridPackage.LINK__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.LINK__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.LINK__Y:
				setY((String)newValue);
				return;
			case VisGridPackage.LINK__I:
				setI((String)newValue);
				return;
			case VisGridPackage.LINK__B:
				setB((String)newValue);
				return;
			case VisGridPackage.LINK__FROM:
				setFrom((String)newValue);
				return;
			case VisGridPackage.LINK__TO:
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
			case VisGridPackage.LINK__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.LINK__Y:
				setY(Y_EDEFAULT);
				return;
			case VisGridPackage.LINK__I:
				setI(I_EDEFAULT);
				return;
			case VisGridPackage.LINK__B:
				setB(B_EDEFAULT);
				return;
			case VisGridPackage.LINK__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case VisGridPackage.LINK__TO:
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
			case VisGridPackage.LINK__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.LINK__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case VisGridPackage.LINK__I:
				return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
			case VisGridPackage.LINK__B:
				return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
			case VisGridPackage.LINK__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case VisGridPackage.LINK__TO:
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
		result.append(", Y: ");
		result.append(y);
		result.append(", I: ");
		result.append(i);
		result.append(", B: ");
		result.append(b);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //LinkImpl