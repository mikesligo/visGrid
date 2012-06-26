/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import visGrid.Auction;
import visGrid.Battery;
import visGrid.Billdump;
import visGrid.Capacitor;
import visGrid.Capbank;
import visGrid.Climate;
import visGrid.Clotheswasher;
import visGrid.Collector;
import visGrid.Comm;
import visGrid.Connections;
import visGrid.Controller;
import visGrid.Controller2;
import visGrid.Csv_reader;
import visGrid.Dc_dc_converter;
import visGrid.Diesel_dg;
import visGrid.Dishwasher;
import visGrid.Dryer;
import visGrid.Energy_storage;
import visGrid.Evcharger;
import visGrid.Fault_check;
import visGrid.Freezer;
import visGrid.Frequency_gen;
import visGrid.Fuse;
import visGrid.Generator;
import visGrid.Grid;
import visGrid.Histogram;
import visGrid.House;
import visGrid.House_a;
import visGrid.Inverter;
import visGrid.Lights;
import visGrid.Line;
import visGrid.Line_configuration;
import visGrid.Line_spacing;
import visGrid.Link;
import visGrid.Load;
import visGrid.Meter;
import visGrid.Microturbine;
import visGrid.Microwave;
import visGrid.Motor;
import visGrid.Multizone;
import visGrid.Node;
import visGrid.Occupantload;
import visGrid.Office;
import visGrid.Overhead_line;
import visGrid.Overhead_line_conductor;
import visGrid.Player;
import visGrid.Plc;
import visGrid.Plugload;
import visGrid.Power_electronics;
import visGrid.Pqload;
import visGrid.Range;
import visGrid.Recorder;
import visGrid.Rectifier;
import visGrid.Refrigerator;
import visGrid.Regulator;
import visGrid.Regulator_configuration;
import visGrid.Relay;
import visGrid.Residential_enduse;
import visGrid.Restoration;
import visGrid.Series_reactor;
import visGrid.Shaper;
import visGrid.Solar;
import visGrid.Stubauction;
import visGrid.Substation;
import visGrid.Switch;
import visGrid.Transformer;
import visGrid.Transformer_configuration;
import visGrid.Triplex_line;
import visGrid.Triplex_line_conductor;
import visGrid.Triplex_line_configuration;
import visGrid.Triplex_meter;
import visGrid.Triplex_node;
import visGrid.Underground_line;
import visGrid.Underground_line_conductor;
import visGrid.VisGridPackage;
import visGrid.Volt_var_control;
import visGrid.Voltdump;
import visGrid.Waterheater;
import visGrid.Weather;
import visGrid.Windturb_dg;
import visGrid.ZIPload;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.GridImpl#getCsv_reader <em>Csv reader</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getDiesel_dg <em>Diesel dg</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getEnergy_storage <em>Energy storage</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getInverter <em>Inverter</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getDc_dc_converter <em>Dc dc converter</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getBattery <em>Battery</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getAuction <em>Auction</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getController <em>Controller</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getController2 <em>Controller2</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getCapbank <em>Capbank</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getCapacitor <em>Capacitor</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getLine <em>Line</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getLine_spacing <em>Line spacing</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getOverhead_line <em>Overhead line</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getUnderground_line <em>Underground line</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getOverhead_line_conductor <em>Overhead line conductor</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getUnderground_line_conductor <em>Underground line conductor</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getLine_configuration <em>Line configuration</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTransformer_configuration <em>Transformer configuration</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRegulator_configuration <em>Regulator configuration</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTriplex_node <em>Triplex node</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTriplex_meter <em>Triplex meter</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTriplex_line <em>Triplex line</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTriplex_line_configuration <em>Triplex line configuration</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getPqload <em>Pqload</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getVoltdump <em>Voltdump</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getSeries_reactor <em>Series reactor</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRestoration <em>Restoration</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getFrequency_gen <em>Frequency gen</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getVolt_var_control <em>Volt var control</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getFault_check <em>Fault check</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getMotor <em>Motor</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getBilldump <em>Billdump</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getResidential_enduse <em>Residential enduse</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getHouse_a <em>House a</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getHouse <em>House</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getWaterheater <em>Waterheater</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getLights <em>Lights</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRefrigerator <em>Refrigerator</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getClotheswasher <em>Clotheswasher</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getDishwasher <em>Dishwasher</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getOccupantload <em>Occupantload</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getPlugload <em>Plugload</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getMicrowave <em>Microwave</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRange <em>Range</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getFreezer <em>Freezer</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getDryer <em>Dryer</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getEvcharger <em>Evcharger</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getZIPload <em>ZI Pload</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getShaper <em>Shaper</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getHistogram <em>Histogram</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getClimate <em>Climate</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getWeather <em>Weather</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getOffice <em>Office</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getMultizone <em>Multizone</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getWindturb_dg <em>Windturb dg</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getPower_electronics <em>Power electronics</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRectifier <em>Rectifier</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getMicroturbine <em>Microturbine</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getSolar <em>Solar</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getStubauction <em>Stubauction</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getLink <em>Link</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getFuse <em>Fuse</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRelay <em>Relay</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getRegulator <em>Regulator</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getMeter <em>Meter</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getPlc <em>Plc</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getNode <em>Node</em>}</li>
 *   <li>{@link visGrid.impl.GridImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridImpl extends EObjectImpl implements Grid {
	/**
	 * The cached value of the '{@link #getCsv_reader() <em>Csv reader</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsv_reader()
	 * @generated
	 * @ordered
	 */
	protected EList<Csv_reader> csv_reader;

	/**
	 * The cached value of the '{@link #getDiesel_dg() <em>Diesel dg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiesel_dg()
	 * @generated
	 * @ordered
	 */
	protected Diesel_dg diesel_dg;

	/**
	 * The cached value of the '{@link #getEnergy_storage() <em>Energy storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy_storage()
	 * @generated
	 * @ordered
	 */
	protected EList<Energy_storage> energy_storage;

	/**
	 * The cached value of the '{@link #getInverter() <em>Inverter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverter()
	 * @generated
	 * @ordered
	 */
	protected EList<Inverter> inverter;

	/**
	 * The cached value of the '{@link #getDc_dc_converter() <em>Dc dc converter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc_dc_converter()
	 * @generated
	 * @ordered
	 */
	protected EList<Dc_dc_converter> dc_dc_converter;

	/**
	 * The cached value of the '{@link #getBattery() <em>Battery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattery()
	 * @generated
	 * @ordered
	 */
	protected EList<Battery> battery;

	/**
	 * The cached value of the '{@link #getAuction() <em>Auction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuction()
	 * @generated
	 * @ordered
	 */
	protected EList<Auction> auction;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * The cached value of the '{@link #getController2() <em>Controller2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController2()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller2> controller2;

	/**
	 * The cached value of the '{@link #getCapbank() <em>Capbank</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapbank()
	 * @generated
	 * @ordered
	 */
	protected EList<Capbank> capbank;

	/**
	 * The cached value of the '{@link #getComm() <em>Comm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm()
	 * @generated
	 * @ordered
	 */
	protected EList<Comm> comm;

	/**
	 * The cached value of the '{@link #getCapacitor() <em>Capacitor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacitor()
	 * @generated
	 * @ordered
	 */
	protected EList<Capacitor> capacitor;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * The cached value of the '{@link #getLine_spacing() <em>Line spacing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_spacing()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_spacing> line_spacing;

	/**
	 * The cached value of the '{@link #getOverhead_line() <em>Overhead line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Overhead_line> overhead_line;

	/**
	 * The cached value of the '{@link #getUnderground_line() <em>Underground line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderground_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Underground_line> underground_line;

	/**
	 * The cached value of the '{@link #getOverhead_line_conductor() <em>Overhead line conductor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverhead_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Overhead_line_conductor> overhead_line_conductor;

	/**
	 * The cached value of the '{@link #getUnderground_line_conductor() <em>Underground line conductor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderground_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Underground_line_conductor> underground_line_conductor;

	/**
	 * The cached value of the '{@link #getLine_configuration() <em>Line configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Line_configuration> line_configuration;

	/**
	 * The cached value of the '{@link #getTransformer_configuration() <em>Transformer configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer_configuration> transformer_configuration;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<Load> load;

	/**
	 * The cached value of the '{@link #getRegulator_configuration() <em>Regulator configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulator_configuration> regulator_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_node() <em>Triplex node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_node()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_node> triplex_node;

	/**
	 * The cached value of the '{@link #getTriplex_meter() <em>Triplex meter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_meter()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_meter> triplex_meter;

	/**
	 * The cached value of the '{@link #getTriplex_line() <em>Triplex line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line> triplex_line;

	/**
	 * The cached value of the '{@link #getTriplex_line_configuration() <em>Triplex line configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line_configuration> triplex_line_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_line_conductor() <em>Triplex line conductor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line_conductor> triplex_line_conductor;

	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> switch_;

	/**
	 * The cached value of the '{@link #getSubstation() <em>Substation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstation()
	 * @generated
	 * @ordered
	 */
	protected EList<Substation> substation;

	/**
	 * The cached value of the '{@link #getPqload() <em>Pqload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPqload()
	 * @generated
	 * @ordered
	 */
	protected EList<Pqload> pqload;

	/**
	 * The cached value of the '{@link #getVoltdump() <em>Voltdump</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltdump()
	 * @generated
	 * @ordered
	 */
	protected EList<Voltdump> voltdump;

	/**
	 * The cached value of the '{@link #getSeries_reactor() <em>Series reactor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries_reactor()
	 * @generated
	 * @ordered
	 */
	protected EList<Series_reactor> series_reactor;

	/**
	 * The cached value of the '{@link #getRestoration() <em>Restoration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestoration()
	 * @generated
	 * @ordered
	 */
	protected EList<Restoration> restoration;

	/**
	 * The cached value of the '{@link #getFrequency_gen() <em>Frequency gen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency_gen()
	 * @generated
	 * @ordered
	 */
	protected EList<Frequency_gen> frequency_gen;

	/**
	 * The cached value of the '{@link #getVolt_var_control() <em>Volt var control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolt_var_control()
	 * @generated
	 * @ordered
	 */
	protected EList<Volt_var_control> volt_var_control;

	/**
	 * The cached value of the '{@link #getFault_check() <em>Fault check</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault_check()
	 * @generated
	 * @ordered
	 */
	protected EList<Fault_check> fault_check;

	/**
	 * The cached value of the '{@link #getMotor() <em>Motor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotor()
	 * @generated
	 * @ordered
	 */
	protected EList<Motor> motor;

	/**
	 * The cached value of the '{@link #getBilldump() <em>Billdump</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilldump()
	 * @generated
	 * @ordered
	 */
	protected EList<Billdump> billdump;

	/**
	 * The cached value of the '{@link #getResidential_enduse() <em>Residential enduse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResidential_enduse()
	 * @generated
	 * @ordered
	 */
	protected EList<Residential_enduse> residential_enduse;

	/**
	 * The cached value of the '{@link #getHouse_a() <em>House a</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse_a()
	 * @generated
	 * @ordered
	 */
	protected EList<House_a> house_a;

	/**
	 * The cached value of the '{@link #getHouse() <em>House</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse()
	 * @generated
	 * @ordered
	 */
	protected EList<House> house;

	/**
	 * The cached value of the '{@link #getWaterheater() <em>Waterheater</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterheater()
	 * @generated
	 * @ordered
	 */
	protected EList<Waterheater> waterheater;

	/**
	 * The cached value of the '{@link #getLights() <em>Lights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLights()
	 * @generated
	 * @ordered
	 */
	protected EList<Lights> lights;

	/**
	 * The cached value of the '{@link #getRefrigerator() <em>Refrigerator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefrigerator()
	 * @generated
	 * @ordered
	 */
	protected EList<Refrigerator> refrigerator;

	/**
	 * The cached value of the '{@link #getClotheswasher() <em>Clotheswasher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClotheswasher()
	 * @generated
	 * @ordered
	 */
	protected EList<Clotheswasher> clotheswasher;

	/**
	 * The cached value of the '{@link #getDishwasher() <em>Dishwasher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDishwasher()
	 * @generated
	 * @ordered
	 */
	protected EList<Dishwasher> dishwasher;

	/**
	 * The cached value of the '{@link #getOccupantload() <em>Occupantload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupantload()
	 * @generated
	 * @ordered
	 */
	protected EList<Occupantload> occupantload;

	/**
	 * The cached value of the '{@link #getPlugload() <em>Plugload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugload()
	 * @generated
	 * @ordered
	 */
	protected EList<Plugload> plugload;

	/**
	 * The cached value of the '{@link #getMicrowave() <em>Microwave</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrowave()
	 * @generated
	 * @ordered
	 */
	protected EList<Microwave> microwave;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> range;

	/**
	 * The cached value of the '{@link #getFreezer() <em>Freezer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezer()
	 * @generated
	 * @ordered
	 */
	protected EList<Freezer> freezer;

	/**
	 * The cached value of the '{@link #getDryer() <em>Dryer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDryer()
	 * @generated
	 * @ordered
	 */
	protected EList<Dryer> dryer;

	/**
	 * The cached value of the '{@link #getEvcharger() <em>Evcharger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvcharger()
	 * @generated
	 * @ordered
	 */
	protected EList<Evcharger> evcharger;

	/**
	 * The cached value of the '{@link #getZIPload() <em>ZI Pload</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZIPload()
	 * @generated
	 * @ordered
	 */
	protected EList<ZIPload> ziPload;

	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * The cached value of the '{@link #getShaper() <em>Shaper</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaper()
	 * @generated
	 * @ordered
	 */
	protected EList<Shaper> shaper;

	/**
	 * The cached value of the '{@link #getRecorder() <em>Recorder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecorder()
	 * @generated
	 * @ordered
	 */
	protected EList<Recorder> recorder;

	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected EList<Collector> collector;

	/**
	 * The cached value of the '{@link #getHistogram() <em>Histogram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistogram()
	 * @generated
	 * @ordered
	 */
	protected EList<Histogram> histogram;

	/**
	 * The cached value of the '{@link #getClimate() <em>Climate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClimate()
	 * @generated
	 * @ordered
	 */
	protected EList<Climate> climate;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected EList<Weather> weather;

	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected EList<Office> office;

	/**
	 * The cached value of the '{@link #getMultizone() <em>Multizone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultizone()
	 * @generated
	 * @ordered
	 */
	protected EList<Multizone> multizone;

	/**
	 * The cached value of the '{@link #getWindturb_dg() <em>Windturb dg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindturb_dg()
	 * @generated
	 * @ordered
	 */
	protected EList<Windturb_dg> windturb_dg;

	/**
	 * The cached value of the '{@link #getPower_electronics() <em>Power electronics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_electronics()
	 * @generated
	 * @ordered
	 */
	protected EList<Power_electronics> power_electronics;

	/**
	 * The cached value of the '{@link #getRectifier() <em>Rectifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Rectifier> rectifier;

	/**
	 * The cached value of the '{@link #getMicroturbine() <em>Microturbine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroturbine()
	 * @generated
	 * @ordered
	 */
	protected EList<Microturbine> microturbine;

	/**
	 * The cached value of the '{@link #getSolar() <em>Solar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolar()
	 * @generated
	 * @ordered
	 */
	protected EList<Solar> solar;

	/**
	 * The cached value of the '{@link #getStubauction() <em>Stubauction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStubauction()
	 * @generated
	 * @ordered
	 */
	protected EList<Stubauction> stubauction;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getFuse() <em>Fuse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuse()
	 * @generated
	 * @ordered
	 */
	protected EList<Fuse> fuse;

	/**
	 * The cached value of the '{@link #getRelay() <em>Relay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelay()
	 * @generated
	 * @ordered
	 */
	protected EList<Relay> relay;

	/**
	 * The cached value of the '{@link #getRegulator() <em>Regulator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulator()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulator> regulator;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer> transformer;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected EList<Meter> meter;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<Generator> generator;

	/**
	 * The cached value of the '{@link #getPlc() <em>Plc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlc()
	 * @generated
	 * @ordered
	 */
	protected EList<Plc> plc;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getGrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Csv_reader> getCsv_reader() {
		if (csv_reader == null) {
			csv_reader = new EObjectContainmentEList<Csv_reader>(Csv_reader.class, this, VisGridPackage.GRID__CSV_READER);
		}
		return csv_reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diesel_dg getDiesel_dg() {
		return diesel_dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiesel_dg(Diesel_dg newDiesel_dg, NotificationChain msgs) {
		Diesel_dg oldDiesel_dg = diesel_dg;
		diesel_dg = newDiesel_dg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisGridPackage.GRID__DIESEL_DG, oldDiesel_dg, newDiesel_dg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiesel_dg(Diesel_dg newDiesel_dg) {
		if (newDiesel_dg != diesel_dg) {
			NotificationChain msgs = null;
			if (diesel_dg != null)
				msgs = ((InternalEObject)diesel_dg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisGridPackage.GRID__DIESEL_DG, null, msgs);
			if (newDiesel_dg != null)
				msgs = ((InternalEObject)newDiesel_dg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisGridPackage.GRID__DIESEL_DG, null, msgs);
			msgs = basicSetDiesel_dg(newDiesel_dg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.GRID__DIESEL_DG, newDiesel_dg, newDiesel_dg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Energy_storage> getEnergy_storage() {
		if (energy_storage == null) {
			energy_storage = new EObjectContainmentEList<Energy_storage>(Energy_storage.class, this, VisGridPackage.GRID__ENERGY_STORAGE);
		}
		return energy_storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inverter> getInverter() {
		if (inverter == null) {
			inverter = new EObjectContainmentEList<Inverter>(Inverter.class, this, VisGridPackage.GRID__INVERTER);
		}
		return inverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dc_dc_converter> getDc_dc_converter() {
		if (dc_dc_converter == null) {
			dc_dc_converter = new EObjectContainmentEList<Dc_dc_converter>(Dc_dc_converter.class, this, VisGridPackage.GRID__DC_DC_CONVERTER);
		}
		return dc_dc_converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Battery> getBattery() {
		if (battery == null) {
			battery = new EObjectContainmentEList<Battery>(Battery.class, this, VisGridPackage.GRID__BATTERY);
		}
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Auction> getAuction() {
		if (auction == null) {
			auction = new EObjectContainmentEList<Auction>(Auction.class, this, VisGridPackage.GRID__AUCTION);
		}
		return auction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this, VisGridPackage.GRID__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller2> getController2() {
		if (controller2 == null) {
			controller2 = new EObjectContainmentEList<Controller2>(Controller2.class, this, VisGridPackage.GRID__CONTROLLER2);
		}
		return controller2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capbank> getCapbank() {
		if (capbank == null) {
			capbank = new EObjectContainmentEList<Capbank>(Capbank.class, this, VisGridPackage.GRID__CAPBANK);
		}
		return capbank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comm> getComm() {
		if (comm == null) {
			comm = new EObjectContainmentEList<Comm>(Comm.class, this, VisGridPackage.GRID__COMM);
		}
		return comm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capacitor> getCapacitor() {
		if (capacitor == null) {
			capacitor = new EObjectContainmentEList<Capacitor>(Capacitor.class, this, VisGridPackage.GRID__CAPACITOR);
		}
		return capacitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectContainmentEList<Line>(Line.class, this, VisGridPackage.GRID__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_spacing> getLine_spacing() {
		if (line_spacing == null) {
			line_spacing = new EObjectContainmentEList<Line_spacing>(Line_spacing.class, this, VisGridPackage.GRID__LINE_SPACING);
		}
		return line_spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Overhead_line> getOverhead_line() {
		if (overhead_line == null) {
			overhead_line = new EObjectContainmentEList<Overhead_line>(Overhead_line.class, this, VisGridPackage.GRID__OVERHEAD_LINE);
		}
		return overhead_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Underground_line> getUnderground_line() {
		if (underground_line == null) {
			underground_line = new EObjectContainmentEList<Underground_line>(Underground_line.class, this, VisGridPackage.GRID__UNDERGROUND_LINE);
		}
		return underground_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Overhead_line_conductor> getOverhead_line_conductor() {
		if (overhead_line_conductor == null) {
			overhead_line_conductor = new EObjectContainmentEList<Overhead_line_conductor>(Overhead_line_conductor.class, this, VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR);
		}
		return overhead_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Underground_line_conductor> getUnderground_line_conductor() {
		if (underground_line_conductor == null) {
			underground_line_conductor = new EObjectContainmentEList<Underground_line_conductor>(Underground_line_conductor.class, this, VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR);
		}
		return underground_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line_configuration> getLine_configuration() {
		if (line_configuration == null) {
			line_configuration = new EObjectContainmentEList<Line_configuration>(Line_configuration.class, this, VisGridPackage.GRID__LINE_CONFIGURATION);
		}
		return line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer_configuration> getTransformer_configuration() {
		if (transformer_configuration == null) {
			transformer_configuration = new EObjectContainmentEList<Transformer_configuration>(Transformer_configuration.class, this, VisGridPackage.GRID__TRANSFORMER_CONFIGURATION);
		}
		return transformer_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Load> getLoad() {
		if (load == null) {
			load = new EObjectContainmentEList<Load>(Load.class, this, VisGridPackage.GRID__LOAD);
		}
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulator_configuration> getRegulator_configuration() {
		if (regulator_configuration == null) {
			regulator_configuration = new EObjectContainmentEList<Regulator_configuration>(Regulator_configuration.class, this, VisGridPackage.GRID__REGULATOR_CONFIGURATION);
		}
		return regulator_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_node> getTriplex_node() {
		if (triplex_node == null) {
			triplex_node = new EObjectContainmentEList<Triplex_node>(Triplex_node.class, this, VisGridPackage.GRID__TRIPLEX_NODE);
		}
		return triplex_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_meter> getTriplex_meter() {
		if (triplex_meter == null) {
			triplex_meter = new EObjectContainmentEList<Triplex_meter>(Triplex_meter.class, this, VisGridPackage.GRID__TRIPLEX_METER);
		}
		return triplex_meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line> getTriplex_line() {
		if (triplex_line == null) {
			triplex_line = new EObjectContainmentEList<Triplex_line>(Triplex_line.class, this, VisGridPackage.GRID__TRIPLEX_LINE);
		}
		return triplex_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line_configuration> getTriplex_line_configuration() {
		if (triplex_line_configuration == null) {
			triplex_line_configuration = new EObjectContainmentEList<Triplex_line_configuration>(Triplex_line_configuration.class, this, VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION);
		}
		return triplex_line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line_conductor> getTriplex_line_conductor() {
		if (triplex_line_conductor == null) {
			triplex_line_conductor = new EObjectContainmentEList<Triplex_line_conductor>(Triplex_line_conductor.class, this, VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR);
		}
		return triplex_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getSwitch() {
		if (switch_ == null) {
			switch_ = new EObjectContainmentEList<Switch>(Switch.class, this, VisGridPackage.GRID__SWITCH);
		}
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substation> getSubstation() {
		if (substation == null) {
			substation = new EObjectContainmentEList<Substation>(Substation.class, this, VisGridPackage.GRID__SUBSTATION);
		}
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pqload> getPqload() {
		if (pqload == null) {
			pqload = new EObjectContainmentEList<Pqload>(Pqload.class, this, VisGridPackage.GRID__PQLOAD);
		}
		return pqload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voltdump> getVoltdump() {
		if (voltdump == null) {
			voltdump = new EObjectContainmentEList<Voltdump>(Voltdump.class, this, VisGridPackage.GRID__VOLTDUMP);
		}
		return voltdump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Series_reactor> getSeries_reactor() {
		if (series_reactor == null) {
			series_reactor = new EObjectContainmentEList<Series_reactor>(Series_reactor.class, this, VisGridPackage.GRID__SERIES_REACTOR);
		}
		return series_reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Restoration> getRestoration() {
		if (restoration == null) {
			restoration = new EObjectContainmentEList<Restoration>(Restoration.class, this, VisGridPackage.GRID__RESTORATION);
		}
		return restoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frequency_gen> getFrequency_gen() {
		if (frequency_gen == null) {
			frequency_gen = new EObjectContainmentEList<Frequency_gen>(Frequency_gen.class, this, VisGridPackage.GRID__FREQUENCY_GEN);
		}
		return frequency_gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volt_var_control> getVolt_var_control() {
		if (volt_var_control == null) {
			volt_var_control = new EObjectContainmentEList<Volt_var_control>(Volt_var_control.class, this, VisGridPackage.GRID__VOLT_VAR_CONTROL);
		}
		return volt_var_control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fault_check> getFault_check() {
		if (fault_check == null) {
			fault_check = new EObjectContainmentEList<Fault_check>(Fault_check.class, this, VisGridPackage.GRID__FAULT_CHECK);
		}
		return fault_check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motor> getMotor() {
		if (motor == null) {
			motor = new EObjectContainmentEList<Motor>(Motor.class, this, VisGridPackage.GRID__MOTOR);
		}
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Billdump> getBilldump() {
		if (billdump == null) {
			billdump = new EObjectContainmentEList<Billdump>(Billdump.class, this, VisGridPackage.GRID__BILLDUMP);
		}
		return billdump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Residential_enduse> getResidential_enduse() {
		if (residential_enduse == null) {
			residential_enduse = new EObjectContainmentEList<Residential_enduse>(Residential_enduse.class, this, VisGridPackage.GRID__RESIDENTIAL_ENDUSE);
		}
		return residential_enduse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House_a> getHouse_a() {
		if (house_a == null) {
			house_a = new EObjectContainmentEList<House_a>(House_a.class, this, VisGridPackage.GRID__HOUSE_A);
		}
		return house_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getHouse() {
		if (house == null) {
			house = new EObjectContainmentEList<House>(House.class, this, VisGridPackage.GRID__HOUSE);
		}
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Waterheater> getWaterheater() {
		if (waterheater == null) {
			waterheater = new EObjectContainmentEList<Waterheater>(Waterheater.class, this, VisGridPackage.GRID__WATERHEATER);
		}
		return waterheater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lights> getLights() {
		if (lights == null) {
			lights = new EObjectContainmentEList<Lights>(Lights.class, this, VisGridPackage.GRID__LIGHTS);
		}
		return lights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refrigerator> getRefrigerator() {
		if (refrigerator == null) {
			refrigerator = new EObjectContainmentEList<Refrigerator>(Refrigerator.class, this, VisGridPackage.GRID__REFRIGERATOR);
		}
		return refrigerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clotheswasher> getClotheswasher() {
		if (clotheswasher == null) {
			clotheswasher = new EObjectContainmentEList<Clotheswasher>(Clotheswasher.class, this, VisGridPackage.GRID__CLOTHESWASHER);
		}
		return clotheswasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dishwasher> getDishwasher() {
		if (dishwasher == null) {
			dishwasher = new EObjectContainmentEList<Dishwasher>(Dishwasher.class, this, VisGridPackage.GRID__DISHWASHER);
		}
		return dishwasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Occupantload> getOccupantload() {
		if (occupantload == null) {
			occupantload = new EObjectContainmentEList<Occupantload>(Occupantload.class, this, VisGridPackage.GRID__OCCUPANTLOAD);
		}
		return occupantload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plugload> getPlugload() {
		if (plugload == null) {
			plugload = new EObjectContainmentEList<Plugload>(Plugload.class, this, VisGridPackage.GRID__PLUGLOAD);
		}
		return plugload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microwave> getMicrowave() {
		if (microwave == null) {
			microwave = new EObjectContainmentEList<Microwave>(Microwave.class, this, VisGridPackage.GRID__MICROWAVE);
		}
		return microwave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Range> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList<Range>(Range.class, this, VisGridPackage.GRID__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Freezer> getFreezer() {
		if (freezer == null) {
			freezer = new EObjectContainmentEList<Freezer>(Freezer.class, this, VisGridPackage.GRID__FREEZER);
		}
		return freezer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dryer> getDryer() {
		if (dryer == null) {
			dryer = new EObjectContainmentEList<Dryer>(Dryer.class, this, VisGridPackage.GRID__DRYER);
		}
		return dryer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evcharger> getEvcharger() {
		if (evcharger == null) {
			evcharger = new EObjectContainmentEList<Evcharger>(Evcharger.class, this, VisGridPackage.GRID__EVCHARGER);
		}
		return evcharger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZIPload> getZIPload() {
		if (ziPload == null) {
			ziPload = new EObjectContainmentEList<ZIPload>(ZIPload.class, this, VisGridPackage.GRID__ZI_PLOAD);
		}
		return ziPload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectContainmentEList<Player>(Player.class, this, VisGridPackage.GRID__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shaper> getShaper() {
		if (shaper == null) {
			shaper = new EObjectContainmentEList<Shaper>(Shaper.class, this, VisGridPackage.GRID__SHAPER);
		}
		return shaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recorder> getRecorder() {
		if (recorder == null) {
			recorder = new EObjectContainmentEList<Recorder>(Recorder.class, this, VisGridPackage.GRID__RECORDER);
		}
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collector> getCollector() {
		if (collector == null) {
			collector = new EObjectContainmentEList<Collector>(Collector.class, this, VisGridPackage.GRID__COLLECTOR);
		}
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Histogram> getHistogram() {
		if (histogram == null) {
			histogram = new EObjectContainmentEList<Histogram>(Histogram.class, this, VisGridPackage.GRID__HISTOGRAM);
		}
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Climate> getClimate() {
		if (climate == null) {
			climate = new EObjectContainmentEList<Climate>(Climate.class, this, VisGridPackage.GRID__CLIMATE);
		}
		return climate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Weather> getWeather() {
		if (weather == null) {
			weather = new EObjectContainmentEList<Weather>(Weather.class, this, VisGridPackage.GRID__WEATHER);
		}
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Office> getOffice() {
		if (office == null) {
			office = new EObjectContainmentEList<Office>(Office.class, this, VisGridPackage.GRID__OFFICE);
		}
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Multizone> getMultizone() {
		if (multizone == null) {
			multizone = new EObjectContainmentEList<Multizone>(Multizone.class, this, VisGridPackage.GRID__MULTIZONE);
		}
		return multizone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Windturb_dg> getWindturb_dg() {
		if (windturb_dg == null) {
			windturb_dg = new EObjectContainmentEList<Windturb_dg>(Windturb_dg.class, this, VisGridPackage.GRID__WINDTURB_DG);
		}
		return windturb_dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Power_electronics> getPower_electronics() {
		if (power_electronics == null) {
			power_electronics = new EObjectContainmentEList<Power_electronics>(Power_electronics.class, this, VisGridPackage.GRID__POWER_ELECTRONICS);
		}
		return power_electronics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rectifier> getRectifier() {
		if (rectifier == null) {
			rectifier = new EObjectContainmentEList<Rectifier>(Rectifier.class, this, VisGridPackage.GRID__RECTIFIER);
		}
		return rectifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microturbine> getMicroturbine() {
		if (microturbine == null) {
			microturbine = new EObjectContainmentEList<Microturbine>(Microturbine.class, this, VisGridPackage.GRID__MICROTURBINE);
		}
		return microturbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solar> getSolar() {
		if (solar == null) {
			solar = new EObjectContainmentEList<Solar>(Solar.class, this, VisGridPackage.GRID__SOLAR);
		}
		return solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stubauction> getStubauction() {
		if (stubauction == null) {
			stubauction = new EObjectContainmentEList<Stubauction>(Stubauction.class, this, VisGridPackage.GRID__STUBAUCTION);
		}
		return stubauction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, VisGridPackage.GRID__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fuse> getFuse() {
		if (fuse == null) {
			fuse = new EObjectContainmentEList<Fuse>(Fuse.class, this, VisGridPackage.GRID__FUSE);
		}
		return fuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relay> getRelay() {
		if (relay == null) {
			relay = new EObjectContainmentEList<Relay>(Relay.class, this, VisGridPackage.GRID__RELAY);
		}
		return relay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulator> getRegulator() {
		if (regulator == null) {
			regulator = new EObjectContainmentEList<Regulator>(Regulator.class, this, VisGridPackage.GRID__REGULATOR);
		}
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer> getTransformer() {
		if (transformer == null) {
			transformer = new EObjectContainmentEList<Transformer>(Transformer.class, this, VisGridPackage.GRID__TRANSFORMER);
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meter> getMeter() {
		if (meter == null) {
			meter = new EObjectContainmentEList<Meter>(Meter.class, this, VisGridPackage.GRID__METER);
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generator> getGenerator() {
		if (generator == null) {
			generator = new EObjectContainmentEList<Generator>(Generator.class, this, VisGridPackage.GRID__GENERATOR);
		}
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plc> getPlc() {
		if (plc == null) {
			plc = new EObjectContainmentEList<Plc>(Plc.class, this, VisGridPackage.GRID__PLC);
		}
		return plc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, VisGridPackage.GRID__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connections>(Connections.class, this, VisGridPackage.GRID__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisGridPackage.GRID__CSV_READER:
				return ((InternalEList<?>)getCsv_reader()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__DIESEL_DG:
				return basicSetDiesel_dg(null, msgs);
			case VisGridPackage.GRID__ENERGY_STORAGE:
				return ((InternalEList<?>)getEnergy_storage()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__INVERTER:
				return ((InternalEList<?>)getInverter()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__DC_DC_CONVERTER:
				return ((InternalEList<?>)getDc_dc_converter()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__BATTERY:
				return ((InternalEList<?>)getBattery()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__AUCTION:
				return ((InternalEList<?>)getAuction()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CONTROLLER:
				return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CONTROLLER2:
				return ((InternalEList<?>)getController2()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CAPBANK:
				return ((InternalEList<?>)getCapbank()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__COMM:
				return ((InternalEList<?>)getComm()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CAPACITOR:
				return ((InternalEList<?>)getCapacitor()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__LINE:
				return ((InternalEList<?>)getLine()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__LINE_SPACING:
				return ((InternalEList<?>)getLine_spacing()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__OVERHEAD_LINE:
				return ((InternalEList<?>)getOverhead_line()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__UNDERGROUND_LINE:
				return ((InternalEList<?>)getUnderground_line()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR:
				return ((InternalEList<?>)getOverhead_line_conductor()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR:
				return ((InternalEList<?>)getUnderground_line_conductor()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__LINE_CONFIGURATION:
				return ((InternalEList<?>)getLine_configuration()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				return ((InternalEList<?>)getTransformer_configuration()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__LOAD:
				return ((InternalEList<?>)getLoad()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__REGULATOR_CONFIGURATION:
				return ((InternalEList<?>)getRegulator_configuration()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRIPLEX_NODE:
				return ((InternalEList<?>)getTriplex_node()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRIPLEX_METER:
				return ((InternalEList<?>)getTriplex_meter()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRIPLEX_LINE:
				return ((InternalEList<?>)getTriplex_line()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				return ((InternalEList<?>)getTriplex_line_configuration()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				return ((InternalEList<?>)getTriplex_line_conductor()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__SWITCH:
				return ((InternalEList<?>)getSwitch()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__SUBSTATION:
				return ((InternalEList<?>)getSubstation()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__PQLOAD:
				return ((InternalEList<?>)getPqload()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__VOLTDUMP:
				return ((InternalEList<?>)getVoltdump()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__SERIES_REACTOR:
				return ((InternalEList<?>)getSeries_reactor()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__RESTORATION:
				return ((InternalEList<?>)getRestoration()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__FREQUENCY_GEN:
				return ((InternalEList<?>)getFrequency_gen()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__VOLT_VAR_CONTROL:
				return ((InternalEList<?>)getVolt_var_control()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__FAULT_CHECK:
				return ((InternalEList<?>)getFault_check()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__MOTOR:
				return ((InternalEList<?>)getMotor()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__BILLDUMP:
				return ((InternalEList<?>)getBilldump()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__RESIDENTIAL_ENDUSE:
				return ((InternalEList<?>)getResidential_enduse()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__HOUSE_A:
				return ((InternalEList<?>)getHouse_a()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__HOUSE:
				return ((InternalEList<?>)getHouse()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__WATERHEATER:
				return ((InternalEList<?>)getWaterheater()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__LIGHTS:
				return ((InternalEList<?>)getLights()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__REFRIGERATOR:
				return ((InternalEList<?>)getRefrigerator()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CLOTHESWASHER:
				return ((InternalEList<?>)getClotheswasher()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__DISHWASHER:
				return ((InternalEList<?>)getDishwasher()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__OCCUPANTLOAD:
				return ((InternalEList<?>)getOccupantload()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__PLUGLOAD:
				return ((InternalEList<?>)getPlugload()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__MICROWAVE:
				return ((InternalEList<?>)getMicrowave()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__FREEZER:
				return ((InternalEList<?>)getFreezer()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__DRYER:
				return ((InternalEList<?>)getDryer()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__EVCHARGER:
				return ((InternalEList<?>)getEvcharger()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__ZI_PLOAD:
				return ((InternalEList<?>)getZIPload()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__PLAYER:
				return ((InternalEList<?>)getPlayer()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__SHAPER:
				return ((InternalEList<?>)getShaper()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__RECORDER:
				return ((InternalEList<?>)getRecorder()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__COLLECTOR:
				return ((InternalEList<?>)getCollector()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__HISTOGRAM:
				return ((InternalEList<?>)getHistogram()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CLIMATE:
				return ((InternalEList<?>)getClimate()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__WEATHER:
				return ((InternalEList<?>)getWeather()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__OFFICE:
				return ((InternalEList<?>)getOffice()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__MULTIZONE:
				return ((InternalEList<?>)getMultizone()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__WINDTURB_DG:
				return ((InternalEList<?>)getWindturb_dg()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__POWER_ELECTRONICS:
				return ((InternalEList<?>)getPower_electronics()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__RECTIFIER:
				return ((InternalEList<?>)getRectifier()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__MICROTURBINE:
				return ((InternalEList<?>)getMicroturbine()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__SOLAR:
				return ((InternalEList<?>)getSolar()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__STUBAUCTION:
				return ((InternalEList<?>)getStubauction()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__FUSE:
				return ((InternalEList<?>)getFuse()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__RELAY:
				return ((InternalEList<?>)getRelay()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__REGULATOR:
				return ((InternalEList<?>)getRegulator()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__TRANSFORMER:
				return ((InternalEList<?>)getTransformer()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__METER:
				return ((InternalEList<?>)getMeter()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__GENERATOR:
				return ((InternalEList<?>)getGenerator()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__PLC:
				return ((InternalEList<?>)getPlc()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case VisGridPackage.GRID__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.GRID__CSV_READER:
				return getCsv_reader();
			case VisGridPackage.GRID__DIESEL_DG:
				return getDiesel_dg();
			case VisGridPackage.GRID__ENERGY_STORAGE:
				return getEnergy_storage();
			case VisGridPackage.GRID__INVERTER:
				return getInverter();
			case VisGridPackage.GRID__DC_DC_CONVERTER:
				return getDc_dc_converter();
			case VisGridPackage.GRID__BATTERY:
				return getBattery();
			case VisGridPackage.GRID__AUCTION:
				return getAuction();
			case VisGridPackage.GRID__CONTROLLER:
				return getController();
			case VisGridPackage.GRID__CONTROLLER2:
				return getController2();
			case VisGridPackage.GRID__CAPBANK:
				return getCapbank();
			case VisGridPackage.GRID__COMM:
				return getComm();
			case VisGridPackage.GRID__CAPACITOR:
				return getCapacitor();
			case VisGridPackage.GRID__LINE:
				return getLine();
			case VisGridPackage.GRID__LINE_SPACING:
				return getLine_spacing();
			case VisGridPackage.GRID__OVERHEAD_LINE:
				return getOverhead_line();
			case VisGridPackage.GRID__UNDERGROUND_LINE:
				return getUnderground_line();
			case VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR:
				return getOverhead_line_conductor();
			case VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR:
				return getUnderground_line_conductor();
			case VisGridPackage.GRID__LINE_CONFIGURATION:
				return getLine_configuration();
			case VisGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				return getTransformer_configuration();
			case VisGridPackage.GRID__LOAD:
				return getLoad();
			case VisGridPackage.GRID__REGULATOR_CONFIGURATION:
				return getRegulator_configuration();
			case VisGridPackage.GRID__TRIPLEX_NODE:
				return getTriplex_node();
			case VisGridPackage.GRID__TRIPLEX_METER:
				return getTriplex_meter();
			case VisGridPackage.GRID__TRIPLEX_LINE:
				return getTriplex_line();
			case VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				return getTriplex_line_configuration();
			case VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				return getTriplex_line_conductor();
			case VisGridPackage.GRID__SWITCH:
				return getSwitch();
			case VisGridPackage.GRID__SUBSTATION:
				return getSubstation();
			case VisGridPackage.GRID__PQLOAD:
				return getPqload();
			case VisGridPackage.GRID__VOLTDUMP:
				return getVoltdump();
			case VisGridPackage.GRID__SERIES_REACTOR:
				return getSeries_reactor();
			case VisGridPackage.GRID__RESTORATION:
				return getRestoration();
			case VisGridPackage.GRID__FREQUENCY_GEN:
				return getFrequency_gen();
			case VisGridPackage.GRID__VOLT_VAR_CONTROL:
				return getVolt_var_control();
			case VisGridPackage.GRID__FAULT_CHECK:
				return getFault_check();
			case VisGridPackage.GRID__MOTOR:
				return getMotor();
			case VisGridPackage.GRID__BILLDUMP:
				return getBilldump();
			case VisGridPackage.GRID__RESIDENTIAL_ENDUSE:
				return getResidential_enduse();
			case VisGridPackage.GRID__HOUSE_A:
				return getHouse_a();
			case VisGridPackage.GRID__HOUSE:
				return getHouse();
			case VisGridPackage.GRID__WATERHEATER:
				return getWaterheater();
			case VisGridPackage.GRID__LIGHTS:
				return getLights();
			case VisGridPackage.GRID__REFRIGERATOR:
				return getRefrigerator();
			case VisGridPackage.GRID__CLOTHESWASHER:
				return getClotheswasher();
			case VisGridPackage.GRID__DISHWASHER:
				return getDishwasher();
			case VisGridPackage.GRID__OCCUPANTLOAD:
				return getOccupantload();
			case VisGridPackage.GRID__PLUGLOAD:
				return getPlugload();
			case VisGridPackage.GRID__MICROWAVE:
				return getMicrowave();
			case VisGridPackage.GRID__RANGE:
				return getRange();
			case VisGridPackage.GRID__FREEZER:
				return getFreezer();
			case VisGridPackage.GRID__DRYER:
				return getDryer();
			case VisGridPackage.GRID__EVCHARGER:
				return getEvcharger();
			case VisGridPackage.GRID__ZI_PLOAD:
				return getZIPload();
			case VisGridPackage.GRID__PLAYER:
				return getPlayer();
			case VisGridPackage.GRID__SHAPER:
				return getShaper();
			case VisGridPackage.GRID__RECORDER:
				return getRecorder();
			case VisGridPackage.GRID__COLLECTOR:
				return getCollector();
			case VisGridPackage.GRID__HISTOGRAM:
				return getHistogram();
			case VisGridPackage.GRID__CLIMATE:
				return getClimate();
			case VisGridPackage.GRID__WEATHER:
				return getWeather();
			case VisGridPackage.GRID__OFFICE:
				return getOffice();
			case VisGridPackage.GRID__MULTIZONE:
				return getMultizone();
			case VisGridPackage.GRID__WINDTURB_DG:
				return getWindturb_dg();
			case VisGridPackage.GRID__POWER_ELECTRONICS:
				return getPower_electronics();
			case VisGridPackage.GRID__RECTIFIER:
				return getRectifier();
			case VisGridPackage.GRID__MICROTURBINE:
				return getMicroturbine();
			case VisGridPackage.GRID__SOLAR:
				return getSolar();
			case VisGridPackage.GRID__STUBAUCTION:
				return getStubauction();
			case VisGridPackage.GRID__LINK:
				return getLink();
			case VisGridPackage.GRID__FUSE:
				return getFuse();
			case VisGridPackage.GRID__RELAY:
				return getRelay();
			case VisGridPackage.GRID__REGULATOR:
				return getRegulator();
			case VisGridPackage.GRID__TRANSFORMER:
				return getTransformer();
			case VisGridPackage.GRID__METER:
				return getMeter();
			case VisGridPackage.GRID__GENERATOR:
				return getGenerator();
			case VisGridPackage.GRID__PLC:
				return getPlc();
			case VisGridPackage.GRID__NODE:
				return getNode();
			case VisGridPackage.GRID__CONNECTION:
				return getConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.GRID__CSV_READER:
				getCsv_reader().clear();
				getCsv_reader().addAll((Collection<? extends Csv_reader>)newValue);
				return;
			case VisGridPackage.GRID__DIESEL_DG:
				setDiesel_dg((Diesel_dg)newValue);
				return;
			case VisGridPackage.GRID__ENERGY_STORAGE:
				getEnergy_storage().clear();
				getEnergy_storage().addAll((Collection<? extends Energy_storage>)newValue);
				return;
			case VisGridPackage.GRID__INVERTER:
				getInverter().clear();
				getInverter().addAll((Collection<? extends Inverter>)newValue);
				return;
			case VisGridPackage.GRID__DC_DC_CONVERTER:
				getDc_dc_converter().clear();
				getDc_dc_converter().addAll((Collection<? extends Dc_dc_converter>)newValue);
				return;
			case VisGridPackage.GRID__BATTERY:
				getBattery().clear();
				getBattery().addAll((Collection<? extends Battery>)newValue);
				return;
			case VisGridPackage.GRID__AUCTION:
				getAuction().clear();
				getAuction().addAll((Collection<? extends Auction>)newValue);
				return;
			case VisGridPackage.GRID__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Controller>)newValue);
				return;
			case VisGridPackage.GRID__CONTROLLER2:
				getController2().clear();
				getController2().addAll((Collection<? extends Controller2>)newValue);
				return;
			case VisGridPackage.GRID__CAPBANK:
				getCapbank().clear();
				getCapbank().addAll((Collection<? extends Capbank>)newValue);
				return;
			case VisGridPackage.GRID__COMM:
				getComm().clear();
				getComm().addAll((Collection<? extends Comm>)newValue);
				return;
			case VisGridPackage.GRID__CAPACITOR:
				getCapacitor().clear();
				getCapacitor().addAll((Collection<? extends Capacitor>)newValue);
				return;
			case VisGridPackage.GRID__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
				return;
			case VisGridPackage.GRID__LINE_SPACING:
				getLine_spacing().clear();
				getLine_spacing().addAll((Collection<? extends Line_spacing>)newValue);
				return;
			case VisGridPackage.GRID__OVERHEAD_LINE:
				getOverhead_line().clear();
				getOverhead_line().addAll((Collection<? extends Overhead_line>)newValue);
				return;
			case VisGridPackage.GRID__UNDERGROUND_LINE:
				getUnderground_line().clear();
				getUnderground_line().addAll((Collection<? extends Underground_line>)newValue);
				return;
			case VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR:
				getOverhead_line_conductor().clear();
				getOverhead_line_conductor().addAll((Collection<? extends Overhead_line_conductor>)newValue);
				return;
			case VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR:
				getUnderground_line_conductor().clear();
				getUnderground_line_conductor().addAll((Collection<? extends Underground_line_conductor>)newValue);
				return;
			case VisGridPackage.GRID__LINE_CONFIGURATION:
				getLine_configuration().clear();
				getLine_configuration().addAll((Collection<? extends Line_configuration>)newValue);
				return;
			case VisGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				getTransformer_configuration().addAll((Collection<? extends Transformer_configuration>)newValue);
				return;
			case VisGridPackage.GRID__LOAD:
				getLoad().clear();
				getLoad().addAll((Collection<? extends Load>)newValue);
				return;
			case VisGridPackage.GRID__REGULATOR_CONFIGURATION:
				getRegulator_configuration().clear();
				getRegulator_configuration().addAll((Collection<? extends Regulator_configuration>)newValue);
				return;
			case VisGridPackage.GRID__TRIPLEX_NODE:
				getTriplex_node().clear();
				getTriplex_node().addAll((Collection<? extends Triplex_node>)newValue);
				return;
			case VisGridPackage.GRID__TRIPLEX_METER:
				getTriplex_meter().clear();
				getTriplex_meter().addAll((Collection<? extends Triplex_meter>)newValue);
				return;
			case VisGridPackage.GRID__TRIPLEX_LINE:
				getTriplex_line().clear();
				getTriplex_line().addAll((Collection<? extends Triplex_line>)newValue);
				return;
			case VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				getTriplex_line_configuration().addAll((Collection<? extends Triplex_line_configuration>)newValue);
				return;
			case VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				getTriplex_line_conductor().addAll((Collection<? extends Triplex_line_conductor>)newValue);
				return;
			case VisGridPackage.GRID__SWITCH:
				getSwitch().clear();
				getSwitch().addAll((Collection<? extends Switch>)newValue);
				return;
			case VisGridPackage.GRID__SUBSTATION:
				getSubstation().clear();
				getSubstation().addAll((Collection<? extends Substation>)newValue);
				return;
			case VisGridPackage.GRID__PQLOAD:
				getPqload().clear();
				getPqload().addAll((Collection<? extends Pqload>)newValue);
				return;
			case VisGridPackage.GRID__VOLTDUMP:
				getVoltdump().clear();
				getVoltdump().addAll((Collection<? extends Voltdump>)newValue);
				return;
			case VisGridPackage.GRID__SERIES_REACTOR:
				getSeries_reactor().clear();
				getSeries_reactor().addAll((Collection<? extends Series_reactor>)newValue);
				return;
			case VisGridPackage.GRID__RESTORATION:
				getRestoration().clear();
				getRestoration().addAll((Collection<? extends Restoration>)newValue);
				return;
			case VisGridPackage.GRID__FREQUENCY_GEN:
				getFrequency_gen().clear();
				getFrequency_gen().addAll((Collection<? extends Frequency_gen>)newValue);
				return;
			case VisGridPackage.GRID__VOLT_VAR_CONTROL:
				getVolt_var_control().clear();
				getVolt_var_control().addAll((Collection<? extends Volt_var_control>)newValue);
				return;
			case VisGridPackage.GRID__FAULT_CHECK:
				getFault_check().clear();
				getFault_check().addAll((Collection<? extends Fault_check>)newValue);
				return;
			case VisGridPackage.GRID__MOTOR:
				getMotor().clear();
				getMotor().addAll((Collection<? extends Motor>)newValue);
				return;
			case VisGridPackage.GRID__BILLDUMP:
				getBilldump().clear();
				getBilldump().addAll((Collection<? extends Billdump>)newValue);
				return;
			case VisGridPackage.GRID__RESIDENTIAL_ENDUSE:
				getResidential_enduse().clear();
				getResidential_enduse().addAll((Collection<? extends Residential_enduse>)newValue);
				return;
			case VisGridPackage.GRID__HOUSE_A:
				getHouse_a().clear();
				getHouse_a().addAll((Collection<? extends House_a>)newValue);
				return;
			case VisGridPackage.GRID__HOUSE:
				getHouse().clear();
				getHouse().addAll((Collection<? extends House>)newValue);
				return;
			case VisGridPackage.GRID__WATERHEATER:
				getWaterheater().clear();
				getWaterheater().addAll((Collection<? extends Waterheater>)newValue);
				return;
			case VisGridPackage.GRID__LIGHTS:
				getLights().clear();
				getLights().addAll((Collection<? extends Lights>)newValue);
				return;
			case VisGridPackage.GRID__REFRIGERATOR:
				getRefrigerator().clear();
				getRefrigerator().addAll((Collection<? extends Refrigerator>)newValue);
				return;
			case VisGridPackage.GRID__CLOTHESWASHER:
				getClotheswasher().clear();
				getClotheswasher().addAll((Collection<? extends Clotheswasher>)newValue);
				return;
			case VisGridPackage.GRID__DISHWASHER:
				getDishwasher().clear();
				getDishwasher().addAll((Collection<? extends Dishwasher>)newValue);
				return;
			case VisGridPackage.GRID__OCCUPANTLOAD:
				getOccupantload().clear();
				getOccupantload().addAll((Collection<? extends Occupantload>)newValue);
				return;
			case VisGridPackage.GRID__PLUGLOAD:
				getPlugload().clear();
				getPlugload().addAll((Collection<? extends Plugload>)newValue);
				return;
			case VisGridPackage.GRID__MICROWAVE:
				getMicrowave().clear();
				getMicrowave().addAll((Collection<? extends Microwave>)newValue);
				return;
			case VisGridPackage.GRID__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends Range>)newValue);
				return;
			case VisGridPackage.GRID__FREEZER:
				getFreezer().clear();
				getFreezer().addAll((Collection<? extends Freezer>)newValue);
				return;
			case VisGridPackage.GRID__DRYER:
				getDryer().clear();
				getDryer().addAll((Collection<? extends Dryer>)newValue);
				return;
			case VisGridPackage.GRID__EVCHARGER:
				getEvcharger().clear();
				getEvcharger().addAll((Collection<? extends Evcharger>)newValue);
				return;
			case VisGridPackage.GRID__ZI_PLOAD:
				getZIPload().clear();
				getZIPload().addAll((Collection<? extends ZIPload>)newValue);
				return;
			case VisGridPackage.GRID__PLAYER:
				getPlayer().clear();
				getPlayer().addAll((Collection<? extends Player>)newValue);
				return;
			case VisGridPackage.GRID__SHAPER:
				getShaper().clear();
				getShaper().addAll((Collection<? extends Shaper>)newValue);
				return;
			case VisGridPackage.GRID__RECORDER:
				getRecorder().clear();
				getRecorder().addAll((Collection<? extends Recorder>)newValue);
				return;
			case VisGridPackage.GRID__COLLECTOR:
				getCollector().clear();
				getCollector().addAll((Collection<? extends Collector>)newValue);
				return;
			case VisGridPackage.GRID__HISTOGRAM:
				getHistogram().clear();
				getHistogram().addAll((Collection<? extends Histogram>)newValue);
				return;
			case VisGridPackage.GRID__CLIMATE:
				getClimate().clear();
				getClimate().addAll((Collection<? extends Climate>)newValue);
				return;
			case VisGridPackage.GRID__WEATHER:
				getWeather().clear();
				getWeather().addAll((Collection<? extends Weather>)newValue);
				return;
			case VisGridPackage.GRID__OFFICE:
				getOffice().clear();
				getOffice().addAll((Collection<? extends Office>)newValue);
				return;
			case VisGridPackage.GRID__MULTIZONE:
				getMultizone().clear();
				getMultizone().addAll((Collection<? extends Multizone>)newValue);
				return;
			case VisGridPackage.GRID__WINDTURB_DG:
				getWindturb_dg().clear();
				getWindturb_dg().addAll((Collection<? extends Windturb_dg>)newValue);
				return;
			case VisGridPackage.GRID__POWER_ELECTRONICS:
				getPower_electronics().clear();
				getPower_electronics().addAll((Collection<? extends Power_electronics>)newValue);
				return;
			case VisGridPackage.GRID__RECTIFIER:
				getRectifier().clear();
				getRectifier().addAll((Collection<? extends Rectifier>)newValue);
				return;
			case VisGridPackage.GRID__MICROTURBINE:
				getMicroturbine().clear();
				getMicroturbine().addAll((Collection<? extends Microturbine>)newValue);
				return;
			case VisGridPackage.GRID__SOLAR:
				getSolar().clear();
				getSolar().addAll((Collection<? extends Solar>)newValue);
				return;
			case VisGridPackage.GRID__STUBAUCTION:
				getStubauction().clear();
				getStubauction().addAll((Collection<? extends Stubauction>)newValue);
				return;
			case VisGridPackage.GRID__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case VisGridPackage.GRID__FUSE:
				getFuse().clear();
				getFuse().addAll((Collection<? extends Fuse>)newValue);
				return;
			case VisGridPackage.GRID__RELAY:
				getRelay().clear();
				getRelay().addAll((Collection<? extends Relay>)newValue);
				return;
			case VisGridPackage.GRID__REGULATOR:
				getRegulator().clear();
				getRegulator().addAll((Collection<? extends Regulator>)newValue);
				return;
			case VisGridPackage.GRID__TRANSFORMER:
				getTransformer().clear();
				getTransformer().addAll((Collection<? extends Transformer>)newValue);
				return;
			case VisGridPackage.GRID__METER:
				getMeter().clear();
				getMeter().addAll((Collection<? extends Meter>)newValue);
				return;
			case VisGridPackage.GRID__GENERATOR:
				getGenerator().clear();
				getGenerator().addAll((Collection<? extends Generator>)newValue);
				return;
			case VisGridPackage.GRID__PLC:
				getPlc().clear();
				getPlc().addAll((Collection<? extends Plc>)newValue);
				return;
			case VisGridPackage.GRID__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case VisGridPackage.GRID__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisGridPackage.GRID__CSV_READER:
				getCsv_reader().clear();
				return;
			case VisGridPackage.GRID__DIESEL_DG:
				setDiesel_dg((Diesel_dg)null);
				return;
			case VisGridPackage.GRID__ENERGY_STORAGE:
				getEnergy_storage().clear();
				return;
			case VisGridPackage.GRID__INVERTER:
				getInverter().clear();
				return;
			case VisGridPackage.GRID__DC_DC_CONVERTER:
				getDc_dc_converter().clear();
				return;
			case VisGridPackage.GRID__BATTERY:
				getBattery().clear();
				return;
			case VisGridPackage.GRID__AUCTION:
				getAuction().clear();
				return;
			case VisGridPackage.GRID__CONTROLLER:
				getController().clear();
				return;
			case VisGridPackage.GRID__CONTROLLER2:
				getController2().clear();
				return;
			case VisGridPackage.GRID__CAPBANK:
				getCapbank().clear();
				return;
			case VisGridPackage.GRID__COMM:
				getComm().clear();
				return;
			case VisGridPackage.GRID__CAPACITOR:
				getCapacitor().clear();
				return;
			case VisGridPackage.GRID__LINE:
				getLine().clear();
				return;
			case VisGridPackage.GRID__LINE_SPACING:
				getLine_spacing().clear();
				return;
			case VisGridPackage.GRID__OVERHEAD_LINE:
				getOverhead_line().clear();
				return;
			case VisGridPackage.GRID__UNDERGROUND_LINE:
				getUnderground_line().clear();
				return;
			case VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR:
				getOverhead_line_conductor().clear();
				return;
			case VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR:
				getUnderground_line_conductor().clear();
				return;
			case VisGridPackage.GRID__LINE_CONFIGURATION:
				getLine_configuration().clear();
				return;
			case VisGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				return;
			case VisGridPackage.GRID__LOAD:
				getLoad().clear();
				return;
			case VisGridPackage.GRID__REGULATOR_CONFIGURATION:
				getRegulator_configuration().clear();
				return;
			case VisGridPackage.GRID__TRIPLEX_NODE:
				getTriplex_node().clear();
				return;
			case VisGridPackage.GRID__TRIPLEX_METER:
				getTriplex_meter().clear();
				return;
			case VisGridPackage.GRID__TRIPLEX_LINE:
				getTriplex_line().clear();
				return;
			case VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				return;
			case VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				return;
			case VisGridPackage.GRID__SWITCH:
				getSwitch().clear();
				return;
			case VisGridPackage.GRID__SUBSTATION:
				getSubstation().clear();
				return;
			case VisGridPackage.GRID__PQLOAD:
				getPqload().clear();
				return;
			case VisGridPackage.GRID__VOLTDUMP:
				getVoltdump().clear();
				return;
			case VisGridPackage.GRID__SERIES_REACTOR:
				getSeries_reactor().clear();
				return;
			case VisGridPackage.GRID__RESTORATION:
				getRestoration().clear();
				return;
			case VisGridPackage.GRID__FREQUENCY_GEN:
				getFrequency_gen().clear();
				return;
			case VisGridPackage.GRID__VOLT_VAR_CONTROL:
				getVolt_var_control().clear();
				return;
			case VisGridPackage.GRID__FAULT_CHECK:
				getFault_check().clear();
				return;
			case VisGridPackage.GRID__MOTOR:
				getMotor().clear();
				return;
			case VisGridPackage.GRID__BILLDUMP:
				getBilldump().clear();
				return;
			case VisGridPackage.GRID__RESIDENTIAL_ENDUSE:
				getResidential_enduse().clear();
				return;
			case VisGridPackage.GRID__HOUSE_A:
				getHouse_a().clear();
				return;
			case VisGridPackage.GRID__HOUSE:
				getHouse().clear();
				return;
			case VisGridPackage.GRID__WATERHEATER:
				getWaterheater().clear();
				return;
			case VisGridPackage.GRID__LIGHTS:
				getLights().clear();
				return;
			case VisGridPackage.GRID__REFRIGERATOR:
				getRefrigerator().clear();
				return;
			case VisGridPackage.GRID__CLOTHESWASHER:
				getClotheswasher().clear();
				return;
			case VisGridPackage.GRID__DISHWASHER:
				getDishwasher().clear();
				return;
			case VisGridPackage.GRID__OCCUPANTLOAD:
				getOccupantload().clear();
				return;
			case VisGridPackage.GRID__PLUGLOAD:
				getPlugload().clear();
				return;
			case VisGridPackage.GRID__MICROWAVE:
				getMicrowave().clear();
				return;
			case VisGridPackage.GRID__RANGE:
				getRange().clear();
				return;
			case VisGridPackage.GRID__FREEZER:
				getFreezer().clear();
				return;
			case VisGridPackage.GRID__DRYER:
				getDryer().clear();
				return;
			case VisGridPackage.GRID__EVCHARGER:
				getEvcharger().clear();
				return;
			case VisGridPackage.GRID__ZI_PLOAD:
				getZIPload().clear();
				return;
			case VisGridPackage.GRID__PLAYER:
				getPlayer().clear();
				return;
			case VisGridPackage.GRID__SHAPER:
				getShaper().clear();
				return;
			case VisGridPackage.GRID__RECORDER:
				getRecorder().clear();
				return;
			case VisGridPackage.GRID__COLLECTOR:
				getCollector().clear();
				return;
			case VisGridPackage.GRID__HISTOGRAM:
				getHistogram().clear();
				return;
			case VisGridPackage.GRID__CLIMATE:
				getClimate().clear();
				return;
			case VisGridPackage.GRID__WEATHER:
				getWeather().clear();
				return;
			case VisGridPackage.GRID__OFFICE:
				getOffice().clear();
				return;
			case VisGridPackage.GRID__MULTIZONE:
				getMultizone().clear();
				return;
			case VisGridPackage.GRID__WINDTURB_DG:
				getWindturb_dg().clear();
				return;
			case VisGridPackage.GRID__POWER_ELECTRONICS:
				getPower_electronics().clear();
				return;
			case VisGridPackage.GRID__RECTIFIER:
				getRectifier().clear();
				return;
			case VisGridPackage.GRID__MICROTURBINE:
				getMicroturbine().clear();
				return;
			case VisGridPackage.GRID__SOLAR:
				getSolar().clear();
				return;
			case VisGridPackage.GRID__STUBAUCTION:
				getStubauction().clear();
				return;
			case VisGridPackage.GRID__LINK:
				getLink().clear();
				return;
			case VisGridPackage.GRID__FUSE:
				getFuse().clear();
				return;
			case VisGridPackage.GRID__RELAY:
				getRelay().clear();
				return;
			case VisGridPackage.GRID__REGULATOR:
				getRegulator().clear();
				return;
			case VisGridPackage.GRID__TRANSFORMER:
				getTransformer().clear();
				return;
			case VisGridPackage.GRID__METER:
				getMeter().clear();
				return;
			case VisGridPackage.GRID__GENERATOR:
				getGenerator().clear();
				return;
			case VisGridPackage.GRID__PLC:
				getPlc().clear();
				return;
			case VisGridPackage.GRID__NODE:
				getNode().clear();
				return;
			case VisGridPackage.GRID__CONNECTION:
				getConnection().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisGridPackage.GRID__CSV_READER:
				return csv_reader != null && !csv_reader.isEmpty();
			case VisGridPackage.GRID__DIESEL_DG:
				return diesel_dg != null;
			case VisGridPackage.GRID__ENERGY_STORAGE:
				return energy_storage != null && !energy_storage.isEmpty();
			case VisGridPackage.GRID__INVERTER:
				return inverter != null && !inverter.isEmpty();
			case VisGridPackage.GRID__DC_DC_CONVERTER:
				return dc_dc_converter != null && !dc_dc_converter.isEmpty();
			case VisGridPackage.GRID__BATTERY:
				return battery != null && !battery.isEmpty();
			case VisGridPackage.GRID__AUCTION:
				return auction != null && !auction.isEmpty();
			case VisGridPackage.GRID__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case VisGridPackage.GRID__CONTROLLER2:
				return controller2 != null && !controller2.isEmpty();
			case VisGridPackage.GRID__CAPBANK:
				return capbank != null && !capbank.isEmpty();
			case VisGridPackage.GRID__COMM:
				return comm != null && !comm.isEmpty();
			case VisGridPackage.GRID__CAPACITOR:
				return capacitor != null && !capacitor.isEmpty();
			case VisGridPackage.GRID__LINE:
				return line != null && !line.isEmpty();
			case VisGridPackage.GRID__LINE_SPACING:
				return line_spacing != null && !line_spacing.isEmpty();
			case VisGridPackage.GRID__OVERHEAD_LINE:
				return overhead_line != null && !overhead_line.isEmpty();
			case VisGridPackage.GRID__UNDERGROUND_LINE:
				return underground_line != null && !underground_line.isEmpty();
			case VisGridPackage.GRID__OVERHEAD_LINE_CONDUCTOR:
				return overhead_line_conductor != null && !overhead_line_conductor.isEmpty();
			case VisGridPackage.GRID__UNDERGROUND_LINE_CONDUCTOR:
				return underground_line_conductor != null && !underground_line_conductor.isEmpty();
			case VisGridPackage.GRID__LINE_CONFIGURATION:
				return line_configuration != null && !line_configuration.isEmpty();
			case VisGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				return transformer_configuration != null && !transformer_configuration.isEmpty();
			case VisGridPackage.GRID__LOAD:
				return load != null && !load.isEmpty();
			case VisGridPackage.GRID__REGULATOR_CONFIGURATION:
				return regulator_configuration != null && !regulator_configuration.isEmpty();
			case VisGridPackage.GRID__TRIPLEX_NODE:
				return triplex_node != null && !triplex_node.isEmpty();
			case VisGridPackage.GRID__TRIPLEX_METER:
				return triplex_meter != null && !triplex_meter.isEmpty();
			case VisGridPackage.GRID__TRIPLEX_LINE:
				return triplex_line != null && !triplex_line.isEmpty();
			case VisGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				return triplex_line_configuration != null && !triplex_line_configuration.isEmpty();
			case VisGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				return triplex_line_conductor != null && !triplex_line_conductor.isEmpty();
			case VisGridPackage.GRID__SWITCH:
				return switch_ != null && !switch_.isEmpty();
			case VisGridPackage.GRID__SUBSTATION:
				return substation != null && !substation.isEmpty();
			case VisGridPackage.GRID__PQLOAD:
				return pqload != null && !pqload.isEmpty();
			case VisGridPackage.GRID__VOLTDUMP:
				return voltdump != null && !voltdump.isEmpty();
			case VisGridPackage.GRID__SERIES_REACTOR:
				return series_reactor != null && !series_reactor.isEmpty();
			case VisGridPackage.GRID__RESTORATION:
				return restoration != null && !restoration.isEmpty();
			case VisGridPackage.GRID__FREQUENCY_GEN:
				return frequency_gen != null && !frequency_gen.isEmpty();
			case VisGridPackage.GRID__VOLT_VAR_CONTROL:
				return volt_var_control != null && !volt_var_control.isEmpty();
			case VisGridPackage.GRID__FAULT_CHECK:
				return fault_check != null && !fault_check.isEmpty();
			case VisGridPackage.GRID__MOTOR:
				return motor != null && !motor.isEmpty();
			case VisGridPackage.GRID__BILLDUMP:
				return billdump != null && !billdump.isEmpty();
			case VisGridPackage.GRID__RESIDENTIAL_ENDUSE:
				return residential_enduse != null && !residential_enduse.isEmpty();
			case VisGridPackage.GRID__HOUSE_A:
				return house_a != null && !house_a.isEmpty();
			case VisGridPackage.GRID__HOUSE:
				return house != null && !house.isEmpty();
			case VisGridPackage.GRID__WATERHEATER:
				return waterheater != null && !waterheater.isEmpty();
			case VisGridPackage.GRID__LIGHTS:
				return lights != null && !lights.isEmpty();
			case VisGridPackage.GRID__REFRIGERATOR:
				return refrigerator != null && !refrigerator.isEmpty();
			case VisGridPackage.GRID__CLOTHESWASHER:
				return clotheswasher != null && !clotheswasher.isEmpty();
			case VisGridPackage.GRID__DISHWASHER:
				return dishwasher != null && !dishwasher.isEmpty();
			case VisGridPackage.GRID__OCCUPANTLOAD:
				return occupantload != null && !occupantload.isEmpty();
			case VisGridPackage.GRID__PLUGLOAD:
				return plugload != null && !plugload.isEmpty();
			case VisGridPackage.GRID__MICROWAVE:
				return microwave != null && !microwave.isEmpty();
			case VisGridPackage.GRID__RANGE:
				return range != null && !range.isEmpty();
			case VisGridPackage.GRID__FREEZER:
				return freezer != null && !freezer.isEmpty();
			case VisGridPackage.GRID__DRYER:
				return dryer != null && !dryer.isEmpty();
			case VisGridPackage.GRID__EVCHARGER:
				return evcharger != null && !evcharger.isEmpty();
			case VisGridPackage.GRID__ZI_PLOAD:
				return ziPload != null && !ziPload.isEmpty();
			case VisGridPackage.GRID__PLAYER:
				return player != null && !player.isEmpty();
			case VisGridPackage.GRID__SHAPER:
				return shaper != null && !shaper.isEmpty();
			case VisGridPackage.GRID__RECORDER:
				return recorder != null && !recorder.isEmpty();
			case VisGridPackage.GRID__COLLECTOR:
				return collector != null && !collector.isEmpty();
			case VisGridPackage.GRID__HISTOGRAM:
				return histogram != null && !histogram.isEmpty();
			case VisGridPackage.GRID__CLIMATE:
				return climate != null && !climate.isEmpty();
			case VisGridPackage.GRID__WEATHER:
				return weather != null && !weather.isEmpty();
			case VisGridPackage.GRID__OFFICE:
				return office != null && !office.isEmpty();
			case VisGridPackage.GRID__MULTIZONE:
				return multizone != null && !multizone.isEmpty();
			case VisGridPackage.GRID__WINDTURB_DG:
				return windturb_dg != null && !windturb_dg.isEmpty();
			case VisGridPackage.GRID__POWER_ELECTRONICS:
				return power_electronics != null && !power_electronics.isEmpty();
			case VisGridPackage.GRID__RECTIFIER:
				return rectifier != null && !rectifier.isEmpty();
			case VisGridPackage.GRID__MICROTURBINE:
				return microturbine != null && !microturbine.isEmpty();
			case VisGridPackage.GRID__SOLAR:
				return solar != null && !solar.isEmpty();
			case VisGridPackage.GRID__STUBAUCTION:
				return stubauction != null && !stubauction.isEmpty();
			case VisGridPackage.GRID__LINK:
				return link != null && !link.isEmpty();
			case VisGridPackage.GRID__FUSE:
				return fuse != null && !fuse.isEmpty();
			case VisGridPackage.GRID__RELAY:
				return relay != null && !relay.isEmpty();
			case VisGridPackage.GRID__REGULATOR:
				return regulator != null && !regulator.isEmpty();
			case VisGridPackage.GRID__TRANSFORMER:
				return transformer != null && !transformer.isEmpty();
			case VisGridPackage.GRID__METER:
				return meter != null && !meter.isEmpty();
			case VisGridPackage.GRID__GENERATOR:
				return generator != null && !generator.isEmpty();
			case VisGridPackage.GRID__PLC:
				return plc != null && !plc.isEmpty();
			case VisGridPackage.GRID__NODE:
				return node != null && !node.isEmpty();
			case VisGridPackage.GRID__CONNECTION:
				return connection != null && !connection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GridImpl