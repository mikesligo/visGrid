/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Windturb dg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Windturb_dg#getGen_status <em>Gen status</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getGen_type <em>Gen type</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getGen_mode <em>Gen mode</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getTurbine_Model <em>Turbine Model</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getRated_VA <em>Rated VA</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getRated_V <em>Rated V</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getPconv <em>Pconv</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getWSadj <em>WSadj</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getWind_Speed <em>Wind Speed</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getPf <em>Pf</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getGenElecEff <em>Gen Elec Eff</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getTotalRealPow <em>Total Real Pow</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getTotalReacPow <em>Total Reac Pow</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getEfA <em>Ef A</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getEfB <em>Ef B</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getEfC <em>Ef C</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getVrotor_A <em>Vrotor A</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getVrotor_B <em>Vrotor B</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getVrotor_C <em>Vrotor C</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getIrotor_A <em>Irotor A</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getIrotor_B <em>Irotor B</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getIrotor_C <em>Irotor C</em>}</li>
 *   <li>{@link visGrid.Windturb_dg#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getWindturb_dg()
 * @model
 * @generated
 */
public interface Windturb_dg extends Connection {
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Gen_status()
	 * @model
	 * @generated
	 */
	String getGen_status();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getGen_status <em>Gen status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen status</em>' attribute.
	 * @see #getGen_status()
	 * @generated
	 */
	void setGen_status(String value);

	/**
	 * Returns the value of the '<em><b>Gen type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen type</em>' attribute.
	 * @see #setGen_type(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Gen_type()
	 * @model
	 * @generated
	 */
	String getGen_type();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getGen_type <em>Gen type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen type</em>' attribute.
	 * @see #getGen_type()
	 * @generated
	 */
	void setGen_type(String value);

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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Gen_mode()
	 * @model
	 * @generated
	 */
	String getGen_mode();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getGen_mode <em>Gen mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen mode</em>' attribute.
	 * @see #getGen_mode()
	 * @generated
	 */
	void setGen_mode(String value);

	/**
	 * Returns the value of the '<em><b>Turbine Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turbine Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turbine Model</em>' attribute.
	 * @see #setTurbine_Model(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Turbine_Model()
	 * @model
	 * @generated
	 */
	String getTurbine_Model();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getTurbine_Model <em>Turbine Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbine Model</em>' attribute.
	 * @see #getTurbine_Model()
	 * @generated
	 */
	void setTurbine_Model(String value);

	/**
	 * Returns the value of the '<em><b>Rated VA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated VA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated VA</em>' attribute.
	 * @see #setRated_VA(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Rated_VA()
	 * @model
	 * @generated
	 */
	String getRated_VA();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getRated_VA <em>Rated VA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated VA</em>' attribute.
	 * @see #getRated_VA()
	 * @generated
	 */
	void setRated_VA(String value);

	/**
	 * Returns the value of the '<em><b>Rated V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated V</em>' attribute.
	 * @see #setRated_V(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Rated_V()
	 * @model
	 * @generated
	 */
	String getRated_V();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getRated_V <em>Rated V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated V</em>' attribute.
	 * @see #getRated_V()
	 * @generated
	 */
	void setRated_V(String value);

	/**
	 * Returns the value of the '<em><b>Pconv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pconv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pconv</em>' attribute.
	 * @see #setPconv(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Pconv()
	 * @model
	 * @generated
	 */
	String getPconv();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getPconv <em>Pconv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pconv</em>' attribute.
	 * @see #getPconv()
	 * @generated
	 */
	void setPconv(String value);

	/**
	 * Returns the value of the '<em><b>WSadj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WSadj</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WSadj</em>' attribute.
	 * @see #setWSadj(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_WSadj()
	 * @model
	 * @generated
	 */
	String getWSadj();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getWSadj <em>WSadj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WSadj</em>' attribute.
	 * @see #getWSadj()
	 * @generated
	 */
	void setWSadj(String value);

	/**
	 * Returns the value of the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wind Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind Speed</em>' attribute.
	 * @see #setWind_Speed(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Wind_Speed()
	 * @model
	 * @generated
	 */
	String getWind_Speed();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getWind_Speed <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind Speed</em>' attribute.
	 * @see #getWind_Speed()
	 * @generated
	 */
	void setWind_Speed(String value);

	/**
	 * Returns the value of the '<em><b>Pf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pf</em>' attribute.
	 * @see #setPf(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Pf()
	 * @model
	 * @generated
	 */
	String getPf();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getPf <em>Pf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pf</em>' attribute.
	 * @see #getPf()
	 * @generated
	 */
	void setPf(String value);

	/**
	 * Returns the value of the '<em><b>Gen Elec Eff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Elec Eff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Elec Eff</em>' attribute.
	 * @see #setGenElecEff(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_GenElecEff()
	 * @model
	 * @generated
	 */
	String getGenElecEff();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getGenElecEff <em>Gen Elec Eff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Elec Eff</em>' attribute.
	 * @see #getGenElecEff()
	 * @generated
	 */
	void setGenElecEff(String value);

	/**
	 * Returns the value of the '<em><b>Total Real Pow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Real Pow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Real Pow</em>' attribute.
	 * @see #setTotalRealPow(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_TotalRealPow()
	 * @model
	 * @generated
	 */
	String getTotalRealPow();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getTotalRealPow <em>Total Real Pow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Real Pow</em>' attribute.
	 * @see #getTotalRealPow()
	 * @generated
	 */
	void setTotalRealPow(String value);

	/**
	 * Returns the value of the '<em><b>Total Reac Pow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Reac Pow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Reac Pow</em>' attribute.
	 * @see #setTotalReacPow(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_TotalReacPow()
	 * @model
	 * @generated
	 */
	String getTotalReacPow();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getTotalReacPow <em>Total Reac Pow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Reac Pow</em>' attribute.
	 * @see #getTotalReacPow()
	 * @generated
	 */
	void setTotalReacPow(String value);

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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Voltage_A()
	 * @model
	 * @generated
	 */
	String getVoltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getVoltage_A <em>Voltage A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Voltage_B()
	 * @model
	 * @generated
	 */
	String getVoltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getVoltage_B <em>Voltage B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Voltage_C()
	 * @model
	 * @generated
	 */
	String getVoltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getVoltage_C <em>Voltage C</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Current_A()
	 * @model
	 * @generated
	 */
	String getCurrent_A();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getCurrent_A <em>Current A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Current_B()
	 * @model
	 * @generated
	 */
	String getCurrent_B();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getCurrent_B <em>Current B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Current_C()
	 * @model
	 * @generated
	 */
	String getCurrent_C();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getCurrent_C <em>Current C</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_EfA()
	 * @model
	 * @generated
	 */
	String getEfA();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getEfA <em>Ef A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_EfB()
	 * @model
	 * @generated
	 */
	String getEfB();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getEfB <em>Ef B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWindturb_dg_EfC()
	 * @model
	 * @generated
	 */
	String getEfC();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getEfC <em>Ef C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ef C</em>' attribute.
	 * @see #getEfC()
	 * @generated
	 */
	void setEfC(String value);

	/**
	 * Returns the value of the '<em><b>Vrotor A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vrotor A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vrotor A</em>' attribute.
	 * @see #setVrotor_A(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Vrotor_A()
	 * @model
	 * @generated
	 */
	String getVrotor_A();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getVrotor_A <em>Vrotor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vrotor A</em>' attribute.
	 * @see #getVrotor_A()
	 * @generated
	 */
	void setVrotor_A(String value);

	/**
	 * Returns the value of the '<em><b>Vrotor B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vrotor B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vrotor B</em>' attribute.
	 * @see #setVrotor_B(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Vrotor_B()
	 * @model
	 * @generated
	 */
	String getVrotor_B();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getVrotor_B <em>Vrotor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vrotor B</em>' attribute.
	 * @see #getVrotor_B()
	 * @generated
	 */
	void setVrotor_B(String value);

	/**
	 * Returns the value of the '<em><b>Vrotor C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vrotor C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vrotor C</em>' attribute.
	 * @see #setVrotor_C(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Vrotor_C()
	 * @model
	 * @generated
	 */
	String getVrotor_C();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getVrotor_C <em>Vrotor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vrotor C</em>' attribute.
	 * @see #getVrotor_C()
	 * @generated
	 */
	void setVrotor_C(String value);

	/**
	 * Returns the value of the '<em><b>Irotor A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irotor A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irotor A</em>' attribute.
	 * @see #setIrotor_A(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Irotor_A()
	 * @model
	 * @generated
	 */
	String getIrotor_A();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getIrotor_A <em>Irotor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irotor A</em>' attribute.
	 * @see #getIrotor_A()
	 * @generated
	 */
	void setIrotor_A(String value);

	/**
	 * Returns the value of the '<em><b>Irotor B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irotor B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irotor B</em>' attribute.
	 * @see #setIrotor_B(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Irotor_B()
	 * @model
	 * @generated
	 */
	String getIrotor_B();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getIrotor_B <em>Irotor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irotor B</em>' attribute.
	 * @see #getIrotor_B()
	 * @generated
	 */
	void setIrotor_B(String value);

	/**
	 * Returns the value of the '<em><b>Irotor C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irotor C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irotor C</em>' attribute.
	 * @see #setIrotor_C(String)
	 * @see visGrid.VisGridPackage#getWindturb_dg_Irotor_C()
	 * @model
	 * @generated
	 */
	String getIrotor_C();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getIrotor_C <em>Irotor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irotor C</em>' attribute.
	 * @see #getIrotor_C()
	 * @generated
	 */
	void setIrotor_C(String value);

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
	 * @see visGrid.VisGridPackage#getWindturb_dg_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Windturb_dg#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

} // Windturb_dg
