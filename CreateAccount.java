package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// Pseudo Code
		// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		// * 2. Enter UserName and Password Using Id Locator
//		 * 3. Click on Login Button using Class Locator
		// * 4. Click on CRM/SFA Link
		// *
		// * 5. Click on Accounts Button

		// * 6. Click on Create Account
		// * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited
		// Account
		// * 8. Enter DEscriptiion as "Selenium Automation Tester"
		// * 9. Enter LocalName Field Using Xpath Locator
		// 10. Enter SiteName Field Using Xpath Locator
		// * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as
		// Attribute
		// * 12. Select Industry as ComputerSoftware
		// * 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		// 14. Select Source as Employee using SelectByValue
		// * 15. Select Marketing Campaign as eCommerce Site Internal Campaign using
		// SelectbyIndex
		// * 16. Select State/Province as Texas using SelectByValue
		// * 17. Click on Create Account using Xpath Locator

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("groupNameLocal")).sendKeys("Sasi Subramani");
		driver.findElement(By.id("officeSiteName")).sendKeys("Subramani");
		driver.findElement(By.id("annualRevenue")).sendKeys("1000000");
		driver.findElement(By.name("industryEnumId")).click();
		driver.findElement(By.xpath("//option[text()='Computer Hardware']")).click();
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select s1 = new Select(owner);
		s1.selectByVisibleText("S-Corporation");
		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select s2 =new Select(Source);
		s2.selectByValue("LEAD_EMPLOYEE");
		WebElement Campign = driver.findElement(By.id("marketingCampaignId"));
		Select s3=new Select(Campign);
		s3.selectByIndex(6);
				WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s4 = new Select(state);
		s4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		Thread.sleep(6000);
		driver.close();
	
		
		
		
		
				
		
		
		
	
		
		
		
		
		
		
		
	}

}
