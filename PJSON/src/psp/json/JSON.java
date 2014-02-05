package psp.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;


public class JSON {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Instituto> institutos = new ArrayList<>();
		Gson gson = new Gson();
		Instituto instituto1 = new Instituto("IES Serpis",46,"C/ Serpis");
		Instituto instituto2 = new Instituto("IES Cabanyal",45,"C/ Cabanyal");
		
		institutos.add(instituto1);
		institutos.add(instituto2);
		
		String formatearJSON = gson.toJson(institutos);
		
		System.out.println("JSON: " +formatearJSON);
	}

}
