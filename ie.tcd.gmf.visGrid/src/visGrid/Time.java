/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Time#getSimulatorTime <em>Simulator Time</em>}</li>
 *   <li>{@link visGrid.Time#getRealtime <em>Realtime</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Simulator Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulator Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulator Time</em>' attribute.
	 * @see #setSimulatorTime(String)
	 * @see visGrid.VisGridPackage#getTime_SimulatorTime()
	 * @model
	 * @generated
	 */
	String getSimulatorTime();

	/**
	 * Sets the value of the '{@link visGrid.Time#getSimulatorTime <em>Simulator Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulator Time</em>' attribute.
	 * @see #getSimulatorTime()
	 * @generated
	 */
	void setSimulatorTime(String value);

	/**
	 * Returns the value of the '<em><b>Realtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realtime</em>' attribute.
	 * @see #setRealtime(String)
	 * @see visGrid.VisGridPackage#getTime_Realtime()
	 * @model
	 * @generated
	 */
	String getRealtime();

	/**
	 * Sets the value of the '{@link visGrid.Time#getRealtime <em>Realtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realtime</em>' attribute.
	 * @see #getRealtime()
	 * @generated
	 */
	void setRealtime(String value);

} // Time
