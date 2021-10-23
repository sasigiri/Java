package week4.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.findElement(By.linkText("Sortable"));
		WebElement frame = driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/sortable/default.html\"]"));
		driver.switchTo().frame(frame);
		System.out.println("Im in frame");
		WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement Item2 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		Point location = Item2.getLocation();
		int x =location.getX();
		int y=location.getY();
		
		Actions sortable =new Actions(driver);
		Thread.sleep(2000);
		
		sortable.dragAndDropBy(Item1, x, y).perform();
		

		
		
		
		
		
		
				
		
		

		
	}

}
