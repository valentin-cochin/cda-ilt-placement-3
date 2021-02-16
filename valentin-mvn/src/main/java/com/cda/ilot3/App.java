package com.cda.ilot3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Voiture v1 = new Voiture(0, "Renault");
		System.out.println(gson.toJson(v1));
	}
}
