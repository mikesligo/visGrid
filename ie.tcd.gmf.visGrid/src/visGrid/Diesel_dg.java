/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diesel dg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Diesel_dg#getGen_mode <em>Gen mode</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getGen_status <em>Gen status</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getRated_kV <em>Rated kV</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getRs <em>Rs</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getXs <em>Xs</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getRg <em>Rg</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getXg <em>Xg</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getEfA <em>Ef A</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getEfB <em>Ef B</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getEfC <em>Ef C</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPower_A_sch <em>Power Asch</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPower_B_sch <em>Power Bsch</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPower_C_sch <em>Power Csch</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getEfA_sch <em>Ef Asch</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getEfB_sch <em>Ef Bsch</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getEfC_sch <em>Ef Csch</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getSlackBus <em>Slack Bus</em>}</li>
 *   <li>{@link visGrid.Diesel_dg#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getDiesel_dg()
 * @model
 * @generated
 */
public interface Diesel_dg extends Connection {
	/**
	 * Returns the value of the '<em><b>Gen mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen mode</em>' attribute.
	 * @see #setGen_mode(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Gen_mode()
	 * @model
	 * @generated
	 */
	String getGen_mode();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getGen_mode <em>Gen mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen mode</em>' attribute.
	 * @see #getGen_mode()
	 * @generated
	 */
	void setGen_mode(String value);

	/**
	 * Returns the value of the '<em><b>Gen status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen status</em>' attribute.
	 * @see #setGen_status(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Gen_status()
	 * @model
	 * @generated
	 */
	String getGen_status();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getGen_status <em>Gen status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen status</em>' attribute.
	 * @see #getGen_status()
	 * @generated
	 */
	void setGen_status(String value);

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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Rated_kVA()
	 * @model
	 * @generated
	 */
	String getRated_kVA();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getRated_kVA <em>Rated kVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated kVA</em>' attribute.
	 * @see #getRated_kVA()
	 * @generated
	 */
	void setRated_kVA(String value);

	/**
	 * Returns the value of the '<em><b>Rated kV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated kV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated kV</em>' attribute.
	 * @see #setRated_kV(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Rated_kV()
	 * @model
	 * @generated
	 */
	String getRated_kV();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getRated_kV <em>Rated kV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated kV</em>' attribute.
	 * @see #getRated_kV()
	 * @generated
	 */
	void setRated_kV(String value);

	/**
	 * Returns the value of the '<em><b>Rs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rs</em>' attribute.
	 * @see #setRs(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Rs()
	 * @model
	 * @generated
	 */
	String getRs();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getRs <em>Rs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rs</em>' attribute.
	 * @see #getRs()
	 * @generated
	 */
	void setRs(String value);

	/**
	 * Returns the value of the '<em><b>Xs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xs</em>' attribute.
	 * @see #setXs(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Xs()
	 * @model
	 * @generated
	 */
	String getXs();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getXs <em>Xs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xs</em>' attribute.
	 * @see #getXs()
	 * @generated
	 */
	void setXs(String value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rg</em>' attribute.
	 * @see #setRg(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Rg()
	 * @model
	 * @generated
	 */
	String getRg();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getRg <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rg</em>' attribute.
	 * @see #getRg()
	 * @generated
	 */
	void setRg(String value);

	/**
	 * Returns the value of the '<em><b>Xg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xg</em>' attribute.
	 * @see #setXg(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Xg()
	 * @model
	 * @generated
	 */
	String getXg();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getXg <em>Xg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xg</em>' attribute.
	 * @see #getXg()
	 * @generated
	 */
	void setXg(String value);

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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Voltage_A()
	 * @model
	 * @generated
	 */
	String getVoltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getVoltage_A <em>Voltage A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Voltage_B()
	 * @model
	 * @generated
	 */
	String getVoltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getVoltage_B <em>Voltage B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Voltage_C()
	 * @model
	 * @generated
	 */
	String getVoltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getVoltage_C <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage C</em>' attribute.
	 * @see #getVoltage_C()
	 * @generated
	 */
	void setVoltage_C(String value);

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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Current_A()
	 * @model
	 * @generated
	 */
	String getCurrent_A();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getCurrent_A <em>Current A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Current_B()
	 * @model
	 * @generated
	 */
	String getCurrent_B();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getCurrent_B <em>Current B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Current_C()
	 * @model
	 * @generated
	 */
	String getCurrent_C();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getCurrent_C <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current C</em>' attribute.
	 * @see #getCurrent_C()
	 * @generated
	 */
	void setCurrent_C(String value);

	/**
	 * Returns the value of the '<em><b>Ef A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ef A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ef A</em>' attribute.
	 * @see #setEfA(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_EfA()
	 * @model
	 * @generated
	 */
	String getEfA();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getEfA <em>Ef A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef A</em>' attribute.
	 * @see #getEfA()
	 * @generated
	 */
	void setEfA(String value);

	/**
	 * Returns the value of the '<em><b>Ef B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ef B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ef B</em>' attribute.
	 * @see #setEfB(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_EfB()
	 * @model
	 * @generated
	 */
	String getEfB();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getEfB <em>Ef B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef B</em>' attribute.
	 * @see #getEfB()
	 * @generated
	 */
	void setEfB(String value);

	/**
	 * Returns the value of the '<em><b>Ef C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ef C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ef C</em>' attribute.
	 * @see #setEfC(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_EfC()
	 * @model
	 * @generated
	 */
	String getEfC();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getEfC <em>Ef C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef C</em>' attribute.
	 * @see #getEfC()
	 * @generated
	 */
	void setEfC(String value);

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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Power_A()
	 * @model
	 * @generated
	 */
	String getPower_A();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPower_A <em>Power A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Power_B()
	 * @model
	 * @generated
	 */
	String getPower_B();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPower_B <em>Power B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Power_C()
	 * @model
	 * @generated
	 */
	String getPower_C();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPower_C <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power C</em>' attribute.
	 * @see #getPower_C()
	 * @generated
	 */
	void setPower_C(String value);

	/**
	 * Returns the value of the '<em><b>Power Asch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Asch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Asch</em>' attribute.
	 * @see #setPower_A_sch(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Power_A_sch()
	 * @model
	 * @generated
	 */
	String getPower_A_sch();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPower_A_sch <em>Power Asch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Asch</em>' attribute.
	 * @see #getPower_A_sch()
	 * @generated
	 */
	void setPower_A_sch(String value);

	/**
	 * Returns the value of the '<em><b>Power Bsch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Bsch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Bsch</em>' attribute.
	 * @see #setPower_B_sch(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Power_B_sch()
	 * @model
	 * @generated
	 */
	String getPower_B_sch();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPower_B_sch <em>Power Bsch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Bsch</em>' attribute.
	 * @see #getPower_B_sch()
	 * @generated
	 */
	void setPower_B_sch(String value);

	/**
	 * Returns the value of the '<em><b>Power Csch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Csch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Csch</em>' attribute.
	 * @see #setPower_C_sch(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_Power_C_sch()
	 * @model
	 * @generated
	 */
	String getPower_C_sch();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPower_C_sch <em>Power Csch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Csch</em>' attribute.
	 * @see #getPower_C_sch()
	 * @generated
	 */
	void setPower_C_sch(String value);

	/**
	 * Returns the value of the '<em><b>Ef Asch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ef Asch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ef Asch</em>' attribute.
	 * @see #setEfA_sch(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_EfA_sch()
	 * @model
	 * @generated
	 */
	String getEfA_sch();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getEfA_sch <em>Ef Asch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef Asch</em>' attribute.
	 * @see #getEfA_sch()
	 * @generated
	 */
	void setEfA_sch(String value);

	/**
	 * Returns the value of the '<em><b>Ef Bsch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ef Bsch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ef Bsch</em>' attribute.
	 * @see #setEfB_sch(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_EfB_sch()
	 * @model
	 * @generated
	 */
	String getEfB_sch();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getEfB_sch <em>Ef Bsch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef Bsch</em>' attribute.
	 * @see #getEfB_sch()
	 * @generated
	 */
	void setEfB_sch(String value);

	/**
	 * Returns the value of the '<em><b>Ef Csch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ef Csch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ef Csch</em>' attribute.
	 * @see #setEfC_sch(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_EfC_sch()
	 * @model
	 * @generated
	 */
	String getEfC_sch();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getEfC_sch <em>Ef Csch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef Csch</em>' attribute.
	 * @see #getEfC_sch()
	 * @generated
	 */
	void setEfC_sch(String value);

	/**
	 * Returns the value of the '<em><b>Slack Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slack Bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slack Bus</em>' attribute.
	 * @see #setSlackBus(String)
	 * @see visGrid.VisGridPackage#getDiesel_dg_SlackBus()
	 * @model
	 * @generated
	 */
	String getSlackBus();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getSlackBus <em>Slack Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slack Bus</em>' attribute.
	 * @see #getSlackBus()
	 * @generated
	 */
	void setSlackBus(String value);

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
	 * @see visGrid.VisGridPackage#getDiesel_dg_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Diesel_dg#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Diesel_dg
