package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		
		//Selenium - DD are handled using Select Class
		//webElement??
		//selectByVisibleText
		WebElement makeDDEle=driver.findElement(By.id("make"));
		Select makeDD = new Select(makeDDEle);
		makeDD.selectByVisibleText("BMW");
		
		//selectByValue
		WebElement modelDDEle=driver.findElement(By.id("model"));
		Select modelDD = new Select(modelDDEle);
		modelDD.selectByValue("Motorcycle");
		
		//selectByIndex
		WebElement numberofseatsDDEle=driver.findElement(By.id("numberofseats"));
		Select numberofseatsDD = new Select(numberofseatsDDEle);
		numberofseatsDD.selectByIndex(9);
		
		//desleect Dropdown values
		//use deselectAll --> only for multidropdown
		//all deselect methods are applicable for multiselect dropdown
		//numberofseatsDD.deselectByIndex(3);
		
		//check if dropdown is multidropdown??? ==> False
		System.out.println("is Number of seats DD multiple?  "+numberofseatsDD.isMultiple());
		
		//check the selected value ==> BMW
		System.out.println("Selected value in Make DD is: "+makeDD.getFirstSelectedOption().getText());
		
		
		//get all options from make Dropdown
		List<WebElement> makeList = makeDD.getOptions();
		System.out.println("List size of Make WebELements is: "+makeList.size());
		int NumberCount = makeList.size();
		for(int i = 0; i < NumberCount; i++) {
			System.out.println("make dropdown values are: "+makeList.get(i).getText());
		}
	}
	}
