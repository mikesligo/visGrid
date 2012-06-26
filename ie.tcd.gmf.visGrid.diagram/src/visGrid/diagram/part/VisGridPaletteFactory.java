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
		paletteContainer.add(createConnectionConnections2CreationTool());
		paletteContainer.add(createCsv_reader3CreationTool());
		paletteContainer.add(createConnectionConnections24CreationTool());
		paletteContainer.add(createDiesel_dg5CreationTool());
		paletteContainer.add(createConnectionConnections36CreationTool());
		paletteContainer.add(createEnergy_storage7CreationTool());
		paletteContainer.add(createConnectionConnections48CreationTool());
		paletteContainer.add(createInverter9CreationTool());
		paletteContainer.add(createConnectionConnections510CreationTool());
		paletteContainer.add(createDc_dc_converter11CreationTool());
		paletteContainer.add(createConnectionConnections612CreationTool());
		paletteContainer.add(createAuction13CreationTool());
		paletteContainer.add(createConnectionConnections714CreationTool());
		paletteContainer.add(createController15CreationTool());
		paletteContainer.add(createConnectionConnections816CreationTool());
		paletteContainer.add(createController217CreationTool());
		paletteContainer.add(createConnectionConnections918CreationTool());
		paletteContainer.add(createCapbank19CreationTool());
		paletteContainer.add(createConnectionConnections1020CreationTool());
		paletteContainer.add(createComm21CreationTool());
		paletteContainer.add(createConnectionConnections1122CreationTool());
		paletteContainer.add(createCapacitor23CreationTool());
		paletteContainer.add(createConnectionConnections1224CreationTool());
		paletteContainer.add(createLine25CreationTool());
		paletteContainer.add(createConnectionConnections1326CreationTool());
		paletteContainer.add(createLine_spacing27CreationTool());
		paletteContainer.add(createConnectionConnections1428CreationTool());
		paletteContainer.add(createOverhead_line29CreationTool());
		paletteContainer.add(createConnectionConnections1530CreationTool());
		paletteContainer.add(createUnderground_line31CreationTool());
		paletteContainer.add(createConnectionConnections1632CreationTool());
		paletteContainer.add(createOverhead_line_conductor33CreationTool());
		paletteContainer.add(createConnectionConnections1734CreationTool());
		paletteContainer.add(createUnderground_line_conductor35CreationTool());
		paletteContainer.add(createConnectionConnections1836CreationTool());
		paletteContainer.add(createLine_configuration37CreationTool());
		paletteContainer.add(createConnectionConnections1938CreationTool());
		paletteContainer.add(createTransformer_configuration39CreationTool());
		paletteContainer.add(createConnectionConnections2040CreationTool());
		paletteContainer.add(createLoad41CreationTool());
		paletteContainer.add(createConnectionConnections2142CreationTool());
		paletteContainer.add(createRegulator_configuration43CreationTool());
		paletteContainer.add(createConnectionConnections2244CreationTool());
		paletteContainer.add(createTriplex_node45CreationTool());
		paletteContainer.add(createConnectionConnections2346CreationTool());
		paletteContainer.add(createTriplex_meter47CreationTool());
		paletteContainer.add(createConnectionConnections2448CreationTool());
		paletteContainer.add(createTriplex_line49CreationTool());
		paletteContainer.add(createConnectionConnections2550CreationTool());
		paletteContainer.add(createTriplex_line_configuration51CreationTool());
		paletteContainer.add(createConnectionConnections2652CreationTool());
		paletteContainer.add(createTriplex_line_conductor53CreationTool());
		paletteContainer.add(createConnectionConnections2754CreationTool());
		paletteContainer.add(createSwitch55CreationTool());
		paletteContainer.add(createConnectionConnections2856CreationTool());
		paletteContainer.add(createSubstation57CreationTool());
		paletteContainer.add(createConnectionConnections2958CreationTool());
		paletteContainer.add(createPqload59CreationTool());
		paletteContainer.add(createConnectionConnections3060CreationTool());
		paletteContainer.add(createVoltdump61CreationTool());
		paletteContainer.add(createConnectionConnections3162CreationTool());
		paletteContainer.add(createSeries_reactor63CreationTool());
		paletteContainer.add(createConnectionConnections3264CreationTool());
		paletteContainer.add(createRestoration65CreationTool());
		paletteContainer.add(createConnectionConnections3366CreationTool());
		paletteContainer.add(createFrequency_gen67CreationTool());
		paletteContainer.add(createConnectionConnections3468CreationTool());
		paletteContainer.add(createVolt_var_control69CreationTool());
		paletteContainer.add(createConnectionConnections3570CreationTool());
		paletteContainer.add(createFault_check71CreationTool());
		paletteContainer.add(createConnectionConnections3672CreationTool());
		paletteContainer.add(createMotor73CreationTool());
		paletteContainer.add(createConnectionConnections3774CreationTool());
		paletteContainer.add(createBilldump75CreationTool());
		paletteContainer.add(createConnectionConnections3876CreationTool());
		paletteContainer.add(createResidential_enduse77CreationTool());
		paletteContainer.add(createConnectionConnections3978CreationTool());
		paletteContainer.add(createHouse_a79CreationTool());
		paletteContainer.add(createConnectionConnections4080CreationTool());
		paletteContainer.add(createHouse81CreationTool());
		paletteContainer.add(createConnectionConnections4182CreationTool());
		paletteContainer.add(createWaterheater83CreationTool());
		paletteContainer.add(createConnectionConnections4284CreationTool());
		paletteContainer.add(createLights85CreationTool());
		paletteContainer.add(createConnectionConnections4386CreationTool());
		paletteContainer.add(createRefrigerator87CreationTool());
		paletteContainer.add(createConnectionConnections4488CreationTool());
		paletteContainer.add(createClotheswasher89CreationTool());
		paletteContainer.add(createConnectionConnections4590CreationTool());
		paletteContainer.add(createDishwasher91CreationTool());
		paletteContainer.add(createConnectionConnections4692CreationTool());
		paletteContainer.add(createOccupantload93CreationTool());
		paletteContainer.add(createConnectionConnections4794CreationTool());
		paletteContainer.add(createPlugload95CreationTool());
		paletteContainer.add(createConnectionConnections4896CreationTool());
		paletteContainer.add(createMicrowave97CreationTool());
		paletteContainer.add(createConnectionConnections4998CreationTool());
		paletteContainer.add(createRange99CreationTool());
		paletteContainer.add(createConnectionConnections50100CreationTool());
		paletteContainer.add(createFreezer101CreationTool());
		paletteContainer.add(createConnectionConnections51102CreationTool());
		paletteContainer.add(createDryer103CreationTool());
		paletteContainer.add(createConnectionConnections52104CreationTool());
		paletteContainer.add(createEvcharger105CreationTool());
		paletteContainer.add(createConnectionConnections53106CreationTool());
		paletteContainer.add(createZIPload107CreationTool());
		paletteContainer.add(createConnectionConnections54108CreationTool());
		paletteContainer.add(createPlayer109CreationTool());
		paletteContainer.add(createConnectionConnections55110CreationTool());
		paletteContainer.add(createShaper111CreationTool());
		paletteContainer.add(createConnectionConnections56112CreationTool());
		paletteContainer.add(createRecorder113CreationTool());
		paletteContainer.add(createConnectionConnections57114CreationTool());
		paletteContainer.add(createCollector115CreationTool());
		paletteContainer.add(createConnectionConnections58116CreationTool());
		paletteContainer.add(createHistogram117CreationTool());
		paletteContainer.add(createConnectionConnections59118CreationTool());
		paletteContainer.add(createWeather119CreationTool());
		paletteContainer.add(createConnectionConnections60120CreationTool());
		paletteContainer.add(createOffice121CreationTool());
		paletteContainer.add(createConnectionConnections61122CreationTool());
		paletteContainer.add(createMultizone123CreationTool());
		paletteContainer.add(createConnectionConnections62124CreationTool());
		paletteContainer.add(createWindturb_dg125CreationTool());
		paletteContainer.add(createConnectionConnections63126CreationTool());
		paletteContainer.add(createPower_electronics127CreationTool());
		paletteContainer.add(createConnectionConnections64128CreationTool());
		paletteContainer.add(createRectifier129CreationTool());
		paletteContainer.add(createConnectionConnections65130CreationTool());
		paletteContainer.add(createMicroturbine131CreationTool());
		paletteContainer.add(createConnectionConnections66132CreationTool());
		paletteContainer.add(createBattery133CreationTool());
		paletteContainer.add(createConnectionConnections67134CreationTool());
		paletteContainer.add(createSolar135CreationTool());
		paletteContainer.add(createConnectionConnections68136CreationTool());
		paletteContainer.add(createStubauction137CreationTool());
		paletteContainer.add(createConnectionConnections69138CreationTool());
		paletteContainer.add(createLink139CreationTool());
		paletteContainer.add(createConnectionConnections70140CreationTool());
		paletteContainer.add(createFuse141CreationTool());
		paletteContainer.add(createConnectionConnections71142CreationTool());
		paletteContainer.add(createRelay143CreationTool());
		paletteContainer.add(createConnectionConnections72144CreationTool());
		paletteContainer.add(createRegulator145CreationTool());
		paletteContainer.add(createConnectionConnections73146CreationTool());
		paletteContainer.add(createTransformer147CreationTool());
		paletteContainer.add(createConnectionConnections74148CreationTool());
		paletteContainer.add(createMeter149CreationTool());
		paletteContainer.add(createConnectionConnections75150CreationTool());
		paletteContainer.add(createGenerator151CreationTool());
		paletteContainer.add(createConnectionConnections76152CreationTool());
		paletteContainer.add(createPlc153CreationTool());
		paletteContainer.add(createConnectionConnections77154CreationTool());
		paletteContainer.add(createNode155CreationTool());
		paletteContainer.add(createConnectionConnections78156CreationTool());
		paletteContainer.add(createConnection157CreationTool());
		paletteContainer.add(createConnectionConnections79158CreationTool());
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2001));
		entry.setId("createClimate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2002));
		entry.setId("createConnectionConnections2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2002));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Link_2003));
		entry.setId("createCsv_reader3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Link_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections24CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections24CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections24CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_2004));
		entry.setId("createConnectionConnections24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_2004));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Recorder_2005));
		entry.setId("createDiesel_dg5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Recorder_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections36CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections36CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections36CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Restoration_2006));
		entry.setId("createConnectionConnections36CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Restoration_2006));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.House_a_2007));
		entry.setId("createEnergy_storage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.House_a_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections48CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections48CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections48CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2008));
		entry.setId("createConnectionConnections48CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2008));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2009));
		entry.setId("createInverter9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections510CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections510CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections510CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Battery_2010));
		entry.setId("createConnectionConnections510CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Battery_2010));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2011));
		entry.setId("createDc_dc_converter11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections612CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections612CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections612CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2012));
		entry.setId("createConnectionConnections612CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2012));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plugload_2013));
		entry.setId("createAuction13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plugload_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections714CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections714CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections714CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Lights_2014));
		entry.setId("createConnectionConnections714CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Lights_2014));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Pqload_2015));
		entry.setId("createController15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Pqload_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections816CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections816CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections816CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2016));
		entry.setId("createConnectionConnections816CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2016));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2017));
		entry.setId("createController217CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections918CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections918CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections918CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Office_2018));
		entry.setId("createConnectionConnections918CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Office_2018));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Load_2019));
		entry.setId("createCapbank19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Load_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1020CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1020CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1020CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2020));
		entry.setId("createConnectionConnections1020CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2020));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Histogram_2021));
		entry.setId("createComm21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Histogram_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1122CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1122CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1122CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2022));
		entry.setId("createConnectionConnections1122CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2022));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Auction_2023));
		entry.setId("createCapacitor23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Auction_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1224CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1224CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1224CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2024));
		entry.setId("createConnectionConnections1224CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2024));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2025));
		entry.setId("createLine25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1326CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1326CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1326CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Motor_2026));
		entry.setId("createConnectionConnections1326CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Motor_2026));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Shaper_2027));
		entry.setId("createLine_spacing27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Shaper_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1428CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1428CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1428CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2028));
		entry.setId("createConnectionConnections1428CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2028));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_2029));
		entry.setId("createOverhead_line29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1530CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1530CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1530CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Substation_2030));
		entry.setId("createConnectionConnections1530CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Substation_2030));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2031));
		entry.setId("createUnderground_line31CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1632CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1632CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1632CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2032));
		entry.setId("createConnectionConnections1632CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2032));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2033));
		entry.setId("createOverhead_line_conductor33CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1734CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1734CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1734CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller2_2034));
		entry.setId("createConnectionConnections1734CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller2_2034));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2035));
		entry.setId("createUnderground_line_conductor35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1836CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1836CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1836CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Weather_2036));
		entry.setId("createConnectionConnections1836CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Weather_2036));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Player_2037));
		entry.setId("createLine_configuration37CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Player_2037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections1938CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections1938CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections1938CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Climate_2038));
		entry.setId("createConnectionConnections1938CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Climate_2038));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dryer_2039));
		entry.setId("createTransformer_configuration39CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dryer_2039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2040CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2040CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2040CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Regulator_2040));
		entry.setId("createConnectionConnections2040CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Regulator_2040));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Node_2041));
		entry.setId("createLoad41CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Node_2041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2142CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2142CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2142CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2042));
		entry.setId("createConnectionConnections2142CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2042));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2043));
		entry.setId("createRegulator_configuration43CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2244CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2244CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2244CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Microwave_2044));
		entry.setId("createConnectionConnections2244CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Microwave_2044));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Generator_2045));
		entry.setId("createTriplex_node45CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Generator_2045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2346CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2346CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2346CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2046));
		entry.setId("createConnectionConnections2346CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2046));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Capbank_2047));
		entry.setId("createTriplex_meter47CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Capbank_2047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2448CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2448CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2448CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2048));
		entry.setId("createConnectionConnections2448CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2048));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Multizone_2049));
		entry.setId("createTriplex_line49CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Multizone_2049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2550CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2550CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2550CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2050));
		entry.setId("createConnectionConnections2550CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2050));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2051));
		entry.setId("createTriplex_line_configuration51CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2051));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2652CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2652CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2652CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2052));
		entry.setId("createConnectionConnections2652CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2052));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Controller_2053));
		entry.setId("createTriplex_line_conductor53CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Controller_2053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2754CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2754CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2754CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2054));
		entry.setId("createConnectionConnections2754CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2054));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2055));
		entry.setId("createSwitch55CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2055));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2856CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2856CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2856CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056));
		entry.setId("createConnectionConnections2856CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Comm_2057));
		entry.setId("createSubstation57CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Comm_2057));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections2958CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections2958CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections2958CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Solar_2058));
		entry.setId("createConnectionConnections2958CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Solar_2058));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059));
		entry.setId("createPqload59CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3060CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3060CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3060CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2060));
		entry.setId("createConnectionConnections3060CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2060));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_2061));
		entry.setId("createVoltdump61CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_2061));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3162CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3162CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3162CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2062));
		entry.setId("createConnectionConnections3162CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2062));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2063));
		entry.setId("createSeries_reactor63CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2063));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3264CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3264CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3264CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Billdump_2064));
		entry.setId("createConnectionConnections3264CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Billdump_2064));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Relay_2065));
		entry.setId("createRestoration65CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Relay_2065));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3366CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3366CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3366CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2066));
		entry.setId("createConnectionConnections3366CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2066));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2067));
		entry.setId("createFrequency_gen67CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2067));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3468CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3468CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3468CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2068));
		entry.setId("createConnectionConnections3468CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2068));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Range_2069));
		entry.setId("createVolt_var_control69CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Range_2069));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3570CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3570CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3570CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Collector_2070));
		entry.setId("createConnectionConnections3570CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Collector_2070));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2071));
		entry.setId("createFault_check71CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2071));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3672CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3672CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3672CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2072));
		entry.setId("createConnectionConnections3672CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2072));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Freezer_2073));
		entry.setId("createMotor73CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Freezer_2073));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3774CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3774CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3774CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Fuse_2074));
		entry.setId("createConnectionConnections3774CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Fuse_2074));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Meter_2075));
		entry.setId("createBilldump75CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Meter_2075));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3876CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3876CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3876CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Switch_2076));
		entry.setId("createConnectionConnections3876CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Switch_2076));
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
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Plc_2077));
		entry.setId("createResidential_enduse77CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Plc_2077));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections3978CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections3978CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections3978CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.Inverter_2078));
		entry.setId("createConnectionConnections3978CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.Inverter_2078));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse_a79CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				visGrid.diagram.part.Messages.House_a79CreationTool_title,
				visGrid.diagram.part.Messages.House_a79CreationTool_desc,
				Collections
						.singletonList(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001));
		entry.setId("createHouse_a79CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(visGrid.diagram.providers.VisGridElementTypes
				.getImageDescriptor(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4080CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4080CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4080CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4080CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse81CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.House81CreationTool_title,
				visGrid.diagram.part.Messages.House81CreationTool_desc, null,
				null) {
		};
		entry.setId("createHouse81CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4182CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4182CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4182CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4182CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheater83CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Waterheater83CreationTool_title,
				visGrid.diagram.part.Messages.Waterheater83CreationTool_desc,
				null, null) {
		};
		entry.setId("createWaterheater83CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4284CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4284CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4284CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4284CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLights85CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Lights85CreationTool_title,
				visGrid.diagram.part.Messages.Lights85CreationTool_desc, null,
				null) {
		};
		entry.setId("createLights85CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4386CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4386CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4386CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4386CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefrigerator87CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Refrigerator87CreationTool_title,
				visGrid.diagram.part.Messages.Refrigerator87CreationTool_desc,
				null, null) {
		};
		entry.setId("createRefrigerator87CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4488CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4488CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4488CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4488CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClotheswasher89CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Clotheswasher89CreationTool_title,
				visGrid.diagram.part.Messages.Clotheswasher89CreationTool_desc,
				null, null) {
		};
		entry.setId("createClotheswasher89CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4590CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4590CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4590CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4590CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDishwasher91CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Dishwasher91CreationTool_title,
				visGrid.diagram.part.Messages.Dishwasher91CreationTool_desc,
				null, null) {
		};
		entry.setId("createDishwasher91CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4692CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4692CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4692CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4692CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupantload93CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Occupantload93CreationTool_title,
				visGrid.diagram.part.Messages.Occupantload93CreationTool_desc,
				null, null) {
		};
		entry.setId("createOccupantload93CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4794CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4794CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4794CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4794CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlugload95CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Plugload95CreationTool_title,
				visGrid.diagram.part.Messages.Plugload95CreationTool_desc,
				null, null) {
		};
		entry.setId("createPlugload95CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4896CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4896CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4896CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4896CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicrowave97CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Microwave97CreationTool_title,
				visGrid.diagram.part.Messages.Microwave97CreationTool_desc,
				null, null) {
		};
		entry.setId("createMicrowave97CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections4998CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections4998CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections4998CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections4998CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRange99CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Range99CreationTool_title,
				visGrid.diagram.part.Messages.Range99CreationTool_desc, null,
				null) {
		};
		entry.setId("createRange99CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections50100CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections50100CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections50100CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections50100CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreezer101CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Freezer101CreationTool_title,
				visGrid.diagram.part.Messages.Freezer101CreationTool_desc,
				null, null) {
		};
		entry.setId("createFreezer101CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections51102CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections51102CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections51102CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections51102CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDryer103CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Dryer103CreationTool_title,
				visGrid.diagram.part.Messages.Dryer103CreationTool_desc, null,
				null) {
		};
		entry.setId("createDryer103CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections52104CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections52104CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections52104CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections52104CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvcharger105CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Evcharger105CreationTool_title,
				visGrid.diagram.part.Messages.Evcharger105CreationTool_desc,
				null, null) {
		};
		entry.setId("createEvcharger105CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections53106CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections53106CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections53106CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections53106CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createZIPload107CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ZIPload107CreationTool_title,
				visGrid.diagram.part.Messages.ZIPload107CreationTool_desc,
				null, null) {
		};
		entry.setId("createZIPload107CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections54108CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections54108CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections54108CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections54108CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlayer109CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Player109CreationTool_title,
				visGrid.diagram.part.Messages.Player109CreationTool_desc, null,
				null) {
		};
		entry.setId("createPlayer109CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections55110CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections55110CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections55110CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections55110CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShaper111CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Shaper111CreationTool_title,
				visGrid.diagram.part.Messages.Shaper111CreationTool_desc, null,
				null) {
		};
		entry.setId("createShaper111CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections56112CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections56112CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections56112CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections56112CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRecorder113CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Recorder113CreationTool_title,
				visGrid.diagram.part.Messages.Recorder113CreationTool_desc,
				null, null) {
		};
		entry.setId("createRecorder113CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections57114CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections57114CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections57114CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections57114CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollector115CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Collector115CreationTool_title,
				visGrid.diagram.part.Messages.Collector115CreationTool_desc,
				null, null) {
		};
		entry.setId("createCollector115CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections58116CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections58116CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections58116CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections58116CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHistogram117CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Histogram117CreationTool_title,
				visGrid.diagram.part.Messages.Histogram117CreationTool_desc,
				null, null) {
		};
		entry.setId("createHistogram117CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections59118CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections59118CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections59118CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections59118CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWeather119CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Weather119CreationTool_title,
				visGrid.diagram.part.Messages.Weather119CreationTool_desc,
				null, null) {
		};
		entry.setId("createWeather119CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections60120CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections60120CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections60120CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections60120CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOffice121CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Office121CreationTool_title,
				visGrid.diagram.part.Messages.Office121CreationTool_desc, null,
				null) {
		};
		entry.setId("createOffice121CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections61122CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections61122CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections61122CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections61122CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultizone123CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Multizone123CreationTool_title,
				visGrid.diagram.part.Messages.Multizone123CreationTool_desc,
				null, null) {
		};
		entry.setId("createMultizone123CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections62124CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections62124CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections62124CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections62124CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWindturb_dg125CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Windturb_dg125CreationTool_title,
				visGrid.diagram.part.Messages.Windturb_dg125CreationTool_desc,
				null, null) {
		};
		entry.setId("createWindturb_dg125CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections63126CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections63126CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections63126CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections63126CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPower_electronics127CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Power_electronics127CreationTool_title,
				visGrid.diagram.part.Messages.Power_electronics127CreationTool_desc,
				null, null) {
		};
		entry.setId("createPower_electronics127CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections64128CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections64128CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections64128CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections64128CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRectifier129CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Rectifier129CreationTool_title,
				visGrid.diagram.part.Messages.Rectifier129CreationTool_desc,
				null, null) {
		};
		entry.setId("createRectifier129CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections65130CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections65130CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections65130CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections65130CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMicroturbine131CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Microturbine131CreationTool_title,
				visGrid.diagram.part.Messages.Microturbine131CreationTool_desc,
				null, null) {
		};
		entry.setId("createMicroturbine131CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections66132CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections66132CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections66132CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections66132CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBattery133CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Battery133CreationTool_title,
				visGrid.diagram.part.Messages.Battery133CreationTool_desc,
				null, null) {
		};
		entry.setId("createBattery133CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections67134CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections67134CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections67134CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections67134CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSolar135CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Solar135CreationTool_title,
				visGrid.diagram.part.Messages.Solar135CreationTool_desc, null,
				null) {
		};
		entry.setId("createSolar135CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections68136CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections68136CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections68136CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections68136CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStubauction137CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Stubauction137CreationTool_title,
				visGrid.diagram.part.Messages.Stubauction137CreationTool_desc,
				null, null) {
		};
		entry.setId("createStubauction137CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections69138CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections69138CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections69138CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections69138CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink139CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Link139CreationTool_title,
				visGrid.diagram.part.Messages.Link139CreationTool_desc, null,
				null) {
		};
		entry.setId("createLink139CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections70140CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections70140CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections70140CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections70140CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFuse141CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Fuse141CreationTool_title,
				visGrid.diagram.part.Messages.Fuse141CreationTool_desc, null,
				null) {
		};
		entry.setId("createFuse141CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections71142CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections71142CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections71142CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections71142CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelay143CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Relay143CreationTool_title,
				visGrid.diagram.part.Messages.Relay143CreationTool_desc, null,
				null) {
		};
		entry.setId("createRelay143CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections72144CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections72144CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections72144CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections72144CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegulator145CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Regulator145CreationTool_title,
				visGrid.diagram.part.Messages.Regulator145CreationTool_desc,
				null, null) {
		};
		entry.setId("createRegulator145CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections73146CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections73146CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections73146CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections73146CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer147CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Transformer147CreationTool_title,
				visGrid.diagram.part.Messages.Transformer147CreationTool_desc,
				null, null) {
		};
		entry.setId("createTransformer147CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections74148CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections74148CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections74148CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections74148CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeter149CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Meter149CreationTool_title,
				visGrid.diagram.part.Messages.Meter149CreationTool_desc, null,
				null) {
		};
		entry.setId("createMeter149CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections75150CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections75150CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections75150CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections75150CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGenerator151CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Generator151CreationTool_title,
				visGrid.diagram.part.Messages.Generator151CreationTool_desc,
				null, null) {
		};
		entry.setId("createGenerator151CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections76152CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections76152CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections76152CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections76152CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlc153CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Plc153CreationTool_title,
				visGrid.diagram.part.Messages.Plc153CreationTool_desc, null,
				null) {
		};
		entry.setId("createPlc153CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections77154CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections77154CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections77154CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections77154CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode155CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Node155CreationTool_title,
				visGrid.diagram.part.Messages.Node155CreationTool_desc, null,
				null) {
		};
		entry.setId("createNode155CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections78156CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections78156CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections78156CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections78156CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection157CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.Connection157CreationTool_title,
				visGrid.diagram.part.Messages.Connection157CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnection157CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectionConnections79158CreationTool() {
		ToolEntry entry = new ToolEntry(
				visGrid.diagram.part.Messages.ConnectionConnections79158CreationTool_title,
				visGrid.diagram.part.Messages.ConnectionConnections79158CreationTool_desc,
				null, null) {
		};
		entry.setId("createConnectionConnections79158CreationTool"); //$NON-NLS-1$
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
