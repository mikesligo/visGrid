/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Switch#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Switch#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Switch#getStatus <em>Status</em>}</li>
 *   <li>{@link visGrid.Switch#getFrom <em>From</em>}</li>
 *   <li>{@link visGrid.Switch#getTo <em>To</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_in <em>Power in</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_out <em>Power out</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_losses <em>Power losses</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_in_A <em>Power in A</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_in_B <em>Power in B</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_in_C <em>Power in C</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_out_A <em>Power out A</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_out_B <em>Power out B</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_out_C <em>Power out C</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_losses_A <em>Power losses A</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_losses_B <em>Power losses B</em>}</li>
 *   <li>{@link visGrid.Switch#getPower_losses_C <em>Power losses C</em>}</li>
 *   <li>{@link visGrid.Switch#getFlow_direction <em>Flow direction</em>}</li>
 *   <li>{@link visGrid.Switch#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Switch#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link visGrid.Connections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see visGrid.VisGridPackage#getSwitch_Connection()
	 * @model
	 * @generated
	 */
	EList<Connections> getConnection();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see visGrid.VisGridPackage#getSwitch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see visGrid.VisGridPackage#getSwitch_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see visGrid.VisGridPackage#getSwitch_From()
	 * @model
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see visGrid.VisGridPackage#getSwitch_To()
	 * @model
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Power in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in</em>' attribute.
	 * @see #setPower_in(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_in()
	 * @model
	 * @generated
	 */
	String getPower_in();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_in <em>Power in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in</em>' attribute.
	 * @see #getPower_in()
	 * @generated
	 */
	void setPower_in(String value);

	/**
	 * Returns the value of the '<em><b>Power out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out</em>' attribute.
	 * @see #setPower_out(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_out()
	 * @model
	 * @generated
	 */
	String getPower_out();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_out <em>Power out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out</em>' attribute.
	 * @see #getPower_out()
	 * @generated
	 */
	void setPower_out(String value);

	/**
	 * Returns the value of the '<em><b>Power losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses</em>' attribute.
	 * @see #setPower_losses(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_losses()
	 * @model
	 * @generated
	 */
	String getPower_losses();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_losses <em>Power losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses</em>' attribute.
	 * @see #getPower_losses()
	 * @generated
	 */
	void setPower_losses(String value);

	/**
	 * Returns the value of the '<em><b>Power in A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in A</em>' attribute.
	 * @see #setPower_in_A(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_in_A()
	 * @model
	 * @generated
	 */
	String getPower_in_A();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_in_A <em>Power in A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in A</em>' attribute.
	 * @see #getPower_in_A()
	 * @generated
	 */
	void setPower_in_A(String value);

	/**
	 * Returns the value of the '<em><b>Power in B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in B</em>' attribute.
	 * @see #setPower_in_B(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_in_B()
	 * @model
	 * @generated
	 */
	String getPower_in_B();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_in_B <em>Power in B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in B</em>' attribute.
	 * @see #getPower_in_B()
	 * @generated
	 */
	void setPower_in_B(String value);

	/**
	 * Returns the value of the '<em><b>Power in C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power in C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power in C</em>' attribute.
	 * @see #setPower_in_C(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_in_C()
	 * @model
	 * @generated
	 */
	String getPower_in_C();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_in_C <em>Power in C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power in C</em>' attribute.
	 * @see #getPower_in_C()
	 * @generated
	 */
	void setPower_in_C(String value);

	/**
	 * Returns the value of the '<em><b>Power out A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out A</em>' attribute.
	 * @see #setPower_out_A(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_out_A()
	 * @model
	 * @generated
	 */
	String getPower_out_A();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_out_A <em>Power out A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out A</em>' attribute.
	 * @see #getPower_out_A()
	 * @generated
	 */
	void setPower_out_A(String value);

	/**
	 * Returns the value of the '<em><b>Power out B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out B</em>' attribute.
	 * @see #setPower_out_B(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_out_B()
	 * @model
	 * @generated
	 */
	String getPower_out_B();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_out_B <em>Power out B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out B</em>' attribute.
	 * @see #getPower_out_B()
	 * @generated
	 */
	void setPower_out_B(String value);

	/**
	 * Returns the value of the '<em><b>Power out C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power out C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power out C</em>' attribute.
	 * @see #setPower_out_C(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_out_C()
	 * @model
	 * @generated
	 */
	String getPower_out_C();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_out_C <em>Power out C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power out C</em>' attribute.
	 * @see #getPower_out_C()
	 * @generated
	 */
	void setPower_out_C(String value);

	/**
	 * Returns the value of the '<em><b>Power losses A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses A</em>' attribute.
	 * @see #setPower_losses_A(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_losses_A()
	 * @model
	 * @generated
	 */
	String getPower_losses_A();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_losses_A <em>Power losses A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses A</em>' attribute.
	 * @see #getPower_losses_A()
	 * @generated
	 */
	void setPower_losses_A(String value);

	/**
	 * Returns the value of the '<em><b>Power losses B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses B</em>' attribute.
	 * @see #setPower_losses_B(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_losses_B()
	 * @model
	 * @generated
	 */
	String getPower_losses_B();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_losses_B <em>Power losses B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses B</em>' attribute.
	 * @see #getPower_losses_B()
	 * @generated
	 */
	void setPower_losses_B(String value);

	/**
	 * Returns the value of the '<em><b>Power losses C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power losses C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power losses C</em>' attribute.
	 * @see #setPower_losses_C(String)
	 * @see visGrid.VisGridPackage#getSwitch_Power_losses_C()
	 * @model
	 * @generated
	 */
	String getPower_losses_C();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPower_losses_C <em>Power losses C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power losses C</em>' attribute.
	 * @see #getPower_losses_C()
	 * @generated
	 */
	void setPower_losses_C(String value);

	/**
	 * Returns the value of the '<em><b>Flow direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow direction</em>' attribute.
	 * @see #setFlow_direction(String)
	 * @see visGrid.VisGridPackage#getSwitch_Flow_direction()
	 * @model
	 * @generated
	 */
	String getFlow_direction();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getFlow_direction <em>Flow direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow direction</em>' attribute.
	 * @see #getFlow_direction()
	 * @generated
	 */
	void setFlow_direction(String value);

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
	 * @see visGrid.VisGridPackage#getSwitch_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getPhases <em>Phases</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSwitch_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Switch#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Switch