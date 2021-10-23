package week4.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");

		// SIMPLE ALERT BOX
		// CLICK ON THE ALERT TEXT BOX
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);

		alert.accept();

		// Confirmation alert box to PRESS "OK"

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);

		// //Confirmation alert box to PRESS "CANCEL"

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.dismiss();

		// TO PRINT SYSTEM OUT PUT

		String text = driver.findElement(By.id("result")).getText();
		if (text.contains("You pressed Cancel!"))
			;
		{
			System.out.println(text);
		}
//GETTING TEXT IN ALERT BOX
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(2000);
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Sasi");
		Thread.sleep(2000);
		alert4.accept();
		
		driver.close();
		

	}

}
