package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getPageTitleAndCurrentURL {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		
		//page title ==> String
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is: "+pageTitle);
		
		//get current URL
		String url1 = driver.getCurrentUrl();
		System.out.println("URL at homepage is: "+url1);
		
		//navigate to Other webElements
				driver.findElement(By.id("nav_truck")).click();
				String pageTitleInOther = driver.getTitle();
				System.out.println("pageTitleInOther is: "+pageTitleInOther);
				
				//get current URL
				String url2 = driver.getCurrentUrl();
				System.out.println("URL at homepage is: "+url2);	
								
				
				//close the browser
				driver.close();
				
		
		
	}
	
	}
