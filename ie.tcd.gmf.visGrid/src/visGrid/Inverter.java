/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inverter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Inverter#getInverter_type <em>Inverter type</em>}</li>
 *   <li>{@link visGrid.Inverter#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.Inverter#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.Inverter#getV_In <em>VIn</em>}</li>
 *   <li>{@link visGrid.Inverter#getI_In <em>IIn</em>}</li>
 *   <li>{@link visGrid.Inverter#getVA_In <em>VA In</em>}</li>
 *   <li>{@link visGrid.Inverter#getVdc <em>Vdc</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhaseA_V_Out <em>Phase AVOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhaseB_V_Out <em>Phase BVOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhaseC_V_Out <em>Phase CVOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhaseA_I_Out <em>Phase AIOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhaseB_I_Out <em>Phase BIOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhaseC_I_Out <em>Phase CIOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.Inverter#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.Inverter#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.Inverter#getP_Out <em>POut</em>}</li>
 *   <li>{@link visGrid.Inverter#getQ_Out <em>QOut</em>}</li>
 *   <li>{@link visGrid.Inverter#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.Inverter#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getInverter()
 * @model
 * @generated
 */
public interface Inverter extends Connection {
	/**
	 * Returns the value of the '<em><b>Inverter type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverter type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverter type</em>' attribute.
	 * @see #setInverter_type(String)
	 * @see visGrid.VisGridPackage#getInverter_Inverter_type()
	 * @model
	 * @generated
	 */
	String getInverter_type();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getInverter_type <em>Inverter type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverter type</em>' attribute.
	 * @see #getInverter_type()
	 * @generated
	 */
	void setInverter_type(String value);

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
	 * @see visGrid.VisGridPackage#getInverter_Generator_status()
	 * @model
	 * @generated
	 */
	String getGenerator_status();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getGenerator_status <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator status</em>' attribute.
	 * @see #getGenerator_status()
	 * @generated
	 */
	void setGenerator_status(String value);

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
	 * @see visGrid.VisGridPackage#getInverter_Generator_mode()
	 * @model
	 * @generated
	 */
	String getGenerator_mode();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getGenerator_mode <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator mode</em>' attribute.
	 * @see #getGenerator_mode()
	 * @generated
	 */
	void setGenerator_mode(String value);

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
	 * @see visGrid.VisGridPackage#getInverter_V_In()
	 * @model
	 * @generated
	 */
	String getV_In();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getV_In <em>VIn</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getInverter_I_In()
	 * @model
	 * @generated
	 */
	String getI_In();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getI_In <em>IIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IIn</em>' attribute.
	 * @see #getI_In()
	 * @generated
	 */
	void setI_In(String value);

	/**
	 * Returns the value of the '<em><b>VA In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VA In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VA In</em>' attribute.
	 * @see #setVA_In(String)
	 * @see visGrid.VisGridPackage#getInverter_VA_In()
	 * @model
	 * @generated
	 */
	String getVA_In();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getVA_In <em>VA In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA In</em>' attribute.
	 * @see #getVA_In()
	 * @generated
	 */
	void setVA_In(String value);

	/**
	 * Returns the value of the '<em><b>Vdc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vdc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vdc</em>' attribute.
	 * @see #setVdc(String)
	 * @see visGrid.VisGridPackage#getInverter_Vdc()
	 * @model
	 * @generated
	 */
	String getVdc();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getVdc <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vdc</em>' attribute.
	 * @see #getVdc()
	 * @generated
	 */
	void setVdc(String value);

	/**
	 * Returns the value of the '<em><b>Phase AVOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase AVOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase AVOut</em>' attribute.
	 * @see #setPhaseA_V_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_PhaseA_V_Out()
	 * @model
	 * @generated
	 */
	String getPhaseA_V_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhaseA_V_Out <em>Phase AVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase AVOut</em>' attribute.
	 * @see #getPhaseA_V_Out()
	 * @generated
	 */
	void setPhaseA_V_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase BVOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase BVOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase BVOut</em>' attribute.
	 * @see #setPhaseB_V_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_PhaseB_V_Out()
	 * @model
	 * @generated
	 */
	String getPhaseB_V_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhaseB_V_Out <em>Phase BVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase BVOut</em>' attribute.
	 * @see #getPhaseB_V_Out()
	 * @generated
	 */
	void setPhaseB_V_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase CVOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase CVOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase CVOut</em>' attribute.
	 * @see #setPhaseC_V_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_PhaseC_V_Out()
	 * @model
	 * @generated
	 */
	String getPhaseC_V_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhaseC_V_Out <em>Phase CVOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase CVOut</em>' attribute.
	 * @see #getPhaseC_V_Out()
	 * @generated
	 */
	void setPhaseC_V_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase AIOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase AIOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase AIOut</em>' attribute.
	 * @see #setPhaseA_I_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_PhaseA_I_Out()
	 * @model
	 * @generated
	 */
	String getPhaseA_I_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhaseA_I_Out <em>Phase AIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase AIOut</em>' attribute.
	 * @see #getPhaseA_I_Out()
	 * @generated
	 */
	void setPhaseA_I_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase BIOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase BIOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase BIOut</em>' attribute.
	 * @see #setPhaseB_I_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_PhaseB_I_Out()
	 * @model
	 * @generated
	 */
	String getPhaseB_I_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhaseB_I_Out <em>Phase BIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase BIOut</em>' attribute.
	 * @see #getPhaseB_I_Out()
	 * @generated
	 */
	void setPhaseB_I_Out(String value);

	/**
	 * Returns the value of the '<em><b>Phase CIOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase CIOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase CIOut</em>' attribute.
	 * @see #setPhaseC_I_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_PhaseC_I_Out()
	 * @model
	 * @generated
	 */
	String getPhaseC_I_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhaseC_I_Out <em>Phase CIOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase CIOut</em>' attribute.
	 * @see #getPhaseC_I_Out()
	 * @generated
	 */
	void setPhaseC_I_Out(String value);

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
	 * @see visGrid.VisGridPackage#getInverter_Power_A()
	 * @model
	 * @generated
	 */
	String getPower_A();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPower_A <em>Power A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getInverter_Power_B()
	 * @model
	 * @generated
	 */
	String getPower_B();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPower_B <em>Power B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getInverter_Power_C()
	 * @model
	 * @generated
	 */
	String getPower_C();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPower_C <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power C</em>' attribute.
	 * @see #getPower_C()
	 * @generated
	 */
	void setPower_C(String value);

	/**
	 * Returns the value of the '<em><b>POut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>POut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>POut</em>' attribute.
	 * @see #setP_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_P_Out()
	 * @model
	 * @generated
	 */
	String getP_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getP_Out <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>POut</em>' attribute.
	 * @see #getP_Out()
	 * @generated
	 */
	void setP_Out(String value);

	/**
	 * Returns the value of the '<em><b>QOut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QOut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QOut</em>' attribute.
	 * @see #setQ_Out(String)
	 * @see visGrid.VisGridPackage#getInverter_Q_Out()
	 * @model
	 * @generated
	 */
	String getQ_Out();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getQ_Out <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QOut</em>' attribute.
	 * @see #getQ_Out()
	 * @generated
	 */
	void setQ_Out(String value);

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
	 * @see visGrid.VisGridPackage#getInverter_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPower_factor <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power factor</em>' attribute.
	 * @see #getPower_factor()
	 * @generated
	 */
	void setPower_factor(String value);

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
	 * @see visGrid.VisGridPackage#getInverter_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Inverter#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Inverter
