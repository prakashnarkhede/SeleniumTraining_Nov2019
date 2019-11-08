package automationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	//This class will fill all data in insurance form --> then go to Price options page where we have webtable
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		driver.get("file:///E:/dummyProject/app.html");
		
		//Select value from make dropdown
		Select makeDDselect = new Select(driver.findElement(By.id("make")));
		makeDDselect.selectByVisibleText("BMW");

		//Select value from model dropdown
		Select modelDDselect = new Select(driver.findElement(By.id("model")));
		modelDDselect.selectByVisibleText("Motorcycle");

		//Enter cylindercapacity
		driver.findElement(By.id("cylindercapacity")).sendKeys("333");
		
		//Enter engineperformance
		driver.findElement(By.id("engineperformance")).sendKeys("333");
		
		//Enter dateofmanufacture
		driver.findElement(By.id("dateofmanufacture")).sendKeys("11/01/2019");
		
		//Select value from numberofseats dropdown
		Select numberofseatsDDselect = new Select(driver.findElement(By.id("numberofseats")));
		numberofseatsDDselect.selectByVisibleText("2");
		
		//Select value from numberofseatsmotorcycle dropdown
		Select numberofseatsmotorcycleDDselect = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
		numberofseatsmotorcycleDDselect.selectByVisibleText("2");
		
		//Select value from fuel dropdown
		Select fuelDDselect = new Select(driver.findElement(By.id("fuel")));
		fuelDDselect.selectByVisibleText("Petrol");

		//Enter payload
		driver.findElement(By.id("payload")).sendKeys("333");
		
		//Enter totalweight
		driver.findElement(By.id("totalweight")).sendKeys("3333");
		
		//Enter listprice
		driver.findElement(By.id("listprice")).sendKeys("33333");

		//Enter annualmileage
		driver.findElement(By.id("annualmileage")).sendKeys("3333");
		
		//Click on Next button Fill Vehicle Data
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		///////Page 2 //////////
		
		//Enter firstname
		driver.findElement(By.id("firstname")).sendKeys("FirstName");
		
		//Enter lastname
		driver.findElement(By.id("lastname")).sendKeys("LastName");
		
		//Enter birthdate
		driver.findElement(By.id("birthdate")).sendKeys("12/12/1989");
		
		//Select value from country dropdown
				Select countryDDselect = new Select(driver.findElement(By.id("country")));
				countryDDselect.selectByVisibleText("India");
		
		//Enter zipcode
		driver.findElement(By.id("zipcode")).sendKeys("333333");
		
		//Select value from occupation dropdown
		Select occupationDDselect = new Select(driver.findElement(By.id("occupation")));
		occupationDDselect.selectByVisibleText("Farmer");
		
		//Select Hobby speeding
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]")).click();
		
		//Click on Next button on Fill Insurant Data
		driver.findElement(By.id("nextenterproductdata")).click();
		
		
		///////Page 3 //////////
		
		//Enter startdate
		driver.findElement(By.id("startdate")).sendKeys("12/12/2019");
		
		
		//Select value from insurancesum dropdown
				Select insurancesumDDselect = new Select(driver.findElement(By.id("insurancesum")));
				insurancesumDDselect.selectByValue("3000000");
				
				//Select value from meritrating dropdown
				Select meritratingDDselect = new Select(driver.findElement(By.id("meritrating")));
				meritratingDDselect.selectByVisibleText("Bonus 1");
				
				//Select value from damageinsurance dropdown
				Select damageinsuranceDDselect = new Select(driver.findElement(By.id("damageinsurance")));
				damageinsuranceDDselect.selectByVisibleText("Partial Coverage");
				
				//Select value from courtesycar dropdown
				Select courtesycarDDselect = new Select(driver.findElement(By.id("courtesycar")));
				courtesycarDDselect.selectByVisibleText(" Yes");
		
		//Select Optional Products
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
		
		//Click on Next button on Fill Product Data
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		
		
		
		///Here starts webtable handling
		
	//	table ==> this is u identify it is table
	//			--> thead --> header of table
	//			--> tbody --> actual table data
	//			   --> tr (table rows) --> complete table row
	//			      --> td (table data) --> actual table data
	//			--> tfoot --> footer of table
	
	//   //table[@id='priceTable']/tbody/tr[rownum]/td[colnum]
		String silverPlanPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[2]")).getText();
		String goldPlanPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[3]")).getText();
		String platinumPlanPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[4]")).getText();
		String ultimatePlanPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[5]")).getText();
		System.out.println("silverPlanPrice is:  "+silverPlanPrice);
		String ExpectedSilverPlanPrice = "268.00";
		Assert.assertEquals(silverPlanPrice, ExpectedSilverPlanPrice, " message ");
		
		for(int i = 1; i <= 5; i++) {
			String tableDataText = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td["+i+"]")).getText();
			System.out.println("tableDataText is: "+tableDataText);
		}
		
		//total number of rows
		List<WebElement> l = driver.findElements(By.xpath("//table[@id='priceTable']/tbody/tr"));
		int rowCount = l.size();
		System.out.println("Total number of rows in tbody is: "+rowCount);
		
		//find out total num of columns
		int colCount = driver.findElements(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td")).size();
		System.out.println("Total number of Columns in tbody is: "+colCount);
//
//		WebElement ele = driver.findElement(By.id(""));
//		boolean result = ele.isDisplayed();
//		if(result) {
//			//
//			//
//		}
//		
	}
	
	}
