/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Climate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Climate#getCity <em>City</em>}</li>
 *   <li>{@link visGrid.Climate#getTmyfile <em>Tmyfile</em>}</li>
 *   <li>{@link visGrid.Climate#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link visGrid.Climate#getHumidity <em>Humidity</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_flux <em>Solar flux</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_direct <em>Solar direct</em>}</li>
 *   <li>{@link visGrid.Climate#getWind_speed <em>Wind speed</em>}</li>
 *   <li>{@link visGrid.Climate#getWind_dir <em>Wind dir</em>}</li>
 *   <li>{@link visGrid.Climate#getWind_gust <em>Wind gust</em>}</li>
 *   <li>{@link visGrid.Climate#getRecord__low <em>Record low</em>}</li>
 *   <li>{@link visGrid.Climate#getRecord__low_day <em>Record low day</em>}</li>
 *   <li>{@link visGrid.Climate#getRecord__high <em>Record high</em>}</li>
 *   <li>{@link visGrid.Climate#getRecord__high_day <em>Record high day</em>}</li>
 *   <li>{@link visGrid.Climate#getRecord__solar <em>Record solar</em>}</li>
 *   <li>{@link visGrid.Climate#getRainfall <em>Rainfall</em>}</li>
 *   <li>{@link visGrid.Climate#getSnowdepth <em>Snowdepth</em>}</li>
 *   <li>{@link visGrid.Climate#getInterpolate <em>Interpolate</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_horiz <em>Solar horiz</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_north <em>Solar north</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_northeast <em>Solar northeast</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_east <em>Solar east</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_southeast <em>Solar southeast</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_south <em>Solar south</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_southwest <em>Solar southwest</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_west <em>Solar west</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_northwest <em>Solar northwest</em>}</li>
 *   <li>{@link visGrid.Climate#getSolar_raw <em>Solar raw</em>}</li>
 *   <li>{@link visGrid.Climate#getReader <em>Reader</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getClimate()
 * @model
 * @generated
 */
public interface Climate extends Connection {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see visGrid.VisGridPackage#getClimate_City()
	 * @model default=""
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Tmyfile</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmyfile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmyfile</em>' attribute.
	 * @see #setTmyfile(String)
	 * @see visGrid.VisGridPackage#getClimate_Tmyfile()
	 * @model default=""
	 * @generated
	 */
	String getTmyfile();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getTmyfile <em>Tmyfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmyfile</em>' attribute.
	 * @see #getTmyfile()
	 * @generated
	 */
	void setTmyfile(String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(String)
	 * @see visGrid.VisGridPackage#getClimate_Temperature()
	 * @model default=""
	 * @generated
	 */
	String getTemperature();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(String value);

	/**
	 * Returns the value of the '<em><b>Humidity</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Humidity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidity</em>' attribute.
	 * @see #setHumidity(String)
	 * @see visGrid.VisGridPackage#getClimate_Humidity()
	 * @model default=""
	 * @generated
	 */
	String getHumidity();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getHumidity <em>Humidity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidity</em>' attribute.
	 * @see #getHumidity()
	 * @generated
	 */
	void setHumidity(String value);

	/**
	 * Returns the value of the '<em><b>Solar flux</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar flux</em>' attribute.
	 * @see #setSolar_flux(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_flux()
	 * @model default=""
	 * @generated
	 */
	String getSolar_flux();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_flux <em>Solar flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar flux</em>' attribute.
	 * @see #getSolar_flux()
	 * @generated
	 */
	void setSolar_flux(String value);

	/**
	 * Returns the value of the '<em><b>Solar direct</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar direct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar direct</em>' attribute.
	 * @see #setSolar_direct(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_direct()
	 * @model default=""
	 * @generated
	 */
	String getSolar_direct();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_direct <em>Solar direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar direct</em>' attribute.
	 * @see #getSolar_direct()
	 * @generated
	 */
	void setSolar_direct(String value);

	/**
	 * Returns the value of the '<em><b>Wind speed</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wind speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind speed</em>' attribute.
	 * @see #setWind_speed(String)
	 * @see visGrid.VisGridPackage#getClimate_Wind_speed()
	 * @model default=""
	 * @generated
	 */
	String getWind_speed();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getWind_speed <em>Wind speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind speed</em>' attribute.
	 * @see #getWind_speed()
	 * @generated
	 */
	void setWind_speed(String value);

	/**
	 * Returns the value of the '<em><b>Wind dir</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wind dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind dir</em>' attribute.
	 * @see #setWind_dir(String)
	 * @see visGrid.VisGridPackage#getClimate_Wind_dir()
	 * @model default=""
	 * @generated
	 */
	String getWind_dir();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getWind_dir <em>Wind dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind dir</em>' attribute.
	 * @see #getWind_dir()
	 * @generated
	 */
	void setWind_dir(String value);

	/**
	 * Returns the value of the '<em><b>Wind gust</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wind gust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wind gust</em>' attribute.
	 * @see #setWind_gust(String)
	 * @see visGrid.VisGridPackage#getClimate_Wind_gust()
	 * @model default=""
	 * @generated
	 */
	String getWind_gust();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getWind_gust <em>Wind gust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind gust</em>' attribute.
	 * @see #getWind_gust()
	 * @generated
	 */
	void setWind_gust(String value);

	/**
	 * Returns the value of the '<em><b>Record low</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record low</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record low</em>' attribute.
	 * @see #setRecord__low(String)
	 * @see visGrid.VisGridPackage#getClimate_Record__low()
	 * @model default=""
	 * @generated
	 */
	String getRecord__low();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getRecord__low <em>Record low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record low</em>' attribute.
	 * @see #getRecord__low()
	 * @generated
	 */
	void setRecord__low(String value);

	/**
	 * Returns the value of the '<em><b>Record low day</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record low day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record low day</em>' attribute.
	 * @see #setRecord__low_day(String)
	 * @see visGrid.VisGridPackage#getClimate_Record__low_day()
	 * @model default=""
	 * @generated
	 */
	String getRecord__low_day();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getRecord__low_day <em>Record low day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record low day</em>' attribute.
	 * @see #getRecord__low_day()
	 * @generated
	 */
	void setRecord__low_day(String value);

	/**
	 * Returns the value of the '<em><b>Record high</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record high</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record high</em>' attribute.
	 * @see #setRecord__high(String)
	 * @see visGrid.VisGridPackage#getClimate_Record__high()
	 * @model default=""
	 * @generated
	 */
	String getRecord__high();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getRecord__high <em>Record high</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record high</em>' attribute.
	 * @see #getRecord__high()
	 * @generated
	 */
	void setRecord__high(String value);

	/**
	 * Returns the value of the '<em><b>Record high day</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record high day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record high day</em>' attribute.
	 * @see #setRecord__high_day(String)
	 * @see visGrid.VisGridPackage#getClimate_Record__high_day()
	 * @model default=""
	 * @generated
	 */
	String getRecord__high_day();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getRecord__high_day <em>Record high day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record high day</em>' attribute.
	 * @see #getRecord__high_day()
	 * @generated
	 */
	void setRecord__high_day(String value);

	/**
	 * Returns the value of the '<em><b>Record solar</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record solar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record solar</em>' attribute.
	 * @see #setRecord__solar(String)
	 * @see visGrid.VisGridPackage#getClimate_Record__solar()
	 * @model default=""
	 * @generated
	 */
	String getRecord__solar();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getRecord__solar <em>Record solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record solar</em>' attribute.
	 * @see #getRecord__solar()
	 * @generated
	 */
	void setRecord__solar(String value);

	/**
	 * Returns the value of the '<em><b>Rainfall</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rainfall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rainfall</em>' attribute.
	 * @see #setRainfall(String)
	 * @see visGrid.VisGridPackage#getClimate_Rainfall()
	 * @model default=""
	 * @generated
	 */
	String getRainfall();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getRainfall <em>Rainfall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rainfall</em>' attribute.
	 * @see #getRainfall()
	 * @generated
	 */
	void setRainfall(String value);

	/**
	 * Returns the value of the '<em><b>Snowdepth</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snowdepth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snowdepth</em>' attribute.
	 * @see #setSnowdepth(String)
	 * @see visGrid.VisGridPackage#getClimate_Snowdepth()
	 * @model default=""
	 * @generated
	 */
	String getSnowdepth();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSnowdepth <em>Snowdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snowdepth</em>' attribute.
	 * @see #getSnowdepth()
	 * @generated
	 */
	void setSnowdepth(String value);

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(String)
	 * @see visGrid.VisGridPackage#getClimate_Interpolate()
	 * @model default=""
	 * @generated
	 */
	String getInterpolate();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #getInterpolate()
	 * @generated
	 */
	void setInterpolate(String value);

	/**
	 * Returns the value of the '<em><b>Solar horiz</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar horiz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar horiz</em>' attribute.
	 * @see #setSolar_horiz(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_horiz()
	 * @model default=""
	 * @generated
	 */
	String getSolar_horiz();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_horiz <em>Solar horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar horiz</em>' attribute.
	 * @see #getSolar_horiz()
	 * @generated
	 */
	void setSolar_horiz(String value);

	/**
	 * Returns the value of the '<em><b>Solar north</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar north</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar north</em>' attribute.
	 * @see #setSolar_north(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_north()
	 * @model default=""
	 * @generated
	 */
	String getSolar_north();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_north <em>Solar north</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar north</em>' attribute.
	 * @see #getSolar_north()
	 * @generated
	 */
	void setSolar_north(String value);

	/**
	 * Returns the value of the '<em><b>Solar northeast</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar northeast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar northeast</em>' attribute.
	 * @see #setSolar_northeast(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_northeast()
	 * @model default=""
	 * @generated
	 */
	String getSolar_northeast();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_northeast <em>Solar northeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar northeast</em>' attribute.
	 * @see #getSolar_northeast()
	 * @generated
	 */
	void setSolar_northeast(String value);

	/**
	 * Returns the value of the '<em><b>Solar east</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar east</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar east</em>' attribute.
	 * @see #setSolar_east(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_east()
	 * @model default=""
	 * @generated
	 */
	String getSolar_east();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_east <em>Solar east</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar east</em>' attribute.
	 * @see #getSolar_east()
	 * @generated
	 */
	void setSolar_east(String value);

	/**
	 * Returns the value of the '<em><b>Solar southeast</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar southeast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar southeast</em>' attribute.
	 * @see #setSolar_southeast(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_southeast()
	 * @model default=""
	 * @generated
	 */
	String getSolar_southeast();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_southeast <em>Solar southeast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar southeast</em>' attribute.
	 * @see #getSolar_southeast()
	 * @generated
	 */
	void setSolar_southeast(String value);

	/**
	 * Returns the value of the '<em><b>Solar south</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar south</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar south</em>' attribute.
	 * @see #setSolar_south(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_south()
	 * @model default=""
	 * @generated
	 */
	String getSolar_south();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_south <em>Solar south</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar south</em>' attribute.
	 * @see #getSolar_south()
	 * @generated
	 */
	void setSolar_south(String value);

	/**
	 * Returns the value of the '<em><b>Solar southwest</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar southwest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar southwest</em>' attribute.
	 * @see #setSolar_southwest(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_southwest()
	 * @model default=""
	 * @generated
	 */
	String getSolar_southwest();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_southwest <em>Solar southwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar southwest</em>' attribute.
	 * @see #getSolar_southwest()
	 * @generated
	 */
	void setSolar_southwest(String value);

	/**
	 * Returns the value of the '<em><b>Solar west</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar west</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar west</em>' attribute.
	 * @see #setSolar_west(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_west()
	 * @model default=""
	 * @generated
	 */
	String getSolar_west();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_west <em>Solar west</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar west</em>' attribute.
	 * @see #getSolar_west()
	 * @generated
	 */
	void setSolar_west(String value);

	/**
	 * Returns the value of the '<em><b>Solar northwest</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar northwest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar northwest</em>' attribute.
	 * @see #setSolar_northwest(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_northwest()
	 * @model default=""
	 * @generated
	 */
	String getSolar_northwest();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_northwest <em>Solar northwest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar northwest</em>' attribute.
	 * @see #getSolar_northwest()
	 * @generated
	 */
	void setSolar_northwest(String value);

	/**
	 * Returns the value of the '<em><b>Solar raw</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar raw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar raw</em>' attribute.
	 * @see #setSolar_raw(String)
	 * @see visGrid.VisGridPackage#getClimate_Solar_raw()
	 * @model default=""
	 * @generated
	 */
	String getSolar_raw();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getSolar_raw <em>Solar raw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solar raw</em>' attribute.
	 * @see #getSolar_raw()
	 * @generated
	 */
	void setSolar_raw(String value);

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' attribute.
	 * @see #setReader(String)
	 * @see visGrid.VisGridPackage#getClimate_Reader()
	 * @model default=""
	 * @generated
	 */
	String getReader();

	/**
	 * Sets the value of the '{@link visGrid.Climate#getReader <em>Reader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader</em>' attribute.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(String value);

} // Climate
