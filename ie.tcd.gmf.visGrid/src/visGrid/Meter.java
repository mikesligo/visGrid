/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Meter#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.Meter#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.Meter#getMeter <em>Meter</em>}</li>
 *   <li>{@link visGrid.Meter#getLine1_current <em>Line1 current</em>}</li>
 *   <li>{@link visGrid.Meter#getLine2_current <em>Line2 current</em>}</li>
 *   <li>{@link visGrid.Meter#getLine3_current <em>Line3 current</em>}</li>
 *   <li>{@link visGrid.Meter#getLine1_admittance <em>Line1 admittance</em>}</li>
 *   <li>{@link visGrid.Meter#getLine2_admittance <em>Line2 admittance</em>}</li>
 *   <li>{@link visGrid.Meter#getLine3_admittance <em>Line3 admittance</em>}</li>
 *   <li>{@link visGrid.Meter#getLine1_power <em>Line1 power</em>}</li>
 *   <li>{@link visGrid.Meter#getLine2_power <em>Line2 power</em>}</li>
 *   <li>{@link visGrid.Meter#getLine3_power <em>Line3 power</em>}</li>
 *   <li>{@link visGrid.Meter#getLine1_volts <em>Line1 volts</em>}</li>
 *   <li>{@link visGrid.Meter#getLine2_volts <em>Line2 volts</em>}</li>
 *   <li>{@link visGrid.Meter#getLine3_volts <em>Line3 volts</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getMeter()
 * @model
 * @generated
 */
public interface Meter extends Connection {
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
	 * @see visGrid.VisGridPackage#getMeter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand</em>' attribute.
	 * @see #setDemand(String)
	 * @see visGrid.VisGridPackage#getMeter_Demand()
	 * @model
	 * @generated
	 */
	String getDemand();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getDemand <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' attribute.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(String value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' attribute.
	 * @see #setMeter(String)
	 * @see visGrid.VisGridPackage#getMeter_Meter()
	 * @model
	 * @generated
	 */
	String getMeter();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getMeter <em>Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' attribute.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(String value);

	/**
	 * Returns the value of the '<em><b>Line1 current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line1 current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line1 current</em>' attribute.
	 * @see #setLine1_current(String)
	 * @see visGrid.VisGridPackage#getMeter_Line1_current()
	 * @model
	 * @generated
	 */
	String getLine1_current();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine1_current <em>Line1 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1 current</em>' attribute.
	 * @see #getLine1_current()
	 * @generated
	 */
	void setLine1_current(String value);

	/**
	 * Returns the value of the '<em><b>Line2 current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line2 current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line2 current</em>' attribute.
	 * @see #setLine2_current(String)
	 * @see visGrid.VisGridPackage#getMeter_Line2_current()
	 * @model
	 * @generated
	 */
	String getLine2_current();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine2_current <em>Line2 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2 current</em>' attribute.
	 * @see #getLine2_current()
	 * @generated
	 */
	void setLine2_current(String value);

	/**
	 * Returns the value of the '<em><b>Line3 current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line3 current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line3 current</em>' attribute.
	 * @see #setLine3_current(String)
	 * @see visGrid.VisGridPackage#getMeter_Line3_current()
	 * @model
	 * @generated
	 */
	String getLine3_current();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine3_current <em>Line3 current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line3 current</em>' attribute.
	 * @see #getLine3_current()
	 * @generated
	 */
	void setLine3_current(String value);

	/**
	 * Returns the value of the '<em><b>Line1 admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line1 admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line1 admittance</em>' attribute.
	 * @see #setLine1_admittance(String)
	 * @see visGrid.VisGridPackage#getMeter_Line1_admittance()
	 * @model
	 * @generated
	 */
	String getLine1_admittance();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine1_admittance <em>Line1 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1 admittance</em>' attribute.
	 * @see #getLine1_admittance()
	 * @generated
	 */
	void setLine1_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Line2 admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line2 admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line2 admittance</em>' attribute.
	 * @see #setLine2_admittance(String)
	 * @see visGrid.VisGridPackage#getMeter_Line2_admittance()
	 * @model
	 * @generated
	 */
	String getLine2_admittance();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine2_admittance <em>Line2 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2 admittance</em>' attribute.
	 * @see #getLine2_admittance()
	 * @generated
	 */
	void setLine2_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Line3 admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line3 admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line3 admittance</em>' attribute.
	 * @see #setLine3_admittance(String)
	 * @see visGrid.VisGridPackage#getMeter_Line3_admittance()
	 * @model
	 * @generated
	 */
	String getLine3_admittance();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine3_admittance <em>Line3 admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line3 admittance</em>' attribute.
	 * @see #getLine3_admittance()
	 * @generated
	 */
	void setLine3_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Line1 power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line1 power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line1 power</em>' attribute.
	 * @see #setLine1_power(String)
	 * @see visGrid.VisGridPackage#getMeter_Line1_power()
	 * @model
	 * @generated
	 */
	String getLine1_power();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine1_power <em>Line1 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1 power</em>' attribute.
	 * @see #getLine1_power()
	 * @generated
	 */
	void setLine1_power(String value);

	/**
	 * Returns the value of the '<em><b>Line2 power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line2 power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line2 power</em>' attribute.
	 * @see #setLine2_power(String)
	 * @see visGrid.VisGridPackage#getMeter_Line2_power()
	 * @model
	 * @generated
	 */
	String getLine2_power();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine2_power <em>Line2 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2 power</em>' attribute.
	 * @see #getLine2_power()
	 * @generated
	 */
	void setLine2_power(String value);

	/**
	 * Returns the value of the '<em><b>Line3 power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line3 power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line3 power</em>' attribute.
	 * @see #setLine3_power(String)
	 * @see visGrid.VisGridPackage#getMeter_Line3_power()
	 * @model
	 * @generated
	 */
	String getLine3_power();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine3_power <em>Line3 power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line3 power</em>' attribute.
	 * @see #getLine3_power()
	 * @generated
	 */
	void setLine3_power(String value);

	/**
	 * Returns the value of the '<em><b>Line1 volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line1 volts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line1 volts</em>' attribute.
	 * @see #setLine1_volts(String)
	 * @see visGrid.VisGridPackage#getMeter_Line1_volts()
	 * @model
	 * @generated
	 */
	String getLine1_volts();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine1_volts <em>Line1 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1 volts</em>' attribute.
	 * @see #getLine1_volts()
	 * @generated
	 */
	void setLine1_volts(String value);

	/**
	 * Returns the value of the '<em><b>Line2 volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line2 volts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line2 volts</em>' attribute.
	 * @see #setLine2_volts(String)
	 * @see visGrid.VisGridPackage#getMeter_Line2_volts()
	 * @model
	 * @generated
	 */
	String getLine2_volts();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine2_volts <em>Line2 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2 volts</em>' attribute.
	 * @see #getLine2_volts()
	 * @generated
	 */
	void setLine2_volts(String value);

	/**
	 * Returns the value of the '<em><b>Line3 volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line3 volts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line3 volts</em>' attribute.
	 * @see #setLine3_volts(String)
	 * @see visGrid.VisGridPackage#getMeter_Line3_volts()
	 * @model
	 * @generated
	 */
	String getLine3_volts();

	/**
	 * Sets the value of the '{@link visGrid.Meter#getLine3_volts <em>Line3 volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line3 volts</em>' attribute.
	 * @see #getLine3_volts()
	 * @generated
	 */
	void setLine3_volts(String value);

} // Meter
