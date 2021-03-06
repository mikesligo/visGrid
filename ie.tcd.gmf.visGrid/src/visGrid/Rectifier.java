/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Rectifier#getRectifier_type <em>Rectifier type</em>}</li>
 *   <li>{@link visGrid.Rectifier#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.Rectifier#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.Rectifier#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.Rectifier#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.Rectifier#getP_Out <em>POut</em>}</li>
 *   <li>{@link visGrid.Rectifier#getQ_Out <em>QOut</em>}</li>
 *   <li>{@link visGrid.Rectifier#getVdc <em>Vdc</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhaseA_V_In <em>Phase AVIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhaseB_V_In <em>Phase BVIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhaseC_V_In <em>Phase CVIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhaseA_I_In <em>Phase AIIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhaseB_I_In <em>Phase BIIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhaseC_I_In <em>Phase CIIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPower_A_In <em>Power AIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPower_B_In <em>Power BIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPower_C_In <em>Power CIn</em>}</li>
 *   <li>{@link visGrid.Rectifier#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getRectifier()
 * @model
 * @generated
 */
public interface Rectifier extends Connection {
	/**
	 * Returns the value of the '<em><b>Rectifier type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectifier type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectifier type</em>' attribute.
	 * @see #setRectifier_type(String)
	 * @see visGrid.VisGridPackage#getRectifier_Rectifier_type()
	 * @model
	 * @generated
	 */
	String getRectifier_type();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getRectifier_type <em>Rectifier type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectifier type</em>' attribute.
	 * @see #getRectifier_type()
	 * @generated
	 */
	void setRectifier_type(String value);

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
	 * @see visGrid.VisGridPackage#getRectifier_Generator_mode()
	 * @model
	 * @generated
	 */
	String getGenerator_mode();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getGenerator_mode <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator mode</em>' attribute.
	 * @see #getGenerator_mode()
	 * @generated
	 */
	void setGenerator_mode(String value);

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
	 * @see visGrid.VisGridPackage#getRectifier_V_Out()
	 * @model
	 * @generated
	 */
	String getV_Out();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getV_Out <em>VOut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getRectifier_I_Out()
	 * @model
	 * @generated
	 */
	String getI_Out();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getI_Out <em>IOut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getRectifier_VA_Out()
	 * @model
	 * @generated
	 */
	String getVA_Out();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getVA_Out <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA Out</em>' attribute.
	 * @see #getVA_Out()
	 * @generated
	 */
	void setVA_Out(String value);

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
	 * @see visGrid.VisGridPackage#getRectifier_P_Out()
	 * @model
	 * @generated
	 */
	String getP_Out();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getP_Out <em>POut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getRectifier_Q_Out()
	 * @model
	 * @generated
	 */
	String getQ_Out();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getQ_Out <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QOut</em>' attribute.
	 * @see #getQ_Out()
	 * @generated
	 */
	void setQ_Out(String value);

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
	 * @see visGrid.VisGridPackage#getRectifier_Vdc()
	 * @model
	 * @generated
	 */
	String getVdc();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getVdc <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vdc</em>' attribute.
	 * @see #getVdc()
	 * @generated
	 */
	void setVdc(String value);

	/**
	 * Returns the value of the '<em><b>Phase AVIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase AVIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase AVIn</em>' attribute.
	 * @see #setPhaseA_V_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_PhaseA_V_In()
	 * @model
	 * @generated
	 */
	String getPhaseA_V_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhaseA_V_In <em>Phase AVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase AVIn</em>' attribute.
	 * @see #getPhaseA_V_In()
	 * @generated
	 */
	void setPhaseA_V_In(String value);

	/**
	 * Returns the value of the '<em><b>Phase BVIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase BVIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase BVIn</em>' attribute.
	 * @see #setPhaseB_V_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_PhaseB_V_In()
	 * @model
	 * @generated
	 */
	String getPhaseB_V_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhaseB_V_In <em>Phase BVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase BVIn</em>' attribute.
	 * @see #getPhaseB_V_In()
	 * @generated
	 */
	void setPhaseB_V_In(String value);

	/**
	 * Returns the value of the '<em><b>Phase CVIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase CVIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase CVIn</em>' attribute.
	 * @see #setPhaseC_V_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_PhaseC_V_In()
	 * @model
	 * @generated
	 */
	String getPhaseC_V_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhaseC_V_In <em>Phase CVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase CVIn</em>' attribute.
	 * @see #getPhaseC_V_In()
	 * @generated
	 */
	void setPhaseC_V_In(String value);

	/**
	 * Returns the value of the '<em><b>Phase AIIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase AIIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase AIIn</em>' attribute.
	 * @see #setPhaseA_I_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_PhaseA_I_In()
	 * @model
	 * @generated
	 */
	String getPhaseA_I_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhaseA_I_In <em>Phase AIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase AIIn</em>' attribute.
	 * @see #getPhaseA_I_In()
	 * @generated
	 */
	void setPhaseA_I_In(String value);

	/**
	 * Returns the value of the '<em><b>Phase BIIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase BIIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase BIIn</em>' attribute.
	 * @see #setPhaseB_I_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_PhaseB_I_In()
	 * @model
	 * @generated
	 */
	String getPhaseB_I_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhaseB_I_In <em>Phase BIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase BIIn</em>' attribute.
	 * @see #getPhaseB_I_In()
	 * @generated
	 */
	void setPhaseB_I_In(String value);

	/**
	 * Returns the value of the '<em><b>Phase CIIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase CIIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase CIIn</em>' attribute.
	 * @see #setPhaseC_I_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_PhaseC_I_In()
	 * @model
	 * @generated
	 */
	String getPhaseC_I_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhaseC_I_In <em>Phase CIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase CIIn</em>' attribute.
	 * @see #getPhaseC_I_In()
	 * @generated
	 */
	void setPhaseC_I_In(String value);

	/**
	 * Returns the value of the '<em><b>Power AIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power AIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power AIn</em>' attribute.
	 * @see #setPower_A_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_Power_A_In()
	 * @model
	 * @generated
	 */
	String getPower_A_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPower_A_In <em>Power AIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power AIn</em>' attribute.
	 * @see #getPower_A_In()
	 * @generated
	 */
	void setPower_A_In(String value);

	/**
	 * Returns the value of the '<em><b>Power BIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power BIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power BIn</em>' attribute.
	 * @see #setPower_B_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_Power_B_In()
	 * @model
	 * @generated
	 */
	String getPower_B_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPower_B_In <em>Power BIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power BIn</em>' attribute.
	 * @see #getPower_B_In()
	 * @generated
	 */
	void setPower_B_In(String value);

	/**
	 * Returns the value of the '<em><b>Power CIn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power CIn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power CIn</em>' attribute.
	 * @see #setPower_C_In(String)
	 * @see visGrid.VisGridPackage#getRectifier_Power_C_In()
	 * @model
	 * @generated
	 */
	String getPower_C_In();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPower_C_In <em>Power CIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power CIn</em>' attribute.
	 * @see #getPower_C_In()
	 * @generated
	 */
	void setPower_C_In(String value);

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
	 * @see visGrid.VisGridPackage#getRectifier_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Rectifier#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Rectifier
