package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class firstTestngTest {
	
	
//	@BSuite
//	@BTest
//	@BClass
//	@BMethod
//	@Test
//	@AMethod
//	@AClass
//	@ATest
//	@ASuite
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("I am in Before Suite");
	}
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("I am in Before Test");
	}
	
	
	//gets executed before any test method in class (only once in class
	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("I am in Before class");
	}
	
	
	// get executed before every test method
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("I am in before method");
		//set driver executable
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\DriverExecutables\\chromedriver.exe");
			//open browser
				 driver = new ChromeDriver();
				//navigate to google.com
				driver.get("https://www.seleniumhq.org/download/");
	}
	
	@Test
	public void TestCase1() throws InterruptedException {			
		Thread.sleep(1000);
		System.out.println("webpage title is: "+driver.getTitle());
	}
	@Test
	public void TestCase4() throws InterruptedException {			
		Thread.sleep(1000);
		System.out.println("webpage title is: "+driver.getTitle());
	}
	@Test
	public void TestCase3() throws InterruptedException {			
		Thread.sleep(1000);
		System.out.println("webpage title is: "+driver.getTitle());
	}
	
	//gets executed after each test method
	@AfterMethod
	public void clearDown() {
		System.out.println("i am in after method");
		driver.close();

	}
	
	//gets executed before any test method in class (only once in class
	@AfterClass
	public void afterClassMethod() {
		System.out.println("I am in after class");
	}
	@AfterTest
	public void afterTestMethod() {
		System.out.println("I am in after Test");
	}
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("I am in after Suuite");
	}
	
}
