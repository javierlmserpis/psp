package psp.geocoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class GoogleGeoCodeResponse {
	public String status;
	public results[] results;

	public GoogleGeoCodeResponse() {
	}

	public class results {
	    public String formatted_address;
	    public geometry geometry;
	    public String[] types;
	    public address_component[] address_components;
	}

	public class geometry {
	    public bounds bounds;
	    public String location_type;
	    public location location;
	    public bounds viewport;
	}

	public class bounds {

	    public location northeast;
	    public location southwest;
	}

	public class location {
	    public String lat;
	    public String lng;
	}

	public class address_component {
	    public String long_name;
	    public String short_name;
	    public String[] types;
	}
	
	Gson gson = new Gson();
	GoogleGeoCodeResponse result = gson.fromJson(jsonCoord(URLEncoder.encode(address, "UTF-8"));
	GoogleGeoCodeResponse.class);

double lat = Double.parseDouble(result.results[0].geometry.location.lat);

double lng = Double.parseDouble(result.results[0].geometry.location.lng);

private static String jsonCoord(String address) throws IOException {
URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&sensor=false");
URLConnection connection = url.openConnection();
BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
String inputLine;
String jsonResult = "";
while ((inputLine = in.readLine()) != null) {
    jsonResult += inputLine;
}
in.close();
return jsonResult; 
}

public static void main(String[] args) {
	jsonCoord("1600+Amphitheatre+Parkway,+Mountain+View,+CA");
}
}
