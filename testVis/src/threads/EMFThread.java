package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import http.Property;

public class EMFThread {

	public static void main (String args[]) {
		File file = new File (".");

		try{
			BufferedReader br = new BufferedReader(new FileReader("/home/mike/src/runtime-EclipseApplication/exampleplugin/example.visgrid"));
			String line;
			while((line = br.readLine()) != null) {
				if (line.contains("connections")){
					int first = line.indexOf("name=") + 6;
					int second = line.indexOf("\"",first);
					String name = line.substring(first,second);
					System.out.println(line);
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	public void run() {

	}
}