package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String line;
				while((line = br.readLine()) != null) {
					if (line.contains("connections")){
						int first = line.indexOf("name=") + 6;
						int second = line.indexOf("\"",first);
						String name = line.substring(first,second);
						
						while (!line.substring(second+1,second+3).equals("/>")){
							first = line.indexOf(" ",second+1)+1;
							second = line.indexOf("=",first);
							
							String prop = line.substring(first, second);
							String val = http.Property.getValueOfProperty(name,prop);
							second = line.indexOf("\"",second+4);
						}
					}
				}

				in.close();
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
