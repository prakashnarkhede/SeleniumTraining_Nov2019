package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationsAsserts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		//do validations
		//first way --> compare
		//2nd --> Assert -- comming from testng
		
		String ExpectedpageTitle = "Fill Vehicle Data";		
		String ActualpageTitle  = driver.getTitle();
		
		//compare
		if(ExpectedpageTitle.equals(ActualpageTitle)) {
			System.out.println("Page title is as expected");
		} else {
			System.out.println("Page title is not as expected");
		}
		
		//assert that page titles are equal
		Assert.assertEquals(ActualpageTitle, ExpectedpageTitle);
		
		Assert.assertEquals(2000, 2000);
		Assert.assertEquals(true, true);

		//check if next button is displayed on homepage
		WebElement nextButton = driver.findElement(By.id("nextenterinsurantdata"));
		
		//check if next button is displays
		boolean isNextButtonPresent = nextButton.isDisplayed();
		//checking if condition is true
		Assert.assertTrue(isNextButtonPresent, "Next button is not present");
		
		//Assert.assertTrue(false, "Next button is not present");
		
	//	driver.close();
		
		//Types of Asserts
		//1. Hard Assert --> if assertion fails at any time, execution get terminated.
		//2. Soft Assert --> Perform all assertions and finally it will fail
		
		//how to use SoftAssert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Prakash", "Prakash1");
		sa.assertEquals(true, false, "Boolean values are not matching");
		sa.assertTrue(false, "Boolean assertion failure");
		
		driver.close();
		
		sa.assertAll();
		}
	
	}
