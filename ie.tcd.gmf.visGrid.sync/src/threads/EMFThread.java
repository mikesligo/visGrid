package threads;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.net.URI;

import manager.CSVWriterHelper;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.settings.DataFileSettings;
import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.gmf.runtime.diagram.ui.parts.*;

import visGrid.diagram.edit.parts.EvchargerEditPart;
import visGrid.diagram.edit.parts.EvchargerEditPart.EvchargerFigure;
import visGrid.diagram.part.VisGridDiagramEditor;

import files.configReader;
import helper.LiveGraphManager;
import http.Property;

public class EMFThread implements Runnable{
	public IFile file;
	public IWorkbenchWindow window;
	private String updatedVal;
	private HashMap<String,String> map = new HashMap<String,String>();
	private String key;
	private String latestTime;
	public String imagesSTR;
	private LiveGraphManager graph;
	private configReader reader;


	public EMFThread(IFile file, IWorkbenchWindow window){
		this.file = file;
		this.window = window;
		this.updatedVal = null;
		this.imagesSTR = null;
		this.latestTime = "";
		this.reader= new configReader();
		this.init();		
	}

	public void init(){
		try {
			File tempFile = new File("visGridImages/");
			imagesSTR = new String(tempFile.getAbsolutePath() +org.apache.commons.io.FilenameUtils.separatorsToSystem("/"));
			System.out.println("Images directory is: " +imagesSTR.toString());
			File tempFileLiveGraph = new File("visGridLiveGraph/");
			tempFileLiveGraph.mkdirs();
			this.graph = new LiveGraphManager(tempFileLiveGraph.getAbsolutePath());
		} catch (Exception e1) {
			System.err.println("Error when creating URI in EMFThread, for either visGridGraphData.csv, its directory or the visGridImages directory");
			e1.printStackTrace();
		}
	}

	public Float parse(String val){ // parsing the standard way that gridlab-d gives strings, eg. "+234.234 unit"
		try{
			if (val != null){
				if (val.matches("[\\+\\-]\\d+[\\.]*\\d*\\s+\\w+.*")){
					String returnVal = ((String[])val.split(" "))[0];
					returnVal = returnVal.substring(1,returnVal.length());
					Float returnFloat = new Float(returnVal);
					if (returnVal.substring(0,1).equals("-")){ // if it's a negative value
						return -returnFloat;
					}
					else return returnFloat;
				}
				else return null;
			}
		} catch (java.lang.NumberFormatException nfe){
			System.err.println("NumberFormatException with " + val);
			nfe.printStackTrace();
		} catch (java.lang.NullPointerException npe){
			System.err.println("NullPointerException with " + val);
			npe.printStackTrace();
		}
		return 0.0f;
	}

	public String toImagePath(String str){
		return "file:///" +imagesSTR+str;
	}

