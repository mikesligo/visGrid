package manager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.*;

/*
 * @Deprecated - No longer using it - mike
 */
public class CSVManager {
	
	
	private String fileName;
	
	public CSVManager(String fileName){
		this.fileName = fileName;
	}
	
	public void write(String type, String objName, String name, String val){
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(fileName), ',', '"','\\');
			String[] write = {type,name,val};
			writer.writeNext(write);
			writer.close();
		} catch (IOException e) {
			System.err.println("Problem making csvwriter");
			e.printStackTrace();
		}
	}
	
	public List<String[]> read(){
		try {
			CSVReader reader = new CSVReader(new FileReader(fileName),',', '"','\\');
			List<String[]> list = reader.readAll();
			reader.close();
			return list;
		} catch (FileNotFoundException e) {
			System.err.println("Problem making csvreader, fileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Problem with reader.readAll()");
			e.printStackTrace();
		}
		return null;
	}

}
