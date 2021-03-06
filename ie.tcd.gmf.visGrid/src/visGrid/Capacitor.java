/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Capacitor#getPt_phase <em>Pt phase</em>}</li>
 *   <li>{@link visGrid.Capacitor#getPhases_connected <em>Phases connected</em>}</li>
 *   <li>{@link visGrid.Capacitor#getSwitchA <em>Switch A</em>}</li>
 *   <li>{@link visGrid.Capacitor#getSwitchB <em>Switch B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getSwitchC <em>Switch C</em>}</li>
 *   <li>{@link visGrid.Capacitor#getControl <em>Control</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_set_high <em>Voltage set high</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_set_low <em>Voltage set low</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVAr_set_high <em>VAr set high</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVAr_set_low <em>VAr set low</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCurrent_set_low <em>Current set low</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCurrent_set_high <em>Current set high</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCapacitor_A <em>Capacitor A</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCapacitor_B <em>Capacitor B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCapacitor_C <em>Capacitor C</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCap_nominal_voltage <em>Cap nominal voltage</em>}</li>
 *   <li>{@link visGrid.Capacitor#getTime_delay <em>Time delay</em>}</li>
 *   <li>{@link visGrid.Capacitor#getDwell_time <em>Dwell time</em>}</li>
 *   <li>{@link visGrid.Capacitor#getLockout_time <em>Lockout time</em>}</li>
 *   <li>{@link visGrid.Capacitor#getRemote_sense <em>Remote sense</em>}</li>
 *   <li>{@link visGrid.Capacitor#getRemote_sense_B <em>Remote sense B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getControl_level <em>Control level</em>}</li>
 *   <li>{@link visGrid.Capacitor#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.Capacitor#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.Capacitor#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.Capacitor#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.Capacitor#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.Capacitor#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.Capacitor#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.Capacitor#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.Capacitor#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.Capacitor#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.Capacitor#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Capacitor#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getCapacitor()
 * @model
 * @generated
 */
public interface Capacitor extends Connection {
	/**
	 * Returns the value of the '<em><b>Pt phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt phase</em>' attribute.
	 * @see #setPt_phase(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Pt_phase()
	 * @model
	 * @generated
	 */
	String getPt_phase();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getPt_phase <em>Pt phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt phase</em>' attribute.
	 * @see #getPt_phase()
	 * @generated
	 */
	void setPt_phase(String value);

	/**
	 * Returns the value of the '<em><b>Phases connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases connected</em>' attribute.
	 * @see #setPhases_connected(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Phases_connected()
	 * @model
	 * @generated
	 */
	String getPhases_connected();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getPhases_connected <em>Phases connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases connected</em>' attribute.
	 * @see #getPhases_connected()
	 * @generated
	 */
	void setPhases_connected(String value);

	/**
	 * Returns the value of the '<em><b>Switch A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch A</em>' attribute.
	 * @see #setSwitchA(String)
	 * @see visGrid.VisGridPackage#getCapacitor_SwitchA()
	 * @model
	 * @generated
	 */
	String getSwitchA();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getSwitchA <em>Switch A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch A</em>' attribute.
	 * @see #getSwitchA()
	 * @generated
	 */
	void setSwitchA(String value);

	/**
	 * Returns the value of the '<em><b>Switch B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch B</em>' attribute.
	 * @see #setSwitchB(String)
	 * @see visGrid.VisGridPackage#getCapacitor_SwitchB()
	 * @model
	 * @generated
	 */
	String getSwitchB();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getSwitchB <em>Switch B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch B</em>' attribute.
	 * @see #getSwitchB()
	 * @generated
	 */
	void setSwitchB(String value);

	/**
	 * Returns the value of the '<em><b>Switch C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch C</em>' attribute.
	 * @see #setSwitchC(String)
	 * @see visGrid.VisGridPackage#getCapacitor_SwitchC()
	 * @model
	 * @generated
	 */
	String getSwitchC();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getSwitchC <em>Switch C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch C</em>' attribute.
	 * @see #getSwitchC()
	 * @generated
	 */
	void setSwitchC(String value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' attribute.
	 * @see #setControl(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Control()
	 * @model
	 * @generated
	 */
	String getControl();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getControl <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' attribute.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(String value);

	/**
	 * Returns the value of the '<em><b>Voltage set high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage set high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage set high</em>' attribute.
	 * @see #setVoltage_set_high(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_set_high()
	 * @model
	 * @generated
	 */
	String getVoltage_set_high();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_set_high <em>Voltage set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage set high</em>' attribute.
	 * @see #getVoltage_set_high()
	 * @generated
	 */
	void setVoltage_set_high(String value);

	/**
	 * Returns the value of the '<em><b>Voltage set low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage set low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage set low</em>' attribute.
	 * @see #setVoltage_set_low(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_set_low()
	 * @model
	 * @generated
	 */
	String getVoltage_set_low();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_set_low <em>Voltage set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage set low</em>' attribute.
	 * @see #getVoltage_set_low()
	 * @generated
	 */
	void setVoltage_set_low(String value);

	/**
	 * Returns the value of the '<em><b>VAr set high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAr set high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAr set high</em>' attribute.
	 * @see #setVAr_set_high(String)
	 * @see visGrid.VisGridPackage#getCapacitor_VAr_set_high()
	 * @model
	 * @generated
	 */
	String getVAr_set_high();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVAr_set_high <em>VAr set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAr set high</em>' attribute.
	 * @see #getVAr_set_high()
	 * @generated
	 */
	void setVAr_set_high(String value);

	/**
	 * Returns the value of the '<em><b>VAr set low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAr set low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAr set low</em>' attribute.
	 * @see #setVAr_set_low(String)
	 * @see visGrid.VisGridPackage#getCapacitor_VAr_set_low()
	 * @model
	 * @generated
	 */
	String getVAr_set_low();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVAr_set_low <em>VAr set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAr set low</em>' attribute.
	 * @see #getVAr_set_low()
	 * @generated
	 */
	void setVAr_set_low(String value);

	/**
	 * Returns the value of the '<em><b>Current set low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current set low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current set low</em>' attribute.
	 * @see #setCurrent_set_low(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Current_set_low()
	 * @model
	 * @generated
	 */
	String getCurrent_set_low();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCurrent_set_low <em>Current set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current set low</em>' attribute.
	 * @see #getCurrent_set_low()
	 * @generated
	 */
	void setCurrent_set_low(String value);

	/**
	 * Returns the value of the '<em><b>Current set high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current set high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current set high</em>' attribute.
	 * @see #setCurrent_set_high(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Current_set_high()
	 * @model
	 * @generated
	 */
	String getCurrent_set_high();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCurrent_set_high <em>Current set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current set high</em>' attribute.
	 * @see #getCurrent_set_high()
	 * @generated
	 */
	void setCurrent_set_high(String value);

	/**
	 * Returns the value of the '<em><b>Capacitor A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitor A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitor A</em>' attribute.
	 * @see #setCapacitor_A(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Capacitor_A()
	 * @model
	 * @generated
	 */
	String getCapacitor_A();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCapacitor_A <em>Capacitor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitor A</em>' attribute.
	 * @see #getCapacitor_A()
	 * @generated
	 */
	void setCapacitor_A(String value);

	/**
	 * Returns the value of the '<em><b>Capacitor B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitor B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitor B</em>' attribute.
	 * @see #setCapacitor_B(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Capacitor_B()
	 * @model
	 * @generated
	 */
	String getCapacitor_B();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCapacitor_B <em>Capacitor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitor B</em>' attribute.
	 * @see #getCapacitor_B()
	 * @generated
	 */
	void setCapacitor_B(String value);

	/**
	 * Returns the value of the '<em><b>Capacitor C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitor C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitor C</em>' attribute.
	 * @see #setCapacitor_C(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Capacitor_C()
	 * @model
	 * @generated
	 */
	String getCapacitor_C();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCapacitor_C <em>Capacitor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacitor C</em>' attribute.
	 * @see #getCapacitor_C()
	 * @generated
	 */
	void setCapacitor_C(String value);

	/**
	 * Returns the value of the '<em><b>Cap nominal voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap nominal voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap nominal voltage</em>' attribute.
	 * @see #setCap_nominal_voltage(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Cap_nominal_voltage()
	 * @model
	 * @generated
	 */
	String getCap_nominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCap_nominal_voltage <em>Cap nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap nominal voltage</em>' attribute.
	 * @see #getCap_nominal_voltage()
	 * @generated
	 */
	void setCap_nominal_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Time delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time delay</em>' attribute.
	 * @see #setTime_delay(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Time_delay()
	 * @model
	 * @generated
	 */
	String getTime_delay();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getTime_delay <em>Time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time delay</em>' attribute.
	 * @see #getTime_delay()
	 * @generated
	 */
	void setTime_delay(String value);

	/**
	 * Returns the value of the '<em><b>Dwell time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dwell time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dwell time</em>' attribute.
	 * @see #setDwell_time(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Dwell_time()
	 * @model
	 * @generated
	 */
	String getDwell_time();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getDwell_time <em>Dwell time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dwell time</em>' attribute.
	 * @see #getDwell_time()
	 * @generated
	 */
	void setDwell_time(String value);

	/**
	 * Returns the value of the '<em><b>Lockout time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lockout time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lockout time</em>' attribute.
	 * @see #setLockout_time(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Lockout_time()
	 * @model
	 * @generated
	 */
	String getLockout_time();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getLockout_time <em>Lockout time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockout time</em>' attribute.
	 * @see #getLockout_time()
	 * @generated
	 */
	void setLockout_time(String value);

	/**
	 * Returns the value of the '<em><b>Remote sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote sense</em>' attribute.
	 * @see #setRemote_sense(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Remote_sense()
	 * @model
	 * @generated
	 */
	String getRemote_sense();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getRemote_sense <em>Remote sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote sense</em>' attribute.
	 * @see #getRemote_sense()
	 * @generated
	 */
	void setRemote_sense(String value);

	/**
	 * Returns the value of the '<em><b>Remote sense B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote sense B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote sense B</em>' attribute.
	 * @see #setRemote_sense_B(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Remote_sense_B()
	 * @model
	 * @generated
	 */
	String getRemote_sense_B();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getRemote_sense_B <em>Remote sense B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote sense B</em>' attribute.
	 * @see #getRemote_sense_B()
	 * @generated
	 */
	void setRemote_sense_B(String value);

	/**
	 * Returns the value of the '<em><b>Control level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control level</em>' attribute.
	 * @see #setControl_level(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Control_level()
	 * @model
	 * @generated
	 */
	String getControl_level();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getControl_level <em>Control level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control level</em>' attribute.
	 * @see #getControl_level()
	 * @generated
	 */
	void setControl_level(String value);

	/**
	 * Returns the value of the '<em><b>Bustype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bustype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bustype</em>' attribute.
	 * @see #setBustype(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Bustype()
	 * @model
	 * @generated
	 */
	String getBustype();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getBustype <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bustype</em>' attribute.
	 * @see #getBustype()
	 * @generated
	 */
	void setBustype(String value);

	/**
	 * Returns the value of the '<em><b>Busflags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Busflags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Busflags</em>' attribute.
	 * @see #setBusflags(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Busflags()
	 * @model
	 * @generated
	 */
	String getBusflags();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getBusflags <em>Busflags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Busflags</em>' attribute.
	 * @see #getBusflags()
	 * @generated
	 */
	void setBusflags(String value);

	/**
	 * Returns the value of the '<em><b>Reference bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference bus</em>' attribute.
	 * @see #setReference_bus(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Reference_bus()
	 * @model
	 * @generated
	 */
	String getReference_bus();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getReference_bus <em>Reference bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference bus</em>' attribute.
	 * @see #getReference_bus()
	 * @generated
	 */
	void setReference_bus(String value);

	/**
	 * Returns the value of the '<em><b>Maximum voltage error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum voltage error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum voltage error</em>' attribute.
	 * @see #setMaximum_voltage_error(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Maximum_voltage_error()
	 * @model
	 * @generated
	 */
	String getMaximum_voltage_error();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getMaximum_voltage_error <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum voltage error</em>' attribute.
	 * @see #getMaximum_voltage_error()
	 * @generated
	 */
	void setMaximum_voltage_error(String value);

	/**
	 * Returns the value of the '<em><b>Voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage A</em>' attribute.
	 * @see #setVoltage_A(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_A()
	 * @model
	 * @generated
	 */
	String getVoltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_A <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage A</em>' attribute.
	 * @see #getVoltage_A()
	 * @generated
	 */
	void setVoltage_A(String value);

	/**
	 * Returns the value of the '<em><b>Voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage B</em>' attribute.
	 * @see #setVoltage_B(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_B()
	 * @model
	 * @generated
	 */
	String getVoltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_B <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage B</em>' attribute.
	 * @see #getVoltage_B()
	 * @generated
	 */
	void setVoltage_B(String value);

	/**
	 * Returns the value of the '<em><b>Voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage C</em>' attribute.
	 * @see #setVoltage_C(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_C()
	 * @model
	 * @generated
	 */
	String getVoltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_C <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage C</em>' attribute.
	 * @see #getVoltage_C()
	 * @generated
	 */
	void setVoltage_C(String value);

	/**
	 * Returns the value of the '<em><b>Voltage AB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage AB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage AB</em>' attribute.
	 * @see #setVoltage_AB(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_AB()
	 * @model
	 * @generated
	 */
	String getVoltage_AB();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_AB <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage AB</em>' attribute.
	 * @see #getVoltage_AB()
	 * @generated
	 */
	void setVoltage_AB(String value);

	/**
	 * Returns the value of the '<em><b>Voltage BC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage BC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage BC</em>' attribute.
	 * @see #setVoltage_BC(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_BC()
	 * @model
	 * @generated
	 */
	String getVoltage_BC();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_BC <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage BC</em>' attribute.
	 * @see #getVoltage_BC()
	 * @generated
	 */
	void setVoltage_BC(String value);

	/**
	 * Returns the value of the '<em><b>Voltage CA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage CA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage CA</em>' attribute.
	 * @see #setVoltage_CA(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Voltage_CA()
	 * @model
	 * @generated
	 */
	String getVoltage_CA();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getVoltage_CA <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage CA</em>' attribute.
	 * @see #getVoltage_CA()
	 * @generated
	 */
	void setVoltage_CA(String value);

	/**
	 * Returns the value of the '<em><b>Current A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current A</em>' attribute.
	 * @see #setCurrent_A(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Current_A()
	 * @model
	 * @generated
	 */
	String getCurrent_A();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCurrent_A <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current A</em>' attribute.
	 * @see #getCurrent_A()
	 * @generated
	 */
	void setCurrent_A(String value);

	/**
	 * Returns the value of the '<em><b>Current B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current B</em>' attribute.
	 * @see #setCurrent_B(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Current_B()
	 * @model
	 * @generated
	 */
	String getCurrent_B();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCurrent_B <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current B</em>' attribute.
	 * @see #getCurrent_B()
	 * @generated
	 */
	void setCurrent_B(String value);

	/**
	 * Returns the value of the '<em><b>Current C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current C</em>' attribute.
	 * @see #setCurrent_C(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Current_C()
	 * @model
	 * @generated
	 */
	String getCurrent_C();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getCurrent_C <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current C</em>' attribute.
	 * @see #getCurrent_C()
	 * @generated
	 */
	void setCurrent_C(String value);

	/**
	 * Returns the value of the '<em><b>Power A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power A</em>' attribute.
	 * @see #setPower_A(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Power_A()
	 * @model
	 * @generated
	 */
	String getPower_A();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getPower_A <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power A</em>' attribute.
	 * @see #getPower_A()
	 * @generated
	 */
	void setPower_A(String value);

	/**
	 * Returns the value of the '<em><b>Power B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power B</em>' attribute.
	 * @see #setPower_B(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Power_B()
	 * @model
	 * @generated
	 */
	String getPower_B();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getPower_B <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power B</em>' attribute.
	 * @see #getPower_B()
	 * @generated
	 */
	void setPower_B(String value);

	/**
	 * Returns the value of the '<em><b>Power C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power C</em>' attribute.
	 * @see #setPower_C(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Power_C()
	 * @model
	 * @generated
	 */
	String getPower_C();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getPower_C <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power C</em>' attribute.
	 * @see #getPower_C()
	 * @generated
	 */
	void setPower_C(String value);

	/**
	 * Returns the value of the '<em><b>Shunt A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt A</em>' attribute.
	 * @see #setShunt_A(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Shunt_A()
	 * @model
	 * @generated
	 */
	String getShunt_A();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getShunt_A <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt A</em>' attribute.
	 * @see #getShunt_A()
	 * @generated
	 */
	void setShunt_A(String value);

	/**
	 * Returns the value of the '<em><b>Shunt B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt B</em>' attribute.
	 * @see #setShunt_B(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Shunt_B()
	 * @model
	 * @generated
	 */
	String getShunt_B();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getShunt_B <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt B</em>' attribute.
	 * @see #getShunt_B()
	 * @generated
	 */
	void setShunt_B(String value);

	/**
	 * Returns the value of the '<em><b>Shunt C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt C</em>' attribute.
	 * @see #setShunt_C(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Shunt_C()
	 * @model
	 * @generated
	 */
	String getShunt_C();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getShunt_C <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt C</em>' attribute.
	 * @see #getShunt_C()
	 * @generated
	 */
	void setShunt_C(String value);

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see #setPhases(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

	/**
	 * Returns the value of the '<em><b>Nominal voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal voltage</em>' attribute.
	 * @see #setNominal_voltage(String)
	 * @see visGrid.VisGridPackage#getCapacitor_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Capacitor#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Capacitor
