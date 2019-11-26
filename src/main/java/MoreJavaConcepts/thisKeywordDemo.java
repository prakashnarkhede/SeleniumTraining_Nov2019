package MoreJavaConcepts;

import org.openqa.selenium.support.PageFactory;

public class thisKeywordDemo {
	
	//this keyword - reference current clas object
	//company - >> employees --> FTE + interns
	//display info of empoyees
	
	int eNumber;
	String eName;
	int eSalary;
	String eLocation;
	public thisKeywordDemo() {
		System.out.println("Welcome to My Org !!!!!!!!");
	//	PageFactory.initElements(driver, this); --> use this to pass currnt class object to method parameter 
		}
	
	//get data for interns
	public thisKeywordDemo(int eNumber, String eName, String eLocation) {
		//this keyword to tell which is current clas instance variable
		this();
		this.eNumber = eNumber;
		this.eName = eName;
		this.eLocation = eLocation;
	}
	
	//get data for interns
		public thisKeywordDemo(int eNumber, String eName, int eSalary, String eLocation) {
			//this() --> invoke current class constructor
			this(eNumber, eName, eLocation);
			this.eSalary = eSalary;
		}
		
	public void displayEmployeeInfo() {
		System.out.println("ENumber of Employee is: "+eNumber);
		System.out.println("Name of Employee is: "+eName);
		if (eSalary>0) {
			System.out.println("Salary of Employee is: "+eSalary);			
		} else {
			System.out.println("Interns are not paid any salary");
		}
		System.out.println("Location of Employee is: "+eLocation);

	}
		
	public static void main(String[] args) {
		thisKeywordDemo d = new thisKeywordDemo(1001, "John", "Pune");
		d.displayEmployeeInfo();
		
		System.out.println("________________________________________________");
		thisKeywordDemo d1 = new thisKeywordDemo(1002, "Renata", 1000, "Mumbai");
		d1.displayEmployeeInfo();
	}
	

}
