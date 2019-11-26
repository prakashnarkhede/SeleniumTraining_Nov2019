package MoreJavaConcepts;

//extends    //child class             //parent class
public class InheritanceDemo21 extends InheritanceDemo1{
	
	public void m3() {
		System.out.println("m3 method from demo2");
	}
	
	@Override
	public void m1() {
		System.out.println("Here i want to write my own implementation");
	}
	
	public static void main(String[] args) {
		InheritanceDemo21 d2 = new InheritanceDemo21();
		d2.m1();
		d2.m2();
		d2.m3();
		d2.var=11;
		d2.sm1();
		InheritanceDemo1.sm1();
		
	}

}
