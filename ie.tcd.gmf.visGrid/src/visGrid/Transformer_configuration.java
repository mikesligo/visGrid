/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Transformer_configuration#getConnect_type <em>Connect type</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getInstall_type <em>Install type</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getPrimary_voltage <em>Primary voltage</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getSecondary_voltage <em>Secondary voltage</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getPower_rating <em>Power rating</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getPowerA_rating <em>Power Arating</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getPowerB_rating <em>Power Brating</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getPowerC_rating <em>Power Crating</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getResistance <em>Resistance</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getReactance <em>Reactance</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getImpedance <em>Impedance</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getResistance1 <em>Resistance1</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getReactance1 <em>Reactance1</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getImpedance1 <em>Impedance1</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getResistance2 <em>Resistance2</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getReactance2 <em>Reactance2</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getImpedance2 <em>Impedance2</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getShunt_resistance <em>Shunt resistance</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getShunt_reactance <em>Shunt reactance</em>}</li>
 *   <li>{@link visGrid.Transformer_configuration#getShunt_impedance <em>Shunt impedance</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getTransformer_configuration()
 * @model
 * @generated
 */
public interface Transformer_configuration extends Connection {
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
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Connect_type()
	 * @model
	 * @generated
	 */
	String getConnect_type();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getConnect_type <em>Connect type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect type</em>' attribute.
	 * @see #getConnect_type()
	 * @generated
	 */
	void setConnect_type(String value);

	/**
	 * Returns the value of the '<em><b>Install type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install type</em>' attribute.
	 * @see #setInstall_type(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Install_type()
	 * @model
	 * @generated
	 */
	String getInstall_type();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getInstall_type <em>Install type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install type</em>' attribute.
	 * @see #getInstall_type()
	 * @generated
	 */
	void setInstall_type(String value);

	/**
	 * Returns the value of the '<em><b>Primary voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary voltage</em>' attribute.
	 * @see #setPrimary_voltage(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Primary_voltage()
	 * @model
	 * @generated
	 */
	String getPrimary_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getPrimary_voltage <em>Primary voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary voltage</em>' attribute.
	 * @see #getPrimary_voltage()
	 * @generated
	 */
	void setPrimary_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Secondary voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary voltage</em>' attribute.
	 * @see #setSecondary_voltage(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Secondary_voltage()
	 * @model
	 * @generated
	 */
	String getSecondary_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getSecondary_voltage <em>Secondary voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary voltage</em>' attribute.
	 * @see #getSecondary_voltage()
	 * @generated
	 */
	void setSecondary_voltage(String value);

	/**
	 * Returns the value of the '<em><b>Power rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power rating</em>' attribute.
	 * @see #setPower_rating(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Power_rating()
	 * @model
	 * @generated
	 */
	String getPower_rating();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getPower_rating <em>Power rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power rating</em>' attribute.
	 * @see #getPower_rating()
	 * @generated
	 */
	void setPower_rating(String value);

	/**
	 * Returns the value of the '<em><b>Power Arating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Arating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Arating</em>' attribute.
	 * @see #setPowerA_rating(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_PowerA_rating()
	 * @model
	 * @generated
	 */
	String getPowerA_rating();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getPowerA_rating <em>Power Arating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Arating</em>' attribute.
	 * @see #getPowerA_rating()
	 * @generated
	 */
	void setPowerA_rating(String value);

	/**
	 * Returns the value of the '<em><b>Power Brating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Brating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Brating</em>' attribute.
	 * @see #setPowerB_rating(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_PowerB_rating()
	 * @model
	 * @generated
	 */
	String getPowerB_rating();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getPowerB_rating <em>Power Brating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Brating</em>' attribute.
	 * @see #getPowerB_rating()
	 * @generated
	 */
	void setPowerB_rating(String value);

	/**
	 * Returns the value of the '<em><b>Power Crating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Crating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Crating</em>' attribute.
	 * @see #setPowerC_rating(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_PowerC_rating()
	 * @model
	 * @generated
	 */
	String getPowerC_rating();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getPowerC_rating <em>Power Crating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Crating</em>' attribute.
	 * @see #getPowerC_rating()
	 * @generated
	 */
	void setPowerC_rating(String value);

	/**
	 * Returns the value of the '<em><b>Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance</em>' attribute.
	 * @see #setResistance(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Resistance()
	 * @model
	 * @generated
	 */
	String getResistance();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getResistance <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance</em>' attribute.
	 * @see #getResistance()
	 * @generated
	 */
	void setResistance(String value);

	/**
	 * Returns the value of the '<em><b>Reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactance</em>' attribute.
	 * @see #setReactance(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Reactance()
	 * @model
	 * @generated
	 */
	String getReactance();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getReactance <em>Reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactance</em>' attribute.
	 * @see #getReactance()
	 * @generated
	 */
	void setReactance(String value);

	/**
	 * Returns the value of the '<em><b>Impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance</em>' attribute.
	 * @see #setImpedance(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Impedance()
	 * @model
	 * @generated
	 */
	String getImpedance();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getImpedance <em>Impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance</em>' attribute.
	 * @see #getImpedance()
	 * @generated
	 */
	void setImpedance(String value);

	/**
	 * Returns the value of the '<em><b>Resistance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resistance1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance1</em>' attribute.
	 * @see #setResistance1(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Resistance1()
	 * @model
	 * @generated
	 */
	String getResistance1();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getResistance1 <em>Resistance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance1</em>' attribute.
	 * @see #getResistance1()
	 * @generated
	 */
	void setResistance1(String value);

	/**
	 * Returns the value of the '<em><b>Reactance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactance1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactance1</em>' attribute.
	 * @see #setReactance1(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Reactance1()
	 * @model
	 * @generated
	 */
	String getReactance1();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getReactance1 <em>Reactance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactance1</em>' attribute.
	 * @see #getReactance1()
	 * @generated
	 */
	void setReactance1(String value);

	/**
	 * Returns the value of the '<em><b>Impedance1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance1</em>' attribute.
	 * @see #setImpedance1(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Impedance1()
	 * @model
	 * @generated
	 */
	String getImpedance1();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getImpedance1 <em>Impedance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance1</em>' attribute.
	 * @see #getImpedance1()
	 * @generated
	 */
	void setImpedance1(String value);

	/**
	 * Returns the value of the '<em><b>Resistance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resistance2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance2</em>' attribute.
	 * @see #setResistance2(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Resistance2()
	 * @model
	 * @generated
	 */
	String getResistance2();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getResistance2 <em>Resistance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance2</em>' attribute.
	 * @see #getResistance2()
	 * @generated
	 */
	void setResistance2(String value);

	/**
	 * Returns the value of the '<em><b>Reactance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactance2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactance2</em>' attribute.
	 * @see #setReactance2(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Reactance2()
	 * @model
	 * @generated
	 */
	String getReactance2();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getReactance2 <em>Reactance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactance2</em>' attribute.
	 * @see #getReactance2()
	 * @generated
	 */
	void setReactance2(String value);

	/**
	 * Returns the value of the '<em><b>Impedance2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance2</em>' attribute.
	 * @see #setImpedance2(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Impedance2()
	 * @model
	 * @generated
	 */
	String getImpedance2();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getImpedance2 <em>Impedance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance2</em>' attribute.
	 * @see #getImpedance2()
	 * @generated
	 */
	void setImpedance2(String value);

	/**
	 * Returns the value of the '<em><b>Shunt resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt resistance</em>' attribute.
	 * @see #setShunt_resistance(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Shunt_resistance()
	 * @model
	 * @generated
	 */
	String getShunt_resistance();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getShunt_resistance <em>Shunt resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt resistance</em>' attribute.
	 * @see #getShunt_resistance()
	 * @generated
	 */
	void setShunt_resistance(String value);

	/**
	 * Returns the value of the '<em><b>Shunt reactance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt reactance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt reactance</em>' attribute.
	 * @see #setShunt_reactance(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Shunt_reactance()
	 * @model
	 * @generated
	 */
	String getShunt_reactance();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getShunt_reactance <em>Shunt reactance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt reactance</em>' attribute.
	 * @see #getShunt_reactance()
	 * @generated
	 */
	void setShunt_reactance(String value);

	/**
	 * Returns the value of the '<em><b>Shunt impedance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt impedance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt impedance</em>' attribute.
	 * @see #setShunt_impedance(String)
	 * @see visGrid.VisGridPackage#getTransformer_configuration_Shunt_impedance()
	 * @model
	 * @generated
	 */
	String getShunt_impedance();

	/**
	 * Sets the value of the '{@link visGrid.Transformer_configuration#getShunt_impedance <em>Shunt impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt impedance</em>' attribute.
	 * @see #getShunt_impedance()
	 * @generated
	 */
	void setShunt_impedance(String value);

} // Transformer_configuration
