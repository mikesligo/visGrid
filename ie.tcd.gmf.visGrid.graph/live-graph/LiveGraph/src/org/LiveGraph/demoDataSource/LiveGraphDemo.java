package org.LiveGraph.demoDataSource;

import org.LiveGraph.dataFile.write.DataStreamWriter;
import org.LiveGraph.dataFile.write.DataStreamWriterFactory;

import com.softnetConsult.utils.sys.SystemTools;


/**
 * This class is used for generating a demo data file for demonstration and
 * testing purposes.
 * It creates a data file and fills it with data. This happens in bursts
 * of {@value #MIN_BURST} to {@value #MAX_BURST} datasets at a time.
 * Between the bursts the execution is paused for {@value #MIN_SLEEP}
 * to {@value #MAX_SLEEP} milliseconds. This way a data generating simulation
 * is emulated. The program stops after {@value #MAX_DATASETS} datasets have
 * been written.
 *  
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: LiveGraphDemo.java</p> 
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
 */
public class LiveGraphDemo {

public static final String DEMO_DIR = System.getProperty("user.dir");

public static final int MIN_SLEEP = 0;
public static final int MAX_SLEEP = 1;
public static final int MIN_BURST = 1;
public static final int MAX_BURST = 10;
public static final int MAX_DATASETS = 1000000;

public void exec() {
	
	// Print a welcome message:
	System.out.println("Welcome to the LiveGraph demo.");
	
	// Setup a data writer object:
	DataStreamWriter out = DataStreamWriterFactory.createDataWriter(DEMO_DIR, "LiveGraphDemo");
	
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
		System.out.println("Datasets written so far: " + datasetNumber + ". "
						 + "Now writing burst " + burstNumber + "...");
		
		// Write a few datasets to the file:
		int burstSize = (int) (MIN_BURST + (Math.random() * (double) (MAX_BURST - MIN_BURST)));
		for (int b = 0; b < burstSize && MAX_DATASETS > datasetNumber; b++) {
			
			// Set-up the data values:
			out.setDataValue(System.currentTimeMillis() - startMillis);
			out.setDataValue(datasetNumber);
			out.setDataValue(burstNumber);
			out.setDataValue(Math.random());
			
			// Write dataset to disk:
			out.writeDataSet();
			
			// Check for IOErrors:			
			if (out.hadIOException()) {
				out.getIOException().printStackTrace();
				out.resetIOException();
			}
			
			datasetNumber++;
		}
		burstNumber++;
		
		
		// Pause:
		Thread.yield();
		long sleep = (long) (MIN_SLEEP + (Math.random() * (double) (MAX_SLEEP - MIN_SLEEP)));
		SystemTools.sleep(sleep);
		Thread.yield();
	}		
	
	// Finish:
	out.close();
	System.out.println("Demo finished. Cheers.");
}

public static void main(String[] unusedArgs) {
	(new LiveGraphDemo()).exec();	
}

} // public class LiveGraphDemo
