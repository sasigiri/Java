package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnResizableAssign {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		driver.findElement(By.linkText("Resizable"));
		System.out.println("Clicked Resizable");
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/resources/demos/resizable/default.html']"));
		driver.switchTo().frame(frame);
		System.out.println("Im in frame");
		WebElement Resize = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-resizable']/div[3]"));
		Actions builder = new Actions(driver);
		//builder.clickAndHold(Resize).moveByOffset(10,20).perform();
		builder.clickAndHold(Resize).moveToElement(Resize,35,60).perform();
		


		//Thread.sleep(5000);
		System.out.println("Resize done");
		
				
		
		
		
	}

}
