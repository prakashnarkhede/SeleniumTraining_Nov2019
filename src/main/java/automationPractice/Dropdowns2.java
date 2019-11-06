package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		
		//navigate to Other webElements
		driver.findElement(By.id("nav_truck")).click();
		
		//navigate to SelectMenu
		driver.findElement(By.xpath("//a[@href='selectmenu/index.html']")).click();
		
		//webelemtn for salutation dropdown
		WebElement salutationEle = driver.findElement(By.id("salutation-button"));
//		Select salutationDD = new Select(salutationEle);
//		salutationDD.selectByVisibleText("Other");
		//click on dd
		salutationEle.click();
		
		String selectValue = "Mr.";
		//+ ==> concat
		
		String salutationXpath = "//ul[@id='salutation-menu']//div[text()='"+selectValue+"']";
		
		driver.findElement(By.xpath(salutationXpath)).click();
		
	}
	
	}
