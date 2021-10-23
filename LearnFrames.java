package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");

		WebElement frame1 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		
		//IT TAKES ME OUT OF THE CONTENT - means coming out of all frames  and lands control in main page
		
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
