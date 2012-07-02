/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Regulator#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.Regulator#getVmax <em>Vmax</em>}</li>
 *   <li>{@link visGrid.Regulator#getVmin <em>Vmin</em>}</li>
 *   <li>{@link visGrid.Regulator#getVstep <em>Vstep</em>}</li>
 *   <li>{@link visGrid.Regulator#getCTlink <em>CTlink</em>}</li>
 *   <li>{@link visGrid.Regulator#getPTbus <em>PTbus</em>}</li>
 *   <li>{@link visGrid.Regulator#getTimeDelay <em>Time Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getRegulator()
 * @model
 * @generated
 */
public interface Regulator extends Connection {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see visGrid.VisGridPackage#getRegulator_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Vmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmax</em>' attribute.
	 * @see #setVmax(String)
	 * @see visGrid.VisGridPackage#getRegulator_Vmax()
	 * @model
	 * @generated
	 */
	String getVmax();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getVmax <em>Vmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmax</em>' attribute.
	 * @see #getVmax()
	 * @generated
	 */
	void setVmax(String value);

	/**
	 * Returns the value of the '<em><b>Vmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmin</em>' attribute.
	 * @see #setVmin(String)
	 * @see visGrid.VisGridPackage#getRegulator_Vmin()
	 * @model
	 * @generated
	 */
	String getVmin();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getVmin <em>Vmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmin</em>' attribute.
	 * @see #getVmin()
	 * @generated
	 */
	void setVmin(String value);

	/**
	 * Returns the value of the '<em><b>Vstep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vstep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vstep</em>' attribute.
	 * @see #setVstep(String)
	 * @see visGrid.VisGridPackage#getRegulator_Vstep()
	 * @model
	 * @generated
	 */
	String getVstep();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getVstep <em>Vstep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vstep</em>' attribute.
	 * @see #getVstep()
	 * @generated
	 */
	void setVstep(String value);

	/**
	 * Returns the value of the '<em><b>CTlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTlink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTlink</em>' attribute.
	 * @see #setCTlink(String)
	 * @see visGrid.VisGridPackage#getRegulator_CTlink()
	 * @model
	 * @generated
	 */
	String getCTlink();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getCTlink <em>CTlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTlink</em>' attribute.
	 * @see #getCTlink()
	 * @generated
	 */
	void setCTlink(String value);

	/**
	 * Returns the value of the '<em><b>PTbus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTbus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTbus</em>' attribute.
	 * @see #setPTbus(String)
	 * @see visGrid.VisGridPackage#getRegulator_PTbus()
	 * @model
	 * @generated
	 */
	String getPTbus();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getPTbus <em>PTbus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTbus</em>' attribute.
	 * @see #getPTbus()
	 * @generated
	 */
	void setPTbus(String value);

	/**
	 * Returns the value of the '<em><b>Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Delay</em>' attribute.
	 * @see #setTimeDelay(String)
	 * @see visGrid.VisGridPackage#getRegulator_TimeDelay()
	 * @model
	 * @generated
	 */
	String getTimeDelay();

	/**
	 * Sets the value of the '{@link visGrid.Regulator#getTimeDelay <em>Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Delay</em>' attribute.
	 * @see #getTimeDelay()
	 * @generated
	 */
	void setTimeDelay(String value);

} // Regulator
