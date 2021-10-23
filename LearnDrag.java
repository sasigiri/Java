package week4.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDrag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.findElement(By.linkText("Draggable"));

		System.out.println("Clicked Draggable");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/resources/demos/draggable/default.html']"));
		driver.switchTo().frame(frame1);
		System.out.println("i am in frame now");

		WebElement Webdrag1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println("Going to change position");
		
		Actions builder = new Actions(driver);
		//Thread.sleep(5000);
		WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.visibilityOf(Webdrag1));
		builder.dragAndDropBy(Webdrag1,50,50).perform();
		
		



	}

}
