package org.LiveGraph.gui;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JDialog;

import org.LiveGraph.plot.GraphExporter;

import com.softnetConsult.utils.files.FileTools;
import com.softnetConsult.utils.swing.DisEnablingPanel;


/**
 * The modal dialog for graph image export.
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007 by G. Paperin.</p>
 * <p>File: ExportImageDialog.java</p> 
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
public class ExportImageDialog extends JDialog {

/**
 * The export worker.
 */
private GraphExporter exporter = null;

/**
 * Constructs a new dialog.
 * 
 * @param exporter Graph exporter.
 */
public ExportImageDialog(GraphExporter exporter) {
	super();
	this.exporter = exporter;
	initialize();
}

/**
 * This method initializes this dialog's view.
 */
private void initialize() {
	
	// Window size and position:
	final int WIN_WIDTH = 470;
	final int WIN_HEIGHT = 220;
	Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds((scr.width - WIN_WIDTH) / 2, (scr.height - WIN_HEIGHT) / 2, WIN_WIDTH, WIN_HEIGHT);
	setTitle("Export graph to file");
	setModal(true);
	this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	final ExportImageDialog EXPORT_DIALOG = this;
	
	
	// Layout:
	
	getContentPane().setLayout(new BorderLayout());
	JButton button = null;
	JPanel panel = null;
	
	// Options:
	
	JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
	panel = (JPanel) p.add(new JPanel(new GridBagLayout()));
	getContentPane().add(p, BorderLayout.CENTER);
	
	panel.add(new JLabel("Image width in pixel:"), Tools.createGridBagConstraints(0, 0, 1, 1));
	panel.add(new JLabel("Image height in pixel:"), Tools.createGridBagConstraints(0, 1, 1, 1));
	panel.add(new JLabel("Image type:"), Tools.createGridBagConstraints(0, 2, 1, 1));
	panel.add(new JLabel("Image file:"), Tools.createGridBagConstraints(0, 3, 1, 1));
		
	final JComboBox imgWidthBox = new JComboBox(new Integer[] {200, 300, 400, 500, 600, 700, 800, 900,
															   1000, 1100, 1200, 1300, 1400, 1500, 1600,
															   1700, 1800, 1900, 2000});
	panel.add(imgWidthBox, Tools.createGridBagConstraints(1, 0, 2, 1));
	
	final JComboBox imgHeightBox = new JComboBox(new Integer[] {200, 300, 400, 500, 600, 700, 800, 900,
			   													1000, 1100, 1200, 1300, 1400, 1500, 1600,
			   													1700, 1800, 1900, 2000});
	panel.add(imgHeightBox, Tools.createGridBagConstraints(1, 1, 2, 1));
	
	final JComboBox imgTypeBox = new JComboBox(ImageIO.getWriterMIMETypes());
	panel.add(imgTypeBox, Tools.createGridBagConstraints(1, 2, 2, 1));
	
	final JTextField imgFileField = new JTextField();
	panel.add(imgFileField, Tools.createGridBagConstraints(1, 3, 1, 1));
	imgFileField.setPreferredSize(new Dimension(200, imgFileField.getPreferredSize().height));
	
	try {
		final JFileChooser imgFileDlg = new JFileChooser("");
		imgFileDlg.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		try {
			imgFileDlg.setCurrentDirectory(new File(System.getProperty("user.dir")));
		} catch(SecurityException e) {
			imgFileDlg.setCurrentDirectory(new File(System.getProperty("user.home")));
		}
		button = null;
		button = new JButton("Browse...");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JFileChooser.APPROVE_OPTION != imgFileDlg.showOpenDialog(EXPORT_DIALOG))
					return;
				
				String selFName = imgFileDlg.getSelectedFile().getAbsolutePath();
				if (!imgFileDlg.getSelectedFile().isDirectory() && 0==FileTools.getExtension(selFName).length()) {
					String mimeType = (String) imgTypeBox.getSelectedItem();
					int p = mimeType.indexOf('/');
					selFName = selFName + "." + mimeType.substring(p + 1);
				}
				imgFileField.setText(selFName);
			}
		});
		panel.add(button, Tools.createGridBagConstraints(2, 3, 1, 1));
	} catch(SecurityException e) {
		if (null != button)
			button.setEnabled(false);
	}
	
	// Buttons:
	
	panel = new DisEnablingPanel(new FlowLayout(FlowLayout.CENTER));
	getContentPane().add(panel, BorderLayout.SOUTH);
	button = new JButton("Export");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (exportConfirmed((Integer) imgWidthBox.getSelectedItem(),
								(Integer) imgHeightBox.getSelectedItem(),
								(String) imgTypeBox.getSelectedItem(),
								imgFileField.getText())) {
				EXPORT_DIALOG.setVisible(false);
			}			
		}
	});
	panel.add(button);
	button = new JButton("Cancel");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { EXPORT_DIALOG.setVisible(false); }
	});
	panel.add(button);
}

/**
 * Verifies the validity of the selected user options and initiates the export.
 * 
 * @param imgWidth Width of the image to export.
 * @param imgHeight Height of the image to export.
 * @param imgType MIME type of the image to export.
 * @param imgFile File of the image to export.
 * @return Whether export has been undertaken.
 */
private boolean exportConfirmed(int imgWidth, int imgHeight, String imgType, String imgFile) {
	
	File file = null;
	try {
		file = (new File(imgFile)).getAbsoluteFile();
		
		if (file.isDirectory()) {
			JOptionPane.showMessageDialog(this, "You have specified a directory.\nPlease specify a file.");
			return false;
		}
		
		if (!file.exists()) {
			File parent = file.getParentFile();
			if (null == parent || !parent.isDirectory() || !parent.exists()) {
				JOptionPane.showMessageDialog(this, "Please specify a filename within an existing directory.");
				return false;
			}		
		}	
		
		if (file.exists()) {
			int opt = JOptionPane.showConfirmDialog(this, "Do you want to overwrite the file\n"
												  		+ file.getAbsolutePath() + "?\n ",
												  	"Overwrite file?", JOptionPane.YES_NO_OPTION);
			if (JOptionPane.YES_OPTION != opt)
				return false;			
		}
	} catch(SecurityException e) {
		JOptionPane.showMessageDialog(this, "The Java security environment does not permit access"
										  + " to the specified file. \nYou may be running LiveGraph in"
										  + " a restricted security environment.");
		return false;
	}
	
	if (null != file)
		exporter.doExportGraph(imgWidth, imgHeight, imgType, file);
	
	return true;
}

}
