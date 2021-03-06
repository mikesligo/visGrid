/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Battery#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.Battery#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.Battery#getRfb_size <em>Rfb size</em>}</li>
 *   <li>{@link visGrid.Battery#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.Battery#getPower_set_high <em>Power set high</em>}</li>
 *   <li>{@link visGrid.Battery#getPower_set_low <em>Power set low</em>}</li>
 *   <li>{@link visGrid.Battery#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.Battery#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.Battery#getI_Max <em>IMax</em>}</li>
 *   <li>{@link visGrid.Battery#getE_Max <em>EMax</em>}</li>
 *   <li>{@link visGrid.Battery#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.Battery#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.Battery#getBase_efficiency <em>Base efficiency</em>}</li>
 *   <li>{@link visGrid.Battery#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.Battery#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.Battery#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.Battery#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.Battery#getV_In <em>VIn</em>}</li>
 *   <li>{@link visGrid.Battery#getI_In <em>IIn</em>}</li>
 *   <li>{@link visGrid.Battery#getV_Internal <em>VInternal</em>}</li>
 *   <li>{@link visGrid.Battery#getI_Internal <em>IInternal</em>}</li>
 *   <li>{@link visGrid.Battery#getI_Prev <em>IPrev</em>}</li>
 *   <li>{@link visGrid.Battery#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getBattery()
 * @model
 * @generated
 */
public interface Battery extends Connection {
	/**
	 * Returns the value of the '<em><b>Generator mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator mode</em>' attribute.
	 * @see #setGenerator_mode(String)
	 * @see visGrid.VisGridPackage#getBattery_Generator_mode()
	 * @model
	 * @generated
	 */
	String getGenerator_mode();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getGenerator_mode <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator mode</em>' attribute.
	 * @see #getGenerator_mode()
	 * @generated
	 */
	void setGenerator_mode(String value);

	/**
	 * Returns the value of the '<em><b>Generator status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator status</em>' attribute.
	 * @see #setGenerator_status(String)
	 * @see visGrid.VisGridPackage#getBattery_Generator_status()
	 * @model
	 * @generated
	 */
	String getGenerator_status();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getGenerator_status <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator status</em>' attribute.
	 * @see #getGenerator_status()
	 * @generated
	 */
	void setGenerator_status(String value);

	/**
	 * Returns the value of the '<em><b>Rfb size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rfb size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rfb size</em>' attribute.
	 * @see #setRfb_size(String)
	 * @see visGrid.VisGridPackage#getBattery_Rfb_size()
	 * @model
	 * @generated
	 */
	String getRfb_size();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getRfb_size <em>Rfb size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rfb size</em>' attribute.
	 * @see #getRfb_size()
	 * @generated
	 */
	void setRfb_size(String value);

	/**
	 * Returns the value of the '<em><b>Power type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power type</em>' attribute.
	 * @see #setPower_type(String)
	 * @see visGrid.VisGridPackage#getBattery_Power_type()
	 * @model
	 * @generated
	 */
	String getPower_type();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getPower_type <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power type</em>' attribute.
	 * @see #getPower_type()
	 * @generated
	 */
	void setPower_type(String value);

	/**
	 * Returns the value of the '<em><b>Power set high</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power set high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power set high</em>' attribute.
	 * @see #setPower_set_high(String)
	 * @see visGrid.VisGridPackage#getBattery_Power_set_high()
	 * @model
	 * @generated
	 */
	String getPower_set_high();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getPower_set_high <em>Power set high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power set high</em>' attribute.
	 * @see #getPower_set_high()
	 * @generated
	 */
	void setPower_set_high(String value);

	/**
	 * Returns the value of the '<em><b>Power set low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power set low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power set low</em>' attribute.
	 * @see #setPower_set_low(String)
	 * @see visGrid.VisGridPackage#getBattery_Power_set_low()
	 * @model
	 * @generated
	 */
	String getPower_set_low();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getPower_set_low <em>Power set low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power set low</em>' attribute.
	 * @see #getPower_set_low()
	 * @generated
	 */
	void setPower_set_low(String value);

	/**
	 * Returns the value of the '<em><b>Rinternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rinternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rinternal</em>' attribute.
	 * @see #setRinternal(String)
	 * @see visGrid.VisGridPackage#getBattery_Rinternal()
	 * @model
	 * @generated
	 */
	String getRinternal();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getRinternal <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rinternal</em>' attribute.
	 * @see #getRinternal()
	 * @generated
	 */
	void setRinternal(String value);

	/**
	 * Returns the value of the '<em><b>VMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VMax</em>' attribute.
	 * @see #setV_Max(String)
	 * @see visGrid.VisGridPackage#getBattery_V_Max()
	 * @model
	 * @generated
	 */
	String getV_Max();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getV_Max <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMax</em>' attribute.
	 * @see #getV_Max()
	 * @generated
	 */
	void setV_Max(String value);

	/**
	 * Returns the value of the '<em><b>IMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IMax</em>' attribute.
	 * @see #setI_Max(String)
	 * @see visGrid.VisGridPackage#getBattery_I_Max()
	 * @model
	 * @generated
	 */
	String getI_Max();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getI_Max <em>IMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IMax</em>' attribute.
	 * @see #getI_Max()
	 * @generated
	 */
	void setI_Max(String value);

	/**
	 * Returns the value of the '<em><b>EMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMax</em>' attribute.
	 * @see #setE_Max(String)
	 * @see visGrid.VisGridPackage#getBattery_E_Max()
	 * @model
	 * @generated
	 */
	String getE_Max();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getE_Max <em>EMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMax</em>' attribute.
	 * @see #getE_Max()
	 * @generated
	 */
	void setE_Max(String value);

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
	 * @see visGrid.VisGridPackage#getBattery_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getEnergy <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy</em>' attribute.
	 * @see #getEnergy()
	 * @generated
	 */
	void setEnergy(String value);

	/**
	 * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efficiency</em>' attribute.
	 * @see #setEfficiency(String)
	 * @see visGrid.VisGridPackage#getBattery_Efficiency()
	 * @model
	 * @generated
	 */
	String getEfficiency();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(String value);

	/**
	 * Returns the value of the '<em><b>Base efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base efficiency</em>' attribute.
	 * @see #setBase_efficiency(String)
	 * @see visGrid.VisGridPackage#getBattery_Base_efficiency()
	 * @model
	 * @generated
	 */
	String getBase_efficiency();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getBase_efficiency <em>Base efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base efficiency</em>' attribute.
	 * @see #getBase_efficiency()
	 * @generated
	 */
	void setBase_efficiency(String value);

	/**
	 * Returns the value of the '<em><b>Rated kVA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated kVA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated kVA</em>' attribute.
	 * @see #setRated_kVA(String)
	 * @see visGrid.VisGridPackage#getBattery_Rated_kVA()
	 * @model
	 * @generated
	 */
	String getRated_kVA();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getRated_kVA <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated kVA</em>' attribute.
	 * @see #getRated_kVA()
	 * @generated
	 */
	void setRated_kVA(String value);

	/**
	 * Returns the value of the '<em><b>VOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VOut</em>' attribute.
	 * @see #setV_Out(String)
	 * @see visGrid.VisGridPackage#getBattery_V_Out()
	 * @model
	 * @generated
	 */
	String getV_Out();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getV_Out <em>VOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VOut</em>' attribute.
	 * @see #getV_Out()
	 * @generated
	 */
	void setV_Out(String value);

	/**
	 * Returns the value of the '<em><b>IOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IOut</em>' attribute.
	 * @see #setI_Out(String)
	 * @see visGrid.VisGridPackage#getBattery_I_Out()
	 * @model
	 * @generated
	 */
	String getI_Out();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getI_Out <em>IOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IOut</em>' attribute.
	 * @see #getI_Out()
	 * @generated
	 */
	void setI_Out(String value);

	/**
	 * Returns the value of the '<em><b>VA Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VA Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA Out</em>' attribute.
	 * @see #setVA_Out(String)
	 * @see visGrid.VisGridPackage#getBattery_VA_Out()
	 * @model
	 * @generated
	 */
	String getVA_Out();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getVA_Out <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA Out</em>' attribute.
	 * @see #getVA_Out()
	 * @generated
	 */
	void setVA_Out(String value);

	/**
	 * Returns the value of the '<em><b>VIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VIn</em>' attribute.
	 * @see #setV_In(String)
	 * @see visGrid.VisGridPackage#getBattery_V_In()
	 * @model
	 * @generated
	 */
	String getV_In();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getV_In <em>VIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIn</em>' attribute.
	 * @see #getV_In()
	 * @generated
	 */
	void setV_In(String value);

	/**
	 * Returns the value of the '<em><b>IIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IIn</em>' attribute.
	 * @see #setI_In(String)
	 * @see visGrid.VisGridPackage#getBattery_I_In()
	 * @model
	 * @generated
	 */
	String getI_In();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getI_In <em>IIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IIn</em>' attribute.
	 * @see #getI_In()
	 * @generated
	 */
	void setI_In(String value);

	/**
	 * Returns the value of the '<em><b>VInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VInternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VInternal</em>' attribute.
	 * @see #setV_Internal(String)
	 * @see visGrid.VisGridPackage#getBattery_V_Internal()
	 * @model
	 * @generated
	 */
	String getV_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getV_Internal <em>VInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VInternal</em>' attribute.
	 * @see #getV_Internal()
	 * @generated
	 */
	void setV_Internal(String value);

	/**
	 * Returns the value of the '<em><b>IInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IInternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IInternal</em>' attribute.
	 * @see #setI_Internal(String)
	 * @see visGrid.VisGridPackage#getBattery_I_Internal()
	 * @model
	 * @generated
	 */
	String getI_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getI_Internal <em>IInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IInternal</em>' attribute.
	 * @see #getI_Internal()
	 * @generated
	 */
	void setI_Internal(String value);

	/**
	 * Returns the value of the '<em><b>IPrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPrev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPrev</em>' attribute.
	 * @see #setI_Prev(String)
	 * @see visGrid.VisGridPackage#getBattery_I_Prev()
	 * @model
	 * @generated
	 */
	String getI_Prev();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getI_Prev <em>IPrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPrev</em>' attribute.
	 * @see #getI_Prev()
	 * @generated
	 */
	void setI_Prev(String value);

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
	 * @see visGrid.VisGridPackage#getBattery_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Battery#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Battery
