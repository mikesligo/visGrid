/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Waterheater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Waterheater#getTank_volume <em>Tank volume</em>}</li>
 *   <li>{@link visGrid.Waterheater#getTank_UA <em>Tank UA</em>}</li>
 *   <li>{@link visGrid.Waterheater#getTank_diameter <em>Tank diameter</em>}</li>
 *   <li>{@link visGrid.Waterheater#getWater_demand <em>Water demand</em>}</li>
 *   <li>{@link visGrid.Waterheater#getHeating_element_capacity <em>Heating element capacity</em>}</li>
 *   <li>{@link visGrid.Waterheater#getInlet_water_temperature <em>Inlet water temperature</em>}</li>
 *   <li>{@link visGrid.Waterheater#getHeat_mode <em>Heat mode</em>}</li>
 *   <li>{@link visGrid.Waterheater#getLocation <em>Location</em>}</li>
 *   <li>{@link visGrid.Waterheater#getTank_setpoint <em>Tank setpoint</em>}</li>
 *   <li>{@link visGrid.Waterheater#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.Waterheater#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.Waterheater#getHeight <em>Height</em>}</li>
 *   <li>{@link visGrid.Waterheater#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.Waterheater#getActual_load <em>Actual load</em>}</li>
 *   <li>{@link visGrid.Waterheater#getShape <em>Shape</em>}</li>
 *   <li>{@link visGrid.Waterheater#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.Waterheater#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.Waterheater#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.Waterheater#getPeak_demand <em>Peak demand</em>}</li>
 *   <li>{@link visGrid.Waterheater#getHeatgain <em>Heatgain</em>}</li>
 *   <li>{@link visGrid.Waterheater#getHeatgain_fraction <em>Heatgain fraction</em>}</li>
 *   <li>{@link visGrid.Waterheater#getCurrent_fraction <em>Current fraction</em>}</li>
 *   <li>{@link visGrid.Waterheater#getImpedance_fraction <em>Impedance fraction</em>}</li>
 *   <li>{@link visGrid.Waterheater#getPower_fraction <em>Power fraction</em>}</li>
 *   <li>{@link visGrid.Waterheater#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.Waterheater#getConstant_power <em>Constant power</em>}</li>
 *   <li>{@link visGrid.Waterheater#getConstant_current <em>Constant current</em>}</li>
 *   <li>{@link visGrid.Waterheater#getConstant_admittance <em>Constant admittance</em>}</li>
 *   <li>{@link visGrid.Waterheater#getVoltage_factor <em>Voltage factor</em>}</li>
 *   <li>{@link visGrid.Waterheater#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link visGrid.Waterheater#getOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getWaterheater()
 * @model
 * @generated
 */
public interface Waterheater extends Connection {
	/**
	 * Returns the value of the '<em><b>Tank volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank volume</em>' attribute.
	 * @see #setTank_volume(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Tank_volume()
	 * @model
	 * @generated
	 */
	String getTank_volume();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getTank_volume <em>Tank volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank volume</em>' attribute.
	 * @see #getTank_volume()
	 * @generated
	 */
	void setTank_volume(String value);

	/**
	 * Returns the value of the '<em><b>Tank UA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank UA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank UA</em>' attribute.
	 * @see #setTank_UA(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Tank_UA()
	 * @model
	 * @generated
	 */
	String getTank_UA();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getTank_UA <em>Tank UA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank UA</em>' attribute.
	 * @see #getTank_UA()
	 * @generated
	 */
	void setTank_UA(String value);

	/**
	 * Returns the value of the '<em><b>Tank diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank diameter</em>' attribute.
	 * @see #setTank_diameter(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Tank_diameter()
	 * @model
	 * @generated
	 */
	String getTank_diameter();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getTank_diameter <em>Tank diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank diameter</em>' attribute.
	 * @see #getTank_diameter()
	 * @generated
	 */
	void setTank_diameter(String value);

	/**
	 * Returns the value of the '<em><b>Water demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water demand</em>' attribute.
	 * @see #setWater_demand(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Water_demand()
	 * @model
	 * @generated
	 */
	String getWater_demand();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getWater_demand <em>Water demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water demand</em>' attribute.
	 * @see #getWater_demand()
	 * @generated
	 */
	void setWater_demand(String value);

	/**
	 * Returns the value of the '<em><b>Heating element capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heating element capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heating element capacity</em>' attribute.
	 * @see #setHeating_element_capacity(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Heating_element_capacity()
	 * @model
	 * @generated
	 */
	String getHeating_element_capacity();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getHeating_element_capacity <em>Heating element capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating element capacity</em>' attribute.
	 * @see #getHeating_element_capacity()
	 * @generated
	 */
	void setHeating_element_capacity(String value);

	/**
	 * Returns the value of the '<em><b>Inlet water temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inlet water temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlet water temperature</em>' attribute.
	 * @see #setInlet_water_temperature(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Inlet_water_temperature()
	 * @model
	 * @generated
	 */
	String getInlet_water_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getInlet_water_temperature <em>Inlet water temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inlet water temperature</em>' attribute.
	 * @see #getInlet_water_temperature()
	 * @generated
	 */
	void setInlet_water_temperature(String value);

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
	 * @see visGrid.VisGridPackage#getWaterheater_Heat_mode()
	 * @model
	 * @generated
	 */
	String getHeat_mode();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getHeat_mode <em>Heat mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heat mode</em>' attribute.
	 * @see #getHeat_mode()
	 * @generated
	 */
	void setHeat_mode(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Tank setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tank setpoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank setpoint</em>' attribute.
	 * @see #setTank_setpoint(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Tank_setpoint()
	 * @model
	 * @generated
	 */
	String getTank_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getTank_setpoint <em>Tank setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank setpoint</em>' attribute.
	 * @see #getTank_setpoint()
	 * @generated
	 */
	void setTank_setpoint(String value);

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
	 * @see visGrid.VisGridPackage#getWaterheater_Thermostat_deadband()
	 * @model
	 * @generated
	 */
	String getThermostat_deadband();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getThermostat_deadband <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #getThermostat_deadband()
	 * @generated
	 */
	void setThermostat_deadband(String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Temperature()
	 * @model
	 * @generated
	 */
	String getTemperature();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Height()
	 * @model
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demand</em>' attribute.
	 * @see #setDemand(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Demand()
	 * @model
	 * @generated
	 */
	String getDemand();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getDemand <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' attribute.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(String value);

	/**
	 * Returns the value of the '<em><b>Actual load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual load</em>' attribute.
	 * @see #setActual_load(String)
	 * @see visGrid.VisGridPackage#getWaterheater_Actual_load()
	 * @model
	 * @generated
	 */
	String getActual_load();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getActual_load <em>Actual load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual load</em>' attribute.
	 * @see #getActual_load()
	 * @generated
	 */
	void setActual_load(String value);

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
	 * @see visGrid.VisGridPackage#getWaterheater_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getShape <em>Shape</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Load()
	 * @model
	 * @generated
	 */
	String getLoad();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getLoad <em>Load</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getEnergy <em>Energy</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getPower <em>Power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Peak_demand()
	 * @model
	 * @generated
	 */
	String getPeak_demand();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getPeak_demand <em>Peak demand</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Heatgain()
	 * @model
	 * @generated
	 */
	String getHeatgain();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getHeatgain <em>Heatgain</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getHeatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getHeatgain_fraction <em>Heatgain fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Current_fraction()
	 * @model
	 * @generated
	 */
	String getCurrent_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getCurrent_fraction <em>Current fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Impedance_fraction()
	 * @model
	 * @generated
	 */
	String getImpedance_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getImpedance_fraction <em>Impedance fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Power_fraction()
	 * @model
	 * @generated
	 */
	String getPower_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getPower_fraction <em>Power fraction</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getPower_factor <em>Power factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Constant_power()
	 * @model
	 * @generated
	 */
	String getConstant_power();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getConstant_power <em>Constant power</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Constant_current()
	 * @model
	 * @generated
	 */
	String getConstant_current();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getConstant_current <em>Constant current</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Constant_admittance()
	 * @model
	 * @generated
	 */
	String getConstant_admittance();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getConstant_admittance <em>Constant admittance</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Voltage_factor()
	 * @model
	 * @generated
	 */
	String getVoltage_factor();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getVoltage_factor <em>Voltage factor</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getConfiguration <em>Configuration</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getWaterheater_Override()
	 * @model
	 * @generated
	 */
	String getOverride();

	/**
	 * Sets the value of the '{@link visGrid.Waterheater#getOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(String value);

} // Waterheater
