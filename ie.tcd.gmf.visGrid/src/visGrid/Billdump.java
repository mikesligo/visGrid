/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billdump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Billdump#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Billdump#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Billdump#getGroup <em>Group</em>}</li>
 *   <li>{@link visGrid.Billdump#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link visGrid.Billdump#getFilename <em>Filename</em>}</li>
 *   <li>{@link visGrid.Billdump#getRuncount <em>Runcount</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getBilldump()
 * @model
 * @generated
 */
public interface Billdump extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link visGrid.Connections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see visGrid.VisGridPackage#getBilldump_Connection()
	 * @model
	 * @generated
	 */
	EList<Connections> getConnection();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see visGrid.VisGridPackage#getBilldump_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Billdump#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see visGrid.VisGridPackage#getBilldump_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link visGrid.Billdump#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(String)
	 * @see visGrid.VisGridPackage#getBilldump_Runtime()
	 * @model
	 * @generated
	 */
	String getRuntime();

	/**
	 * Sets the value of the '{@link visGrid.Billdump#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see visGrid.VisGridPackage#getBilldump_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link visGrid.Billdump#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Runcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runcount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runcount</em>' attribute.
	 * @see #setRuncount(String)
	 * @see visGrid.VisGridPackage#getBilldump_Runcount()
	 * @model
	 * @generated
	 */
	String getRuncount();

	/**
	 * Sets the value of the '{@link visGrid.Billdump#getRuncount <em>Runcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runcount</em>' attribute.
	 * @see #getRuncount()
	 * @generated
	 */
	void setRuncount(String value);

} // Billdump