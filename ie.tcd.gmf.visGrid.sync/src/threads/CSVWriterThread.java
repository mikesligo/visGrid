package threads;

import java.io.IOException;

import au.com.bytecode.opencsv.CSVWriter;

public class CSVWriterThread implements Runnable {
	private String[] write;
	private CSVWriter writer;

	public CSVWriterThread(String[] write, CSVWriter writer){
		this.write = write;
		this.writer = writer;
	}

	@Override
	public void run() {
		try{
			writer.writeNext(write);
		} catch (Exception e){
			System.err.println("Error when writing next lien in CSVWriterThread");
			e.printStackTrace();
		}
		try {
			writer.flush();
		} catch (IOException e) {
			System.err.println("Error when flushing in CSVWriterThread");
			e.printStackTrace();
		}
	}

}
