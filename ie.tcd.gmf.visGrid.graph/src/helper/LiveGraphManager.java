package helper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.LiveGraph.dataFile.write.DataStreamWriter;
import org.LiveGraph.dataFile.write.DataStreamWriterFactory;
import org.LiveGraph.settings.DataFileSettings;

public class LiveGraphManager {
	public String saveLocation;
	private DataStreamWriter out;
	private HashMap<String, Float> datasets;
	private Boolean addingDatasets;
	private String firstLabel; // Used to know when we've looped around and we should write the data to the disk

	public LiveGraphManager(String strs){
		this.saveLocation = strs;
		this.firstLabel = null;
		this.addingDatasets = true;
		this.datasets = new HashMap<String,Float>();
		this.init();
	}

	public void addDataSeries(String label){
		out.addDataSeries(label);
	}

	public void writeData(){
		// Write dataset to disk:
		out.writeDataSet();
	}

	public void addFloatValue(String label, Float val){
		// So this method is more complicated than you might expect	 because with LiveGraph the datasets need to be written before any values
		if (this.addingDatasets){
			this.datasets.put(label, val);
			this.addDataSeries(label);
			if (this.firstLabel != null){
				if (this.firstLabel.equals(label)){
					this.writeInitialData();
					this.addingDatasets = false;
				}
			} 
			else this.firstLabel = label; // Set the first label, needed for first run
		}
		else{
			this.out.setDataValue(label, val);
			if (this.firstLabel.equals(label)){
				this.out.writeDataSet();
			}
		}
	}

	private void writeInitialData() {
		// go through hash map and add all dataValues, as the dataset labels were added upon discovery
		Iterator it = datasets.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			//System.out.println(pairs.getKey() + " = " + pairs.getValue());
			this.out.setDataValue((String)pairs.getKey(), (Float) pairs.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

	public void close(){
		this.out.close();
	}

	public void init() {
		try {
			// Setup a data writer object:
			out = DataStreamWriterFactory.createDataWriter(saveLocation, "visGridGraphData", "csv");
			System.out.println(out.getObjFile().getAbsolutePath());
		} catch (org.LiveGraph.dataFile.write.DataFileAlreadyExistsException dfaee){
			System.err.println("Problem making writer, data file already exists");
			dfaee.printStackTrace();
		}
		// Set a values separator:
		out.setSeparator(",");
		// Add a file description line:
		out.writeFileInfo("GridLAB-D Runtime Data");

		// Check for IOErrors:      
		if (out.hadIOException()) {
			out.getIOException().printStackTrace();
			out.resetIOException();
		}
	}

}
