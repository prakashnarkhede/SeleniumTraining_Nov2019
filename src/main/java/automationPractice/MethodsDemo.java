package automationPractice;

public class MethodsDemo {
	
	int a = 10;
	int b = 20;

	//retruns int
	 public int addition(){
			
			int sum = a + b;
			System.out.println(sum);
		return sum;
	}
	 
	 //method not returning any value
	 public void substraction(){
			int sub = a - b;
			System.out.println(sub);		
	}
	 
	 public static void multiply() {
		// int mul = a*b;
		 System.out.println("Multiply method is executed");
	 }


	 
	public static void main(String[] args) {
		//int i           =  10;
		MethodsDemo ref = new MethodsDemo();
		int addition =  ref.addition();
		
		System.out.println(addition);
		
		ref.substraction();
		
		multiply();
	}

}
