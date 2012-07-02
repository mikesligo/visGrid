/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Node#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.Node#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.Node#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.Node#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.Node#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.Node#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.Node#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.Node#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.Node#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.Node#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.Node#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.Node#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.Node#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.Node#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.Node#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.Node#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.Node#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.Node#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.Node#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.Node#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Node#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Connection {
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
	 * @see visGrid.VisGridPackage#getNode_Bustype()
	 * @model
	 * @generated
	 */
	String getBustype();

	/**
	 * Sets the value of the '{@link visGrid.Node#getBustype <em>Bustype</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Busflags()
	 * @model
	 * @generated
	 */
	String getBusflags();

	/**
	 * Sets the value of the '{@link visGrid.Node#getBusflags <em>Busflags</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Reference_bus()
	 * @model
	 * @generated
	 */
	String getReference_bus();

	/**
	 * Sets the value of the '{@link visGrid.Node#getReference_bus <em>Reference bus</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Maximum_voltage_error()
	 * @model
	 * @generated
	 */
	String getMaximum_voltage_error();

	/**
	 * Sets the value of the '{@link visGrid.Node#getMaximum_voltage_error <em>Maximum voltage error</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Voltage_A()
	 * @model
	 * @generated
	 */
	String getVoltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Node#getVoltage_A <em>Voltage A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Voltage_B()
	 * @model
	 * @generated
	 */
	String getVoltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Node#getVoltage_B <em>Voltage B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Voltage_C()
	 * @model
	 * @generated
	 */
	String getVoltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Node#getVoltage_C <em>Voltage C</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Voltage_AB()
	 * @model
	 * @generated
	 */
	String getVoltage_AB();

	/**
	 * Sets the value of the '{@link visGrid.Node#getVoltage_AB <em>Voltage AB</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Voltage_BC()
	 * @model
	 * @generated
	 */
	String getVoltage_BC();

	/**
	 * Sets the value of the '{@link visGrid.Node#getVoltage_BC <em>Voltage BC</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Voltage_CA()
	 * @model
	 * @generated
	 */
	String getVoltage_CA();

	/**
	 * Sets the value of the '{@link visGrid.Node#getVoltage_CA <em>Voltage CA</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Current_A()
	 * @model
	 * @generated
	 */
	String getCurrent_A();

	/**
	 * Sets the value of the '{@link visGrid.Node#getCurrent_A <em>Current A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Current_B()
	 * @model
	 * @generated
	 */
	String getCurrent_B();

	/**
	 * Sets the value of the '{@link visGrid.Node#getCurrent_B <em>Current B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Current_C()
	 * @model
	 * @generated
	 */
	String getCurrent_C();

	/**
	 * Sets the value of the '{@link visGrid.Node#getCurrent_C <em>Current C</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Power_A()
	 * @model
	 * @generated
	 */
	String getPower_A();

	/**
	 * Sets the value of the '{@link visGrid.Node#getPower_A <em>Power A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Power_B()
	 * @model
	 * @generated
	 */
	String getPower_B();

	/**
	 * Sets the value of the '{@link visGrid.Node#getPower_B <em>Power B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Power_C()
	 * @model
	 * @generated
	 */
	String getPower_C();

	/**
	 * Sets the value of the '{@link visGrid.Node#getPower_C <em>Power C</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Shunt_A()
	 * @model
	 * @generated
	 */
	String getShunt_A();

	/**
	 * Sets the value of the '{@link visGrid.Node#getShunt_A <em>Shunt A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Shunt_B()
	 * @model
	 * @generated
	 */
	String getShunt_B();

	/**
	 * Sets the value of the '{@link visGrid.Node#getShunt_B <em>Shunt B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Shunt_C()
	 * @model
	 * @generated
	 */
	String getShunt_C();

	/**
	 * Sets the value of the '{@link visGrid.Node#getShunt_C <em>Shunt C</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Node#getPhases <em>Phases</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getNode_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Node#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Node
