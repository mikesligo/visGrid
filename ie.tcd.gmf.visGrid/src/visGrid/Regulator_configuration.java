/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulator configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Regulator_configuration#getConnect_type <em>Connect type</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getBand_center <em>Band center</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getBand_width <em>Band width</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getTime_delay <em>Time delay</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getDwell_time <em>Dwell time</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getRaise_taps <em>Raise taps</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getLower_taps <em>Lower taps</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCurrent_transducer_ratio <em>Current transducer ratio</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getPower_transducer_ratio <em>Power transducer ratio</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCompensator_r_setting_A <em>Compensator rsetting A</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCompensator_r_setting_B <em>Compensator rsetting B</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCompensator_r_setting_C <em>Compensator rsetting C</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCompensator_x_setting_A <em>Compensator xsetting A</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCompensator_x_setting_B <em>Compensator xsetting B</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCompensator_x_setting_C <em>Compensator xsetting C</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getCT_phase <em>CT phase</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getPT_phase <em>PT phase</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getRegulation <em>Regulation</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getControl_level <em>Control level</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getControl <em>Control</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getType <em>Type</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getTap_pos_A <em>Tap pos A</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getTap_pos_B <em>Tap pos B</em>}</li>
 *   <li>{@link visGrid.Regulator_configuration#getTap_pos_C <em>Tap pos C</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getRegulator_configuration()
 * @model
 * @generated
 */
public interface Regulator_configuration extends Connection {
	/**
	 * Returns the value of the '<em><b>Connect type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect type</em>' attribute.
	 * @see #setConnect_type(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Connect_type()
	 * @model
	 * @generated
	 */
	String getConnect_type();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getConnect_type <em>Connect type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect type</em>' attribute.
	 * @see #getConnect_type()
	 * @generated
	 */
	void setConnect_type(String value);

	/**
	 * Returns the value of the '<em><b>Band center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Band center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band center</em>' attribute.
	 * @see #setBand_center(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Band_center()
	 * @model
	 * @generated
	 */
	String getBand_center();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getBand_center <em>Band center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band center</em>' attribute.
	 * @see #getBand_center()
	 * @generated
	 */
	void setBand_center(String value);

	/**
	 * Returns the value of the '<em><b>Band width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Band width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Band width</em>' attribute.
	 * @see #setBand_width(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Band_width()
	 * @model
	 * @generated
	 */
	String getBand_width();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getBand_width <em>Band width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Band width</em>' attribute.
	 * @see #getBand_width()
	 * @generated
	 */
	void setBand_width(String value);

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
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Time_delay()
	 * @model
	 * @generated
	 */
	String getTime_delay();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getTime_delay <em>Time delay</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Dwell_time()
	 * @model
	 * @generated
	 */
	String getDwell_time();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getDwell_time <em>Dwell time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dwell time</em>' attribute.
	 * @see #getDwell_time()
	 * @generated
	 */
	void setDwell_time(String value);

	/**
	 * Returns the value of the '<em><b>Raise taps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raise taps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raise taps</em>' attribute.
	 * @see #setRaise_taps(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Raise_taps()
	 * @model
	 * @generated
	 */
	String getRaise_taps();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getRaise_taps <em>Raise taps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raise taps</em>' attribute.
	 * @see #getRaise_taps()
	 * @generated
	 */
	void setRaise_taps(String value);

	/**
	 * Returns the value of the '<em><b>Lower taps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower taps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower taps</em>' attribute.
	 * @see #setLower_taps(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Lower_taps()
	 * @model
	 * @generated
	 */
	String getLower_taps();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getLower_taps <em>Lower taps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower taps</em>' attribute.
	 * @see #getLower_taps()
	 * @generated
	 */
	void setLower_taps(String value);

	/**
	 * Returns the value of the '<em><b>Current transducer ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current transducer ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current transducer ratio</em>' attribute.
	 * @see #setCurrent_transducer_ratio(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Current_transducer_ratio()
	 * @model
	 * @generated
	 */
	String getCurrent_transducer_ratio();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCurrent_transducer_ratio <em>Current transducer ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current transducer ratio</em>' attribute.
	 * @see #getCurrent_transducer_ratio()
	 * @generated
	 */
	void setCurrent_transducer_ratio(String value);

	/**
	 * Returns the value of the '<em><b>Power transducer ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power transducer ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power transducer ratio</em>' attribute.
	 * @see #setPower_transducer_ratio(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Power_transducer_ratio()
	 * @model
	 * @generated
	 */
	String getPower_transducer_ratio();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getPower_transducer_ratio <em>Power transducer ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power transducer ratio</em>' attribute.
	 * @see #getPower_transducer_ratio()
	 * @generated
	 */
	void setPower_transducer_ratio(String value);

	/**
	 * Returns the value of the '<em><b>Compensator rsetting A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensator rsetting A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensator rsetting A</em>' attribute.
	 * @see #setCompensator_r_setting_A(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Compensator_r_setting_A()
	 * @model
	 * @generated
	 */
	String getCompensator_r_setting_A();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCompensator_r_setting_A <em>Compensator rsetting A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensator rsetting A</em>' attribute.
	 * @see #getCompensator_r_setting_A()
	 * @generated
	 */
	void setCompensator_r_setting_A(String value);

	/**
	 * Returns the value of the '<em><b>Compensator rsetting B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensator rsetting B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensator rsetting B</em>' attribute.
	 * @see #setCompensator_r_setting_B(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Compensator_r_setting_B()
	 * @model
	 * @generated
	 */
	String getCompensator_r_setting_B();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCompensator_r_setting_B <em>Compensator rsetting B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensator rsetting B</em>' attribute.
	 * @see #getCompensator_r_setting_B()
	 * @generated
	 */
	void setCompensator_r_setting_B(String value);

	/**
	 * Returns the value of the '<em><b>Compensator rsetting C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensator rsetting C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensator rsetting C</em>' attribute.
	 * @see #setCompensator_r_setting_C(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Compensator_r_setting_C()
	 * @model
	 * @generated
	 */
	String getCompensator_r_setting_C();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCompensator_r_setting_C <em>Compensator rsetting C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensator rsetting C</em>' attribute.
	 * @see #getCompensator_r_setting_C()
	 * @generated
	 */
	void setCompensator_r_setting_C(String value);

	/**
	 * Returns the value of the '<em><b>Compensator xsetting A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensator xsetting A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensator xsetting A</em>' attribute.
	 * @see #setCompensator_x_setting_A(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Compensator_x_setting_A()
	 * @model
	 * @generated
	 */
	String getCompensator_x_setting_A();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCompensator_x_setting_A <em>Compensator xsetting A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensator xsetting A</em>' attribute.
	 * @see #getCompensator_x_setting_A()
	 * @generated
	 */
	void setCompensator_x_setting_A(String value);

	/**
	 * Returns the value of the '<em><b>Compensator xsetting B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensator xsetting B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensator xsetting B</em>' attribute.
	 * @see #setCompensator_x_setting_B(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Compensator_x_setting_B()
	 * @model
	 * @generated
	 */
	String getCompensator_x_setting_B();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCompensator_x_setting_B <em>Compensator xsetting B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensator xsetting B</em>' attribute.
	 * @see #getCompensator_x_setting_B()
	 * @generated
	 */
	void setCompensator_x_setting_B(String value);

	/**
	 * Returns the value of the '<em><b>Compensator xsetting C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compensator xsetting C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compensator xsetting C</em>' attribute.
	 * @see #setCompensator_x_setting_C(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Compensator_x_setting_C()
	 * @model
	 * @generated
	 */
	String getCompensator_x_setting_C();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCompensator_x_setting_C <em>Compensator xsetting C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compensator xsetting C</em>' attribute.
	 * @see #getCompensator_x_setting_C()
	 * @generated
	 */
	void setCompensator_x_setting_C(String value);

	/**
	 * Returns the value of the '<em><b>CT phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CT phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CT phase</em>' attribute.
	 * @see #setCT_phase(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_CT_phase()
	 * @model
	 * @generated
	 */
	String getCT_phase();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getCT_phase <em>CT phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CT phase</em>' attribute.
	 * @see #getCT_phase()
	 * @generated
	 */
	void setCT_phase(String value);

	/**
	 * Returns the value of the '<em><b>PT phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PT phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT phase</em>' attribute.
	 * @see #setPT_phase(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_PT_phase()
	 * @model
	 * @generated
	 */
	String getPT_phase();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getPT_phase <em>PT phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT phase</em>' attribute.
	 * @see #getPT_phase()
	 * @generated
	 */
	void setPT_phase(String value);

	/**
	 * Returns the value of the '<em><b>Regulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulation</em>' attribute.
	 * @see #setRegulation(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Regulation()
	 * @model
	 * @generated
	 */
	String getRegulation();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getRegulation <em>Regulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulation</em>' attribute.
	 * @see #getRegulation()
	 * @generated
	 */
	void setRegulation(String value);

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
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Control_level()
	 * @model
	 * @generated
	 */
	String getControl_level();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getControl_level <em>Control level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control level</em>' attribute.
	 * @see #getControl_level()
	 * @generated
	 */
	void setControl_level(String value);

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
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Control()
	 * @model
	 * @generated
	 */
	String getControl();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getControl <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' attribute.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(String value);

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
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Tap pos A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap pos A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap pos A</em>' attribute.
	 * @see #setTap_pos_A(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Tap_pos_A()
	 * @model
	 * @generated
	 */
	String getTap_pos_A();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getTap_pos_A <em>Tap pos A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap pos A</em>' attribute.
	 * @see #getTap_pos_A()
	 * @generated
	 */
	void setTap_pos_A(String value);

	/**
	 * Returns the value of the '<em><b>Tap pos B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap pos B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap pos B</em>' attribute.
	 * @see #setTap_pos_B(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Tap_pos_B()
	 * @model
	 * @generated
	 */
	String getTap_pos_B();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getTap_pos_B <em>Tap pos B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap pos B</em>' attribute.
	 * @see #getTap_pos_B()
	 * @generated
	 */
	void setTap_pos_B(String value);

	/**
	 * Returns the value of the '<em><b>Tap pos C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tap pos C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tap pos C</em>' attribute.
	 * @see #setTap_pos_C(String)
	 * @see visGrid.VisGridPackage#getRegulator_configuration_Tap_pos_C()
	 * @model
	 * @generated
	 */
	String getTap_pos_C();

	/**
	 * Sets the value of the '{@link visGrid.Regulator_configuration#getTap_pos_C <em>Tap pos C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tap pos C</em>' attribute.
	 * @see #getTap_pos_C()
	 * @generated
	 */
	void setTap_pos_C(String value);

} // Regulator_configuration
