package visGrid.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class VisGridElementTypes {

	/**
	 * @generated
	 */
	private VisGridElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Grid_1000 = getElementType("ie.tcd.gmf.visGrid.diagram.Grid_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Climate_2001 = getElementType("ie.tcd.gmf.visGrid.diagram.Climate_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Meter_2002 = getElementType("ie.tcd.gmf.visGrid.diagram.Meter_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_spacing_2003 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_spacing_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Overhead_line_conductor_2004 = getElementType("ie.tcd.gmf.visGrid.diagram.Overhead_line_conductor_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Regulator_2005 = getElementType("ie.tcd.gmf.visGrid.diagram.Regulator_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller_2006 = getElementType("ie.tcd.gmf.visGrid.diagram.Controller_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2007 = getElementType("ie.tcd.gmf.visGrid.diagram.Node_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rectifier_2008 = getElementType("ie.tcd.gmf.visGrid.diagram.Rectifier_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relay_2009 = getElementType("ie.tcd.gmf.visGrid.diagram.Relay_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Regulator_configuration_2010 = getElementType("ie.tcd.gmf.visGrid.diagram.Regulator_configuration_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Pqload_2011 = getElementType("ie.tcd.gmf.visGrid.diagram.Pqload_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType House_2012 = getElementType("ie.tcd.gmf.visGrid.diagram.House_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Residential_enduse_2013 = getElementType("ie.tcd.gmf.visGrid.diagram.Residential_enduse_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Energy_storage_2014 = getElementType("ie.tcd.gmf.visGrid.diagram.Energy_storage_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller2_2015 = getElementType("ie.tcd.gmf.visGrid.diagram.Controller2_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Billdump_2016 = getElementType("ie.tcd.gmf.visGrid.diagram.Billdump_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capbank_2017 = getElementType("ie.tcd.gmf.visGrid.diagram.Capbank_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Player_2018 = getElementType("ie.tcd.gmf.visGrid.diagram.Player_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dc_dc_converter_2019 = getElementType("ie.tcd.gmf.visGrid.diagram.Dc_dc_converter_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Stubauction_2020 = getElementType("ie.tcd.gmf.visGrid.diagram.Stubauction_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_2021 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Range_2022 = getElementType("ie.tcd.gmf.visGrid.diagram.Range_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capacitor_2023 = getElementType("ie.tcd.gmf.visGrid.diagram.Capacitor_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Microturbine_2024 = getElementType("ie.tcd.gmf.visGrid.diagram.Microturbine_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Auction_2025 = getElementType("ie.tcd.gmf.visGrid.diagram.Auction_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Solar_2026 = getElementType("ie.tcd.gmf.visGrid.diagram.Solar_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Multizone_2027 = getElementType("ie.tcd.gmf.visGrid.diagram.Multizone_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_configuration_2028 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_configuration_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Refrigerator_2029 = getElementType("ie.tcd.gmf.visGrid.diagram.Refrigerator_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_2030 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plugload_2031 = getElementType("ie.tcd.gmf.visGrid.diagram.Plugload_2031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Link_2032 = getElementType("ie.tcd.gmf.visGrid.diagram.Link_2032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Power_electronics_2033 = getElementType("ie.tcd.gmf.visGrid.diagram.Power_electronics_2033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Overhead_line_2034 = getElementType("ie.tcd.gmf.visGrid.diagram.Overhead_line_2034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_2035 = getElementType("ie.tcd.gmf.visGrid.diagram.Transformer_2035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Underground_line_conductor_2036 = getElementType("ie.tcd.gmf.visGrid.diagram.Underground_line_conductor_2036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Underground_line_2037 = getElementType("ie.tcd.gmf.visGrid.diagram.Underground_line_2037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType House_a_2038 = getElementType("ie.tcd.gmf.visGrid.diagram.House_a_2038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Lights_2039 = getElementType("ie.tcd.gmf.visGrid.diagram.Lights_2039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Restoration_2040 = getElementType("ie.tcd.gmf.visGrid.diagram.Restoration_2040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Series_reactor_2041 = getElementType("ie.tcd.gmf.visGrid.diagram.Series_reactor_2041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_node_2042 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_node_2042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Load_2043 = getElementType("ie.tcd.gmf.visGrid.diagram.Load_2043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Weather_2044 = getElementType("ie.tcd.gmf.visGrid.diagram.Weather_2044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inverter_2045 = getElementType("ie.tcd.gmf.visGrid.diagram.Inverter_2045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Voltdump_2046 = getElementType("ie.tcd.gmf.visGrid.diagram.Voltdump_2046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_conductor_2047 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_conductor_2047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Substation_2048 = getElementType("ie.tcd.gmf.visGrid.diagram.Substation_2048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Clotheswasher_2049 = getElementType("ie.tcd.gmf.visGrid.diagram.Clotheswasher_2049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Frequency_gen_2050 = getElementType("ie.tcd.gmf.visGrid.diagram.Frequency_gen_2050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Windturb_dg_2051 = getElementType("ie.tcd.gmf.visGrid.diagram.Windturb_dg_2051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_meter_2052 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_meter_2052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Collector_2053 = getElementType("ie.tcd.gmf.visGrid.diagram.Collector_2053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Office_2054 = getElementType("ie.tcd.gmf.visGrid.diagram.Office_2054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Microwave_2055 = getElementType("ie.tcd.gmf.visGrid.diagram.Microwave_2055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Comm_2056 = getElementType("ie.tcd.gmf.visGrid.diagram.Comm_2056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_configuration_2057 = getElementType("ie.tcd.gmf.visGrid.diagram.Transformer_configuration_2057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Freezer_2058 = getElementType("ie.tcd.gmf.visGrid.diagram.Freezer_2058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Evcharger_2059 = getElementType("ie.tcd.gmf.visGrid.diagram.Evcharger_2059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dryer_2060 = getElementType("ie.tcd.gmf.visGrid.diagram.Dryer_2060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Plc_2061 = getElementType("ie.tcd.gmf.visGrid.diagram.Plc_2061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ZIPload_2062 = getElementType("ie.tcd.gmf.visGrid.diagram.ZIPload_2062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fault_check_2063 = getElementType("ie.tcd.gmf.visGrid.diagram.Fault_check_2063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Recorder_2064 = getElementType("ie.tcd.gmf.visGrid.diagram.Recorder_2064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Occupantload_2065 = getElementType("ie.tcd.gmf.visGrid.diagram.Occupantload_2065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fuse_2066 = getElementType("ie.tcd.gmf.visGrid.diagram.Fuse_2066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Volt_var_control_2067 = getElementType("ie.tcd.gmf.visGrid.diagram.Volt_var_control_2067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Waterheater_2068 = getElementType("ie.tcd.gmf.visGrid.diagram.Waterheater_2068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Battery_2069 = getElementType("ie.tcd.gmf.visGrid.diagram.Battery_2069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Csv_reader_2070 = getElementType("ie.tcd.gmf.visGrid.diagram.Csv_reader_2070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Switch_2071 = getElementType("ie.tcd.gmf.visGrid.diagram.Switch_2071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dishwasher_2072 = getElementType("ie.tcd.gmf.visGrid.diagram.Dishwasher_2072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Histogram_2073 = getElementType("ie.tcd.gmf.visGrid.diagram.Histogram_2073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Shaper_2074 = getElementType("ie.tcd.gmf.visGrid.diagram.Shaper_2074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Generator_2075 = getElementType("ie.tcd.gmf.visGrid.diagram.Generator_2075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_configuration_2076 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_configuration_2076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connections_2077 = getElementType("ie.tcd.gmf.visGrid.diagram.Connections_2077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Motor_2078 = getElementType("ie.tcd.gmf.visGrid.diagram.Motor_2078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Diesel_dg_2079 = getElementType("ie.tcd.gmf.visGrid.diagram.Diesel_dg_2079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_nodeConnection_4001 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_nodeConnection_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Overhead_line_conductorConnection_4002 = getElementType("ie.tcd.gmf.visGrid.diagram.Overhead_line_conductorConnection_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsHouse_a_4003 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsHouse_a_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTriplex_line_conductor_4004 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTriplex_line_conductor_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsEnergy_storage_4005 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsEnergy_storage_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsDc_dc_converter_4006 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsDc_dc_converter_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Regulator_configurationConnection_4007 = getElementType("ie.tcd.gmf.visGrid.diagram.Regulator_configurationConnection_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsHouse_4008 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsHouse_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ZIPloadConnection_4009 = getElementType("ie.tcd.gmf.visGrid.diagram.ZIPloadConnection_4009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsClimate_4010 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsClimate_4010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_configurationConnection_4011 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_configurationConnection_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SwitchConnection_4012 = getElementType("ie.tcd.gmf.visGrid.diagram.SwitchConnection_4012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkConnection_4013 = getElementType("ie.tcd.gmf.visGrid.diagram.LinkConnection_4013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsUnderground_line_conductor_4014 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsUnderground_line_conductor_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClimateConnection_4015 = getElementType("ie.tcd.gmf.visGrid.diagram.ClimateConnection_4015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapbankConnection_4016 = getElementType("ie.tcd.gmf.visGrid.diagram.CapbankConnection_4016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsStubauction_4017 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsStubauction_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OccupantloadConnection_4018 = getElementType("ie.tcd.gmf.visGrid.diagram.OccupantloadConnection_4018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WaterheaterConnection_4019 = getElementType("ie.tcd.gmf.visGrid.diagram.WaterheaterConnection_4019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeConnection_4020 = getElementType("ie.tcd.gmf.visGrid.diagram.NodeConnection_4020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsShaper_4021 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsShaper_4021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsPlc_4022 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsPlc_4022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsOffice_4023 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsOffice_4023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MeterConnection_4024 = getElementType("ie.tcd.gmf.visGrid.diagram.MeterConnection_4024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SolarConnection_4025 = getElementType("ie.tcd.gmf.visGrid.diagram.SolarConnection_4025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RelayConnection_4026 = getElementType("ie.tcd.gmf.visGrid.diagram.RelayConnection_4026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Csv_readerConnection_4027 = getElementType("ie.tcd.gmf.visGrid.diagram.Csv_readerConnection_4027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsAuction_4028 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsAuction_4028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LightsConnection_4029 = getElementType("ie.tcd.gmf.visGrid.diagram.LightsConnection_4029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRefrigerator_4030 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRefrigerator_4030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClotheswasherConnection_4031 = getElementType("ie.tcd.gmf.visGrid.diagram.ClotheswasherConnection_4031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlugloadConnection_4032 = getElementType("ie.tcd.gmf.visGrid.diagram.PlugloadConnection_4032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsVoltdump_4033 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsVoltdump_4033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MicroturbineConnection_4034 = getElementType("ie.tcd.gmf.visGrid.diagram.MicroturbineConnection_4034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BilldumpConnection_4035 = getElementType("ie.tcd.gmf.visGrid.diagram.BilldumpConnection_4035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsInverter_4036 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsInverter_4036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsResidential_enduse_4037 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsResidential_enduse_4037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsSubstation_4038 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsSubstation_4038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_lineConnection_4039 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_lineConnection_4039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TransformerConnection_4040 = getElementType("ie.tcd.gmf.visGrid.diagram.TransformerConnection_4040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WeatherConnection_4041 = getElementType("ie.tcd.gmf.visGrid.diagram.WeatherConnection_4041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Energy_storageConnection_4042 = getElementType("ie.tcd.gmf.visGrid.diagram.Energy_storageConnection_4042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsMicroturbine_4043 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsMicroturbine_4043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType House_aConnection_4044 = getElementType("ie.tcd.gmf.visGrid.diagram.House_aConnection_4044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsLine_configuration_4045 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsLine_configuration_4045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsFault_check_4046 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsFault_check_4046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DryerConnection_4047 = getElementType("ie.tcd.gmf.visGrid.diagram.DryerConnection_4047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsPlayer_4048 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsPlayer_4048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fault_checkConnection_4049 = getElementType("ie.tcd.gmf.visGrid.diagram.Fault_checkConnection_4049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsClotheswasher_4050 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsClotheswasher_4050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsLine_spacing_4051 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsLine_spacing_4051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsFuse_4052 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsFuse_4052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsComm_4053 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsComm_4053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsEvcharger_4054 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsEvcharger_4054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsLights_4055 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsLights_4055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultizoneConnection_4056 = getElementType("ie.tcd.gmf.visGrid.diagram.MultizoneConnection_4056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsController_4057 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsController_4057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsSeries_reactor_4058 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsSeries_reactor_4058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTransformer_configuration_4059 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTransformer_configuration_4059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsPqload_4060 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsPqload_4060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsPower_electronics_4061 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsPower_electronics_4061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_conductorConnection_4062 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_conductorConnection_4062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MotorConnection_4063 = getElementType("ie.tcd.gmf.visGrid.diagram.MotorConnection_4063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsCsv_reader_4064 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsCsv_reader_4064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InverterConnection_4065 = getElementType("ie.tcd.gmf.visGrid.diagram.InverterConnection_4065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsBilldump_4066 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsBilldump_4066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SubstationConnection_4067 = getElementType("ie.tcd.gmf.visGrid.diagram.SubstationConnection_4067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsSolar_4068 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsSolar_4068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PqloadConnection_4069 = getElementType("ie.tcd.gmf.visGrid.diagram.PqloadConnection_4069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OfficeConnection_4070 = getElementType("ie.tcd.gmf.visGrid.diagram.OfficeConnection_4070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsOccupantload_4071 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsOccupantload_4071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RefrigeratorConnection_4072 = getElementType("ie.tcd.gmf.visGrid.diagram.RefrigeratorConnection_4072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HouseConnection_4073 = getElementType("ie.tcd.gmf.visGrid.diagram.HouseConnection_4073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Dc_dc_converterConnection_4074 = getElementType("ie.tcd.gmf.visGrid.diagram.Dc_dc_converterConnection_4074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RectifierConnection_4075 = getElementType("ie.tcd.gmf.visGrid.diagram.RectifierConnection_4075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsGenerator_4076 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsGenerator_4076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RestorationConnection_4077 = getElementType("ie.tcd.gmf.visGrid.diagram.RestorationConnection_4077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BatteryConnection_4078 = getElementType("ie.tcd.gmf.visGrid.diagram.BatteryConnection_4078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsFreezer_4079 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsFreezer_4079"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRange_4080 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRange_4080"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRecorder_4081 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRecorder_4081"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Frequency_genConnection_4082 = getElementType("ie.tcd.gmf.visGrid.diagram.Frequency_genConnection_4082"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTriplex_node_4083 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTriplex_node_4083"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RegulatorConnection_4084 = getElementType("ie.tcd.gmf.visGrid.diagram.RegulatorConnection_4084"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControllerConnection_4085 = getElementType("ie.tcd.gmf.visGrid.diagram.ControllerConnection_4085"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CommConnection_4086 = getElementType("ie.tcd.gmf.visGrid.diagram.CommConnection_4086"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsCollector_4087 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsCollector_4087"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Volt_var_controlConnection_4088 = getElementType("ie.tcd.gmf.visGrid.diagram.Volt_var_controlConnection_4088"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FreezerConnection_4089 = getElementType("ie.tcd.gmf.visGrid.diagram.FreezerConnection_4089"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRegulator_configuration_4090 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRegulator_configuration_4090"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsMeter_4091 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsMeter_4091"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsController2_4092 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsController2_4092"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Windturb_dgConnection_4093 = getElementType("ie.tcd.gmf.visGrid.diagram.Windturb_dgConnection_4093"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsDryer_4094 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsDryer_4094"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTriplex_line_4095 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTriplex_line_4095"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EvchargerConnection_4096 = getElementType("ie.tcd.gmf.visGrid.diagram.EvchargerConnection_4096"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsLink_4097 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsLink_4097"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StubauctionConnection_4098 = getElementType("ie.tcd.gmf.visGrid.diagram.StubauctionConnection_4098"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GeneratorConnection_4099 = getElementType("ie.tcd.gmf.visGrid.diagram.GeneratorConnection_4099"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsMultizone_4100 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsMultizone_4100"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ShaperConnection_4101 = getElementType("ie.tcd.gmf.visGrid.diagram.ShaperConnection_4101"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsWindturb_dg_4102 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsWindturb_dg_4102"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecorderConnection_4103 = getElementType("ie.tcd.gmf.visGrid.diagram.RecorderConnection_4103"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsPlugload_4104 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsPlugload_4104"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsMicrowave_4105 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsMicrowave_4105"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DishwasherConnection_4106 = getElementType("ie.tcd.gmf.visGrid.diagram.DishwasherConnection_4106"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsZIPload_4107 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsZIPload_4107"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRectifier_4108 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRectifier_4108"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsHistogram_4109 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsHistogram_4109"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsCapacitor_4110 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsCapacitor_4110"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_configurationConnection_4111 = getElementType("ie.tcd.gmf.visGrid.diagram.Transformer_configurationConnection_4111"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRegulator_4112 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRegulator_4112"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CollectorConnection_4113 = getElementType("ie.tcd.gmf.visGrid.diagram.CollectorConnection_4113"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsWaterheater_4114 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsWaterheater_4114"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Diesel_dgConnection_4115 = getElementType("ie.tcd.gmf.visGrid.diagram.Diesel_dgConnection_4115"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsSwitch_4116 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsSwitch_4116"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LoadConnection_4117 = getElementType("ie.tcd.gmf.visGrid.diagram.LoadConnection_4117"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTransformer_4118 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTransformer_4118"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlayerConnection_4119 = getElementType("ie.tcd.gmf.visGrid.diagram.PlayerConnection_4119"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PlcConnection_4120 = getElementType("ie.tcd.gmf.visGrid.diagram.PlcConnection_4120"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Controller2Connection_4121 = getElementType("ie.tcd.gmf.visGrid.diagram.Controller2Connection_4121"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsLine_4122 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsLine_4122"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Overhead_lineConnection_4123 = getElementType("ie.tcd.gmf.visGrid.diagram.Overhead_lineConnection_4123"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HistogramConnection_4124 = getElementType("ie.tcd.gmf.visGrid.diagram.HistogramConnection_4124"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_spacingConnection_4125 = getElementType("ie.tcd.gmf.visGrid.diagram.Line_spacingConnection_4125"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_configurationConnection_4126 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_line_configurationConnection_4126"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTriplex_meter_4127 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTriplex_meter_4127"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Underground_line_conductorConnection_4128 = getElementType("ie.tcd.gmf.visGrid.diagram.Underground_line_conductorConnection_4128"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VoltdumpConnection_4129 = getElementType("ie.tcd.gmf.visGrid.diagram.VoltdumpConnection_4129"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CapacitorConnection_4130 = getElementType("ie.tcd.gmf.visGrid.diagram.CapacitorConnection_4130"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsUnderground_line_4131 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsUnderground_line_4131"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Series_reactorConnection_4132 = getElementType("ie.tcd.gmf.visGrid.diagram.Series_reactorConnection_4132"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_meterConnection_4133 = getElementType("ie.tcd.gmf.visGrid.diagram.Triplex_meterConnection_4133"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsNode_4134 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsNode_4134"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Power_electronicsConnection_4135 = getElementType("ie.tcd.gmf.visGrid.diagram.Power_electronicsConnection_4135"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsDiesel_dg_4136 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsDiesel_dg_4136"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LineConnection_4137 = getElementType("ie.tcd.gmf.visGrid.diagram.LineConnection_4137"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AuctionConnection_4138 = getElementType("ie.tcd.gmf.visGrid.diagram.AuctionConnection_4138"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MicrowaveConnection_4139 = getElementType("ie.tcd.gmf.visGrid.diagram.MicrowaveConnection_4139"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsLoad_4140 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsLoad_4140"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsFrequency_gen_4141 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsFrequency_gen_4141"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRestoration_4142 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRestoration_4142"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsMotor_4143 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsMotor_4143"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Residential_enduseConnection_4144 = getElementType("ie.tcd.gmf.visGrid.diagram.Residential_enduseConnection_4144"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsWeather_4145 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsWeather_4145"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsDishwasher_4146 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsDishwasher_4146"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsTriplex_line_configuration_4147 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsTriplex_line_configuration_4147"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsBattery_4148 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsBattery_4148"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Underground_lineConnection_4149 = getElementType("ie.tcd.gmf.visGrid.diagram.Underground_lineConnection_4149"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsOverhead_line_conductor_4150 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsOverhead_line_conductor_4150"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RangeConnection_4151 = getElementType("ie.tcd.gmf.visGrid.diagram.RangeConnection_4151"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsCapbank_4152 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsCapbank_4152"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsVolt_var_control_4153 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsVolt_var_control_4153"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FuseConnection_4154 = getElementType("ie.tcd.gmf.visGrid.diagram.FuseConnection_4154"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsRelay_4155 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsRelay_4155"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionsOverhead_line_4156 = getElementType("ie.tcd.gmf.visGrid.diagram.ConnectionsOverhead_line_4156"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return visGrid.diagram.part.VisGridDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Grid_1000, visGrid.VisGridPackage.eINSTANCE.getGrid());

			elements.put(Climate_2001,
					visGrid.VisGridPackage.eINSTANCE.getClimate());

			elements.put(Meter_2002,
					visGrid.VisGridPackage.eINSTANCE.getMeter());

			elements.put(Line_spacing_2003,
					visGrid.VisGridPackage.eINSTANCE.getLine_spacing());

			elements.put(Overhead_line_conductor_2004,
					visGrid.VisGridPackage.eINSTANCE
							.getOverhead_line_conductor());

			elements.put(Regulator_2005,
					visGrid.VisGridPackage.eINSTANCE.getRegulator());

			elements.put(Controller_2006,
					visGrid.VisGridPackage.eINSTANCE.getController());

			elements.put(Node_2007, visGrid.VisGridPackage.eINSTANCE.getNode());

			elements.put(Rectifier_2008,
					visGrid.VisGridPackage.eINSTANCE.getRectifier());

			elements.put(Relay_2009,
					visGrid.VisGridPackage.eINSTANCE.getRelay());

			elements.put(Regulator_configuration_2010,
					visGrid.VisGridPackage.eINSTANCE
							.getRegulator_configuration());

			elements.put(Pqload_2011,
					visGrid.VisGridPackage.eINSTANCE.getPqload());

			elements.put(House_2012,
					visGrid.VisGridPackage.eINSTANCE.getHouse());

			elements.put(Residential_enduse_2013,
					visGrid.VisGridPackage.eINSTANCE.getResidential_enduse());

			elements.put(Energy_storage_2014,
					visGrid.VisGridPackage.eINSTANCE.getEnergy_storage());

			elements.put(Controller2_2015,
					visGrid.VisGridPackage.eINSTANCE.getController2());

			elements.put(Billdump_2016,
					visGrid.VisGridPackage.eINSTANCE.getBilldump());

			elements.put(Capbank_2017,
					visGrid.VisGridPackage.eINSTANCE.getCapbank());

			elements.put(Player_2018,
					visGrid.VisGridPackage.eINSTANCE.getPlayer());

			elements.put(Dc_dc_converter_2019,
					visGrid.VisGridPackage.eINSTANCE.getDc_dc_converter());

			elements.put(Stubauction_2020,
					visGrid.VisGridPackage.eINSTANCE.getStubauction());

			elements.put(Line_2021, visGrid.VisGridPackage.eINSTANCE.getLine());

			elements.put(Range_2022,
					visGrid.VisGridPackage.eINSTANCE.getRange());

			elements.put(Capacitor_2023,
					visGrid.VisGridPackage.eINSTANCE.getCapacitor());

			elements.put(Microturbine_2024,
					visGrid.VisGridPackage.eINSTANCE.getMicroturbine());

			elements.put(Auction_2025,
					visGrid.VisGridPackage.eINSTANCE.getAuction());

			elements.put(Solar_2026,
					visGrid.VisGridPackage.eINSTANCE.getSolar());

			elements.put(Multizone_2027,
					visGrid.VisGridPackage.eINSTANCE.getMultizone());

			elements.put(Line_configuration_2028,
					visGrid.VisGridPackage.eINSTANCE.getLine_configuration());

			elements.put(Refrigerator_2029,
					visGrid.VisGridPackage.eINSTANCE.getRefrigerator());

			elements.put(Triplex_line_2030,
					visGrid.VisGridPackage.eINSTANCE.getTriplex_line());

			elements.put(Plugload_2031,
					visGrid.VisGridPackage.eINSTANCE.getPlugload());

			elements.put(Link_2032, visGrid.VisGridPackage.eINSTANCE.getLink());

			elements.put(Power_electronics_2033,
					visGrid.VisGridPackage.eINSTANCE.getPower_electronics());

			elements.put(Overhead_line_2034,
					visGrid.VisGridPackage.eINSTANCE.getOverhead_line());

			elements.put(Transformer_2035,
					visGrid.VisGridPackage.eINSTANCE.getTransformer());

			elements.put(Underground_line_conductor_2036,
					visGrid.VisGridPackage.eINSTANCE
							.getUnderground_line_conductor());

			elements.put(Underground_line_2037,
					visGrid.VisGridPackage.eINSTANCE.getUnderground_line());

			elements.put(House_a_2038,
					visGrid.VisGridPackage.eINSTANCE.getHouse_a());

			elements.put(Lights_2039,
					visGrid.VisGridPackage.eINSTANCE.getLights());

			elements.put(Restoration_2040,
					visGrid.VisGridPackage.eINSTANCE.getRestoration());

			elements.put(Series_reactor_2041,
					visGrid.VisGridPackage.eINSTANCE.getSeries_reactor());

			elements.put(Triplex_node_2042,
					visGrid.VisGridPackage.eINSTANCE.getTriplex_node());

			elements.put(Load_2043, visGrid.VisGridPackage.eINSTANCE.getLoad());

			elements.put(Weather_2044,
					visGrid.VisGridPackage.eINSTANCE.getWeather());

			elements.put(Inverter_2045,
					visGrid.VisGridPackage.eINSTANCE.getInverter());

			elements.put(Voltdump_2046,
					visGrid.VisGridPackage.eINSTANCE.getVoltdump());

			elements.put(Triplex_line_conductor_2047,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_conductor());

			elements.put(Substation_2048,
					visGrid.VisGridPackage.eINSTANCE.getSubstation());

			elements.put(Clotheswasher_2049,
					visGrid.VisGridPackage.eINSTANCE.getClotheswasher());

			elements.put(Frequency_gen_2050,
					visGrid.VisGridPackage.eINSTANCE.getFrequency_gen());

			elements.put(Windturb_dg_2051,
					visGrid.VisGridPackage.eINSTANCE.getWindturb_dg());

			elements.put(Triplex_meter_2052,
					visGrid.VisGridPackage.eINSTANCE.getTriplex_meter());

			elements.put(Collector_2053,
					visGrid.VisGridPackage.eINSTANCE.getCollector());

			elements.put(Office_2054,
					visGrid.VisGridPackage.eINSTANCE.getOffice());

			elements.put(Microwave_2055,
					visGrid.VisGridPackage.eINSTANCE.getMicrowave());

			elements.put(Comm_2056, visGrid.VisGridPackage.eINSTANCE.getComm());

			elements.put(Transformer_configuration_2057,
					visGrid.VisGridPackage.eINSTANCE
							.getTransformer_configuration());

			elements.put(Freezer_2058,
					visGrid.VisGridPackage.eINSTANCE.getFreezer());

			elements.put(Evcharger_2059,
					visGrid.VisGridPackage.eINSTANCE.getEvcharger());

			elements.put(Dryer_2060,
					visGrid.VisGridPackage.eINSTANCE.getDryer());

			elements.put(Plc_2061, visGrid.VisGridPackage.eINSTANCE.getPlc());

			elements.put(ZIPload_2062,
					visGrid.VisGridPackage.eINSTANCE.getZIPload());

			elements.put(Fault_check_2063,
					visGrid.VisGridPackage.eINSTANCE.getFault_check());

			elements.put(Recorder_2064,
					visGrid.VisGridPackage.eINSTANCE.getRecorder());

			elements.put(Occupantload_2065,
					visGrid.VisGridPackage.eINSTANCE.getOccupantload());

			elements.put(Fuse_2066, visGrid.VisGridPackage.eINSTANCE.getFuse());

			elements.put(Volt_var_control_2067,
					visGrid.VisGridPackage.eINSTANCE.getVolt_var_control());

			elements.put(Waterheater_2068,
					visGrid.VisGridPackage.eINSTANCE.getWaterheater());

			elements.put(Battery_2069,
					visGrid.VisGridPackage.eINSTANCE.getBattery());

			elements.put(Csv_reader_2070,
					visGrid.VisGridPackage.eINSTANCE.getCsv_reader());

			elements.put(Switch_2071,
					visGrid.VisGridPackage.eINSTANCE.getSwitch());

			elements.put(Dishwasher_2072,
					visGrid.VisGridPackage.eINSTANCE.getDishwasher());

			elements.put(Histogram_2073,
					visGrid.VisGridPackage.eINSTANCE.getHistogram());

			elements.put(Shaper_2074,
					visGrid.VisGridPackage.eINSTANCE.getShaper());

			elements.put(Generator_2075,
					visGrid.VisGridPackage.eINSTANCE.getGenerator());

			elements.put(Triplex_line_configuration_2076,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_configuration());

			elements.put(Connections_2077,
					visGrid.VisGridPackage.eINSTANCE.getConnections());

			elements.put(Motor_2078,
					visGrid.VisGridPackage.eINSTANCE.getMotor());

			elements.put(Diesel_dg_2079,
					visGrid.VisGridPackage.eINSTANCE.getDiesel_dg());

			elements.put(Triplex_nodeConnection_4001,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_node_Connection());

			elements.put(Overhead_line_conductorConnection_4002,
					visGrid.VisGridPackage.eINSTANCE
							.getOverhead_line_conductor_Connection());

			elements.put(ConnectionsHouse_a_4003,
					visGrid.VisGridPackage.eINSTANCE.getConnections_House_a());

			elements.put(ConnectionsTriplex_line_conductor_4004,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Triplex_line_conductor());

			elements.put(ConnectionsEnergy_storage_4005,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Energy_storage());

			elements.put(ConnectionsDc_dc_converter_4006,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Dc_dc_converter());

			elements.put(Regulator_configurationConnection_4007,
					visGrid.VisGridPackage.eINSTANCE
							.getRegulator_configuration_Connection());

			elements.put(ConnectionsHouse_4008,
					visGrid.VisGridPackage.eINSTANCE.getConnections_House());

			elements.put(ZIPloadConnection_4009,
					visGrid.VisGridPackage.eINSTANCE.getZIPload_Connection());

			elements.put(ConnectionsClimate_4010,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Climate());

			elements.put(Line_configurationConnection_4011,
					visGrid.VisGridPackage.eINSTANCE
							.getLine_configuration_Connection());

			elements.put(SwitchConnection_4012,
					visGrid.VisGridPackage.eINSTANCE.getSwitch_Connection());

			elements.put(LinkConnection_4013,
					visGrid.VisGridPackage.eINSTANCE.getLink_Connection());

			elements.put(ConnectionsUnderground_line_conductor_4014,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Underground_line_conductor());

			elements.put(ClimateConnection_4015,
					visGrid.VisGridPackage.eINSTANCE.getClimate_Connection());

			elements.put(CapbankConnection_4016,
					visGrid.VisGridPackage.eINSTANCE.getCapbank_Connection());

			elements.put(ConnectionsStubauction_4017,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Stubauction());

			elements.put(OccupantloadConnection_4018,
					visGrid.VisGridPackage.eINSTANCE
							.getOccupantload_Connection());

			elements.put(WaterheaterConnection_4019,
					visGrid.VisGridPackage.eINSTANCE
							.getWaterheater_Connection());

			elements.put(NodeConnection_4020,
					visGrid.VisGridPackage.eINSTANCE.getNode_Connection());

			elements.put(ConnectionsShaper_4021,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Shaper());

			elements.put(ConnectionsPlc_4022,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Plc());

			elements.put(ConnectionsOffice_4023,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Office());

			elements.put(MeterConnection_4024,
					visGrid.VisGridPackage.eINSTANCE.getMeter_Connection());

			elements.put(SolarConnection_4025,
					visGrid.VisGridPackage.eINSTANCE.getSolar_Connection());

			elements.put(RelayConnection_4026,
					visGrid.VisGridPackage.eINSTANCE.getRelay_Connection());

			elements.put(Csv_readerConnection_4027,
					visGrid.VisGridPackage.eINSTANCE.getCsv_reader_Connection());

			elements.put(ConnectionsAuction_4028,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Auction());

			elements.put(LightsConnection_4029,
					visGrid.VisGridPackage.eINSTANCE.getLights_Connection());

			elements.put(ConnectionsRefrigerator_4030,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Refrigerator());

			elements.put(ClotheswasherConnection_4031,
					visGrid.VisGridPackage.eINSTANCE
							.getClotheswasher_Connection());

			elements.put(PlugloadConnection_4032,
					visGrid.VisGridPackage.eINSTANCE.getPlugload_Connection());

			elements.put(ConnectionsVoltdump_4033,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Voltdump());

			elements.put(MicroturbineConnection_4034,
					visGrid.VisGridPackage.eINSTANCE
							.getMicroturbine_Connection());

			elements.put(BilldumpConnection_4035,
					visGrid.VisGridPackage.eINSTANCE.getBilldump_Connection());

			elements.put(ConnectionsInverter_4036,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Inverter());

			elements.put(ConnectionsResidential_enduse_4037,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Residential_enduse());

			elements.put(ConnectionsSubstation_4038,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Substation());

			elements.put(Triplex_lineConnection_4039,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_Connection());

			elements.put(TransformerConnection_4040,
					visGrid.VisGridPackage.eINSTANCE
							.getTransformer_Connection());

			elements.put(WeatherConnection_4041,
					visGrid.VisGridPackage.eINSTANCE.getWeather_Connection());

			elements.put(Energy_storageConnection_4042,
					visGrid.VisGridPackage.eINSTANCE
							.getEnergy_storage_Connection());

			elements.put(ConnectionsMicroturbine_4043,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Microturbine());

			elements.put(House_aConnection_4044,
					visGrid.VisGridPackage.eINSTANCE.getHouse_a_Connection());

			elements.put(ConnectionsLine_configuration_4045,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Line_configuration());

			elements.put(ConnectionsFault_check_4046,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Fault_check());

			elements.put(DryerConnection_4047,
					visGrid.VisGridPackage.eINSTANCE.getDryer_Connection());

			elements.put(ConnectionsPlayer_4048,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Player());

			elements.put(Fault_checkConnection_4049,
					visGrid.VisGridPackage.eINSTANCE
							.getFault_check_Connection());

			elements.put(ConnectionsClotheswasher_4050,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Clotheswasher());

			elements.put(ConnectionsLine_spacing_4051,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Line_spacing());

			elements.put(ConnectionsFuse_4052,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Fuse());

			elements.put(ConnectionsComm_4053,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Comm());

			elements.put(ConnectionsEvcharger_4054,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Evcharger());

			elements.put(ConnectionsLights_4055,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Lights());

			elements.put(MultizoneConnection_4056,
					visGrid.VisGridPackage.eINSTANCE.getMultizone_Connection());

			elements.put(ConnectionsController_4057,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Controller());

			elements.put(ConnectionsSeries_reactor_4058,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Series_reactor());

			elements.put(ConnectionsTransformer_configuration_4059,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Transformer_configuration());

			elements.put(ConnectionsPqload_4060,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Pqload());

			elements.put(ConnectionsPower_electronics_4061,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Power_electronics());

			elements.put(Triplex_line_conductorConnection_4062,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_conductor_Connection());

			elements.put(MotorConnection_4063,
					visGrid.VisGridPackage.eINSTANCE.getMotor_Connection());

			elements.put(ConnectionsCsv_reader_4064,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Csv_reader());

			elements.put(InverterConnection_4065,
					visGrid.VisGridPackage.eINSTANCE.getInverter_Connection());

			elements.put(ConnectionsBilldump_4066,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Billdump());

			elements.put(SubstationConnection_4067,
					visGrid.VisGridPackage.eINSTANCE.getSubstation_Connection());

			elements.put(ConnectionsSolar_4068,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Solar());

			elements.put(PqloadConnection_4069,
					visGrid.VisGridPackage.eINSTANCE.getPqload_Connection());

			elements.put(OfficeConnection_4070,
					visGrid.VisGridPackage.eINSTANCE.getOffice_Connection());

			elements.put(ConnectionsOccupantload_4071,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Occupantload());

			elements.put(RefrigeratorConnection_4072,
					visGrid.VisGridPackage.eINSTANCE
							.getRefrigerator_Connection());

			elements.put(HouseConnection_4073,
					visGrid.VisGridPackage.eINSTANCE.getHouse_Connection());

			elements.put(Dc_dc_converterConnection_4074,
					visGrid.VisGridPackage.eINSTANCE
							.getDc_dc_converter_Connection());

			elements.put(RectifierConnection_4075,
					visGrid.VisGridPackage.eINSTANCE.getRectifier_Connection());

			elements.put(ConnectionsGenerator_4076,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Generator());

			elements.put(RestorationConnection_4077,
					visGrid.VisGridPackage.eINSTANCE
							.getRestoration_Connection());

			elements.put(BatteryConnection_4078,
					visGrid.VisGridPackage.eINSTANCE.getBattery_Connection());

			elements.put(ConnectionsFreezer_4079,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Freezer());

			elements.put(ConnectionsRange_4080,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Range());

			elements.put(ConnectionsRecorder_4081,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Recorder());

			elements.put(Frequency_genConnection_4082,
					visGrid.VisGridPackage.eINSTANCE
							.getFrequency_gen_Connection());

			elements.put(ConnectionsTriplex_node_4083,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Triplex_node());

			elements.put(RegulatorConnection_4084,
					visGrid.VisGridPackage.eINSTANCE.getRegulator_Connection());

			elements.put(ControllerConnection_4085,
					visGrid.VisGridPackage.eINSTANCE.getController_Connection());

			elements.put(CommConnection_4086,
					visGrid.VisGridPackage.eINSTANCE.getComm_Connection());

			elements.put(ConnectionsCollector_4087,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Collector());

			elements.put(Volt_var_controlConnection_4088,
					visGrid.VisGridPackage.eINSTANCE
							.getVolt_var_control_Connection());

			elements.put(FreezerConnection_4089,
					visGrid.VisGridPackage.eINSTANCE.getFreezer_Connection());

			elements.put(ConnectionsRegulator_configuration_4090,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Regulator_configuration());

			elements.put(ConnectionsMeter_4091,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Meter());

			elements.put(ConnectionsController2_4092,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Controller2());

			elements.put(Windturb_dgConnection_4093,
					visGrid.VisGridPackage.eINSTANCE
							.getWindturb_dg_Connection());

			elements.put(ConnectionsDryer_4094,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Dryer());

			elements.put(ConnectionsTriplex_line_4095,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Triplex_line());

			elements.put(EvchargerConnection_4096,
					visGrid.VisGridPackage.eINSTANCE.getEvcharger_Connection());

			elements.put(ConnectionsLink_4097,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Link());

			elements.put(StubauctionConnection_4098,
					visGrid.VisGridPackage.eINSTANCE
							.getStubauction_Connection());

			elements.put(GeneratorConnection_4099,
					visGrid.VisGridPackage.eINSTANCE.getGenerator_Connection());

			elements.put(ConnectionsMultizone_4100,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Multizone());

			elements.put(ShaperConnection_4101,
					visGrid.VisGridPackage.eINSTANCE.getShaper_Connection());

			elements.put(ConnectionsWindturb_dg_4102,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Windturb_dg());

			elements.put(RecorderConnection_4103,
					visGrid.VisGridPackage.eINSTANCE.getRecorder_Connection());

			elements.put(ConnectionsPlugload_4104,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Plugload());

			elements.put(ConnectionsMicrowave_4105,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Microwave());

			elements.put(DishwasherConnection_4106,
					visGrid.VisGridPackage.eINSTANCE.getDishwasher_Connection());

			elements.put(ConnectionsZIPload_4107,
					visGrid.VisGridPackage.eINSTANCE.getConnections_ZIPload());

			elements.put(ConnectionsRectifier_4108,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Rectifier());

			elements.put(ConnectionsHistogram_4109,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Histogram());

			elements.put(ConnectionsCapacitor_4110,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Capacitor());

			elements.put(Transformer_configurationConnection_4111,
					visGrid.VisGridPackage.eINSTANCE
							.getTransformer_configuration_Connection());

			elements.put(ConnectionsRegulator_4112,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Regulator());

			elements.put(CollectorConnection_4113,
					visGrid.VisGridPackage.eINSTANCE.getCollector_Connection());

			elements.put(ConnectionsWaterheater_4114,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Waterheater());

			elements.put(Diesel_dgConnection_4115,
					visGrid.VisGridPackage.eINSTANCE.getDiesel_dg_Connection());

			elements.put(ConnectionsSwitch_4116,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Switch());

			elements.put(LoadConnection_4117,
					visGrid.VisGridPackage.eINSTANCE.getLoad_Connection());

			elements.put(ConnectionsTransformer_4118,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Transformer());

			elements.put(PlayerConnection_4119,
					visGrid.VisGridPackage.eINSTANCE.getPlayer_Connection());

			elements.put(PlcConnection_4120,
					visGrid.VisGridPackage.eINSTANCE.getPlc_Connection());

			elements.put(Controller2Connection_4121,
					visGrid.VisGridPackage.eINSTANCE
							.getController2_Connection());

			elements.put(ConnectionsLine_4122,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Line());

			elements.put(Overhead_lineConnection_4123,
					visGrid.VisGridPackage.eINSTANCE
							.getOverhead_line_Connection());

			elements.put(HistogramConnection_4124,
					visGrid.VisGridPackage.eINSTANCE.getHistogram_Connection());

			elements.put(Line_spacingConnection_4125,
					visGrid.VisGridPackage.eINSTANCE
							.getLine_spacing_Connection());

			elements.put(Triplex_line_configurationConnection_4126,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_line_configuration_Connection());

			elements.put(ConnectionsTriplex_meter_4127,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Triplex_meter());

			elements.put(Underground_line_conductorConnection_4128,
					visGrid.VisGridPackage.eINSTANCE
							.getUnderground_line_conductor_Connection());

			elements.put(VoltdumpConnection_4129,
					visGrid.VisGridPackage.eINSTANCE.getVoltdump_Connection());

			elements.put(CapacitorConnection_4130,
					visGrid.VisGridPackage.eINSTANCE.getCapacitor_Connection());

			elements.put(ConnectionsUnderground_line_4131,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Underground_line());

			elements.put(Series_reactorConnection_4132,
					visGrid.VisGridPackage.eINSTANCE
							.getSeries_reactor_Connection());

			elements.put(Triplex_meterConnection_4133,
					visGrid.VisGridPackage.eINSTANCE
							.getTriplex_meter_Connection());

			elements.put(ConnectionsNode_4134,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Node());

			elements.put(Power_electronicsConnection_4135,
					visGrid.VisGridPackage.eINSTANCE
							.getPower_electronics_Connection());

			elements.put(ConnectionsDiesel_dg_4136,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Diesel_dg());

			elements.put(LineConnection_4137,
					visGrid.VisGridPackage.eINSTANCE.getLine_Connection());

			elements.put(AuctionConnection_4138,
					visGrid.VisGridPackage.eINSTANCE.getAuction_Connection());

			elements.put(MicrowaveConnection_4139,
					visGrid.VisGridPackage.eINSTANCE.getMicrowave_Connection());

			elements.put(ConnectionsLoad_4140,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Load());

			elements.put(ConnectionsFrequency_gen_4141,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Frequency_gen());

			elements.put(ConnectionsRestoration_4142,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Restoration());

			elements.put(ConnectionsMotor_4143,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Motor());

			elements.put(Residential_enduseConnection_4144,
					visGrid.VisGridPackage.eINSTANCE
							.getResidential_enduse_Connection());

			elements.put(ConnectionsWeather_4145,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Weather());

			elements.put(ConnectionsDishwasher_4146,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Dishwasher());

			elements.put(ConnectionsTriplex_line_configuration_4147,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Triplex_line_configuration());

			elements.put(ConnectionsBattery_4148,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Battery());

			elements.put(Underground_lineConnection_4149,
					visGrid.VisGridPackage.eINSTANCE
							.getUnderground_line_Connection());

			elements.put(ConnectionsOverhead_line_conductor_4150,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Overhead_line_conductor());

			elements.put(RangeConnection_4151,
					visGrid.VisGridPackage.eINSTANCE.getRange_Connection());

			elements.put(ConnectionsCapbank_4152,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Capbank());

			elements.put(ConnectionsVolt_var_control_4153,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Volt_var_control());

			elements.put(FuseConnection_4154,
					visGrid.VisGridPackage.eINSTANCE.getFuse_Connection());

			elements.put(ConnectionsRelay_4155,
					visGrid.VisGridPackage.eINSTANCE.getConnections_Relay());

			elements.put(ConnectionsOverhead_line_4156,
					visGrid.VisGridPackage.eINSTANCE
							.getConnections_Overhead_line());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Grid_1000);
			KNOWN_ELEMENT_TYPES.add(Climate_2001);
			KNOWN_ELEMENT_TYPES.add(Meter_2002);
			KNOWN_ELEMENT_TYPES.add(Line_spacing_2003);
			KNOWN_ELEMENT_TYPES.add(Overhead_line_conductor_2004);
			KNOWN_ELEMENT_TYPES.add(Regulator_2005);
			KNOWN_ELEMENT_TYPES.add(Controller_2006);
			KNOWN_ELEMENT_TYPES.add(Node_2007);
			KNOWN_ELEMENT_TYPES.add(Rectifier_2008);
			KNOWN_ELEMENT_TYPES.add(Relay_2009);
			KNOWN_ELEMENT_TYPES.add(Regulator_configuration_2010);
			KNOWN_ELEMENT_TYPES.add(Pqload_2011);
			KNOWN_ELEMENT_TYPES.add(House_2012);
			KNOWN_ELEMENT_TYPES.add(Residential_enduse_2013);
			KNOWN_ELEMENT_TYPES.add(Energy_storage_2014);
			KNOWN_ELEMENT_TYPES.add(Controller2_2015);
			KNOWN_ELEMENT_TYPES.add(Billdump_2016);
			KNOWN_ELEMENT_TYPES.add(Capbank_2017);
			KNOWN_ELEMENT_TYPES.add(Player_2018);
			KNOWN_ELEMENT_TYPES.add(Dc_dc_converter_2019);
			KNOWN_ELEMENT_TYPES.add(Stubauction_2020);
			KNOWN_ELEMENT_TYPES.add(Line_2021);
			KNOWN_ELEMENT_TYPES.add(Range_2022);
			KNOWN_ELEMENT_TYPES.add(Capacitor_2023);
			KNOWN_ELEMENT_TYPES.add(Microturbine_2024);
			KNOWN_ELEMENT_TYPES.add(Auction_2025);
			KNOWN_ELEMENT_TYPES.add(Solar_2026);
			KNOWN_ELEMENT_TYPES.add(Multizone_2027);
			KNOWN_ELEMENT_TYPES.add(Line_configuration_2028);
			KNOWN_ELEMENT_TYPES.add(Refrigerator_2029);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_2030);
			KNOWN_ELEMENT_TYPES.add(Plugload_2031);
			KNOWN_ELEMENT_TYPES.add(Link_2032);
			KNOWN_ELEMENT_TYPES.add(Power_electronics_2033);
			KNOWN_ELEMENT_TYPES.add(Overhead_line_2034);
			KNOWN_ELEMENT_TYPES.add(Transformer_2035);
			KNOWN_ELEMENT_TYPES.add(Underground_line_conductor_2036);
			KNOWN_ELEMENT_TYPES.add(Underground_line_2037);
			KNOWN_ELEMENT_TYPES.add(House_a_2038);
			KNOWN_ELEMENT_TYPES.add(Lights_2039);
			KNOWN_ELEMENT_TYPES.add(Restoration_2040);
			KNOWN_ELEMENT_TYPES.add(Series_reactor_2041);
			KNOWN_ELEMENT_TYPES.add(Triplex_node_2042);
			KNOWN_ELEMENT_TYPES.add(Load_2043);
			KNOWN_ELEMENT_TYPES.add(Weather_2044);
			KNOWN_ELEMENT_TYPES.add(Inverter_2045);
			KNOWN_ELEMENT_TYPES.add(Voltdump_2046);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_conductor_2047);
			KNOWN_ELEMENT_TYPES.add(Substation_2048);
			KNOWN_ELEMENT_TYPES.add(Clotheswasher_2049);
			KNOWN_ELEMENT_TYPES.add(Frequency_gen_2050);
			KNOWN_ELEMENT_TYPES.add(Windturb_dg_2051);
			KNOWN_ELEMENT_TYPES.add(Triplex_meter_2052);
			KNOWN_ELEMENT_TYPES.add(Collector_2053);
			KNOWN_ELEMENT_TYPES.add(Office_2054);
			KNOWN_ELEMENT_TYPES.add(Microwave_2055);
			KNOWN_ELEMENT_TYPES.add(Comm_2056);
			KNOWN_ELEMENT_TYPES.add(Transformer_configuration_2057);
			KNOWN_ELEMENT_TYPES.add(Freezer_2058);
			KNOWN_ELEMENT_TYPES.add(Evcharger_2059);
			KNOWN_ELEMENT_TYPES.add(Dryer_2060);
			KNOWN_ELEMENT_TYPES.add(Plc_2061);
			KNOWN_ELEMENT_TYPES.add(ZIPload_2062);
			KNOWN_ELEMENT_TYPES.add(Fault_check_2063);
			KNOWN_ELEMENT_TYPES.add(Recorder_2064);
			KNOWN_ELEMENT_TYPES.add(Occupantload_2065);
			KNOWN_ELEMENT_TYPES.add(Fuse_2066);
			KNOWN_ELEMENT_TYPES.add(Volt_var_control_2067);
			KNOWN_ELEMENT_TYPES.add(Waterheater_2068);
			KNOWN_ELEMENT_TYPES.add(Battery_2069);
			KNOWN_ELEMENT_TYPES.add(Csv_reader_2070);
			KNOWN_ELEMENT_TYPES.add(Switch_2071);
			KNOWN_ELEMENT_TYPES.add(Dishwasher_2072);
			KNOWN_ELEMENT_TYPES.add(Histogram_2073);
			KNOWN_ELEMENT_TYPES.add(Shaper_2074);
			KNOWN_ELEMENT_TYPES.add(Generator_2075);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_configuration_2076);
			KNOWN_ELEMENT_TYPES.add(Connections_2077);
			KNOWN_ELEMENT_TYPES.add(Motor_2078);
			KNOWN_ELEMENT_TYPES.add(Diesel_dg_2079);
			KNOWN_ELEMENT_TYPES.add(Triplex_nodeConnection_4001);
			KNOWN_ELEMENT_TYPES.add(Overhead_line_conductorConnection_4002);
			KNOWN_ELEMENT_TYPES.add(ConnectionsHouse_a_4003);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTriplex_line_conductor_4004);
			KNOWN_ELEMENT_TYPES.add(ConnectionsEnergy_storage_4005);
			KNOWN_ELEMENT_TYPES.add(ConnectionsDc_dc_converter_4006);
			KNOWN_ELEMENT_TYPES.add(Regulator_configurationConnection_4007);
			KNOWN_ELEMENT_TYPES.add(ConnectionsHouse_4008);
			KNOWN_ELEMENT_TYPES.add(ZIPloadConnection_4009);
			KNOWN_ELEMENT_TYPES.add(ConnectionsClimate_4010);
			KNOWN_ELEMENT_TYPES.add(Line_configurationConnection_4011);
			KNOWN_ELEMENT_TYPES.add(SwitchConnection_4012);
			KNOWN_ELEMENT_TYPES.add(LinkConnection_4013);
			KNOWN_ELEMENT_TYPES.add(ConnectionsUnderground_line_conductor_4014);
			KNOWN_ELEMENT_TYPES.add(ClimateConnection_4015);
			KNOWN_ELEMENT_TYPES.add(CapbankConnection_4016);
			KNOWN_ELEMENT_TYPES.add(ConnectionsStubauction_4017);
			KNOWN_ELEMENT_TYPES.add(OccupantloadConnection_4018);
			KNOWN_ELEMENT_TYPES.add(WaterheaterConnection_4019);
			KNOWN_ELEMENT_TYPES.add(NodeConnection_4020);
			KNOWN_ELEMENT_TYPES.add(ConnectionsShaper_4021);
			KNOWN_ELEMENT_TYPES.add(ConnectionsPlc_4022);
			KNOWN_ELEMENT_TYPES.add(ConnectionsOffice_4023);
			KNOWN_ELEMENT_TYPES.add(MeterConnection_4024);
			KNOWN_ELEMENT_TYPES.add(SolarConnection_4025);
			KNOWN_ELEMENT_TYPES.add(RelayConnection_4026);
			KNOWN_ELEMENT_TYPES.add(Csv_readerConnection_4027);
			KNOWN_ELEMENT_TYPES.add(ConnectionsAuction_4028);
			KNOWN_ELEMENT_TYPES.add(LightsConnection_4029);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRefrigerator_4030);
			KNOWN_ELEMENT_TYPES.add(ClotheswasherConnection_4031);
			KNOWN_ELEMENT_TYPES.add(PlugloadConnection_4032);
			KNOWN_ELEMENT_TYPES.add(ConnectionsVoltdump_4033);
			KNOWN_ELEMENT_TYPES.add(MicroturbineConnection_4034);
			KNOWN_ELEMENT_TYPES.add(BilldumpConnection_4035);
			KNOWN_ELEMENT_TYPES.add(ConnectionsInverter_4036);
			KNOWN_ELEMENT_TYPES.add(ConnectionsResidential_enduse_4037);
			KNOWN_ELEMENT_TYPES.add(ConnectionsSubstation_4038);
			KNOWN_ELEMENT_TYPES.add(Triplex_lineConnection_4039);
			KNOWN_ELEMENT_TYPES.add(TransformerConnection_4040);
			KNOWN_ELEMENT_TYPES.add(WeatherConnection_4041);
			KNOWN_ELEMENT_TYPES.add(Energy_storageConnection_4042);
			KNOWN_ELEMENT_TYPES.add(ConnectionsMicroturbine_4043);
			KNOWN_ELEMENT_TYPES.add(House_aConnection_4044);
			KNOWN_ELEMENT_TYPES.add(ConnectionsLine_configuration_4045);
			KNOWN_ELEMENT_TYPES.add(ConnectionsFault_check_4046);
			KNOWN_ELEMENT_TYPES.add(DryerConnection_4047);
			KNOWN_ELEMENT_TYPES.add(ConnectionsPlayer_4048);
			KNOWN_ELEMENT_TYPES.add(Fault_checkConnection_4049);
			KNOWN_ELEMENT_TYPES.add(ConnectionsClotheswasher_4050);
			KNOWN_ELEMENT_TYPES.add(ConnectionsLine_spacing_4051);
			KNOWN_ELEMENT_TYPES.add(ConnectionsFuse_4052);
			KNOWN_ELEMENT_TYPES.add(ConnectionsComm_4053);
			KNOWN_ELEMENT_TYPES.add(ConnectionsEvcharger_4054);
			KNOWN_ELEMENT_TYPES.add(ConnectionsLights_4055);
			KNOWN_ELEMENT_TYPES.add(MultizoneConnection_4056);
			KNOWN_ELEMENT_TYPES.add(ConnectionsController_4057);
			KNOWN_ELEMENT_TYPES.add(ConnectionsSeries_reactor_4058);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTransformer_configuration_4059);
			KNOWN_ELEMENT_TYPES.add(ConnectionsPqload_4060);
			KNOWN_ELEMENT_TYPES.add(ConnectionsPower_electronics_4061);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_conductorConnection_4062);
			KNOWN_ELEMENT_TYPES.add(MotorConnection_4063);
			KNOWN_ELEMENT_TYPES.add(ConnectionsCsv_reader_4064);
			KNOWN_ELEMENT_TYPES.add(InverterConnection_4065);
			KNOWN_ELEMENT_TYPES.add(ConnectionsBilldump_4066);
			KNOWN_ELEMENT_TYPES.add(SubstationConnection_4067);
			KNOWN_ELEMENT_TYPES.add(ConnectionsSolar_4068);
			KNOWN_ELEMENT_TYPES.add(PqloadConnection_4069);
			KNOWN_ELEMENT_TYPES.add(OfficeConnection_4070);
			KNOWN_ELEMENT_TYPES.add(ConnectionsOccupantload_4071);
			KNOWN_ELEMENT_TYPES.add(RefrigeratorConnection_4072);
			KNOWN_ELEMENT_TYPES.add(HouseConnection_4073);
			KNOWN_ELEMENT_TYPES.add(Dc_dc_converterConnection_4074);
			KNOWN_ELEMENT_TYPES.add(RectifierConnection_4075);
			KNOWN_ELEMENT_TYPES.add(ConnectionsGenerator_4076);
			KNOWN_ELEMENT_TYPES.add(RestorationConnection_4077);
			KNOWN_ELEMENT_TYPES.add(BatteryConnection_4078);
			KNOWN_ELEMENT_TYPES.add(ConnectionsFreezer_4079);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRange_4080);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRecorder_4081);
			KNOWN_ELEMENT_TYPES.add(Frequency_genConnection_4082);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTriplex_node_4083);
			KNOWN_ELEMENT_TYPES.add(RegulatorConnection_4084);
			KNOWN_ELEMENT_TYPES.add(ControllerConnection_4085);
			KNOWN_ELEMENT_TYPES.add(CommConnection_4086);
			KNOWN_ELEMENT_TYPES.add(ConnectionsCollector_4087);
			KNOWN_ELEMENT_TYPES.add(Volt_var_controlConnection_4088);
			KNOWN_ELEMENT_TYPES.add(FreezerConnection_4089);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRegulator_configuration_4090);
			KNOWN_ELEMENT_TYPES.add(ConnectionsMeter_4091);
			KNOWN_ELEMENT_TYPES.add(ConnectionsController2_4092);
			KNOWN_ELEMENT_TYPES.add(Windturb_dgConnection_4093);
			KNOWN_ELEMENT_TYPES.add(ConnectionsDryer_4094);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTriplex_line_4095);
			KNOWN_ELEMENT_TYPES.add(EvchargerConnection_4096);
			KNOWN_ELEMENT_TYPES.add(ConnectionsLink_4097);
			KNOWN_ELEMENT_TYPES.add(StubauctionConnection_4098);
			KNOWN_ELEMENT_TYPES.add(GeneratorConnection_4099);
			KNOWN_ELEMENT_TYPES.add(ConnectionsMultizone_4100);
			KNOWN_ELEMENT_TYPES.add(ShaperConnection_4101);
			KNOWN_ELEMENT_TYPES.add(ConnectionsWindturb_dg_4102);
			KNOWN_ELEMENT_TYPES.add(RecorderConnection_4103);
			KNOWN_ELEMENT_TYPES.add(ConnectionsPlugload_4104);
			KNOWN_ELEMENT_TYPES.add(ConnectionsMicrowave_4105);
			KNOWN_ELEMENT_TYPES.add(DishwasherConnection_4106);
			KNOWN_ELEMENT_TYPES.add(ConnectionsZIPload_4107);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRectifier_4108);
			KNOWN_ELEMENT_TYPES.add(ConnectionsHistogram_4109);
			KNOWN_ELEMENT_TYPES.add(ConnectionsCapacitor_4110);
			KNOWN_ELEMENT_TYPES.add(Transformer_configurationConnection_4111);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRegulator_4112);
			KNOWN_ELEMENT_TYPES.add(CollectorConnection_4113);
			KNOWN_ELEMENT_TYPES.add(ConnectionsWaterheater_4114);
			KNOWN_ELEMENT_TYPES.add(Diesel_dgConnection_4115);
			KNOWN_ELEMENT_TYPES.add(ConnectionsSwitch_4116);
			KNOWN_ELEMENT_TYPES.add(LoadConnection_4117);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTransformer_4118);
			KNOWN_ELEMENT_TYPES.add(PlayerConnection_4119);
			KNOWN_ELEMENT_TYPES.add(PlcConnection_4120);
			KNOWN_ELEMENT_TYPES.add(Controller2Connection_4121);
			KNOWN_ELEMENT_TYPES.add(ConnectionsLine_4122);
			KNOWN_ELEMENT_TYPES.add(Overhead_lineConnection_4123);
			KNOWN_ELEMENT_TYPES.add(HistogramConnection_4124);
			KNOWN_ELEMENT_TYPES.add(Line_spacingConnection_4125);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_configurationConnection_4126);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTriplex_meter_4127);
			KNOWN_ELEMENT_TYPES.add(Underground_line_conductorConnection_4128);
			KNOWN_ELEMENT_TYPES.add(VoltdumpConnection_4129);
			KNOWN_ELEMENT_TYPES.add(CapacitorConnection_4130);
			KNOWN_ELEMENT_TYPES.add(ConnectionsUnderground_line_4131);
			KNOWN_ELEMENT_TYPES.add(Series_reactorConnection_4132);
			KNOWN_ELEMENT_TYPES.add(Triplex_meterConnection_4133);
			KNOWN_ELEMENT_TYPES.add(ConnectionsNode_4134);
			KNOWN_ELEMENT_TYPES.add(Power_electronicsConnection_4135);
			KNOWN_ELEMENT_TYPES.add(ConnectionsDiesel_dg_4136);
			KNOWN_ELEMENT_TYPES.add(LineConnection_4137);
			KNOWN_ELEMENT_TYPES.add(AuctionConnection_4138);
			KNOWN_ELEMENT_TYPES.add(MicrowaveConnection_4139);
			KNOWN_ELEMENT_TYPES.add(ConnectionsLoad_4140);
			KNOWN_ELEMENT_TYPES.add(ConnectionsFrequency_gen_4141);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRestoration_4142);
			KNOWN_ELEMENT_TYPES.add(ConnectionsMotor_4143);
			KNOWN_ELEMENT_TYPES.add(Residential_enduseConnection_4144);
			KNOWN_ELEMENT_TYPES.add(ConnectionsWeather_4145);
			KNOWN_ELEMENT_TYPES.add(ConnectionsDishwasher_4146);
			KNOWN_ELEMENT_TYPES.add(ConnectionsTriplex_line_configuration_4147);
			KNOWN_ELEMENT_TYPES.add(ConnectionsBattery_4148);
			KNOWN_ELEMENT_TYPES.add(Underground_lineConnection_4149);
			KNOWN_ELEMENT_TYPES.add(ConnectionsOverhead_line_conductor_4150);
			KNOWN_ELEMENT_TYPES.add(RangeConnection_4151);
			KNOWN_ELEMENT_TYPES.add(ConnectionsCapbank_4152);
			KNOWN_ELEMENT_TYPES.add(ConnectionsVolt_var_control_4153);
			KNOWN_ELEMENT_TYPES.add(FuseConnection_4154);
			KNOWN_ELEMENT_TYPES.add(ConnectionsRelay_4155);
			KNOWN_ELEMENT_TYPES.add(ConnectionsOverhead_line_4156);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return Grid_1000;
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return Climate_2001;
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return Meter_2002;
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return Line_spacing_2003;
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return Overhead_line_conductor_2004;
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return Regulator_2005;
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return Controller_2006;
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return Node_2007;
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return Rectifier_2008;
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return Relay_2009;
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return Regulator_configuration_2010;
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return Pqload_2011;
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return House_2012;
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return Residential_enduse_2013;
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return Energy_storage_2014;
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return Controller2_2015;
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return Billdump_2016;
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return Capbank_2017;
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return Player_2018;
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return Dc_dc_converter_2019;
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return Stubauction_2020;
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return Line_2021;
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return Range_2022;
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return Capacitor_2023;
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return Microturbine_2024;
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return Auction_2025;
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return Solar_2026;
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return Multizone_2027;
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return Line_configuration_2028;
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return Refrigerator_2029;
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return Triplex_line_2030;
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return Plugload_2031;
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_2032;
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return Power_electronics_2033;
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return Overhead_line_2034;
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return Transformer_2035;
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return Underground_line_conductor_2036;
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return Underground_line_2037;
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return House_a_2038;
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return Lights_2039;
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return Restoration_2040;
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return Series_reactor_2041;
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return Triplex_node_2042;
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return Load_2043;
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return Weather_2044;
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return Inverter_2045;
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return Voltdump_2046;
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return Triplex_line_conductor_2047;
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return Substation_2048;
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return Clotheswasher_2049;
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return Frequency_gen_2050;
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return Windturb_dg_2051;
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return Triplex_meter_2052;
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return Collector_2053;
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return Office_2054;
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return Microwave_2055;
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return Comm_2056;
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return Transformer_configuration_2057;
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return Freezer_2058;
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return Evcharger_2059;
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return Dryer_2060;
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return Plc_2061;
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return ZIPload_2062;
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return Fault_check_2063;
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return Recorder_2064;
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return Occupantload_2065;
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return Fuse_2066;
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return Volt_var_control_2067;
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return Waterheater_2068;
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return Battery_2069;
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return Csv_reader_2070;
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return Switch_2071;
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return Dishwasher_2072;
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return Histogram_2073;
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return Shaper_2074;
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return Generator_2075;
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return Triplex_line_configuration_2076;
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
			return Connections_2077;
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return Motor_2078;
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return Diesel_dg_2079;
		case visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID:
			return Triplex_nodeConnection_4001;
		case visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID:
			return Overhead_line_conductorConnection_4002;
		case visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID:
			return ConnectionsHouse_a_4003;
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID:
			return ConnectionsTriplex_line_conductor_4004;
		case visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID:
			return ConnectionsEnergy_storage_4005;
		case visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID:
			return ConnectionsDc_dc_converter_4006;
		case visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID:
			return Regulator_configurationConnection_4007;
		case visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID:
			return ConnectionsHouse_4008;
		case visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID:
			return ZIPloadConnection_4009;
		case visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID:
			return ConnectionsClimate_4010;
		case visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID:
			return Line_configurationConnection_4011;
		case visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID:
			return SwitchConnection_4012;
		case visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID:
			return LinkConnection_4013;
		case visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID:
			return ConnectionsUnderground_line_conductor_4014;
		case visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID:
			return ClimateConnection_4015;
		case visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID:
			return CapbankConnection_4016;
		case visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID:
			return ConnectionsStubauction_4017;
		case visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID:
			return OccupantloadConnection_4018;
		case visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID:
			return WaterheaterConnection_4019;
		case visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID:
			return NodeConnection_4020;
		case visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID:
			return ConnectionsShaper_4021;
		case visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID:
			return ConnectionsPlc_4022;
		case visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID:
			return ConnectionsOffice_4023;
		case visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID:
			return MeterConnection_4024;
		case visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID:
			return SolarConnection_4025;
		case visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID:
			return RelayConnection_4026;
		case visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID:
			return Csv_readerConnection_4027;
		case visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID:
			return ConnectionsAuction_4028;
		case visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID:
			return LightsConnection_4029;
		case visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID:
			return ConnectionsRefrigerator_4030;
		case visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID:
			return ClotheswasherConnection_4031;
		case visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID:
			return PlugloadConnection_4032;
		case visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID:
			return ConnectionsVoltdump_4033;
		case visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID:
			return MicroturbineConnection_4034;
		case visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID:
			return BilldumpConnection_4035;
		case visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID:
			return ConnectionsInverter_4036;
		case visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID:
			return ConnectionsResidential_enduse_4037;
		case visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID:
			return ConnectionsSubstation_4038;
		case visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID:
			return Triplex_lineConnection_4039;
		case visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID:
			return TransformerConnection_4040;
		case visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID:
			return WeatherConnection_4041;
		case visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID:
			return Energy_storageConnection_4042;
		case visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID:
			return ConnectionsMicroturbine_4043;
		case visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID:
			return House_aConnection_4044;
		case visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID:
			return ConnectionsLine_configuration_4045;
		case visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID:
			return ConnectionsFault_check_4046;
		case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID:
			return DryerConnection_4047;
		case visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID:
			return ConnectionsPlayer_4048;
		case visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID:
			return Fault_checkConnection_4049;
		case visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID:
			return ConnectionsClotheswasher_4050;
		case visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID:
			return ConnectionsLine_spacing_4051;
		case visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID:
			return ConnectionsFuse_4052;
		case visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID:
			return ConnectionsComm_4053;
		case visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID:
			return ConnectionsEvcharger_4054;
		case visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID:
			return ConnectionsLights_4055;
		case visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID:
			return MultizoneConnection_4056;
		case visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID:
			return ConnectionsController_4057;
		case visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID:
			return ConnectionsSeries_reactor_4058;
		case visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID:
			return ConnectionsTransformer_configuration_4059;
		case visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID:
			return ConnectionsPqload_4060;
		case visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID:
			return ConnectionsPower_electronics_4061;
		case visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID:
			return Triplex_line_conductorConnection_4062;
		case visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID:
			return MotorConnection_4063;
		case visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID:
			return ConnectionsCsv_reader_4064;
		case visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID:
			return InverterConnection_4065;
		case visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID:
			return ConnectionsBilldump_4066;
		case visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID:
			return SubstationConnection_4067;
		case visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID:
			return ConnectionsSolar_4068;
		case visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID:
			return PqloadConnection_4069;
		case visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID:
			return OfficeConnection_4070;
		case visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID:
			return ConnectionsOccupantload_4071;
		case visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID:
			return RefrigeratorConnection_4072;
		case visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID:
			return HouseConnection_4073;
		case visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID:
			return Dc_dc_converterConnection_4074;
		case visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID:
			return RectifierConnection_4075;
		case visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID:
			return ConnectionsGenerator_4076;
		case visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID:
			return RestorationConnection_4077;
		case visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID:
			return BatteryConnection_4078;
		case visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID:
			return ConnectionsFreezer_4079;
		case visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID:
			return ConnectionsRange_4080;
		case visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID:
			return ConnectionsRecorder_4081;
		case visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID:
			return Frequency_genConnection_4082;
		case visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID:
			return ConnectionsTriplex_node_4083;
		case visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID:
			return RegulatorConnection_4084;
		case visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID:
			return ControllerConnection_4085;
		case visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID:
			return CommConnection_4086;
		case visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID:
			return ConnectionsCollector_4087;
		case visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID:
			return Volt_var_controlConnection_4088;
		case visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID:
			return FreezerConnection_4089;
		case visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID:
			return ConnectionsRegulator_configuration_4090;
		case visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID:
			return ConnectionsMeter_4091;
		case visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID:
			return ConnectionsController2_4092;
		case visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID:
			return Windturb_dgConnection_4093;
		case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID:
			return ConnectionsDryer_4094;
		case visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID:
			return ConnectionsTriplex_line_4095;
		case visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID:
			return EvchargerConnection_4096;
		case visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID:
			return ConnectionsLink_4097;
		case visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID:
			return StubauctionConnection_4098;
		case visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID:
			return GeneratorConnection_4099;
		case visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID:
			return ConnectionsMultizone_4100;
		case visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID:
			return ShaperConnection_4101;
		case visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID:
			return ConnectionsWindturb_dg_4102;
		case visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID:
			return RecorderConnection_4103;
		case visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID:
			return ConnectionsPlugload_4104;
		case visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID:
			return ConnectionsMicrowave_4105;
		case visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID:
			return DishwasherConnection_4106;
		case visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID:
			return ConnectionsZIPload_4107;
		case visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID:
			return ConnectionsRectifier_4108;
		case visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID:
			return ConnectionsHistogram_4109;
		case visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID:
			return ConnectionsCapacitor_4110;
		case visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID:
			return Transformer_configurationConnection_4111;
		case visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID:
			return ConnectionsRegulator_4112;
		case visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID:
			return CollectorConnection_4113;
		case visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID:
			return ConnectionsWaterheater_4114;
		case visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID:
			return Diesel_dgConnection_4115;
		case visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID:
			return ConnectionsSwitch_4116;
		case visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID:
			return LoadConnection_4117;
		case visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID:
			return ConnectionsTransformer_4118;
		case visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID:
			return PlayerConnection_4119;
		case visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID:
			return PlcConnection_4120;
		case visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID:
			return Controller2Connection_4121;
		case visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID:
			return ConnectionsLine_4122;
		case visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID:
			return Overhead_lineConnection_4123;
		case visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID:
			return HistogramConnection_4124;
		case visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID:
			return Line_spacingConnection_4125;
		case visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID:
			return Triplex_line_configurationConnection_4126;
		case visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID:
			return ConnectionsTriplex_meter_4127;
		case visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID:
			return Underground_line_conductorConnection_4128;
		case visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID:
			return VoltdumpConnection_4129;
		case visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID:
			return CapacitorConnection_4130;
		case visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID:
			return ConnectionsUnderground_line_4131;
		case visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID:
			return Series_reactorConnection_4132;
		case visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID:
			return Triplex_meterConnection_4133;
		case visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID:
			return ConnectionsNode_4134;
		case visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID:
			return Power_electronicsConnection_4135;
		case visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID:
			return ConnectionsDiesel_dg_4136;
		case visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID:
			return LineConnection_4137;
		case visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID:
			return AuctionConnection_4138;
		case visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID:
			return MicrowaveConnection_4139;
		case visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID:
			return ConnectionsLoad_4140;
		case visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID:
			return ConnectionsFrequency_gen_4141;
		case visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID:
			return ConnectionsRestoration_4142;
		case visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID:
			return ConnectionsMotor_4143;
		case visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID:
			return Residential_enduseConnection_4144;
		case visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID:
			return ConnectionsWeather_4145;
		case visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID:
			return ConnectionsDishwasher_4146;
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID:
			return ConnectionsTriplex_line_configuration_4147;
		case visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID:
			return ConnectionsBattery_4148;
		case visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID:
			return Underground_lineConnection_4149;
		case visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID:
			return ConnectionsOverhead_line_conductor_4150;
		case visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID:
			return RangeConnection_4151;
		case visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID:
			return ConnectionsCapbank_4152;
		case visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID:
			return ConnectionsVolt_var_control_4153;
		case visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID:
			return FuseConnection_4154;
		case visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID:
			return ConnectionsRelay_4155;
		case visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID:
			return ConnectionsOverhead_line_4156;
		}
		return null;
	}

}
