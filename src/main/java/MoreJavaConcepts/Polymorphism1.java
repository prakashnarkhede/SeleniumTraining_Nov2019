package MoreJavaConcepts;

public class Polymorphism1 {

	//poly - multiple
	// morph - forms
	//method with multiple forms
	//method overloading
	//operator overloading --> not supported in java but inbuilt operators are supporting it
	public void add(int d, int e) {
		System.out.println(d+e);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, int b, String message) {
		System.out.println(message+(a+b));
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void opOv(int a1, int b1) {
		System.out.println("result is: "+(a1+b1));
	}
	
	public void opOv(String a1, String b1) {
		System.out.println("result is: "+(a1+b1));

	}
	
	
	public static void main(String[] args) {
		Polymorphism1 p = new Polymorphism1();
		p.add(9, 9);
		p.add(9, 9, 9);
		p.add(9.0, 9.0);
		p.add(9, 9, "Addition of two numbers is: ");
		p.opOv(9, 9);
		p.opOv("Prakash", " is my name");
	}
}
