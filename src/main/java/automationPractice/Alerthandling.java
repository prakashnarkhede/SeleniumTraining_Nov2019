package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerthandling {

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
		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='AlertMessage']")).click();
		
		//click on generateConfirm Box to create alert
		driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div[1]/div[2]/div/p[1]/button"))
.click();
		
		//to handle alerts --> class Alert
		Alert al = driver.switchTo().alert();
		
		//get alert text
		System.out.println("Alert text is: "+al.getText());
		
		Thread.sleep(2000);
		//accept alert
		//al.accept();
		
		//cancel alert
		al.dismiss();
		//al.sendKeys("");
	}
	
	}
