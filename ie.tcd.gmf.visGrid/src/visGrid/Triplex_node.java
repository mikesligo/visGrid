/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triplex node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Triplex_node#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getVoltage_1 <em>Voltage 1</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getVoltage_2 <em>Voltage 2</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getVoltage_N <em>Voltage N</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getVoltage_12 <em>Voltage 12</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getVoltage_1N <em>Voltage 1N</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getVoltage_2N <em>Voltage 2N</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_1 <em>Current 1</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_2 <em>Current 2</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_N <em>Current N</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_1_real <em>Current 1real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_2_real <em>Current 2real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_N_real <em>Current Nreal</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_1_reac <em>Current 1reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_2_reac <em>Current 2reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_N_reac <em>Current Nreac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_12 <em>Current 12</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_12_real <em>Current 12 real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getCurrent_12_reac <em>Current 12 reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_1 <em>Residential nominal current 1</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_2 <em>Residential nominal current 2</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_12 <em>Residential nominal current 12</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_1_real <em>Residential nominal current 1real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_1_imag <em>Residential nominal current 1imag</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_2_real <em>Residential nominal current 2real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_2_imag <em>Residential nominal current 2imag</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_12_real <em>Residential nominal current 12 real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getResidential_nominal_current_12_imag <em>Residential nominal current 12 imag</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_1 <em>Power 1</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_2 <em>Power 2</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_12 <em>Power 12</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_1_real <em>Power 1real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_2_real <em>Power 2real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_12_real <em>Power 12 real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_1_reac <em>Power 1reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_2_reac <em>Power 2reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPower_12_reac <em>Power 12 reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getShunt_1 <em>Shunt 1</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getShunt_2 <em>Shunt 2</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getShunt_12 <em>Shunt 12</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_1 <em>Impedance 1</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_2 <em>Impedance 2</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_12 <em>Impedance 12</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_1_real <em>Impedance 1real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_2_real <em>Impedance 2real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_12_real <em>Impedance 12 real</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_1_reac <em>Impedance 1reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_2_reac <em>Impedance 2reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getImpedance_12_reac <em>Impedance 12 reac</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getHouse_present <em>House present</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getNR_mode <em>NR mode</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Triplex_node#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getTriplex_node()
 * @model
 * @generated
 */
public interface Triplex_node extends Connection {
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
	 * @see visGrid.VisGridPackage#getTriplex_node_Bustype()
	 * @model
	 * @generated
	 */
	String getBustype();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getBustype <em>Bustype</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getTriplex_node_Busflags()
	 * @model
	 * @generated
	 */
	String getBusflags();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getBusflags <em>Busflags</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getTriplex_node_Reference_bus()
	 * @model
	 * @generated
	 */
	String getReference_bus();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getReference_bus <em>Reference bus</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getTriplex_node_Maximum_voltage_error()
	 * @model
	 * @generated
	 */
	String getMaximum_voltage_error();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getMaximum_voltage_error <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum voltage error</em>' attribute.
	 * @see #getMaximum_voltage_error()
	 * @generated
	 */
	void setMaximum_voltage_error(String value);

	/**
	 * Returns the value of the '<em><b>Voltage 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage 1</em>' attribute.
	 * @see #setVoltage_1(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Voltage_1()
	 * @model
	 * @generated
	 */
	String getVoltage_1();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getVoltage_1 <em>Voltage 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage 1</em>' attribute.
	 * @see #getVoltage_1()
	 * @generated
	 */
	void setVoltage_1(String value);

	/**
	 * Returns the value of the '<em><b>Voltage 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage 2</em>' attribute.
	 * @see #setVoltage_2(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Voltage_2()
	 * @model
	 * @generated
	 */
	String getVoltage_2();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getVoltage_2 <em>Voltage 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage 2</em>' attribute.
	 * @see #getVoltage_2()
	 * @generated
	 */
	void setVoltage_2(String value);

	/**
	 * Returns the value of the '<em><b>Voltage N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage N</em>' attribute.
	 * @see #setVoltage_N(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Voltage_N()
	 * @model
	 * @generated
	 */
	String getVoltage_N();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getVoltage_N <em>Voltage N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage N</em>' attribute.
	 * @see #getVoltage_N()
	 * @generated
	 */
	void setVoltage_N(String value);

