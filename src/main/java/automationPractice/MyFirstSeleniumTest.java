package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyFirstSeleniumTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//set driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\DriverExecutables\\chromedriver.exe");
		//RemoteWebDriver
		//WebDriver manager
		
		//open browser
		WebDriver driver = new ChromeDriver();

		//navigate to google.com
		driver.get("https://www.seleniumhq.org/download/");
		
		Thread.sleep(4000);
		
		//close brower
		driver.close();
		
	}
	public void m1() {
		int i = 0;
		
	}
	

}
