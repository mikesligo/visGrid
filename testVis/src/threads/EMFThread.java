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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import http.Property;

public class EMFThread implements Runnable{
	public IFile file;
	public IProject proj;

	public EMFThread(IFile file, IProject proj){
		this.file = file;
		this.proj = proj;
	}

	public static void copyFile(File sourceFile, File destFile) throws IOException { // Method to copy a file
		if(!destFile.exists()) {
			destFile.createNewFile();
		}

		FileChannel source = null;
		FileChannel destination = null;

		try {
			source = new FileInputStream(sourceFile).getChannel();
			destination = new FileOutputStream(destFile).getChannel();
			destination.transferFrom(source, 0, source.size());
		}
		finally {
			if(source != null) {
				source.close();
			}
			if(destination != null) {
				destination.close();
			}
		}
	}

	public void run() {
		while (true){
			try{

				File outFile = new File(file.getLocation().toOSString()+".swp");
				// if outfile doesn't exist, then create it
				if (!outFile.exists()) {
					outFile.createNewFile();
				}

				FileWriter fstream = new FileWriter(outFile.getAbsoluteFile());
				BufferedWriter out = new BufferedWriter(fstream);


				InputStream in = file.getContents();
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String line; // current line, edited in the inner while loop
				while((line = br.readLine()) != null) {
					// only focus on connections
					if (line.contains("connections")){
						// get first and last index of the name value
						int valFirst = line.indexOf("name=") + 6;
						int valSecond = line.indexOf("\"",valFirst);
						int propFirst, propSecond;
						String name = line.substring(valFirst,valSecond);

						// Until we reach the end of the line (the next sequence is " />" basically)
						while (valSecond < line.length()-3){ // Less than the /> at the end of the line		
							propFirst = valSecond+2; // There will be a space and then the attribute
							propSecond = line.indexOf("=",propFirst);
							String prop = line.substring(propFirst, propSecond).trim(); // name of the property
							String val = http.Property.getValueOfProperty(name,prop); // get http propeprties
							valFirst = line.indexOf("\"",propSecond);
							valSecond = line.indexOf("\"",valFirst+1);
							line = line.substring(0,valFirst+1) + val + line.substring(valSecond,line.length()); // Longhand way of replacing the val with the new val
							valSecond = valSecond + (val.length() - (valSecond-valFirst)) + 1; // update valSecond to the values of the new line, which may have changed size
						}
					}
					out.write(line);
					out.write('\n');
				}

				in.close();
				out.close();
				copyFile(outFile,new File(file.getLocation().toOSString())); // Copy the swap file to the original file
				proj.refreshLocal(2, null);
			} catch (Exception e){
				e.printStackTrace();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}