package visGrid.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class GridItemSemanticEditPolicy extends
		visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GridItemSemanticEditPolicy() {
		super(visGrid.diagram.providers.VisGridElementTypes.Grid_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_meterCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Climate_2059 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ClimateCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Dryer_2052 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.DryerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Underground_line_conductorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Capbank_2024 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CapbankCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Histogram_2069 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.HistogramCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Relay_2017 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RelayCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Battery_2002 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.BatteryCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Node_2054 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.NodeCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Overhead_line_conductorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.House_2016 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.HouseCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Transformer_configurationCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Volt_var_controlCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Regulator_configurationCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Energy_storageCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Csv_readerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Load_2005 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LoadCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Multizone_2066 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MultizoneCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RefrigeratorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Series_reactorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Auction_2047 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.AuctionCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Link_2004 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LinkCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Inverter_2058 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.InverterCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Pqload_2006 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PqloadCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Player_2015 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlayerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Substation_2067 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.SubstationCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MicroturbineCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_nodeCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Transformer_2001 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.TransformerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Plugload_2019 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlugloadCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Controller2_2029 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Controller2CreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ClotheswasherCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.StubauctionCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RectifierCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Power_electronicsCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Line_spacingCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Motor_2065 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MotorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.House_a_2008 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.House_aCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Controller_2040 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ControllerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Underground_lineCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Line_configurationCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.OccupantloadCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.EvchargerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Overhead_lineCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Line_2034 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LineCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Office_2060 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.OfficeCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.WaterheaterCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Dc_dc_converterCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_lineCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.DishwasherCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Recorder_2046 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RecorderCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Switch_2071 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.SwitchCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Comm_2074 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CommCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Solar_2051 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.SolarCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.VoltdumpCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Freezer_2014 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.FreezerCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Diesel_dgCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Meter_2049 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MeterCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Shaper_2003 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ShaperCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_line_conductorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Microwave_2018 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.MicrowaveCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Plc_2073 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.PlcCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Fault_checkCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Triplex_line_configurationCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Fuse_2057 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.FuseCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Billdump_2070 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.BilldumpCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Frequency_genCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Lights_2056 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.LightsCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Residential_enduseCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Collector_2021 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CollectorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Time_2082 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.TimeCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Restoration_2013 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RestorationCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ZIPloadCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Regulator_2031 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RegulatorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Weather_2044 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.WeatherCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Range_2043 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.RangeCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Generator_2072 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.GeneratorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.CapacitorCreateCommand(
					req));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.Windturb_dgCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
