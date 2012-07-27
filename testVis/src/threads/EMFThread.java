package threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;

import http.Property;

public class EMFThread implements Runnable{
	public IFile file;

	public EMFThread(IFile file){
		this.file = file;
	}

	public void run() {
		while (true){
			try{
				InputStream in = file.getContents();
				File outFile = new File(file.getFullPath().toString() + ".swp");
				// if outfile doesn't exist, then create it
				if (!outFile.exists()) {
					outFile.createNewFile();
				}
				
				FileWriter fstream = new FileWriter(outFile.getAbsoluteFile());
				BufferedWriter out = new BufferedWriter(fstream);

				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String line;
				while((line = br.readLine()) != null) {
					// only focus on connections
					if (line.contains("connections")){
						// get first and last index of the name value
						int first = line.indexOf("name=") + 6;
						int second = line.indexOf("\"",first);
						int third =0;
						String name = line.substring(first,second);
						
						// Until we reach the end of the line (the next sequence is " />" basically)
						while (!line.substring(second+1,second+3).equals("/>")){
							first = line.indexOf(" ",second+1)+1;
							second = line.indexOf("=",first);
							
							String prop = line.substring(first, second); // name of the property
							String val = http.Property.getValueOfProperty(name,prop); // get http propeprties
							second = line.indexOf("\"",second+4);
							third = line.indexOf("\"",second+1);
							if (third != -1)System.out.println(line.substring(second,third));
						}
					}
					out.write(line);
				}

				in.close();
				out.close();
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
