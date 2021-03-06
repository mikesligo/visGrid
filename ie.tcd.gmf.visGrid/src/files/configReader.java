package files;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class configReader {

	private FileInputStream fstream;
	private DataInputStream in;
	private BufferedReader br;
	public String port;
	private boolean iniFileExists;

	public configReader(){
		fstream = null;
		in = null;
		br = null;
		port = "10001";
		iniFileExists = false;
		this.init();
	}
	
	private void checkFile(){
		File ini = new File("visGrid.ini");
		System.out.println(ini.getAbsolutePath());
		if (ini.exists()) iniFileExists = true;
	}

	private void init() {
		// Retyping these 2 lines as someone may have some hacky need to recheck
		File ini = new File("visGrid.ini");
		if (ini.exists()) iniFileExists = true;
		else  System.err.println("ini file does not exist at "+ ini.getAbsolutePath());
		try {			
			if (iniFileExists){
				fstream = new FileInputStream("visGrid.ini");
				in = new DataInputStream(fstream);
				br = new BufferedReader(new InputStreamReader(in));
			}
		} catch (FileNotFoundException e) {
			System.err.println("visGrid.ini not found");
			e.printStackTrace();
		}

	}

	public String getPort(){
		if (iniFileExists){
			this.init();
			try {
				String strLine = br.readLine().trim();
				this.port = strLine.trim();
				in.close();
			} catch (IOException e) {
				System.err.println("Error when reading port from ini file");
				e.printStackTrace();
			}
		}
		return port;
	}

	public Vector<String[]> getUpdateVals(){
		Vector<String[]> list = new Vector<String[]>();
		if (iniFileExists){
			this.init();
			String strLine;
			try {
				while ((strLine = br.readLine()) != null)   {
					if (strLine.substring(0,1).equals("#")){
						list.add(strLine.substring(1).split(","));
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static void main(String[] args) {
		configReader conf = new configReader();
		System.out.println(conf.getUpdateVals().size());
		System.out.println(conf.getPort());
		conf.checkFile();
	}
}
