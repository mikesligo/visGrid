/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Frequency_gen#getFrequency_Mode <em>Frequency Mode</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getFreqChange <em>Freq Change</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getM <em>M</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getD <em>D</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getRated_power <em>Rated power</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getGen_power <em>Gen power</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getLoad_power <em>Load power</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getGov_delay <em>Gov delay</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getRamp_rate <em>Ramp rate</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getLow_Freq_OI <em>Low Freq OI</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getHigh_Freq_OI <em>High Freq OI</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getAvg24 <em>Avg24</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getStd24 <em>Std24</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getAvg168 <em>Avg168</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getStd168 <em>Std168</em>}</li>
 *   <li>{@link visGrid.Frequency_gen#getNum_Resp_Eqs <em>Num Resp Eqs</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getFrequency_gen()
 * @model
 * @generated
 */
public interface Frequency_gen extends Connection {
	/**
	 * Returns the value of the '<em><b>Frequency Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Mode</em>' attribute.
	 * @see #setFrequency_Mode(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Frequency_Mode()
	 * @model
	 * @generated
	 */
	String getFrequency_Mode();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getFrequency_Mode <em>Frequency Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Mode</em>' attribute.
	 * @see #getFrequency_Mode()
	 * @generated
	 */
	void setFrequency_Mode(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Frequency()
	 * @model
	 * @generated
	 */
	String getFrequency();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(String value);

	/**
	 * Returns the value of the '<em><b>Freq Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freq Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq Change</em>' attribute.
	 * @see #setFreqChange(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_FreqChange()
	 * @model
	 * @generated
	 */
	String getFreqChange();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getFreqChange <em>Freq Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq Change</em>' attribute.
	 * @see #getFreqChange()
	 * @generated
	 */
	void setFreqChange(String value);

	/**
	 * Returns the value of the '<em><b>Deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadband</em>' attribute.
	 * @see #setDeadband(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Deadband()
	 * @model
	 * @generated
	 */
	String getDeadband();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getDeadband <em>Deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadband</em>' attribute.
	 * @see #getDeadband()
	 * @generated
	 */
	void setDeadband(String value);

	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Tolerance()
	 * @model
	 * @generated
	 */
	String getTolerance();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(String value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_M()
	 * @model
	 * @generated
	 */
	String getM();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(String value);

	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>Rated power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated power</em>' attribute.
	 * @see #setRated_power(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Rated_power()
	 * @model
	 * @generated
	 */
	String getRated_power();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getRated_power <em>Rated power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated power</em>' attribute.
	 * @see #getRated_power()
	 * @generated
	 */
	void setRated_power(String value);

	/**
	 * Returns the value of the '<em><b>Gen power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen power</em>' attribute.
	 * @see #setGen_power(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Gen_power()
	 * @model
	 * @generated
	 */
	String getGen_power();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getGen_power <em>Gen power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen power</em>' attribute.
	 * @see #getGen_power()
	 * @generated
	 */
	void setGen_power(String value);

	/**
	 * Returns the value of the '<em><b>Load power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load power</em>' attribute.
	 * @see #setLoad_power(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Load_power()
	 * @model
	 * @generated
	 */
	String getLoad_power();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getLoad_power <em>Load power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load power</em>' attribute.
	 * @see #getLoad_power()
	 * @generated
	 */
	void setLoad_power(String value);

	/**
	 * Returns the value of the '<em><b>Gov delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gov delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gov delay</em>' attribute.
	 * @see #setGov_delay(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Gov_delay()
	 * @model
	 * @generated
	 */
	String getGov_delay();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getGov_delay <em>Gov delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gov delay</em>' attribute.
	 * @see #getGov_delay()
	 * @generated
	 */
	void setGov_delay(String value);

	/**
	 * Returns the value of the '<em><b>Ramp rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ramp rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ramp rate</em>' attribute.
	 * @see #setRamp_rate(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Ramp_rate()
	 * @model
	 * @generated
	 */
	String getRamp_rate();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getRamp_rate <em>Ramp rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ramp rate</em>' attribute.
	 * @see #getRamp_rate()
	 * @generated
	 */
	void setRamp_rate(String value);

	/**
	 * Returns the value of the '<em><b>Low Freq OI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Freq OI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Freq OI</em>' attribute.
	 * @see #setLow_Freq_OI(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Low_Freq_OI()
	 * @model
	 * @generated
	 */
	String getLow_Freq_OI();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getLow_Freq_OI <em>Low Freq OI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Freq OI</em>' attribute.
	 * @see #getLow_Freq_OI()
	 * @generated
	 */
	void setLow_Freq_OI(String value);

	/**
	 * Returns the value of the '<em><b>High Freq OI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Freq OI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Freq OI</em>' attribute.
	 * @see #setHigh_Freq_OI(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_High_Freq_OI()
	 * @model
	 * @generated
	 */
	String getHigh_Freq_OI();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getHigh_Freq_OI <em>High Freq OI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Freq OI</em>' attribute.
	 * @see #getHigh_Freq_OI()
	 * @generated
	 */
	void setHigh_Freq_OI(String value);

	/**
	 * Returns the value of the '<em><b>Avg24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg24</em>' attribute.
	 * @see #setAvg24(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Avg24()
	 * @model
	 * @generated
	 */
	String getAvg24();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getAvg24 <em>Avg24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg24</em>' attribute.
	 * @see #getAvg24()
	 * @generated
	 */
	void setAvg24(String value);

	/**
	 * Returns the value of the '<em><b>Std24</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std24</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std24</em>' attribute.
	 * @see #setStd24(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Std24()
	 * @model
	 * @generated
	 */
	String getStd24();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getStd24 <em>Std24</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std24</em>' attribute.
	 * @see #getStd24()
	 * @generated
	 */
	void setStd24(String value);

	/**
	 * Returns the value of the '<em><b>Avg168</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg168</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg168</em>' attribute.
	 * @see #setAvg168(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Avg168()
	 * @model
	 * @generated
	 */
	String getAvg168();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getAvg168 <em>Avg168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg168</em>' attribute.
	 * @see #getAvg168()
	 * @generated
	 */
	void setAvg168(String value);

	/**
	 * Returns the value of the '<em><b>Std168</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std168</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std168</em>' attribute.
	 * @see #setStd168(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Std168()
	 * @model
	 * @generated
	 */
	String getStd168();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getStd168 <em>Std168</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std168</em>' attribute.
	 * @see #getStd168()
	 * @generated
	 */
	void setStd168(String value);

	/**
	 * Returns the value of the '<em><b>Num Resp Eqs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Resp Eqs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Resp Eqs</em>' attribute.
	 * @see #setNum_Resp_Eqs(String)
	 * @see visGrid.VisGridPackage#getFrequency_gen_Num_Resp_Eqs()
	 * @model
	 * @generated
	 */
	String getNum_Resp_Eqs();

	/**
	 * Sets the value of the '{@link visGrid.Frequency_gen#getNum_Resp_Eqs <em>Num Resp Eqs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Resp Eqs</em>' attribute.
	 * @see #getNum_Resp_Eqs()
	 * @generated
	 */
	void setNum_Resp_Eqs(String value);

} // Frequency_gen
