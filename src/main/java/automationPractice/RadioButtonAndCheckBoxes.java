package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAndCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("file:///E:/dummyProject/app.html");
	//	driver.get("http://sampleapp.tricentis.com/101/");		
		//driver.findElement(By.id("nav_camper")).click();
	
		String rightHandDrive= "No";
		
		WebElement e= driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]"));
		WebElement e1 = driver.findElement(By.id("righthanddriveyes"));
		System.out.println("Test ++++++++++++++++++");
		System.out.println("text is "+e.getText());
		System.out.println("text is e1 "+e1.getText());

		System.out.println("is selected is"+e1.isSelected());

		e.click();

		System.out.println("is selected is"+e1.isSelected());

		//FindElement Returns webElement
		
		Thread.sleep(5000000);
	WebElement rightHandYesWebELement = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]"));
	WebElement rightHandNoWebELement = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]"));

	//If Radio button or Checkbox is displayed on the webpage
	//If Radio button or Checkbox is enabled on the webpage	
	//Check the default selection of the Radio button or Checkbox

	System.out.println("result of isDisplayed method is: "+rightHandYesWebELement.isDisplayed());	
	System.out.println("result of isEnabled method is: "+rightHandYesWebELement.isEnabled());	
	System.out.println("result of isSelected method is: "+rightHandYesWebELement.isSelected());	
	

	//Explicit Wait --> 
	//rightHandYesWebELement.click();
	
	if(rightHandDrive.equalsIgnoreCase("Yes")) {
		rightHandYesWebELement.click();
	} else {
		rightHandNoWebELement.click();
	}
	
	
	//explicit wait
	//System.out.println("Text is"+driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span")).getText().toString());

	
//	List<WebElement> radiolist = driver.findElements(By.name("Right Hand Drive"));
//	System.out.println("Size of radio list is: "+radiolist.size());
//	Thread.sleep(3000);
//	radiolist.get(0).click();
//	System.out.println("Radio 1 text is: "+radiolist.get(0).getText());
//	System.out.println("Radio 2 text is: "+radiolist.get(1).getText());
	
	//checkboxes
	
	//click on next button to navigate to insurant data page
	driver.findElement(By.id("nextenterinsurantdata")).click();
	
	//webElements for hobbies
	Thread.sleep(2000);
	WebElement speedingEle = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
	WebElement bungeejumpingELe = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]"));
	Thread.sleep(2000);
	
	boolean bJumping = true;
	boolean speeding =false;
	
	if(bJumping)
	{
	bungeejumpingELe.click();
	}
	if(speeding) {
		speedingEle.click();		
	}
	
	Thread.sleep(2000);
	System.out.println("result of isDisplayed method on Bjumping is: "+bungeejumpingELe.isDisplayed());	
	System.out.println("result of isEnabled method is: "+bungeejumpingELe.isEnabled());	
	System.out.println("result of isSelected method is: "+bungeejumpingELe.isSelected());	
	
	WebElement ele = driver.findElement(By.id("bungeejumping"));
	Thread.sleep(2000);

	System.out.println(ele.isSelected());
	
	
	}
	}
