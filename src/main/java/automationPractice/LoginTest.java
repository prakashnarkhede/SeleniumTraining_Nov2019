package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Exception {
		//set driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\Selenium Online Training\\DriverExecutables\\chromedriver.exe");		
		//open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//navigate to google.com
		driver.get("http://qdpm.net/demo/v9/index.php");
		
		
		//driver.findElement(By.className(""))
		//List<WebElement> listOfA = driver.findElements(By.tagName("a"));
	//	System.out.println("Size of list is: "+ listOfA.size());
		
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.partialLinkText("forgotten")).click();
		
		//only with anchor tags
		//link text
		//driver.findElement(By.linkText("Password forgotten?")).click();
		
		
		WebElement loginName = driver.findElement(By.name("login[email]"));
		loginName.sendKeys("administrator@localhost.com");
		//POM Page Factory
		driver.findElement(By.name("login[password]")).sendKeys("administrator1");
		
		
		//login form
		///type = submit
		
		//selenium have no reporting capability
		//testng -- can give report
		// extent report
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		String webpageTitle = driver.getTitle();
		
		System.out.println(webpageTitle);
		
		if(webpageTitle.equals("qdPM | Dashboard")) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failure");
			throw new Exception("User is not able to login");
		}
		
		driver.close();

	}

}
