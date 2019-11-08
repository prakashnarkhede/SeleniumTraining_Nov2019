package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		//driver.get("file:///E:/dummyProject/app.html");		
		
		//last preference should be javascript 
		//java script works internally
		//JavaScriptExecutor --> Interface --> to execute JavaScript in Selenium code
		
		//Find WebElement -->  return document.getElementsByName('lst-ib')[0]
		//Click on WebElement -->  document.getElementsByName(btnK ')[0].click()
		//Send Keys -->  document.getElementById('lst-ib').value='text'
		//		    --> document.getElementsByName('lst-ib')[0].value='text
		//Scroll by 300 pixel -->  window.scrollBy(0,300)
		//Get Page Title -->  return document.title
		//Get Current URL -->  return document.URL;
		//Refresh Page --> history.go(0)
		//Navigate to URL -->  window.location = 'https://www.google.com/';

		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		//Navigate to google using JavaScript
		js.executeScript("window.location = 'https://www.google.com/';");
		
		//send keys in google search
		js.executeScript("document.getElementsByName('q')[0].value='text'");
		
		Thread.sleep(3000);
		//Find WebElement using javascript
		WebElement googleSearchBox = (WebElement) js.executeScript("return document.getElementsByName('q')[0]");
		googleSearchBox.clear();
		
		
		//get page title
		String pageTitle = 	(String) js.executeScript("return document.title");
		System.out.println("pageTitle is: "+pageTitle);
	}
	
	}
