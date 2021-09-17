package weak2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAssign {

	public static void main(String[] args) {

		//Manage the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the webdriver
		ChromeDriver driver =new ChromeDriver();
		
		//geturl
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Maximise window
		
		driver.manage().window().maximize();
		
		//implicity wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("sasigiribabu@gmail.com");
		
		
				
		
		
		
		
		
	}

}
