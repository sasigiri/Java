package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.linkText("Droppable"));
		System.out.println("Clicked Droppable");
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(frame);
		System.out.println("Im in frame");
		WebElement webdrag = driver.findElement(By.id("draggable"));
		System.out.println("DRAGGED");
		WebElement webdrop = driver.findElement(By.id("droppable"));
		System.out.println("DROPPED");
		Actions builder =new Actions(driver);
		builder.dragAndDrop(webdrag, webdrop).perform();
		System.out.println("Drag and Drop done succussfully");
		
		
		
		
		
		
		

		
		

	}

}
