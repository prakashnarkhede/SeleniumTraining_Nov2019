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

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");		
		
		//navigate to Other webElements
		driver.findElement(By.id("nav_truck")).click();
		
		//click on frame
		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='frames']")).click();
		
		//enter topic text
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/input")).sendKeys("Data");
	
		
		//tagname --> frame / iframe / frameset
		//click on  checbox
	//	driver.findElement(By.id("a")).click(); --> not working directly
		//before i click on frame --> swith on frame
		driver.switchTo().frame(0); //--> swith to first frame
	//	driver.switchTo().frame(driver.findElement(By.id("")));
		
		driver.findElement(By.id("a")).click(); 
		
		
		//swith back to parent frame
		//driver.switchTo().parentFrame(); 
		driver.switchTo().defaultContent();
		//read text from original webpage
		String pageHeading = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println("pageHeading is: "+pageHeading);
	}
	
	}
