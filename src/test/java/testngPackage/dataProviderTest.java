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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dataProviderTest {
	
		
	WebDriver driver;
	
	// get executed before every test method
	@BeforeMethod
	public void setUpMethod() {
		System.out.println("I am in before method");
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		
		//navigate to google.com
		driver.get("https://www.seleniumhq.org/download/");
	}
	
	@Test(dataProvider = "loginData")
	public void DataDrivenTestCase(String userName, String password) throws InterruptedException {			
		Thread.sleep(1000);
		System.out.println("userName for test case is: "+ userName);
		System.out.println("password for test case is: "+ password);
		System.out.println("webpage title is: "+driver.getTitle());
	}
	
	
	
	//gets executed after each test method
	@AfterMethod
	public void clearDown() {
		System.out.println("i am in after method");
		driver.close();

	}
	
	@DataProvider(name="loginData")
	public Object[][] DataProviderMethod() {
		Object[][] arr = new Object[4][2];
		arr[0][0] = "user1";
		arr[0][1] = "pass1";
		arr[1][0] = "user2";
		arr[1][1] = "pass2";		
		arr[2][0] = "user3";
		arr[2][1] = "pass3";
		arr[3][0] = "user4";
		arr[3][1] = "pass4";
		return arr;
	}
	
}
