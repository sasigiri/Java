package week1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * FaceBook: psuedo code ================================ // Step 1: Download
		 * and set the path // Step 2: Launch the chromebrowser // Step 3: Load the URL
		 * https://en-gb.facebook.com/ // Step 4: Maximise the window // Step 5: Add
		 * implicit wait // Step 6: Click on Create New Account button // Step 7: Enter
		 * the first name // Step 8: Enter the last name // // Step 9: Enter the
		 * mobilenumber // Step 10: Enterthe password // Step 11: Handle all the three
		 * drop downs // Step 12: Select the radio button "Female" ( A normal click will
		 * do for this step) }
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sasi");
		driver.findElement(By.name("lastname")).sendKeys("subbu");
		driver.findElement(By.name("reg_email__")).sendKeys("8939123010");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ekantika");
		driver.findElement(By.name("birthday_day")).sendKeys("28");
	
		driver.findElement(By.name("birthday_year")).sendKeys("1985");
		driver.findElement(By.name("birthday_year")).sendKeys("1985");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		Thread.sleep(10000);
		
	driver.close();
	

		
	}
}
