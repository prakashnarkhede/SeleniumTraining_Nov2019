package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class synchronizationWaitsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");		
		

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
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("make")).click();

		//Explicit wait
		//Fluent wait
	}
	
	}
