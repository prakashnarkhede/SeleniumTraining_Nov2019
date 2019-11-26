package MoreJavaConcepts;

import org.testng.annotations.Test;

// OOPs concepts
//Inheritance
//encapsulation
//polymorphism
//interface, abstraction

//extends    //child class             //parent class
public class InheritanceDemo2 extends InheritanceDemo1{
	
	InheritanceDemo2 d2 = new InheritanceDemo2();
	int var = 10000;
	public InheritanceDemo2() {
		super(); // refers parent class constructor -- make sure that super() is first line of child class constructor
		System.out.println("print from constructor of demo2");
	}
	
	@Test
	public void m3() {
		System.out.println("m3 method from demo2");
		System.out.println("Variable var value is: "+d2.var);
		System.out.println("Variable var value using super keyword is: "+super.var);
		super.m2();
	}
	
	@Override
	 public void m1() {
		System.out.println("Here i want to write my own implementation");
	}
	 
	// public void finalM1() {  //Cannot override the final method from InheritanceDemo1
		 //implementation
	// }
	
	public static void main(String[] args) {
		System.out.println("_____ ref of demo2 and object of demo2 ______");
	InheritanceDemo2 d21 = new InheritanceDemo2(); // ref of demo2 and object of demo2
		d21.m1(); // method overriding (comming from m1)
		d21.m2(); // demo1 (called from parent class)
		d21.m3(); // demo2 (child class method)
		

		
		
		//	InheritanceDemo2 d21 = new InheritanceDemo1(); --> not supported combination
		
		System.out.println("________ ref of demo1 and object of demo1__________");
		InheritanceDemo1 d1 = new InheritanceDemo1(); // ref of demo1 and object of demo1
		d1.m1(); //demo1 class
		d21.m2(); // demo1 class
		
		System.out.println("__________ref of parent and object of child__________");
		//InheritanceDemo1 d11 = new InheritanceDemo2(); // ref of parent and object of child
		d1.m1(); // demo1 class
		d1.m2(); // demo1 class
		
				
	}

}
