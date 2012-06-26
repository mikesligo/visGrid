package visGrid.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class VisGridPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createVisGrid1Group());
	}

	/**
	 * Creates "visGrid" palette tool group
	 * @generated
	 */
	private PaletteContainer createVisGrid1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				visGrid.diagram.part.Messages.VisGrid1Group_title);
		paletteContainer.setId("createVisGrid1Group"); //$NON-NLS-1$
		paletteContainer.add(createClimate1CreationTool());
		paletteContainer.add(createClimateConnection2CreationTool());
		paletteContainer.add(createCsv_reader3CreationTool());
		paletteContainer.add(createCsv_readerConnection4CreationTool());
		paletteContainer.add(createDiesel_dg5CreationTool());
		paletteContainer.add(createDiesel_dgConnection6CreationTool());
		paletteContainer.add(createEnergy_storage7CreationTool());
		paletteContainer.add(createEnergy_storageConnection8CreationTool());
		paletteContainer.add(createInverter9CreationTool());
		paletteContainer.add(createInverterConnection10CreationTool());
		paletteContainer.add(createDc_dc_converter11CreationTool());
		paletteContainer.add(createDc_dc_converterConnection12CreationTool());
		paletteContainer.add(createAuction13CreationTool());
		paletteContainer.add(createAuctionConnection14CreationTool());
		paletteContainer.add(createController15CreationTool());
		paletteContainer.add(createControllerConnection16CreationTool());
		paletteContainer.add(createController217CreationTool());
		paletteContainer.add(createController2Connection18CreationTool());
		paletteContainer.add(createCapbank19CreationTool());
		paletteContainer.add(createCapbankConnection20CreationTool());
		paletteContainer.add(createComm21CreationTool());
		paletteContainer.add(createCommConnection22CreationTool());
		paletteContainer.add(createCapacitor23CreationTool());
		paletteContainer.add(createCapacitorConnection24CreationTool());
		paletteContainer.add(createLine25CreationTool());
		paletteContainer.add(createLineConnection26CreationTool());
		paletteContainer.add(createLine_spacing27CreationTool());
		paletteContainer.add(createLine_spacingConnection28CreationTool());
		paletteContainer.add(createOverhead_line29CreationTool());
		paletteContainer.add(createOverhead_lineConnection30CreationTool());
		paletteContainer.add(createUnderground_line31CreationTool());
		paletteContainer.add(createUnderground_lineConnection32CreationTool());
		paletteContainer.add(createOverhead_line_conductor33CreationTool());
		paletteContainer
				.add(createOverhead_line_conductorConnection34CreationTool());
		paletteContainer.add(createUnderground_line_conductor35CreationTool());
		paletteContainer
				.add(createUnderground_line_conductorConnection36CreationTool());
		paletteContainer.add(createLine_configuration37CreationTool());
		paletteContainer
				.add(createLine_configurationConnection38CreationTool());
		paletteContainer.add(createTransformer_configuration39CreationTool());
		paletteContainer
				.add(createTransformer_configurationConnection40CreationTool());
		paletteContainer.add(createLoad41CreationTool());
		paletteContainer.add(createLoadConnection42CreationTool());
		paletteContainer.add(createRegulator_configuration43CreationTool());
		paletteContainer
				.add(createRegulator_configurationConnection44CreationTool());
		paletteContainer.add(createTriplex_node45CreationTool());
		paletteContainer.add(createTriplex_nodeConnection46CreationTool());
		paletteContainer.add(createTriplex_meter47CreationTool());
		paletteContainer.add(createTriplex_meterConnection48CreationTool());
		paletteContainer.add(createTriplex_line49CreationTool());
		paletteContainer.add(createTriplex_lineConnection50CreationTool());
		paletteContainer.add(createTriplex_line_configuration51CreationTool());
		paletteContainer
				.add(createTriplex_line_configurationConnection52CreationTool());
		paletteContainer.add(createTriplex_line_conductor53CreationTool());
		paletteContainer
				.add(createTriplex_line_conductorConnection54CreationTool());
		paletteContainer.add(createSwitch55CreationTool());
		paletteContainer.add(createSwitchConnection56CreationTool());
		paletteContainer.add(createSubstation57CreationTool());
		paletteContainer.add(createSubstationConnection58CreationTool());
		paletteContainer.add(createPqload59CreationTool());
		paletteContainer.add(createPqloadConnection60CreationTool());
		paletteContainer.add(createVoltdump61CreationTool());
		paletteContainer.add(createVoltdumpConnection62CreationTool());
		paletteContainer.add(createSeries_reactor63CreationTool());
		paletteContainer.add(createSeries_reactorConnection64CreationTool());
		paletteContainer.add(createRestoration65CreationTool());
		paletteContainer.add(createRestorationConnection66CreationTool());
		paletteContainer.add(createFrequency_gen67CreationTool());
		paletteContainer.add(createFrequency_genConnection68CreationTool());
		paletteContainer.add(createVolt_var_control69CreationTool());
		paletteContainer.add(createVolt_var_controlConnection70CreationTool());
		paletteContainer.add(createFault_check71CreationTool());
		paletteContainer.add(createFault_checkConnection72CreationTool());
		paletteContainer.add(createMotor73CreationTool());
		paletteContainer.add(createMotorConnection74CreationTool());
		paletteContainer.add(createBilldump75CreationTool());
		paletteContainer.add(createBilldumpConnection76CreationTool());
		paletteContainer.add(createResidential_enduse77CreationTool());
		paletteContainer
				.add(createResidential_enduseConnection78CreationTool());
		paletteContainer.add(createHouse_a79CreationTool());
		paletteContainer.add(createHouse_aConnection80CreationTool());
		paletteContainer.add(createHouse81CreationTool());
		paletteContainer.add(createHouseConnection82CreationTool());
		paletteContainer.add(createWaterheater83CreationTool());
		paletteContainer.add(createWaterheaterConnection84CreationTool());
		paletteContainer.add(createLights85CreationTool());
		paletteContainer.add(createLightsConnection86CreationTool());
		paletteContainer.add(createRefrigerator87CreationTool());
		paletteContainer.add(createRefrigeratorConnection88CreationTool());
		paletteContainer.add(createClotheswasher89CreationTool());
		paletteContainer.add(createClotheswasherConnection90CreationTool());
		paletteContainer.add(createDishwasher91CreationTool());
		paletteContainer.add(createDishwasherConnection92CreationTool());
		paletteContainer.add(createOccupantload93CreationTool());
		paletteContainer.add(createOccupantloadConnection94CreationTool());
		paletteContainer.add(createPlugload95CreationTool());
		paletteContainer.add(createPlugloadConnection96CreationTool());
		paletteContainer.add(createMicrowave97CreationTool());
		paletteContainer.add(createMicrowaveConnection98CreationTool());
		paletteContainer.add(createRange99CreationTool());
		paletteContainer.add(createRangeConnection100CreationTool());
		paletteContainer.add(createFreezer101CreationTool());
		paletteContainer.add(createFreezerConnection102CreationTool());
		paletteContainer.add(createDryer103CreationTool());
		paletteContainer.add(createDryerConnection104CreationTool());
		paletteContainer.add(createEvcharger105CreationTool());
		paletteContainer.add(createEvchargerConnection106CreationTool());
		paletteContainer.add(createZIPload107CreationTool());
		paletteContainer.add(createZIPloadConnection108CreationTool());
		paletteContainer.add(createPlayer109CreationTool());
		paletteContainer.add(createPlayerConnection110CreationTool());
		paletteContainer.add(createShaper111CreationTool());
		paletteContainer.add(createShaperConnection112CreationTool());
		paletteContainer.add(createRecorder113CreationTool());
		paletteContainer.add(createRecorderConnection114CreationTool());
		paletteContainer.add(createCollector115CreationTool());
		paletteContainer.add(createCollectorConnection116CreationTool());
		paletteContainer.add(createHistogram117CreationTool());
		paletteContainer.add(createHistogramConnection118CreationTool());
		paletteContainer.add(createWeather119CreationTool());
		paletteContainer.add(createWeatherConnection120CreationTool());
		paletteContainer.add(createOffice121CreationTool());
		paletteContainer.add(createOfficeConnection122CreationTool());
		paletteContainer.add(createMultizone123CreationTool());
		paletteContainer.add(createMultizoneConnection124CreationTool());
		paletteContainer.add(createWindturb_dg125CreationTool());
		paletteContainer.add(createWindturb_dgConnection126CreationTool());
		paletteContainer.add(createPower_electronics127CreationTool());
		paletteContainer
				.add(createPower_electronicsConnection128CreationTool());
		paletteContainer.add(createRectifier129CreationTool());
		paletteContainer.add(createRectifierConnection130CreationTool());
		paletteContainer.add(createMicroturbine131CreationTool());
		paletteContainer.add(createMicroturbineConnection132CreationTool());
		paletteContainer.add(createBattery133CreationTool());
		paletteContainer.add(createBatteryConnection134CreationTool());
		paletteContainer.add(createSolar135CreationTool());
		paletteContainer.add(createSolarConnection136CreationTool());
		paletteContainer.add(createStubauction137CreationTool());
		paletteContainer.add(createStubauctionConnection138CreationTool());
		paletteContainer.add(createLink139CreationTool());
		paletteContainer.add(createLinkConnection140CreationTool());
		paletteContainer.add(createFuse141CreationTool());
		paletteContainer.add(createFuseConnection142CreationTool());
		paletteContainer.add(createRelay143CreationTool());
		paletteContainer.add(createRelayConnection144CreationTool());
		paletteContainer.add(createRegulator145CreationTool());
		paletteContainer.add(createRegulatorConnection146CreationTool());
		paletteContainer.add(createTransformer147CreationTool());
		paletteContainer.add(createTransformerConnection148CreationTool());
		paletteContainer.add(createMeter149CreationTool());
		paletteContainer.add(createMeterConnection150CreationTool());
		paletteContainer.add(createGenerator151CreationTool());
		paletteContainer.add(createGeneratorConnection152CreationTool());
		paletteContainer.add(createPlc153CreationTool());
		paletteContainer.add(createPlcConnection154CreationTool());
		paletteContainer.add(createNode155CreationTool());
		paletteContainer.add(createNodeConnection156CreationTool());
		paletteContainer.add(createConnections157CreationTool());
		paletteContainer.add(createConnectionsCsv_reader158CreationTool());
		paletteContainer.add(createConnectionsDiesel_dg159CreationTool());
		paletteContainer.add(createConnectionsEnergy_storage160CreationTool());
		paletteContainer.add(createConnectionsInverter161CreationTool());
		paletteContainer.add(createConnectionsDc_dc_converter162CreationTool());
		paletteContainer.add(createConnectionsBattery163CreationTool());
		paletteContainer.add(createConnectionsAuction164CreationTool());
		paletteContainer.add(createConnectionsController165CreationTool());
		paletteContainer.add(createConnectionsController2166CreationTool());
		paletteContainer.add(createConnectionsCapbank167CreationTool());
		paletteContainer.add(createConnectionsComm168CreationTool());
		paletteContainer.add(createConnectionsCapacitor169CreationTool());
		paletteContainer.add(createConnectionsLine170CreationTool());
		paletteContainer.add(createConnectionsLine_spacing171CreationTool());
		paletteContainer.add(createConnectionsOverhead_line172CreationTool());
		paletteContainer
				.add(createConnectionsUnderground_line173CreationTool());
		paletteContainer
				.add(createConnectionsOverhead_line_conductor174CreationTool());
		paletteContainer
				.add(createConnectionsUnderground_line_conductor175CreationTool());
		paletteContainer
				.add(createConnectionsLine_configuration176CreationTool());
		paletteContainer
				.add(createConnectionsTransformer_configuration177CreationTool());
		paletteContainer.add(createConnectionsLoad178CreationTool());
		paletteContainer
				.add(createConnectionsRegulator_configuration179CreationTool());
		paletteContainer.add(createConnectionsTriplex_node180CreationTool());
		paletteContainer.add(createConnectionsTriplex_meter181CreationTool());
		paletteContainer.add(createConnectionsTriplex_line182CreationTool());
		paletteContainer
				.add(createConnectionsTriplex_line_configuration183CreationTool());
		paletteContainer
				.add(createConnectionsTriplex_line_conductor184CreationTool());
		paletteContainer.add(createConnectionsSwitch185CreationTool());
		paletteContainer.add(createConnectionsSubstation186CreationTool());
		paletteContainer.add(createConnectionsPqload187CreationTool());
		paletteContainer.add(createConnectionsVoltdump188CreationTool());
		paletteContainer.add(createConnectionsSeries_reactor189CreationTool());
		paletteContainer.add(createConnectionsRestoration190CreationTool());
		paletteContainer.add(createConnectionsFrequency_gen191CreationTool());
		paletteContainer
				.add(createConnectionsVolt_var_control192CreationTool());
		paletteContainer.add(createConnectionsFault_check193CreationTool());
		paletteContainer.add(createConnectionsMotor194CreationTool());
		paletteContainer.add(createConnectionsBilldump195CreationTool());
		paletteContainer
				.add(createConnectionsResidential_enduse196CreationTool());
		paletteContainer.add(createConnectionsHouse_a197CreationTool());
		paletteContainer.add(createConnectionsHouse198CreationTool());
		paletteContainer.add(createConnectionsWaterheater199CreationTool());
		paletteContainer.add(createConnectionsLights200CreationTool());
		paletteContainer.add(createConnectionsRefrigerator201CreationTool());
		paletteContainer.add(createConnectionsClotheswasher202CreationTool());
		paletteContainer.add(createConnectionsDishwasher203CreationTool());
		paletteContainer.add(createConnectionsOccupantload204CreationTool());
		paletteContainer.add(createConnectionsPlugload205CreationTool());
		paletteContainer.add(createConnectionsMicrowave206CreationTool());
		paletteContainer.add(createConnectionsRange207CreationTool());
		paletteContainer.add(createConnectionsFreezer208CreationTool());
		paletteContainer.add(createConnectionsDryer209CreationTool());
		paletteContainer.add(createConnectionsEvcharger210CreationTool());
		paletteContainer.add(createConnectionsZIPload211CreationTool());
		paletteContainer.add(createConnectionsPlayer212CreationTool());
		paletteContainer.add(createConnectionsShaper213CreationTool());
		paletteContainer.add(createConnectionsRecorder214CreationTool());
		paletteContainer.add(createConnectionsCollector215CreationTool());
		paletteContainer.add(createConnectionsHistogram216CreationTool());
		paletteContainer.add(createConnectionsClimate217CreationTool());
		paletteContainer.add(createConnectionsWeather218CreationTool());
		paletteContainer.add(createConnectionsOffice219CreationTool());
		paletteContainer.add(createConnectionsMultizone220CreationTool());
		paletteContainer.add(createConnectionsWindturb_dg221CreationTool());
		paletteContainer
				.add(createConnectionsPower_electronics222CreationTool());
		paletteContainer.add(createConnectionsRectifier223CreationTool());
		paletteContainer.add(createConnectionsMicroturbine224CreationTool());
		paletteContainer.add(createConnectionsSolar225CreationTool());
		paletteContainer.add(createConnectionsStubauction226CreationTool());
		paletteContainer.add(createConnectionsLink227CreationTool());
		paletteContainer.add(createConnectionsFuse228CreationTool());
		paletteContainer.add(createConnectionsRelay229CreationTool());
		paletteContainer.add(createConnectionsRegulator230CreationTool());
		paletteContainer.add(createConnectionsTransformer231CreationTool());
		paletteContainer.add(createConnectionsMeter232CreationTool());
		paletteContainer.add(createConnectionsGenerator233CreationTool());
		paletteContainer.add(createConnectionsPlc234CreationTool());
		paletteContainer.add(createConnectionsNode235CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClimate1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Climate1CreationTool_title,
				visGrid.diagram.part.Messages.Climate1CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Climate_2001));
		entry.setId("createClimate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Climate_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClimateConnection2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ClimateConnection2CreationTool_title,
				visGrid.diagram.part.Messages.ClimateConnection2CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Meter_2002));
		entry.setId("createClimateConnection2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Meter_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCsv_reader3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Csv_reader3CreationTool_title,
				visGrid.diagram.part.Messages.Csv_reader3CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2003));
		entry.setId("createCsv_reader3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCsv_readerConnection4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Csv_readerConnection4CreationTool_title,
				visGrid.diagram.part.Messages.Csv_readerConnection4CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2004));
		entry.setId("createCsv_readerConnection4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiesel_dg5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Diesel_dg5CreationTool_title,
				visGrid.diagram.part.Messages.Diesel_dg5CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_2005));
		entry.setId("createDiesel_dg5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDiesel_dgConnection6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Diesel_dgConnection6CreationTool_title,
				visGrid.diagram.part.Messages.Diesel_dgConnection6CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller_2006));
		entry.setId("createDiesel_dgConnection6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnergy_storage7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Energy_storage7CreationTool_title,
				visGrid.diagram.part.Messages.Energy_storage7CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Node_2007));
		entry.setId("createEnergy_storage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Node_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnergy_storageConnection8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Energy_storageConnection8CreationTool_title,
				visGrid.diagram.part.Messages.Energy_storageConnection8CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2008));
		entry.setId("createEnergy_storageConnection8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInverter9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Inverter9CreationTool_title,
				visGrid.diagram.part.Messages.Inverter9CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Relay_2009));
		entry.setId("createInverter9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Relay_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInverterConnection10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.InverterConnection10CreationTool_title,
				visGrid.diagram.part.Messages.InverterConnection10CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2010));
		entry.setId("createInverterConnection10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDc_dc_converter11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Dc_dc_converter11CreationTool_title,
				visGrid.diagram.part.Messages.Dc_dc_converter11CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Pqload_2011));
		entry.setId("createDc_dc_converter11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Pqload_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDc_dc_converterConnection12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Dc_dc_converterConnection12CreationTool_title,
				visGrid.diagram.part.Messages.Dc_dc_converterConnection12CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_2012));
		entry.setId("createDc_dc_converterConnection12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAuction13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Auction13CreationTool_title,
				visGrid.diagram.part.Messages.Auction13CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2013));
		entry.setId("createAuction13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAuctionConnection14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.AuctionConnection14CreationTool_title,
				visGrid.diagram.part.Messages.AuctionConnection14CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2014));
		entry.setId("createAuctionConnection14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller15CreationTool_title,
				visGrid.diagram.part.Messages.Controller15CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller2_2015));
		entry.setId("createController15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller2_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControllerConnection16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ControllerConnection16CreationTool_title,
				visGrid.diagram.part.Messages.ControllerConnection16CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Billdump_2016));
		entry.setId("createControllerConnection16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Billdump_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController217CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller217CreationTool_title,
				visGrid.diagram.part.Messages.Controller217CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capbank_2017));
		entry.setId("createController217CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capbank_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createController2Connection18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Controller2Connection18CreationTool_title,
				visGrid.diagram.part.Messages.Controller2Connection18CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Player_2018));
		entry.setId("createController2Connection18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Player_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapbank19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Capbank19CreationTool_title,
				visGrid.diagram.part.Messages.Capbank19CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2019));
		entry.setId("createCapbank19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapbankConnection20CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.CapbankConnection20CreationTool_title,
				visGrid.diagram.part.Messages.CapbankConnection20CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2020));
		entry.setId("createCapbankConnection20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComm21CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Comm21CreationTool_title,
				visGrid.diagram.part.Messages.Comm21CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_2021));
		entry.setId("createComm21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommConnection22CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.CommConnection22CreationTool_title,
				visGrid.diagram.part.Messages.CommConnection22CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Range_2022));
		entry.setId("createCommConnection22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Range_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapacitor23CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Capacitor23CreationTool_title,
				visGrid.diagram.part.Messages.Capacitor23CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2023));
		entry.setId("createCapacitor23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapacitorConnection24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.CapacitorConnection24CreationTool_title,
				visGrid.diagram.part.Messages.CapacitorConnection24CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2024));
		entry.setId("createCapacitorConnection24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine25CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line25CreationTool_title,
				visGrid.diagram.part.Messages.Line25CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Auction_2025));
		entry.setId("createLine25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Auction_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLineConnection26CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.LineConnection26CreationTool_title,
				visGrid.diagram.part.Messages.LineConnection26CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Solar_2026));
		entry.setId("createLineConnection26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Solar_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_spacing27CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_spacing27CreationTool_title,
				visGrid.diagram.part.Messages.Line_spacing27CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Multizone_2027));
		entry.setId("createLine_spacing27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Multizone_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_spacingConnection28CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_spacingConnection28CreationTool_title,
				visGrid.diagram.part.Messages.Line_spacingConnection28CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2028));
		entry.setId("createLine_spacingConnection28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line29CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line29CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line29CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2029));
		entry.setId("createOverhead_line29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_lineConnection30CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_lineConnection30CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_lineConnection30CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2030));
		entry.setId("createOverhead_lineConnection30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line31CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line31CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line31CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plugload_2031));
		entry.setId("createUnderground_line31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plugload_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_lineConnection32CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_lineConnection32CreationTool_title,
				visGrid.diagram.part.Messages.Underground_lineConnection32CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Link_2032));
		entry.setId("createUnderground_lineConnection32CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Link_2032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line_conductor33CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line_conductor33CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line_conductor33CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2033));
		entry.setId("createOverhead_line_conductor33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOverhead_line_conductorConnection34CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Overhead_line_conductorConnection34CreationTool_title,
				visGrid.diagram.part.Messages.Overhead_line_conductorConnection34CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2034));
		entry.setId("createOverhead_line_conductorConnection34CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line_conductor35CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line_conductor35CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line_conductor35CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_2035));
		entry.setId("createUnderground_line_conductor35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnderground_line_conductorConnection36CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Underground_line_conductorConnection36CreationTool_title,
				visGrid.diagram.part.Messages.Underground_line_conductorConnection36CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2036));
		entry.setId("createUnderground_line_conductorConnection36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_configuration37CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_configuration37CreationTool_title,
				visGrid.diagram.part.Messages.Line_configuration37CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2037));
		entry.setId("createLine_configuration37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine_configurationConnection38CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Line_configurationConnection38CreationTool_title,
				visGrid.diagram.part.Messages.Line_configurationConnection38CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_a_2038));
		entry.setId("createLine_configurationConnection38CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_a_2038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer_configuration39CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Transformer_configuration39CreationTool_title,
				visGrid.diagram.part.Messages.Transformer_configuration39CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Lights_2039));
		entry.setId("createTransformer_configuration39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Lights_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer_configurationConnection40CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Transformer_configurationConnection40CreationTool_title,
				visGrid.diagram.part.Messages.Transformer_configurationConnection40CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040));
		entry.setId("createTransformer_configurationConnection40CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoad41CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Load41CreationTool_title,
				visGrid.diagram.part.Messages.Load41CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2041));
		entry.setId("createLoad41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoadConnection42CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.LoadConnection42CreationTool_title,
				visGrid.diagram.part.Messages.LoadConnection42CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042));
		entry.setId("createLoadConnection42CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator_configuration43CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Regulator_configuration43CreationTool_title,
				visGrid.diagram.part.Messages.Regulator_configuration43CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Load_2043));
		entry.setId("createRegulator_configuration43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Load_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator_configurationConnection44CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Regulator_configurationConnection44CreationTool_title,
				visGrid.diagram.part.Messages.Regulator_configurationConnection44CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Weather_2044));
		entry.setId("createRegulator_configurationConnection44CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Weather_2044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_node45CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_node45CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_node45CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Inverter_2045));
		entry.setId("createTriplex_node45CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Inverter_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_nodeConnection46CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_nodeConnection46CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_nodeConnection46CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2046));
		entry.setId("createTriplex_nodeConnection46CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meter47CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_meter47CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_meter47CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2047));
		entry.setId("createTriplex_meter47CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meterConnection48CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_meterConnection48CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_meterConnection48CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Substation_2048));
		entry.setId("createTriplex_meterConnection48CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Substation_2048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line49CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line49CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line49CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2049));
		entry.setId("createTriplex_line49CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_lineConnection50CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_lineConnection50CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_lineConnection50CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2050));
		entry.setId("createTriplex_lineConnection50CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_configuration51CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_configuration51CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_configuration51CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2051));
		entry.setId("createTriplex_line_configuration51CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_configurationConnection52CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_configurationConnection52CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_configurationConnection52CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2052));
		entry.setId("createTriplex_line_configurationConnection52CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_conductor53CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_conductor53CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_conductor53CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Collector_2053));
		entry.setId("createTriplex_line_conductor53CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Collector_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line_conductorConnection54CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Triplex_line_conductorConnection54CreationTool_title,
				visGrid.diagram.part.Messages.Triplex_line_conductorConnection54CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Office_2054));
		entry.setId("createTriplex_line_conductorConnection54CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Office_2054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch55CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Switch55CreationTool_title,
				visGrid.diagram.part.Messages.Switch55CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microwave_2055));
		entry.setId("createSwitch55CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microwave_2055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchConnection56CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.SwitchConnection56CreationTool_title,
				visGrid.diagram.part.Messages.SwitchConnection56CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Comm_2056));
		entry.setId("createSwitchConnection56CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Comm_2056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubstation57CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Substation57CreationTool_title,
				visGrid.diagram.part.Messages.Substation57CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2057));
		entry.setId("createSubstation57CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubstationConnection58CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.SubstationConnection58CreationTool_title,
				visGrid.diagram.part.Messages.SubstationConnection58CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Freezer_2058));
		entry.setId("createSubstationConnection58CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Freezer_2058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPqload59CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Pqload59CreationTool_title,
				visGrid.diagram.part.Messages.Pqload59CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2059));
		entry.setId("createPqload59CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPqloadConnection60CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.PqloadConnection60CreationTool_title,
				visGrid.diagram.part.Messages.PqloadConnection60CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dryer_2060));
		entry.setId("createPqloadConnection60CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dryer_2060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVoltdump61CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Voltdump61CreationTool_title,
				visGrid.diagram.part.Messages.Voltdump61CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plc_2061));
		entry.setId("createVoltdump61CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plc_2061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVoltdumpConnection62CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.VoltdumpConnection62CreationTool_title,
				visGrid.diagram.part.Messages.VoltdumpConnection62CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2062));
		entry.setId("createVoltdumpConnection62CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSeries_reactor63CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Series_reactor63CreationTool_title,
				visGrid.diagram.part.Messages.Series_reactor63CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2063));
		entry.setId("createSeries_reactor63CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSeries_reactorConnection64CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Series_reactorConnection64CreationTool_title,
				visGrid.diagram.part.Messages.Series_reactorConnection64CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Recorder_2064));
		entry.setId("createSeries_reactorConnection64CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Recorder_2064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRestoration65CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Restoration65CreationTool_title,
				visGrid.diagram.part.Messages.Restoration65CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2065));
		entry.setId("createRestoration65CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRestorationConnection66CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.RestorationConnection66CreationTool_title,
				visGrid.diagram.part.Messages.RestorationConnection66CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fuse_2066));
		entry.setId("createRestorationConnection66CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fuse_2066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFrequency_gen67CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Frequency_gen67CreationTool_title,
				visGrid.diagram.part.Messages.Frequency_gen67CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2067));
		entry.setId("createFrequency_gen67CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFrequency_genConnection68CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Frequency_genConnection68CreationTool_title,
				visGrid.diagram.part.Messages.Frequency_genConnection68CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2068));
		entry.setId("createFrequency_genConnection68CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVolt_var_control69CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Volt_var_control69CreationTool_title,
				visGrid.diagram.part.Messages.Volt_var_control69CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Battery_2069));
		entry.setId("createVolt_var_control69CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Battery_2069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVolt_var_controlConnection70CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Volt_var_controlConnection70CreationTool_title,
				visGrid.diagram.part.Messages.Volt_var_controlConnection70CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2070));
		entry.setId("createVolt_var_controlConnection70CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFault_check71CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Fault_check71CreationTool_title,
				visGrid.diagram.part.Messages.Fault_check71CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Switch_2071));
		entry.setId("createFault_check71CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Switch_2071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFault_checkConnection72CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Fault_checkConnection72CreationTool_title,
				visGrid.diagram.part.Messages.Fault_checkConnection72CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072));
		entry.setId("createFault_checkConnection72CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMotor73CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Motor73CreationTool_title,
				visGrid.diagram.part.Messages.Motor73CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Histogram_2073));
		entry.setId("createMotor73CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Histogram_2073));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMotorConnection74CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.MotorConnection74CreationTool_title,
				visGrid.diagram.part.Messages.MotorConnection74CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Shaper_2074));
		entry.setId("createMotorConnection74CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Shaper_2074));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBilldump75CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Billdump75CreationTool_title,
				visGrid.diagram.part.Messages.Billdump75CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Generator_2075));
		entry.setId("createBilldump75CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Generator_2075));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBilldumpConnection76CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.BilldumpConnection76CreationTool_title,
				visGrid.diagram.part.Messages.BilldumpConnection76CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2076));
		entry.setId("createBilldumpConnection76CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2076));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResidential_enduse77CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Residential_enduse77CreationTool_title,
				visGrid.diagram.part.Messages.Residential_enduse77CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Connections_2077));
		entry.setId("createResidential_enduse77CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Connections_2077));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResidential_enduseConnection78CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.Residential_enduseConnection78CreationTool_title,
				visGrid.diagram.part.Messages.Residential_enduseConnection78CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Motor_2078));
		entry.setId("createResidential_enduseConnection78CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Motor_2078));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse_a79CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.House_a79CreationTool_title,
				visGrid.diagram.part.Messages.House_a79CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2079));
		entry.setId("createHouse_a79CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2079));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse_aConnection80CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.House_aConnection80CreationTool_title,
				visGrid.diagram.part.Messages.House_aConnection80CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001));
		entry.setId("createHouse_aConnection80CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse81CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.House81CreationTool_title,
				visGrid.diagram.part.Messages.House81CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002));
		entry.setId("createHouse81CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouseConnection82CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.HouseConnection82CreationTool_title,
				visGrid.diagram.part.Messages.HouseConnection82CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003));
		entry.setId("createHouseConnection82CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheater83CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Waterheater83CreationTool_title,
				visGrid.diagram.part.Messages.Waterheater83CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004));
		entry.setId("createWaterheater83CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheaterConnection84CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.WaterheaterConnection84CreationTool_title,
				visGrid.diagram.part.Messages.WaterheaterConnection84CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005));
		entry.setId("createWaterheaterConnection84CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLights85CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Lights85CreationTool_title,
				visGrid.diagram.part.Messages.Lights85CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006));
		entry.setId("createLights85CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLightsConnection86CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.LightsConnection86CreationTool_title,
				visGrid.diagram.part.Messages.LightsConnection86CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007));
		entry.setId("createLightsConnection86CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefrigerator87CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Refrigerator87CreationTool_title,
				visGrid.diagram.part.Messages.Refrigerator87CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008));
		entry.setId("createRefrigerator87CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefrigeratorConnection88CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.RefrigeratorConnection88CreationTool_title,
				visGrid.diagram.part.Messages.RefrigeratorConnection88CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009));
		entry.setId("createRefrigeratorConnection88CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClotheswasher89CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Clotheswasher89CreationTool_title,
				visGrid.diagram.part.Messages.Clotheswasher89CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010));
		entry.setId("createClotheswasher89CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClotheswasherConnection90CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ClotheswasherConnection90CreationTool_title,
				visGrid.diagram.part.Messages.ClotheswasherConnection90CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011));
		entry.setId("createClotheswasherConnection90CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDishwasher91CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Dishwasher91CreationTool_title,
				visGrid.diagram.part.Messages.Dishwasher91CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012));
		entry.setId("createDishwasher91CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDishwasherConnection92CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.DishwasherConnection92CreationTool_title,
				visGrid.diagram.part.Messages.DishwasherConnection92CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013));
		entry.setId("createDishwasherConnection92CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupantload93CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Occupantload93CreationTool_title,
				visGrid.diagram.part.Messages.Occupantload93CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014));
		entry.setId("createOccupantload93CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupantloadConnection94CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.OccupantloadConnection94CreationTool_title,
				visGrid.diagram.part.Messages.OccupantloadConnection94CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015));
		entry.setId("createOccupantloadConnection94CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlugload95CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Plugload95CreationTool_title,
				visGrid.diagram.part.Messages.Plugload95CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016));
		entry.setId("createPlugload95CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlugloadConnection96CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.PlugloadConnection96CreationTool_title,
				visGrid.diagram.part.Messages.PlugloadConnection96CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017));
		entry.setId("createPlugloadConnection96CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicrowave97CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Microwave97CreationTool_title,
				visGrid.diagram.part.Messages.Microwave97CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018));
		entry.setId("createMicrowave97CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicrowaveConnection98CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.MicrowaveConnection98CreationTool_title,
				visGrid.diagram.part.Messages.MicrowaveConnection98CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019));
		entry.setId("createMicrowaveConnection98CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRange99CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Range99CreationTool_title,
				visGrid.diagram.part.Messages.Range99CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020));
		entry.setId("createRange99CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRangeConnection100CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.RangeConnection100CreationTool_title,
				visGrid.diagram.part.Messages.RangeConnection100CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021));
		entry.setId("createRangeConnection100CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreezer101CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Freezer101CreationTool_title,
				visGrid.diagram.part.Messages.Freezer101CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022));
		entry.setId("createFreezer101CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreezerConnection102CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.FreezerConnection102CreationTool_title,
				visGrid.diagram.part.Messages.FreezerConnection102CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023));
		entry.setId("createFreezerConnection102CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDryer103CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Dryer103CreationTool_title,
				visGrid.diagram.part.Messages.Dryer103CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024));
		entry.setId("createDryer103CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDryerConnection104CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.DryerConnection104CreationTool_title,
				visGrid.diagram.part.Messages.DryerConnection104CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025));
		entry.setId("createDryerConnection104CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvcharger105CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Evcharger105CreationTool_title,
				visGrid.diagram.part.Messages.Evcharger105CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026));
		entry.setId("createEvcharger105CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvchargerConnection106CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.EvchargerConnection106CreationTool_title,
				visGrid.diagram.part.Messages.EvchargerConnection106CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027));
		entry.setId("createEvchargerConnection106CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createZIPload107CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ZIPload107CreationTool_title,
				visGrid.diagram.part.Messages.ZIPload107CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028));
		entry.setId("createZIPload107CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createZIPloadConnection108CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ZIPloadConnection108CreationTool_title,
				visGrid.diagram.part.Messages.ZIPloadConnection108CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029));
		entry.setId("createZIPloadConnection108CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayer109CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Player109CreationTool_title,
				visGrid.diagram.part.Messages.Player109CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030));
		entry.setId("createPlayer109CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayerConnection110CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.PlayerConnection110CreationTool_title,
				visGrid.diagram.part.Messages.PlayerConnection110CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031));
		entry.setId("createPlayerConnection110CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShaper111CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Shaper111CreationTool_title,
				visGrid.diagram.part.Messages.Shaper111CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032));
		entry.setId("createShaper111CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShaperConnection112CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ShaperConnection112CreationTool_title,
				visGrid.diagram.part.Messages.ShaperConnection112CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033));
		entry.setId("createShaperConnection112CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecorder113CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Recorder113CreationTool_title,
				visGrid.diagram.part.Messages.Recorder113CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034));
		entry.setId("createRecorder113CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecorderConnection114CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.RecorderConnection114CreationTool_title,
				visGrid.diagram.part.Messages.RecorderConnection114CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035));
		entry.setId("createRecorderConnection114CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollector115CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Collector115CreationTool_title,
				visGrid.diagram.part.Messages.Collector115CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036));
		entry.setId("createCollector115CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollectorConnection116CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.CollectorConnection116CreationTool_title,
				visGrid.diagram.part.Messages.CollectorConnection116CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037));
		entry.setId("createCollectorConnection116CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistogram117CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Histogram117CreationTool_title,
				visGrid.diagram.part.Messages.Histogram117CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038));
		entry.setId("createHistogram117CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistogramConnection118CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.HistogramConnection118CreationTool_title,
				visGrid.diagram.part.Messages.HistogramConnection118CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039));
		entry.setId("createHistogramConnection118CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeather119CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Weather119CreationTool_title,
				visGrid.diagram.part.Messages.Weather119CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040));
		entry.setId("createWeather119CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeatherConnection120CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.WeatherConnection120CreationTool_title,
				visGrid.diagram.part.Messages.WeatherConnection120CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041));
		entry.setId("createWeatherConnection120CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOffice121CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Office121CreationTool_title,
				visGrid.diagram.part.Messages.Office121CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042));
		entry.setId("createOffice121CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOfficeConnection122CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.OfficeConnection122CreationTool_title,
				visGrid.diagram.part.Messages.OfficeConnection122CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043));
		entry.setId("createOfficeConnection122CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultizone123CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Multizone123CreationTool_title,
				visGrid.diagram.part.Messages.Multizone123CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044));
		entry.setId("createMultizone123CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultizoneConnection124CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.MultizoneConnection124CreationTool_title,
				visGrid.diagram.part.Messages.MultizoneConnection124CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045));
		entry.setId("createMultizoneConnection124CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindturb_dg125CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Windturb_dg125CreationTool_title,
				visGrid.diagram.part.Messages.Windturb_dg125CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046));
		entry.setId("createWindturb_dg125CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindturb_dgConnection126CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Windturb_dgConnection126CreationTool_title,
				visGrid.diagram.part.Messages.Windturb_dgConnection126CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047));
		entry.setId("createWindturb_dgConnection126CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPower_electronics127CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Power_electronics127CreationTool_title,
				visGrid.diagram.part.Messages.Power_electronics127CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048));
		entry.setId("createPower_electronics127CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPower_electronicsConnection128CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Power_electronicsConnection128CreationTool_title,
				visGrid.diagram.part.Messages.Power_electronicsConnection128CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049));
		entry.setId("createPower_electronicsConnection128CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectifier129CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Rectifier129CreationTool_title,
				visGrid.diagram.part.Messages.Rectifier129CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050));
		entry.setId("createRectifier129CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectifierConnection130CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.RectifierConnection130CreationTool_title,
				visGrid.diagram.part.Messages.RectifierConnection130CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051));
		entry.setId("createRectifierConnection130CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicroturbine131CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Microturbine131CreationTool_title,
				visGrid.diagram.part.Messages.Microturbine131CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052));
		entry.setId("createMicroturbine131CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicroturbineConnection132CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.MicroturbineConnection132CreationTool_title,
				visGrid.diagram.part.Messages.MicroturbineConnection132CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053));
		entry.setId("createMicroturbineConnection132CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBattery133CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Battery133CreationTool_title,
				visGrid.diagram.part.Messages.Battery133CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054));
		entry.setId("createBattery133CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBatteryConnection134CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.BatteryConnection134CreationTool_title,
				visGrid.diagram.part.Messages.BatteryConnection134CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055));
		entry.setId("createBatteryConnection134CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolar135CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Solar135CreationTool_title,
				visGrid.diagram.part.Messages.Solar135CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056));
		entry.setId("createSolar135CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolarConnection136CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.SolarConnection136CreationTool_title,
				visGrid.diagram.part.Messages.SolarConnection136CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057));
		entry.setId("createSolarConnection136CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStubauction137CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Stubauction137CreationTool_title,
				visGrid.diagram.part.Messages.Stubauction137CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058));
		entry.setId("createStubauction137CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStubauctionConnection138CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.StubauctionConnection138CreationTool_title,
				visGrid.diagram.part.Messages.StubauctionConnection138CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059));
		entry.setId("createStubauctionConnection138CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink139CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Link139CreationTool_title,
				visGrid.diagram.part.Messages.Link139CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060));
		entry.setId("createLink139CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkConnection140CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.LinkConnection140CreationTool_title,
				visGrid.diagram.part.Messages.LinkConnection140CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061));
		entry.setId("createLinkConnection140CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFuse141CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Fuse141CreationTool_title,
				visGrid.diagram.part.Messages.Fuse141CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062));
		entry.setId("createFuse141CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFuseConnection142CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.FuseConnection142CreationTool_title,
				visGrid.diagram.part.Messages.FuseConnection142CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063));
		entry.setId("createFuseConnection142CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelay143CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Relay143CreationTool_title,
				visGrid.diagram.part.Messages.Relay143CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064));
		entry.setId("createRelay143CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelayConnection144CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.RelayConnection144CreationTool_title,
				visGrid.diagram.part.Messages.RelayConnection144CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065));
		entry.setId("createRelayConnection144CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator145CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Regulator145CreationTool_title,
				visGrid.diagram.part.Messages.Regulator145CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066));
		entry.setId("createRegulator145CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulatorConnection146CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.RegulatorConnection146CreationTool_title,
				visGrid.diagram.part.Messages.RegulatorConnection146CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067));
		entry.setId("createRegulatorConnection146CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer147CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Transformer147CreationTool_title,
				visGrid.diagram.part.Messages.Transformer147CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068));
		entry.setId("createTransformer147CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformerConnection148CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.TransformerConnection148CreationTool_title,
				visGrid.diagram.part.Messages.TransformerConnection148CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069));
		entry.setId("createTransformerConnection148CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeter149CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Meter149CreationTool_title,
				visGrid.diagram.part.Messages.Meter149CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070));
		entry.setId("createMeter149CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeterConnection150CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.MeterConnection150CreationTool_title,
				visGrid.diagram.part.Messages.MeterConnection150CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071));
		entry.setId("createMeterConnection150CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerator151CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Generator151CreationTool_title,
				visGrid.diagram.part.Messages.Generator151CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072));
		entry.setId("createGenerator151CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneratorConnection152CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.GeneratorConnection152CreationTool_title,
				visGrid.diagram.part.Messages.GeneratorConnection152CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073));
		entry.setId("createGeneratorConnection152CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlc153CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Plc153CreationTool_title,
				visGrid.diagram.part.Messages.Plc153CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074));
		entry.setId("createPlc153CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlcConnection154CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.PlcConnection154CreationTool_title,
				visGrid.diagram.part.Messages.PlcConnection154CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075));
		entry.setId("createPlcConnection154CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode155CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Node155CreationTool_title,
				visGrid.diagram.part.Messages.Node155CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076));
		entry.setId("createNode155CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodeConnection156CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.NodeConnection156CreationTool_title,
				visGrid.diagram.part.Messages.NodeConnection156CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077));
		entry.setId("createNodeConnection156CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnections157CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.Connections157CreationTool_title,
				visGrid.diagram.part.Messages.Connections157CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078));
		entry.setId("createConnections157CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsCsv_reader158CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsCsv_reader158CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsCsv_reader158CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079));
		entry.setId("createConnectionsCsv_reader158CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsDiesel_dg159CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsDiesel_dg159CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsDiesel_dg159CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080));
		entry.setId("createConnectionsDiesel_dg159CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsEnergy_storage160CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsEnergy_storage160CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsEnergy_storage160CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081));
		entry.setId("createConnectionsEnergy_storage160CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsInverter161CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsInverter161CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsInverter161CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082));
		entry.setId("createConnectionsInverter161CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsDc_dc_converter162CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsDc_dc_converter162CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsDc_dc_converter162CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083));
		entry.setId("createConnectionsDc_dc_converter162CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsBattery163CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsBattery163CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsBattery163CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084));
		entry.setId("createConnectionsBattery163CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsAuction164CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsAuction164CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsAuction164CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085));
		entry.setId("createConnectionsAuction164CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsController165CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsController165CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsController165CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086));
		entry.setId("createConnectionsController165CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsController2166CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsController2166CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsController2166CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087));
		entry.setId("createConnectionsController2166CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsCapbank167CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsCapbank167CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsCapbank167CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088));
		entry.setId("createConnectionsCapbank167CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsComm168CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsComm168CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsComm168CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089));
		entry.setId("createConnectionsComm168CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsCapacitor169CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsCapacitor169CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsCapacitor169CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090));
		entry.setId("createConnectionsCapacitor169CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsLine170CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsLine170CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsLine170CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091));
		entry.setId("createConnectionsLine170CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsLine_spacing171CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsLine_spacing171CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsLine_spacing171CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092));
		entry.setId("createConnectionsLine_spacing171CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsOverhead_line172CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsOverhead_line172CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsOverhead_line172CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093));
		entry.setId("createConnectionsOverhead_line172CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsUnderground_line173CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsUnderground_line173CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsUnderground_line173CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094));
		entry.setId("createConnectionsUnderground_line173CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsOverhead_line_conductor174CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsOverhead_line_conductor174CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsOverhead_line_conductor174CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095));
		entry.setId("createConnectionsOverhead_line_conductor174CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsUnderground_line_conductor175CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsUnderground_line_conductor175CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsUnderground_line_conductor175CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096));
		entry.setId("createConnectionsUnderground_line_conductor175CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsLine_configuration176CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsLine_configuration176CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsLine_configuration176CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097));
		entry.setId("createConnectionsLine_configuration176CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTransformer_configuration177CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTransformer_configuration177CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTransformer_configuration177CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098));
		entry.setId("createConnectionsTransformer_configuration177CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsLoad178CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsLoad178CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsLoad178CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099));
		entry.setId("createConnectionsLoad178CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRegulator_configuration179CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRegulator_configuration179CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRegulator_configuration179CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100));
		entry.setId("createConnectionsRegulator_configuration179CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTriplex_node180CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTriplex_node180CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTriplex_node180CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101));
		entry.setId("createConnectionsTriplex_node180CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTriplex_meter181CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTriplex_meter181CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTriplex_meter181CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102));
		entry.setId("createConnectionsTriplex_meter181CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTriplex_line182CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTriplex_line182CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTriplex_line182CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103));
		entry.setId("createConnectionsTriplex_line182CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTriplex_line_configuration183CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTriplex_line_configuration183CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTriplex_line_configuration183CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104));
		entry.setId("createConnectionsTriplex_line_configuration183CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTriplex_line_conductor184CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTriplex_line_conductor184CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTriplex_line_conductor184CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105));
		entry.setId("createConnectionsTriplex_line_conductor184CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsSwitch185CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsSwitch185CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsSwitch185CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106));
		entry.setId("createConnectionsSwitch185CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsSubstation186CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsSubstation186CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsSubstation186CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107));
		entry.setId("createConnectionsSubstation186CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsPqload187CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsPqload187CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsPqload187CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108));
		entry.setId("createConnectionsPqload187CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsVoltdump188CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsVoltdump188CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsVoltdump188CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109));
		entry.setId("createConnectionsVoltdump188CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsSeries_reactor189CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsSeries_reactor189CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsSeries_reactor189CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110));
		entry.setId("createConnectionsSeries_reactor189CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRestoration190CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRestoration190CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRestoration190CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111));
		entry.setId("createConnectionsRestoration190CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsFrequency_gen191CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsFrequency_gen191CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsFrequency_gen191CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112));
		entry.setId("createConnectionsFrequency_gen191CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsVolt_var_control192CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsVolt_var_control192CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsVolt_var_control192CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113));
		entry.setId("createConnectionsVolt_var_control192CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsFault_check193CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsFault_check193CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsFault_check193CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114));
		entry.setId("createConnectionsFault_check193CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsMotor194CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsMotor194CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsMotor194CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115));
		entry.setId("createConnectionsMotor194CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsBilldump195CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsBilldump195CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsBilldump195CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116));
		entry.setId("createConnectionsBilldump195CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsResidential_enduse196CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsResidential_enduse196CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsResidential_enduse196CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117));
		entry.setId("createConnectionsResidential_enduse196CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsHouse_a197CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsHouse_a197CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsHouse_a197CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118));
		entry.setId("createConnectionsHouse_a197CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsHouse198CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsHouse198CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsHouse198CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119));
		entry.setId("createConnectionsHouse198CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsWaterheater199CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsWaterheater199CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsWaterheater199CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120));
		entry.setId("createConnectionsWaterheater199CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsLights200CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsLights200CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsLights200CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121));
		entry.setId("createConnectionsLights200CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRefrigerator201CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRefrigerator201CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRefrigerator201CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122));
		entry.setId("createConnectionsRefrigerator201CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsClotheswasher202CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsClotheswasher202CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsClotheswasher202CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123));
		entry.setId("createConnectionsClotheswasher202CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsDishwasher203CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsDishwasher203CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsDishwasher203CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124));
		entry.setId("createConnectionsDishwasher203CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsOccupantload204CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsOccupantload204CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsOccupantload204CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125));
		entry.setId("createConnectionsOccupantload204CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsPlugload205CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsPlugload205CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsPlugload205CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126));
		entry.setId("createConnectionsPlugload205CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsMicrowave206CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsMicrowave206CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsMicrowave206CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127));
		entry.setId("createConnectionsMicrowave206CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRange207CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRange207CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRange207CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128));
		entry.setId("createConnectionsRange207CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsFreezer208CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsFreezer208CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsFreezer208CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129));
		entry.setId("createConnectionsFreezer208CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsDryer209CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsDryer209CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsDryer209CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130));
		entry.setId("createConnectionsDryer209CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsEvcharger210CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsEvcharger210CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsEvcharger210CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131));
		entry.setId("createConnectionsEvcharger210CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsZIPload211CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsZIPload211CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsZIPload211CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132));
		entry.setId("createConnectionsZIPload211CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsPlayer212CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsPlayer212CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsPlayer212CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133));
		entry.setId("createConnectionsPlayer212CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsShaper213CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsShaper213CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsShaper213CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134));
		entry.setId("createConnectionsShaper213CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRecorder214CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRecorder214CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRecorder214CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135));
		entry.setId("createConnectionsRecorder214CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsCollector215CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsCollector215CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsCollector215CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136));
		entry.setId("createConnectionsCollector215CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsHistogram216CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsHistogram216CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsHistogram216CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137));
		entry.setId("createConnectionsHistogram216CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsClimate217CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsClimate217CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsClimate217CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138));
		entry.setId("createConnectionsClimate217CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsWeather218CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsWeather218CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsWeather218CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139));
		entry.setId("createConnectionsWeather218CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsOffice219CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsOffice219CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsOffice219CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140));
		entry.setId("createConnectionsOffice219CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsMultizone220CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsMultizone220CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsMultizone220CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141));
		entry.setId("createConnectionsMultizone220CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsWindturb_dg221CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsWindturb_dg221CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsWindturb_dg221CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142));
		entry.setId("createConnectionsWindturb_dg221CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsPower_electronics222CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsPower_electronics222CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsPower_electronics222CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143));
		entry.setId("createConnectionsPower_electronics222CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRectifier223CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRectifier223CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRectifier223CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144));
		entry.setId("createConnectionsRectifier223CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsMicroturbine224CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsMicroturbine224CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsMicroturbine224CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145));
		entry.setId("createConnectionsMicroturbine224CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsSolar225CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsSolar225CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsSolar225CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146));
		entry.setId("createConnectionsSolar225CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsStubauction226CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsStubauction226CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsStubauction226CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147));
		entry.setId("createConnectionsStubauction226CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsLink227CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsLink227CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsLink227CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148));
		entry.setId("createConnectionsLink227CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsFuse228CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsFuse228CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsFuse228CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149));
		entry.setId("createConnectionsFuse228CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRelay229CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRelay229CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRelay229CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150));
		entry.setId("createConnectionsRelay229CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsRegulator230CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsRegulator230CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsRegulator230CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151));
		entry.setId("createConnectionsRegulator230CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsTransformer231CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsTransformer231CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsTransformer231CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152));
		entry.setId("createConnectionsTransformer231CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsMeter232CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsMeter232CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsMeter232CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153));
		entry.setId("createConnectionsMeter232CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsGenerator233CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsGenerator233CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsGenerator233CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154));
		entry.setId("createConnectionsGenerator233CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsPlc234CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsPlc234CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsPlc234CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155));
		entry.setId("createConnectionsPlc234CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionsNode235CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.ConnectionsNode235CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionsNode235CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156));
		entry.setId("createConnectionsNode235CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
