package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.input.ReversedLinesFileReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");		
		
		//navigate to Other webElements
		driver.findElement(By.id("nav_truck")).click();
		
		//click on Tooltip and Double click
		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='Tooltip and Double click']")).click();
		
		//keyboard and mouse actions using selenium
		//Actions Class --> supports UI
		//Actions class --> first build a set of instructions and then perfrom
		// --> perform should be the last method call
		// ==> if multiple actions are doing in same statement then use build() before perform
		
		Actions act = new Actions(driver);
		
//		// perform right click
//		WebElement rightClickButtonWebEle = driver.findElement(By.id("rightClickBtn"));		
//		act.contextClick(rightClickButtonWebEle).perform();
//		
//		//double click		
//		WebElement doubleClickButtonWebEle = driver.findElement(By.id("doubleClickBtn"));
//		act.doubleClick(doubleClickButtonWebEle).perform();
		
		
		WebElement mouseHoverWebEle = driver.findElement(By.id("tooltipDemo"));
		WebElement toolTipMessageWebEle = driver.findElement(By.xpath("//div[@id='tooltipDemo']/span"));
		//do mouse hover
		act.moveToElement(mouseHoverWebEle).perform();
		//read tooltip message
		String toolTipMessage = toolTipMessageWebEle.getText();
		System.out.println("toolTipMessage is: "+toolTipMessage);
		
		//chain of actions:::
	  //act.moveToElement(element).click().keyDown(element, Keys.SHIFT).sendKeys("panarkhede").keyUp(element, Keys.SHIFT).doubleClick(element).contextClick(element).build().perform();
		
	
		
		//Drag and Drop
		//click on Dropable
//		driver.findElement(By.xpath("//div[@id='sidebar']//a[text()='Droppable']")).click();
//
//		//Drag and drop
//		//get webElements of drag and drop 
//		WebElement dragMe = driver.findElement(By.id("draggable"));
//		WebElement dropHere = driver.findElement(By.id("droppable"));
//		
//		act.dragAndDrop(dragMe, dropHere).perform();
		
		
		
		///KeyBoard Methods
		//send keys
		WebElement ele = driver.findElement(By.id(""));
		act.sendKeys(ele, "Data to be sent").perform();
		
		//pressing any key // release any key
		
		//To hit enter key of computer
		//driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
		//or
		//use actions class to achieve same action
		act.keyDown(driver.findElement(By.id("loginbutton")), Keys.ENTER).perform();
		act.keyUp(driver.findElement(By.id("loginbutton")), Keys.ENTER).perform();
		
		
		act.sendKeys(driver.findElement(By.id("loginbutton")), Keys.ENTER).perform();
		
		
		//click using actions
		act.moveToElement(mouseHoverWebEle).click().build().perform();
		
		
		
	}
	
	}