	/**
	 * Returns the value of the '<em><b>Voltage 12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage 12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage 12</em>' attribute.
	 * @see #setVoltage_12(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Voltage_12()
	 * @model
	 * @generated
	 */
	String getVoltage_12();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getVoltage_12 <em>Voltage 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage 12</em>' attribute.
	 * @see #getVoltage_12()
	 * @generated
	 */
	void setVoltage_12(String value);

	/**
	 * Returns the value of the '<em><b>Voltage 1N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage 1N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage 1N</em>' attribute.
	 * @see #setVoltage_1N(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Voltage_1N()
	 * @model
	 * @generated
	 */
	String getVoltage_1N();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getVoltage_1N <em>Voltage 1N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage 1N</em>' attribute.
	 * @see #getVoltage_1N()
	 * @generated
	 */
	void setVoltage_1N(String value);

	/**
	 * Returns the value of the '<em><b>Voltage 2N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage 2N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage 2N</em>' attribute.
	 * @see #setVoltage_2N(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Voltage_2N()
	 * @model
	 * @generated
	 */
	String getVoltage_2N();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getVoltage_2N <em>Voltage 2N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage 2N</em>' attribute.
	 * @see #getVoltage_2N()
	 * @generated
	 */
	void setVoltage_2N(String value);

	/**
	 * Returns the value of the '<em><b>Current 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 1</em>' attribute.
	 * @see #setCurrent_1(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_1()
	 * @model
	 * @generated
	 */
	String getCurrent_1();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_1 <em>Current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 1</em>' attribute.
	 * @see #getCurrent_1()
	 * @generated
	 */
	void setCurrent_1(String value);

	/**
	 * Returns the value of the '<em><b>Current 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 2</em>' attribute.
	 * @see #setCurrent_2(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_2()
	 * @model
	 * @generated
	 */
	String getCurrent_2();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_2 <em>Current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 2</em>' attribute.
	 * @see #getCurrent_2()
	 * @generated
	 */
	void setCurrent_2(String value);

	/**
	 * Returns the value of the '<em><b>Current N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current N</em>' attribute.
	 * @see #setCurrent_N(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_N()
	 * @model
	 * @generated
	 */
	String getCurrent_N();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_N <em>Current N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current N</em>' attribute.
	 * @see #getCurrent_N()
	 * @generated
	 */
	void setCurrent_N(String value);

	/**
	 * Returns the value of the '<em><b>Current 1real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 1real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 1real</em>' attribute.
	 * @see #setCurrent_1_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_1_real()
	 * @model
	 * @generated
	 */
	String getCurrent_1_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_1_real <em>Current 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 1real</em>' attribute.
	 * @see #getCurrent_1_real()
	 * @generated
	 */
	void setCurrent_1_real(String value);

	/**
	 * Returns the value of the '<em><b>Current 2real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 2real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 2real</em>' attribute.
	 * @see #setCurrent_2_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_2_real()
	 * @model
	 * @generated
	 */
	String getCurrent_2_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_2_real <em>Current 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 2real</em>' attribute.
	 * @see #getCurrent_2_real()
	 * @generated
	 */
	void setCurrent_2_real(String value);

	/**
	 * Returns the value of the '<em><b>Current Nreal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Nreal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Nreal</em>' attribute.
	 * @see #setCurrent_N_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_N_real()
	 * @model
	 * @generated
	 */
	String getCurrent_N_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_N_real <em>Current Nreal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Nreal</em>' attribute.
	 * @see #getCurrent_N_real()
	 * @generated
	 */
	void setCurrent_N_real(String value);

	/**
	 * Returns the value of the '<em><b>Current 1reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 1reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 1reac</em>' attribute.
	 * @see #setCurrent_1_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_1_reac()
	 * @model
	 * @generated
	 */
	String getCurrent_1_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_1_reac <em>Current 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 1reac</em>' attribute.
	 * @see #getCurrent_1_reac()
	 * @generated
	 */
	void setCurrent_1_reac(String value);

	/**
	 * Returns the value of the '<em><b>Current 2reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 2reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 2reac</em>' attribute.
	 * @see #setCurrent_2_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_2_reac()
	 * @model
	 * @generated
	 */
	String getCurrent_2_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_2_reac <em>Current 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 2reac</em>' attribute.
	 * @see #getCurrent_2_reac()
	 * @generated
	 */
	void setCurrent_2_reac(String value);

