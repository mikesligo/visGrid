/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltdump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Voltdump#getGroup <em>Group</em>}</li>
 *   <li>{@link visGrid.Voltdump#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link visGrid.Voltdump#getFilename <em>Filename</em>}</li>
 *   <li>{@link visGrid.Voltdump#getRuncount <em>Runcount</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getVoltdump()
 * @model
 * @generated
 */
public interface Voltdump extends Connection {
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
	 * @see visGrid.VisGridPackage#getVoltdump_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link visGrid.Voltdump#getGroup <em>Group</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getVoltdump_Runtime()
	 * @model
	 * @generated
	 */
	String getRuntime();

	/**
	 * Sets the value of the '{@link visGrid.Voltdump#getRuntime <em>Runtime</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getVoltdump_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link visGrid.Voltdump#getFilename <em>Filename</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getVoltdump_Runcount()
	 * @model
	 * @generated
	 */
	String getRuncount();

	/**
	 * Sets the value of the '{@link visGrid.Voltdump#getRuncount <em>Runcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runcount</em>' attribute.
	 * @see #getRuncount()
	 * @generated
	 */
	void setRuncount(String value);

} // Voltdump
