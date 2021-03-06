/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZI Pload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.ZIPload#getHeat_fraction <em>Heat fraction</em>}</li>
 *   <li>{@link visGrid.ZIPload#getBase_power <em>Base power</em>}</li>
 *   <li>{@link visGrid.ZIPload#getPower_pf <em>Power pf</em>}</li>
 *   <li>{@link visGrid.ZIPload#getCurrent_pf <em>Current pf</em>}</li>
 *   <li>{@link visGrid.ZIPload#getImpedance_pf <em>Impedance pf</em>}</li>
 *   <li>{@link visGrid.ZIPload#getIs_240 <em>Is 240</em>}</li>
 *   <li>{@link visGrid.ZIPload#getBreaker_val <em>Breaker val</em>}</li>
 *   <li>{@link visGrid.ZIPload#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.ZIPload#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.ZIPload#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.ZIPload#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.ZIPload#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.ZIPload#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.ZIPload#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.ZIPload#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.ZIPload#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.ZIPload#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.ZIPload#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.ZIPload#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.ZIPload#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.ZIPload#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.ZIPload#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.ZIPload#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.ZIPload#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getZIPload()
 * @model
 * @generated
 */
public interface ZIPload extends Connection {
	/**
	 * Returns the value of the '<em><b>Heat fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat fraction</em>' attribute.
	 * @see #setHeat_fraction(String)
	 * @see visGrid.VisGridPackage#getZIPload_Heat_fraction()
	 * @model
	 * @generated
	 */
	String getHeat_fraction();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getHeat_fraction <em>Heat fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat fraction</em>' attribute.
	 * @see #getHeat_fraction()
	 * @generated
	 */
	void setHeat_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Base power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base power</em>' attribute.
	 * @see #setBase_power(String)
	 * @see visGrid.VisGridPackage#getZIPload_Base_power()
	 * @model
	 * @generated
	 */
	String getBase_power();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getBase_power <em>Base power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base power</em>' attribute.
	 * @see #getBase_power()
	 * @generated
	 */
	void setBase_power(String value);

	/**
	 * Returns the value of the '<em><b>Power pf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power pf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power pf</em>' attribute.
	 * @see #setPower_pf(String)
	 * @see visGrid.VisGridPackage#getZIPload_Power_pf()
	 * @model
	 * @generated
	 */
	String getPower_pf();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getPower_pf <em>Power pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power pf</em>' attribute.
	 * @see #getPower_pf()
	 * @generated
	 */
	void setPower_pf(String value);

	/**
	 * Returns the value of the '<em><b>Current pf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current pf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current pf</em>' attribute.
	 * @see #setCurrent_pf(String)
	 * @see visGrid.VisGridPackage#getZIPload_Current_pf()
	 * @model
	 * @generated
	 */
	String getCurrent_pf();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getCurrent_pf <em>Current pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current pf</em>' attribute.
	 * @see #getCurrent_pf()
	 * @generated
	 */
	void setCurrent_pf(String value);

	/**
	 * Returns the value of the '<em><b>Impedance pf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance pf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance pf</em>' attribute.
	 * @see #setImpedance_pf(String)
	 * @see visGrid.VisGridPackage#getZIPload_Impedance_pf()
	 * @model
	 * @generated
	 */
	String getImpedance_pf();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getImpedance_pf <em>Impedance pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance pf</em>' attribute.
	 * @see #getImpedance_pf()
	 * @generated
	 */
	void setImpedance_pf(String value);

	/**
	 * Returns the value of the '<em><b>Is 240</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is 240</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is 240</em>' attribute.
	 * @see #setIs_240(String)
	 * @see visGrid.VisGridPackage#getZIPload_Is_240()
	 * @model
	 * @generated
	 */
	String getIs_240();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getIs_240 <em>Is 240</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is 240</em>' attribute.
	 * @see #getIs_240()
	 * @generated
	 */
	void setIs_240(String value);

	/**
	 * Returns the value of the '<em><b>Breaker val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breaker val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breaker val</em>' attribute.
	 * @see #setBreaker_val(String)
	 * @see visGrid.VisGridPackage#getZIPload_Breaker_val()
	 * @model
	 * @generated
	 */
	String getBreaker_val();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getBreaker_val <em>Breaker val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breaker val</em>' attribute.
	 * @see #getBreaker_val()
	 * @generated
	 */
	void setBreaker_val(String value);

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
	 * @see visGrid.VisGridPackage#getZIPload_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getShape <em>Shape</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getLoad <em>Load</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getEnergy <em>Energy</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getPower <em>Power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Peak_demand()
	 * @model
	 * @generated
	 */
	String getPeak_demand();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getPeak_demand <em>Peak demand</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Heatgain()
	 * @model
	 * @generated
	 */
	String getHeatgain();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getHeatgain <em>Heatgain</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHeatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getHeatgain_fraction <em>Heatgain fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Current_fraction()
	 * @model
	 * @generated
	 */
	String getCurrent_fraction();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getCurrent_fraction <em>Current fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Impedance_fraction()
	 * @model
	 * @generated
	 */
	String getImpedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getImpedance_fraction <em>Impedance fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Power_fraction()
	 * @model
	 * @generated
	 */
	String getPower_fraction();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getPower_fraction <em>Power fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getPower_factor <em>Power factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Constant_power()
	 * @model
	 * @generated
	 */
	String getConstant_power();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getConstant_power <em>Constant power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Constant_current()
	 * @model
	 * @generated
	 */
	String getConstant_current();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getConstant_current <em>Constant current</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Constant_admittance()
	 * @model
	 * @generated
	 */
	String getConstant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getConstant_admittance <em>Constant admittance</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Voltage_factor()
	 * @model
	 * @generated
	 */
	String getVoltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getVoltage_factor <em>Voltage factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getConfiguration <em>Configuration</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getZIPload_Override()
	 * @model
	 * @generated
	 */
	String getOverride();

	/**
	 * Sets the value of the '{@link visGrid.ZIPload#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(String value);

} // ZIPload
