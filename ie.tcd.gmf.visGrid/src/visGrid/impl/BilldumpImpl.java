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
import visGrid.Billdump;
import visGrid.Connections;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billdump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.BilldumpImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.BilldumpImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.BilldumpImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link visGrid.impl.BilldumpImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link visGrid.impl.BilldumpImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link visGrid.impl.BilldumpImpl#getRuncount <em>Runcount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BilldumpImpl extends EObjectImpl implements Billdump {
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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected String runtime = RUNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuncount() <em>Runcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuncount()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuncount() <em>Runcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuncount()
	 * @generated
	 * @ordered
	 */
	protected String runcount = RUNCOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BilldumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getBilldump();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.BILLDUMP__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.BILLDUMP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.BILLDUMP__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(String newRuntime) {
		String oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.BILLDUMP__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.BILLDUMP__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuncount() {
		return runcount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuncount(String newRuncount) {
		String oldRuncount = runcount;
		runcount = newRuncount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.BILLDUMP__RUNCOUNT, oldRuncount, runcount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.BILLDUMP__CONNECTION:
				return getConnection();
			case VisGridPackage.BILLDUMP__NAME:
				return getName();
			case VisGridPackage.BILLDUMP__GROUP:
				return getGroup();
			case VisGridPackage.BILLDUMP__RUNTIME:
				return getRuntime();
			case VisGridPackage.BILLDUMP__FILENAME:
				return getFilename();
			case VisGridPackage.BILLDUMP__RUNCOUNT:
				return getRuncount();
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
			case VisGridPackage.BILLDUMP__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.BILLDUMP__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.BILLDUMP__GROUP:
				setGroup((String)newValue);
				return;
			case VisGridPackage.BILLDUMP__RUNTIME:
				setRuntime((String)newValue);
				return;
			case VisGridPackage.BILLDUMP__FILENAME:
				setFilename((String)newValue);
				return;
			case VisGridPackage.BILLDUMP__RUNCOUNT:
				setRuncount((String)newValue);
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
			case VisGridPackage.BILLDUMP__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.BILLDUMP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.BILLDUMP__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case VisGridPackage.BILLDUMP__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case VisGridPackage.BILLDUMP__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case VisGridPackage.BILLDUMP__RUNCOUNT:
				setRuncount(RUNCOUNT_EDEFAULT);
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
			case VisGridPackage.BILLDUMP__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.BILLDUMP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.BILLDUMP__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case VisGridPackage.BILLDUMP__RUNTIME:
				return RUNTIME_EDEFAULT == null ? runtime != null : !RUNTIME_EDEFAULT.equals(runtime);
			case VisGridPackage.BILLDUMP__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case VisGridPackage.BILLDUMP__RUNCOUNT:
				return RUNCOUNT_EDEFAULT == null ? runcount != null : !RUNCOUNT_EDEFAULT.equals(runcount);
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
		result.append(", group: ");
		result.append(group);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(", filename: ");
		result.append(filename);
		result.append(", runcount: ");
		result.append(runcount);
		result.append(')');
		return result.toString();
	}

} //BilldumpImpl