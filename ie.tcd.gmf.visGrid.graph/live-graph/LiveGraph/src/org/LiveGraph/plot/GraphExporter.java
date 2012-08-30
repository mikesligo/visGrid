package org.LiveGraph.plot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JOptionPane;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.gui.ExportImageDialog;

import com.softnetConsult.utils.exceptions.ThrowableTools;

/**
 * Encapsulates the logic of graph image exports.
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007 by G. Paperin.</p>
 * <p>File: GraphExporter.java</p> 
 * <p style="font-size:smaller;">Redistribution and use in source and binary forms, with or
 *    without modification, are permitted provided that the following terms and conditions are met:
 * </p>
 * <p style="font-size:smaller;">1. Redistributions of source code must retain the above
 *    acknowledgement of the LiveGraph project and its web-site, the above copyright notice,
 *    this list of conditions and the following disclaimer.<br />
 *    2. Redistributions in binary form must reproduce the above acknowledgement of the
 *    LiveGraph project and its web-site, the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with
 *    the distribution.<br />
 *    3. All advertising materials mentioning features or use of this software or any derived
 *    software must display the following acknowledgement:<br />
 *    <em>This product includes software developed by the LiveGraph project and its
 *    contributors.<br />(http://www.live-graph.org)</em><br />
 *    4. All advertising materials distributed in form of HTML pages or any other technology
 *    permitting active hyper-links that mention features or use of this software or any
 *    derived software must display the acknowledgment specified in condition 3 of this
 *    agreement, and in addition, include a visible and working hyper-link to the LiveGraph
 *    homepage (http://www.live-graph.org).
 * </p>
 * <p style="font-size:smaller;">THIS SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITHOUT WARRANTY
 *    OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *    MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND  NONINFRINGEMENT. IN NO EVENT SHALL
 *    THE AUTHORS, CONTRIBUTORS OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM, OUT OF OR
 *    IN CONNECTION WITH THE SOFTWARE OR THE USE OR  OTHER DEALINGS IN THE SOFTWARE.
 * </p>
 * 
 * @author Greg Paperin (http://www.paperin.org)
 * @version {@value org.LiveGraph.LiveGraph#version}
 */
public class GraphExporter {

/**
 * Graph plotter.
 */
private Plotter plotter = null;

/**
 * Export settings dialog.
 */
private ExportImageDialog dialog = null;

/**
 * Creates a new exporter.
 * @param plotter Tghe plotter to use with this exporter.
 */
public GraphExporter(Plotter plotter) {
	this.plotter = plotter;
	this.dialog = new ExportImageDialog(this); 
}

/**
 * Initiates an export by showing the options dialog.
 * If the dialog is confirmed, it will call-back this exporter to finish the image creation.
 */
public void exportGraph() {
	dialog.setVisible(true);
}

/**
 * Plots the graph and exports the image to a file.
 * 
 * @param imgWidth Width of the exported image in pixel.
 * @param imgHeight Height of the exported image in pixel.
 * @param imgMIMEType MIME type of the exported image.
 * @param imgFile File of the exported image.
 */
public void doExportGraph(int imgWidth, int imgHeight, String imgMIMEType, File imgFile) {
	
	if (null == imgFile)
		throw new NullPointerException("Cannot export image to a null file");
	
	try {
	
		Iterator<ImageWriter> writers = ImageIO.getImageWritersByMIMEType(imgMIMEType);
		if (!writers.hasNext()) {
			JOptionPane.showMessageDialog(null, "Cannot obtain image writer for MIME-type \""
											  + imgMIMEType + "\".",
										  "Error during image export", JOptionPane.ERROR_MESSAGE);
			return;
		}
		ImageWriter writer = writers.next();
		ImageOutputStream imgOut = null;
		try {
			imgOut = ImageIO.createImageOutputStream(imgFile);
			writer.setOutput(imgOut);
		} catch (IOException e) {
			LiveGraph.application().guiManager().logErrorLn(ThrowableTools.stackTraceToString(e));
			JOptionPane.showMessageDialog(null, "Could not create image output stream.",
										  "Error during image export", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, imgWidth, imgHeight);
		
		plotter.setScreenSize(imgWidth, imgHeight);
		plotter.paint(g);
		
		try {
			writer.write(img);
			imgOut.close();
			writer = null;
		} catch (IOException e) {
			LiveGraph.application().guiManager().logErrorLn(ThrowableTools.stackTraceToString(e));
			JOptionPane.showMessageDialog(null, "Could not write to image.",
					  					  "Error during image export", JOptionPane.ERROR_MESSAGE);
		} catch(IllegalArgumentException e) {
			LiveGraph.application().guiManager().logErrorLn(ThrowableTools.stackTraceToString(e));
			JOptionPane.showMessageDialog(null, e.getMessage() + "\n\nTry choosing another image type.\n ",
					  					  "Error during image export", JOptionPane.ERROR_MESSAGE);
		}
	} catch(SecurityException secE) {
		JOptionPane.showMessageDialog(null, "The Java security environment does not permit the"
						+ " required access rights to export the graph image. \nYou may be running"
						+ " LiveGraph in a restricted security environment. \n\nInfo: \n"
						+ secE.getMessage());
	}
}

/**
 * Disposes of all GUI objects encapsulated in this exporter.
 */
public void disposeInternalGUI() {
	dialog.dispose();
}

}
