package weak2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class acmetest {

	public static void main(String[] args) {

		//Manage the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch webdriver.
		ChromeDriver driver= new ChromeDriver();
		
		//get url
	driver.get("https://acme-test.uipath.com/login");
	
	//maximise window
	driver.manage().window().maximize();
	
	//implicitle wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	//driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//get title of the page
	String title = driver.getTitle();
	System.out.print(title);
	
	//logout
	driver.findElement(By.linkText("Log Out"));
	
	//close the browser
	driver.close();
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
