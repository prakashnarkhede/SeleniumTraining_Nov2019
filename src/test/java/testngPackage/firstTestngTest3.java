package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class firstTestngTest3 {
	
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
	
	@Test
	public void TestCase1() throws InterruptedException {
		System.out.println("TestCase1");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());
	}
	@Test
	public void TestCase4() throws InterruptedException {			
		System.out.println("TestCase4");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase3() throws InterruptedException {			
		System.out.println("TestCase3");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	
	@Test
	public void TestCase2() throws InterruptedException {			
		System.out.println("TestCase2");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase21() throws InterruptedException {			
		System.out.println("TestCase21");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase22() throws InterruptedException {			
		System.out.println("TestCase22");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase23() throws InterruptedException {			
		System.out.println("TestCase23");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase24() throws InterruptedException {			
		System.out.println("TestCase24");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase25() throws InterruptedException {			
		System.out.println("TestCase25");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

	}
	@Test
	public void TestCase26() throws InterruptedException {			
		System.out.println("TestCase26");
		System.out.println("Current thread id is: "+Thread.currentThread().getId());

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
