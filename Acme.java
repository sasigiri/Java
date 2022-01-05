package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) throws InterruptedException {

//		1. Load url "https://acme-test.uipath.com/login"
//		2. Enter email as "kumar.testleaf@gmail.com"
//		3. Enter Password as "leaf@12"
//		4. Click login button
//		5. Get the title of the page and print
//		6. Click on Log Out
//		7. Close the browser (use -driver.close())
//		
//		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class ='btn btn-primary']")).click();
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		String title3 = driver.getPageSource();
		
		
		String title = driver.getCurrentUrl();
		System.out.println("Title of the url is " + title);
		System.out.println("Title of the page is " +title2);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("Pagesource will display complete HTML code");
		System.out.println("pagesource is"+title3);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		

	}

}
