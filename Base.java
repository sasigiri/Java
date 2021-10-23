package TestNG.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public ChromeDriver driver;
	
	@Parameters({"url","username","password"}) //parameter name matters: order doesn't matters.
	
	@BeforeMethod
	public  void Precondition(String url,String uname, String pwd) throws InterruptedException { //order matters but argument name can be anything
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);

	}
	@AfterMethod
	public  void postcondition() throws InterruptedException {
		Thread.sleep(4000);

	driver.close();
		


	}
}

