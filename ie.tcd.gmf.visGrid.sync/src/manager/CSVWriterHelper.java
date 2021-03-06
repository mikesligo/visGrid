package manager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import threads.CSVWriterThread;

import au.com.bytecode.opencsv.CSVWriter;


public class CSVWriterHelper{
	private String fileName;
	private CSVWriter writer;

	public CSVWriterHelper(String fileName){
		this.fileName = fileName;
		this.init();
	}

	private void init() {
		File tempFile = new File("");
		URI dbURI = null;
		try {
			URI dirURI = new URI(tempFile.toURI().toString()+"/visGridCSV/");
			File dirFile = new File(dirURI);
			dirFile.mkdirs();
			dbURI = new URI(dirURI.toString() + this.fileName + ".csv");
			File csvFile = new File (dbURI.getPath());
			csvFile.createNewFile();
		} catch (URISyntaxException e) {
			System.err.println("Could not create dbURI");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error creating csvFile");
			e.printStackTrace();
		}
		if (dbURI != null){
			this.fileName = dbURI.getPath();
			try {
				writer = new CSVWriter(new FileWriter(fileName), ',', '"','\\');
			} catch (IOException e) {
				System.err.println("Problem making csvwriter");
				e.printStackTrace();
			}
		} else System.err.println("Filename not created in csvwriterthread, dbURI equal to null");
	}

	public void write(String latestTime, String type, String objName, String name, String val){
		try{
			String[] write = {latestTime, type, name, val};
			//writer.writeNext(write);
			(new Thread(new CSVWriterThread(write,writer))).start();
		} catch (java.lang.NullPointerException npe){
			System.err.println("NullPointerException in CSVWrtierHelper when writing type, name and val to writer");
		}
	}

	public void flush(){
		try {
			writer.flush();
		} catch (IOException e) {
			System.err.println("Error flushing writer for "+ this.fileName);
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			writer.close();
		} catch (IOException e) {
			System.err.println("Error closing writer for " + this.fileName);
			e.printStackTrace();
		}
	}
	
	public String getFileName(){
		return this.fileName;
	}

}
