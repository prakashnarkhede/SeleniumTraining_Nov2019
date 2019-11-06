package automationPractice;

public class OperattorsInJava {

	public static void main(String[] args) {
		int a = 10; int b = 20;
		
	
		int c = a++;
		int d = a++;
		
		System.out.println("+ operator result is: "+(a+b));
		System.out.println("% operator result is: "+(5%2));
		System.out.println("++ operator result is: "+c);
		System.out.println("+ operator result is: "+(a+b));
		System.out.println("+ operator result is: "+(a+b));
		System.out.println("+ operator result is: "+(a+b));
		
		int i = 0;
		while(i == 10) {
			System.out.println("value of i is: "+i);
			i++;
		}
		
		
		//logical operators 
		//AND OR NOT
		// True AND True ==> True
		//True AND False ==> Flase
		//False AND True ==> False
		//false AND False ==> false
		
		if(3>1 && 1>2 ) {
			System.out.println("inside if loop");
		}
		
		
		//OR operator
		//True OR True ==> True
		//True OR False ==> True
		//False OR True ==> True
		//False OR False ==> False
		if(3>10 || 1>2 ) {
			System.out.println("inside if loop for OR");
		}
		
		//Not
		if(3 != 3 ) {
			System.out.println("inside if loop for Not condition");
		}
		
		
		//ternary Operator    
		// (condition)?(value if condition is true) : (value if condition is false)
		int result = 0;
		
		if(4>3) {
			result = 10;
		} else {
			result = 11;
		}		
		System.out.println("Result value is: "+result);
		
		
		int result1 = (4>3)?10:11;
		System.out.println("Result1 value is: "+result1);

		
		
		
	}

}
