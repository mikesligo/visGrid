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
 * A representation of the model object '<em><b>Csv reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Csv_reader#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getIndex <em>Index</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getCity_name <em>City name</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getState_name <em>State name</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getLat_deg <em>Lat deg</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getLat_min <em>Lat min</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getLong_deg <em>Long deg</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getLong_min <em>Long min</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getLow_temp <em>Low temp</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getHigh_temp <em>High temp</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getPeak_solar <em>Peak solar</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getStatus <em>Status</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getTimefmt <em>Timefmt</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getColumns <em>Columns</em>}</li>
 *   <li>{@link visGrid.Csv_reader#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getCsv_reader()
 * @model
 * @generated
 */
public interface Csv_reader extends EObject {
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
	 * @see visGrid.VisGridPackage#getCsv_reader_Connection()
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
	 * @see visGrid.VisGridPackage#getCsv_reader_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

	/**
	 * Returns the value of the '<em><b>City name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City name</em>' attribute.
	 * @see #setCity_name(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_City_name()
	 * @model
	 * @generated
	 */
	String getCity_name();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getCity_name <em>City name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City name</em>' attribute.
	 * @see #getCity_name()
	 * @generated
	 */
	void setCity_name(String value);

	/**
	 * Returns the value of the '<em><b>State name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State name</em>' attribute.
	 * @see #setState_name(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_State_name()
	 * @model
	 * @generated
	 */
	String getState_name();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getState_name <em>State name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State name</em>' attribute.
	 * @see #getState_name()
	 * @generated
	 */
	void setState_name(String value);

	/**
	 * Returns the value of the '<em><b>Lat deg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat deg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat deg</em>' attribute.
	 * @see #setLat_deg(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Lat_deg()
	 * @model
	 * @generated
	 */
	String getLat_deg();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getLat_deg <em>Lat deg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat deg</em>' attribute.
	 * @see #getLat_deg()
	 * @generated
	 */
	void setLat_deg(String value);

	/**
	 * Returns the value of the '<em><b>Lat min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat min</em>' attribute.
	 * @see #setLat_min(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Lat_min()
	 * @model
	 * @generated
	 */
	String getLat_min();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getLat_min <em>Lat min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat min</em>' attribute.
	 * @see #getLat_min()
	 * @generated
	 */
	void setLat_min(String value);

	/**
	 * Returns the value of the '<em><b>Long deg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long deg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long deg</em>' attribute.
	 * @see #setLong_deg(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Long_deg()
	 * @model
	 * @generated
	 */
	String getLong_deg();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getLong_deg <em>Long deg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long deg</em>' attribute.
	 * @see #getLong_deg()
	 * @generated
	 */
	void setLong_deg(String value);

	/**
	 * Returns the value of the '<em><b>Long min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long min</em>' attribute.
	 * @see #setLong_min(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Long_min()
	 * @model
	 * @generated
	 */
	String getLong_min();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getLong_min <em>Long min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long min</em>' attribute.
	 * @see #getLong_min()
	 * @generated
	 */
	void setLong_min(String value);

	/**
	 * Returns the value of the '<em><b>Low temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low temp</em>' attribute.
	 * @see #setLow_temp(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Low_temp()
	 * @model
	 * @generated
	 */
	String getLow_temp();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getLow_temp <em>Low temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low temp</em>' attribute.
	 * @see #getLow_temp()
	 * @generated
	 */
	void setLow_temp(String value);

	/**
	 * Returns the value of the '<em><b>High temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High temp</em>' attribute.
	 * @see #setHigh_temp(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_High_temp()
	 * @model
	 * @generated
	 */
	String getHigh_temp();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getHigh_temp <em>High temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High temp</em>' attribute.
	 * @see #getHigh_temp()
	 * @generated
	 */
	void setHigh_temp(String value);

	/**
	 * Returns the value of the '<em><b>Peak solar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peak solar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak solar</em>' attribute.
	 * @see #setPeak_solar(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Peak_solar()
	 * @model
	 * @generated
	 */
	String getPeak_solar();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getPeak_solar <em>Peak solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak solar</em>' attribute.
	 * @see #getPeak_solar()
	 * @generated
	 */
	void setPeak_solar(String value);

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
	 * @see visGrid.VisGridPackage#getCsv_reader_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Timefmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timefmt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timefmt</em>' attribute.
	 * @see #setTimefmt(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Timefmt()
	 * @model
	 * @generated
	 */
	String getTimefmt();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getTimefmt <em>Timefmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timefmt</em>' attribute.
	 * @see #getTimefmt()
	 * @generated
	 */
	void setTimefmt(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timezone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Timezone()
	 * @model
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Columns()
	 * @model
	 * @generated
	 */
	String getColumns();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see visGrid.VisGridPackage#getCsv_reader_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link visGrid.Csv_reader#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // Csv_reader
