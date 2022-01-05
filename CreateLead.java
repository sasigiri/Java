package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on Leads Button
		 * 
		 * 6. Click on create Lead Button
		 * 
		 * 7. Enter CompanyName using id Locator
		 * 
		 * 8. Enter FirstName using id Locator
		 * 
		 * 9. Enter LastName using id Locator
		 * 
		 * 10. Select value as Employee in Source Using SelectbyVisible text
		 * 
		 * 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using
		 * SelectbyValue
		 * 
		 * 
		 * 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		 * 
		 * 14. Select value as India in Country Field Using SelectbyVisibletext
		 * 
		 * 15. Click on create Lead Button Using name Locator
		 * 
		 * 16. Get the Title of the resulting Page
		 */

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subbu");
		WebElement Source = driver.findElement(By.name("dataSourceId"));
		Select s1 = new Select(Source);
		s1.selectByVisibleText("Employee");
		WebElement Campaign = driver.findElement(By.name("marketingCampaignId"));
		Select s2 = new Select(Campaign);
		s2.selectByValue("9001");
		WebElement Owner = driver.findElement(By.name("ownershipEnumId"));
		Select s3 = new Select(Owner);
		s3.selectByIndex(5);
		WebElement Country = driver.findElement(By.name("generalCountryGeoId"));
		Select s4 = new Select(Country);
		s4.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Title of the result page is" + title);

		Thread.sleep(6000);
		driver.close();

	}
}
