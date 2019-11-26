package MoreJavaConcepts;

public class InheritanceDemo1 {
	
	public InheritanceDemo1() {
		System.out.println("Constructor of demo1");
	}
	
	int var = 10;
	final int fvar = 100;
	
	 void m1() {
		 var = 11;
		// fvar = 101;  //The final field InheritanceDemo1.fvar cannot be assigned
		System.out.println("m1 method form inheritancedemo1");
	}
	public void m2() {
		System.out.println("m2 method form inheritancedemo1");
	}
	
	public static void sm1() {
		System.out.println("sm1 method form inheritancedemo1");

	}
	public final void finalM1() {
		System.out.println("This is final method from Demo1 class");
	}

}
