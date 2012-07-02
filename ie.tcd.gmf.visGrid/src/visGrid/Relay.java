/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Relay#getCurve <em>Curve</em>}</li>
 *   <li>{@link visGrid.Relay#getTimeDial <em>Time Dial</em>}</li>
 *   <li>{@link visGrid.Relay#getSetCurrent <em>Set Current</em>}</li>
 *   <li>{@link visGrid.Relay#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getRelay()
 * @model
 * @generated
 */
public interface Relay extends Connection {
	/**
	 * Returns the value of the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' attribute.
	 * @see #setCurve(String)
	 * @see visGrid.VisGridPackage#getRelay_Curve()
	 * @model
	 * @generated
	 */
	String getCurve();

	/**
	 * Sets the value of the '{@link visGrid.Relay#getCurve <em>Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' attribute.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(String value);

	/**
	 * Returns the value of the '<em><b>Time Dial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Dial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Dial</em>' attribute.
	 * @see #setTimeDial(String)
	 * @see visGrid.VisGridPackage#getRelay_TimeDial()
	 * @model
	 * @generated
	 */
	String getTimeDial();

	/**
	 * Sets the value of the '{@link visGrid.Relay#getTimeDial <em>Time Dial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Dial</em>' attribute.
	 * @see #getTimeDial()
	 * @generated
	 */
	void setTimeDial(String value);

	/**
	 * Returns the value of the '<em><b>Set Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Current</em>' attribute.
	 * @see #setSetCurrent(String)
	 * @see visGrid.VisGridPackage#getRelay_SetCurrent()
	 * @model
	 * @generated
	 */
	String getSetCurrent();

	/**
	 * Sets the value of the '{@link visGrid.Relay#getSetCurrent <em>Set Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Current</em>' attribute.
	 * @see #getSetCurrent()
	 * @generated
	 */
	void setSetCurrent(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see visGrid.VisGridPackage#getRelay_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link visGrid.Relay#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // Relay
