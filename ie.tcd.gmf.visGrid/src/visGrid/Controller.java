/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Controller#getSimple_mode <em>Simple mode</em>}</li>
 *   <li>{@link visGrid.Controller#getBid_mode <em>Bid mode</em>}</li>
 *   <li>{@link visGrid.Controller#getRamp_low <em>Ramp low</em>}</li>
 *   <li>{@link visGrid.Controller#getRamp_high <em>Ramp high</em>}</li>
 *   <li>{@link visGrid.Controller#getTmin <em>Tmin</em>}</li>
 *   <li>{@link visGrid.Controller#getTmax <em>Tmax</em>}</li>
 *   <li>{@link visGrid.Controller#getTarget <em>Target</em>}</li>
 *   <li>{@link visGrid.Controller#getSetpoint <em>Setpoint</em>}</li>
 *   <li>{@link visGrid.Controller#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.Controller#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.Controller#getTotal <em>Total</em>}</li>
 *   <li>{@link visGrid.Controller#getMarket <em>Market</em>}</li>
 *   <li>{@link visGrid.Controller#getBid_price <em>Bid price</em>}</li>
 *   <li>{@link visGrid.Controller#getBid_quant <em>Bid quant</em>}</li>
 *   <li>{@link visGrid.Controller#getSet_temp <em>Set temp</em>}</li>
 *   <li>{@link visGrid.Controller#getBase_setpoint <em>Base setpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends Connection {
	/**
	 * Returns the value of the '<em><b>Simple mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple mode</em>' attribute.
	 * @see #setSimple_mode(String)
	 * @see visGrid.VisGridPackage#getController_Simple_mode()
	 * @model
	 * @generated
	 */
	String getSimple_mode();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getSimple_mode <em>Simple mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple mode</em>' attribute.
	 * @see #getSimple_mode()
	 * @generated
	 */
	void setSimple_mode(String value);

	/**
	 * Returns the value of the '<em><b>Bid mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid mode</em>' attribute.
	 * @see #setBid_mode(String)
	 * @see visGrid.VisGridPackage#getController_Bid_mode()
	 * @model
	 * @generated
	 */
	String getBid_mode();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getBid_mode <em>Bid mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid mode</em>' attribute.
	 * @see #getBid_mode()
	 * @generated
	 */
	void setBid_mode(String value);

	/**
	 * Returns the value of the '<em><b>Ramp low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp low</em>' attribute.
	 * @see #setRamp_low(String)
	 * @see visGrid.VisGridPackage#getController_Ramp_low()
	 * @model
	 * @generated
	 */
	String getRamp_low();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getRamp_low <em>Ramp low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp low</em>' attribute.
	 * @see #getRamp_low()
	 * @generated
	 */
	void setRamp_low(String value);

	/**
	 * Returns the value of the '<em><b>Ramp high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp high</em>' attribute.
	 * @see #setRamp_high(String)
	 * @see visGrid.VisGridPackage#getController_Ramp_high()
	 * @model
	 * @generated
	 */
	String getRamp_high();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getRamp_high <em>Ramp high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp high</em>' attribute.
	 * @see #getRamp_high()
	 * @generated
	 */
	void setRamp_high(String value);

	/**
	 * Returns the value of the '<em><b>Tmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmin</em>' attribute.
	 * @see #setTmin(String)
	 * @see visGrid.VisGridPackage#getController_Tmin()
	 * @model
	 * @generated
	 */
	String getTmin();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getTmin <em>Tmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmin</em>' attribute.
	 * @see #getTmin()
	 * @generated
	 */
	void setTmin(String value);

	/**
	 * Returns the value of the '<em><b>Tmax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax</em>' attribute.
	 * @see #setTmax(String)
	 * @see visGrid.VisGridPackage#getController_Tmax()
	 * @model
	 * @generated
	 */
	String getTmax();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getTmax <em>Tmax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax</em>' attribute.
	 * @see #getTmax()
	 * @generated
	 */
	void setTmax(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see visGrid.VisGridPackage#getController_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setpoint</em>' attribute.
	 * @see #setSetpoint(String)
	 * @see visGrid.VisGridPackage#getController_Setpoint()
	 * @model
	 * @generated
	 */
	String getSetpoint();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getSetpoint <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setpoint</em>' attribute.
	 * @see #getSetpoint()
	 * @generated
	 */
	void setSetpoint(String value);

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
	 * @see visGrid.VisGridPackage#getController_Demand()
	 * @model
	 * @generated
	 */
	String getDemand();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getDemand <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' attribute.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(String value);

	/**
	 * Returns the value of the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' attribute.
	 * @see #setLoad(String)
	 * @see visGrid.VisGridPackage#getController_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(String value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(String)
	 * @see visGrid.VisGridPackage#getController_Total()
	 * @model
	 * @generated
	 */
	String getTotal();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(String value);

	/**
	 * Returns the value of the '<em><b>Market</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Market</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Market</em>' attribute.
	 * @see #setMarket(String)
	 * @see visGrid.VisGridPackage#getController_Market()
	 * @model
	 * @generated
	 */
	String getMarket();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getMarket <em>Market</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market</em>' attribute.
	 * @see #getMarket()
	 * @generated
	 */
	void setMarket(String value);

	/**
	 * Returns the value of the '<em><b>Bid price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid price</em>' attribute.
	 * @see #setBid_price(String)
	 * @see visGrid.VisGridPackage#getController_Bid_price()
	 * @model
	 * @generated
	 */
	String getBid_price();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getBid_price <em>Bid price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid price</em>' attribute.
	 * @see #getBid_price()
	 * @generated
	 */
	void setBid_price(String value);

	/**
	 * Returns the value of the '<em><b>Bid quant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bid quant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bid quant</em>' attribute.
	 * @see #setBid_quant(String)
	 * @see visGrid.VisGridPackage#getController_Bid_quant()
	 * @model
	 * @generated
	 */
	String getBid_quant();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getBid_quant <em>Bid quant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid quant</em>' attribute.
	 * @see #getBid_quant()
	 * @generated
	 */
	void setBid_quant(String value);

	/**
	 * Returns the value of the '<em><b>Set temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set temp</em>' attribute.
	 * @see #setSet_temp(String)
	 * @see visGrid.VisGridPackage#getController_Set_temp()
	 * @model
	 * @generated
	 */
	String getSet_temp();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getSet_temp <em>Set temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set temp</em>' attribute.
	 * @see #getSet_temp()
	 * @generated
	 */
	void setSet_temp(String value);

	/**
	 * Returns the value of the '<em><b>Base setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base setpoint</em>' attribute.
	 * @see #setBase_setpoint(String)
	 * @see visGrid.VisGridPackage#getController_Base_setpoint()
	 * @model
	 * @generated
	 */
	String getBase_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Controller#getBase_setpoint <em>Base setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base setpoint</em>' attribute.
	 * @see #getBase_setpoint()
	 * @generated
	 */
	void setBase_setpoint(String value);

} // Controller
