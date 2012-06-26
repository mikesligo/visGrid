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
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Substation#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Substation#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_energy <em>Distribution energy</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_power <em>Distribution power</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_demand <em>Distribution demand</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_voltage_A <em>Distribution voltage A</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_voltage_B <em>Distribution voltage B</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_voltage_C <em>Distribution voltage C</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_current_A <em>Distribution current A</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_current_B <em>Distribution current B</em>}</li>
 *   <li>{@link visGrid.Substation#getDistribution_current_C <em>Distribution current C</em>}</li>
 *   <li>{@link visGrid.Substation#getNetwork_Node_Base_Power <em>Network Node Base Power</em>}</li>
 *   <li>{@link visGrid.Substation#getNetwork_Node_Base_Voltage <em>Network Node Base Voltage</em>}</li>
 *   <li>{@link visGrid.Substation#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.Substation#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.Substation#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.Substation#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.Substation#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.Substation#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.Substation#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.Substation#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.Substation#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.Substation#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.Substation#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.Substation#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.Substation#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.Substation#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.Substation#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.Substation#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.Substation#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.Substation#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.Substation#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.Substation#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.Substation#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getSubstation()
 * @model
 * @generated
 */
public interface Substation extends EObject {
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
	 * @see visGrid.VisGridPackage#getSubstation_Connection()
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
	 * @see visGrid.VisGridPackage#getSubstation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Distribution energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution energy</em>' attribute.
	 * @see #setDistribution_energy(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_energy()
	 * @model
	 * @generated
	 */
	String getDistribution_energy();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_energy <em>Distribution energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution energy</em>' attribute.
	 * @see #getDistribution_energy()
	 * @generated
	 */
	void setDistribution_energy(String value);

	/**
	 * Returns the value of the '<em><b>Distribution power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution power</em>' attribute.
	 * @see #setDistribution_power(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_power()
	 * @model
	 * @generated
	 */
	String getDistribution_power();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_power <em>Distribution power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution power</em>' attribute.
	 * @see #getDistribution_power()
	 * @generated
	 */
	void setDistribution_power(String value);

	/**
	 * Returns the value of the '<em><b>Distribution demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution demand</em>' attribute.
	 * @see #setDistribution_demand(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_demand()
	 * @model
	 * @generated
	 */
	String getDistribution_demand();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_demand <em>Distribution demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution demand</em>' attribute.
	 * @see #getDistribution_demand()
	 * @generated
	 */
	void setDistribution_demand(String value);

	/**
	 * Returns the value of the '<em><b>Distribution voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution voltage A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution voltage A</em>' attribute.
	 * @see #setDistribution_voltage_A(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_voltage_A()
	 * @model
	 * @generated
	 */
	String getDistribution_voltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_voltage_A <em>Distribution voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution voltage A</em>' attribute.
	 * @see #getDistribution_voltage_A()
	 * @generated
	 */
	void setDistribution_voltage_A(String value);

	/**
	 * Returns the value of the '<em><b>Distribution voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution voltage B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution voltage B</em>' attribute.
	 * @see #setDistribution_voltage_B(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_voltage_B()
	 * @model
	 * @generated
	 */
	String getDistribution_voltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_voltage_B <em>Distribution voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution voltage B</em>' attribute.
	 * @see #getDistribution_voltage_B()
	 * @generated
	 */
	void setDistribution_voltage_B(String value);

	/**
	 * Returns the value of the '<em><b>Distribution voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution voltage C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution voltage C</em>' attribute.
	 * @see #setDistribution_voltage_C(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_voltage_C()
	 * @model
	 * @generated
	 */
	String getDistribution_voltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_voltage_C <em>Distribution voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution voltage C</em>' attribute.
	 * @see #getDistribution_voltage_C()
	 * @generated
	 */
	void setDistribution_voltage_C(String value);

	/**
	 * Returns the value of the '<em><b>Distribution current A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution current A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution current A</em>' attribute.
	 * @see #setDistribution_current_A(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_current_A()
	 * @model
	 * @generated
	 */
	String getDistribution_current_A();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_current_A <em>Distribution current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution current A</em>' attribute.
	 * @see #getDistribution_current_A()
	 * @generated
	 */
	void setDistribution_current_A(String value);

	/**
	 * Returns the value of the '<em><b>Distribution current B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution current B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution current B</em>' attribute.
	 * @see #setDistribution_current_B(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_current_B()
	 * @model
	 * @generated
	 */
	String getDistribution_current_B();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_current_B <em>Distribution current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution current B</em>' attribute.
	 * @see #getDistribution_current_B()
	 * @generated
	 */
	void setDistribution_current_B(String value);

	/**
	 * Returns the value of the '<em><b>Distribution current C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution current C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution current C</em>' attribute.
	 * @see #setDistribution_current_C(String)
	 * @see visGrid.VisGridPackage#getSubstation_Distribution_current_C()
	 * @model
	 * @generated
	 */
	String getDistribution_current_C();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getDistribution_current_C <em>Distribution current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution current C</em>' attribute.
	 * @see #getDistribution_current_C()
	 * @generated
	 */
	void setDistribution_current_C(String value);

	/**
	 * Returns the value of the '<em><b>Network Node Base Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Node Base Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Node Base Power</em>' attribute.
	 * @see #setNetwork_Node_Base_Power(String)
	 * @see visGrid.VisGridPackage#getSubstation_Network_Node_Base_Power()
	 * @model
	 * @generated
	 */
	String getNetwork_Node_Base_Power();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getNetwork_Node_Base_Power <em>Network Node Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Node Base Power</em>' attribute.
	 * @see #getNetwork_Node_Base_Power()
	 * @generated
	 */
	void setNetwork_Node_Base_Power(String value);

	/**
	 * Returns the value of the '<em><b>Network Node Base Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Node Base Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Node Base Voltage</em>' attribute.
	 * @see #setNetwork_Node_Base_Voltage(String)
	 * @see visGrid.VisGridPackage#getSubstation_Network_Node_Base_Voltage()
	 * @model
	 * @generated
	 */
	String getNetwork_Node_Base_Voltage();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getNetwork_Node_Base_Voltage <em>Network Node Base Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Node Base Voltage</em>' attribute.
	 * @see #getNetwork_Node_Base_Voltage()
	 * @generated
	 */
	void setNetwork_Node_Base_Voltage(String value);

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
	 * @see visGrid.VisGridPackage#getSubstation_Bustype()
	 * @model
	 * @generated
	 */
	String getBustype();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getBustype <em>Bustype</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Busflags()
	 * @model
	 * @generated
	 */
	String getBusflags();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getBusflags <em>Busflags</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Reference_bus()
	 * @model
	 * @generated
	 */
	String getReference_bus();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getReference_bus <em>Reference bus</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Maximum_voltage_error()
	 * @model
	 * @generated
	 */
	String getMaximum_voltage_error();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getMaximum_voltage_error <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum voltage error</em>' attribute.
	 * @see #getMaximum_voltage_error()
	 * @generated
	 */
	void setMaximum_voltage_error(String value);

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
	 * @see visGrid.VisGridPackage#getSubstation_Voltage_A()
	 * @model
	 * @generated
	 */
	String getVoltage_A();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getVoltage_A <em>Voltage A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Voltage_B()
	 * @model
	 * @generated
	 */
	String getVoltage_B();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getVoltage_B <em>Voltage B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Voltage_C()
	 * @model
	 * @generated
	 */
	String getVoltage_C();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getVoltage_C <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage C</em>' attribute.
	 * @see #getVoltage_C()
	 * @generated
	 */
	void setVoltage_C(String value);

	/**
	 * Returns the value of the '<em><b>Voltage AB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage AB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage AB</em>' attribute.
	 * @see #setVoltage_AB(String)
	 * @see visGrid.VisGridPackage#getSubstation_Voltage_AB()
	 * @model
	 * @generated
	 */
	String getVoltage_AB();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getVoltage_AB <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage AB</em>' attribute.
	 * @see #getVoltage_AB()
	 * @generated
	 */
	void setVoltage_AB(String value);

	/**
	 * Returns the value of the '<em><b>Voltage BC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage BC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage BC</em>' attribute.
	 * @see #setVoltage_BC(String)
	 * @see visGrid.VisGridPackage#getSubstation_Voltage_BC()
	 * @model
	 * @generated
	 */
	String getVoltage_BC();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getVoltage_BC <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage BC</em>' attribute.
	 * @see #getVoltage_BC()
	 * @generated
	 */
	void setVoltage_BC(String value);

	/**
	 * Returns the value of the '<em><b>Voltage CA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage CA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage CA</em>' attribute.
	 * @see #setVoltage_CA(String)
	 * @see visGrid.VisGridPackage#getSubstation_Voltage_CA()
	 * @model
	 * @generated
	 */
	String getVoltage_CA();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getVoltage_CA <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage CA</em>' attribute.
	 * @see #getVoltage_CA()
	 * @generated
	 */
	void setVoltage_CA(String value);

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
	 * @see visGrid.VisGridPackage#getSubstation_Current_A()
	 * @model
	 * @generated
	 */
	String getCurrent_A();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getCurrent_A <em>Current A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Current_B()
	 * @model
	 * @generated
	 */
	String getCurrent_B();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getCurrent_B <em>Current B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Current_C()
	 * @model
	 * @generated
	 */
	String getCurrent_C();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getCurrent_C <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current C</em>' attribute.
	 * @see #getCurrent_C()
	 * @generated
	 */
	void setCurrent_C(String value);

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
	 * @see visGrid.VisGridPackage#getSubstation_Power_A()
	 * @model
	 * @generated
	 */
	String getPower_A();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getPower_A <em>Power A</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Power_B()
	 * @model
	 * @generated
	 */
	String getPower_B();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getPower_B <em>Power B</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Power_C()
	 * @model
	 * @generated
	 */
	String getPower_C();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getPower_C <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power C</em>' attribute.
	 * @see #getPower_C()
	 * @generated
	 */
	void setPower_C(String value);

	/**
	 * Returns the value of the '<em><b>Shunt A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt A</em>' attribute.
	 * @see #setShunt_A(String)
	 * @see visGrid.VisGridPackage#getSubstation_Shunt_A()
	 * @model
	 * @generated
	 */
	String getShunt_A();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getShunt_A <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt A</em>' attribute.
	 * @see #getShunt_A()
	 * @generated
	 */
	void setShunt_A(String value);

	/**
	 * Returns the value of the '<em><b>Shunt B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt B</em>' attribute.
	 * @see #setShunt_B(String)
	 * @see visGrid.VisGridPackage#getSubstation_Shunt_B()
	 * @model
	 * @generated
	 */
	String getShunt_B();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getShunt_B <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt B</em>' attribute.
	 * @see #getShunt_B()
	 * @generated
	 */
	void setShunt_B(String value);

	/**
	 * Returns the value of the '<em><b>Shunt C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shunt C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shunt C</em>' attribute.
	 * @see #setShunt_C(String)
	 * @see visGrid.VisGridPackage#getSubstation_Shunt_C()
	 * @model
	 * @generated
	 */
	String getShunt_C();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getShunt_C <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shunt C</em>' attribute.
	 * @see #getShunt_C()
	 * @generated
	 */
	void setShunt_C(String value);

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
	 * @see visGrid.VisGridPackage#getSubstation_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getPhases <em>Phases</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getSubstation_Nominal_voltage()
	 * @model
	 * @generated
	 */
	String getNominal_voltage();

	/**
	 * Sets the value of the '{@link visGrid.Substation#getNominal_voltage <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal voltage</em>' attribute.
	 * @see #getNominal_voltage()
	 * @generated
	 */
	void setNominal_voltage(String value);

} // Substation
