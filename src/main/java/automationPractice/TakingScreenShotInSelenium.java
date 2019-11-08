package automationPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShotInSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");		
		
		//navigate to Other webElements
		driver.findElement(By.id("nav_truck")).click();
		
		//when you want screen --> failure 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcImage = ts.getScreenshotAs(OutputType.FILE);
		
		//Create file to store screenshot.
		File destFile = new File("C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\screen1.jpeg");
		
		//Copy sourceFile to some other location where i can read form
		FileUtils.copyFile(srcImage, destFile);
		
	}
	
	}
