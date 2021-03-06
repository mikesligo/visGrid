package graph;

import java.io.File;
import org.LiveGraph.LiveGraph;

public class GraphHelper {

	public GraphHelper(){
	}
	
	public String getMostRecentFileByName(String dir){
		if (!(new File(dir + "visGridGraphData.csv")).exists()) return "visGridGraphData.csv";
		if (!(new File(dir + "visGridGraphData(1).csv")).exists()) return "visGridGraphData.csv";
		for (int i=2;i<99999;i++){
			if (!(new File(dir + "visGridGraphData("+i+").csv")).exists()) return new String("visGridGraphData("+Integer.toString(i-1)+").csv");
		}
		return null;
	}
	
	public void init(){
		String loc = null;
		try {
			File tempFileLiveGraph = new File("visGridLiveGraph/");
			loc = tempFileLiveGraph.getAbsolutePath() +"/";
			tempFileLiveGraph.mkdirs();
		} catch (Exception e1) {
			System.err.println("Error in GraphHelper when creating new LiveGraphManager");
			e1.printStackTrace();
		}

		try {
			// Create the paramaters to be in visGridGraphData dir and launch
			//String[] params = new String[] {"-dfs",loc+ "dataFileSettings.lgdfs","-gs",loc+"graphSettings.lggs","-dss", loc+"dataSeriesSettings.lgdss", "-f", loc + "visGridGraphData.csv"};
			String[] params = new String[] {"-f",loc + getMostRecentFileByName(loc)};
			LiveGraph app = LiveGraph.application();
			app.execStandalone(params);
		} catch (java.lang.NullPointerException npe){
			System.err.println("Error when starting liveGraph, null pointer exception");
			npe.printStackTrace();
		} catch (Exception e){
			System.err.println("Error when starting liveGraph");
			e.printStackTrace();
		}
	}

}
