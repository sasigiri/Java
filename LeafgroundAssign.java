package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAssign {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
//Get Attribute value of the Get text entered
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.close();

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://leafground.com/pages/Button.html");
		driver1.findElement(By.xpath("//button[text()='Go to Home Page']")).click();

	}

}
