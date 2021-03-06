/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Controller2#getInput_state <em>Input state</em>}</li>
 *   <li>{@link visGrid.Controller2#getInput_setpoint <em>Input setpoint</em>}</li>
 *   <li>{@link visGrid.Controller2#getInput_chained <em>Input chained</em>}</li>
 *   <li>{@link visGrid.Controller2#getObservation <em>Observation</em>}</li>
 *   <li>{@link visGrid.Controller2#getMean_observation <em>Mean observation</em>}</li>
 *   <li>{@link visGrid.Controller2#getStdev_observation <em>Stdev observation</em>}</li>
 *   <li>{@link visGrid.Controller2#getExpectation <em>Expectation</em>}</li>
 *   <li>{@link visGrid.Controller2#getSetpoint <em>Setpoint</em>}</li>
 *   <li>{@link visGrid.Controller2#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link visGrid.Controller2#getPeriod <em>Period</em>}</li>
 *   <li>{@link visGrid.Controller2#getExpectation_prop <em>Expectation prop</em>}</li>
 *   <li>{@link visGrid.Controller2#getExpectation_obj <em>Expectation obj</em>}</li>
 *   <li>{@link visGrid.Controller2#getSetpoint_prop <em>Setpoint prop</em>}</li>
 *   <li>{@link visGrid.Controller2#getState_prop <em>State prop</em>}</li>
 *   <li>{@link visGrid.Controller2#getObservation_obj <em>Observation obj</em>}</li>
 *   <li>{@link visGrid.Controller2#getObservation_prop <em>Observation prop</em>}</li>
 *   <li>{@link visGrid.Controller2#getMean_observation_prop <em>Mean observation prop</em>}</li>
 *   <li>{@link visGrid.Controller2#getStdev_observation_prop <em>Stdev observation prop</em>}</li>
 *   <li>{@link visGrid.Controller2#getCycle_length <em>Cycle length</em>}</li>
 *   <li>{@link visGrid.Controller2#getBase_setpoint <em>Base setpoint</em>}</li>
 *   <li>{@link visGrid.Controller2#getRamp_high <em>Ramp high</em>}</li>
 *   <li>{@link visGrid.Controller2#getRamp_low <em>Ramp low</em>}</li>
 *   <li>{@link visGrid.Controller2#getRange_high <em>Range high</em>}</li>
 *   <li>{@link visGrid.Controller2#getRange_low <em>Range low</em>}</li>
 *   <li>{@link visGrid.Controller2#getProb_off <em>Prob off</em>}</li>
 *   <li>{@link visGrid.Controller2#getOutput_state <em>Output state</em>}</li>
 *   <li>{@link visGrid.Controller2#getOutput_setpoint <em>Output setpoint</em>}</li>
 *   <li>{@link visGrid.Controller2#getControl_mode <em>Control mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getController2()
 * @model
 * @generated
 */
public interface Controller2 extends Connection {
	/**
	 * Returns the value of the '<em><b>Input state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input state</em>' attribute.
	 * @see #setInput_state(String)
	 * @see visGrid.VisGridPackage#getController2_Input_state()
	 * @model
	 * @generated
	 */
	String getInput_state();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getInput_state <em>Input state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input state</em>' attribute.
	 * @see #getInput_state()
	 * @generated
	 */
	void setInput_state(String value);

	/**
	 * Returns the value of the '<em><b>Input setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input setpoint</em>' attribute.
	 * @see #setInput_setpoint(String)
	 * @see visGrid.VisGridPackage#getController2_Input_setpoint()
	 * @model
	 * @generated
	 */
	String getInput_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getInput_setpoint <em>Input setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input setpoint</em>' attribute.
	 * @see #getInput_setpoint()
	 * @generated
	 */
	void setInput_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Input chained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input chained</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input chained</em>' attribute.
	 * @see #setInput_chained(String)
	 * @see visGrid.VisGridPackage#getController2_Input_chained()
	 * @model
	 * @generated
	 */
	String getInput_chained();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getInput_chained <em>Input chained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input chained</em>' attribute.
	 * @see #getInput_chained()
	 * @generated
	 */
	void setInput_chained(String value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' attribute.
	 * @see #setObservation(String)
	 * @see visGrid.VisGridPackage#getController2_Observation()
	 * @model
	 * @generated
	 */
	String getObservation();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getObservation <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' attribute.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(String value);

	/**
	 * Returns the value of the '<em><b>Mean observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean observation</em>' attribute.
	 * @see #setMean_observation(String)
	 * @see visGrid.VisGridPackage#getController2_Mean_observation()
	 * @model
	 * @generated
	 */
	String getMean_observation();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getMean_observation <em>Mean observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean observation</em>' attribute.
	 * @see #getMean_observation()
	 * @generated
	 */
	void setMean_observation(String value);

	/**
	 * Returns the value of the '<em><b>Stdev observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stdev observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdev observation</em>' attribute.
	 * @see #setStdev_observation(String)
	 * @see visGrid.VisGridPackage#getController2_Stdev_observation()
	 * @model
	 * @generated
	 */
	String getStdev_observation();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getStdev_observation <em>Stdev observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdev observation</em>' attribute.
	 * @see #getStdev_observation()
	 * @generated
	 */
	void setStdev_observation(String value);

	/**
	 * Returns the value of the '<em><b>Expectation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expectation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectation</em>' attribute.
	 * @see #setExpectation(String)
	 * @see visGrid.VisGridPackage#getController2_Expectation()
	 * @model
	 * @generated
	 */
	String getExpectation();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getExpectation <em>Expectation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expectation</em>' attribute.
	 * @see #getExpectation()
	 * @generated
	 */
	void setExpectation(String value);

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
	 * @see visGrid.VisGridPackage#getController2_Setpoint()
	 * @model
	 * @generated
	 */
	String getSetpoint();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getSetpoint <em>Setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setpoint</em>' attribute.
	 * @see #getSetpoint()
	 * @generated
	 */
	void setSetpoint(String value);

	/**
	 * Returns the value of the '<em><b>Sensitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity</em>' attribute.
	 * @see #setSensitivity(String)
	 * @see visGrid.VisGridPackage#getController2_Sensitivity()
	 * @model
	 * @generated
	 */
	String getSensitivity();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getSensitivity <em>Sensitivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity</em>' attribute.
	 * @see #getSensitivity()
	 * @generated
	 */
	void setSensitivity(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see visGrid.VisGridPackage#getController2_Period()
	 * @model
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Expectation prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expectation prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectation prop</em>' attribute.
	 * @see #setExpectation_prop(String)
	 * @see visGrid.VisGridPackage#getController2_Expectation_prop()
	 * @model
	 * @generated
	 */
	String getExpectation_prop();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getExpectation_prop <em>Expectation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expectation prop</em>' attribute.
	 * @see #getExpectation_prop()
	 * @generated
	 */
	void setExpectation_prop(String value);

	/**
	 * Returns the value of the '<em><b>Expectation obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expectation obj</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectation obj</em>' attribute.
	 * @see #setExpectation_obj(String)
	 * @see visGrid.VisGridPackage#getController2_Expectation_obj()
	 * @model
	 * @generated
	 */
	String getExpectation_obj();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getExpectation_obj <em>Expectation obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expectation obj</em>' attribute.
	 * @see #getExpectation_obj()
	 * @generated
	 */
	void setExpectation_obj(String value);

	/**
	 * Returns the value of the '<em><b>Setpoint prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setpoint prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setpoint prop</em>' attribute.
	 * @see #setSetpoint_prop(String)
	 * @see visGrid.VisGridPackage#getController2_Setpoint_prop()
	 * @model
	 * @generated
	 */
	String getSetpoint_prop();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getSetpoint_prop <em>Setpoint prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setpoint prop</em>' attribute.
	 * @see #getSetpoint_prop()
	 * @generated
	 */
	void setSetpoint_prop(String value);

	/**
	 * Returns the value of the '<em><b>State prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State prop</em>' attribute.
	 * @see #setState_prop(String)
	 * @see visGrid.VisGridPackage#getController2_State_prop()
	 * @model
	 * @generated
	 */
	String getState_prop();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getState_prop <em>State prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State prop</em>' attribute.
	 * @see #getState_prop()
	 * @generated
	 */
	void setState_prop(String value);

	/**
	 * Returns the value of the '<em><b>Observation obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation obj</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation obj</em>' attribute.
	 * @see #setObservation_obj(String)
	 * @see visGrid.VisGridPackage#getController2_Observation_obj()
	 * @model
	 * @generated
	 */
	String getObservation_obj();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getObservation_obj <em>Observation obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation obj</em>' attribute.
	 * @see #getObservation_obj()
	 * @generated
	 */
	void setObservation_obj(String value);

	/**
	 * Returns the value of the '<em><b>Observation prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation prop</em>' attribute.
	 * @see #setObservation_prop(String)
	 * @see visGrid.VisGridPackage#getController2_Observation_prop()
	 * @model
	 * @generated
	 */
	String getObservation_prop();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getObservation_prop <em>Observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation prop</em>' attribute.
	 * @see #getObservation_prop()
	 * @generated
	 */
	void setObservation_prop(String value);

	/**
	 * Returns the value of the '<em><b>Mean observation prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean observation prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean observation prop</em>' attribute.
	 * @see #setMean_observation_prop(String)
	 * @see visGrid.VisGridPackage#getController2_Mean_observation_prop()
	 * @model
	 * @generated
	 */
	String getMean_observation_prop();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getMean_observation_prop <em>Mean observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean observation prop</em>' attribute.
	 * @see #getMean_observation_prop()
	 * @generated
	 */
	void setMean_observation_prop(String value);

	/**
	 * Returns the value of the '<em><b>Stdev observation prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stdev observation prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdev observation prop</em>' attribute.
	 * @see #setStdev_observation_prop(String)
	 * @see visGrid.VisGridPackage#getController2_Stdev_observation_prop()
	 * @model
	 * @generated
	 */
	String getStdev_observation_prop();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getStdev_observation_prop <em>Stdev observation prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdev observation prop</em>' attribute.
	 * @see #getStdev_observation_prop()
	 * @generated
	 */
	void setStdev_observation_prop(String value);

	/**
	 * Returns the value of the '<em><b>Cycle length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle length</em>' attribute.
	 * @see #setCycle_length(String)
	 * @see visGrid.VisGridPackage#getController2_Cycle_length()
	 * @model
	 * @generated
	 */
	String getCycle_length();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getCycle_length <em>Cycle length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle length</em>' attribute.
	 * @see #getCycle_length()
	 * @generated
	 */
	void setCycle_length(String value);

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
	 * @see visGrid.VisGridPackage#getController2_Base_setpoint()
	 * @model
	 * @generated
	 */
	String getBase_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getBase_setpoint <em>Base setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base setpoint</em>' attribute.
	 * @see #getBase_setpoint()
	 * @generated
	 */
	void setBase_setpoint(String value);

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
	 * @see visGrid.VisGridPackage#getController2_Ramp_high()
	 * @model
	 * @generated
	 */
	String getRamp_high();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getRamp_high <em>Ramp high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp high</em>' attribute.
	 * @see #getRamp_high()
	 * @generated
	 */
	void setRamp_high(String value);

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
	 * @see visGrid.VisGridPackage#getController2_Ramp_low()
	 * @model
	 * @generated
	 */
	String getRamp_low();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getRamp_low <em>Ramp low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp low</em>' attribute.
	 * @see #getRamp_low()
	 * @generated
	 */
	void setRamp_low(String value);

	/**
	 * Returns the value of the '<em><b>Range high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range high</em>' attribute.
	 * @see #setRange_high(String)
	 * @see visGrid.VisGridPackage#getController2_Range_high()
	 * @model
	 * @generated
	 */
	String getRange_high();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getRange_high <em>Range high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range high</em>' attribute.
	 * @see #getRange_high()
	 * @generated
	 */
	void setRange_high(String value);

	/**
	 * Returns the value of the '<em><b>Range low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range low</em>' attribute.
	 * @see #setRange_low(String)
	 * @see visGrid.VisGridPackage#getController2_Range_low()
	 * @model
	 * @generated
	 */
	String getRange_low();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getRange_low <em>Range low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range low</em>' attribute.
	 * @see #getRange_low()
	 * @generated
	 */
	void setRange_low(String value);

	/**
	 * Returns the value of the '<em><b>Prob off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob off</em>' attribute.
	 * @see #setProb_off(String)
	 * @see visGrid.VisGridPackage#getController2_Prob_off()
	 * @model
	 * @generated
	 */
	String getProb_off();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getProb_off <em>Prob off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob off</em>' attribute.
	 * @see #getProb_off()
	 * @generated
	 */
	void setProb_off(String value);

	/**
	 * Returns the value of the '<em><b>Output state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output state</em>' attribute.
	 * @see #setOutput_state(String)
	 * @see visGrid.VisGridPackage#getController2_Output_state()
	 * @model
	 * @generated
	 */
	String getOutput_state();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getOutput_state <em>Output state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output state</em>' attribute.
	 * @see #getOutput_state()
	 * @generated
	 */
	void setOutput_state(String value);

	/**
	 * Returns the value of the '<em><b>Output setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output setpoint</em>' attribute.
	 * @see #setOutput_setpoint(String)
	 * @see visGrid.VisGridPackage#getController2_Output_setpoint()
	 * @model
	 * @generated
	 */
	String getOutput_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getOutput_setpoint <em>Output setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output setpoint</em>' attribute.
	 * @see #getOutput_setpoint()
	 * @generated
	 */
	void setOutput_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Control mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control mode</em>' attribute.
	 * @see #setControl_mode(String)
	 * @see visGrid.VisGridPackage#getController2_Control_mode()
	 * @model
	 * @generated
	 */
	String getControl_mode();

	/**
	 * Sets the value of the '{@link visGrid.Controller2#getControl_mode <em>Control mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control mode</em>' attribute.
	 * @see #getControl_mode()
	 * @generated
	 */
	void setControl_mode(String value);

} // Controller2
