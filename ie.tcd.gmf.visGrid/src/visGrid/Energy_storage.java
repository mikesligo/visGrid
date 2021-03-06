/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Energy_storage#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getI_Max <em>IMax</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getE_Max <em>EMax</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getV_In <em>VIn</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getI_In <em>IIn</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getV_Internal <em>VInternal</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getI_Internal <em>IInternal</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getI_Prev <em>IPrev</em>}</li>
 *   <li>{@link visGrid.Energy_storage#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getEnergy_storage()
 * @model
 * @generated
 */
public interface Energy_storage extends Connection {
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Generator_mode()
	 * @model
	 * @generated
	 */
	String getGenerator_mode();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getGenerator_mode <em>Generator mode</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Generator_status()
	 * @model
	 * @generated
	 */
	String getGenerator_status();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getGenerator_status <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator status</em>' attribute.
	 * @see #getGenerator_status()
	 * @generated
	 */
	void setGenerator_status(String value);

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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Power_type()
	 * @model
	 * @generated
	 */
	String getPower_type();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getPower_type <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power type</em>' attribute.
	 * @see #getPower_type()
	 * @generated
	 */
	void setPower_type(String value);

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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Rinternal()
	 * @model
	 * @generated
	 */
	String getRinternal();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getRinternal <em>Rinternal</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_V_Max()
	 * @model
	 * @generated
	 */
	String getV_Max();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getV_Max <em>VMax</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_I_Max()
	 * @model
	 * @generated
	 */
	String getI_Max();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getI_Max <em>IMax</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_E_Max()
	 * @model
	 * @generated
	 */
	String getE_Max();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getE_Max <em>EMax</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getEnergy <em>Energy</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Efficiency()
	 * @model
	 * @generated
	 */
	String getEfficiency();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(String value);

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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Rated_kVA()
	 * @model
	 * @generated
	 */
	String getRated_kVA();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getRated_kVA <em>Rated kVA</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_V_Out()
	 * @model
	 * @generated
	 */
	String getV_Out();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getV_Out <em>VOut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_I_Out()
	 * @model
	 * @generated
	 */
	String getI_Out();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getI_Out <em>IOut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_VA_Out()
	 * @model
	 * @generated
	 */
	String getVA_Out();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getVA_Out <em>VA Out</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_V_In()
	 * @model
	 * @generated
	 */
	String getV_In();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getV_In <em>VIn</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_I_In()
	 * @model
	 * @generated
	 */
	String getI_In();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getI_In <em>IIn</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_V_Internal()
	 * @model
	 * @generated
	 */
	String getV_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getV_Internal <em>VInternal</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_I_Internal()
	 * @model
	 * @generated
	 */
	String getI_Internal();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getI_Internal <em>IInternal</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_I_Prev()
	 * @model
	 * @generated
	 */
	String getI_Prev();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getI_Prev <em>IPrev</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getEnergy_storage_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Energy_storage#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Energy_storage
