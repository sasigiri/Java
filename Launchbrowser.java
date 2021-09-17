package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manages the driver
		
		WebDriverManager.chromedriver().setup();
		
		//Launches webdriver
		
		ChromeDriver driver = new ChromeDriver();

		//Maximise webdriver
		driver.manage().window().maximize();
		//implicitly wait
		
				
	//get webpage
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		String title=driver.getTitle();
//		System.out.print(title);
		
		//Enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement username1 = driver.findElement(By.id("password"));
		username1.sendKeys("crmsfa");
		
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement linktext = driver.findElement(By.linkText("CRM/SFA"));
		linktext.click();
		
		WebElement linktext1 = driver.findElement(By.linkText("Create Lead"));
		linktext1.click();
		
		WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
		Companyname.sendKeys("BNYMELLON");
		
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("SasiSubramani");
		
		
		WebElement lastname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		lastname.sendKeys("Sasigiribabu");
		
		WebElement Salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		Salutation.sendKeys("Mrs");
		
		WebElement title1 = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title1.sendKeys("Tester");
		
		WebElement Annualrevenue = driver.findElement(By.id("createLeadForm_annualRevenue"));
		Annualrevenue.sendKeys("9lakhs");
		WebElement Sicid = driver.findElement(By.id("createLeadForm_sicCode"));
		Sicid.sendKeys("123456");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("na");
		driver.findElement(By.id("createLeadForm_importantNote")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("4");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("177");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasigiribabu@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sasigiri");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("MarvelRiverView");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600125");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("NA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("BANKING");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("G");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/09/21");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTING");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2500");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("2500");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("12345678910");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("sasi");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sahana springs");

		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("india");
		
		System.out.println("FIRSTNAME"+ firstname.getAttribute(title));
		
		driver.findElement(By.className("smallSubmit")).click();

		String title2 = driver.getTitle();
		if(title2.contains("View Lead | opentaps CRM"))
			System.out.println("Title page is verified"+title2);
			
			else
				
				System.out.println("unexpected"+title2);		
		
				
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
