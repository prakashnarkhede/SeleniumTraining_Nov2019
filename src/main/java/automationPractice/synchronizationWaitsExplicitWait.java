package automationPractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class synchronizationWaitsExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Online%20Training/WebDriverWait%20Demo/practice/Demo%20on%20explicit-wait-selenium-webdriver.html");		
		

		//Synchronization == matching the speed, of AUT and automation tool
		//why speed of AUT get affected: 
		//depends on server speed, ram, config
		// speed depends on internet,  heavy usage of javaScipt
		
	//	Static Wait
	//	1. Thread.sleep()
	//Dynamic wait
	//	1. Implicit Wait
	//	2. Explicit wait
	//	3. Fluent Wait
		
		//Thread.sleep(15000); //disadvantages-> unne
		
		//implicit wait --> get applied to all webElements when we do driver.findElement / s
		// thouhout life of driver
		//default setting is 0 sec
		//wait for specified time before throws an exception if element is not present
		//polling every 500 ms
		
	

		//Explicit wait --> wait for specific condition
		//waiting for alert to apear
		
		driver.findElement(By.id("alert")).click();
		
		//Thread.sleep(6000); -- not a good practice to use hardcoded wait
		//instead use explicit wait / FLuent wait
		
		//Define Explicit wait
		WebDriverWait ew = new WebDriverWait(driver, 20);
		
		//how to use explicit wait after creating explicit wait object
		ew.until(ExpectedConditions.alertIsPresent());
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		//ANother exmple
		WebElement enableButton = driver.findElement(By.id("display-other-button"));
		enableButton.click();
		
		//after 10 sec button will appear and i want to interact with that
		ew.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("hidden"))));
		System.out.println("button text is: "+driver.findElement(By.id("hidden")).getText());
		
		//Fluent wait
		//advanced explicit wait condition, wait for specific condition
		
		//create fluent wait
		FluentWait fw = new FluentWait(driver);
		//define timeout for FW
		fw.withTimeout(20, TimeUnit.SECONDS);
		fw.pollingEvery(1000, TimeUnit.MILLISECONDS);
		fw.ignoring(NoSuchElementException.class);
		fw.withMessage("This is my own Text written");
		
		driver.findElement(By.id("alert")).click();

		fw.until(ExpectedConditions.alertIsPresent());
		Alert al1 = driver.switchTo().alert();
		al1.accept();
	}
	
	}
