package weak2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAsign {

	public static void main(String[] args) {

		//Manages the Driver
		WebDriverManager.chromedriver().setup();
		
		//Launch webdriver
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize webdriver
		driver.manage().window().maximize();
		
		//Add Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
									
		//Get Webpage
		driver.get("https://en-gb.facebook.com");
		//get title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close the browser
		//driver.close();
		
		
		//Click on Create New Account button
		
		WebElement newAccount = driver.findElement(By.linkText("Create New Account"));
		newAccount.click();
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Sasi");
		
		driver.findElement(By.name("lastname")).sendKeys("Subramani");
		driver.findElement(By.name("reg_email__")).sendKeys("sasigiribabu@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sasigiribabu@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Ekantika14");
		WebElement Day = driver.findElement(By.id("day"));
		Select drop=new Select(Day);
		drop.selectByVisibleText("28");
		WebElement month = driver.findElement(By.id("month"));
		Select drop1=new Select(month);
		drop1.selectByVisibleText("Oct");
		WebElement Year = driver.findElement(By.id ("year"));
		Select drop2=new Select(Year);
		drop2.selectByVisibleText("2019");
		
		//text based xpath used
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		

		
		
		
		
		
	}

}
