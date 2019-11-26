package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testngParameterize {
	
		
	WebDriver driver;
	
	// get executed before every test method
	@BeforeMethod
	@Parameters({"browser"})                                           
	public void setUpMethod(String browser) {
		System.out.println("I am in before method");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		}
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}
		
		//navigate to google.com
		driver.get("https://www.seleniumhq.org/download/");
	}
	
	@Test
	public void TestCase1() throws InterruptedException {			
		Thread.sleep(1000);
		System.out.println("webpage title is: "+driver.getTitle());
	}
//	@Test
	public void TestCase4() throws InterruptedException {			
		Thread.sleep(1000);
		System.out.println("webpage title is: "+driver.getTitle());
	}
	//@Test
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
	
	
}
