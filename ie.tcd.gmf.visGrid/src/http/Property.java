package http;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import dataTypes.Model;

public class Property {

	public static void main(String[] args){
	}

	public static Vector<Model> getModuleList() throws IOException{
		Vector <Model> modules = new Vector<Model>();
		try{
			URL url = new URL("http://localhost:10001/objects");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				int starts,ends;
				String name, type, parent;
				if (inputLine.contains("<modules>")){
					inputLine = in.readLine();
					assert (inputLine.contains("<name>"));
					starts = inputLine.indexOf(">")+1;
					ends = inputLine.lastIndexOf('<');
					name = inputLine.substring(starts,ends);

					inputLine = in.readLine();
					assert (inputLine.contains("<type>"));
					starts = inputLine.indexOf(">")+1;
					ends = inputLine.lastIndexOf('<');
					type = inputLine.substring(starts,ends);

					inputLine = in.readLine();
					assert (inputLine.contains("<parent>"));
					starts = inputLine.indexOf(">")+1;
					ends = inputLine.lastIndexOf('<');
					parent = inputLine.substring(starts,ends);

					modules.add(new Model(name,type,parent));
				}
			}
			in.close();
		} catch (ConnectException e){
			System.out.println("An exception occured in Property");
		}
		return modules;
	}

	public static boolean isReturnChar(String strLine) {
		if (strLine.length() == 0) return true;
		for (int i=0;i<strLine.length();i++){
			if ((int)strLine.charAt(i) == 10 || strLine.length() <=1){
				return true;
			}
		}
		return false;
	}

	public static String getNextLine(BufferedReader br) throws IOException {
		String tmp = br.readLine();
		// replace isn't working for some reason, I did try
		tmp.replaceAll(" ", "%20");
		return tmp;
	}

	public static String getValueOfProperty(String currentObj, String strLine) {
		try{
			URL url = new URL("http://localhost:10001/" + currentObj + "/" + strLine);
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url.toString());
			HttpResponse response = client.execute(request);
			//HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			//connection.setRequestMethod("GET");
			//connection.setConnectTimeout(300);
			//if (connection.getResponseCode() == 404) return null;
			//BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			System.out.println(response.toString());
			BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));			
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				String val = getValueFromString(inputLine);
				if (val != null) return val;
			}
			in.close();
		} catch (java.net.ConnectException e){
			System.out.println("Could not connect to gridlab-d via HTTP (Connection refused error)");
			System.out.println("Quitting.");
			System.exit(2);
		} catch (java.net.SocketTimeoutException s) {
			System.out.println("Connection timeout getting attribute: "+currentObj +", "+strLine);
			return null;
		}
			catch (Exception e){
			System.out.println("getValueOfProperty Exception: "+ e.getMessage());
		}
		return null;
	}

	public static String getValueFromString(String s){
		try {
			if (s.contains("<value>")){
				int startIndex = 8;
				int endIndex = s.indexOf("<",8);
				return s.substring(startIndex, endIndex);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
