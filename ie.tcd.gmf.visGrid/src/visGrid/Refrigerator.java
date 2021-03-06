/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refrigerator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Refrigerator#getSize <em>Size</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getRated_capacity <em>Rated capacity</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getSetpoint <em>Setpoint</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getNext_time <em>Next time</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getOutput <em>Output</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getEvent_temp <em>Event temp</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getUA <em>UA</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getState <em>State</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.Refrigerator#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getRefrigerator()
 * @model
 * @generated
 */
public interface Refrigerator extends Connection {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Rated capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated capacity</em>' attribute.
	 * @see #setRated_capacity(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Rated_capacity()
	 * @model
	 * @generated
	 */
	String getRated_capacity();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getRated_capacity <em>Rated capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated capacity</em>' attribute.
	 * @see #getRated_capacity()
	 * @generated
	 */
	void setRated_capacity(String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Temperature()
	 * @model
	 * @generated
	 */
	String getTemperature();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(String value);

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
	 * @see visGrid.VisGridPackage#getRefrigerator_Setpoint()
	 * @model
	 * @generated
	 */
	String getSetpoint();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getSetpoint <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setpoint</em>' attribute.
	 * @see #getSetpoint()
	 * @generated
	 */
	void setSetpoint(String value);

	/**
	 * Returns the value of the '<em><b>Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband</em>' attribute.
	 * @see #setDeadband(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Deadband()
	 * @model
	 * @generated
	 */
	String getDeadband();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getDeadband <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband</em>' attribute.
	 * @see #getDeadband()
	 * @generated
	 */
	void setDeadband(String value);

	/**
	 * Returns the value of the '<em><b>Next time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next time</em>' attribute.
	 * @see #setNext_time(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Next_time()
	 * @model
	 * @generated
	 */
	String getNext_time();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getNext_time <em>Next time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next time</em>' attribute.
	 * @see #getNext_time()
	 * @generated
	 */
	void setNext_time(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Event temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event temp</em>' attribute.
	 * @see #setEvent_temp(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Event_temp()
	 * @model
	 * @generated
	 */
	String getEvent_temp();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getEvent_temp <em>Event temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event temp</em>' attribute.
	 * @see #getEvent_temp()
	 * @generated
	 */
	void setEvent_temp(String value);

	/**
	 * Returns the value of the '<em><b>UA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UA</em>' attribute.
	 * @see #setUA(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_UA()
	 * @model
	 * @generated
	 */
	String getUA();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getUA <em>UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UA</em>' attribute.
	 * @see #getUA()
	 * @generated
	 */
	void setUA(String value);

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
	 * @see visGrid.VisGridPackage#getRefrigerator_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

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
	 * @see visGrid.VisGridPackage#getRefrigerator_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(String value);

	/**
	 * Returns the value of the '<em><b>Energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy</em>' attribute.
	 * @see #setEnergy(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getEnergy <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy</em>' attribute.
	 * @see #getEnergy()
	 * @generated
	 */
	void setEnergy(String value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(String value);

	/**
	 * Returns the value of the '<em><b>Peak demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peak demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak demand</em>' attribute.
	 * @see #setPeak_demand(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Peak_demand()
	 * @model
	 * @generated
	 */
	String getPeak_demand();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getPeak_demand <em>Peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak demand</em>' attribute.
	 * @see #getPeak_demand()
	 * @generated
	 */
	void setPeak_demand(String value);

	/**
	 * Returns the value of the '<em><b>Heatgain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heatgain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heatgain</em>' attribute.
	 * @see #setHeatgain(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Heatgain()
	 * @model
	 * @generated
	 */
	String getHeatgain();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getHeatgain <em>Heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heatgain</em>' attribute.
	 * @see #getHeatgain()
	 * @generated
	 */
	void setHeatgain(String value);

	/**
	 * Returns the value of the '<em><b>Heatgain fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heatgain fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heatgain fraction</em>' attribute.
	 * @see #setHeatgain_fraction(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHeatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getHeatgain_fraction <em>Heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heatgain fraction</em>' attribute.
	 * @see #getHeatgain_fraction()
	 * @generated
	 */
	void setHeatgain_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Current fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current fraction</em>' attribute.
	 * @see #setCurrent_fraction(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Current_fraction()
	 * @model
	 * @generated
	 */
	String getCurrent_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getCurrent_fraction <em>Current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current fraction</em>' attribute.
	 * @see #getCurrent_fraction()
	 * @generated
	 */
	void setCurrent_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Impedance fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance fraction</em>' attribute.
	 * @see #setImpedance_fraction(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Impedance_fraction()
	 * @model
	 * @generated
	 */
	String getImpedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getImpedance_fraction <em>Impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance fraction</em>' attribute.
	 * @see #getImpedance_fraction()
	 * @generated
	 */
	void setImpedance_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Power fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power fraction</em>' attribute.
	 * @see #setPower_fraction(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Power_fraction()
	 * @model
	 * @generated
	 */
	String getPower_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getPower_fraction <em>Power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power fraction</em>' attribute.
	 * @see #getPower_fraction()
	 * @generated
	 */
	void setPower_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power factor</em>' attribute.
	 * @see #setPower_factor(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getPower_factor <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power factor</em>' attribute.
	 * @see #getPower_factor()
	 * @generated
	 */
	void setPower_factor(String value);

	/**
	 * Returns the value of the '<em><b>Constant power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power</em>' attribute.
	 * @see #setConstant_power(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Constant_power()
	 * @model
	 * @generated
	 */
	String getConstant_power();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getConstant_power <em>Constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power</em>' attribute.
	 * @see #getConstant_power()
	 * @generated
	 */
	void setConstant_power(String value);

	/**
	 * Returns the value of the '<em><b>Constant current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current</em>' attribute.
	 * @see #setConstant_current(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Constant_current()
	 * @model
	 * @generated
	 */
	String getConstant_current();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getConstant_current <em>Constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current</em>' attribute.
	 * @see #getConstant_current()
	 * @generated
	 */
	void setConstant_current(String value);

	/**
	 * Returns the value of the '<em><b>Constant admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant admittance</em>' attribute.
	 * @see #setConstant_admittance(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Constant_admittance()
	 * @model
	 * @generated
	 */
	String getConstant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getConstant_admittance <em>Constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant admittance</em>' attribute.
	 * @see #getConstant_admittance()
	 * @generated
	 */
	void setConstant_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Voltage factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage factor</em>' attribute.
	 * @see #setVoltage_factor(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Voltage_factor()
	 * @model
	 * @generated
	 */
	String getVoltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getVoltage_factor <em>Voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage factor</em>' attribute.
	 * @see #getVoltage_factor()
	 * @generated
	 */
	void setVoltage_factor(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' attribute.
	 * @see #setOverride(String)
	 * @see visGrid.VisGridPackage#getRefrigerator_Override()
	 * @model
	 * @generated
	 */
	String getOverride();

	/**
	 * Sets the value of the '{@link visGrid.Refrigerator#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(String value);

} // Refrigerator
