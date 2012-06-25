/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.House#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.House#getSchedule_skew <em>Schedule skew</em>}</li>
 *   <li>{@link simpleGrid.House#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link simpleGrid.House#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link simpleGrid.House#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link simpleGrid.House#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link simpleGrid.House#getThermal_integrity_level <em>Thermal integrity level</em>}</li>
 *   <li>{@link simpleGrid.House#getMotor_model <em>Motor model</em>}</li>
 *   <li>{@link simpleGrid.House#getMotor_efficiency <em>Motor efficiency</em>}</li>
 *   <li>{@link simpleGrid.House#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link simpleGrid.House#getHeating_system_type <em>Heating system type</em>}</li>
 *   <li>{@link simpleGrid.House#getHeating_COP <em>Heating COP</em>}</li>
 *   <li>{@link simpleGrid.House#getAuxiliary_strategy <em>Auxiliary strategy</em>}</li>
 *   <li>{@link simpleGrid.House#getAuxiliary_system_type <em>Auxiliary system type</em>}</li>
 *   <li>{@link simpleGrid.House#getCooling_COP <em>Cooling COP</em>}</li>
 *   <li>{@link simpleGrid.House#getWaterheater <em>Waterheater</em>}</li>
 *   <li>{@link simpleGrid.House#getParent <em>Parent</em>}</li>
 *   <li>{@link simpleGrid.House#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
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
	 * @see simpleGrid.SimpleGridPackage#getHouse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schedule skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule skew</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule skew</em>' attribute.
	 * @see #setSchedule_skew(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Schedule_skew()
	 * @model
	 * @generated
	 */
	String getSchedule_skew();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getSchedule_skew <em>Schedule skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule skew</em>' attribute.
	 * @see #getSchedule_skew()
	 * @generated
	 */
	void setSchedule_skew(String value);

	/**
	 * Returns the value of the '<em><b>Air temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air temperature</em>' attribute.
	 * @see #setAir_temperature(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Air_temperature()
	 * @model
	 * @generated
	 */
	String getAir_temperature();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getAir_temperature <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air temperature</em>' attribute.
	 * @see #getAir_temperature()
	 * @generated
	 */
	void setAir_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Floor area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor area</em>' attribute.
	 * @see #setFloor_area(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Floor_area()
	 * @model
	 * @generated
	 */
	String getFloor_area();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getFloor_area <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor area</em>' attribute.
	 * @see #getFloor_area()
	 * @generated
	 */
	void setFloor_area(String value);

	/**
	 * Returns the value of the '<em><b>Cooling setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling setpoint</em>' attribute.
	 * @see #setCooling_setpoint(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Cooling_setpoint()
	 * @model
	 * @generated
	 */
	String getCooling_setpoint();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getCooling_setpoint <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling setpoint</em>' attribute.
	 * @see #getCooling_setpoint()
	 * @generated
	 */
	void setCooling_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Heating setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating setpoint</em>' attribute.
	 * @see #setHeating_setpoint(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Heating_setpoint()
	 * @model
	 * @generated
	 */
	String getHeating_setpoint();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getHeating_setpoint <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating setpoint</em>' attribute.
	 * @see #getHeating_setpoint()
	 * @generated
	 */
	void setHeating_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Thermal integrity level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal integrity level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal integrity level</em>' attribute.
	 * @see #setThermal_integrity_level(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Thermal_integrity_level()
	 * @model
	 * @generated
	 */
	String getThermal_integrity_level();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getThermal_integrity_level <em>Thermal integrity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal integrity level</em>' attribute.
	 * @see #getThermal_integrity_level()
	 * @generated
	 */
	void setThermal_integrity_level(String value);

	/**
	 * Returns the value of the '<em><b>Motor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor model</em>' attribute.
	 * @see #setMotor_model(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Motor_model()
	 * @model
	 * @generated
	 */
	String getMotor_model();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getMotor_model <em>Motor model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor model</em>' attribute.
	 * @see #getMotor_model()
	 * @generated
	 */
	void setMotor_model(String value);

	/**
	 * Returns the value of the '<em><b>Motor efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor efficiency</em>' attribute.
	 * @see #setMotor_efficiency(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Motor_efficiency()
	 * @model
	 * @generated
	 */
	String getMotor_efficiency();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getMotor_efficiency <em>Motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor efficiency</em>' attribute.
	 * @see #getMotor_efficiency()
	 * @generated
	 */
	void setMotor_efficiency(String value);

	/**
	 * Returns the value of the '<em><b>Mass temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass temperature</em>' attribute.
	 * @see #setMass_temperature(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Mass_temperature()
	 * @model
	 * @generated
	 */
	String getMass_temperature();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getMass_temperature <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass temperature</em>' attribute.
	 * @see #getMass_temperature()
	 * @generated
	 */
	void setMass_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Heating system type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating system type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating system type</em>' attribute.
	 * @see #setHeating_system_type(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Heating_system_type()
	 * @model
	 * @generated
	 */
	String getHeating_system_type();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getHeating_system_type <em>Heating system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating system type</em>' attribute.
	 * @see #getHeating_system_type()
	 * @generated
	 */
	void setHeating_system_type(String value);

	/**
	 * Returns the value of the '<em><b>Heating COP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating COP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating COP</em>' attribute.
	 * @see #setHeating_COP(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Heating_COP()
	 * @model
	 * @generated
	 */
	String getHeating_COP();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getHeating_COP <em>Heating COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating COP</em>' attribute.
	 * @see #getHeating_COP()
	 * @generated
	 */
	void setHeating_COP(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary strategy</em>' attribute.
	 * @see #setAuxiliary_strategy(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Auxiliary_strategy()
	 * @model
	 * @generated
	 */
	String getAuxiliary_strategy();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getAuxiliary_strategy <em>Auxiliary strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary strategy</em>' attribute.
	 * @see #getAuxiliary_strategy()
	 * @generated
	 */
	void setAuxiliary_strategy(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary system type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary system type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary system type</em>' attribute.
	 * @see #setAuxiliary_system_type(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Auxiliary_system_type()
	 * @model
	 * @generated
	 */
	String getAuxiliary_system_type();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getAuxiliary_system_type <em>Auxiliary system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary system type</em>' attribute.
	 * @see #getAuxiliary_system_type()
	 * @generated
	 */
	void setAuxiliary_system_type(String value);

	/**
	 * Returns the value of the '<em><b>Cooling COP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling COP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling COP</em>' attribute.
	 * @see #setCooling_COP(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Cooling_COP()
	 * @model
	 * @generated
	 */
	String getCooling_COP();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getCooling_COP <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling COP</em>' attribute.
	 * @see #getCooling_COP()
	 * @generated
	 */
	void setCooling_COP(String value);

	/**
	 * Returns the value of the '<em><b>Waterheater</b></em>' reference list.
	 * The list contents are of type {@link simpleGrid.Waterheater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waterheater</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waterheater</em>' reference list.
	 * @see simpleGrid.SimpleGridPackage#getHouse_Waterheater()
	 * @model
	 * @generated
	 */
	EList<Waterheater> getWaterheater();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Parent()
	 * @model
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Aux heat temperature lockout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux heat temperature lockout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux heat temperature lockout</em>' attribute.
	 * @see #setAux_heat_temperature_lockout(String)
	 * @see simpleGrid.SimpleGridPackage#getHouse_Aux_heat_temperature_lockout()
	 * @model
	 * @generated
	 */
	String getAux_heat_temperature_lockout();

	/**
	 * Sets the value of the '{@link simpleGrid.House#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux heat temperature lockout</em>' attribute.
	 * @see #getAux_heat_temperature_lockout()
	 * @generated
	 */
	void setAux_heat_temperature_lockout(String value);

} // House
