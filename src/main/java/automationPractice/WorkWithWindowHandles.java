package automationPractice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		
		//navigate to Other webElements
		driver.findElement(By.id("nav_truck")).click();
		
		//click on alert messsage
		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='Automation Practice Switch Windows']")).click();
		
		//click on new Browser Tab
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		//when new tab get opens, but still driver focus is on base page
		
		//get name of current window
		String baseWindow = driver.getWindowHandle();
		System.out.println("Base window is: "+baseWindow);
		
		//how to find another window opened by driver.
		//find all the windows opened by driver --> getWindowHandles() --> store result in to set
		Set<String> setOfWindows = driver.getWindowHandles();  // set store uniq values only
		System.out.println("set of windows is: "+setOfWindows);
	
		//now get the new window id from set /// in set if setOfWindows != baseWindow
		//use advanced for loop -- foreach loop  to retrive contents of set
		String newWindow = null;
		for (String window : setOfWindows) {
			if(!window.equalsIgnoreCase(baseWindow)) {
				newWindow = window;
			}
		}
		
		//switch to another tab / window - using window handle
		driver.switchTo().window(newWindow);
		
		//exeucte something on new window / tab
		driver.findElement(By.name("q")).sendKeys("Seed Infotech");
		
		
		//once you are done wokring with child window / new tab --> how to switch to parent window?
		
		driver.switchTo().window(baseWindow);
		
		//click on alert button in base window
		driver.findElement(By.id("alert")).click();
		
		//closes window on which driver has focus / current window
		driver.close();
		
		//how to close all windows created by driver
		driver.quit();
	}
	
	}
