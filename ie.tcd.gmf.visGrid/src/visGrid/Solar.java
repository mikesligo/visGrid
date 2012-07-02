/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Solar#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.Solar#getGenerator_status <em>Generator status</em>}</li>
 *   <li>{@link visGrid.Solar#getPanel_type <em>Panel type</em>}</li>
 *   <li>{@link visGrid.Solar#getPower_type <em>Power type</em>}</li>
 *   <li>{@link visGrid.Solar#getNoct <em>Noct</em>}</li>
 *   <li>{@link visGrid.Solar#getTcell <em>Tcell</em>}</li>
 *   <li>{@link visGrid.Solar#getTambient <em>Tambient</em>}</li>
 *   <li>{@link visGrid.Solar#getInsolation <em>Insolation</em>}</li>
 *   <li>{@link visGrid.Solar#getRinternal <em>Rinternal</em>}</li>
 *   <li>{@link visGrid.Solar#getRated_Insolation <em>Rated Insolation</em>}</li>
 *   <li>{@link visGrid.Solar#getV_Max <em>VMax</em>}</li>
 *   <li>{@link visGrid.Solar#getVoc_Max <em>Voc Max</em>}</li>
 *   <li>{@link visGrid.Solar#getVoc <em>Voc</em>}</li>
 *   <li>{@link visGrid.Solar#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link visGrid.Solar#getArea <em>Area</em>}</li>
 *   <li>{@link visGrid.Solar#getRated_kVA <em>Rated kVA</em>}</li>
 *   <li>{@link visGrid.Solar#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.Solar#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.Solar#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.Solar#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getSolar()
 * @model
 * @generated
 */
public interface Solar extends Connection {
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
	 * @see visGrid.VisGridPackage#getSolar_Generator_mode()
	 * @model
	 * @generated
	 */
	String getGenerator_mode();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getGenerator_mode <em>Generator mode</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSolar_Generator_status()
	 * @model
	 * @generated
	 */
	String getGenerator_status();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getGenerator_status <em>Generator status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator status</em>' attribute.
	 * @see #getGenerator_status()
	 * @generated
	 */
	void setGenerator_status(String value);

	/**
	 * Returns the value of the '<em><b>Panel type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel type</em>' attribute.
	 * @see #setPanel_type(String)
	 * @see visGrid.VisGridPackage#getSolar_Panel_type()
	 * @model
	 * @generated
	 */
	String getPanel_type();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getPanel_type <em>Panel type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel type</em>' attribute.
	 * @see #getPanel_type()
	 * @generated
	 */
	void setPanel_type(String value);

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
	 * @see visGrid.VisGridPackage#getSolar_Power_type()
	 * @model
	 * @generated
	 */
	String getPower_type();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getPower_type <em>Power type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power type</em>' attribute.
	 * @see #getPower_type()
	 * @generated
	 */
	void setPower_type(String value);

	/**
	 * Returns the value of the '<em><b>Noct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noct</em>' attribute.
	 * @see #setNoct(String)
	 * @see visGrid.VisGridPackage#getSolar_Noct()
	 * @model
	 * @generated
	 */
	String getNoct();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getNoct <em>Noct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noct</em>' attribute.
	 * @see #getNoct()
	 * @generated
	 */
	void setNoct(String value);

	/**
	 * Returns the value of the '<em><b>Tcell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcell</em>' attribute.
	 * @see #setTcell(String)
	 * @see visGrid.VisGridPackage#getSolar_Tcell()
	 * @model
	 * @generated
	 */
	String getTcell();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getTcell <em>Tcell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcell</em>' attribute.
	 * @see #getTcell()
	 * @generated
	 */
	void setTcell(String value);

	/**
	 * Returns the value of the '<em><b>Tambient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tambient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tambient</em>' attribute.
	 * @see #setTambient(String)
	 * @see visGrid.VisGridPackage#getSolar_Tambient()
	 * @model
	 * @generated
	 */
	String getTambient();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getTambient <em>Tambient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tambient</em>' attribute.
	 * @see #getTambient()
	 * @generated
	 */
	void setTambient(String value);

	/**
	 * Returns the value of the '<em><b>Insolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insolation</em>' attribute.
	 * @see #setInsolation(String)
	 * @see visGrid.VisGridPackage#getSolar_Insolation()
	 * @model
	 * @generated
	 */
	String getInsolation();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getInsolation <em>Insolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insolation</em>' attribute.
	 * @see #getInsolation()
	 * @generated
	 */
	void setInsolation(String value);

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
	 * @see visGrid.VisGridPackage#getSolar_Rinternal()
	 * @model
	 * @generated
	 */
	String getRinternal();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getRinternal <em>Rinternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rinternal</em>' attribute.
	 * @see #getRinternal()
	 * @generated
	 */
	void setRinternal(String value);

	/**
	 * Returns the value of the '<em><b>Rated Insolation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Insolation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Insolation</em>' attribute.
	 * @see #setRated_Insolation(String)
	 * @see visGrid.VisGridPackage#getSolar_Rated_Insolation()
	 * @model
	 * @generated
	 */
	String getRated_Insolation();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getRated_Insolation <em>Rated Insolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Insolation</em>' attribute.
	 * @see #getRated_Insolation()
	 * @generated
	 */
	void setRated_Insolation(String value);

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
	 * @see visGrid.VisGridPackage#getSolar_V_Max()
	 * @model
	 * @generated
	 */
	String getV_Max();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getV_Max <em>VMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMax</em>' attribute.
	 * @see #getV_Max()
	 * @generated
	 */
	void setV_Max(String value);

	/**
	 * Returns the value of the '<em><b>Voc Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voc Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voc Max</em>' attribute.
	 * @see #setVoc_Max(String)
	 * @see visGrid.VisGridPackage#getSolar_Voc_Max()
	 * @model
	 * @generated
	 */
	String getVoc_Max();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getVoc_Max <em>Voc Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voc Max</em>' attribute.
	 * @see #getVoc_Max()
	 * @generated
	 */
	void setVoc_Max(String value);

	/**
	 * Returns the value of the '<em><b>Voc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voc</em>' attribute.
	 * @see #setVoc(String)
	 * @see visGrid.VisGridPackage#getSolar_Voc()
	 * @model
	 * @generated
	 */
	String getVoc();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getVoc <em>Voc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voc</em>' attribute.
	 * @see #getVoc()
	 * @generated
	 */
	void setVoc(String value);

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
	 * @see visGrid.VisGridPackage#getSolar_Efficiency()
	 * @model
	 * @generated
	 */
	String getEfficiency();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getEfficiency <em>Efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efficiency</em>' attribute.
	 * @see #getEfficiency()
	 * @generated
	 */
	void setEfficiency(String value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see visGrid.VisGridPackage#getSolar_Area()
	 * @model
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

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
	 * @see visGrid.VisGridPackage#getSolar_Rated_kVA()
	 * @model
	 * @generated
	 */
	String getRated_kVA();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getRated_kVA <em>Rated kVA</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSolar_V_Out()
	 * @model
	 * @generated
	 */
	String getV_Out();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getV_Out <em>VOut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSolar_I_Out()
	 * @model
	 * @generated
	 */
	String getI_Out();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getI_Out <em>IOut</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSolar_VA_Out()
	 * @model
	 * @generated
	 */
	String getVA_Out();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getVA_Out <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VA Out</em>' attribute.
	 * @see #getVA_Out()
	 * @generated
	 */
	void setVA_Out(String value);

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
	 * @see visGrid.VisGridPackage#getSolar_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Solar#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Solar
