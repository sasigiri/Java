package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

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
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 * 
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your
		 * choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
		 */

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sasi");
		driver.findElement(By.id("lastNameField")).sendKeys("Subbu");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sasi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("subbu");
		driver.findElement(By.name("departmentName")).sendKeys("computer");
		driver.findElement(By.name("description")).sendKeys("Im a software tester");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sasigiribabu@gmail.com");
		WebElement city = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select s1 = new Select(city);
		s1.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		
		  driver.findElement(By.linkText("Edit")).click();
		  driver.findElement(By.name("description")).clear();
		  driver.findElement(By.name("importantNote")).
		  sendKeys("Description field cleared");
		  driver.findElement(By.name("submitButton")).click(); String title =
		  driver.getTitle(); System.out.println("Title of the page is " + title);
		 
			Thread.sleep(6000);
			driver.close();

		  
	}

}
