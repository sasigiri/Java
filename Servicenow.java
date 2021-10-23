package TestNG.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenow {
	
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.servicenow.com//");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Getdetails = driver.findElement(By.xpath("//span[text()='Get Details']"));
		Thread.sleep(2000);
		Actions select = new Actions(driver);
		select.moveToElement(Getdetails).click().perform();
		
		
		
		
				
		
	}

}
