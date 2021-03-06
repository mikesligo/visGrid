/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House a</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.House_a#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link visGrid.House_a#getGross_wall_area <em>Gross wall area</em>}</li>
 *   <li>{@link visGrid.House_a#getCeiling_height <em>Ceiling height</em>}</li>
 *   <li>{@link visGrid.House_a#getAspect_ratio <em>Aspect ratio</em>}</li>
 *   <li>{@link visGrid.House_a#getEnvelope_UA <em>Envelope UA</em>}</li>
 *   <li>{@link visGrid.House_a#getWindow_wall_ratio <em>Window wall ratio</em>}</li>
 *   <li>{@link visGrid.House_a#getGlazing_shgc <em>Glazing shgc</em>}</li>
 *   <li>{@link visGrid.House_a#getAirchange_per_hour <em>Airchange per hour</em>}</li>
 *   <li>{@link visGrid.House_a#getSolar_gain <em>Solar gain</em>}</li>
 *   <li>{@link visGrid.House_a#getHeat_cool_gain <em>Heat cool gain</em>}</li>
 *   <li>{@link visGrid.House_a#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.House_a#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link visGrid.House_a#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link visGrid.House_a#getDesign_heating_capacity <em>Design heating capacity</em>}</li>
 *   <li>{@link visGrid.House_a#getDesign_cooling_capacity <em>Design cooling capacity</em>}</li>
 *   <li>{@link visGrid.House_a#getHeating_COP <em>Heating COP</em>}</li>
 *   <li>{@link visGrid.House_a#getCooling_COP <em>Cooling COP</em>}</li>
 *   <li>{@link visGrid.House_a#getCOP_coeff <em>COP coeff</em>}</li>
 *   <li>{@link visGrid.House_a#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link visGrid.House_a#getOutside_temp <em>Outside temp</em>}</li>
 *   <li>{@link visGrid.House_a#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link visGrid.House_a#getMass_heat_coeff <em>Mass heat coeff</em>}</li>
 *   <li>{@link visGrid.House_a#getOutdoor_temperature <em>Outdoor temperature</em>}</li>
 *   <li>{@link visGrid.House_a#getHouse_thermal_mass <em>House thermal mass</em>}</li>
 *   <li>{@link visGrid.House_a#getHeat_mode <em>Heat mode</em>}</li>
 *   <li>{@link visGrid.House_a#getHc_mode <em>Hc mode</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload <em>Houseload</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__energy <em>Houseload energy</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__power <em>Houseload power</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__peak_demand <em>Houseload peak demand</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__heatgain <em>Houseload heatgain</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__heatgain_fraction <em>Houseload heatgain fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__current_fraction <em>Houseload current fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__impedance_fraction <em>Houseload impedance fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__power_fraction <em>Houseload power fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__power_factor <em>Houseload power factor</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__constant_power <em>Houseload constant power</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__constant_current <em>Houseload constant current</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__constant_admittance <em>Houseload constant admittance</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__voltage_factor <em>Houseload voltage factor</em>}</li>
 *   <li>{@link visGrid.House_a#getHouseload__configuration <em>Houseload configuration</em>}</li>
 *   <li>{@link visGrid.House_a#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.House_a#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.House_a#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.House_a#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.House_a#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.House_a#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.House_a#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.House_a#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.House_a#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.House_a#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.House_a#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.House_a#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.House_a#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.House_a#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getHouse_a()
 * @model
 * @generated
 */
public interface House_a extends Connection {
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
	 * @see visGrid.VisGridPackage#getHouse_a_Floor_area()
	 * @model
	 * @generated
	 */
	String getFloor_area();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getFloor_area <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor area</em>' attribute.
	 * @see #getFloor_area()
	 * @generated
	 */
	void setFloor_area(String value);

	/**
	 * Returns the value of the '<em><b>Gross wall area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross wall area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross wall area</em>' attribute.
	 * @see #setGross_wall_area(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Gross_wall_area()
	 * @model
	 * @generated
	 */
	String getGross_wall_area();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getGross_wall_area <em>Gross wall area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross wall area</em>' attribute.
	 * @see #getGross_wall_area()
	 * @generated
	 */
	void setGross_wall_area(String value);

	/**
	 * Returns the value of the '<em><b>Ceiling height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ceiling height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ceiling height</em>' attribute.
	 * @see #setCeiling_height(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Ceiling_height()
	 * @model
	 * @generated
	 */
	String getCeiling_height();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getCeiling_height <em>Ceiling height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling height</em>' attribute.
	 * @see #getCeiling_height()
	 * @generated
	 */
	void setCeiling_height(String value);

	/**
	 * Returns the value of the '<em><b>Aspect ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect ratio</em>' attribute.
	 * @see #setAspect_ratio(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Aspect_ratio()
	 * @model
	 * @generated
	 */
	String getAspect_ratio();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getAspect_ratio <em>Aspect ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect ratio</em>' attribute.
	 * @see #getAspect_ratio()
	 * @generated
	 */
	void setAspect_ratio(String value);

	/**
	 * Returns the value of the '<em><b>Envelope UA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envelope UA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope UA</em>' attribute.
	 * @see #setEnvelope_UA(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Envelope_UA()
	 * @model
	 * @generated
	 */
	String getEnvelope_UA();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getEnvelope_UA <em>Envelope UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope UA</em>' attribute.
	 * @see #getEnvelope_UA()
	 * @generated
	 */
	void setEnvelope_UA(String value);

	/**
	 * Returns the value of the '<em><b>Window wall ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window wall ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window wall ratio</em>' attribute.
	 * @see #setWindow_wall_ratio(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Window_wall_ratio()
	 * @model
	 * @generated
	 */
	String getWindow_wall_ratio();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getWindow_wall_ratio <em>Window wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window wall ratio</em>' attribute.
	 * @see #getWindow_wall_ratio()
	 * @generated
	 */
	void setWindow_wall_ratio(String value);

	/**
	 * Returns the value of the '<em><b>Glazing shgc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing shgc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing shgc</em>' attribute.
	 * @see #setGlazing_shgc(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Glazing_shgc()
	 * @model
	 * @generated
	 */
	String getGlazing_shgc();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getGlazing_shgc <em>Glazing shgc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing shgc</em>' attribute.
	 * @see #getGlazing_shgc()
	 * @generated
	 */
	void setGlazing_shgc(String value);

	/**
	 * Returns the value of the '<em><b>Airchange per hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Airchange per hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airchange per hour</em>' attribute.
	 * @see #setAirchange_per_hour(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Airchange_per_hour()
	 * @model
	 * @generated
	 */
	String getAirchange_per_hour();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getAirchange_per_hour <em>Airchange per hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airchange per hour</em>' attribute.
	 * @see #getAirchange_per_hour()
	 * @generated
	 */
	void setAirchange_per_hour(String value);

	/**
	 * Returns the value of the '<em><b>Solar gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar gain</em>' attribute.
	 * @see #setSolar_gain(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Solar_gain()
	 * @model
	 * @generated
	 */
	String getSolar_gain();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getSolar_gain <em>Solar gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar gain</em>' attribute.
	 * @see #getSolar_gain()
	 * @generated
	 */
	void setSolar_gain(String value);

	/**
	 * Returns the value of the '<em><b>Heat cool gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat cool gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat cool gain</em>' attribute.
	 * @see #setHeat_cool_gain(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Heat_cool_gain()
	 * @model
	 * @generated
	 */
	String getHeat_cool_gain();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHeat_cool_gain <em>Heat cool gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat cool gain</em>' attribute.
	 * @see #getHeat_cool_gain()
	 * @generated
	 */
	void setHeat_cool_gain(String value);

	/**
	 * Returns the value of the '<em><b>Thermostat deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermostat deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #setThermostat_deadband(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Thermostat_deadband()
	 * @model
	 * @generated
	 */
	String getThermostat_deadband();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getThermostat_deadband <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #getThermostat_deadband()
	 * @generated
	 */
	void setThermostat_deadband(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Heating_setpoint()
	 * @model
	 * @generated
	 */
	String getHeating_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHeating_setpoint <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating setpoint</em>' attribute.
	 * @see #getHeating_setpoint()
	 * @generated
	 */
	void setHeating_setpoint(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Cooling_setpoint()
	 * @model
	 * @generated
	 */
	String getCooling_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getCooling_setpoint <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling setpoint</em>' attribute.
	 * @see #getCooling_setpoint()
	 * @generated
	 */
	void setCooling_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Design heating capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design heating capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design heating capacity</em>' attribute.
	 * @see #setDesign_heating_capacity(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Design_heating_capacity()
	 * @model
	 * @generated
	 */
	String getDesign_heating_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getDesign_heating_capacity <em>Design heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design heating capacity</em>' attribute.
	 * @see #getDesign_heating_capacity()
	 * @generated
	 */
	void setDesign_heating_capacity(String value);

	/**
	 * Returns the value of the '<em><b>Design cooling capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design cooling capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design cooling capacity</em>' attribute.
	 * @see #setDesign_cooling_capacity(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Design_cooling_capacity()
	 * @model
	 * @generated
	 */
	String getDesign_cooling_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getDesign_cooling_capacity <em>Design cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design cooling capacity</em>' attribute.
	 * @see #getDesign_cooling_capacity()
	 * @generated
	 */
	void setDesign_cooling_capacity(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Heating_COP()
	 * @model
	 * @generated
	 */
	String getHeating_COP();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHeating_COP <em>Heating COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating COP</em>' attribute.
	 * @see #getHeating_COP()
	 * @generated
	 */
	void setHeating_COP(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Cooling_COP()
	 * @model
	 * @generated
	 */
	String getCooling_COP();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getCooling_COP <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling COP</em>' attribute.
	 * @see #getCooling_COP()
	 * @generated
	 */
	void setCooling_COP(String value);

	/**
	 * Returns the value of the '<em><b>COP coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COP coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COP coeff</em>' attribute.
	 * @see #setCOP_coeff(String)
	 * @see visGrid.VisGridPackage#getHouse_a_COP_coeff()
	 * @model
	 * @generated
	 */
	String getCOP_coeff();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getCOP_coeff <em>COP coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COP coeff</em>' attribute.
	 * @see #getCOP_coeff()
	 * @generated
	 */
	void setCOP_coeff(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Air_temperature()
	 * @model
	 * @generated
	 */
	String getAir_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getAir_temperature <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air temperature</em>' attribute.
	 * @see #getAir_temperature()
	 * @generated
	 */
	void setAir_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Outside temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside temp</em>' attribute.
	 * @see #setOutside_temp(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Outside_temp()
	 * @model
	 * @generated
	 */
	String getOutside_temp();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getOutside_temp <em>Outside temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside temp</em>' attribute.
	 * @see #getOutside_temp()
	 * @generated
	 */
	void setOutside_temp(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Mass_temperature()
	 * @model
	 * @generated
	 */
	String getMass_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getMass_temperature <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass temperature</em>' attribute.
	 * @see #getMass_temperature()
	 * @generated
	 */
	void setMass_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Mass heat coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass heat coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass heat coeff</em>' attribute.
	 * @see #setMass_heat_coeff(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Mass_heat_coeff()
	 * @model
	 * @generated
	 */
	String getMass_heat_coeff();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getMass_heat_coeff <em>Mass heat coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass heat coeff</em>' attribute.
	 * @see #getMass_heat_coeff()
	 * @generated
	 */
	void setMass_heat_coeff(String value);

	/**
	 * Returns the value of the '<em><b>Outdoor temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outdoor temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outdoor temperature</em>' attribute.
	 * @see #setOutdoor_temperature(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Outdoor_temperature()
	 * @model
	 * @generated
	 */
	String getOutdoor_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getOutdoor_temperature <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outdoor temperature</em>' attribute.
	 * @see #getOutdoor_temperature()
	 * @generated
	 */
	void setOutdoor_temperature(String value);

	/**
	 * Returns the value of the '<em><b>House thermal mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House thermal mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House thermal mass</em>' attribute.
	 * @see #setHouse_thermal_mass(String)
	 * @see visGrid.VisGridPackage#getHouse_a_House_thermal_mass()
	 * @model
	 * @generated
	 */
	String getHouse_thermal_mass();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouse_thermal_mass <em>House thermal mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House thermal mass</em>' attribute.
	 * @see #getHouse_thermal_mass()
	 * @generated
	 */
	void setHouse_thermal_mass(String value);

	/**
	 * Returns the value of the '<em><b>Heat mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heat mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heat mode</em>' attribute.
	 * @see #setHeat_mode(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Heat_mode()
	 * @model
	 * @generated
	 */
	String getHeat_mode();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHeat_mode <em>Heat mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat mode</em>' attribute.
	 * @see #getHeat_mode()
	 * @generated
	 */
	void setHeat_mode(String value);

	/**
	 * Returns the value of the '<em><b>Hc mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hc mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hc mode</em>' attribute.
	 * @see #setHc_mode(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Hc_mode()
	 * @model
	 * @generated
	 */
	String getHc_mode();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHc_mode <em>Hc mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hc mode</em>' attribute.
	 * @see #getHc_mode()
	 * @generated
	 */
	void setHc_mode(String value);

	/**
	 * Returns the value of the '<em><b>Houseload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload</em>' attribute.
	 * @see #setHouseload(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload()
	 * @model
	 * @generated
	 */
	String getHouseload();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload <em>Houseload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload</em>' attribute.
	 * @see #getHouseload()
	 * @generated
	 */
	void setHouseload(String value);

	/**
	 * Returns the value of the '<em><b>Houseload energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload energy</em>' attribute.
	 * @see #setHouseload__energy(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__energy()
	 * @model
	 * @generated
	 */
	String getHouseload__energy();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__energy <em>Houseload energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload energy</em>' attribute.
	 * @see #getHouseload__energy()
	 * @generated
	 */
	void setHouseload__energy(String value);

	/**
	 * Returns the value of the '<em><b>Houseload power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload power</em>' attribute.
	 * @see #setHouseload__power(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__power()
	 * @model
	 * @generated
	 */
	String getHouseload__power();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__power <em>Houseload power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload power</em>' attribute.
	 * @see #getHouseload__power()
	 * @generated
	 */
	void setHouseload__power(String value);

	/**
	 * Returns the value of the '<em><b>Houseload peak demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload peak demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload peak demand</em>' attribute.
	 * @see #setHouseload__peak_demand(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__peak_demand()
	 * @model
	 * @generated
	 */
	String getHouseload__peak_demand();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__peak_demand <em>Houseload peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload peak demand</em>' attribute.
	 * @see #getHouseload__peak_demand()
	 * @generated
	 */
	void setHouseload__peak_demand(String value);

	/**
	 * Returns the value of the '<em><b>Houseload heatgain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload heatgain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload heatgain</em>' attribute.
	 * @see #setHouseload__heatgain(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__heatgain()
	 * @model
	 * @generated
	 */
	String getHouseload__heatgain();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__heatgain <em>Houseload heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload heatgain</em>' attribute.
	 * @see #getHouseload__heatgain()
	 * @generated
	 */
	void setHouseload__heatgain(String value);

	/**
	 * Returns the value of the '<em><b>Houseload heatgain fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload heatgain fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload heatgain fraction</em>' attribute.
	 * @see #setHouseload__heatgain_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHouseload__heatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__heatgain_fraction <em>Houseload heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload heatgain fraction</em>' attribute.
	 * @see #getHouseload__heatgain_fraction()
	 * @generated
	 */
	void setHouseload__heatgain_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Houseload current fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload current fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload current fraction</em>' attribute.
	 * @see #setHouseload__current_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__current_fraction()
	 * @model
	 * @generated
	 */
	String getHouseload__current_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__current_fraction <em>Houseload current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload current fraction</em>' attribute.
	 * @see #getHouseload__current_fraction()
	 * @generated
	 */
	void setHouseload__current_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Houseload impedance fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload impedance fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload impedance fraction</em>' attribute.
	 * @see #setHouseload__impedance_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__impedance_fraction()
	 * @model
	 * @generated
	 */
	String getHouseload__impedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__impedance_fraction <em>Houseload impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload impedance fraction</em>' attribute.
	 * @see #getHouseload__impedance_fraction()
	 * @generated
	 */
	void setHouseload__impedance_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Houseload power fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload power fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload power fraction</em>' attribute.
	 * @see #setHouseload__power_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__power_fraction()
	 * @model
	 * @generated
	 */
	String getHouseload__power_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__power_fraction <em>Houseload power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload power fraction</em>' attribute.
	 * @see #getHouseload__power_fraction()
	 * @generated
	 */
	void setHouseload__power_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Houseload power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload power factor</em>' attribute.
	 * @see #setHouseload__power_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__power_factor()
	 * @model
	 * @generated
	 */
	String getHouseload__power_factor();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__power_factor <em>Houseload power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload power factor</em>' attribute.
	 * @see #getHouseload__power_factor()
	 * @generated
	 */
	void setHouseload__power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Houseload constant power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload constant power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload constant power</em>' attribute.
	 * @see #setHouseload__constant_power(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__constant_power()
	 * @model
	 * @generated
	 */
	String getHouseload__constant_power();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__constant_power <em>Houseload constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload constant power</em>' attribute.
	 * @see #getHouseload__constant_power()
	 * @generated
	 */
	void setHouseload__constant_power(String value);

	/**
	 * Returns the value of the '<em><b>Houseload constant current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload constant current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload constant current</em>' attribute.
	 * @see #setHouseload__constant_current(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__constant_current()
	 * @model
	 * @generated
	 */
	String getHouseload__constant_current();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__constant_current <em>Houseload constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload constant current</em>' attribute.
	 * @see #getHouseload__constant_current()
	 * @generated
	 */
	void setHouseload__constant_current(String value);

	/**
	 * Returns the value of the '<em><b>Houseload constant admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload constant admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload constant admittance</em>' attribute.
	 * @see #setHouseload__constant_admittance(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__constant_admittance()
	 * @model
	 * @generated
	 */
	String getHouseload__constant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__constant_admittance <em>Houseload constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload constant admittance</em>' attribute.
	 * @see #getHouseload__constant_admittance()
	 * @generated
	 */
	void setHouseload__constant_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Houseload voltage factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload voltage factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload voltage factor</em>' attribute.
	 * @see #setHouseload__voltage_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__voltage_factor()
	 * @model
	 * @generated
	 */
	String getHouseload__voltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__voltage_factor <em>Houseload voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload voltage factor</em>' attribute.
	 * @see #getHouseload__voltage_factor()
	 * @generated
	 */
	void setHouseload__voltage_factor(String value);

	/**
	 * Returns the value of the '<em><b>Houseload configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houseload configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houseload configuration</em>' attribute.
	 * @see #setHouseload__configuration(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Houseload__configuration()
	 * @model
	 * @generated
	 */
	String getHouseload__configuration();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHouseload__configuration <em>Houseload configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Houseload configuration</em>' attribute.
	 * @see #getHouseload__configuration()
	 * @generated
	 */
	void setHouseload__configuration(String value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

	/**
	 * Returns the value of the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' attribute.
	 * @see #setLoad(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_a_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getEnergy <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy</em>' attribute.
	 * @see #getEnergy()
	 * @generated
	 */
	void setEnergy(String value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(String value);

	/**
	 * Returns the value of the '<em><b>Peak demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peak demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak demand</em>' attribute.
	 * @see #setPeak_demand(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Peak_demand()
	 * @model
	 * @generated
	 */
	String getPeak_demand();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getPeak_demand <em>Peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak demand</em>' attribute.
	 * @see #getPeak_demand()
	 * @generated
	 */
	void setPeak_demand(String value);

	/**
	 * Returns the value of the '<em><b>Heatgain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heatgain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heatgain</em>' attribute.
	 * @see #setHeatgain(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Heatgain()
	 * @model
	 * @generated
	 */
	String getHeatgain();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHeatgain <em>Heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heatgain</em>' attribute.
	 * @see #getHeatgain()
	 * @generated
	 */
	void setHeatgain(String value);

	/**
	 * Returns the value of the '<em><b>Heatgain fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heatgain fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heatgain fraction</em>' attribute.
	 * @see #setHeatgain_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHeatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getHeatgain_fraction <em>Heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heatgain fraction</em>' attribute.
	 * @see #getHeatgain_fraction()
	 * @generated
	 */
	void setHeatgain_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Current fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current fraction</em>' attribute.
	 * @see #setCurrent_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Current_fraction()
	 * @model
	 * @generated
	 */
	String getCurrent_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getCurrent_fraction <em>Current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current fraction</em>' attribute.
	 * @see #getCurrent_fraction()
	 * @generated
	 */
	void setCurrent_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Impedance fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impedance fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impedance fraction</em>' attribute.
	 * @see #setImpedance_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Impedance_fraction()
	 * @model
	 * @generated
	 */
	String getImpedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getImpedance_fraction <em>Impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impedance fraction</em>' attribute.
	 * @see #getImpedance_fraction()
	 * @generated
	 */
	void setImpedance_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Power fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power fraction</em>' attribute.
	 * @see #setPower_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Power_fraction()
	 * @model
	 * @generated
	 */
	String getPower_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getPower_fraction <em>Power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power fraction</em>' attribute.
	 * @see #getPower_fraction()
	 * @generated
	 */
	void setPower_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power factor</em>' attribute.
	 * @see #setPower_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getPower_factor <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power factor</em>' attribute.
	 * @see #getPower_factor()
	 * @generated
	 */
	void setPower_factor(String value);

	/**
	 * Returns the value of the '<em><b>Constant power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant power</em>' attribute.
	 * @see #setConstant_power(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Constant_power()
	 * @model
	 * @generated
	 */
	String getConstant_power();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getConstant_power <em>Constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant power</em>' attribute.
	 * @see #getConstant_power()
	 * @generated
	 */
	void setConstant_power(String value);

	/**
	 * Returns the value of the '<em><b>Constant current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant current</em>' attribute.
	 * @see #setConstant_current(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Constant_current()
	 * @model
	 * @generated
	 */
	String getConstant_current();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getConstant_current <em>Constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant current</em>' attribute.
	 * @see #getConstant_current()
	 * @generated
	 */
	void setConstant_current(String value);

	/**
	 * Returns the value of the '<em><b>Constant admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant admittance</em>' attribute.
	 * @see #setConstant_admittance(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Constant_admittance()
	 * @model
	 * @generated
	 */
	String getConstant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getConstant_admittance <em>Constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant admittance</em>' attribute.
	 * @see #getConstant_admittance()
	 * @generated
	 */
	void setConstant_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Voltage factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltage factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage factor</em>' attribute.
	 * @see #setVoltage_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Voltage_factor()
	 * @model
	 * @generated
	 */
	String getVoltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getVoltage_factor <em>Voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage factor</em>' attribute.
	 * @see #getVoltage_factor()
	 * @generated
	 */
	void setVoltage_factor(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' attribute.
	 * @see #setOverride(String)
	 * @see visGrid.VisGridPackage#getHouse_a_Override()
	 * @model
	 * @generated
	 */
	String getOverride();

	/**
	 * Sets the value of the '{@link visGrid.House_a#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(String value);

} // House_a
