package threads;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

import visGrid.diagram.edit.parts.EvchargerEditPart;
import visGrid.diagram.edit.parts.EvchargerEditPart.EvchargerFigure;
import visGrid.diagram.edit.parts.HouseEditPart;
import visGrid.diagram.edit.parts.HouseEditPart.HouseFigure;
import visGrid.diagram.part.VisGridDiagramEditor;

import http.Property;

public class EMFThread implements Runnable{
	public IFile file;
	public IWorkbenchWindow window;
	private String updatedVal;
	private HashMap<String,String> map = new HashMap<String,String>();
	private String key;
	public URI imagesURI;
	

	public EMFThread(IFile file, IWorkbenchWindow window){
		this.file = file;
		this.window = window;
		this.updatedVal = null;
		this.imagesURI = null;
	}

	public Float parseStandard(String val){ // parsing the standard way that gridlab-d gives strings, eg. "+234.234 unit"
		if (val != null){
			String returnVal = ((String[])val.split(" "))[0];
			returnVal = returnVal.substring(1,returnVal.length());
			Float returnFloat = new Float(returnVal);
			if (returnVal.substring(0,1).equals("-")){ // if it's a negative value
				return -returnFloat;
			}
			else return returnFloat;
		}
		return 0.0f;
	}
	
	public String toImagePath(String str){
		return org.apache.commons.io.FilenameUtils.separatorsToSystem(new String("file://"+imagesURI.toString()+str));
	}

	public void run() {
		try {
			File tempFile = new File("");
			imagesURI = new URI(org.apache.commons.io.FilenameUtils.separatorsToSystem(new String(tempFile.getAbsolutePath() +"\\visGridImages\\")));
			System.out.println("Images directory is: " +imagesURI.toString());
		} catch (URISyntaxException e1) {
			System.out.println("Error when creating imagesURI to visGridImages");
		}
		while (true){
			try{
				IWorkbenchPage page = window.getActivePage();
				IEditorPart part = page.getActiveEditor();
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
								if (attributeName.equalsIgnoreCase("realtime")) this.setUpdatedVal(Property.getValue("realtime")); // Get realtime
								else if (attributeName.equalsIgnoreCase("Simulator")) this.setUpdatedVal(Property.getValue("simtime")); // Get simtime
								else this.setUpdatedVal(Property.getValueOfProperty(mainObjectName,attributeName.toLowerCase())); // Get standard properties
								if (updatedVal == null) this.setUpdatedVal(Property.getValueOfProperty(mainObjectName,attributeName));
								if (updatedVal != null) {
									shapenode.setLabelText(updatedVal);
								}
								else System.out.println("No Property found for: " +mainObjectName+", "+attributeName);
								key = mainObjectName+attributeName;
							}
						}
						if (mainObjectType.equalsIgnoreCase("evcharger")){
							if (updatedVal != null){
								if (imagesURI != null){
									EvchargerFigure fig = ((EvchargerEditPart) edit).getPrimaryShape();
									SVGFigure svg = (SVGFigure)((RectangleFigure) fig.getChildren().get(0)).getChildren().get(0); // Get the svgfigure, assuming compartmentalised rectangles holding the figure
									if (parseStandard(updatedVal) == 1){ // If the new temp is larger than the old, change the svg images
										svg.setURI(toImagePath("evcharger6.svg"));
									}
									else if (parseStandard(updatedVal) > 0.8){ 
										svg.setURI(toImagePath("evcharger5.svg"));
									}
									else if (parseStandard(updatedVal) > 0.6){ 
										svg.setURI(toImagePath("evcharger4.svg"));
									}
									else if (parseStandard(updatedVal) > 0.4){ 
										svg.setURI(toImagePath("evcharger3.svg"));
									}
									else if (parseStandard(updatedVal) > 0.2){ 
										svg.setURI(toImagePath("evcharger2.svg"));
									}
									else if (parseStandard(updatedVal) > 0.0){ 
										svg.setURI(toImagePath("evcharger1.svg"));
									}
									else {
										svg.setURI(toImagePath("evcharger0.svg"));
									}
								}
							}
						} 
						map.put(key, updatedVal); // Save the old val so we can compare it at the next run
					}
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