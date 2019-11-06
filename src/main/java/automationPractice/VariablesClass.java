package automationPractice;

public class VariablesClass {
	
	//instance variables
	 int x = 10;
	
	//static variable
	static int s = 99;
	
	public void add() {
		//local variables
		int a =10;
		int b = 20;
		int  c  = a+ b+x;	
	}
	
	public void m1() {
		System.out.println("Staic variable value is:"+s);
		System.out.println("instance variable value is:"+x);
	}

	public static void main(String[] args) {
		VariablesClass var = new VariablesClass();
		VariablesClass var1 = new VariablesClass();
		VariablesClass var2 = new VariablesClass();
		System.out.println("Begained program execution");
		var.m1();
		var1.m1();
		var2.m1();
		
		System.out.println("After changing the value");
		var.x = 100;
		var.s = 101;
		
		var.m1();
		var1.m1();
		var2.m1();

	}

}
