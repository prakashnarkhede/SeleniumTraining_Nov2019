package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAndCheckBoxes2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("https://demoqa.com/selectmenu/");
		Thread.sleep(1000);
//	Select os = new Select(driver.findElement(By.id("salutation-button")));
//	System.out.println("Selected option is: "+os.getFirstSelectedOption().getText());
//	System.out.println("Count of all options is"+os.getOptions().size());
//	System.out.println("Count of all options is"+os.getOptions().get(0).getText());
//	System.out.println("Count of all options is"+os.getOptions().get(1).getText());
	WebElement ele =driver.findElement(By.id("salutation-button"));
	ele.click();
	driver.findElement(By.xpath("//ul[@id='salutation-menu']//div[text()='Other']")).click();
	}
	}
