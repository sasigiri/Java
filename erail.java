package week3.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS", Keys.ENTER);

		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU", Keys.ENTER);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		List<WebElement> trainnumbers = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[0]"));
		Thread.sleep(5000);

		int size = trainnumbers.size();
		System.out.println("Train no size" +size);

//		for (int i = 0; i < size; i++) {
//			String trainnum = trainno.get(i).getText();
//			System.out.println("Train Name" + trainnum);
		 driver.close();

		}


	}

//}
