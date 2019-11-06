package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanagerDemo {

	public static void main(String[] args) {

		//jar --> WebDriverManager.Jar
		// maven repository
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		

		
	}

}
