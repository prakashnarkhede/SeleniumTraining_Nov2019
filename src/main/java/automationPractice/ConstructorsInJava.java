package automationPractice;

public class ConstructorsInJava {

	int num1; 
	int num2;
	//main adv ==> to initialize instance variables
	
	//constructors
	public ConstructorsInJava(int x, int y) {
		num1 = x;
		num2 = y;
	}
	
	// we can have more than 1 construcotr in a class
	//constructor overloading (like method overloading)
	public ConstructorsInJava () {
		// do some operations
		//added code
		System.out.println("in constructor with no parameters");
	}
	
	
//	databaseOperations ==> url, user, pass, port
//	2 db
//	
	
	
	//instance variables
	
	//method to add 2 numbers
	public void addition() {
		int add = num1+num2;
		System.out.println("Addition of 2 numbers is : "+add);
	}
	
	
	public static void main(String[] args) {
		ConstructorsInJava c1 = new ConstructorsInJava(10, 20); //can i pass values???
		c1.addition();
		
		ConstructorsInJava c2 = new ConstructorsInJava(2, 4);
		c2.addition();
		
		ConstructorsInJava c3 = new ConstructorsInJava();
		c3.addition();
		
		
		//Strings Class
		int a = 10;
		String userName = "Admin";  // primitive way
		String passWord = new String("Admin@123"); // wrapper class
		userName.toUpperCase();
		
	}

}
