package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class firstTestngTest2 {
	
	WebDriver driver;
	
	//gets executed before any test method in class (only once in class
	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("I am in Before class");
	}
	
	
	// get executed before every test method
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("I am in before method");
			}
	
	@Test(priority = 1, timeOut = 1000)
	public void TestCase1() throws InterruptedException {			
		System.out.println("TestCase1");
		Thread.sleep(2000);
	}
	@Test(enabled = true, priority = 2, invocationCount = 2)
	public void TestCase4() throws InterruptedException {			
		System.out.println("TestCase4");
	}
	@Test(priority = 3, dependsOnMethods = "TestCase1")
	public void TestCase3() throws InterruptedException {			
		System.out.println("TestCase3");
	}
	
	@Test(priority = -1, description = "TestCase2 Description")
	public void TestCase2() throws InterruptedException {			
		System.out.println("TestCase2");
	}
	@Test(priority = -3, description = "TestCase21 Description")
	public void TestCase21() throws InterruptedException {			
		System.out.println("TestCase21");
	}
	//gets executed after each test method
	@AfterMethod
	public void clearDown() {
		System.out.println("i am in after method");

	}
	
	//gets executed before any test method in class (only once in class
	@AfterClass
	public void afterClassMethod() {
		System.out.println("I am in after class");
	}
	
	
}
