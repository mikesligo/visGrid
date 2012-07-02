/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Office</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Office#getFloor_area <em>Floor area</em>}</li>
 *   <li>{@link visGrid.Office#getFloor_height <em>Floor height</em>}</li>
 *   <li>{@link visGrid.Office#getExterior_ua <em>Exterior ua</em>}</li>
 *   <li>{@link visGrid.Office#getInterior_ua <em>Interior ua</em>}</li>
 *   <li>{@link visGrid.Office#getInterior_mass <em>Interior mass</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing <em>Glazing</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__north <em>Glazing north</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__northeast <em>Glazing northeast</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__east <em>Glazing east</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__southeast <em>Glazing southeast</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__south <em>Glazing south</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__southwest <em>Glazing southwest</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__west <em>Glazing west</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__northwest <em>Glazing northwest</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__horizontal <em>Glazing horizontal</em>}</li>
 *   <li>{@link visGrid.Office#getGlazing__coefficient <em>Glazing coefficient</em>}</li>
 *   <li>{@link visGrid.Office#getOccupancy <em>Occupancy</em>}</li>
 *   <li>{@link visGrid.Office#getOccupants <em>Occupants</em>}</li>
 *   <li>{@link visGrid.Office#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link visGrid.Office#getAir_temperature <em>Air temperature</em>}</li>
 *   <li>{@link visGrid.Office#getMass_temperature <em>Mass temperature</em>}</li>
 *   <li>{@link visGrid.Office#getTemperature_change <em>Temperature change</em>}</li>
 *   <li>{@link visGrid.Office#getOutdoor_temperature <em>Outdoor temperature</em>}</li>
 *   <li>{@link visGrid.Office#getQh <em>Qh</em>}</li>
 *   <li>{@link visGrid.Office#getQs <em>Qs</em>}</li>
 *   <li>{@link visGrid.Office#getQi <em>Qi</em>}</li>
 *   <li>{@link visGrid.Office#getQz <em>Qz</em>}</li>
 *   <li>{@link visGrid.Office#getHvac_mode <em>Hvac mode</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__cooling__balance_temperature <em>Hvac cooling balance temperature</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__cooling__capacity <em>Hvac cooling capacity</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__cooling__capacity_perF <em>Hvac cooling capacity per F</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__cooling__design_temperature <em>Hvac cooling design temperature</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__cooling__efficiency <em>Hvac cooling efficiency</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__cooling__cop <em>Hvac cooling cop</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__heating__balance_temperature <em>Hvac heating balance temperature</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__heating__capacity <em>Hvac heating capacity</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__heating__capacity_perF <em>Hvac heating capacity per F</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__heating__design_temperature <em>Hvac heating design temperature</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__heating__efficiency <em>Hvac heating efficiency</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__heating__cop <em>Hvac heating cop</em>}</li>
 *   <li>{@link visGrid.Office#getLights__capacity <em>Lights capacity</em>}</li>
 *   <li>{@link visGrid.Office#getLights__fraction <em>Lights fraction</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__capacity <em>Plugs capacity</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__fraction <em>Plugs fraction</em>}</li>
 *   <li>{@link visGrid.Office#getDemand <em>Demand</em>}</li>
 *   <li>{@link visGrid.Office#getTotal_load <em>Total load</em>}</li>
 *   <li>{@link visGrid.Office#getEnergy <em>Energy</em>}</li>
 *   <li>{@link visGrid.Office#getPower_factor <em>Power factor</em>}</li>
 *   <li>{@link visGrid.Office#getPower <em>Power</em>}</li>
 *   <li>{@link visGrid.Office#getCurrent <em>Current</em>}</li>
 *   <li>{@link visGrid.Office#getAdmittance <em>Admittance</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__demand <em>Hvac demand</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__load <em>Hvac load</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__energy <em>Hvac energy</em>}</li>
 *   <li>{@link visGrid.Office#getHvac__power_factor <em>Hvac power factor</em>}</li>
 *   <li>{@link visGrid.Office#getLights__demand <em>Lights demand</em>}</li>
 *   <li>{@link visGrid.Office#getLights__load <em>Lights load</em>}</li>
 *   <li>{@link visGrid.Office#getLights__energy <em>Lights energy</em>}</li>
 *   <li>{@link visGrid.Office#getLights__power_factor <em>Lights power factor</em>}</li>
 *   <li>{@link visGrid.Office#getLights__heatgain_fraction <em>Lights heatgain fraction</em>}</li>
 *   <li>{@link visGrid.Office#getLights__heatgain <em>Lights heatgain</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__demand <em>Plugs demand</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__load <em>Plugs load</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__energy <em>Plugs energy</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__power_factor <em>Plugs power factor</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__heatgain_fraction <em>Plugs heatgain fraction</em>}</li>
 *   <li>{@link visGrid.Office#getPlugs__heatgain <em>Plugs heatgain</em>}</li>
 *   <li>{@link visGrid.Office#getCooling_setpoint <em>Cooling setpoint</em>}</li>
 *   <li>{@link visGrid.Office#getHeating_setpoint <em>Heating setpoint</em>}</li>
 *   <li>{@link visGrid.Office#getThermostat_deadband <em>Thermostat deadband</em>}</li>
 *   <li>{@link visGrid.Office#getControl__ventilation_fraction <em>Control ventilation fraction</em>}</li>
 *   <li>{@link visGrid.Office#getControl__lighting_fraction <em>Control lighting fraction</em>}</li>
 *   <li>{@link visGrid.Office#getACH <em>ACH</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getOffice()
 * @model
 * @generated
 */
public interface Office extends Connection {
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
	 * @see visGrid.VisGridPackage#getOffice_Floor_area()
	 * @model
	 * @generated
	 */
	String getFloor_area();

	/**
	 * Sets the value of the '{@link visGrid.Office#getFloor_area <em>Floor area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor area</em>' attribute.
	 * @see #getFloor_area()
	 * @generated
	 */
	void setFloor_area(String value);

	/**
	 * Returns the value of the '<em><b>Floor height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor height</em>' attribute.
	 * @see #setFloor_height(String)
	 * @see visGrid.VisGridPackage#getOffice_Floor_height()
	 * @model
	 * @generated
	 */
	String getFloor_height();

	/**
	 * Sets the value of the '{@link visGrid.Office#getFloor_height <em>Floor height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor height</em>' attribute.
	 * @see #getFloor_height()
	 * @generated
	 */
	void setFloor_height(String value);

	/**
	 * Returns the value of the '<em><b>Exterior ua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exterior ua</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exterior ua</em>' attribute.
	 * @see #setExterior_ua(String)
	 * @see visGrid.VisGridPackage#getOffice_Exterior_ua()
	 * @model
	 * @generated
	 */
	String getExterior_ua();

	/**
	 * Sets the value of the '{@link visGrid.Office#getExterior_ua <em>Exterior ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exterior ua</em>' attribute.
	 * @see #getExterior_ua()
	 * @generated
	 */
	void setExterior_ua(String value);

	/**
	 * Returns the value of the '<em><b>Interior ua</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior ua</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior ua</em>' attribute.
	 * @see #setInterior_ua(String)
	 * @see visGrid.VisGridPackage#getOffice_Interior_ua()
	 * @model
	 * @generated
	 */
	String getInterior_ua();

	/**
	 * Sets the value of the '{@link visGrid.Office#getInterior_ua <em>Interior ua</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior ua</em>' attribute.
	 * @see #getInterior_ua()
	 * @generated
	 */
	void setInterior_ua(String value);

	/**
	 * Returns the value of the '<em><b>Interior mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interior mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interior mass</em>' attribute.
	 * @see #setInterior_mass(String)
	 * @see visGrid.VisGridPackage#getOffice_Interior_mass()
	 * @model
	 * @generated
	 */
	String getInterior_mass();

	/**
	 * Sets the value of the '{@link visGrid.Office#getInterior_mass <em>Interior mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior mass</em>' attribute.
	 * @see #getInterior_mass()
	 * @generated
	 */
	void setInterior_mass(String value);

	/**
	 * Returns the value of the '<em><b>Glazing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing</em>' attribute.
	 * @see #setGlazing(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing()
	 * @model
	 * @generated
	 */
	String getGlazing();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing <em>Glazing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing</em>' attribute.
	 * @see #getGlazing()
	 * @generated
	 */
	void setGlazing(String value);

	/**
	 * Returns the value of the '<em><b>Glazing north</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing north</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing north</em>' attribute.
	 * @see #setGlazing__north(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__north()
	 * @model
	 * @generated
	 */
	String getGlazing__north();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__north <em>Glazing north</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing north</em>' attribute.
	 * @see #getGlazing__north()
	 * @generated
	 */
	void setGlazing__north(String value);

	/**
	 * Returns the value of the '<em><b>Glazing northeast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing northeast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing northeast</em>' attribute.
	 * @see #setGlazing__northeast(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__northeast()
	 * @model
	 * @generated
	 */
	String getGlazing__northeast();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__northeast <em>Glazing northeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing northeast</em>' attribute.
	 * @see #getGlazing__northeast()
	 * @generated
	 */
	void setGlazing__northeast(String value);

	/**
	 * Returns the value of the '<em><b>Glazing east</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing east</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing east</em>' attribute.
	 * @see #setGlazing__east(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__east()
	 * @model
	 * @generated
	 */
	String getGlazing__east();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__east <em>Glazing east</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing east</em>' attribute.
	 * @see #getGlazing__east()
	 * @generated
	 */
	void setGlazing__east(String value);

	/**
	 * Returns the value of the '<em><b>Glazing southeast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing southeast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing southeast</em>' attribute.
	 * @see #setGlazing__southeast(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__southeast()
	 * @model
	 * @generated
	 */
	String getGlazing__southeast();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__southeast <em>Glazing southeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing southeast</em>' attribute.
	 * @see #getGlazing__southeast()
	 * @generated
	 */
	void setGlazing__southeast(String value);

	/**
	 * Returns the value of the '<em><b>Glazing south</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing south</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing south</em>' attribute.
	 * @see #setGlazing__south(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__south()
	 * @model
	 * @generated
	 */
	String getGlazing__south();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__south <em>Glazing south</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing south</em>' attribute.
	 * @see #getGlazing__south()
	 * @generated
	 */
	void setGlazing__south(String value);

	/**
	 * Returns the value of the '<em><b>Glazing southwest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing southwest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing southwest</em>' attribute.
	 * @see #setGlazing__southwest(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__southwest()
	 * @model
	 * @generated
	 */
	String getGlazing__southwest();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__southwest <em>Glazing southwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing southwest</em>' attribute.
	 * @see #getGlazing__southwest()
	 * @generated
	 */
	void setGlazing__southwest(String value);

	/**
	 * Returns the value of the '<em><b>Glazing west</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing west</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing west</em>' attribute.
	 * @see #setGlazing__west(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__west()
	 * @model
	 * @generated
	 */
	String getGlazing__west();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__west <em>Glazing west</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing west</em>' attribute.
	 * @see #getGlazing__west()
	 * @generated
	 */
	void setGlazing__west(String value);

	/**
	 * Returns the value of the '<em><b>Glazing northwest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing northwest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing northwest</em>' attribute.
	 * @see #setGlazing__northwest(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__northwest()
	 * @model
	 * @generated
	 */
	String getGlazing__northwest();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__northwest <em>Glazing northwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing northwest</em>' attribute.
	 * @see #getGlazing__northwest()
	 * @generated
	 */
	void setGlazing__northwest(String value);

	/**
	 * Returns the value of the '<em><b>Glazing horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing horizontal</em>' attribute.
	 * @see #setGlazing__horizontal(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__horizontal()
	 * @model
	 * @generated
	 */
	String getGlazing__horizontal();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__horizontal <em>Glazing horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing horizontal</em>' attribute.
	 * @see #getGlazing__horizontal()
	 * @generated
	 */
	void setGlazing__horizontal(String value);

	/**
	 * Returns the value of the '<em><b>Glazing coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glazing coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glazing coefficient</em>' attribute.
	 * @see #setGlazing__coefficient(String)
	 * @see visGrid.VisGridPackage#getOffice_Glazing__coefficient()
	 * @model
	 * @generated
	 */
	String getGlazing__coefficient();

	/**
	 * Sets the value of the '{@link visGrid.Office#getGlazing__coefficient <em>Glazing coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glazing coefficient</em>' attribute.
	 * @see #getGlazing__coefficient()
	 * @generated
	 */
	void setGlazing__coefficient(String value);

	/**
	 * Returns the value of the '<em><b>Occupancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy</em>' attribute.
	 * @see #setOccupancy(String)
	 * @see visGrid.VisGridPackage#getOffice_Occupancy()
	 * @model
	 * @generated
	 */
	String getOccupancy();

	/**
	 * Sets the value of the '{@link visGrid.Office#getOccupancy <em>Occupancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy</em>' attribute.
	 * @see #getOccupancy()
	 * @generated
	 */
	void setOccupancy(String value);

	/**
	 * Returns the value of the '<em><b>Occupants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupants</em>' attribute.
	 * @see #setOccupants(String)
	 * @see visGrid.VisGridPackage#getOffice_Occupants()
	 * @model
	 * @generated
	 */
	String getOccupants();

	/**
	 * Sets the value of the '{@link visGrid.Office#getOccupants <em>Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupants</em>' attribute.
	 * @see #getOccupants()
	 * @generated
	 */
	void setOccupants(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute.
	 * @see #setSchedule(String)
	 * @see visGrid.VisGridPackage#getOffice_Schedule()
	 * @model
	 * @generated
	 */
	String getSchedule();

	/**
	 * Sets the value of the '{@link visGrid.Office#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Air_temperature()
	 * @model
	 * @generated
	 */
	String getAir_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getAir_temperature <em>Air temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air temperature</em>' attribute.
	 * @see #getAir_temperature()
	 * @generated
	 */
	void setAir_temperature(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Mass_temperature()
	 * @model
	 * @generated
	 */
	String getMass_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getMass_temperature <em>Mass temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass temperature</em>' attribute.
	 * @see #getMass_temperature()
	 * @generated
	 */
	void setMass_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Temperature change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature change</em>' attribute.
	 * @see #setTemperature_change(String)
	 * @see visGrid.VisGridPackage#getOffice_Temperature_change()
	 * @model
	 * @generated
	 */
	String getTemperature_change();

	/**
	 * Sets the value of the '{@link visGrid.Office#getTemperature_change <em>Temperature change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature change</em>' attribute.
	 * @see #getTemperature_change()
	 * @generated
	 */
	void setTemperature_change(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Outdoor_temperature()
	 * @model
	 * @generated
	 */
	String getOutdoor_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getOutdoor_temperature <em>Outdoor temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outdoor temperature</em>' attribute.
	 * @see #getOutdoor_temperature()
	 * @generated
	 */
	void setOutdoor_temperature(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Qh()
	 * @model
	 * @generated
	 */
	String getQh();

	/**
	 * Sets the value of the '{@link visGrid.Office#getQh <em>Qh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qh</em>' attribute.
	 * @see #getQh()
	 * @generated
	 */
	void setQh(String value);

	/**
	 * Returns the value of the '<em><b>Qs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qs</em>' attribute.
	 * @see #setQs(String)
	 * @see visGrid.VisGridPackage#getOffice_Qs()
	 * @model
	 * @generated
	 */
	String getQs();

	/**
	 * Sets the value of the '{@link visGrid.Office#getQs <em>Qs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qs</em>' attribute.
	 * @see #getQs()
	 * @generated
	 */
	void setQs(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Qi()
	 * @model
	 * @generated
	 */
	String getQi();

	/**
	 * Sets the value of the '{@link visGrid.Office#getQi <em>Qi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qi</em>' attribute.
	 * @see #getQi()
	 * @generated
	 */
	void setQi(String value);

	/**
	 * Returns the value of the '<em><b>Qz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qz</em>' attribute.
	 * @see #setQz(String)
	 * @see visGrid.VisGridPackage#getOffice_Qz()
	 * @model
	 * @generated
	 */
	String getQz();

	/**
	 * Sets the value of the '{@link visGrid.Office#getQz <em>Qz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qz</em>' attribute.
	 * @see #getQz()
	 * @generated
	 */
	void setQz(String value);

	/**
	 * Returns the value of the '<em><b>Hvac mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac mode</em>' attribute.
	 * @see #setHvac_mode(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac_mode()
	 * @model
	 * @generated
	 */
	String getHvac_mode();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac_mode <em>Hvac mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac mode</em>' attribute.
	 * @see #getHvac_mode()
	 * @generated
	 */
	void setHvac_mode(String value);

	/**
	 * Returns the value of the '<em><b>Hvac cooling balance temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac cooling balance temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac cooling balance temperature</em>' attribute.
	 * @see #setHvac__cooling__balance_temperature(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__cooling__balance_temperature()
	 * @model
	 * @generated
	 */
	String getHvac__cooling__balance_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__cooling__balance_temperature <em>Hvac cooling balance temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac cooling balance temperature</em>' attribute.
	 * @see #getHvac__cooling__balance_temperature()
	 * @generated
	 */
	void setHvac__cooling__balance_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Hvac cooling capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac cooling capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac cooling capacity</em>' attribute.
	 * @see #setHvac__cooling__capacity(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__cooling__capacity()
	 * @model
	 * @generated
	 */
	String getHvac__cooling__capacity();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__cooling__capacity <em>Hvac cooling capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac cooling capacity</em>' attribute.
	 * @see #getHvac__cooling__capacity()
	 * @generated
	 */
	void setHvac__cooling__capacity(String value);

	/**
	 * Returns the value of the '<em><b>Hvac cooling capacity per F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac cooling capacity per F</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac cooling capacity per F</em>' attribute.
	 * @see #setHvac__cooling__capacity_perF(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__cooling__capacity_perF()
	 * @model
	 * @generated
	 */
	String getHvac__cooling__capacity_perF();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__cooling__capacity_perF <em>Hvac cooling capacity per F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac cooling capacity per F</em>' attribute.
	 * @see #getHvac__cooling__capacity_perF()
	 * @generated
	 */
	void setHvac__cooling__capacity_perF(String value);

	/**
	 * Returns the value of the '<em><b>Hvac cooling design temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac cooling design temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac cooling design temperature</em>' attribute.
	 * @see #setHvac__cooling__design_temperature(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__cooling__design_temperature()
	 * @model
	 * @generated
	 */
	String getHvac__cooling__design_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__cooling__design_temperature <em>Hvac cooling design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac cooling design temperature</em>' attribute.
	 * @see #getHvac__cooling__design_temperature()
	 * @generated
	 */
	void setHvac__cooling__design_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Hvac cooling efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac cooling efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac cooling efficiency</em>' attribute.
	 * @see #setHvac__cooling__efficiency(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__cooling__efficiency()
	 * @model
	 * @generated
	 */
	String getHvac__cooling__efficiency();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__cooling__efficiency <em>Hvac cooling efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac cooling efficiency</em>' attribute.
	 * @see #getHvac__cooling__efficiency()
	 * @generated
	 */
	void setHvac__cooling__efficiency(String value);

	/**
	 * Returns the value of the '<em><b>Hvac cooling cop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac cooling cop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac cooling cop</em>' attribute.
	 * @see #setHvac__cooling__cop(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__cooling__cop()
	 * @model
	 * @generated
	 */
	String getHvac__cooling__cop();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__cooling__cop <em>Hvac cooling cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac cooling cop</em>' attribute.
	 * @see #getHvac__cooling__cop()
	 * @generated
	 */
	void setHvac__cooling__cop(String value);

	/**
	 * Returns the value of the '<em><b>Hvac heating balance temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac heating balance temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac heating balance temperature</em>' attribute.
	 * @see #setHvac__heating__balance_temperature(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__heating__balance_temperature()
	 * @model
	 * @generated
	 */
	String getHvac__heating__balance_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__heating__balance_temperature <em>Hvac heating balance temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac heating balance temperature</em>' attribute.
	 * @see #getHvac__heating__balance_temperature()
	 * @generated
	 */
	void setHvac__heating__balance_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Hvac heating capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac heating capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac heating capacity</em>' attribute.
	 * @see #setHvac__heating__capacity(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__heating__capacity()
	 * @model
	 * @generated
	 */
	String getHvac__heating__capacity();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__heating__capacity <em>Hvac heating capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac heating capacity</em>' attribute.
	 * @see #getHvac__heating__capacity()
	 * @generated
	 */
	void setHvac__heating__capacity(String value);

	/**
	 * Returns the value of the '<em><b>Hvac heating capacity per F</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac heating capacity per F</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac heating capacity per F</em>' attribute.
	 * @see #setHvac__heating__capacity_perF(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__heating__capacity_perF()
	 * @model
	 * @generated
	 */
	String getHvac__heating__capacity_perF();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__heating__capacity_perF <em>Hvac heating capacity per F</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac heating capacity per F</em>' attribute.
	 * @see #getHvac__heating__capacity_perF()
	 * @generated
	 */
	void setHvac__heating__capacity_perF(String value);

	/**
	 * Returns the value of the '<em><b>Hvac heating design temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac heating design temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac heating design temperature</em>' attribute.
	 * @see #setHvac__heating__design_temperature(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__heating__design_temperature()
	 * @model
	 * @generated
	 */
	String getHvac__heating__design_temperature();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__heating__design_temperature <em>Hvac heating design temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac heating design temperature</em>' attribute.
	 * @see #getHvac__heating__design_temperature()
	 * @generated
	 */
	void setHvac__heating__design_temperature(String value);

	/**
	 * Returns the value of the '<em><b>Hvac heating efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac heating efficiency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac heating efficiency</em>' attribute.
	 * @see #setHvac__heating__efficiency(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__heating__efficiency()
	 * @model
	 * @generated
	 */
	String getHvac__heating__efficiency();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__heating__efficiency <em>Hvac heating efficiency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac heating efficiency</em>' attribute.
	 * @see #getHvac__heating__efficiency()
	 * @generated
	 */
	void setHvac__heating__efficiency(String value);

	/**
	 * Returns the value of the '<em><b>Hvac heating cop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac heating cop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac heating cop</em>' attribute.
	 * @see #setHvac__heating__cop(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__heating__cop()
	 * @model
	 * @generated
	 */
	String getHvac__heating__cop();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__heating__cop <em>Hvac heating cop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac heating cop</em>' attribute.
	 * @see #getHvac__heating__cop()
	 * @generated
	 */
	void setHvac__heating__cop(String value);

	/**
	 * Returns the value of the '<em><b>Lights capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights capacity</em>' attribute.
	 * @see #setLights__capacity(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__capacity()
	 * @model
	 * @generated
	 */
	String getLights__capacity();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__capacity <em>Lights capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights capacity</em>' attribute.
	 * @see #getLights__capacity()
	 * @generated
	 */
	void setLights__capacity(String value);

	/**
	 * Returns the value of the '<em><b>Lights fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights fraction</em>' attribute.
	 * @see #setLights__fraction(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__fraction()
	 * @model
	 * @generated
	 */
	String getLights__fraction();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__fraction <em>Lights fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights fraction</em>' attribute.
	 * @see #getLights__fraction()
	 * @generated
	 */
	void setLights__fraction(String value);

	/**
	 * Returns the value of the '<em><b>Plugs capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs capacity</em>' attribute.
	 * @see #setPlugs__capacity(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__capacity()
	 * @model
	 * @generated
	 */
	String getPlugs__capacity();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__capacity <em>Plugs capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs capacity</em>' attribute.
	 * @see #getPlugs__capacity()
	 * @generated
	 */
	void setPlugs__capacity(String value);

	/**
	 * Returns the value of the '<em><b>Plugs fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs fraction</em>' attribute.
	 * @see #setPlugs__fraction(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__fraction()
	 * @model
	 * @generated
	 */
	String getPlugs__fraction();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__fraction <em>Plugs fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs fraction</em>' attribute.
	 * @see #getPlugs__fraction()
	 * @generated
	 */
	void setPlugs__fraction(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Demand()
	 * @model
	 * @generated
	 */
	String getDemand();

	/**
	 * Sets the value of the '{@link visGrid.Office#getDemand <em>Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demand</em>' attribute.
	 * @see #getDemand()
	 * @generated
	 */
	void setDemand(String value);

	/**
	 * Returns the value of the '<em><b>Total load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total load</em>' attribute.
	 * @see #setTotal_load(String)
	 * @see visGrid.VisGridPackage#getOffice_Total_load()
	 * @model
	 * @generated
	 */
	String getTotal_load();

	/**
	 * Sets the value of the '{@link visGrid.Office#getTotal_load <em>Total load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total load</em>' attribute.
	 * @see #getTotal_load()
	 * @generated
	 */
	void setTotal_load(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Energy()
	 * @model
	 * @generated
	 */
	String getEnergy();

	/**
	 * Sets the value of the '{@link visGrid.Office#getEnergy <em>Energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy</em>' attribute.
	 * @see #getEnergy()
	 * @generated
	 */
	void setEnergy(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Power_factor()
	 * @model
	 * @generated
	 */
	String getPower_factor();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPower_factor <em>Power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power factor</em>' attribute.
	 * @see #getPower_factor()
	 * @generated
	 */
	void setPower_factor(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Power()
	 * @model
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(String value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(String)
	 * @see visGrid.VisGridPackage#getOffice_Current()
	 * @model
	 * @generated
	 */
	String getCurrent();

	/**
	 * Sets the value of the '{@link visGrid.Office#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(String value);

	/**
	 * Returns the value of the '<em><b>Admittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admittance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admittance</em>' attribute.
	 * @see #setAdmittance(String)
	 * @see visGrid.VisGridPackage#getOffice_Admittance()
	 * @model
	 * @generated
	 */
	String getAdmittance();

	/**
	 * Sets the value of the '{@link visGrid.Office#getAdmittance <em>Admittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admittance</em>' attribute.
	 * @see #getAdmittance()
	 * @generated
	 */
	void setAdmittance(String value);

	/**
	 * Returns the value of the '<em><b>Hvac demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac demand</em>' attribute.
	 * @see #setHvac__demand(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__demand()
	 * @model
	 * @generated
	 */
	String getHvac__demand();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__demand <em>Hvac demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac demand</em>' attribute.
	 * @see #getHvac__demand()
	 * @generated
	 */
	void setHvac__demand(String value);

	/**
	 * Returns the value of the '<em><b>Hvac load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac load</em>' attribute.
	 * @see #setHvac__load(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__load()
	 * @model
	 * @generated
	 */
	String getHvac__load();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__load <em>Hvac load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac load</em>' attribute.
	 * @see #getHvac__load()
	 * @generated
	 */
	void setHvac__load(String value);

	/**
	 * Returns the value of the '<em><b>Hvac energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac energy</em>' attribute.
	 * @see #setHvac__energy(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__energy()
	 * @model
	 * @generated
	 */
	String getHvac__energy();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__energy <em>Hvac energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac energy</em>' attribute.
	 * @see #getHvac__energy()
	 * @generated
	 */
	void setHvac__energy(String value);

	/**
	 * Returns the value of the '<em><b>Hvac power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hvac power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hvac power factor</em>' attribute.
	 * @see #setHvac__power_factor(String)
	 * @see visGrid.VisGridPackage#getOffice_Hvac__power_factor()
	 * @model
	 * @generated
	 */
	String getHvac__power_factor();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHvac__power_factor <em>Hvac power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hvac power factor</em>' attribute.
	 * @see #getHvac__power_factor()
	 * @generated
	 */
	void setHvac__power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Lights demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights demand</em>' attribute.
	 * @see #setLights__demand(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__demand()
	 * @model
	 * @generated
	 */
	String getLights__demand();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__demand <em>Lights demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights demand</em>' attribute.
	 * @see #getLights__demand()
	 * @generated
	 */
	void setLights__demand(String value);

	/**
	 * Returns the value of the '<em><b>Lights load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights load</em>' attribute.
	 * @see #setLights__load(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__load()
	 * @model
	 * @generated
	 */
	String getLights__load();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__load <em>Lights load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights load</em>' attribute.
	 * @see #getLights__load()
	 * @generated
	 */
	void setLights__load(String value);

	/**
	 * Returns the value of the '<em><b>Lights energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights energy</em>' attribute.
	 * @see #setLights__energy(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__energy()
	 * @model
	 * @generated
	 */
	String getLights__energy();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__energy <em>Lights energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights energy</em>' attribute.
	 * @see #getLights__energy()
	 * @generated
	 */
	void setLights__energy(String value);

	/**
	 * Returns the value of the '<em><b>Lights power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights power factor</em>' attribute.
	 * @see #setLights__power_factor(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__power_factor()
	 * @model
	 * @generated
	 */
	String getLights__power_factor();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__power_factor <em>Lights power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights power factor</em>' attribute.
	 * @see #getLights__power_factor()
	 * @generated
	 */
	void setLights__power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Lights heatgain fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights heatgain fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights heatgain fraction</em>' attribute.
	 * @see #setLights__heatgain_fraction(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getLights__heatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__heatgain_fraction <em>Lights heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights heatgain fraction</em>' attribute.
	 * @see #getLights__heatgain_fraction()
	 * @generated
	 */
	void setLights__heatgain_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Lights heatgain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights heatgain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights heatgain</em>' attribute.
	 * @see #setLights__heatgain(String)
	 * @see visGrid.VisGridPackage#getOffice_Lights__heatgain()
	 * @model
	 * @generated
	 */
	String getLights__heatgain();

	/**
	 * Sets the value of the '{@link visGrid.Office#getLights__heatgain <em>Lights heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lights heatgain</em>' attribute.
	 * @see #getLights__heatgain()
	 * @generated
	 */
	void setLights__heatgain(String value);

	/**
	 * Returns the value of the '<em><b>Plugs demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs demand</em>' attribute.
	 * @see #setPlugs__demand(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__demand()
	 * @model
	 * @generated
	 */
	String getPlugs__demand();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__demand <em>Plugs demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs demand</em>' attribute.
	 * @see #getPlugs__demand()
	 * @generated
	 */
	void setPlugs__demand(String value);

	/**
	 * Returns the value of the '<em><b>Plugs load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs load</em>' attribute.
	 * @see #setPlugs__load(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__load()
	 * @model
	 * @generated
	 */
	String getPlugs__load();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__load <em>Plugs load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs load</em>' attribute.
	 * @see #getPlugs__load()
	 * @generated
	 */
	void setPlugs__load(String value);

	/**
	 * Returns the value of the '<em><b>Plugs energy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs energy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs energy</em>' attribute.
	 * @see #setPlugs__energy(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__energy()
	 * @model
	 * @generated
	 */
	String getPlugs__energy();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__energy <em>Plugs energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs energy</em>' attribute.
	 * @see #getPlugs__energy()
	 * @generated
	 */
	void setPlugs__energy(String value);

	/**
	 * Returns the value of the '<em><b>Plugs power factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs power factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs power factor</em>' attribute.
	 * @see #setPlugs__power_factor(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__power_factor()
	 * @model
	 * @generated
	 */
	String getPlugs__power_factor();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__power_factor <em>Plugs power factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs power factor</em>' attribute.
	 * @see #getPlugs__power_factor()
	 * @generated
	 */
	void setPlugs__power_factor(String value);

	/**
	 * Returns the value of the '<em><b>Plugs heatgain fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs heatgain fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs heatgain fraction</em>' attribute.
	 * @see #setPlugs__heatgain_fraction(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__heatgain_fraction()
	 * @model
	 * @generated
	 */
	String getPlugs__heatgain_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__heatgain_fraction <em>Plugs heatgain fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs heatgain fraction</em>' attribute.
	 * @see #getPlugs__heatgain_fraction()
	 * @generated
	 */
	void setPlugs__heatgain_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Plugs heatgain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugs heatgain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugs heatgain</em>' attribute.
	 * @see #setPlugs__heatgain(String)
	 * @see visGrid.VisGridPackage#getOffice_Plugs__heatgain()
	 * @model
	 * @generated
	 */
	String getPlugs__heatgain();

	/**
	 * Sets the value of the '{@link visGrid.Office#getPlugs__heatgain <em>Plugs heatgain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugs heatgain</em>' attribute.
	 * @see #getPlugs__heatgain()
	 * @generated
	 */
	void setPlugs__heatgain(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Cooling_setpoint()
	 * @model
	 * @generated
	 */
	String getCooling_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Office#getCooling_setpoint <em>Cooling setpoint</em>}' attribute.
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
	 * @see visGrid.VisGridPackage#getOffice_Heating_setpoint()
	 * @model
	 * @generated
	 */
	String getHeating_setpoint();

	/**
	 * Sets the value of the '{@link visGrid.Office#getHeating_setpoint <em>Heating setpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heating setpoint</em>' attribute.
	 * @see #getHeating_setpoint()
	 * @generated
	 */
	void setHeating_setpoint(String value);

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
	 * @see visGrid.VisGridPackage#getOffice_Thermostat_deadband()
	 * @model
	 * @generated
	 */
	String getThermostat_deadband();

	/**
	 * Sets the value of the '{@link visGrid.Office#getThermostat_deadband <em>Thermostat deadband</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermostat deadband</em>' attribute.
	 * @see #getThermostat_deadband()
	 * @generated
	 */
	void setThermostat_deadband(String value);

	/**
	 * Returns the value of the '<em><b>Control ventilation fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control ventilation fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control ventilation fraction</em>' attribute.
	 * @see #setControl__ventilation_fraction(String)
	 * @see visGrid.VisGridPackage#getOffice_Control__ventilation_fraction()
	 * @model
	 * @generated
	 */
	String getControl__ventilation_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Office#getControl__ventilation_fraction <em>Control ventilation fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control ventilation fraction</em>' attribute.
	 * @see #getControl__ventilation_fraction()
	 * @generated
	 */
	void setControl__ventilation_fraction(String value);

	/**
	 * Returns the value of the '<em><b>Control lighting fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control lighting fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control lighting fraction</em>' attribute.
	 * @see #setControl__lighting_fraction(String)
	 * @see visGrid.VisGridPackage#getOffice_Control__lighting_fraction()
	 * @model
	 * @generated
	 */
	String getControl__lighting_fraction();

	/**
	 * Sets the value of the '{@link visGrid.Office#getControl__lighting_fraction <em>Control lighting fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control lighting fraction</em>' attribute.
	 * @see #getControl__lighting_fraction()
	 * @generated
	 */
	void setControl__lighting_fraction(String value);

	/**
	 * Returns the value of the '<em><b>ACH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACH</em>' attribute.
	 * @see #setACH(String)
	 * @see visGrid.VisGridPackage#getOffice_ACH()
	 * @model
	 * @generated
	 */
	String getACH();

	/**
	 * Sets the value of the '{@link visGrid.Office#getACH <em>ACH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACH</em>' attribute.
	 * @see #getACH()
	 * @generated
	 */
	void setACH(String value);

} // Office
