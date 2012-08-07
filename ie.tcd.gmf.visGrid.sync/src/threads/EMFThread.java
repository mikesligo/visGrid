package threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.impl.DecorationNodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;

import visGrid.diagram.edit.parts.HouseEditPart;
import visGrid.diagram.edit.parts.HouseEditPart.HouseFigure;
import visGrid.diagram.edit.parts.WaterheaterEditPart;
import visGrid.diagram.part.VisGridDiagramEditor;

import http.Property;

public class EMFThread implements Runnable{
	public IFile file;
	public IProject proj;
	public IWorkbenchWindow window;
	private String updatedVal;
	private String oldHouseVal;

	public EMFThread(IFile file, IProject proj, IWorkbenchWindow window){
		this.file = file;
		this.proj = proj;
		this.window = window;
		this.updatedVal = null;
		this.oldHouseVal = null;
	}

	public Float parseTemperature(String val){
		if (val != null){
			String returnVal = ((String[])val.split(" "))[0];
			returnVal = returnVal.substring(1,returnVal.length());
			return new Float(returnVal);
		}
		return 0.0f;
	}

	public void run() {
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
						for (int j=1;j<children2.size();j++){
							ITextAwareEditPart shapenode = (ITextAwareEditPart) children2.get(j); // NB the val is stored at shapenode.getEditText(), which updates live
							String attributeName = ((String[])shapenode.toString().split("EditPart"))[0].replace(mainObjectType, "");
							this.setUpdatedVal(Property.getValueOfProperty(mainObjectName,attributeName.toLowerCase()));
							if (updatedVal == null) this.setUpdatedVal(Property.getValueOfProperty(mainObjectName,attributeName));
							if (updatedVal != null) {
								shapenode.setLabelText(updatedVal);
							}
							else System.out.println("No Property found for: " +mainObjectName+", "+attributeName);
						}

						// The following is a template for making an icon change depending on certain conditions
						// In this example house will change if the new temp is larger than the old temp
						if (mainObjectType.equalsIgnoreCase("house")){
							if (updatedVal != null){
								if (oldHouseVal != null){
									HouseFigure fig = ((HouseEditPart) edit).getPrimaryShape();
									SVGFigure svg = (SVGFigure)((RectangleFigure) fig.getChildren().get(0)).getChildren().get(0); // Get the svgfigure, assuming compartmentalised rectangles holding the figure
									if (parseTemperature(updatedVal) > parseTemperature(oldHouseVal)){ // If the new temp is larger than the old, change the svg image
										// svg.setURI("file:///home/mike/src/visGrid/ie.tcd.gmf.visGrid/images/conf.svg");
									}
									else { // Otherwise reset the svg image
										// svg.setURI("file:///home/mike/src/visGrid/ie.tcd.gmf.visGrid/images/house.svg");
									}
								}
								oldHouseVal = updatedVal;
							}
						} // End of template

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