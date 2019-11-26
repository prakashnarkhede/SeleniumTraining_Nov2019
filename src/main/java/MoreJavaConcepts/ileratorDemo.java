package MoreJavaConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ileratorDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Selenium");
		l.add("TOSCA");
		l.add("UFT");
		
		//retireve using iterator
		//iterator is an interface
		
		Iterator<String> itr = l.iterator();
		//l.get(0)
		
		while(itr.hasNext()) {
			String data = itr.next();
			System.out.println("data is: "+data);
		}
//		boolean flag = true;
//		int i = 0;
//		//till flag is true --> perform some operation.
//		while(flag) {
//			i++;
//			if(i > 20) {
//				System.out.println(i);
//				flag = false;
//			}
//		}
		
		//ListIterator --> works on list only
		//             --> traverse in both directions
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		ListIterator<String> Litr = l.listIterator();
		while(Litr.hasNext()) {
			String data = Litr.next();
			System.out.println("data is: "+data);	
			}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");

		while(Litr.hasPrevious()) {
			String data = Litr.previous();
			System.out.println("data is: "+data);	
			}
		
	//	Set<String> s = new HashSet<String>();
	//	s.iterator()
	}

}
