package MoreJavaConcepts;

import java.util.HashSet;
import java.util.Set;

public class setDemo {

	public static void main(String[] args) {
		//set --> only unique values
		//    --> unordered
		//    --> non index based
		//   --> for each  loop to retrieve data
		Set<String> s = new HashSet<String>();
		s.add("Prakash");
		//s.add(99);
		s.add("Bankesh");
		s.add("Selenium");
		s.add("Bankesh");
		System.out.println("Set is: "+s);
		
		
		
		Set<String> s1 = new HashSet<String>();
		System.out.println("adding Prakash to set: "+s1.add("Prakash"));
		System.out.println("adding Bankesh to set: "+s1.add("Bankesh"));
		System.out.println("adding selenium to set: "+s1.add("Selenium"));
		System.out.println("adding Prakash to set: "+s1.add("Prakash"));
		System.out.println("if s1 contains bankesh? : "+s1.contains("Bankesh"));
		System.out.println("if s1 contains bankesh1? : "+s1.contains("Bankesh1"));
		
		for (String s11 : s1) {
			System.out.println("Set data is : "+s11);
		}

	}

}
