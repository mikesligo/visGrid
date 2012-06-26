package visGrid.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class VisGridParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser climateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClimateName_5001Parser() {
		if (climateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getClimate_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			climateName_5001Parser = parser;
		}
		return climateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser meterName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getMeterName_5002Parser() {
		if (meterName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getMeter_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			meterName_5002Parser = parser;
		}
		return meterName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser line_spacingName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLine_spacingName_5003Parser() {
		if (line_spacingName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getLine_spacing_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			line_spacingName_5003Parser = parser;
		}
		return line_spacingName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser overhead_line_conductorName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOverhead_line_conductorName_5004Parser() {
		if (overhead_line_conductorName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getOverhead_line_conductor_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			overhead_line_conductorName_5004Parser = parser;
		}
		return overhead_line_conductorName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser regulatorName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRegulatorName_5005Parser() {
		if (regulatorName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRegulator_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			regulatorName_5005Parser = parser;
		}
		return regulatorName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser controllerName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getControllerName_5006Parser() {
		if (controllerName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getController_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			controllerName_5006Parser = parser;
		}
		return controllerName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5007Parser() {
		if (nodeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getNode_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			nodeName_5007Parser = parser;
		}
		return nodeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser rectifierName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getRectifierName_5008Parser() {
		if (rectifierName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRectifier_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			rectifierName_5008Parser = parser;
		}
		return rectifierName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser relayName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getRelayName_5009Parser() {
		if (relayName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRelay_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			relayName_5009Parser = parser;
		}
		return relayName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser regulator_configurationName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getRegulator_configurationName_5010Parser() {
		if (regulator_configurationName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRegulator_configuration_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			regulator_configurationName_5010Parser = parser;
		}
		return regulator_configurationName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser pqloadName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getPqloadName_5011Parser() {
		if (pqloadName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getPqload_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			pqloadName_5011Parser = parser;
		}
		return pqloadName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser houseName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getHouseName_5012Parser() {
		if (houseName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getHouse_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			houseName_5012Parser = parser;
		}
		return houseName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser residential_enduseName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getResidential_enduseName_5013Parser() {
		if (residential_enduseName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getResidential_enduse_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			residential_enduseName_5013Parser = parser;
		}
		return residential_enduseName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser energy_storageName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getEnergy_storageName_5014Parser() {
		if (energy_storageName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getEnergy_storage_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			energy_storageName_5014Parser = parser;
		}
		return energy_storageName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser controller2Name_5015Parser;

	/**
	 * @generated
	 */
	private IParser getController2Name_5015Parser() {
		if (controller2Name_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getController2_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			controller2Name_5015Parser = parser;
		}
		return controller2Name_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser billdumpName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getBilldumpName_5016Parser() {
		if (billdumpName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getBilldump_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			billdumpName_5016Parser = parser;
		}
		return billdumpName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser capbankName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getCapbankName_5017Parser() {
		if (capbankName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getCapbank_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			capbankName_5017Parser = parser;
		}
		return capbankName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser playerName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getPlayerName_5018Parser() {
		if (playerName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getPlayer_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			playerName_5018Parser = parser;
		}
		return playerName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser dc_dc_converterName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getDc_dc_converterName_5019Parser() {
		if (dc_dc_converterName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getDc_dc_converter_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			dc_dc_converterName_5019Parser = parser;
		}
		return dc_dc_converterName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser stubauctionName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getStubauctionName_5020Parser() {
		if (stubauctionName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getStubauction_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			stubauctionName_5020Parser = parser;
		}
		return stubauctionName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser lineName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getLineName_5021Parser() {
		if (lineName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getLine_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			lineName_5021Parser = parser;
		}
		return lineName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser rangeName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getRangeName_5022Parser() {
		if (rangeName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRange_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			rangeName_5022Parser = parser;
		}
		return rangeName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser capacitorName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getCapacitorName_5023Parser() {
		if (capacitorName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getCapacitor_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			capacitorName_5023Parser = parser;
		}
		return capacitorName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser microturbineName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getMicroturbineName_5024Parser() {
		if (microturbineName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getMicroturbine_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			microturbineName_5024Parser = parser;
		}
		return microturbineName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser auctionName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getAuctionName_5025Parser() {
		if (auctionName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getAuction_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			auctionName_5025Parser = parser;
		}
		return auctionName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser solarName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getSolarName_5026Parser() {
		if (solarName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getSolar_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			solarName_5026Parser = parser;
		}
		return solarName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser multizoneName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getMultizoneName_5027Parser() {
		if (multizoneName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getMultizone_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			multizoneName_5027Parser = parser;
		}
		return multizoneName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser line_configurationName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getLine_configurationName_5028Parser() {
		if (line_configurationName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getLine_configuration_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			line_configurationName_5028Parser = parser;
		}
		return line_configurationName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser refrigeratorName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getRefrigeratorName_5029Parser() {
		if (refrigeratorName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRefrigerator_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			refrigeratorName_5029Parser = parser;
		}
		return refrigeratorName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_lineName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_lineName_5030Parser() {
		if (triplex_lineName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_lineName_5030Parser = parser;
		}
		return triplex_lineName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser plugloadName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getPlugloadName_5031Parser() {
		if (plugloadName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getPlugload_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			plugloadName_5031Parser = parser;
		}
		return plugloadName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getLinkName_5032Parser() {
		if (linkName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getLink_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			linkName_5032Parser = parser;
		}
		return linkName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser power_electronicsName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getPower_electronicsName_5033Parser() {
		if (power_electronicsName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getPower_electronics_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			power_electronicsName_5033Parser = parser;
		}
		return power_electronicsName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser overhead_lineName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getOverhead_lineName_5034Parser() {
		if (overhead_lineName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getOverhead_line_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			overhead_lineName_5034Parser = parser;
		}
		return overhead_lineName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser transformerName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getTransformerName_5035Parser() {
		if (transformerName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTransformer_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			transformerName_5035Parser = parser;
		}
		return transformerName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser underground_line_conductorName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getUnderground_line_conductorName_5036Parser() {
		if (underground_line_conductorName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getUnderground_line_conductor_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			underground_line_conductorName_5036Parser = parser;
		}
		return underground_line_conductorName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser underground_lineName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getUnderground_lineName_5037Parser() {
		if (underground_lineName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getUnderground_line_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			underground_lineName_5037Parser = parser;
		}
		return underground_lineName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser house_aName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getHouse_aName_5038Parser() {
		if (house_aName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getHouse_a_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			house_aName_5038Parser = parser;
		}
		return house_aName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser lightsName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getLightsName_5039Parser() {
		if (lightsName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getLights_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			lightsName_5039Parser = parser;
		}
		return lightsName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser restorationName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getRestorationName_5040Parser() {
		if (restorationName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRestoration_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			restorationName_5040Parser = parser;
		}
		return restorationName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser series_reactorName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getSeries_reactorName_5041Parser() {
		if (series_reactorName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getSeries_reactor_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			series_reactorName_5041Parser = parser;
		}
		return series_reactorName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_nodeName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_nodeName_5042Parser() {
		if (triplex_nodeName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTriplex_node_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_nodeName_5042Parser = parser;
		}
		return triplex_nodeName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getLoadName_5043Parser() {
		if (loadName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getLoad_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			loadName_5043Parser = parser;
		}
		return loadName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser weatherName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getWeatherName_5044Parser() {
		if (weatherName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getWeather_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			weatherName_5044Parser = parser;
		}
		return weatherName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser inverterName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getInverterName_5045Parser() {
		if (inverterName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getInverter_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			inverterName_5045Parser = parser;
		}
		return inverterName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser voltdumpName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getVoltdumpName_5046Parser() {
		if (voltdumpName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getVoltdump_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			voltdumpName_5046Parser = parser;
		}
		return voltdumpName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_line_conductorName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_line_conductorName_5047Parser() {
		if (triplex_line_conductorName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_conductor_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_line_conductorName_5047Parser = parser;
		}
		return triplex_line_conductorName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser substationName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getSubstationName_5048Parser() {
		if (substationName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getSubstation_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			substationName_5048Parser = parser;
		}
		return substationName_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser clotheswasherName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getClotheswasherName_5049Parser() {
		if (clotheswasherName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getClotheswasher_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			clotheswasherName_5049Parser = parser;
		}
		return clotheswasherName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser frequency_genName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getFrequency_genName_5050Parser() {
		if (frequency_genName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getFrequency_gen_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			frequency_genName_5050Parser = parser;
		}
		return frequency_genName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser windturb_dgName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getWindturb_dgName_5051Parser() {
		if (windturb_dgName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getWindturb_dg_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			windturb_dgName_5051Parser = parser;
		}
		return windturb_dgName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_meterName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_meterName_5052Parser() {
		if (triplex_meterName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTriplex_meter_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_meterName_5052Parser = parser;
		}
		return triplex_meterName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectorName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getCollectorName_5053Parser() {
		if (collectorName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getCollector_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			collectorName_5053Parser = parser;
		}
		return collectorName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser officeName_5054Parser;

	/**
	 * @generated
	 */
	private IParser getOfficeName_5054Parser() {
		if (officeName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getOffice_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			officeName_5054Parser = parser;
		}
		return officeName_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser microwaveName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getMicrowaveName_5055Parser() {
		if (microwaveName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getMicrowave_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			microwaveName_5055Parser = parser;
		}
		return microwaveName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser commName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getCommName_5056Parser() {
		if (commName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getComm_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			commName_5056Parser = parser;
		}
		return commName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser transformer_configurationName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getTransformer_configurationName_5057Parser() {
		if (transformer_configurationName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTransformer_configuration_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			transformer_configurationName_5057Parser = parser;
		}
		return transformer_configurationName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser freezerName_5058Parser;

	/**
	 * @generated
	 */
	private IParser getFreezerName_5058Parser() {
		if (freezerName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getFreezer_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			freezerName_5058Parser = parser;
		}
		return freezerName_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser evchargerName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getEvchargerName_5059Parser() {
		if (evchargerName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getEvcharger_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			evchargerName_5059Parser = parser;
		}
		return evchargerName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser dryerName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getDryerName_5060Parser() {
		if (dryerName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getDryer_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			dryerName_5060Parser = parser;
		}
		return dryerName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser plcName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getPlcName_5061Parser() {
		if (plcName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getPlc_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			plcName_5061Parser = parser;
		}
		return plcName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser zIPloadName_5062Parser;

	/**
	 * @generated
	 */
	private IParser getZIPloadName_5062Parser() {
		if (zIPloadName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getZIPload_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			zIPloadName_5062Parser = parser;
		}
		return zIPloadName_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser fault_checkName_5063Parser;

	/**
	 * @generated
	 */
	private IParser getFault_checkName_5063Parser() {
		if (fault_checkName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getFault_check_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			fault_checkName_5063Parser = parser;
		}
		return fault_checkName_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser recorderName_5064Parser;

	/**
	 * @generated
	 */
	private IParser getRecorderName_5064Parser() {
		if (recorderName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getRecorder_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			recorderName_5064Parser = parser;
		}
		return recorderName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser occupantloadName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getOccupantloadName_5065Parser() {
		if (occupantloadName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getOccupantload_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			occupantloadName_5065Parser = parser;
		}
		return occupantloadName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser fuseName_5066Parser;

	/**
	 * @generated
	 */
	private IParser getFuseName_5066Parser() {
		if (fuseName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getFuse_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			fuseName_5066Parser = parser;
		}
		return fuseName_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser volt_var_controlName_5067Parser;

	/**
	 * @generated
	 */
	private IParser getVolt_var_controlName_5067Parser() {
		if (volt_var_controlName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getVolt_var_control_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			volt_var_controlName_5067Parser = parser;
		}
		return volt_var_controlName_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser waterheaterName_5068Parser;

	/**
	 * @generated
	 */
	private IParser getWaterheaterName_5068Parser() {
		if (waterheaterName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getWaterheater_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			waterheaterName_5068Parser = parser;
		}
		return waterheaterName_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser batteryName_5069Parser;

	/**
	 * @generated
	 */
	private IParser getBatteryName_5069Parser() {
		if (batteryName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getBattery_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			batteryName_5069Parser = parser;
		}
		return batteryName_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser csv_readerName_5070Parser;

	/**
	 * @generated
	 */
	private IParser getCsv_readerName_5070Parser() {
		if (csv_readerName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getCsv_reader_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			csv_readerName_5070Parser = parser;
		}
		return csv_readerName_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser switchName_5071Parser;

	/**
	 * @generated
	 */
	private IParser getSwitchName_5071Parser() {
		if (switchName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getSwitch_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			switchName_5071Parser = parser;
		}
		return switchName_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser dishwasherName_5072Parser;

	/**
	 * @generated
	 */
	private IParser getDishwasherName_5072Parser() {
		if (dishwasherName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getDishwasher_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			dishwasherName_5072Parser = parser;
		}
		return dishwasherName_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser histogramName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getHistogramName_5073Parser() {
		if (histogramName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getHistogram_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			histogramName_5073Parser = parser;
		}
		return histogramName_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser shaperName_5074Parser;

	/**
	 * @generated
	 */
	private IParser getShaperName_5074Parser() {
		if (shaperName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getShaper_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			shaperName_5074Parser = parser;
		}
		return shaperName_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser generatorName_5075Parser;

	/**
	 * @generated
	 */
	private IParser getGeneratorName_5075Parser() {
		if (generatorName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getGenerator_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			generatorName_5075Parser = parser;
		}
		return generatorName_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_line_configurationName_5076Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_line_configurationName_5076Parser() {
		if (triplex_line_configurationName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_configuration_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_line_configurationName_5076Parser = parser;
		}
		return triplex_line_configurationName_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser motorName_5077Parser;

	/**
	 * @generated
	 */
	private IParser getMotorName_5077Parser() {
		if (motorName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getMotor_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			motorName_5077Parser = parser;
		}
		return motorName_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser diesel_dgName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getDiesel_dgName_5078Parser() {
		if (diesel_dgName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getDiesel_dg_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			diesel_dgName_5078Parser = parser;
		}
		return diesel_dgName_5078Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID:
			return getClimateName_5001Parser();
		case visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID:
			return getMeterName_5002Parser();
		case visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID:
			return getLine_spacingName_5003Parser();
		case visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart.VISUAL_ID:
			return getOverhead_line_conductorName_5004Parser();
		case visGrid.diagram.edit.parts.RegulatorNameEditPart.VISUAL_ID:
			return getRegulatorName_5005Parser();
		case visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5006Parser();
		case visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
			return getNodeName_5007Parser();
		case visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID:
			return getRectifierName_5008Parser();
		case visGrid.diagram.edit.parts.RelayNameEditPart.VISUAL_ID:
			return getRelayName_5009Parser();
		case visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID:
			return getRegulator_configurationName_5010Parser();
		case visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID:
			return getPqloadName_5011Parser();
		case visGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID:
			return getHouseName_5012Parser();
		case visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID:
			return getResidential_enduseName_5013Parser();
		case visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID:
			return getEnergy_storageName_5014Parser();
		case visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID:
			return getController2Name_5015Parser();
		case visGrid.diagram.edit.parts.BilldumpNameEditPart.VISUAL_ID:
			return getBilldumpName_5016Parser();
		case visGrid.diagram.edit.parts.CapbankNameEditPart.VISUAL_ID:
			return getCapbankName_5017Parser();
		case visGrid.diagram.edit.parts.PlayerNameEditPart.VISUAL_ID:
			return getPlayerName_5018Parser();
		case visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID:
			return getDc_dc_converterName_5019Parser();
		case visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID:
			return getStubauctionName_5020Parser();
		case visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID:
			return getLineName_5021Parser();
		case visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID:
			return getRangeName_5022Parser();
		case visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID:
			return getCapacitorName_5023Parser();
		case visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID:
			return getMicroturbineName_5024Parser();
		case visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID:
			return getAuctionName_5025Parser();
		case visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID:
			return getSolarName_5026Parser();
		case visGrid.diagram.edit.parts.MultizoneNameEditPart.VISUAL_ID:
			return getMultizoneName_5027Parser();
		case visGrid.diagram.edit.parts.Line_configurationNameEditPart.VISUAL_ID:
			return getLine_configurationName_5028Parser();
		case visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID:
			return getRefrigeratorName_5029Parser();
		case visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID:
			return getTriplex_lineName_5030Parser();
		case visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID:
			return getPlugloadName_5031Parser();
		case visGrid.diagram.edit.parts.LinkNameEditPart.VISUAL_ID:
			return getLinkName_5032Parser();
		case visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID:
			return getPower_electronicsName_5033Parser();
		case visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID:
			return getOverhead_lineName_5034Parser();
		case visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID:
			return getTransformerName_5035Parser();
		case visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart.VISUAL_ID:
			return getUnderground_line_conductorName_5036Parser();
		case visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID:
			return getUnderground_lineName_5037Parser();
		case visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID:
			return getHouse_aName_5038Parser();
		case visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID:
			return getLightsName_5039Parser();
		case visGrid.diagram.edit.parts.RestorationNameEditPart.VISUAL_ID:
			return getRestorationName_5040Parser();
		case visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID:
			return getSeries_reactorName_5041Parser();
		case visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID:
			return getTriplex_nodeName_5042Parser();
		case visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID:
			return getLoadName_5043Parser();
		case visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID:
			return getWeatherName_5044Parser();
		case visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID:
			return getInverterName_5045Parser();
		case visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID:
			return getVoltdumpName_5046Parser();
		case visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart.VISUAL_ID:
			return getTriplex_line_conductorName_5047Parser();
		case visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID:
			return getSubstationName_5048Parser();
		case visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID:
			return getClotheswasherName_5049Parser();
		case visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID:
			return getFrequency_genName_5050Parser();
		case visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID:
			return getWindturb_dgName_5051Parser();
		case visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID:
			return getTriplex_meterName_5052Parser();
		case visGrid.diagram.edit.parts.CollectorNameEditPart.VISUAL_ID:
			return getCollectorName_5053Parser();
		case visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID:
			return getOfficeName_5054Parser();
		case visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID:
			return getMicrowaveName_5055Parser();
		case visGrid.diagram.edit.parts.CommNameEditPart.VISUAL_ID:
			return getCommName_5056Parser();
		case visGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID:
			return getTransformer_configurationName_5057Parser();
		case visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID:
			return getFreezerName_5058Parser();
		case visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID:
			return getEvchargerName_5059Parser();
		case visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID:
			return getDryerName_5060Parser();
		case visGrid.diagram.edit.parts.PlcNameEditPart.VISUAL_ID:
			return getPlcName_5061Parser();
		case visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID:
			return getZIPloadName_5062Parser();
		case visGrid.diagram.edit.parts.Fault_checkNameEditPart.VISUAL_ID:
			return getFault_checkName_5063Parser();
		case visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID:
			return getRecorderName_5064Parser();
		case visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID:
			return getOccupantloadName_5065Parser();
		case visGrid.diagram.edit.parts.FuseNameEditPart.VISUAL_ID:
			return getFuseName_5066Parser();
		case visGrid.diagram.edit.parts.Volt_var_controlNameEditPart.VISUAL_ID:
			return getVolt_var_controlName_5067Parser();
		case visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID:
			return getWaterheaterName_5068Parser();
		case visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID:
			return getBatteryName_5069Parser();
		case visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID:
			return getCsv_readerName_5070Parser();
		case visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5071Parser();
		case visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID:
			return getDishwasherName_5072Parser();
		case visGrid.diagram.edit.parts.HistogramNameEditPart.VISUAL_ID:
			return getHistogramName_5073Parser();
		case visGrid.diagram.edit.parts.ShaperNameEditPart.VISUAL_ID:
			return getShaperName_5074Parser();
		case visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID:
			return getGeneratorName_5075Parser();
		case visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID:
			return getTriplex_line_configurationName_5076Parser();
		case visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID:
			return getMotorName_5077Parser();
		case visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID:
			return getDiesel_dgName_5078Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (visGrid.diagram.providers.VisGridElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
