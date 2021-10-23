package week4.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnselectable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.findElement(By.linkText("Selectable"));
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='/resources/demos/selectable/default.html']"));
		driver.switchTo().frame(frame1);
		System.out.println("Im in Frame");
		WebElement Selectable = driver.findElement(By.xpath("//li[text()='Item 1']"));
		Actions Selectable1 =new Actions(driver);
		Selectable1.click(Selectable).perform();
		
		
		
		
		
		
		
		
	}

}
