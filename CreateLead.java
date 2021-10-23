package TestNG.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Base {

	@Test(dataProvider = "sendData")
	public void creatlead(String company, String fname, String lname, String Phno) throws InterruptedException {

		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phno);
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider
	public String[][] sendData() throws IOException {
		String[][] readData = ReadExcel.readdata();
		return readData;

		// instead of using below raw date above code is used to get data from excel
		// String[][] data =new String[2][4];

		// data[0][0] ="Testleaf";
		// data[0][1] = "Hari";
		// data[0][2] = "R";
		// data[0][3] = "99";

//	data[1][0] ="Testleaf";
		// data[1][1] = "Sheriba";
		// data[1][2] = "T";
		// data[1][3] = "98";

		// return data;

	}

}
