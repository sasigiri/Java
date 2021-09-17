package weak2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesForce {

	public static void main(String[] args) {

		//Manage the Driver
		WebDriverManager.chromedriver().setup();
		
		//Launch Webdriver
		ChromeDriver driver =new ChromeDriver();
		
		//Maximize webdriver.
		driver.manage().window().maximize();
		
		//Addimplicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//getWebpage
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Sasi");
		driver.findElement(By.name("UserLastName")).sendKeys("Subramani");
		driver.findElement(By.name("UserEmail")).sendKeys("sasigiribabu@gmail.com");
				driver.findElement(By.name("CompanyName")).sendKeys("BNY MELLON");
				driver.findElement(By.name("UserPhone")).sendKeys("8939123010");
				WebElement title = driver.findElement(By.name("UserTitle"));				
				Select drop=new Select(title);				
				drop.selectByVisibleText("Operations Manager");
				
				WebElement CompEmp = driver.findElement(By.name("CompanyEmployees"));
				Select drop1=new Select(CompEmp);
				drop1.selectByVisibleText("1501+ employees");
				
				WebElement CompCntry = driver.findElement(By.name("CompanyCountry"));
				Select drop2=new Select(CompCntry);
				drop2.selectByVisibleText("India");
				
				//Attribute based xpath used
				
				driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"]")).click();
				
				//close the browser
				driver.close();
				
				
				
				
		
		
		
		
	}

}
