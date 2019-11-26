package MoreJavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
	public static void main(String[] args) {
		
		//stores data in key - value pair
		//no insertion order is maintained
		//if key is not present, it return null
		Map<String, String> m = new HashMap<String, String>();
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m.put("Key1", "Value1");
		m.put("Key2", "Value2");
		m.put("Key3", "Value3");
		m.put("Key4", "");

		System.out.println("map data is: "+m);
		
		System.out.println("key2 data is: " +m.get("Key2"));
		System.out.println("key9 data is (null) : " +m.get("Key9"));
		m.containsKey("");
		m.isEmpty();
		m.clear();
		//m.putAll(m);


		
	}

}
