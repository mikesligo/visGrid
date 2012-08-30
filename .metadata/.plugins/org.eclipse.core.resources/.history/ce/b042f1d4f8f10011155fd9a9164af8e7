package org.LiveGraph.demoDataSource;

import java.io.IOException;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataFile.common.PipeClosedByReaderException;
import org.LiveGraph.dataFile.write.DataStreamWriter;

import com.softnetConsult.utils.sys.SystemTools;


/**
 * This is a demo showing how to use LiveGraph in memory stream mode, i.e. how to feed data to LiveGraph
 * without through a memory stream, without using a file on the hard disk.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: LiveGraphMemoryStreamDemo.java</p>
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
 * @author Greg Paperin (<a href="http://www.paperin.org" target="_blank">http://www.paperin.org</a>)
 * @version {@value org.LiveGraph.LiveGraph#version}
 *
 */
public class LiveGraphMemoryStreamDemo {

public static final int SLEEP_MEAN = 100;
public static final int SLEEP_SCATTER = 100;
public static final int BURST_MEAN = 10;
public static final int BURST_SCATTER = 5;
public static final int MAX_DATASETS = 100000;

public void exec() throws IOException {
	
	// Print a welcome message:
	System.out.println("Welcome to the LiveGraph memory mode demo.");
	
	// Start LiveGraph:
	LiveGraph lg = LiveGraph.application();
	lg.execStandalone();
	
	// Turn LiveGraph into memory mode:
	DataStreamWriter out = lg.updateInvoker().startMemoryStreamMode();
	if (null == out) {
		System.out.println("Could not switch LiveGraph into memory stream mode.");
		lg.disposeGUIAndExit();
		return;
	}
		
	
	// Set a values separator:
	out.setSeparator(";");
	
	// Add a file description line:
	out.writeFileInfo("LiveGraph demo file.");
	
	// Set-up the data series:
	out.addDataSeries("Time");
	out.addDataSeries("Dataset number");
	out.addDataSeries("Burst number");
	out.addDataSeries("Random value");
	
	// Loop until enough datasets a written:
	int datasetNumber = 0;
	int burstNumber = 0;
	long startMillis = System.currentTimeMillis();
	while (MAX_DATASETS > datasetNumber) {
	
		// Status message:
		System.out.println("Datasets sent through memory so far: " + datasetNumber + ". "
						 + "Now sending burst " + burstNumber + "...");
		
		// Write a few datasets to the file:
		int burstSize = (int) Math.max(BURST_MEAN + Math.random() * 2 * BURST_SCATTER - BURST_SCATTER, 0.);
		for (int b = 0; b < burstSize && MAX_DATASETS > datasetNumber; b++) {
			
			// Set-up the data values:
			out.setDataValue(System.currentTimeMillis() - startMillis);
			out.setDataValue(datasetNumber);
			out.setDataValue(burstNumber);
			out.setDataValue(Math.random());
			
			// Write dataset to disk:			
			out.writeDataSet();
			
			// If LiveGraph's main window was closed by user, we can finish the demo:
			if (out.hadIOException()) {
				if (out.getIOException() instanceof PipeClosedByReaderException) {
					System.out.println("LiveGraph window closed. No reason for more data. Finishing.");
					out.close();
					System.out.println("Demo finished. Cheers.");
					return;
				}
			}
			
			// Check for any other IOErrors and display:			
			if (out.hadIOException()) {
				out.getIOException().printStackTrace();
				out.resetIOException();
			}
			
			datasetNumber++;
		}
		burstNumber++;
		
		
		// Pause:
		long sleep = (long) Math.max(SLEEP_MEAN + Math.random() * 2 * SLEEP_SCATTER - SLEEP_SCATTER, 1.);
		SystemTools.sleep(sleep);
	}		
	
	// Finish:
	out.close();
	lg.disposeGUIAndExit();
	System.out.println("Demo finished. Cheers.");
}

public static void main(String[] unusedArgs) {
	try {
		(new LiveGraphMemoryStreamDemo()).exec();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}  // public class LiveGraphMemoryStreamDemo
