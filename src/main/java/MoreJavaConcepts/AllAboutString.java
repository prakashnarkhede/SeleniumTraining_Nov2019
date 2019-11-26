package MoreJavaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAboutString {

	public static void main(String[] args) {

			String str = "Prakash";
			String str1 = "Prakash"; // string constant pool
			String str2 = "Prakash1"; // string constant pool
			System.out.println("Location of str: "+ System.identityHashCode(str));
			System.out.println("Location of str1: "+ System.identityHashCode(str1));
			System.out.println("Location of str2: "+ System.identityHashCode(str2));			
			str = "changedValue"; //new entry will get creatd in string constant pool
			System.out.println("Location of str: "+ System.identityHashCode(str));
			System.out.println("Location of str1: "+ System.identityHashCode(str1));
			System.out.println("Location of str2: "+ System.identityHashCode(str2));	
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			String str7 = new String("MyWorkSpace");
			String str8 = new String("MyWorkSpace");
			String str9 = new String("MyWorkSpace1");
			System.out.println("Location of str7: "+ System.identityHashCode(str7));
			System.out.println("Location of str8: "+ System.identityHashCode(str8));
			System.out.println("Location of str9: "+ System.identityHashCode(str9));
			
			System.out.println("Comparing String +++++++++++++++++++++++++++++++++++");
			String s1 = "Welcome";
			String s2 = "Welcome";
			String S3 = "Hello";
			String S4 = new String("Welcome");
			//== method to compare string --> object locations not values
			System.out.println(s1 == s2); //both are pointiing same location
			System.out.println(s1==S4); //not equal --> pointing to different location.
			System.out.println(s1==S3); //not equal --> pointing to different location.

			
			System.out.println("using equals method ++++++++++++++========");
			//check for values //not for memory location
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(S4));
			System.out.println(s1.equals(S3));

			System.out.println("Various methods in string ++++++++++++++++++++++++++");
			System.out.println("Lenght of s1: "+s1.length());
			System.out.println("Char at index 1: "+s1.charAt(1));
			System.out.println("Substrig is:"+s1.substring(3, 7));
			String s11 = "WELCome";

			System.out.println(s1.equalsIgnoreCase(s11));
			System.out.println(s1.concat(str9));
			System.out.println(s1+str9);
			
			String splitDemo = "Hello There, How are you?";
			String[] arr = splitDemo.split(" ");
			System.out.println("arr is: "+arr.length);
			for (String s111 : arr) {
				System.out.println(s111);
			}
			
			for(int i= 0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			//String is immutable --> we can not change value
			// mutable version of sting ==> StringBuffer and StringBuilder
			System.out.println("Stirng buffer ++++++++++++++++++++++++");
			StringBuffer sbuff = new StringBuffer("Welcome");
			StringBuilder sbuild = new StringBuilder("Welcome");
			sbuff.append(" to java");
			System.out.println("sbuff is: "+sbuff);
			//sbuild.toString().
			
			String w1 = "Welcome";
			w1.concat(" to java");
			System.out.println("Value of immutable string w1 is: "+w1);
			w1 = w1.concat(" to java");
			System.out.println("Value of immutable string w1 is: "+w1);
			
			//reverse String
			System.out.println("rev value is: "+sbuff.reverse());
			
			//reverse String using immutable string
			String x1 = "Welcome";
			int lenOfX1 = x1.length();
			String revSring = "";
			System.out.println(lenOfX1);
			for(int i = lenOfX1-1; i >=0; i--) {
				//System.out.print(x1.charAt(i));
				revSring= revSring+x1.charAt(i);

			}
			System.out.println("revSring is: "+revSring);
			List<String> l = new ArrayList<String>();
			
			//Collections.copy(dest, src);
			//Collections.sort(list);
			Map<String, String> m = new HashMap<String, String>();
	}

}
