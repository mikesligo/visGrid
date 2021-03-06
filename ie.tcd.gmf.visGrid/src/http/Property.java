package http;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Vector;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;	
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;

import dataTypes.Model;
import files.configReader;

public class Property {
	
	public static String port;

	public static void main(String[] args){
	}


	public static Vector<Model> getModuleList() throws IOException{
		Vector <Model> modules = new Vector<Model>();
		try{
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet("http://localhost:"+getPort()+"/objects");		
			HttpResponse response = client.execute(httpget);
			HttpEntity entity = response.getEntity();
			InputStream stream = entity.getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(stream));	

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
			EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
			client.getConnectionManager().shutdown(); // Shuts down the connection
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
	
	public static String getPort(){
		if (port == null) port = (new configReader()).getPort();
		if (port == null) port = "10001";
		return port;
	}

	public static String getValueOfProperty(String currentObj, String strLine) {
		try{
			// Using apache's httpcomponents library because of a multiple connections issue with gridlab-d 
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet("http://localhost:"+getPort()+"/" + currentObj + "/" + strLine);
			httpget.addHeader(new BasicHeader("Connection","close"));

			HttpResponse response = client.execute(httpget);
			HttpEntity entity = response.getEntity();
			InputStream stream = entity.getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(stream));		

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				String val = getValueFromString(inputLine);
				if (val != null){
					EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
					client.getConnectionManager().shutdown(); // Shuts down the connection
					return val;
				}
			}
			EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
			client.getConnectionManager().closeExpiredConnections();
			client.getConnectionManager().shutdown(); // Shuts down the connection
			in.close();
		} catch (java.net.ConnectException e){
			System.out.println("Could not connect to gridlab-d via HTTP (Connection refused error) at port " + getPort());
			return null;
			//System.out.println("Quitting.");
			//System.exit(2);
		} catch (java.net.SocketTimeoutException s) {
			System.out.println("Connection timeout getting attribute: "+currentObj +", "+strLine);
			return null;
		}
		catch (Exception e){
			System.out.println("getValueOfProperty Exception: "+ e.getMessage());
			return null;
		}
		return null;
	}

	public static void setValueOfProperty(String currentObj, String strLine, String updatedVal) {
		try{
			// Using apache's httpcomponents library because of a multiple connections issue with gridlab-d 
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet("http://localhost:"+getPort()+"/" + currentObj + "/" + strLine + "=" + updatedVal.replace(" ", "%20"));
			HttpResponse response = client.execute(httpget);
			System.out.println(response.getStatusLine());
			client.getConnectionManager().shutdown(); // Shuts down the connection

		} catch (java.net.ConnectException e){
			System.out.println("------------------------------------------------------------------");
			System.out.println("Could not connect to gridlab-d via HTTP (Connection refused error)");
			//System.out.println("Quitting.");
			System.out.println("------------------------------------------------------------------");
			//System.exit(2);
		} catch (java.net.SocketTimeoutException s) {
			System.out.println("Connection timeout getting attribute: "+currentObj +", "+strLine);
		}
		catch (Exception e){
			System.out.println("setValueOfProperty Exception: "+ e.getMessage());
		}
	}

	public static String getValue(String req){
		try{
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet("http://localhost:"+getPort()+"/" + req);
			httpget.addHeader(new BasicHeader("Connection","close"));
			
			HttpResponse response = client.execute(httpget);
			HttpEntity entity = response.getEntity();
			InputStream stream = entity.getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(stream));		

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				String val = getValueFromString(inputLine);
				if (val != null){
					EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
					client.getConnectionManager().shutdown(); // Shuts down the connection
					return val;
				}
			}
			EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
			client.getConnectionManager().shutdown(); // Shuts down the connection
			in.close();
		} catch (java.net.ConnectException e){
			System.out.println("Could not connect to gridlab-d via HTTP (Connection refused error) at port " + getPort());
			//System.out.println("Quitting.");
			//System.exit(2);
		} catch (java.net.SocketTimeoutException s) {
			System.out.println("Connection timeout getting realtime");
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

	public static String setValue(String req, String realtime) {
		try{
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet("http://localhost:"+getPort()+"/" + req+"="+realtime);

			HttpResponse response = client.execute(httpget);
			HttpEntity entity = response.getEntity();
			InputStream stream = entity.getContent();
			BufferedReader in = new BufferedReader(new InputStreamReader(stream));		

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				String val = getValueFromString(inputLine);
				if (val != null){
					EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
					client.getConnectionManager().shutdown(); // Shuts down the connection
					return val;
				}
			}
			EntityUtils.consume(entity); //  Ensures that the entity content is fully consumed and the content stream, if exists, is closed.
			client.getConnectionManager().shutdown(); // Shuts down the connection
			in.close();
		} catch (java.net.ConnectException e){
			System.out.println("Could not connect to gridlab-d via HTTP (Connection refused error) at port " + getPort());
			//System.out.println("Quitting.");
			//System.exit(2);
		} catch (java.net.SocketTimeoutException s) {
			System.out.println("Connection timeout getting realtime");
			return null;
		}
		catch (Exception e){
			System.out.println("getValueOfProperty Exception: "+ e.getMessage());
		}
		return null;
	}
}
