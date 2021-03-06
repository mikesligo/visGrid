/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Generator#getPdesired_MW <em>Pdesired MW</em>}</li>
 *   <li>{@link visGrid.Generator#getQdesired_MVAR <em>Qdesired MVAR</em>}</li>
 *   <li>{@link visGrid.Generator#getQcontrolled <em>Qcontrolled</em>}</li>
 *   <li>{@link visGrid.Generator#getPmax_MW <em>Pmax MW</em>}</li>
 *   <li>{@link visGrid.Generator#getQmin_MVAR <em>Qmin MVAR</em>}</li>
 *   <li>{@link visGrid.Generator#getQmax_MVAR <em>Qmax MVAR</em>}</li>
 *   <li>{@link visGrid.Generator#getQVa <em>QVa</em>}</li>
 *   <li>{@link visGrid.Generator#getQVb <em>QVb</em>}</li>
 *   <li>{@link visGrid.Generator#getQVc <em>QVc</em>}</li>
 *   <li>{@link visGrid.Generator#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends Connection {
	/**
	 * Returns the value of the '<em><b>Pdesired MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pdesired MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdesired MW</em>' attribute.
	 * @see #setPdesired_MW(String)
	 * @see visGrid.VisGridPackage#getGenerator_Pdesired_MW()
	 * @model
	 * @generated
	 */
	String getPdesired_MW();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getPdesired_MW <em>Pdesired MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdesired MW</em>' attribute.
	 * @see #getPdesired_MW()
	 * @generated
	 */
	void setPdesired_MW(String value);

	/**
	 * Returns the value of the '<em><b>Qdesired MVAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qdesired MVAR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qdesired MVAR</em>' attribute.
	 * @see #setQdesired_MVAR(String)
	 * @see visGrid.VisGridPackage#getGenerator_Qdesired_MVAR()
	 * @model
	 * @generated
	 */
	String getQdesired_MVAR();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQdesired_MVAR <em>Qdesired MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qdesired MVAR</em>' attribute.
	 * @see #getQdesired_MVAR()
	 * @generated
	 */
	void setQdesired_MVAR(String value);

	/**
	 * Returns the value of the '<em><b>Qcontrolled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qcontrolled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qcontrolled</em>' attribute.
	 * @see #setQcontrolled(String)
	 * @see visGrid.VisGridPackage#getGenerator_Qcontrolled()
	 * @model
	 * @generated
	 */
	String getQcontrolled();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQcontrolled <em>Qcontrolled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qcontrolled</em>' attribute.
	 * @see #getQcontrolled()
	 * @generated
	 */
	void setQcontrolled(String value);

	/**
	 * Returns the value of the '<em><b>Pmax MW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pmax MW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmax MW</em>' attribute.
	 * @see #setPmax_MW(String)
	 * @see visGrid.VisGridPackage#getGenerator_Pmax_MW()
	 * @model
	 * @generated
	 */
	String getPmax_MW();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getPmax_MW <em>Pmax MW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmax MW</em>' attribute.
	 * @see #getPmax_MW()
	 * @generated
	 */
	void setPmax_MW(String value);

	/**
	 * Returns the value of the '<em><b>Qmin MVAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qmin MVAR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qmin MVAR</em>' attribute.
	 * @see #setQmin_MVAR(String)
	 * @see visGrid.VisGridPackage#getGenerator_Qmin_MVAR()
	 * @model
	 * @generated
	 */
	String getQmin_MVAR();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQmin_MVAR <em>Qmin MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qmin MVAR</em>' attribute.
	 * @see #getQmin_MVAR()
	 * @generated
	 */
	void setQmin_MVAR(String value);

	/**
	 * Returns the value of the '<em><b>Qmax MVAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qmax MVAR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qmax MVAR</em>' attribute.
	 * @see #setQmax_MVAR(String)
	 * @see visGrid.VisGridPackage#getGenerator_Qmax_MVAR()
	 * @model
	 * @generated
	 */
	String getQmax_MVAR();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQmax_MVAR <em>Qmax MVAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qmax MVAR</em>' attribute.
	 * @see #getQmax_MVAR()
	 * @generated
	 */
	void setQmax_MVAR(String value);

	/**
	 * Returns the value of the '<em><b>QVa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QVa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QVa</em>' attribute.
	 * @see #setQVa(String)
	 * @see visGrid.VisGridPackage#getGenerator_QVa()
	 * @model
	 * @generated
	 */
	String getQVa();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQVa <em>QVa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QVa</em>' attribute.
	 * @see #getQVa()
	 * @generated
	 */
	void setQVa(String value);

	/**
	 * Returns the value of the '<em><b>QVb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QVb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QVb</em>' attribute.
	 * @see #setQVb(String)
	 * @see visGrid.VisGridPackage#getGenerator_QVb()
	 * @model
	 * @generated
	 */
	String getQVb();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQVb <em>QVb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QVb</em>' attribute.
	 * @see #getQVb()
	 * @generated
	 */
	void setQVb(String value);

	/**
	 * Returns the value of the '<em><b>QVc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QVc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QVc</em>' attribute.
	 * @see #setQVc(String)
	 * @see visGrid.VisGridPackage#getGenerator_QVc()
	 * @model
	 * @generated
	 */
	String getQVc();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getQVc <em>QVc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QVc</em>' attribute.
	 * @see #getQVc()
	 * @generated
	 */
	void setQVc(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see visGrid.VisGridPackage#getGenerator_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link visGrid.Generator#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // Generator
