package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinksFromWEbPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		
		//navigate to Other webElements
		driver.findElement(By.id("nav_truck")).click();
		
		///get all the links from webpage
		//get multiple webelement
		
		List<WebElement> listOfWebElementLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links on webpage is: "+listOfWebElementLinks.size());
		
		for(int i = 0; i< listOfWebElementLinks.size(); i++) {
			System.out.println("Text from link is: "+listOfWebElementLinks.get(i).getText());
			System.out.println("href value is: "+listOfWebElementLinks.get(i).getAttribute("href"));
		}
		//test if all links are working
		//not from front end
		//do it from backend
		//HttpURLConnection

		//close the browser
				driver.close();
				
		
		
	}
	
	}
