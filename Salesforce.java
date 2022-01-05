package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
//		Assignment:3 -- psuedo code 
		
//		==================================================
//		SalesForce:
//		// Step 1: Download and set the path 
//		// Step 2: Launch the chromebrowser
//		// Step 3: Load the URL 
//		           https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
//		// Step 4: Maximise the window
//		// Step 5: Add implicit wait
//		// Step 6: Fill in all the text boxes
//		// Step 7: Handle all the dropdowns
//		// Step 8: Click the check box
//		// Step 9: Close the browser
//		*Note: No need click Start my freeTrial

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("Sasi");
		driver.findElement(By.name("UserLastName")).sendKeys("Subbu");
		driver.findElement(By.name("UserEmail")).sendKeys("Sasigiribabu@gmail.com");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select s1 = new Select(title);
		s1.selectByValue("IT_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		WebElement emp = driver.findElement(By.name("CompanyEmployees"));
		Select s2 = new Select(emp);
		s2.selectByIndex(5);
		
	driver.findElement(By.name("UserPhone")).sendKeys("8939123010");
	WebElement Country = driver.findElement(By.name("CompanyCountry"));
	Select s3 = new Select(Country);
	s3.selectByVisibleText("India");
	
	driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"]")).click();
	
	Thread.sleep(10000);
	driver.close();
	
	
	

		

		
		
		
		
		
		

		
		
		
	
	}
	

}
