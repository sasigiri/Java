package TestNG.testcase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenowbase {
	
	public ChromeDriver driver;


	public  void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signon.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	public  void postcondition() {
		driver.close();
		
	}

}