	/**
	 * Returns the value of the '<em><b>Current Nreac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Nreac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Nreac</em>' attribute.
	 * @see #setCurrent_N_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_N_reac()
	 * @model
	 * @generated
	 */
	String getCurrent_N_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_N_reac <em>Current Nreac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Nreac</em>' attribute.
	 * @see #getCurrent_N_reac()
	 * @generated
	 */
	void setCurrent_N_reac(String value);

	/**
	 * Returns the value of the '<em><b>Current 12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 12</em>' attribute.
	 * @see #setCurrent_12(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_12()
	 * @model
	 * @generated
	 */
	String getCurrent_12();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_12 <em>Current 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 12</em>' attribute.
	 * @see #getCurrent_12()
	 * @generated
	 */
	void setCurrent_12(String value);

	/**
	 * Returns the value of the '<em><b>Current 12 real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 12 real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 12 real</em>' attribute.
	 * @see #setCurrent_12_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_12_real()
	 * @model
	 * @generated
	 */
	String getCurrent_12_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_12_real <em>Current 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 12 real</em>' attribute.
	 * @see #getCurrent_12_real()
	 * @generated
	 */
	void setCurrent_12_real(String value);

	/**
	 * Returns the value of the '<em><b>Current 12 reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current 12 reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current 12 reac</em>' attribute.
	 * @see #setCurrent_12_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Current_12_reac()
	 * @model
	 * @generated
	 */
	String getCurrent_12_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getCurrent_12_reac <em>Current 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current 12 reac</em>' attribute.
	 * @see #getCurrent_12_reac()
	 * @generated
	 */
	void setCurrent_12_reac(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 1</em>' attribute.
	 * @see #setResidential_nominal_current_1(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_1()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_1();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_1 <em>Residential nominal current 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 1</em>' attribute.
	 * @see #getResidential_nominal_current_1()
	 * @generated
	 */
	void setResidential_nominal_current_1(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 2</em>' attribute.
	 * @see #setResidential_nominal_current_2(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_2()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_2();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_2 <em>Residential nominal current 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 2</em>' attribute.
	 * @see #getResidential_nominal_current_2()
	 * @generated
	 */
	void setResidential_nominal_current_2(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 12</em>' attribute.
	 * @see #setResidential_nominal_current_12(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_12()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_12();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_12 <em>Residential nominal current 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 12</em>' attribute.
	 * @see #getResidential_nominal_current_12()
	 * @generated
	 */
	void setResidential_nominal_current_12(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 1real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 1real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 1real</em>' attribute.
	 * @see #setResidential_nominal_current_1_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_1_real()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_1_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_1_real <em>Residential nominal current 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 1real</em>' attribute.
	 * @see #getResidential_nominal_current_1_real()
	 * @generated
	 */
	void setResidential_nominal_current_1_real(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 1imag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 1imag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 1imag</em>' attribute.
	 * @see #setResidential_nominal_current_1_imag(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_1_imag()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_1_imag();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_1_imag <em>Residential nominal current 1imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 1imag</em>' attribute.
	 * @see #getResidential_nominal_current_1_imag()
	 * @generated
	 */
	void setResidential_nominal_current_1_imag(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 2real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 2real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 2real</em>' attribute.
	 * @see #setResidential_nominal_current_2_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_2_real()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_2_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_2_real <em>Residential nominal current 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 2real</em>' attribute.
	 * @see #getResidential_nominal_current_2_real()
	 * @generated
	 */
	void setResidential_nominal_current_2_real(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 2imag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 2imag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 2imag</em>' attribute.
	 * @see #setResidential_nominal_current_2_imag(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_2_imag()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_2_imag();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_2_imag <em>Residential nominal current 2imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 2imag</em>' attribute.
	 * @see #getResidential_nominal_current_2_imag()
	 * @generated
	 */
	void setResidential_nominal_current_2_imag(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 12 real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 12 real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 12 real</em>' attribute.
	 * @see #setResidential_nominal_current_12_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_12_real()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_12_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_12_real <em>Residential nominal current 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 12 real</em>' attribute.
	 * @see #getResidential_nominal_current_12_real()
	 * @generated
	 */
	void setResidential_nominal_current_12_real(String value);

	/**
	 * Returns the value of the '<em><b>Residential nominal current 12 imag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential nominal current 12 imag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential nominal current 12 imag</em>' attribute.
	 * @see #setResidential_nominal_current_12_imag(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Residential_nominal_current_12_imag()
	 * @model
	 * @generated
	 */
	String getResidential_nominal_current_12_imag();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getResidential_nominal_current_12_imag <em>Residential nominal current 12 imag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residential nominal current 12 imag</em>' attribute.
	 * @see #getResidential_nominal_current_12_imag()
	 * @generated
	 */
	void setResidential_nominal_current_12_imag(String value);

	/**
	 * Returns the value of the '<em><b>Power 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 1</em>' attribute.
	 * @see #setPower_1(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_1()
	 * @model
	 * @generated
	 */
	String getPower_1();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_1 <em>Power 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 1</em>' attribute.
	 * @see #getPower_1()
	 * @generated
	 */
	void setPower_1(String value);

	/**
	 * Returns the value of the '<em><b>Power 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 2</em>' attribute.
	 * @see #setPower_2(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_2()
	 * @model
	 * @generated
	 */
	String getPower_2();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_2 <em>Power 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 2</em>' attribute.
	 * @see #getPower_2()
	 * @generated
	 */
	void setPower_2(String value);

	/**
	 * Returns the value of the '<em><b>Power 12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 12</em>' attribute.
	 * @see #setPower_12(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_12()
	 * @model
	 * @generated
	 */
	String getPower_12();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_12 <em>Power 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 12</em>' attribute.
	 * @see #getPower_12()
	 * @generated
	 */
	void setPower_12(String value);

	/**
	 * Returns the value of the '<em><b>Power 1real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 1real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 1real</em>' attribute.
	 * @see #setPower_1_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_1_real()
	 * @model
	 * @generated
	 */
	String getPower_1_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_1_real <em>Power 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 1real</em>' attribute.
	 * @see #getPower_1_real()
	 * @generated
	 */
	void setPower_1_real(String value);

	/**
	 * Returns the value of the '<em><b>Power 2real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 2real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 2real</em>' attribute.
	 * @see #setPower_2_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_2_real()
	 * @model
	 * @generated
	 */
	String getPower_2_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_2_real <em>Power 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 2real</em>' attribute.
	 * @see #getPower_2_real()
	 * @generated
	 */
	void setPower_2_real(String value);

	/**
	 * Returns the value of the '<em><b>Power 12 real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 12 real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 12 real</em>' attribute.
	 * @see #setPower_12_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_12_real()
	 * @model
	 * @generated
	 */
	String getPower_12_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_12_real <em>Power 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 12 real</em>' attribute.
	 * @see #getPower_12_real()
	 * @generated
	 */
	void setPower_12_real(String value);

	/**
	 * Returns the value of the '<em><b>Power 1reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 1reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 1reac</em>' attribute.
	 * @see #setPower_1_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_1_reac()
	 * @model
	 * @generated
	 */
	String getPower_1_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_1_reac <em>Power 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 1reac</em>' attribute.
	 * @see #getPower_1_reac()
	 * @generated
	 */
	void setPower_1_reac(String value);

	/**
	 * Returns the value of the '<em><b>Power 2reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 2reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 2reac</em>' attribute.
	 * @see #setPower_2_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_2_reac()
	 * @model
	 * @generated
	 */
	String getPower_2_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_2_reac <em>Power 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 2reac</em>' attribute.
	 * @see #getPower_2_reac()
	 * @generated
	 */
	void setPower_2_reac(String value);

	/**
	 * Returns the value of the '<em><b>Power 12 reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power 12 reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power 12 reac</em>' attribute.
	 * @see #setPower_12_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Power_12_reac()
	 * @model
	 * @generated
	 */
	String getPower_12_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPower_12_reac <em>Power 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power 12 reac</em>' attribute.
	 * @see #getPower_12_reac()
	 * @generated
	 */
	void setPower_12_reac(String value);

	/**
	 * Returns the value of the '<em><b>Shunt 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt 1</em>' attribute.
	 * @see #setShunt_1(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Shunt_1()
	 * @model
	 * @generated
	 */
	String getShunt_1();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getShunt_1 <em>Shunt 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt 1</em>' attribute.
	 * @see #getShunt_1()
	 * @generated
	 */
	void setShunt_1(String value);

	/**
	 * Returns the value of the '<em><b>Shunt 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt 2</em>' attribute.
	 * @see #setShunt_2(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Shunt_2()
	 * @model
	 * @generated
	 */
	String getShunt_2();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getShunt_2 <em>Shunt 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt 2</em>' attribute.
	 * @see #getShunt_2()
	 * @generated
	 */
	void setShunt_2(String value);

	/**
	 * Returns the value of the '<em><b>Shunt 12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt 12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt 12</em>' attribute.
	 * @see #setShunt_12(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Shunt_12()
	 * @model
	 * @generated
	 */
	String getShunt_12();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getShunt_12 <em>Shunt 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt 12</em>' attribute.
	 * @see #getShunt_12()
	 * @generated
	 */
	void setShunt_12(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 1</em>' attribute.
	 * @see #setImpedance_1(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_1()
	 * @model
	 * @generated
	 */
	String getImpedance_1();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_1 <em>Impedance 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 1</em>' attribute.
	 * @see #getImpedance_1()
	 * @generated
	 */
	void setImpedance_1(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 2</em>' attribute.
	 * @see #setImpedance_2(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_2()
	 * @model
	 * @generated
	 */
	String getImpedance_2();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_2 <em>Impedance 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 2</em>' attribute.
	 * @see #getImpedance_2()
	 * @generated
	 */
	void setImpedance_2(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 12</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 12</em>' attribute.
	 * @see #setImpedance_12(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_12()
	 * @model
	 * @generated
	 */
	String getImpedance_12();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_12 <em>Impedance 12</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 12</em>' attribute.
	 * @see #getImpedance_12()
	 * @generated
	 */
	void setImpedance_12(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 1real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 1real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 1real</em>' attribute.
	 * @see #setImpedance_1_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_1_real()
	 * @model
	 * @generated
	 */
	String getImpedance_1_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_1_real <em>Impedance 1real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 1real</em>' attribute.
	 * @see #getImpedance_1_real()
	 * @generated
	 */
	void setImpedance_1_real(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 2real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 2real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 2real</em>' attribute.
	 * @see #setImpedance_2_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_2_real()
	 * @model
	 * @generated
	 */
	String getImpedance_2_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_2_real <em>Impedance 2real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 2real</em>' attribute.
	 * @see #getImpedance_2_real()
	 * @generated
	 */
	void setImpedance_2_real(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 12 real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 12 real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 12 real</em>' attribute.
	 * @see #setImpedance_12_real(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_12_real()
	 * @model
	 * @generated
	 */
	String getImpedance_12_real();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_12_real <em>Impedance 12 real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 12 real</em>' attribute.
	 * @see #getImpedance_12_real()
	 * @generated
	 */
	void setImpedance_12_real(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 1reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 1reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 1reac</em>' attribute.
	 * @see #setImpedance_1_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_1_reac()
	 * @model
	 * @generated
	 */
	String getImpedance_1_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_1_reac <em>Impedance 1reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 1reac</em>' attribute.
	 * @see #getImpedance_1_reac()
	 * @generated
	 */
	void setImpedance_1_reac(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 2reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 2reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 2reac</em>' attribute.
	 * @see #setImpedance_2_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_2_reac()
	 * @model
	 * @generated
	 */
	String getImpedance_2_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_2_reac <em>Impedance 2reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 2reac</em>' attribute.
	 * @see #getImpedance_2_reac()
	 * @generated
	 */
	void setImpedance_2_reac(String value);

	/**
	 * Returns the value of the '<em><b>Impedance 12 reac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance 12 reac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance 12 reac</em>' attribute.
	 * @see #setImpedance_12_reac(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_Impedance_12_reac()
	 * @model
	 * @generated
	 */
	String getImpedance_12_reac();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getImpedance_12_reac <em>Impedance 12 reac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance 12 reac</em>' attribute.
	 * @see #getImpedance_12_reac()
	 * @generated
	 */
	void setImpedance_12_reac(String value);

	/**
	 * Returns the value of the '<em><b>House present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House present</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House present</em>' attribute.
	 * @see #setHouse_present(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_House_present()
	 * @model
	 * @generated
	 */
	String getHouse_present();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getHouse_present <em>House present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House present</em>' attribute.
	 * @see #getHouse_present()
	 * @generated
	 */
	void setHouse_present(String value);

	/**
	 * Returns the value of the '<em><b>NR mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NR mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NR mode</em>' attribute.
	 * @see #setNR_mode(String)
	 * @see visGrid.VisGridPackage#getTriplex_node_NR_mode()
	 * @model
	 * @generated
	 */
	String getNR_mode();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getNR_mode <em>NR mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NR mode</em>' attribute.
	 * @see #getNR_mode()
	 * @generated
	 */
	void setNR_mode(String value);

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
	 * @see visGrid.VisGridPackage#getTriplex_node_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getPhases <em>Phases</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getTriplex_node_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Triplex_node#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Triplex_node
