/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import visGrid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisGridFactoryImpl extends EFactoryImpl implements VisGridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisGridFactory init() {
		try {
			VisGridFactory theVisGridFactory = (VisGridFactory)EPackage.Registry.INSTANCE.getEFactory("http://tcd.ie"); 
			if (theVisGridFactory != null) {
				return theVisGridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisGridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisGridFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisGridPackage.CLIMATE: return createClimate();
			case VisGridPackage.CSV_READER: return createCsv_reader();
			case VisGridPackage.DIESEL_DG: return createDiesel_dg();
			case VisGridPackage.ENERGY_STORAGE: return createEnergy_storage();
			case VisGridPackage.INVERTER: return createInverter();
			case VisGridPackage.DC_DC_CONVERTER: return createDc_dc_converter();
			case VisGridPackage.AUCTION: return createAuction();
			case VisGridPackage.CONTROLLER: return createController();
			case VisGridPackage.CONTROLLER2: return createController2();
			case VisGridPackage.CAPBANK: return createCapbank();
			case VisGridPackage.COMM: return createComm();
			case VisGridPackage.CAPACITOR: return createCapacitor();
			case VisGridPackage.LINE: return createLine();
			case VisGridPackage.LINE_SPACING: return createLine_spacing();
			case VisGridPackage.OVERHEAD_LINE: return createOverhead_line();
			case VisGridPackage.UNDERGROUND_LINE: return createUnderground_line();
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR: return createOverhead_line_conductor();
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR: return createUnderground_line_conductor();
			case VisGridPackage.LINE_CONFIGURATION: return createLine_configuration();
			case VisGridPackage.TRANSFORMER_CONFIGURATION: return createTransformer_configuration();
			case VisGridPackage.LOAD: return createLoad();
			case VisGridPackage.REGULATOR_CONFIGURATION: return createRegulator_configuration();
			case VisGridPackage.TRIPLEX_NODE: return createTriplex_node();
			case VisGridPackage.TRIPLEX_METER: return createTriplex_meter();
			case VisGridPackage.TRIPLEX_LINE: return createTriplex_line();
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION: return createTriplex_line_configuration();
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR: return createTriplex_line_conductor();
			case VisGridPackage.SWITCH: return createSwitch();
			case VisGridPackage.SUBSTATION: return createSubstation();
			case VisGridPackage.PQLOAD: return createPqload();
			case VisGridPackage.VOLTDUMP: return createVoltdump();
			case VisGridPackage.SERIES_REACTOR: return createSeries_reactor();
			case VisGridPackage.RESTORATION: return createRestoration();
			case VisGridPackage.FREQUENCY_GEN: return createFrequency_gen();
			case VisGridPackage.VOLT_VAR_CONTROL: return createVolt_var_control();
			case VisGridPackage.FAULT_CHECK: return createFault_check();
			case VisGridPackage.MOTOR: return createMotor();
			case VisGridPackage.BILLDUMP: return createBilldump();
			case VisGridPackage.RESIDENTIAL_ENDUSE: return createResidential_enduse();
			case VisGridPackage.HOUSE_A: return createHouse_a();
			case VisGridPackage.HOUSE: return createHouse();
			case VisGridPackage.WATERHEATER: return createWaterheater();
			case VisGridPackage.LIGHTS: return createLights();
			case VisGridPackage.REFRIGERATOR: return createRefrigerator();
			case VisGridPackage.CLOTHESWASHER: return createClotheswasher();
			case VisGridPackage.DISHWASHER: return createDishwasher();
			case VisGridPackage.OCCUPANTLOAD: return createOccupantload();
			case VisGridPackage.PLUGLOAD: return createPlugload();
			case VisGridPackage.MICROWAVE: return createMicrowave();
			case VisGridPackage.RANGE: return createRange();
			case VisGridPackage.FREEZER: return createFreezer();
			case VisGridPackage.DRYER: return createDryer();
			case VisGridPackage.EVCHARGER: return createEvcharger();
			case VisGridPackage.ZI_PLOAD: return createZIPload();
			case VisGridPackage.PLAYER: return createPlayer();
			case VisGridPackage.SHAPER: return createShaper();
			case VisGridPackage.RECORDER: return createRecorder();
			case VisGridPackage.COLLECTOR: return createCollector();
			case VisGridPackage.HISTOGRAM: return createHistogram();
			case VisGridPackage.WEATHER: return createWeather();
			case VisGridPackage.OFFICE: return createOffice();
			case VisGridPackage.MULTIZONE: return createMultizone();
			case VisGridPackage.WINDTURB_DG: return createWindturb_dg();
			case VisGridPackage.POWER_ELECTRONICS: return createPower_electronics();
			case VisGridPackage.RECTIFIER: return createRectifier();
			case VisGridPackage.MICROTURBINE: return createMicroturbine();
			case VisGridPackage.BATTERY: return createBattery();
			case VisGridPackage.SOLAR: return createSolar();
			case VisGridPackage.STUBAUCTION: return createStubauction();
			case VisGridPackage.LINK: return createLink();
			case VisGridPackage.FUSE: return createFuse();
			case VisGridPackage.RELAY: return createRelay();
			case VisGridPackage.REGULATOR: return createRegulator();
			case VisGridPackage.TRANSFORMER: return createTransformer();
			case VisGridPackage.METER: return createMeter();
			case VisGridPackage.GENERATOR: return createGenerator();
			case VisGridPackage.PLC: return createPlc();
			case VisGridPackage.NODE: return createNode();
			case VisGridPackage.CONNECTIONS: return createConnections();
			case VisGridPackage.GRID: return createGrid();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Climate createClimate() {
		ClimateImpl climate = new ClimateImpl();
		return climate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Csv_reader createCsv_reader() {
		Csv_readerImpl csv_reader = new Csv_readerImpl();
		return csv_reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diesel_dg createDiesel_dg() {
		Diesel_dgImpl diesel_dg = new Diesel_dgImpl();
		return diesel_dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Energy_storage createEnergy_storage() {
		Energy_storageImpl energy_storage = new Energy_storageImpl();
		return energy_storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inverter createInverter() {
		InverterImpl inverter = new InverterImpl();
		return inverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dc_dc_converter createDc_dc_converter() {
		Dc_dc_converterImpl dc_dc_converter = new Dc_dc_converterImpl();
		return dc_dc_converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auction createAuction() {
		AuctionImpl auction = new AuctionImpl();
		return auction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller2 createController2() {
		Controller2Impl controller2 = new Controller2Impl();
		return controller2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capbank createCapbank() {
		CapbankImpl capbank = new CapbankImpl();
		return capbank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comm createComm() {
		CommImpl comm = new CommImpl();
		return comm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capacitor createCapacitor() {
		CapacitorImpl capacitor = new CapacitorImpl();
		return capacitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line_spacing createLine_spacing() {
		Line_spacingImpl line_spacing = new Line_spacingImpl();
		return line_spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overhead_line createOverhead_line() {
		Overhead_lineImpl overhead_line = new Overhead_lineImpl();
		return overhead_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Underground_line createUnderground_line() {
		Underground_lineImpl underground_line = new Underground_lineImpl();
		return underground_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overhead_line_conductor createOverhead_line_conductor() {
		Overhead_line_conductorImpl overhead_line_conductor = new Overhead_line_conductorImpl();
		return overhead_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Underground_line_conductor createUnderground_line_conductor() {
		Underground_line_conductorImpl underground_line_conductor = new Underground_line_conductorImpl();
		return underground_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line_configuration createLine_configuration() {
		Line_configurationImpl line_configuration = new Line_configurationImpl();
		return line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer_configuration createTransformer_configuration() {
		Transformer_configurationImpl transformer_configuration = new Transformer_configurationImpl();
		return transformer_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regulator_configuration createRegulator_configuration() {
		Regulator_configurationImpl regulator_configuration = new Regulator_configurationImpl();
		return regulator_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_node createTriplex_node() {
		Triplex_nodeImpl triplex_node = new Triplex_nodeImpl();
		return triplex_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_meter createTriplex_meter() {
		Triplex_meterImpl triplex_meter = new Triplex_meterImpl();
		return triplex_meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_line createTriplex_line() {
		Triplex_lineImpl triplex_line = new Triplex_lineImpl();
		return triplex_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_line_configuration createTriplex_line_configuration() {
		Triplex_line_configurationImpl triplex_line_configuration = new Triplex_line_configurationImpl();
		return triplex_line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_line_conductor createTriplex_line_conductor() {
		Triplex_line_conductorImpl triplex_line_conductor = new Triplex_line_conductorImpl();
		return triplex_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		SubstationImpl substation = new SubstationImpl();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pqload createPqload() {
		PqloadImpl pqload = new PqloadImpl();
		return pqload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voltdump createVoltdump() {
		VoltdumpImpl voltdump = new VoltdumpImpl();
		return voltdump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series_reactor createSeries_reactor() {
		Series_reactorImpl series_reactor = new Series_reactorImpl();
		return series_reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restoration createRestoration() {
		RestorationImpl restoration = new RestorationImpl();
		return restoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frequency_gen createFrequency_gen() {
		Frequency_genImpl frequency_gen = new Frequency_genImpl();
		return frequency_gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volt_var_control createVolt_var_control() {
		Volt_var_controlImpl volt_var_control = new Volt_var_controlImpl();
		return volt_var_control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fault_check createFault_check() {
		Fault_checkImpl fault_check = new Fault_checkImpl();
		return fault_check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motor createMotor() {
		MotorImpl motor = new MotorImpl();
		return motor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Billdump createBilldump() {
		BilldumpImpl billdump = new BilldumpImpl();
		return billdump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Residential_enduse createResidential_enduse() {
		Residential_enduseImpl residential_enduse = new Residential_enduseImpl();
		return residential_enduse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House_a createHouse_a() {
		House_aImpl house_a = new House_aImpl();
		return house_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Waterheater createWaterheater() {
		WaterheaterImpl waterheater = new WaterheaterImpl();
		return waterheater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lights createLights() {
		LightsImpl lights = new LightsImpl();
		return lights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refrigerator createRefrigerator() {
		RefrigeratorImpl refrigerator = new RefrigeratorImpl();
		return refrigerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clotheswasher createClotheswasher() {
		ClotheswasherImpl clotheswasher = new ClotheswasherImpl();
		return clotheswasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dishwasher createDishwasher() {
		DishwasherImpl dishwasher = new DishwasherImpl();
		return dishwasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Occupantload createOccupantload() {
		OccupantloadImpl occupantload = new OccupantloadImpl();
		return occupantload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugload createPlugload() {
		PlugloadImpl plugload = new PlugloadImpl();
		return plugload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microwave createMicrowave() {
		MicrowaveImpl microwave = new MicrowaveImpl();
		return microwave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Freezer createFreezer() {
		FreezerImpl freezer = new FreezerImpl();
		return freezer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dryer createDryer() {
		DryerImpl dryer = new DryerImpl();
		return dryer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evcharger createEvcharger() {
		EvchargerImpl evcharger = new EvchargerImpl();
		return evcharger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZIPload createZIPload() {
		ZIPloadImpl ziPload = new ZIPloadImpl();
		return ziPload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shaper createShaper() {
		ShaperImpl shaper = new ShaperImpl();
		return shaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recorder createRecorder() {
		RecorderImpl recorder = new RecorderImpl();
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collector createCollector() {
		CollectorImpl collector = new CollectorImpl();
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Histogram createHistogram() {
		HistogramImpl histogram = new HistogramImpl();
		return histogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weather createWeather() {
		WeatherImpl weather = new WeatherImpl();
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Office createOffice() {
		OfficeImpl office = new OfficeImpl();
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multizone createMultizone() {
		MultizoneImpl multizone = new MultizoneImpl();
		return multizone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Windturb_dg createWindturb_dg() {
		Windturb_dgImpl windturb_dg = new Windturb_dgImpl();
		return windturb_dg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Power_electronics createPower_electronics() {
		Power_electronicsImpl power_electronics = new Power_electronicsImpl();
		return power_electronics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectifier createRectifier() {
		RectifierImpl rectifier = new RectifierImpl();
		return rectifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microturbine createMicroturbine() {
		MicroturbineImpl microturbine = new MicroturbineImpl();
		return microturbine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery createBattery() {
		BatteryImpl battery = new BatteryImpl();
		return battery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solar createSolar() {
		SolarImpl solar = new SolarImpl();
		return solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stubauction createStubauction() {
		StubauctionImpl stubauction = new StubauctionImpl();
		return stubauction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fuse createFuse() {
		FuseImpl fuse = new FuseImpl();
		return fuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relay createRelay() {
		RelayImpl relay = new RelayImpl();
		return relay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regulator createRegulator() {
		RegulatorImpl regulator = new RegulatorImpl();
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer createTransformer() {
		TransformerImpl transformer = new TransformerImpl();
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plc createPlc() {
		PlcImpl plc = new PlcImpl();
		return plc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connections createConnections() {
		ConnectionsImpl connections = new ConnectionsImpl();
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisGridPackage getVisGridPackage() {
		return (VisGridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisGridPackage getPackage() {
		return VisGridPackage.eINSTANCE;
	}

} //VisGridFactoryImpl