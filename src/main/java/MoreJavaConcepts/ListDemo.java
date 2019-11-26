package MoreJavaConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		//List
		//array --> collection of objects of simillar data type
		//      --> fixed size
		//List--> size is variable
		//    --> ordered collection --> 1 --> 0, 9 --> 1, 11 -->2
		//    --> data can be accessed using index
		//    --> allows duplicates
		// List -- interface
		// ArrayList --> implemntation class for List interface
		List<Object> l = new ArrayList<Object>();
		l.add("Prakash");
		l.add(30);
		l.add(true);
		l.add("Selenium Training");
		l.add(99);
		l.add(30);
		l.add("Selenium Training");

		System.out.println("List bfore remove: "+l);
		l.remove(0);
		System.out.println("List after remove: "+l);
		System.out.println("Data at index 0 is: "+l.get(0));
		for (Object o : l) {
			System.out.println("List value is: "+o);
		}
		
		//list size
		System.out.println("List size is: "+l.size());
		
		
		//check if my list contain 99
		System.out.println("List contains 99? : "+l.contains(99));
		System.out.println("List contains 199? : "+l.contains(199));
		List<Object> l1 = new ArrayList<Object>();
	//	System.out.println("data at index 9: "+l.get(9));
		
		List l3 = new LinkedList<Integer>();
		l3.add(9);
		l3.add(99);
		l3.add(999);
		System.out.println("LinkedList before removal is: "+l3);
		l3.remove(1);
		System.out.println("LinkedList after removal is: "+l3);

	}

}
