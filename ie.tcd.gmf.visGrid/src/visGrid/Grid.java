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
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Grid#getCsv_reader <em>Csv reader</em>}</li>
 *   <li>{@link visGrid.Grid#getDiesel_dg <em>Diesel dg</em>}</li>
 *   <li>{@link visGrid.Grid#getEnergy_storage <em>Energy storage</em>}</li>
 *   <li>{@link visGrid.Grid#getInverter <em>Inverter</em>}</li>
 *   <li>{@link visGrid.Grid#getDc_dc_converter <em>Dc dc converter</em>}</li>
 *   <li>{@link visGrid.Grid#getBattery <em>Battery</em>}</li>
 *   <li>{@link visGrid.Grid#getAuction <em>Auction</em>}</li>
 *   <li>{@link visGrid.Grid#getController <em>Controller</em>}</li>
 *   <li>{@link visGrid.Grid#getController2 <em>Controller2</em>}</li>
 *   <li>{@link visGrid.Grid#getCapbank <em>Capbank</em>}</li>
 *   <li>{@link visGrid.Grid#getComm <em>Comm</em>}</li>
 *   <li>{@link visGrid.Grid#getCapacitor <em>Capacitor</em>}</li>
 *   <li>{@link visGrid.Grid#getLine <em>Line</em>}</li>
 *   <li>{@link visGrid.Grid#getLine_spacing <em>Line spacing</em>}</li>
 *   <li>{@link visGrid.Grid#getOverhead_line <em>Overhead line</em>}</li>
 *   <li>{@link visGrid.Grid#getUnderground_line <em>Underground line</em>}</li>
 *   <li>{@link visGrid.Grid#getOverhead_line_conductor <em>Overhead line conductor</em>}</li>
 *   <li>{@link visGrid.Grid#getUnderground_line_conductor <em>Underground line conductor</em>}</li>
 *   <li>{@link visGrid.Grid#getLine_configuration <em>Line configuration</em>}</li>
 *   <li>{@link visGrid.Grid#getTransformer_configuration <em>Transformer configuration</em>}</li>
 *   <li>{@link visGrid.Grid#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.Grid#getRegulator_configuration <em>Regulator configuration</em>}</li>
 *   <li>{@link visGrid.Grid#getTriplex_node <em>Triplex node</em>}</li>
 *   <li>{@link visGrid.Grid#getTriplex_meter <em>Triplex meter</em>}</li>
 *   <li>{@link visGrid.Grid#getTriplex_line <em>Triplex line</em>}</li>
 *   <li>{@link visGrid.Grid#getTriplex_line_configuration <em>Triplex line configuration</em>}</li>
 *   <li>{@link visGrid.Grid#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 *   <li>{@link visGrid.Grid#getSwitch <em>Switch</em>}</li>
 *   <li>{@link visGrid.Grid#getSubstation <em>Substation</em>}</li>
 *   <li>{@link visGrid.Grid#getPqload <em>Pqload</em>}</li>
 *   <li>{@link visGrid.Grid#getVoltdump <em>Voltdump</em>}</li>
 *   <li>{@link visGrid.Grid#getSeries_reactor <em>Series reactor</em>}</li>
 *   <li>{@link visGrid.Grid#getRestoration <em>Restoration</em>}</li>
 *   <li>{@link visGrid.Grid#getFrequency_gen <em>Frequency gen</em>}</li>
 *   <li>{@link visGrid.Grid#getVolt_var_control <em>Volt var control</em>}</li>
 *   <li>{@link visGrid.Grid#getFault_check <em>Fault check</em>}</li>
 *   <li>{@link visGrid.Grid#getMotor <em>Motor</em>}</li>
 *   <li>{@link visGrid.Grid#getBilldump <em>Billdump</em>}</li>
 *   <li>{@link visGrid.Grid#getResidential_enduse <em>Residential enduse</em>}</li>
 *   <li>{@link visGrid.Grid#getHouse_a <em>House a</em>}</li>
 *   <li>{@link visGrid.Grid#getHouse <em>House</em>}</li>
 *   <li>{@link visGrid.Grid#getWaterheater <em>Waterheater</em>}</li>
 *   <li>{@link visGrid.Grid#getLights <em>Lights</em>}</li>
 *   <li>{@link visGrid.Grid#getRefrigerator <em>Refrigerator</em>}</li>
 *   <li>{@link visGrid.Grid#getClotheswasher <em>Clotheswasher</em>}</li>
 *   <li>{@link visGrid.Grid#getDishwasher <em>Dishwasher</em>}</li>
 *   <li>{@link visGrid.Grid#getOccupantload <em>Occupantload</em>}</li>
 *   <li>{@link visGrid.Grid#getPlugload <em>Plugload</em>}</li>
 *   <li>{@link visGrid.Grid#getMicrowave <em>Microwave</em>}</li>
 *   <li>{@link visGrid.Grid#getRange <em>Range</em>}</li>
 *   <li>{@link visGrid.Grid#getFreezer <em>Freezer</em>}</li>
 *   <li>{@link visGrid.Grid#getDryer <em>Dryer</em>}</li>
 *   <li>{@link visGrid.Grid#getEvcharger <em>Evcharger</em>}</li>
 *   <li>{@link visGrid.Grid#getZIPload <em>ZI Pload</em>}</li>
 *   <li>{@link visGrid.Grid#getPlayer <em>Player</em>}</li>
 *   <li>{@link visGrid.Grid#getShaper <em>Shaper</em>}</li>
 *   <li>{@link visGrid.Grid#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link visGrid.Grid#getCollector <em>Collector</em>}</li>
 *   <li>{@link visGrid.Grid#getHistogram <em>Histogram</em>}</li>
 *   <li>{@link visGrid.Grid#getClimate <em>Climate</em>}</li>
 *   <li>{@link visGrid.Grid#getWeather <em>Weather</em>}</li>
 *   <li>{@link visGrid.Grid#getOffice <em>Office</em>}</li>
 *   <li>{@link visGrid.Grid#getMultizone <em>Multizone</em>}</li>
 *   <li>{@link visGrid.Grid#getWindturb_dg <em>Windturb dg</em>}</li>
 *   <li>{@link visGrid.Grid#getPower_electronics <em>Power electronics</em>}</li>
 *   <li>{@link visGrid.Grid#getRectifier <em>Rectifier</em>}</li>
 *   <li>{@link visGrid.Grid#getMicroturbine <em>Microturbine</em>}</li>
 *   <li>{@link visGrid.Grid#getSolar <em>Solar</em>}</li>
 *   <li>{@link visGrid.Grid#getStubauction <em>Stubauction</em>}</li>
 *   <li>{@link visGrid.Grid#getLink <em>Link</em>}</li>
 *   <li>{@link visGrid.Grid#getFuse <em>Fuse</em>}</li>
 *   <li>{@link visGrid.Grid#getRelay <em>Relay</em>}</li>
 *   <li>{@link visGrid.Grid#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link visGrid.Grid#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link visGrid.Grid#getMeter <em>Meter</em>}</li>
 *   <li>{@link visGrid.Grid#getGenerator <em>Generator</em>}</li>
 *   <li>{@link visGrid.Grid#getPlc <em>Plc</em>}</li>
 *   <li>{@link visGrid.Grid#getNode <em>Node</em>}</li>
 *   <li>{@link visGrid.Grid#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Csv reader</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Csv_reader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csv reader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csv reader</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Csv_reader()
	 * @model containment="true"
	 * @generated
	 */
	EList<Csv_reader> getCsv_reader();

	/**
	 * Returns the value of the '<em><b>Diesel dg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diesel dg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diesel dg</em>' containment reference.
	 * @see #setDiesel_dg(Diesel_dg)
	 * @see visGrid.VisGridPackage#getGrid_Diesel_dg()
	 * @model containment="true"
	 * @generated
	 */
	Diesel_dg getDiesel_dg();

	/**
	 * Sets the value of the '{@link visGrid.Grid#getDiesel_dg <em>Diesel dg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diesel dg</em>' containment reference.
	 * @see #getDiesel_dg()
	 * @generated
	 */
	void setDiesel_dg(Diesel_dg value);

	/**
	 * Returns the value of the '<em><b>Energy storage</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Energy_storage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy storage</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Energy_storage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Energy_storage> getEnergy_storage();

	/**
	 * Returns the value of the '<em><b>Inverter</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Inverter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverter</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Inverter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inverter> getInverter();

	/**
	 * Returns the value of the '<em><b>Dc dc converter</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Dc_dc_converter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc dc converter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc dc converter</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Dc_dc_converter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dc_dc_converter> getDc_dc_converter();

	/**
	 * Returns the value of the '<em><b>Battery</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Battery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Battery()
	 * @model containment="true"
	 * @generated
	 */
	EList<Battery> getBattery();

	/**
	 * Returns the value of the '<em><b>Auction</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Auction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auction</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Auction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Auction> getAuction();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

	/**
	 * Returns the value of the '<em><b>Controller2</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Controller2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller2</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Controller2()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller2> getController2();

	/**
	 * Returns the value of the '<em><b>Capbank</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Capbank}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capbank</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capbank</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Capbank()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capbank> getCapbank();

	/**
	 * Returns the value of the '<em><b>Comm</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Comm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Comm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comm> getComm();

	/**
	 * Returns the value of the '<em><b>Capacitor</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Capacitor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacitor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacitor</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Capacitor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capacitor> getCapacitor();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Line()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLine();

	/**
	 * Returns the value of the '<em><b>Line spacing</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Line_spacing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line spacing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line spacing</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Line_spacing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line_spacing> getLine_spacing();

	/**
	 * Returns the value of the '<em><b>Overhead line</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Overhead_line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead line</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Overhead_line()
	 * @model containment="true"
	 * @generated
	 */
	EList<Overhead_line> getOverhead_line();

	/**
	 * Returns the value of the '<em><b>Underground line</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Underground_line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underground line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underground line</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Underground_line()
	 * @model containment="true"
	 * @generated
	 */
	EList<Underground_line> getUnderground_line();

	/**
	 * Returns the value of the '<em><b>Overhead line conductor</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Overhead_line_conductor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overhead line conductor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overhead line conductor</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Overhead_line_conductor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Overhead_line_conductor> getOverhead_line_conductor();

	/**
	 * Returns the value of the '<em><b>Underground line conductor</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Underground_line_conductor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underground line conductor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underground line conductor</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Underground_line_conductor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Underground_line_conductor> getUnderground_line_conductor();

	/**
	 * Returns the value of the '<em><b>Line configuration</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Line_configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line configuration</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Line_configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line_configuration> getLine_configuration();

	/**
	 * Returns the value of the '<em><b>Transformer configuration</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Transformer_configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer configuration</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Transformer_configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformer_configuration> getTransformer_configuration();

	/**
	 * Returns the value of the '<em><b>Load</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Load}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Load()
	 * @model containment="true"
	 * @generated
	 */
	EList<Load> getLoad();

	/**
	 * Returns the value of the '<em><b>Regulator configuration</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Regulator_configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulator configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulator configuration</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Regulator_configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regulator_configuration> getRegulator_configuration();

	/**
	 * Returns the value of the '<em><b>Triplex node</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Triplex_node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex node</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Triplex_node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_node> getTriplex_node();

	/**
	 * Returns the value of the '<em><b>Triplex meter</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Triplex_meter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex meter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex meter</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Triplex_meter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_meter> getTriplex_meter();

	/**
	 * Returns the value of the '<em><b>Triplex line</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Triplex_line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Triplex_line()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_line> getTriplex_line();

	/**
	 * Returns the value of the '<em><b>Triplex line configuration</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Triplex_line_configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line configuration</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Triplex_line_configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_line_configuration> getTriplex_line_configuration();

	/**
	 * Returns the value of the '<em><b>Triplex line conductor</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Triplex_line_conductor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line conductor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line conductor</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Triplex_line_conductor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_line_conductor> getTriplex_line_conductor();

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Switch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Switch> getSwitch();

	/**
	 * Returns the value of the '<em><b>Substation</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Substation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Substation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Substation> getSubstation();

	/**
	 * Returns the value of the '<em><b>Pqload</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Pqload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pqload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pqload</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Pqload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pqload> getPqload();

	/**
	 * Returns the value of the '<em><b>Voltdump</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Voltdump}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voltdump</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltdump</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Voltdump()
	 * @model containment="true"
	 * @generated
	 */
	EList<Voltdump> getVoltdump();

	/**
	 * Returns the value of the '<em><b>Series reactor</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Series_reactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series reactor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series reactor</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Series_reactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Series_reactor> getSeries_reactor();

	/**
	 * Returns the value of the '<em><b>Restoration</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Restoration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restoration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restoration</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Restoration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Restoration> getRestoration();

	/**
	 * Returns the value of the '<em><b>Frequency gen</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Frequency_gen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency gen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency gen</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Frequency_gen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Frequency_gen> getFrequency_gen();

	/**
	 * Returns the value of the '<em><b>Volt var control</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Volt_var_control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volt var control</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volt var control</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Volt_var_control()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volt_var_control> getVolt_var_control();

	/**
	 * Returns the value of the '<em><b>Fault check</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Fault_check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault check</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault check</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Fault_check()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fault_check> getFault_check();

	/**
	 * Returns the value of the '<em><b>Motor</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Motor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motor</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Motor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motor> getMotor();

	/**
	 * Returns the value of the '<em><b>Billdump</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Billdump}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billdump</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billdump</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Billdump()
	 * @model containment="true"
	 * @generated
	 */
	EList<Billdump> getBilldump();

	/**
	 * Returns the value of the '<em><b>Residential enduse</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Residential_enduse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residential enduse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residential enduse</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Residential_enduse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Residential_enduse> getResidential_enduse();

	/**
	 * Returns the value of the '<em><b>House a</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.House_a}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House a</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House a</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_House_a()
	 * @model containment="true"
	 * @generated
	 */
	EList<House_a> getHouse_a();

	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.House}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_House()
	 * @model containment="true"
	 * @generated
	 */
	EList<House> getHouse();

	/**
	 * Returns the value of the '<em><b>Waterheater</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Waterheater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waterheater</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waterheater</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Waterheater()
	 * @model containment="true"
	 * @generated
	 */
	EList<Waterheater> getWaterheater();

	/**
	 * Returns the value of the '<em><b>Lights</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Lights}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lights</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lights</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Lights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lights> getLights();

	/**
	 * Returns the value of the '<em><b>Refrigerator</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Refrigerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refrigerator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refrigerator</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Refrigerator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Refrigerator> getRefrigerator();

	/**
	 * Returns the value of the '<em><b>Clotheswasher</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Clotheswasher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clotheswasher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clotheswasher</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Clotheswasher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clotheswasher> getClotheswasher();

	/**
	 * Returns the value of the '<em><b>Dishwasher</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Dishwasher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dishwasher</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dishwasher</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Dishwasher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dishwasher> getDishwasher();

	/**
	 * Returns the value of the '<em><b>Occupantload</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Occupantload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupantload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupantload</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Occupantload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Occupantload> getOccupantload();

	/**
	 * Returns the value of the '<em><b>Plugload</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Plugload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugload</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Plugload()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plugload> getPlugload();

	/**
	 * Returns the value of the '<em><b>Microwave</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Microwave}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microwave</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microwave</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Microwave()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microwave> getMicrowave();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Range}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Range()
	 * @model containment="true"
	 * @generated
	 */
	EList<Range> getRange();

	/**
	 * Returns the value of the '<em><b>Freezer</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Freezer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freezer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freezer</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Freezer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Freezer> getFreezer();

	/**
	 * Returns the value of the '<em><b>Dryer</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Dryer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dryer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dryer</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Dryer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dryer> getDryer();

	/**
	 * Returns the value of the '<em><b>Evcharger</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Evcharger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evcharger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evcharger</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Evcharger()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evcharger> getEvcharger();

	/**
	 * Returns the value of the '<em><b>ZI Pload</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.ZIPload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZI Pload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZI Pload</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_ZIPload()
	 * @model containment="true"
	 * @generated
	 */
	EList<ZIPload> getZIPload();

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Player()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * Returns the value of the '<em><b>Shaper</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Shaper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaper</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaper</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Shaper()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shaper> getShaper();

	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Recorder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Recorder()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recorder> getRecorder();

	/**
	 * Returns the value of the '<em><b>Collector</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Collector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collector</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Collector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collector> getCollector();

	/**
	 * Returns the value of the '<em><b>Histogram</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Histogram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Histogram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Histogram</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Histogram()
	 * @model containment="true"
	 * @generated
	 */
	EList<Histogram> getHistogram();

	/**
	 * Returns the value of the '<em><b>Climate</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Climate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Climate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Climate</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Climate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Climate> getClimate();

	/**
	 * Returns the value of the '<em><b>Weather</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Weather}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weather</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weather</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Weather()
	 * @model containment="true"
	 * @generated
	 */
	EList<Weather> getWeather();

	/**
	 * Returns the value of the '<em><b>Office</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Office}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Office</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Office()
	 * @model containment="true"
	 * @generated
	 */
	EList<Office> getOffice();

	/**
	 * Returns the value of the '<em><b>Multizone</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Multizone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multizone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multizone</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Multizone()
	 * @model containment="true"
	 * @generated
	 */
	EList<Multizone> getMultizone();

	/**
	 * Returns the value of the '<em><b>Windturb dg</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Windturb_dg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windturb dg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windturb dg</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Windturb_dg()
	 * @model containment="true"
	 * @generated
	 */
	EList<Windturb_dg> getWindturb_dg();

	/**
	 * Returns the value of the '<em><b>Power electronics</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Power_electronics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power electronics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power electronics</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Power_electronics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Power_electronics> getPower_electronics();

	/**
	 * Returns the value of the '<em><b>Rectifier</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Rectifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectifier</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Rectifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rectifier> getRectifier();

	/**
	 * Returns the value of the '<em><b>Microturbine</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Microturbine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microturbine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microturbine</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Microturbine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microturbine> getMicroturbine();

	/**
	 * Returns the value of the '<em><b>Solar</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Solar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solar</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Solar()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solar> getSolar();

	/**
	 * Returns the value of the '<em><b>Stubauction</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Stubauction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stubauction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stubauction</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Stubauction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stubauction> getStubauction();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Fuse</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Fuse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuse</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Fuse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fuse> getFuse();

	/**
	 * Returns the value of the '<em><b>Relay</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Relay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relay</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Relay()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relay> getRelay();

	/**
	 * Returns the value of the '<em><b>Regulator</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Regulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulator</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Regulator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regulator> getRegulator();

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Transformer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Transformer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformer> getTransformer();

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Meter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Meter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Meter> getMeter();

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Generator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Generator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generator> getGenerator();

	/**
	 * Returns the value of the '<em><b>Plc</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Plc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plc</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Plc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plc> getPlc();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link visGrid.Connections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see visGrid.VisGridPackage#getGrid_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connections> getConnection();

} // Grid