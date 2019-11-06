package automationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleApp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("file:///E:/dummyProject/app.html");
		
		//GET method from REST API --> Supports protocol
		//driver.get("www.sampleapp.tricentis.com");
		
		
		
		//driver.get("http://sampleapp.tricentis.com/101/");
	//	driver.findElement(By.id("nav_motorcycle")).click();
		
		Select makeSelect = new Select(driver.findElement(By.id("make")));
		makeSelect.selectByValue("Audi");
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
	}

}
