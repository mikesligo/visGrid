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
	private IParser transformerName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getTransformerName_5027Parser() {
		if (transformerName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			transformerName_5027Parser = parser;
		}
		return transformerName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser relayName_5056Parser;

	/**
	 * @generated
	 */
	private IParser getRelayName_5056Parser() {
		if (relayName_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			relayName_5056Parser = parser;
		}
		return relayName_5056Parser;
	}

	/**
	 * @generated
	 */
	private IParser freezerName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getFreezerName_5003Parser() {
		if (freezerName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			freezerName_5003Parser = parser;
		}
		return freezerName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser generatorName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getGeneratorName_5013Parser() {
		if (generatorName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			generatorName_5013Parser = parser;
		}
		return generatorName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_lineName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_lineName_5028Parser() {
		if (triplex_lineName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_lineName_5028Parser = parser;
		}
		return triplex_lineName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser regulator_configurationName_5035Parser;

	/**
	 * @generated
	 */
	private IParser getRegulator_configurationName_5035Parser() {
		if (regulator_configurationName_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			regulator_configurationName_5035Parser = parser;
		}
		return regulator_configurationName_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_nodeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_nodeName_5005Parser() {
		if (triplex_nodeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_nodeName_5005Parser = parser;
		}
		return triplex_nodeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser commName_5064Parser;

	/**
	 * @generated
	 */
	private IParser getCommName_5064Parser() {
		if (commName_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			commName_5064Parser = parser;
		}
		return commName_5064Parser;
	}

	/**
	 * @generated
	 */
	private IParser shaperName_5050Parser;

	/**
	 * @generated
	 */
	private IParser getShaperName_5050Parser() {
		if (shaperName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			shaperName_5050Parser = parser;
		}
		return shaperName_5050Parser;
	}

	/**
	 * @generated
	 */
	private IParser officeName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getOfficeName_5029Parser() {
		if (officeName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			officeName_5029Parser = parser;
		}
		return officeName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser fuseName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getFuseName_5020Parser() {
		if (fuseName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			fuseName_5020Parser = parser;
		}
		return fuseName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser substationName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getSubstationName_5033Parser() {
		if (substationName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			substationName_5033Parser = parser;
		}
		return substationName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser lineName_5017Parser;

	/**
	 * @generated
	 */
	private IParser getLineName_5017Parser() {
		if (lineName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			lineName_5017Parser = parser;
		}
		return lineName_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser line_spacingName_5055Parser;

	/**
	 * @generated
	 */
	private IParser getLine_spacingName_5055Parser() {
		if (line_spacingName_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			line_spacingName_5055Parser = parser;
		}
		return line_spacingName_5055Parser;
	}

	/**
	 * @generated
	 */
	private IParser motorName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getMotorName_5011Parser() {
		if (motorName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			motorName_5011Parser = parser;
		}
		return motorName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser auctionName_5060Parser;

	/**
	 * @generated
	 */
	private IParser getAuctionName_5060Parser() {
		if (auctionName_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			auctionName_5060Parser = parser;
		}
		return auctionName_5060Parser;
	}

	/**
	 * @generated
	 */
	private IParser windturb_dgName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getWindturb_dgName_5024Parser() {
		if (windturb_dgName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			windturb_dgName_5024Parser = parser;
		}
		return windturb_dgName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser pqloadName_5061Parser;

	/**
	 * @generated
	 */
	private IParser getPqloadName_5061Parser() {
		if (pqloadName_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			pqloadName_5061Parser = parser;
		}
		return pqloadName_5061Parser;
	}

	/**
	 * @generated
	 */
	private IParser energy_storageName_5062Parser;

	/**
	 * @generated
	 */
	private IParser getEnergy_storageName_5062Parser() {
		if (energy_storageName_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			energy_storageName_5062Parser = parser;
		}
		return energy_storageName_5062Parser;
	}

	/**
	 * @generated
	 */
	private IParser transformer_configurationName_5040Parser;

	/**
	 * @generated
	 */
	private IParser getTransformer_configurationName_5040Parser() {
		if (transformer_configurationName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			transformer_configurationName_5040Parser = parser;
		}
		return transformer_configurationName_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser overhead_lineName_5036Parser;

	/**
	 * @generated
	 */
	private IParser getOverhead_lineName_5036Parser() {
		if (overhead_lineName_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			overhead_lineName_5036Parser = parser;
		}
		return overhead_lineName_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser residential_enduseName_5037Parser;

	/**
	 * @generated
	 */
	private IParser getResidential_enduseName_5037Parser() {
		if (residential_enduseName_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			residential_enduseName_5037Parser = parser;
		}
		return residential_enduseName_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser histogramName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getHistogramName_5001Parser() {
		if (histogramName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			histogramName_5001Parser = parser;
		}
		return histogramName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser histogramFilename_5082Parser;

	/**
	 * @generated
	 */
	private IParser getHistogramFilename_5082Parser() {
		if (histogramFilename_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getHistogram_Filename() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			histogramFilename_5082Parser = parser;
		}
		return histogramFilename_5082Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_line_configurationName_5049Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_line_configurationName_5049Parser() {
		if (triplex_line_configurationName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_line_configurationName_5049Parser = parser;
		}
		return triplex_line_configurationName_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser controller2Name_5004Parser;

	/**
	 * @generated
	 */
	private IParser getController2Name_5004Parser() {
		if (controller2Name_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			controller2Name_5004Parser = parser;
		}
		return controller2Name_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser waterheaterName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getWaterheaterName_5002Parser() {
		if (waterheaterName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			waterheaterName_5002Parser = parser;
		}
		return waterheaterName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser house_aName_5058Parser;

	/**
	 * @generated
	 */
	private IParser getHouse_aName_5058Parser() {
		if (house_aName_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			house_aName_5058Parser = parser;
		}
		return house_aName_5058Parser;
	}

	/**
	 * @generated
	 */
	private IParser frequency_genName_5057Parser;

	/**
	 * @generated
	 */
	private IParser getFrequency_genName_5057Parser() {
		if (frequency_genName_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			frequency_genName_5057Parser = parser;
		}
		return frequency_genName_5057Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_line_conductorName_5039Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_line_conductorName_5039Parser() {
		if (triplex_line_conductorName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_line_conductorName_5039Parser = parser;
		}
		return triplex_line_conductorName_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser restorationName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getRestorationName_5010Parser() {
		if (restorationName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			restorationName_5010Parser = parser;
		}
		return restorationName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser volt_var_controlName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getVolt_var_controlName_5023Parser() {
		if (volt_var_controlName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			volt_var_controlName_5023Parser = parser;
		}
		return volt_var_controlName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser weatherName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getWeatherName_5021Parser() {
		if (weatherName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			weatherName_5021Parser = parser;
		}
		return weatherName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectorName_5073Parser;

	/**
	 * @generated
	 */
	private IParser getCollectorName_5073Parser() {
		if (collectorName_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			collectorName_5073Parser = parser;
		}
		return collectorName_5073Parser;
	}

	/**
	 * @generated
	 */
	private IParser csv_readerName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getCsv_readerName_5022Parser() {
		if (csv_readerName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			csv_readerName_5022Parser = parser;
		}
		return csv_readerName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser csv_readerFilename_5081Parser;

	/**
	 * @generated
	 */
	private IParser getCsv_readerFilename_5081Parser() {
		if (csv_readerFilename_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getCsv_reader_Filename() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			csv_readerFilename_5081Parser = parser;
		}
		return csv_readerFilename_5081Parser;
	}

	/**
	 * @generated
	 */
	private IParser rectifierName_5052Parser;

	/**
	 * @generated
	 */
	private IParser getRectifierName_5052Parser() {
		if (rectifierName_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			rectifierName_5052Parser = parser;
		}
		return rectifierName_5052Parser;
	}

	/**
	 * @generated
	 */
	private IParser lightsName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getLightsName_5015Parser() {
		if (lightsName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			lightsName_5015Parser = parser;
		}
		return lightsName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser loadName_5044Parser;

	/**
	 * @generated
	 */
	private IParser getLoadName_5044Parser() {
		if (loadName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			loadName_5044Parser = parser;
		}
		return loadName_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser stubauctionName_5053Parser;

	/**
	 * @generated
	 */
	private IParser getStubauctionName_5053Parser() {
		if (stubauctionName_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			stubauctionName_5053Parser = parser;
		}
		return stubauctionName_5053Parser;
	}

	/**
	 * @generated
	 */
	private IParser voltdumpName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getVoltdumpName_5026Parser() {
		if (voltdumpName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			voltdumpName_5026Parser = parser;
		}
		return voltdumpName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser voltdumpFilename_5080Parser;

	/**
	 * @generated
	 */
	private IParser getVoltdumpFilename_5080Parser() {
		if (voltdumpFilename_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getVoltdump_Filename() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			voltdumpFilename_5080Parser = parser;
		}
		return voltdumpFilename_5080Parser;
	}

	/**
	 * @generated
	 */
	private IParser series_reactorName_5072Parser;

	/**
	 * @generated
	 */
	private IParser getSeries_reactorName_5072Parser() {
		if (series_reactorName_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			series_reactorName_5072Parser = parser;
		}
		return series_reactorName_5072Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5032Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5032Parser() {
		if (nodeName_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			nodeName_5032Parser = parser;
		}
		return nodeName_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser refrigeratorName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getRefrigeratorName_5008Parser() {
		if (refrigeratorName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			refrigeratorName_5008Parser = parser;
		}
		return refrigeratorName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser triplex_meterName_5065Parser;

	/**
	 * @generated
	 */
	private IParser getTriplex_meterName_5065Parser() {
		if (triplex_meterName_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			triplex_meterName_5065Parser = parser;
		}
		return triplex_meterName_5065Parser;
	}

	/**
	 * @generated
	 */
	private IParser power_electronicsName_5068Parser;

	/**
	 * @generated
	 */
	private IParser getPower_electronicsName_5068Parser() {
		if (power_electronicsName_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			power_electronicsName_5068Parser = parser;
		}
		return power_electronicsName_5068Parser;
	}

	/**
	 * @generated
	 */
	private IParser climateName_5059Parser;

	/**
	 * @generated
	 */
	private IParser getClimateName_5059Parser() {
		if (climateName_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			climateName_5059Parser = parser;
		}
		return climateName_5059Parser;
	}

	/**
	 * @generated
	 */
	private IParser switchName_5067Parser;

	/**
	 * @generated
	 */
	private IParser getSwitchName_5067Parser() {
		if (switchName_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			switchName_5067Parser = parser;
		}
		return switchName_5067Parser;
	}

	/**
	 * @generated
	 */
	private IParser billdumpName_5077Parser;

	/**
	 * @generated
	 */
	private IParser getBilldumpName_5077Parser() {
		if (billdumpName_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			billdumpName_5077Parser = parser;
		}
		return billdumpName_5077Parser;
	}

	/**
	 * @generated
	 */
	private IParser billdumpFilename_5079Parser;

	/**
	 * @generated
	 */
	private IParser getBilldumpFilename_5079Parser() {
		if (billdumpFilename_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getBilldump_Filename() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			billdumpFilename_5079Parser = parser;
		}
		return billdumpFilename_5079Parser;
	}

	/**
	 * @generated
	 */
	private IParser meterName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getMeterName_5018Parser() {
		if (meterName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			meterName_5018Parser = parser;
		}
		return meterName_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser line_configurationName_5031Parser;

	/**
	 * @generated
	 */
	private IParser getLine_configurationName_5031Parser() {
		if (line_configurationName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			line_configurationName_5031Parser = parser;
		}
		return line_configurationName_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser dc_dc_converterName_5070Parser;

	/**
	 * @generated
	 */
	private IParser getDc_dc_converterName_5070Parser() {
		if (dc_dc_converterName_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			dc_dc_converterName_5070Parser = parser;
		}
		return dc_dc_converterName_5070Parser;
	}

	/**
	 * @generated
	 */
	private IParser plugloadName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getPlugloadName_5045Parser() {
		if (plugloadName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			plugloadName_5045Parser = parser;
		}
		return plugloadName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser dishwasherName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDishwasherName_5009Parser() {
		if (dishwasherName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			dishwasherName_5009Parser = parser;
		}
		return dishwasherName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser solarName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getSolarName_5046Parser() {
		if (solarName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			solarName_5046Parser = parser;
		}
		return solarName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser linkName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getLinkName_5025Parser() {
		if (linkName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			linkName_5025Parser = parser;
		}
		return linkName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser houseName_5075Parser;

	/**
	 * @generated
	 */
	private IParser getHouseName_5075Parser() {
		if (houseName_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			houseName_5075Parser = parser;
		}
		return houseName_5075Parser;
	}

	/**
	 * @generated
	 */
	private IParser capacitorName_5051Parser;

	/**
	 * @generated
	 */
	private IParser getCapacitorName_5051Parser() {
		if (capacitorName_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			capacitorName_5051Parser = parser;
		}
		return capacitorName_5051Parser;
	}

	/**
	 * @generated
	 */
	private IParser evchargerName_5074Parser;

	/**
	 * @generated
	 */
	private IParser getEvchargerName_5074Parser() {
		if (evchargerName_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			evchargerName_5074Parser = parser;
		}
		return evchargerName_5074Parser;
	}

	/**
	 * @generated
	 */
	private IParser batteryName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getBatteryName_5042Parser() {
		if (batteryName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			batteryName_5042Parser = parser;
		}
		return batteryName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser microturbineName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getMicroturbineName_5014Parser() {
		if (microturbineName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			microturbineName_5014Parser = parser;
		}
		return microturbineName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser diesel_dgName_5041Parser;

	/**
	 * @generated
	 */
	private IParser getDiesel_dgName_5041Parser() {
		if (diesel_dgName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			diesel_dgName_5041Parser = parser;
		}
		return diesel_dgName_5041Parser;
	}

	/**
	 * @generated
	 */
	private IParser microwaveName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getMicrowaveName_5034Parser() {
		if (microwaveName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			microwaveName_5034Parser = parser;
		}
		return microwaveName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser inverterName_5048Parser;

	/**
	 * @generated
	 */
	private IParser getInverterName_5048Parser() {
		if (inverterName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			inverterName_5048Parser = parser;
		}
		return inverterName_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser playerName_5047Parser;

	/**
	 * @generated
	 */
	private IParser getPlayerName_5047Parser() {
		if (playerName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			playerName_5047Parser = parser;
		}
		return playerName_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser regulatorName_5069Parser;

	/**
	 * @generated
	 */
	private IParser getRegulatorName_5069Parser() {
		if (regulatorName_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			regulatorName_5069Parser = parser;
		}
		return regulatorName_5069Parser;
	}

	/**
	 * @generated
	 */
	private IParser regulatorName_5083Parser;

	/**
	 * @generated
	 */
	private IParser getRegulatorName_5083Parser() {
		if (regulatorName_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			regulatorName_5083Parser = parser;
		}
		return regulatorName_5083Parser;
	}

	/**
	 * @generated
	 */
	private IParser dryerName_5076Parser;

	/**
	 * @generated
	 */
	private IParser getDryerName_5076Parser() {
		if (dryerName_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			dryerName_5076Parser = parser;
		}
		return dryerName_5076Parser;
	}

	/**
	 * @generated
	 */
	private IParser multizoneName_5019Parser;

	/**
	 * @generated
	 */
	private IParser getMultizoneName_5019Parser() {
		if (multizoneName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			multizoneName_5019Parser = parser;
		}
		return multizoneName_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser capbankName_5030Parser;

	/**
	 * @generated
	 */
	private IParser getCapbankName_5030Parser() {
		if (capbankName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			capbankName_5030Parser = parser;
		}
		return capbankName_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser occupantloadName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getOccupantloadName_5012Parser() {
		if (occupantloadName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			occupantloadName_5012Parser = parser;
		}
		return occupantloadName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser underground_lineName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getUnderground_lineName_5043Parser() {
		if (underground_lineName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			underground_lineName_5043Parser = parser;
		}
		return underground_lineName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser plcName_5054Parser;

	/**
	 * @generated
	 */
	private IParser getPlcName_5054Parser() {
		if (plcName_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			plcName_5054Parser = parser;
		}
		return plcName_5054Parser;
	}

	/**
	 * @generated
	 */
	private IParser recorderName_5038Parser;

	/**
	 * @generated
	 */
	private IParser getRecorderName_5038Parser() {
		if (recorderName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			recorderName_5038Parser = parser;
		}
		return recorderName_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser clotheswasherName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getClotheswasherName_5006Parser() {
		if (clotheswasherName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			clotheswasherName_5006Parser = parser;
		}
		return clotheswasherName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser fault_checkName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getFault_checkName_5007Parser() {
		if (fault_checkName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			fault_checkName_5007Parser = parser;
		}
		return fault_checkName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser underground_line_conductorName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getUnderground_line_conductorName_5016Parser() {
		if (underground_line_conductorName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			underground_line_conductorName_5016Parser = parser;
		}
		return underground_line_conductorName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser rangeName_5071Parser;

	/**
	 * @generated
	 */
	private IParser getRangeName_5071Parser() {
		if (rangeName_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			rangeName_5071Parser = parser;
		}
		return rangeName_5071Parser;
	}

	/**
	 * @generated
	 */
	private IParser overhead_line_conductorName_5063Parser;

	/**
	 * @generated
	 */
	private IParser getOverhead_line_conductorName_5063Parser() {
		if (overhead_line_conductorName_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			overhead_line_conductorName_5063Parser = parser;
		}
		return overhead_line_conductorName_5063Parser;
	}

	/**
	 * @generated
	 */
	private IParser controllerName_5066Parser;

	/**
	 * @generated
	 */
	private IParser getControllerName_5066Parser() {
		if (controllerName_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			controllerName_5066Parser = parser;
		}
		return controllerName_5066Parser;
	}

	/**
	 * @generated
	 */
	private IParser zIPloadName_5078Parser;

	/**
	 * @generated
	 */
	private IParser getZIPloadName_5078Parser() {
		if (zIPloadName_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { visGrid.VisGridPackage.eINSTANCE
					.getConnection_Name() };
			visGrid.diagram.parsers.MessageFormatParser parser = new visGrid.diagram.parsers.MessageFormatParser(
					features);
			zIPloadName_5078Parser = parser;
		}
		return zIPloadName_5078Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID:
			return getTransformerName_5027Parser();
		case visGrid.diagram.edit.parts.RelayNameEditPart.VISUAL_ID:
			return getRelayName_5056Parser();
		case visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID:
			return getFreezerName_5003Parser();
		case visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID:
			return getGeneratorName_5013Parser();
		case visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID:
			return getTriplex_lineName_5028Parser();
		case visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID:
			return getRegulator_configurationName_5035Parser();
		case visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID:
			return getTriplex_nodeName_5005Parser();
		case visGrid.diagram.edit.parts.CommNameEditPart.VISUAL_ID:
			return getCommName_5064Parser();
		case visGrid.diagram.edit.parts.ShaperNameEditPart.VISUAL_ID:
			return getShaperName_5050Parser();
		case visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID:
			return getOfficeName_5029Parser();
		case visGrid.diagram.edit.parts.FuseNameEditPart.VISUAL_ID:
			return getFuseName_5020Parser();
		case visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID:
			return getSubstationName_5033Parser();
		case visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID:
			return getLineName_5017Parser();
		case visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID:
			return getLine_spacingName_5055Parser();
		case visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID:
			return getMotorName_5011Parser();
		case visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID:
			return getAuctionName_5060Parser();
		case visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID:
			return getWindturb_dgName_5024Parser();
		case visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID:
			return getPqloadName_5061Parser();
		case visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID:
			return getEnergy_storageName_5062Parser();
		case visGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID:
			return getTransformer_configurationName_5040Parser();
		case visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID:
			return getOverhead_lineName_5036Parser();
		case visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID:
			return getResidential_enduseName_5037Parser();
		case visGrid.diagram.edit.parts.HistogramNameEditPart.VISUAL_ID:
			return getHistogramName_5001Parser();
		case visGrid.diagram.edit.parts.HistogramFilenameEditPart.VISUAL_ID:
			return getHistogramFilename_5082Parser();
		case visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID:
			return getTriplex_line_configurationName_5049Parser();
		case visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID:
			return getController2Name_5004Parser();
		case visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID:
			return getWaterheaterName_5002Parser();
		case visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID:
			return getHouse_aName_5058Parser();
		case visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID:
			return getFrequency_genName_5057Parser();
		case visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart.VISUAL_ID:
			return getTriplex_line_conductorName_5039Parser();
		case visGrid.diagram.edit.parts.RestorationNameEditPart.VISUAL_ID:
			return getRestorationName_5010Parser();
		case visGrid.diagram.edit.parts.Volt_var_controlNameEditPart.VISUAL_ID:
			return getVolt_var_controlName_5023Parser();
		case visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID:
			return getWeatherName_5021Parser();
		case visGrid.diagram.edit.parts.CollectorNameEditPart.VISUAL_ID:
			return getCollectorName_5073Parser();
		case visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID:
			return getCsv_readerName_5022Parser();
		case visGrid.diagram.edit.parts.Csv_readerFilenameEditPart.VISUAL_ID:
			return getCsv_readerFilename_5081Parser();
		case visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID:
			return getRectifierName_5052Parser();
		case visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID:
			return getLightsName_5015Parser();
		case visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID:
			return getLoadName_5044Parser();
		case visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID:
			return getStubauctionName_5053Parser();
		case visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID:
			return getVoltdumpName_5026Parser();
		case visGrid.diagram.edit.parts.VoltdumpFilenameEditPart.VISUAL_ID:
			return getVoltdumpFilename_5080Parser();
		case visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID:
			return getSeries_reactorName_5072Parser();
		case visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID:
			return getNodeName_5032Parser();
		case visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID:
			return getRefrigeratorName_5008Parser();
		case visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID:
			return getTriplex_meterName_5065Parser();
		case visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID:
			return getPower_electronicsName_5068Parser();
		case visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID:
			return getClimateName_5059Parser();
		case visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID:
			return getSwitchName_5067Parser();
		case visGrid.diagram.edit.parts.BilldumpNameEditPart.VISUAL_ID:
			return getBilldumpName_5077Parser();
		case visGrid.diagram.edit.parts.BilldumpFilenameEditPart.VISUAL_ID:
			return getBilldumpFilename_5079Parser();
		case visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID:
			return getMeterName_5018Parser();
		case visGrid.diagram.edit.parts.Line_configurationNameEditPart.VISUAL_ID:
			return getLine_configurationName_5031Parser();
		case visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID:
			return getDc_dc_converterName_5070Parser();
		case visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID:
			return getPlugloadName_5045Parser();
		case visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID:
			return getDishwasherName_5009Parser();
		case visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID:
			return getSolarName_5046Parser();
		case visGrid.diagram.edit.parts.LinkNameEditPart.VISUAL_ID:
			return getLinkName_5025Parser();
		case visGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID:
			return getHouseName_5075Parser();
		case visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID:
			return getCapacitorName_5051Parser();
		case visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID:
			return getEvchargerName_5074Parser();
		case visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID:
			return getBatteryName_5042Parser();
		case visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID:
			return getMicroturbineName_5014Parser();
		case visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID:
			return getDiesel_dgName_5041Parser();
		case visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID:
			return getMicrowaveName_5034Parser();
		case visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID:
			return getInverterName_5048Parser();
		case visGrid.diagram.edit.parts.PlayerNameEditPart.VISUAL_ID:
			return getPlayerName_5047Parser();
		case visGrid.diagram.edit.parts.RegulatorNameEditPart.VISUAL_ID:
			return getRegulatorName_5069Parser();
		case visGrid.diagram.edit.parts.RegulatorName2EditPart.VISUAL_ID:
			return getRegulatorName_5083Parser();
		case visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID:
			return getDryerName_5076Parser();
		case visGrid.diagram.edit.parts.MultizoneNameEditPart.VISUAL_ID:
			return getMultizoneName_5019Parser();
		case visGrid.diagram.edit.parts.CapbankNameEditPart.VISUAL_ID:
			return getCapbankName_5030Parser();
		case visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID:
			return getOccupantloadName_5012Parser();
		case visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID:
			return getUnderground_lineName_5043Parser();
		case visGrid.diagram.edit.parts.PlcNameEditPart.VISUAL_ID:
			return getPlcName_5054Parser();
		case visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID:
			return getRecorderName_5038Parser();
		case visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID:
			return getClotheswasherName_5006Parser();
		case visGrid.diagram.edit.parts.Fault_checkNameEditPart.VISUAL_ID:
			return getFault_checkName_5007Parser();
		case visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart.VISUAL_ID:
			return getUnderground_line_conductorName_5016Parser();
		case visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID:
			return getRangeName_5071Parser();
		case visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart.VISUAL_ID:
			return getOverhead_line_conductorName_5063Parser();
		case visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5066Parser();
		case visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID:
			return getZIPloadName_5078Parser();
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