	public void run() {
		while (true){
			IEditorPart part = null;
			try{
				IWorkbenchPage page = window.getActivePage();
				part = page.getActiveEditor();
			} catch (java.lang.NullPointerException npe){
				return;
			} catch (Exception e){
				e.printStackTrace();
			}
			try {
				if (part instanceof VisGridDiagramEditor){
					VisGridDiagramEditor editor= (VisGridDiagramEditor)part;
					DiagramEditPart diagrampart = editor.getDiagramEditPart();
					List list = diagrampart.getChildren();
					for (int i=0;i<list.size();i++){ 
						ShapeNodeEditPart edit = (ShapeNodeEditPart) list.get(i);
						String mainObjectType = ((String[]) edit.toString().split("EditPart"))[0]; // Parses type eg "House" from class name
						List children2 = ((ShapeNodeEditPart)edit).getChildren();
						String mainObjectName = ((ITextAwareEditPart) children2.get(0)).getEditText();
						for (int j=0;j<children2.size();j++){
							ITextAwareEditPart shapenode = (ITextAwareEditPart) children2.get(j); // NB the val is stored at shapenode.getEditText(), which updates live
							String attributeName = ((String[])shapenode.toString().split("EditPart"))[0].replace(mainObjectType, "");
							if (!attributeName.equalsIgnoreCase("name")){
								if (attributeName.equalsIgnoreCase("realtime")) {
									this.setUpdatedVal(Property.getValue("realtime")); // Get realtime
									shapenode.setLabelText(updatedVal);
								}
								else if (attributeName.equalsIgnoreCase("Simulator")) {
									this.setUpdatedVal(Property.getValue("simtime")); // Get simtime
									this.latestTime = updatedVal;
									shapenode.setLabelText(updatedVal);
								}
								else {
									this.setUpdatedVal(Property.getValueOfProperty(mainObjectName,attributeName.toLowerCase())); // Get standard properties
									if (updatedVal == null) this.setUpdatedVal(Property.getValueOfProperty(mainObjectName,attributeName)); // If it's null then try not lower case
									if (updatedVal != null) { // Otherwise let's set the val
										if (parse(updatedVal) != null){ // parse parses something like "+2.20 degF" with regex, it can be expanded on for non-standard parsings
											String unique = mainObjectName+"-"+attributeName; // Make a unique filename consisting of the mainObjectName (eg. House) and the attributeName (Eg. Air_temperature). The - is used as a seperator as . and _ are used in gridlab-d
											graph.addFloatValue(unique, parse(updatedVal));	// Add new livegraph val, add dataset if it doesn't already exist
										}
										shapenode.setLabelText(updatedVal); // Set the label in GMF with the updated val
									}
									else System.out.println("No Property found for: " +mainObjectName+", "+attributeName);
								}
								key = mainObjectName+attributeName; // Used as the old val for comparing is something has gone up or down
							}
						}
						if (mainObjectType.equalsIgnoreCase("evcharger")){
							try{
								if (updatedVal != null && parse(updatedVal) != null){
									if (imagesSTR != null){
										EvchargerFigure fig = ((EvchargerEditPart) edit).getPrimaryShape();
										SVGFigure svg = (SVGFigure) ((RectangleFigure) fig.getChildren().get(0)).getChildren().get(0); // Get the svgfigure, assuming compartmentalised rectangles holding the figure
										if (parse(updatedVal) == 1){ // If the new temp is larger than the old, change the svg images
											svg.setURI(toImagePath("evcharger6.svg"));
										}
										else if (parse(updatedVal) > 0.8){ 
											svg.setURI(toImagePath("evcharger5.svg"));
										}
										else if (parse(updatedVal) > 0.6){ 
											svg.setURI(toImagePath("evcharger4.svg"));
										}
										else if (parse(updatedVal) > 0.4){ 
											svg.setURI(toImagePath("evcharger3.svg"));
										}
										else if (parse(updatedVal) > 0.2){ 
											svg.setURI(toImagePath("evcharger2.svg"));
										}
										else if (parse(updatedVal) > 0.0){ 
											svg.setURI(toImagePath("evcharger1.svg"));
										}
										else {
											svg.setURI(toImagePath("evcharger0.svg"));
										}
									}
								}
							} catch (java.lang.NullPointerException npe){
								System.err.println("Null pointer exception in custom logic in EMFThread");
							}
						} 
						map.put(key, updatedVal); // Save the old val so we can compare it at the next run
					}
				}
				// Update extra vals found in the ini

				Vector<String[]> extras = reader.getUpdateVals();
				for (int i=0; i<extras.size();i++){
					String first = extras.get(i)[0];
					String second = extras.get(i)[1];
					String extraVal = Property.getValueOfProperty(first,second);
					if (extraVal != null){
						// Add to graph
						graph.addFloatValue(first + "-" + second, parse(extraVal));
					} 
					else System.err.println("Val for extra not found: " + first + ", "+second);
				}
			} catch (Exception e){
				e.printStackTrace();
				continue;
			}
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void setUpdatedVal(String s) {
		this.updatedVal = s;
	}
}