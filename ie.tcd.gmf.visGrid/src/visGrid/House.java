/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.House#getWeather <em>Weather</em>}</li>
 *   <li>{@link visGrid.House#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link visGrid.House#getGross_wall_area <em>Gross wall area</em>}</li>
 *   <li>{@link visGrid.House#getCeiling_height <em>Ceiling height</em>}</li>
 *   <li>{@link visGrid.House#getAspect_ratio <em>Aspect ratio</em>}</li>
 *   <li>{@link visGrid.House#getEnvelope_UA <em>Envelope UA</em>}</li>
 *   <li>{@link visGrid.House#getWindow_wall_ratio <em>Window wall ratio</em>}</li>
 *   <li>{@link visGrid.House#getNumber_of_doors <em>Number of doors</em>}</li>
 *   <li>{@link visGrid.House#getExterior_wall_fraction <em>Exterior wall fraction</em>}</li>
 *   <li>{@link visGrid.House#getInterior_exterior_wall_ratio <em>Interior exterior wall ratio</em>}</li>
 *   <li>{@link visGrid.House#getExterior_ceiling_fraction <em>Exterior ceiling fraction</em>}</li>
 *   <li>{@link visGrid.House#getExterior_floor_fraction <em>Exterior floor fraction</em>}</li>
 *   <li>{@link visGrid.House#getWindow_shading <em>Window shading</em>}</li>
 *   <li>{@link visGrid.House#getWindow_exterior_transmission_coefficient <em>Window exterior transmission coefficient</em>}</li>
 *   <li>{@link visGrid.House#getSolar_heatgain_factor <em>Solar heatgain factor</em>}</li>
 *   <li>{@link visGrid.House#getAirchange_per_hour <em>Airchange per hour</em>}</li>
 *   <li>{@link visGrid.House#getAirchange_UA <em>Airchange UA</em>}</li>
 *   <li>{@link visGrid.House#getInternal_gain <em>Internal gain</em>}</li>
 *   <li>{@link visGrid.House#getSolar_gain <em>Solar gain</em>}</li>
 *   <li>{@link visGrid.House#getHeat_cool_gain <em>Heat cool gain</em>}</li>
 *   <li>{@link visGrid.House#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.House#getThermostat_cycle_time <em>Thermostat cycle time</em>}</li>
 *   <li>{@link visGrid.House#getThermostat_last_cycle_time <em>Thermostat last cycle time</em>}</li>
 *   <li>{@link visGrid.House#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link visGrid.House#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link visGrid.House#getDesign_heating_setpoint <em>Design heating setpoint</em>}</li>
 *   <li>{@link visGrid.House#getDesign_cooling_setpoint <em>Design cooling setpoint</em>}</li>
 *   <li>{@link visGrid.House#getDesign_heating_capacity <em>Design heating capacity</em>}</li>
 *   <li>{@link visGrid.House#getDesign_cooling_capacity <em>Design cooling capacity</em>}</li>
 *   <li>{@link visGrid.House#getAdj_heating_cap <em>Adj heating cap</em>}</li>
 *   <li>{@link visGrid.House#getSys_rated_cap <em>Sys rated cap</em>}</li>
 *   <li>{@link visGrid.House#getCooling_design_temperature <em>Cooling design temperature</em>}</li>
 *   <li>{@link visGrid.House#getHeating_design_temperature <em>Heating design temperature</em>}</li>
 *   <li>{@link visGrid.House#getDesign_peak_solar <em>Design peak solar</em>}</li>
 *   <li>{@link visGrid.House#getDesign_internal_gains <em>Design internal gains</em>}</li>
 *   <li>{@link visGrid.House#getAir_heat_fraction <em>Air heat fraction</em>}</li>
 *   <li>{@link visGrid.House#getAuxiliary_heat_capacity <em>Auxiliary heat capacity</em>}</li>
 *   <li>{@link visGrid.House#getAux_heat_deadband <em>Aux heat deadband</em>}</li>
 *   <li>{@link visGrid.House#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}</li>
 *   <li>{@link visGrid.House#getAux_heat_time_delay <em>Aux heat time delay</em>}</li>
 *   <li>{@link visGrid.House#getCooling_supply_air_temp <em>Cooling supply air temp</em>}</li>
 *   <li>{@link visGrid.House#getHeating_supply_air_temp <em>Heating supply air temp</em>}</li>
 *   <li>{@link visGrid.House#getDuct_pressure_drop <em>Duct pressure drop</em>}</li>
 *   <li>{@link visGrid.House#getFan_design_power <em>Fan design power</em>}</li>
 *   <li>{@link visGrid.House#getFan_low_power_fraction <em>Fan low power fraction</em>}</li>
 *   <li>{@link visGrid.House#getFan_power <em>Fan power</em>}</li>
 *   <li>{@link visGrid.House#getFan_design_airflow <em>Fan design airflow</em>}</li>
 *   <li>{@link visGrid.House#getFan_impedance_fraction <em>Fan impedance fraction</em>}</li>
 *   <li>{@link visGrid.House#getFan_power_fraction <em>Fan power fraction</em>}</li>
 *   <li>{@link visGrid.House#getFan_current_fraction <em>Fan current fraction</em>}</li>
 *   <li>{@link visGrid.House#getFan_power_factor <em>Fan power factor</em>}</li>
 *   <li>{@link visGrid.House#getHeating_demand <em>Heating demand</em>}</li>
 *   <li>{@link visGrid.House#getCooling_demand <em>Cooling demand</em>}</li>
 *   <li>{@link visGrid.House#getHeating_COP <em>Heating COP</em>}</li>
 *   <li>{@link visGrid.House#getCooling_COP <em>Cooling COP</em>}</li>
 *   <li>{@link visGrid.House#getAdj_heating_cop <em>Adj heating cop</em>}</li>
 *   <li>{@link visGrid.House#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link visGrid.House#getOutdoor_temperature <em>Outdoor temperature</em>}</li>
 *   <li>{@link visGrid.House#getMass_heat_capacity <em>Mass heat capacity</em>}</li>
 *   <li>{@link visGrid.House#getMass_heat_coeff <em>Mass heat coeff</em>}</li>
 *   <li>{@link visGrid.House#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link visGrid.House#getAir_volume <em>Air volume</em>}</li>
 *   <li>{@link visGrid.House#getAir_mass <em>Air mass</em>}</li>
 *   <li>{@link visGrid.House#getAir_heat_capacity <em>Air heat capacity</em>}</li>
 *   <li>{@link visGrid.House#getLatent_load_fraction <em>Latent load fraction</em>}</li>
 *   <li>{@link visGrid.House#getTotal_thermal_mass_per_floor_area <em>Total thermal mass per floor area</em>}</li>
 *   <li>{@link visGrid.House#getInterior_surface_heat_transfer_coeff <em>Interior surface heat transfer coeff</em>}</li>
 *   <li>{@link visGrid.House#getNumber_of_stories <em>Number of stories</em>}</li>
 *   <li>{@link visGrid.House#getSystem_type <em>System type</em>}</li>
 *   <li>{@link visGrid.House#getAuxiliary_strategy <em>Auxiliary strategy</em>}</li>
 *   <li>{@link visGrid.House#getSystem_mode <em>System mode</em>}</li>
 *   <li>{@link visGrid.House#getHeating_system_type <em>Heating system type</em>}</li>
 *   <li>{@link visGrid.House#getCooling_system_type <em>Cooling system type</em>}</li>
 *   <li>{@link visGrid.House#getAuxiliary_system_type <em>Auxiliary system type</em>}</li>
 *   <li>{@link visGrid.House#getFan_type <em>Fan type</em>}</li>
 *   <li>{@link visGrid.House#getThermal_integrity_level <em>Thermal integrity level</em>}</li>
 *   <li>{@link visGrid.House#getGlass_type <em>Glass type</em>}</li>
 *   <li>{@link visGrid.House#getWindow_frame <em>Window frame</em>}</li>
 *   <li>{@link visGrid.House#getGlazing_treatment <em>Glazing treatment</em>}</li>
 *   <li>{@link visGrid.House#getGlazing_layers <em>Glazing layers</em>}</li>
 *   <li>{@link visGrid.House#getMotor_model <em>Motor model</em>}</li>
 *   <li>{@link visGrid.House#getMotor_efficiency <em>Motor efficiency</em>}</li>
 *   <li>{@link visGrid.House#getHvac_motor_efficiency <em>Hvac motor efficiency</em>}</li>
 *   <li>{@link visGrid.House#getHvac_motor_loss_power_factor <em>Hvac motor loss power factor</em>}</li>
 *   <li>{@link visGrid.House#getRroof <em>Rroof</em>}</li>
 *   <li>{@link visGrid.House#getRwall <em>Rwall</em>}</li>
 *   <li>{@link visGrid.House#getRfloor <em>Rfloor</em>}</li>
 *   <li>{@link visGrid.House#getRwindows <em>Rwindows</em>}</li>
 *   <li>{@link visGrid.House#getRdoors <em>Rdoors</em>}</li>
 *   <li>{@link visGrid.House#getHvac_breaker_rating <em>Hvac breaker rating</em>}</li>
 *   <li>{@link visGrid.House#getHvac_power_factor <em>Hvac power factor</em>}</li>
 *   <li>{@link visGrid.House#getHvac_load <em>Hvac load</em>}</li>
 *   <li>{@link visGrid.House#getPanel <em>Panel</em>}</li>
 *   <li>{@link visGrid.House#getPanel__energy <em>Panel energy</em>}</li>
 *   <li>{@link visGrid.House#getPanel__power <em>Panel power</em>}</li>
 *   <li>{@link visGrid.House#getPanel__peak_demand <em>Panel peak demand</em>}</li>
 *   <li>{@link visGrid.House#getPanel__heatgain <em>Panel heatgain</em>}</li>
 *   <li>{@link visGrid.House#getPanel__heatgain_fraction <em>Panel heatgain fraction</em>}</li>
 *   <li>{@link visGrid.House#getPanel__current_fraction <em>Panel current fraction</em>}</li>
 *   <li>{@link visGrid.House#getPanel__impedance_fraction <em>Panel impedance fraction</em>}</li>
 *   <li>{@link visGrid.House#getPanel__power_fraction <em>Panel power fraction</em>}</li>
 *   <li>{@link visGrid.House#getPanel__power_factor <em>Panel power factor</em>}</li>
 *   <li>{@link visGrid.House#getPanel__constant_power <em>Panel constant power</em>}</li>
 *   <li>{@link visGrid.House#getPanel__constant_current <em>Panel constant current</em>}</li>
 *   <li>{@link visGrid.House#getPanel__constant_admittance <em>Panel constant admittance</em>}</li>
 *   <li>{@link visGrid.House#getPanel__voltage_factor <em>Panel voltage factor</em>}</li>
 *   <li>{@link visGrid.House#getPanel__configuration <em>Panel configuration</em>}</li>
 *   <li>{@link visGrid.House#getDesign_internal_gain_density <em>Design internal gain density</em>}</li>
 *   <li>{@link visGrid.House#getA <em>A</em>}</li>
 *   <li>{@link visGrid.House#getB <em>B</em>}</li>
 *   <li>{@link visGrid.House#getC <em>C</em>}</li>
 *   <li>{@link visGrid.House#getD <em>D</em>}</li>
 *   <li>{@link visGrid.House#getC1 <em>C1</em>}</li>
 *   <li>{@link visGrid.House#getC2 <em>C2</em>}</li>
 *   <li>{@link visGrid.House#getA3 <em>A3</em>}</li>
 *   <li>{@link visGrid.House#getA4 <em>A4</em>}</li>
 *   <li>{@link visGrid.House#getK1 <em>K1</em>}</li>
 *   <li>{@link visGrid.House#getK2 <em>K2</em>}</li>
 *   <li>{@link visGrid.House#getR1 <em>R1</em>}</li>
 *   <li>{@link visGrid.House#getR2 <em>R2</em>}</li>
 *   <li>{@link visGrid.House#getTeq <em>Teq</em>}</li>
 *   <li>{@link visGrid.House#getTevent <em>Tevent</em>}</li>
 *   <li>{@link visGrid.House#getQi <em>Qi</em>}</li>
 *   <li>{@link visGrid.House#getQa <em>Qa</em>}</li>
 *   <li>{@link visGrid.House#getQm <em>Qm</em>}</li>
 *   <li>{@link visGrid.House#getQh <em>Qh</em>}</li>
 *   <li>{@link visGrid.House#getDTair <em>DTair</em>}</li>
 *   <li>{@link visGrid.House#getSol_inc <em>Sol inc</em>}</li>
 *   <li>{@link visGrid.House#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.House#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.House#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.House#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.House#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.House#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.House#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.House#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.House#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.House#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.House#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.House#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.House#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.House#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.House#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.House#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.House#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends Connection {
	/**
	 * Returns the value of the '<em><b>Weather</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weather</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather</em>' attribute.
	 * @see #setWeather(String)
	 * @see visGrid.VisGridPackage#getHouse_Weather()
	 * @model
	 * @generated
	 */
	String getWeather();

	/**
	 * Sets the value of the '{@link visGrid.House#getWeather <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weather</em>' attribute.
	 * @see #getWeather()
	 * @generated
	 */
	void setWeather(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Floor_area()
	 * @model
	 * @generated
	 */
	String getFloor_area();

	/**
	 * Sets the value of the '{@link visGrid.House#getFloor_area <em>Floor area</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Gross_wall_area()
	 * @model
	 * @generated
	 */
	String getGross_wall_area();

	/**
	 * Sets the value of the '{@link visGrid.House#getGross_wall_area <em>Gross wall area</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Ceiling_height()
	 * @model
	 * @generated
	 */
	String getCeiling_height();

	/**
	 * Sets the value of the '{@link visGrid.House#getCeiling_height <em>Ceiling height</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Aspect_ratio()
	 * @model
	 * @generated
	 */
	String getAspect_ratio();

	/**
	 * Sets the value of the '{@link visGrid.House#getAspect_ratio <em>Aspect ratio</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Envelope_UA()
	 * @model
	 * @generated
	 */
	String getEnvelope_UA();

	/**
	 * Sets the value of the '{@link visGrid.House#getEnvelope_UA <em>Envelope UA</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Window_wall_ratio()
	 * @model
	 * @generated
	 */
	String getWindow_wall_ratio();

	/**
	 * Sets the value of the '{@link visGrid.House#getWindow_wall_ratio <em>Window wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window wall ratio</em>' attribute.
	 * @see #getWindow_wall_ratio()
	 * @generated
	 */
	void setWindow_wall_ratio(String value);

	/**
	 * Returns the value of the '<em><b>Number of doors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number of doors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of doors</em>' attribute.
	 * @see #setNumber_of_doors(String)
	 * @see visGrid.VisGridPackage#getHouse_Number_of_doors()
	 * @model
	 * @generated
	 */
	String getNumber_of_doors();

	/**
	 * Sets the value of the '{@link visGrid.House#getNumber_of_doors <em>Number of doors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number of doors</em>' attribute.
	 * @see #getNumber_of_doors()
	 * @generated
	 */
	void setNumber_of_doors(String value);

	/**
	 * Returns the value of the '<em><b>Exterior wall fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exterior wall fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exterior wall fraction</em>' attribute.
	 * @see #setExterior_wall_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Exterior_wall_fraction()
	 * @model
	 * @generated
	 */
	String getExterior_wall_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getExterior_wall_fraction <em>Exterior wall fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior wall fraction</em>' attribute.
	 * @see #getExterior_wall_fraction()
	 * @generated
	 */
	void setExterior_wall_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Interior exterior wall ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior exterior wall ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior exterior wall ratio</em>' attribute.
	 * @see #setInterior_exterior_wall_ratio(String)
	 * @see visGrid.VisGridPackage#getHouse_Interior_exterior_wall_ratio()
	 * @model
	 * @generated
	 */
	String getInterior_exterior_wall_ratio();

	/**
	 * Sets the value of the '{@link visGrid.House#getInterior_exterior_wall_ratio <em>Interior exterior wall ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior exterior wall ratio</em>' attribute.
	 * @see #getInterior_exterior_wall_ratio()
	 * @generated
	 */
	void setInterior_exterior_wall_ratio(String value);

	/**
	 * Returns the value of the '<em><b>Exterior ceiling fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exterior ceiling fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exterior ceiling fraction</em>' attribute.
	 * @see #setExterior_ceiling_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Exterior_ceiling_fraction()
	 * @model
	 * @generated
	 */
	String getExterior_ceiling_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getExterior_ceiling_fraction <em>Exterior ceiling fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior ceiling fraction</em>' attribute.
	 * @see #getExterior_ceiling_fraction()
	 * @generated
	 */
	void setExterior_ceiling_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Exterior floor fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exterior floor fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exterior floor fraction</em>' attribute.
	 * @see #setExterior_floor_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Exterior_floor_fraction()
	 * @model
	 * @generated
	 */
	String getExterior_floor_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getExterior_floor_fraction <em>Exterior floor fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior floor fraction</em>' attribute.
	 * @see #getExterior_floor_fraction()
	 * @generated
	 */
	void setExterior_floor_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Window shading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window shading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window shading</em>' attribute.
	 * @see #setWindow_shading(String)
	 * @see visGrid.VisGridPackage#getHouse_Window_shading()
	 * @model
	 * @generated
	 */
	String getWindow_shading();

	/**
	 * Sets the value of the '{@link visGrid.House#getWindow_shading <em>Window shading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window shading</em>' attribute.
	 * @see #getWindow_shading()
	 * @generated
	 */
	void setWindow_shading(String value);

	/**
	 * Returns the value of the '<em><b>Window exterior transmission coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window exterior transmission coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window exterior transmission coefficient</em>' attribute.
	 * @see #setWindow_exterior_transmission_coefficient(String)
	 * @see visGrid.VisGridPackage#getHouse_Window_exterior_transmission_coefficient()
	 * @model
	 * @generated
	 */
	String getWindow_exterior_transmission_coefficient();

	/**
	 * Sets the value of the '{@link visGrid.House#getWindow_exterior_transmission_coefficient <em>Window exterior transmission coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window exterior transmission coefficient</em>' attribute.
	 * @see #getWindow_exterior_transmission_coefficient()
	 * @generated
	 */
	void setWindow_exterior_transmission_coefficient(String value);

	/**
	 * Returns the value of the '<em><b>Solar heatgain factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar heatgain factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar heatgain factor</em>' attribute.
	 * @see #setSolar_heatgain_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_Solar_heatgain_factor()
	 * @model
	 * @generated
	 */
	String getSolar_heatgain_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getSolar_heatgain_factor <em>Solar heatgain factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar heatgain factor</em>' attribute.
	 * @see #getSolar_heatgain_factor()
	 * @generated
	 */
	void setSolar_heatgain_factor(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Airchange_per_hour()
	 * @model
	 * @generated
	 */
	String getAirchange_per_hour();

	/**
	 * Sets the value of the '{@link visGrid.House#getAirchange_per_hour <em>Airchange per hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airchange per hour</em>' attribute.
	 * @see #getAirchange_per_hour()
	 * @generated
	 */
	void setAirchange_per_hour(String value);

	/**
	 * Returns the value of the '<em><b>Airchange UA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Airchange UA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airchange UA</em>' attribute.
	 * @see #setAirchange_UA(String)
	 * @see visGrid.VisGridPackage#getHouse_Airchange_UA()
	 * @model
	 * @generated
	 */
	String getAirchange_UA();

	/**
	 * Sets the value of the '{@link visGrid.House#getAirchange_UA <em>Airchange UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airchange UA</em>' attribute.
	 * @see #getAirchange_UA()
	 * @generated
	 */
	void setAirchange_UA(String value);

	/**
	 * Returns the value of the '<em><b>Internal gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal gain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal gain</em>' attribute.
	 * @see #setInternal_gain(String)
	 * @see visGrid.VisGridPackage#getHouse_Internal_gain()
	 * @model
	 * @generated
	 */
	String getInternal_gain();

	/**
	 * Sets the value of the '{@link visGrid.House#getInternal_gain <em>Internal gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal gain</em>' attribute.
	 * @see #getInternal_gain()
	 * @generated
	 */
	void setInternal_gain(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Solar_gain()
	 * @model
	 * @generated
	 */
	String getSolar_gain();

	/**
	 * Sets the value of the '{@link visGrid.House#getSolar_gain <em>Solar gain</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Heat_cool_gain()
	 * @model
	 * @generated
	 */
	String getHeat_cool_gain();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeat_cool_gain <em>Heat cool gain</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Thermostat_deadband()
	 * @model
	 * @generated
	 */
	String getThermostat_deadband();

	/**
	 * Sets the value of the '{@link visGrid.House#getThermostat_deadband <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #getThermostat_deadband()
	 * @generated
	 */
	void setThermostat_deadband(String value);

	/**
	 * Returns the value of the '<em><b>Thermostat cycle time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermostat cycle time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermostat cycle time</em>' attribute.
	 * @see #setThermostat_cycle_time(String)
	 * @see visGrid.VisGridPackage#getHouse_Thermostat_cycle_time()
	 * @model
	 * @generated
	 */
	String getThermostat_cycle_time();

	/**
	 * Sets the value of the '{@link visGrid.House#getThermostat_cycle_time <em>Thermostat cycle time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat cycle time</em>' attribute.
	 * @see #getThermostat_cycle_time()
	 * @generated
	 */
	void setThermostat_cycle_time(String value);

	/**
	 * Returns the value of the '<em><b>Thermostat last cycle time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermostat last cycle time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermostat last cycle time</em>' attribute.
	 * @see #setThermostat_last_cycle_time(String)
	 * @see visGrid.VisGridPackage#getHouse_Thermostat_last_cycle_time()
	 * @model
	 * @generated
	 */
	String getThermostat_last_cycle_time();

	/**
	 * Sets the value of the '{@link visGrid.House#getThermostat_last_cycle_time <em>Thermostat last cycle time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat last cycle time</em>' attribute.
	 * @see #getThermostat_last_cycle_time()
	 * @generated
	 */
	void setThermostat_last_cycle_time(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Heating_setpoint()
	 * @model
	 * @generated
	 */
	String getHeating_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeating_setpoint <em>Heating setpoint</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Cooling_setpoint()
	 * @model
	 * @generated
	 */
	String getCooling_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.House#getCooling_setpoint <em>Cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling setpoint</em>' attribute.
	 * @see #getCooling_setpoint()
	 * @generated
	 */
	void setCooling_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Design heating setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design heating setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design heating setpoint</em>' attribute.
	 * @see #setDesign_heating_setpoint(String)
	 * @see visGrid.VisGridPackage#getHouse_Design_heating_setpoint()
	 * @model
	 * @generated
	 */
	String getDesign_heating_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_heating_setpoint <em>Design heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design heating setpoint</em>' attribute.
	 * @see #getDesign_heating_setpoint()
	 * @generated
	 */
	void setDesign_heating_setpoint(String value);

	/**
	 * Returns the value of the '<em><b>Design cooling setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design cooling setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design cooling setpoint</em>' attribute.
	 * @see #setDesign_cooling_setpoint(String)
	 * @see visGrid.VisGridPackage#getHouse_Design_cooling_setpoint()
	 * @model
	 * @generated
	 */
	String getDesign_cooling_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_cooling_setpoint <em>Design cooling setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design cooling setpoint</em>' attribute.
	 * @see #getDesign_cooling_setpoint()
	 * @generated
	 */
	void setDesign_cooling_setpoint(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Design_heating_capacity()
	 * @model
	 * @generated
	 */
	String getDesign_heating_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_heating_capacity <em>Design heating capacity</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Design_cooling_capacity()
	 * @model
	 * @generated
	 */
	String getDesign_cooling_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_cooling_capacity <em>Design cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design cooling capacity</em>' attribute.
	 * @see #getDesign_cooling_capacity()
	 * @generated
	 */
	void setDesign_cooling_capacity(String value);

	/**
	 * Returns the value of the '<em><b>Adj heating cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adj heating cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adj heating cap</em>' attribute.
	 * @see #setAdj_heating_cap(String)
	 * @see visGrid.VisGridPackage#getHouse_Adj_heating_cap()
	 * @model
	 * @generated
	 */
	String getAdj_heating_cap();

	/**
	 * Sets the value of the '{@link visGrid.House#getAdj_heating_cap <em>Adj heating cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adj heating cap</em>' attribute.
	 * @see #getAdj_heating_cap()
	 * @generated
	 */
	void setAdj_heating_cap(String value);

	/**
	 * Returns the value of the '<em><b>Sys rated cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys rated cap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys rated cap</em>' attribute.
	 * @see #setSys_rated_cap(String)
	 * @see visGrid.VisGridPackage#getHouse_Sys_rated_cap()
	 * @model
	 * @generated
	 */
	String getSys_rated_cap();

	/**
	 * Sets the value of the '{@link visGrid.House#getSys_rated_cap <em>Sys rated cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys rated cap</em>' attribute.
	 * @see #getSys_rated_cap()
	 * @generated
	 */
	void setSys_rated_cap(String value);

	/**
	 * Returns the value of the '<em><b>Cooling design temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling design temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling design temperature</em>' attribute.
	 * @see #setCooling_design_temperature(String)
	 * @see visGrid.VisGridPackage#getHouse_Cooling_design_temperature()
	 * @model
	 * @generated
	 */
	String getCooling_design_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House#getCooling_design_temperature <em>Cooling design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling design temperature</em>' attribute.
	 * @see #getCooling_design_temperature()
	 * @generated
	 */
	void setCooling_design_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Heating design temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating design temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating design temperature</em>' attribute.
	 * @see #setHeating_design_temperature(String)
	 * @see visGrid.VisGridPackage#getHouse_Heating_design_temperature()
	 * @model
	 * @generated
	 */
	String getHeating_design_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeating_design_temperature <em>Heating design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating design temperature</em>' attribute.
	 * @see #getHeating_design_temperature()
	 * @generated
	 */
	void setHeating_design_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Design peak solar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design peak solar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design peak solar</em>' attribute.
	 * @see #setDesign_peak_solar(String)
	 * @see visGrid.VisGridPackage#getHouse_Design_peak_solar()
	 * @model
	 * @generated
	 */
	String getDesign_peak_solar();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_peak_solar <em>Design peak solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design peak solar</em>' attribute.
	 * @see #getDesign_peak_solar()
	 * @generated
	 */
	void setDesign_peak_solar(String value);

	/**
	 * Returns the value of the '<em><b>Design internal gains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design internal gains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design internal gains</em>' attribute.
	 * @see #setDesign_internal_gains(String)
	 * @see visGrid.VisGridPackage#getHouse_Design_internal_gains()
	 * @model
	 * @generated
	 */
	String getDesign_internal_gains();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_internal_gains <em>Design internal gains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design internal gains</em>' attribute.
	 * @see #getDesign_internal_gains()
	 * @generated
	 */
	void setDesign_internal_gains(String value);

	/**
	 * Returns the value of the '<em><b>Air heat fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air heat fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air heat fraction</em>' attribute.
	 * @see #setAir_heat_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Air_heat_fraction()
	 * @model
	 * @generated
	 */
	String getAir_heat_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getAir_heat_fraction <em>Air heat fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air heat fraction</em>' attribute.
	 * @see #getAir_heat_fraction()
	 * @generated
	 */
	void setAir_heat_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Auxiliary heat capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary heat capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary heat capacity</em>' attribute.
	 * @see #setAuxiliary_heat_capacity(String)
	 * @see visGrid.VisGridPackage#getHouse_Auxiliary_heat_capacity()
	 * @model
	 * @generated
	 */
	String getAuxiliary_heat_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House#getAuxiliary_heat_capacity <em>Auxiliary heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary heat capacity</em>' attribute.
	 * @see #getAuxiliary_heat_capacity()
	 * @generated
	 */
	void setAuxiliary_heat_capacity(String value);

	/**
	 * Returns the value of the '<em><b>Aux heat deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux heat deadband</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux heat deadband</em>' attribute.
	 * @see #setAux_heat_deadband(String)
	 * @see visGrid.VisGridPackage#getHouse_Aux_heat_deadband()
	 * @model
	 * @generated
	 */
	String getAux_heat_deadband();

	/**
	 * Sets the value of the '{@link visGrid.House#getAux_heat_deadband <em>Aux heat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux heat deadband</em>' attribute.
	 * @see #getAux_heat_deadband()
	 * @generated
	 */
	void setAux_heat_deadband(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Aux_heat_temperature_lockout()
	 * @model
	 * @generated
	 */
	String getAux_heat_temperature_lockout();

	/**
	 * Sets the value of the '{@link visGrid.House#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux heat temperature lockout</em>' attribute.
	 * @see #getAux_heat_temperature_lockout()
	 * @generated
	 */
	void setAux_heat_temperature_lockout(String value);

	/**
	 * Returns the value of the '<em><b>Aux heat time delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux heat time delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux heat time delay</em>' attribute.
	 * @see #setAux_heat_time_delay(String)
	 * @see visGrid.VisGridPackage#getHouse_Aux_heat_time_delay()
	 * @model
	 * @generated
	 */
	String getAux_heat_time_delay();

	/**
	 * Sets the value of the '{@link visGrid.House#getAux_heat_time_delay <em>Aux heat time delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux heat time delay</em>' attribute.
	 * @see #getAux_heat_time_delay()
	 * @generated
	 */
	void setAux_heat_time_delay(String value);

	/**
	 * Returns the value of the '<em><b>Cooling supply air temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling supply air temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling supply air temp</em>' attribute.
	 * @see #setCooling_supply_air_temp(String)
	 * @see visGrid.VisGridPackage#getHouse_Cooling_supply_air_temp()
	 * @model
	 * @generated
	 */
	String getCooling_supply_air_temp();

	/**
	 * Sets the value of the '{@link visGrid.House#getCooling_supply_air_temp <em>Cooling supply air temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling supply air temp</em>' attribute.
	 * @see #getCooling_supply_air_temp()
	 * @generated
	 */
	void setCooling_supply_air_temp(String value);

	/**
	 * Returns the value of the '<em><b>Heating supply air temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating supply air temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating supply air temp</em>' attribute.
	 * @see #setHeating_supply_air_temp(String)
	 * @see visGrid.VisGridPackage#getHouse_Heating_supply_air_temp()
	 * @model
	 * @generated
	 */
	String getHeating_supply_air_temp();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeating_supply_air_temp <em>Heating supply air temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating supply air temp</em>' attribute.
	 * @see #getHeating_supply_air_temp()
	 * @generated
	 */
	void setHeating_supply_air_temp(String value);

	/**
	 * Returns the value of the '<em><b>Duct pressure drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duct pressure drop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duct pressure drop</em>' attribute.
	 * @see #setDuct_pressure_drop(String)
	 * @see visGrid.VisGridPackage#getHouse_Duct_pressure_drop()
	 * @model
	 * @generated
	 */
	String getDuct_pressure_drop();

	/**
	 * Sets the value of the '{@link visGrid.House#getDuct_pressure_drop <em>Duct pressure drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duct pressure drop</em>' attribute.
	 * @see #getDuct_pressure_drop()
	 * @generated
	 */
	void setDuct_pressure_drop(String value);

	/**
	 * Returns the value of the '<em><b>Fan design power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan design power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan design power</em>' attribute.
	 * @see #setFan_design_power(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_design_power()
	 * @model
	 * @generated
	 */
	String getFan_design_power();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_design_power <em>Fan design power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan design power</em>' attribute.
	 * @see #getFan_design_power()
	 * @generated
	 */
	void setFan_design_power(String value);

	/**
	 * Returns the value of the '<em><b>Fan low power fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan low power fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan low power fraction</em>' attribute.
	 * @see #setFan_low_power_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_low_power_fraction()
	 * @model
	 * @generated
	 */
	String getFan_low_power_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_low_power_fraction <em>Fan low power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan low power fraction</em>' attribute.
	 * @see #getFan_low_power_fraction()
	 * @generated
	 */
	void setFan_low_power_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Fan power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan power</em>' attribute.
	 * @see #setFan_power(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_power()
	 * @model
	 * @generated
	 */
	String getFan_power();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_power <em>Fan power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan power</em>' attribute.
	 * @see #getFan_power()
	 * @generated
	 */
	void setFan_power(String value);

	/**
	 * Returns the value of the '<em><b>Fan design airflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan design airflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan design airflow</em>' attribute.
	 * @see #setFan_design_airflow(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_design_airflow()
	 * @model
	 * @generated
	 */
	String getFan_design_airflow();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_design_airflow <em>Fan design airflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan design airflow</em>' attribute.
	 * @see #getFan_design_airflow()
	 * @generated
	 */
	void setFan_design_airflow(String value);

	/**
	 * Returns the value of the '<em><b>Fan impedance fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan impedance fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan impedance fraction</em>' attribute.
	 * @see #setFan_impedance_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_impedance_fraction()
	 * @model
	 * @generated
	 */
	String getFan_impedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_impedance_fraction <em>Fan impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan impedance fraction</em>' attribute.
	 * @see #getFan_impedance_fraction()
	 * @generated
	 */
	void setFan_impedance_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Fan power fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan power fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan power fraction</em>' attribute.
	 * @see #setFan_power_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_power_fraction()
	 * @model
	 * @generated
	 */
	String getFan_power_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_power_fraction <em>Fan power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan power fraction</em>' attribute.
	 * @see #getFan_power_fraction()
	 * @generated
	 */
	void setFan_power_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Fan current fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan current fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan current fraction</em>' attribute.
	 * @see #setFan_current_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_current_fraction()
	 * @model
	 * @generated
	 */
	String getFan_current_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_current_fraction <em>Fan current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan current fraction</em>' attribute.
	 * @see #getFan_current_fraction()
	 * @generated
	 */
	void setFan_current_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Fan power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan power factor</em>' attribute.
	 * @see #setFan_power_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_power_factor()
	 * @model
	 * @generated
	 */
	String getFan_power_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_power_factor <em>Fan power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan power factor</em>' attribute.
	 * @see #getFan_power_factor()
	 * @generated
	 */
	void setFan_power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Heating demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating demand</em>' attribute.
	 * @see #setHeating_demand(String)
	 * @see visGrid.VisGridPackage#getHouse_Heating_demand()
	 * @model
	 * @generated
	 */
	String getHeating_demand();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeating_demand <em>Heating demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating demand</em>' attribute.
	 * @see #getHeating_demand()
	 * @generated
	 */
	void setHeating_demand(String value);

	/**
	 * Returns the value of the '<em><b>Cooling demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling demand</em>' attribute.
	 * @see #setCooling_demand(String)
	 * @see visGrid.VisGridPackage#getHouse_Cooling_demand()
	 * @model
	 * @generated
	 */
	String getCooling_demand();

	/**
	 * Sets the value of the '{@link visGrid.House#getCooling_demand <em>Cooling demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling demand</em>' attribute.
	 * @see #getCooling_demand()
	 * @generated
	 */
	void setCooling_demand(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Heating_COP()
	 * @model
	 * @generated
	 */
	String getHeating_COP();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeating_COP <em>Heating COP</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Cooling_COP()
	 * @model
	 * @generated
	 */
	String getCooling_COP();

	/**
	 * Sets the value of the '{@link visGrid.House#getCooling_COP <em>Cooling COP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling COP</em>' attribute.
	 * @see #getCooling_COP()
	 * @generated
	 */
	void setCooling_COP(String value);

	/**
	 * Returns the value of the '<em><b>Adj heating cop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adj heating cop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adj heating cop</em>' attribute.
	 * @see #setAdj_heating_cop(String)
	 * @see visGrid.VisGridPackage#getHouse_Adj_heating_cop()
	 * @model
	 * @generated
	 */
	String getAdj_heating_cop();

	/**
	 * Sets the value of the '{@link visGrid.House#getAdj_heating_cop <em>Adj heating cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adj heating cop</em>' attribute.
	 * @see #getAdj_heating_cop()
	 * @generated
	 */
	void setAdj_heating_cop(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Air_temperature()
	 * @model
	 * @generated
	 */
	String getAir_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House#getAir_temperature <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air temperature</em>' attribute.
	 * @see #getAir_temperature()
	 * @generated
	 */
	void setAir_temperature(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Outdoor_temperature()
	 * @model
	 * @generated
	 */
	String getOutdoor_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House#getOutdoor_temperature <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outdoor temperature</em>' attribute.
	 * @see #getOutdoor_temperature()
	 * @generated
	 */
	void setOutdoor_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Mass heat capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass heat capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass heat capacity</em>' attribute.
	 * @see #setMass_heat_capacity(String)
	 * @see visGrid.VisGridPackage#getHouse_Mass_heat_capacity()
	 * @model
	 * @generated
	 */
	String getMass_heat_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House#getMass_heat_capacity <em>Mass heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass heat capacity</em>' attribute.
	 * @see #getMass_heat_capacity()
	 * @generated
	 */
	void setMass_heat_capacity(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Mass_heat_coeff()
	 * @model
	 * @generated
	 */
	String getMass_heat_coeff();

	/**
	 * Sets the value of the '{@link visGrid.House#getMass_heat_coeff <em>Mass heat coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass heat coeff</em>' attribute.
	 * @see #getMass_heat_coeff()
	 * @generated
	 */
	void setMass_heat_coeff(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Mass_temperature()
	 * @model
	 * @generated
	 */
	String getMass_temperature();

	/**
	 * Sets the value of the '{@link visGrid.House#getMass_temperature <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass temperature</em>' attribute.
	 * @see #getMass_temperature()
	 * @generated
	 */
	void setMass_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Air volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air volume</em>' attribute.
	 * @see #setAir_volume(String)
	 * @see visGrid.VisGridPackage#getHouse_Air_volume()
	 * @model
	 * @generated
	 */
	String getAir_volume();

	/**
	 * Sets the value of the '{@link visGrid.House#getAir_volume <em>Air volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air volume</em>' attribute.
	 * @see #getAir_volume()
	 * @generated
	 */
	void setAir_volume(String value);

	/**
	 * Returns the value of the '<em><b>Air mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air mass</em>' attribute.
	 * @see #setAir_mass(String)
	 * @see visGrid.VisGridPackage#getHouse_Air_mass()
	 * @model
	 * @generated
	 */
	String getAir_mass();

	/**
	 * Sets the value of the '{@link visGrid.House#getAir_mass <em>Air mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air mass</em>' attribute.
	 * @see #getAir_mass()
	 * @generated
	 */
	void setAir_mass(String value);

	/**
	 * Returns the value of the '<em><b>Air heat capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Air heat capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air heat capacity</em>' attribute.
	 * @see #setAir_heat_capacity(String)
	 * @see visGrid.VisGridPackage#getHouse_Air_heat_capacity()
	 * @model
	 * @generated
	 */
	String getAir_heat_capacity();

	/**
	 * Sets the value of the '{@link visGrid.House#getAir_heat_capacity <em>Air heat capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air heat capacity</em>' attribute.
	 * @see #getAir_heat_capacity()
	 * @generated
	 */
	void setAir_heat_capacity(String value);

	/**
	 * Returns the value of the '<em><b>Latent load fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latent load fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latent load fraction</em>' attribute.
	 * @see #setLatent_load_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Latent_load_fraction()
	 * @model
	 * @generated
	 */
	String getLatent_load_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getLatent_load_fraction <em>Latent load fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latent load fraction</em>' attribute.
	 * @see #getLatent_load_fraction()
	 * @generated
	 */
	void setLatent_load_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Total thermal mass per floor area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total thermal mass per floor area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total thermal mass per floor area</em>' attribute.
	 * @see #setTotal_thermal_mass_per_floor_area(String)
	 * @see visGrid.VisGridPackage#getHouse_Total_thermal_mass_per_floor_area()
	 * @model
	 * @generated
	 */
	String getTotal_thermal_mass_per_floor_area();

	/**
	 * Sets the value of the '{@link visGrid.House#getTotal_thermal_mass_per_floor_area <em>Total thermal mass per floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total thermal mass per floor area</em>' attribute.
	 * @see #getTotal_thermal_mass_per_floor_area()
	 * @generated
	 */
	void setTotal_thermal_mass_per_floor_area(String value);

	/**
	 * Returns the value of the '<em><b>Interior surface heat transfer coeff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior surface heat transfer coeff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior surface heat transfer coeff</em>' attribute.
	 * @see #setInterior_surface_heat_transfer_coeff(String)
	 * @see visGrid.VisGridPackage#getHouse_Interior_surface_heat_transfer_coeff()
	 * @model
	 * @generated
	 */
	String getInterior_surface_heat_transfer_coeff();

	/**
	 * Sets the value of the '{@link visGrid.House#getInterior_surface_heat_transfer_coeff <em>Interior surface heat transfer coeff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior surface heat transfer coeff</em>' attribute.
	 * @see #getInterior_surface_heat_transfer_coeff()
	 * @generated
	 */
	void setInterior_surface_heat_transfer_coeff(String value);

	/**
	 * Returns the value of the '<em><b>Number of stories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number of stories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of stories</em>' attribute.
	 * @see #setNumber_of_stories(String)
	 * @see visGrid.VisGridPackage#getHouse_Number_of_stories()
	 * @model
	 * @generated
	 */
	String getNumber_of_stories();

	/**
	 * Sets the value of the '{@link visGrid.House#getNumber_of_stories <em>Number of stories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number of stories</em>' attribute.
	 * @see #getNumber_of_stories()
	 * @generated
	 */
	void setNumber_of_stories(String value);

	/**
	 * Returns the value of the '<em><b>System type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System type</em>' attribute.
	 * @see #setSystem_type(String)
	 * @see visGrid.VisGridPackage#getHouse_System_type()
	 * @model
	 * @generated
	 */
	String getSystem_type();

	/**
	 * Sets the value of the '{@link visGrid.House#getSystem_type <em>System type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System type</em>' attribute.
	 * @see #getSystem_type()
	 * @generated
	 */
	void setSystem_type(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Auxiliary_strategy()
	 * @model
	 * @generated
	 */
	String getAuxiliary_strategy();

	/**
	 * Sets the value of the '{@link visGrid.House#getAuxiliary_strategy <em>Auxiliary strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary strategy</em>' attribute.
	 * @see #getAuxiliary_strategy()
	 * @generated
	 */
	void setAuxiliary_strategy(String value);

	/**
	 * Returns the value of the '<em><b>System mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System mode</em>' attribute.
	 * @see #setSystem_mode(String)
	 * @see visGrid.VisGridPackage#getHouse_System_mode()
	 * @model
	 * @generated
	 */
	String getSystem_mode();

	/**
	 * Sets the value of the '{@link visGrid.House#getSystem_mode <em>System mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System mode</em>' attribute.
	 * @see #getSystem_mode()
	 * @generated
	 */
	void setSystem_mode(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Heating_system_type()
	 * @model
	 * @generated
	 */
	String getHeating_system_type();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeating_system_type <em>Heating system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating system type</em>' attribute.
	 * @see #getHeating_system_type()
	 * @generated
	 */
	void setHeating_system_type(String value);

	/**
	 * Returns the value of the '<em><b>Cooling system type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling system type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling system type</em>' attribute.
	 * @see #setCooling_system_type(String)
	 * @see visGrid.VisGridPackage#getHouse_Cooling_system_type()
	 * @model
	 * @generated
	 */
	String getCooling_system_type();

	/**
	 * Sets the value of the '{@link visGrid.House#getCooling_system_type <em>Cooling system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling system type</em>' attribute.
	 * @see #getCooling_system_type()
	 * @generated
	 */
	void setCooling_system_type(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Auxiliary_system_type()
	 * @model
	 * @generated
	 */
	String getAuxiliary_system_type();

	/**
	 * Sets the value of the '{@link visGrid.House#getAuxiliary_system_type <em>Auxiliary system type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary system type</em>' attribute.
	 * @see #getAuxiliary_system_type()
	 * @generated
	 */
	void setAuxiliary_system_type(String value);

	/**
	 * Returns the value of the '<em><b>Fan type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fan type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan type</em>' attribute.
	 * @see #setFan_type(String)
	 * @see visGrid.VisGridPackage#getHouse_Fan_type()
	 * @model
	 * @generated
	 */
	String getFan_type();

	/**
	 * Sets the value of the '{@link visGrid.House#getFan_type <em>Fan type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan type</em>' attribute.
	 * @see #getFan_type()
	 * @generated
	 */
	void setFan_type(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Thermal_integrity_level()
	 * @model
	 * @generated
	 */
	String getThermal_integrity_level();

	/**
	 * Sets the value of the '{@link visGrid.House#getThermal_integrity_level <em>Thermal integrity level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal integrity level</em>' attribute.
	 * @see #getThermal_integrity_level()
	 * @generated
	 */
	void setThermal_integrity_level(String value);

	/**
	 * Returns the value of the '<em><b>Glass type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glass type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glass type</em>' attribute.
	 * @see #setGlass_type(String)
	 * @see visGrid.VisGridPackage#getHouse_Glass_type()
	 * @model
	 * @generated
	 */
	String getGlass_type();

	/**
	 * Sets the value of the '{@link visGrid.House#getGlass_type <em>Glass type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glass type</em>' attribute.
	 * @see #getGlass_type()
	 * @generated
	 */
	void setGlass_type(String value);

	/**
	 * Returns the value of the '<em><b>Window frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window frame</em>' attribute.
	 * @see #setWindow_frame(String)
	 * @see visGrid.VisGridPackage#getHouse_Window_frame()
	 * @model
	 * @generated
	 */
	String getWindow_frame();

	/**
	 * Sets the value of the '{@link visGrid.House#getWindow_frame <em>Window frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window frame</em>' attribute.
	 * @see #getWindow_frame()
	 * @generated
	 */
	void setWindow_frame(String value);

	/**
	 * Returns the value of the '<em><b>Glazing treatment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing treatment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing treatment</em>' attribute.
	 * @see #setGlazing_treatment(String)
	 * @see visGrid.VisGridPackage#getHouse_Glazing_treatment()
	 * @model
	 * @generated
	 */
	String getGlazing_treatment();

	/**
	 * Sets the value of the '{@link visGrid.House#getGlazing_treatment <em>Glazing treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing treatment</em>' attribute.
	 * @see #getGlazing_treatment()
	 * @generated
	 */
	void setGlazing_treatment(String value);

	/**
	 * Returns the value of the '<em><b>Glazing layers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing layers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing layers</em>' attribute.
	 * @see #setGlazing_layers(String)
	 * @see visGrid.VisGridPackage#getHouse_Glazing_layers()
	 * @model
	 * @generated
	 */
	String getGlazing_layers();

	/**
	 * Sets the value of the '{@link visGrid.House#getGlazing_layers <em>Glazing layers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing layers</em>' attribute.
	 * @see #getGlazing_layers()
	 * @generated
	 */
	void setGlazing_layers(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Motor_model()
	 * @model
	 * @generated
	 */
	String getMotor_model();

	/**
	 * Sets the value of the '{@link visGrid.House#getMotor_model <em>Motor model</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Motor_efficiency()
	 * @model
	 * @generated
	 */
	String getMotor_efficiency();

	/**
	 * Sets the value of the '{@link visGrid.House#getMotor_efficiency <em>Motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motor efficiency</em>' attribute.
	 * @see #getMotor_efficiency()
	 * @generated
	 */
	void setMotor_efficiency(String value);

	/**
	 * Returns the value of the '<em><b>Hvac motor efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac motor efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac motor efficiency</em>' attribute.
	 * @see #setHvac_motor_efficiency(String)
	 * @see visGrid.VisGridPackage#getHouse_Hvac_motor_efficiency()
	 * @model
	 * @generated
	 */
	String getHvac_motor_efficiency();

	/**
	 * Sets the value of the '{@link visGrid.House#getHvac_motor_efficiency <em>Hvac motor efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac motor efficiency</em>' attribute.
	 * @see #getHvac_motor_efficiency()
	 * @generated
	 */
	void setHvac_motor_efficiency(String value);

	/**
	 * Returns the value of the '<em><b>Hvac motor loss power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac motor loss power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac motor loss power factor</em>' attribute.
	 * @see #setHvac_motor_loss_power_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_Hvac_motor_loss_power_factor()
	 * @model
	 * @generated
	 */
	String getHvac_motor_loss_power_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getHvac_motor_loss_power_factor <em>Hvac motor loss power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac motor loss power factor</em>' attribute.
	 * @see #getHvac_motor_loss_power_factor()
	 * @generated
	 */
	void setHvac_motor_loss_power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Rroof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rroof</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rroof</em>' attribute.
	 * @see #setRroof(String)
	 * @see visGrid.VisGridPackage#getHouse_Rroof()
	 * @model
	 * @generated
	 */
	String getRroof();

	/**
	 * Sets the value of the '{@link visGrid.House#getRroof <em>Rroof</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rroof</em>' attribute.
	 * @see #getRroof()
	 * @generated
	 */
	void setRroof(String value);

	/**
	 * Returns the value of the '<em><b>Rwall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rwall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rwall</em>' attribute.
	 * @see #setRwall(String)
	 * @see visGrid.VisGridPackage#getHouse_Rwall()
	 * @model
	 * @generated
	 */
	String getRwall();

	/**
	 * Sets the value of the '{@link visGrid.House#getRwall <em>Rwall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rwall</em>' attribute.
	 * @see #getRwall()
	 * @generated
	 */
	void setRwall(String value);

	/**
	 * Returns the value of the '<em><b>Rfloor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rfloor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rfloor</em>' attribute.
	 * @see #setRfloor(String)
	 * @see visGrid.VisGridPackage#getHouse_Rfloor()
	 * @model
	 * @generated
	 */
	String getRfloor();

	/**
	 * Sets the value of the '{@link visGrid.House#getRfloor <em>Rfloor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rfloor</em>' attribute.
	 * @see #getRfloor()
	 * @generated
	 */
	void setRfloor(String value);

	/**
	 * Returns the value of the '<em><b>Rwindows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rwindows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rwindows</em>' attribute.
	 * @see #setRwindows(String)
	 * @see visGrid.VisGridPackage#getHouse_Rwindows()
	 * @model
	 * @generated
	 */
	String getRwindows();

	/**
	 * Sets the value of the '{@link visGrid.House#getRwindows <em>Rwindows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rwindows</em>' attribute.
	 * @see #getRwindows()
	 * @generated
	 */
	void setRwindows(String value);

	/**
	 * Returns the value of the '<em><b>Rdoors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdoors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdoors</em>' attribute.
	 * @see #setRdoors(String)
	 * @see visGrid.VisGridPackage#getHouse_Rdoors()
	 * @model
	 * @generated
	 */
	String getRdoors();

	/**
	 * Sets the value of the '{@link visGrid.House#getRdoors <em>Rdoors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdoors</em>' attribute.
	 * @see #getRdoors()
	 * @generated
	 */
	void setRdoors(String value);

	/**
	 * Returns the value of the '<em><b>Hvac breaker rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac breaker rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac breaker rating</em>' attribute.
	 * @see #setHvac_breaker_rating(String)
	 * @see visGrid.VisGridPackage#getHouse_Hvac_breaker_rating()
	 * @model
	 * @generated
	 */
	String getHvac_breaker_rating();

	/**
	 * Sets the value of the '{@link visGrid.House#getHvac_breaker_rating <em>Hvac breaker rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac breaker rating</em>' attribute.
	 * @see #getHvac_breaker_rating()
	 * @generated
	 */
	void setHvac_breaker_rating(String value);

	/**
	 * Returns the value of the '<em><b>Hvac power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac power factor</em>' attribute.
	 * @see #setHvac_power_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_Hvac_power_factor()
	 * @model
	 * @generated
	 */
	String getHvac_power_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getHvac_power_factor <em>Hvac power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac power factor</em>' attribute.
	 * @see #getHvac_power_factor()
	 * @generated
	 */
	void setHvac_power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Hvac load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac load</em>' attribute.
	 * @see #setHvac_load(String)
	 * @see visGrid.VisGridPackage#getHouse_Hvac_load()
	 * @model
	 * @generated
	 */
	String getHvac_load();

	/**
	 * Sets the value of the '{@link visGrid.House#getHvac_load <em>Hvac load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac load</em>' attribute.
	 * @see #getHvac_load()
	 * @generated
	 */
	void setHvac_load(String value);

	/**
	 * Returns the value of the '<em><b>Panel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel</em>' attribute.
	 * @see #setPanel(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel()
	 * @model
	 * @generated
	 */
	String getPanel();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel <em>Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel</em>' attribute.
	 * @see #getPanel()
	 * @generated
	 */
	void setPanel(String value);

	/**
	 * Returns the value of the '<em><b>Panel energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel energy</em>' attribute.
	 * @see #setPanel__energy(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__energy()
	 * @model
	 * @generated
	 */
	String getPanel__energy();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__energy <em>Panel energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel energy</em>' attribute.
	 * @see #getPanel__energy()
	 * @generated
	 */
	void setPanel__energy(String value);

	/**
	 * Returns the value of the '<em><b>Panel power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel power</em>' attribute.
	 * @see #setPanel__power(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__power()
	 * @model
	 * @generated
	 */
	String getPanel__power();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__power <em>Panel power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel power</em>' attribute.
	 * @see #getPanel__power()
	 * @generated
	 */
	void setPanel__power(String value);

	/**
	 * Returns the value of the '<em><b>Panel peak demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel peak demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel peak demand</em>' attribute.
	 * @see #setPanel__peak_demand(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__peak_demand()
	 * @model
	 * @generated
	 */
	String getPanel__peak_demand();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__peak_demand <em>Panel peak demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel peak demand</em>' attribute.
	 * @see #getPanel__peak_demand()
	 * @generated
	 */
	void setPanel__peak_demand(String value);

	/**
	 * Returns the value of the '<em><b>Panel heatgain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel heatgain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel heatgain</em>' attribute.
	 * @see #setPanel__heatgain(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__heatgain()
	 * @model
	 * @generated
	 */
	String getPanel__heatgain();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__heatgain <em>Panel heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel heatgain</em>' attribute.
	 * @see #getPanel__heatgain()
	 * @generated
	 */
	void setPanel__heatgain(String value);

	/**
	 * Returns the value of the '<em><b>Panel heatgain fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel heatgain fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel heatgain fraction</em>' attribute.
	 * @see #setPanel__heatgain_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getPanel__heatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__heatgain_fraction <em>Panel heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel heatgain fraction</em>' attribute.
	 * @see #getPanel__heatgain_fraction()
	 * @generated
	 */
	void setPanel__heatgain_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Panel current fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel current fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel current fraction</em>' attribute.
	 * @see #setPanel__current_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__current_fraction()
	 * @model
	 * @generated
	 */
	String getPanel__current_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__current_fraction <em>Panel current fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel current fraction</em>' attribute.
	 * @see #getPanel__current_fraction()
	 * @generated
	 */
	void setPanel__current_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Panel impedance fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel impedance fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel impedance fraction</em>' attribute.
	 * @see #setPanel__impedance_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__impedance_fraction()
	 * @model
	 * @generated
	 */
	String getPanel__impedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__impedance_fraction <em>Panel impedance fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel impedance fraction</em>' attribute.
	 * @see #getPanel__impedance_fraction()
	 * @generated
	 */
	void setPanel__impedance_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Panel power fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel power fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel power fraction</em>' attribute.
	 * @see #setPanel__power_fraction(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__power_fraction()
	 * @model
	 * @generated
	 */
	String getPanel__power_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__power_fraction <em>Panel power fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel power fraction</em>' attribute.
	 * @see #getPanel__power_fraction()
	 * @generated
	 */
	void setPanel__power_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Panel power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel power factor</em>' attribute.
	 * @see #setPanel__power_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__power_factor()
	 * @model
	 * @generated
	 */
	String getPanel__power_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__power_factor <em>Panel power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel power factor</em>' attribute.
	 * @see #getPanel__power_factor()
	 * @generated
	 */
	void setPanel__power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Panel constant power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel constant power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel constant power</em>' attribute.
	 * @see #setPanel__constant_power(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__constant_power()
	 * @model
	 * @generated
	 */
	String getPanel__constant_power();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__constant_power <em>Panel constant power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel constant power</em>' attribute.
	 * @see #getPanel__constant_power()
	 * @generated
	 */
	void setPanel__constant_power(String value);

	/**
	 * Returns the value of the '<em><b>Panel constant current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel constant current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel constant current</em>' attribute.
	 * @see #setPanel__constant_current(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__constant_current()
	 * @model
	 * @generated
	 */
	String getPanel__constant_current();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__constant_current <em>Panel constant current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel constant current</em>' attribute.
	 * @see #getPanel__constant_current()
	 * @generated
	 */
	void setPanel__constant_current(String value);

	/**
	 * Returns the value of the '<em><b>Panel constant admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel constant admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel constant admittance</em>' attribute.
	 * @see #setPanel__constant_admittance(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__constant_admittance()
	 * @model
	 * @generated
	 */
	String getPanel__constant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__constant_admittance <em>Panel constant admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel constant admittance</em>' attribute.
	 * @see #getPanel__constant_admittance()
	 * @generated
	 */
	void setPanel__constant_admittance(String value);

	/**
	 * Returns the value of the '<em><b>Panel voltage factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel voltage factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel voltage factor</em>' attribute.
	 * @see #setPanel__voltage_factor(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__voltage_factor()
	 * @model
	 * @generated
	 */
	String getPanel__voltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__voltage_factor <em>Panel voltage factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel voltage factor</em>' attribute.
	 * @see #getPanel__voltage_factor()
	 * @generated
	 */
	void setPanel__voltage_factor(String value);

	/**
	 * Returns the value of the '<em><b>Panel configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel configuration</em>' attribute.
	 * @see #setPanel__configuration(String)
	 * @see visGrid.VisGridPackage#getHouse_Panel__configuration()
	 * @model
	 * @generated
	 */
	String getPanel__configuration();

	/**
	 * Sets the value of the '{@link visGrid.House#getPanel__configuration <em>Panel configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel configuration</em>' attribute.
	 * @see #getPanel__configuration()
	 * @generated
	 */
	void setPanel__configuration(String value);

	/**
	 * Returns the value of the '<em><b>Design internal gain density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design internal gain density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design internal gain density</em>' attribute.
	 * @see #setDesign_internal_gain_density(String)
	 * @see visGrid.VisGridPackage#getHouse_Design_internal_gain_density()
	 * @model
	 * @generated
	 */
	String getDesign_internal_gain_density();

	/**
	 * Sets the value of the '{@link visGrid.House#getDesign_internal_gain_density <em>Design internal gain density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design internal gain density</em>' attribute.
	 * @see #getDesign_internal_gain_density()
	 * @generated
	 */
	void setDesign_internal_gain_density(String value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #setA(String)
	 * @see visGrid.VisGridPackage#getHouse_A()
	 * @model
	 * @generated
	 */
	String getA();

	/**
	 * Sets the value of the '{@link visGrid.House#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(String value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(String)
	 * @see visGrid.VisGridPackage#getHouse_B()
	 * @model
	 * @generated
	 */
	String getB();

	/**
	 * Sets the value of the '{@link visGrid.House#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(String value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(String)
	 * @see visGrid.VisGridPackage#getHouse_C()
	 * @model
	 * @generated
	 */
	String getC();

	/**
	 * Sets the value of the '{@link visGrid.House#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_D()
	 * @model
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link visGrid.House#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>C1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C1</em>' attribute.
	 * @see #setC1(String)
	 * @see visGrid.VisGridPackage#getHouse_C1()
	 * @model
	 * @generated
	 */
	String getC1();

	/**
	 * Sets the value of the '{@link visGrid.House#getC1 <em>C1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C1</em>' attribute.
	 * @see #getC1()
	 * @generated
	 */
	void setC1(String value);

	/**
	 * Returns the value of the '<em><b>C2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C2</em>' attribute.
	 * @see #setC2(String)
	 * @see visGrid.VisGridPackage#getHouse_C2()
	 * @model
	 * @generated
	 */
	String getC2();

	/**
	 * Sets the value of the '{@link visGrid.House#getC2 <em>C2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2</em>' attribute.
	 * @see #getC2()
	 * @generated
	 */
	void setC2(String value);

	/**
	 * Returns the value of the '<em><b>A3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A3</em>' attribute.
	 * @see #setA3(String)
	 * @see visGrid.VisGridPackage#getHouse_A3()
	 * @model
	 * @generated
	 */
	String getA3();

	/**
	 * Sets the value of the '{@link visGrid.House#getA3 <em>A3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A3</em>' attribute.
	 * @see #getA3()
	 * @generated
	 */
	void setA3(String value);

	/**
	 * Returns the value of the '<em><b>A4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A4</em>' attribute.
	 * @see #setA4(String)
	 * @see visGrid.VisGridPackage#getHouse_A4()
	 * @model
	 * @generated
	 */
	String getA4();

	/**
	 * Sets the value of the '{@link visGrid.House#getA4 <em>A4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A4</em>' attribute.
	 * @see #getA4()
	 * @generated
	 */
	void setA4(String value);

	/**
	 * Returns the value of the '<em><b>K1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K1</em>' attribute.
	 * @see #setK1(String)
	 * @see visGrid.VisGridPackage#getHouse_K1()
	 * @model
	 * @generated
	 */
	String getK1();

	/**
	 * Sets the value of the '{@link visGrid.House#getK1 <em>K1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K1</em>' attribute.
	 * @see #getK1()
	 * @generated
	 */
	void setK1(String value);

	/**
	 * Returns the value of the '<em><b>K2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K2</em>' attribute.
	 * @see #setK2(String)
	 * @see visGrid.VisGridPackage#getHouse_K2()
	 * @model
	 * @generated
	 */
	String getK2();

	/**
	 * Sets the value of the '{@link visGrid.House#getK2 <em>K2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K2</em>' attribute.
	 * @see #getK2()
	 * @generated
	 */
	void setK2(String value);

	/**
	 * Returns the value of the '<em><b>R1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' attribute.
	 * @see #setR1(String)
	 * @see visGrid.VisGridPackage#getHouse_R1()
	 * @model
	 * @generated
	 */
	String getR1();

	/**
	 * Sets the value of the '{@link visGrid.House#getR1 <em>R1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R1</em>' attribute.
	 * @see #getR1()
	 * @generated
	 */
	void setR1(String value);

	/**
	 * Returns the value of the '<em><b>R2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' attribute.
	 * @see #setR2(String)
	 * @see visGrid.VisGridPackage#getHouse_R2()
	 * @model
	 * @generated
	 */
	String getR2();

	/**
	 * Sets the value of the '{@link visGrid.House#getR2 <em>R2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R2</em>' attribute.
	 * @see #getR2()
	 * @generated
	 */
	void setR2(String value);

	/**
	 * Returns the value of the '<em><b>Teq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teq</em>' attribute.
	 * @see #setTeq(String)
	 * @see visGrid.VisGridPackage#getHouse_Teq()
	 * @model
	 * @generated
	 */
	String getTeq();

	/**
	 * Sets the value of the '{@link visGrid.House#getTeq <em>Teq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teq</em>' attribute.
	 * @see #getTeq()
	 * @generated
	 */
	void setTeq(String value);

	/**
	 * Returns the value of the '<em><b>Tevent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tevent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tevent</em>' attribute.
	 * @see #setTevent(String)
	 * @see visGrid.VisGridPackage#getHouse_Tevent()
	 * @model
	 * @generated
	 */
	String getTevent();

	/**
	 * Sets the value of the '{@link visGrid.House#getTevent <em>Tevent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tevent</em>' attribute.
	 * @see #getTevent()
	 * @generated
	 */
	void setTevent(String value);

	/**
	 * Returns the value of the '<em><b>Qi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qi</em>' attribute.
	 * @see #setQi(String)
	 * @see visGrid.VisGridPackage#getHouse_Qi()
	 * @model
	 * @generated
	 */
	String getQi();

	/**
	 * Sets the value of the '{@link visGrid.House#getQi <em>Qi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qi</em>' attribute.
	 * @see #getQi()
	 * @generated
	 */
	void setQi(String value);

	/**
	 * Returns the value of the '<em><b>Qa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qa</em>' attribute.
	 * @see #setQa(String)
	 * @see visGrid.VisGridPackage#getHouse_Qa()
	 * @model
	 * @generated
	 */
	String getQa();

	/**
	 * Sets the value of the '{@link visGrid.House#getQa <em>Qa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qa</em>' attribute.
	 * @see #getQa()
	 * @generated
	 */
	void setQa(String value);

	/**
	 * Returns the value of the '<em><b>Qm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qm</em>' attribute.
	 * @see #setQm(String)
	 * @see visGrid.VisGridPackage#getHouse_Qm()
	 * @model
	 * @generated
	 */
	String getQm();

	/**
	 * Sets the value of the '{@link visGrid.House#getQm <em>Qm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qm</em>' attribute.
	 * @see #getQm()
	 * @generated
	 */
	void setQm(String value);

	/**
	 * Returns the value of the '<em><b>Qh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qh</em>' attribute.
	 * @see #setQh(String)
	 * @see visGrid.VisGridPackage#getHouse_Qh()
	 * @model
	 * @generated
	 */
	String getQh();

	/**
	 * Sets the value of the '{@link visGrid.House#getQh <em>Qh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qh</em>' attribute.
	 * @see #getQh()
	 * @generated
	 */
	void setQh(String value);

	/**
	 * Returns the value of the '<em><b>DTair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTair</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTair</em>' attribute.
	 * @see #setDTair(String)
	 * @see visGrid.VisGridPackage#getHouse_DTair()
	 * @model
	 * @generated
	 */
	String getDTair();

	/**
	 * Sets the value of the '{@link visGrid.House#getDTair <em>DTair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTair</em>' attribute.
	 * @see #getDTair()
	 * @generated
	 */
	void setDTair(String value);

	/**
	 * Returns the value of the '<em><b>Sol inc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sol inc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sol inc</em>' attribute.
	 * @see #setSol_inc(String)
	 * @see visGrid.VisGridPackage#getHouse_Sol_inc()
	 * @model
	 * @generated
	 */
	String getSol_inc();

	/**
	 * Sets the value of the '{@link visGrid.House#getSol_inc <em>Sol inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sol inc</em>' attribute.
	 * @see #getSol_inc()
	 * @generated
	 */
	void setSol_inc(String value);

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
	 * @see visGrid.VisGridPackage#getHouse_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link visGrid.House#getShape <em>Shape</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.House#getLoad <em>Load</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.House#getEnergy <em>Energy</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.House#getPower <em>Power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Peak_demand()
	 * @model
	 * @generated
	 */
	String getPeak_demand();

	/**
	 * Sets the value of the '{@link visGrid.House#getPeak_demand <em>Peak demand</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Heatgain()
	 * @model
	 * @generated
	 */
	String getHeatgain();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeatgain <em>Heatgain</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHeatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getHeatgain_fraction <em>Heatgain fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Current_fraction()
	 * @model
	 * @generated
	 */
	String getCurrent_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getCurrent_fraction <em>Current fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Impedance_fraction()
	 * @model
	 * @generated
	 */
	String getImpedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getImpedance_fraction <em>Impedance fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Power_fraction()
	 * @model
	 * @generated
	 */
	String getPower_fraction();

	/**
	 * Sets the value of the '{@link visGrid.House#getPower_fraction <em>Power fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getPower_factor <em>Power factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Constant_power()
	 * @model
	 * @generated
	 */
	String getConstant_power();

	/**
	 * Sets the value of the '{@link visGrid.House#getConstant_power <em>Constant power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Constant_current()
	 * @model
	 * @generated
	 */
	String getConstant_current();

	/**
	 * Sets the value of the '{@link visGrid.House#getConstant_current <em>Constant current</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Constant_admittance()
	 * @model
	 * @generated
	 */
	String getConstant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.House#getConstant_admittance <em>Constant admittance</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Voltage_factor()
	 * @model
	 * @generated
	 */
	String getVoltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.House#getVoltage_factor <em>Voltage factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link visGrid.House#getConfiguration <em>Configuration</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getHouse_Override()
	 * @model
	 * @generated
	 */
	String getOverride();

	/**
	 * Sets the value of the '{@link visGrid.House#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(String value);

} // House
