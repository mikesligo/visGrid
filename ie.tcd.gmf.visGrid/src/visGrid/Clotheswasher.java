/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clotheswasher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Clotheswasher#getMotor_power <em>Motor power</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getCircuit_split <em>Circuit split</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getQueue <em>Queue</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getEnergy_meter <em>Energy meter</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getStall_voltage <em>Stall voltage</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getStart_voltage <em>Start voltage</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getStall_impedance <em>Stall impedance</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getTrip_delay <em>Trip delay</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getReset_delay <em>Reset delay</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getState <em>State</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.Clotheswasher#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getClotheswasher()
 * @model
 * @generated
 */
public interface Clotheswasher extends Connection {
	/**
	 * Returns the value of the '<em><b>Motor power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor power</em>' attribute.
	 * @see #setMotor_power(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Motor_power()
	 * @model
	 * @generated
	 */
	String getMotor_power();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getMotor_power <em>Motor power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor power</em>' attribute.
	 * @see #getMotor_power()
	 * @generated
	 */
	void setMotor_power(String value);

	/**
	 * Returns the value of the '<em><b>Circuit split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit split</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit split</em>' attribute.
	 * @see #setCircuit_split(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Circuit_split()
	 * @model
	 * @generated
	 */
	String getCircuit_split();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getCircuit_split <em>Circuit split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit split</em>' attribute.
	 * @see #getCircuit_split()
	 * @generated
	 */
	void setCircuit_split(String value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' attribute.
	 * @see #setQueue(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Queue()
	 * @model
	 * @generated
	 */
	String getQueue();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getQueue <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' attribute.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(String value);

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
	 * @see visGrid.VisGridPackage#getClotheswasher_Demand()
	 * @model
	 * @generated
	 */
	String getDemand();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getDemand <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' attribute.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(String value);

	/**
	 * Returns the value of the '<em><b>Energy meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy meter</em>' attribute.
	 * @see #setEnergy_meter(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Energy_meter()
	 * @model
	 * @generated
	 */
	String getEnergy_meter();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getEnergy_meter <em>Energy meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy meter</em>' attribute.
	 * @see #getEnergy_meter()
	 * @generated
	 */
	void setEnergy_meter(String value);

	/**
	 * Returns the value of the '<em><b>Stall voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stall voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stall voltage</em>' attribute.
	 * @see #setStall_voltage(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Stall_voltage()
	 * @model
	 * @generated
	 */
	String getStall_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getStall_voltage <em>Stall voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stall voltage</em>' attribute.
	 * @see #getStall_voltage()
	 * @generated
	 */
	void setStall_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Start voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start voltage</em>' attribute.
	 * @see #setStart_voltage(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Start_voltage()
	 * @model
	 * @generated
	 */
	String getStart_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getStart_voltage <em>Start voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start voltage</em>' attribute.
	 * @see #getStart_voltage()
	 * @generated
	 */
	void setStart_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Stall impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stall impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stall impedance</em>' attribute.
	 * @see #setStall_impedance(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Stall_impedance()
	 * @model
	 * @generated
	 */
	String getStall_impedance();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getStall_impedance <em>Stall impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stall impedance</em>' attribute.
	 * @see #getStall_impedance()
	 * @generated
	 */
	void setStall_impedance(String value);

	/**
	 * Returns the value of the '<em><b>Trip delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trip delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trip delay</em>' attribute.
	 * @see #setTrip_delay(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Trip_delay()
	 * @model
	 * @generated
	 */
	String getTrip_delay();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getTrip_delay <em>Trip delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trip delay</em>' attribute.
	 * @see #getTrip_delay()
	 * @generated
	 */
	void setTrip_delay(String value);

	/**
	 * Returns the value of the '<em><b>Reset delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset delay</em>' attribute.
	 * @see #setReset_delay(String)
	 * @see visGrid.VisGridPackage#getClotheswasher_Reset_delay()
	 * @model
	 * @generated
	 */
	String getReset_delay();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getReset_delay <em>Reset delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset delay</em>' attribute.
	 * @see #getReset_delay()
	 * @generated
	 */
	void setReset_delay(String value);

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
	 * @see visGrid.VisGridPackage#getClotheswasher_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getState <em>State</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getShape <em>Shape</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getLoad <em>Load</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getEnergy <em>Energy</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getPower <em>Power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Peak_demand()
	 * @model
	 * @generated
	 */
	String getPeak_demand();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getPeak_demand <em>Peak demand</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Heatgain()
	 * @model
	 * @generated
	 */
	String getHeatgain();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getHeatgain <em>Heatgain</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHeatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getHeatgain_fraction <em>Heatgain fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Current_fraction()
	 * @model
	 * @generated
	 */
	String getCurrent_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getCurrent_fraction <em>Current fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Impedance_fraction()
	 * @model
	 * @generated
	 */
	String getImpedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getImpedance_fraction <em>Impedance fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Power_fraction()
	 * @model
	 * @generated
	 */
	String getPower_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getPower_fraction <em>Power fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getPower_factor <em>Power factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Constant_power()
	 * @model
	 * @generated
	 */
	String getConstant_power();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getConstant_power <em>Constant power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Constant_current()
	 * @model
	 * @generated
	 */
	String getConstant_current();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getConstant_current <em>Constant current</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Constant_admittance()
	 * @model
	 * @generated
	 */
	String getConstant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getConstant_admittance <em>Constant admittance</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Voltage_factor()
	 * @model
	 * @generated
	 */
	String getVoltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getVoltage_factor <em>Voltage factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getConfiguration <em>Configuration</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getClotheswasher_Override()
	 * @model
	 * @generated
	 */
	String getOverride();

	/**
	 * Sets the value of the '{@link visGrid.Clotheswasher#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(String value);

} // Clotheswasher
