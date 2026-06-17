package oopconcepts;

import java.util.HashMap;

public class Program4_HashMapData {

	public static void main(String[] args) {
		
		HashMap<String, String> testData = new HashMap<>();
		
		testData.put("TC_001", "validUser@store.com");
		testData.put("TC_002", "invalidUser@store.com");
		testData.put("TC_003", "validUser1@store.com");
		testData.put("TC_004", "invalidUser2@store.com");
		testData.put("TC_005", "validUser2@store.com");
		
		System.out.println("Data for TC_001: " + testData.get("TC_001"));
		System.out.println("Data for TC_002: " + testData.get("TC_002"));
		System.out.println("Data for TC_003: " + testData.get("TC_003"));
		System.out.println("Data for TC_004: " + testData.get("TC_004"));
		System.out.println("Data for TC_005: " + testData.get("TC_005"));

	}

}
