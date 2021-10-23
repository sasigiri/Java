package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaaassign {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");

		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions select = new Actions(driver);
		select.moveToElement(brand).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='brandSearchBox']"));
		Thread.sleep(2000);
		WebElement loreal = driver.findElement(By.linkText("L'Oreal Paris"));
		Actions loreal1 = new Actions(driver);
		loreal1.click(loreal).perform();
		String title = driver.getTitle();
		System.out.println("Title is :" + title);
		WebElement Poplarity = driver.findElement(By.xpath("//span[@title='POPULARITY']"));
		Actions Click = new Actions(driver);
		Click.click(Poplarity).perform();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		WebElement Shamp = driver.findElement(By.xpath("//span[text()='Shampoo']"));
		Actions click1 = new Actions(driver);
		click1.click(Shamp).perform();
		Thread.sleep(2000);

		WebElement Concen = driver.findElement(By.xpath("//div[text()='Concern']"));
		Actions click2 = new Actions(driver);
		click2.click(Concen).perform();
		Thread.sleep(2000);

		WebElement Clor = driver.findElement(By.xpath("//span[text()='Color Protection']"));
		Actions click3 = new Actions(driver);
		click3.click(Clor).perform();
		Thread.sleep(2000);

		WebElement prshamp = driver.findElement(By.tagName("h2"));		
		Actions click4 = new Actions(driver);
		click4.click(prshamp).perform();
		
		WebElement MRP = driver.findElement(By.xpath("//span[@class='post-card__content-price-offer']"));
		
		System.out.println("MRP OF THE PRODUCT IS " +MRP);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		
		
		
		//Actions click5 = new Actions(driver);
	//	Thread.sleep(2000);
		//	click5.moveToElement(Add2bg).perform();
		
		
		
		
		
		
		
		
		

		


		

	}

}
