package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//timeout setting
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//open url
		//driver.get("https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.7.28");
		driver.get("https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.7.28");
		//navigate --> back, forword, refresh
		
		
		//get page title
		String pageTitle = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		String currentPageSource = driver.getPageSource();
		
//		if(pageTitle == "dummy page tiel") {
//			System.out.println("test case is passed");
//		} else {
//			System.out.println("Test case is failed");
//		}
		//Assert --> TestNG
		
		System.out.println("pageTitle is: "+pageTitle);
		System.out.println("currentUrl is: "+currentUrl);
		System.out.println("currentPageSource is: "+currentPageSource);
		
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
	
		//get --> only to open url
		//navigate method --> refresh, back, fwd
		
		
		driver.close(); 
		driver.quit();
		
		//click on link, button, select DD value, enter data, get data 
	}

}
