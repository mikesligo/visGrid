/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volt var control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Volt_var_control#getQualification_time <em>Qualification time</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getVolt_var_control()
 * @model
 * @generated
 */
public interface Volt_var_control extends Connection {
	/**
	 * Returns the value of the '<em><b>Qualification time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification time</em>' attribute.
	 * @see #setQualification_time(String)
	 * @see visGrid.VisGridPackage#getVolt_var_control_Qualification_time()
	 * @model
	 * @generated
	 */
	String getQualification_time();

	/**
	 * Sets the value of the '{@link visGrid.Volt_var_control#getQualification_time <em>Qualification time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification time</em>' attribute.
	 * @see #getQualification_time()
	 * @generated
	 */
	void setQualification_time(String value);

} // Volt_var_control
