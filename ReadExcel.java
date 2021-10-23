package TestNG.testcase;

import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readdata() throws IOException {
//step 1 - setup the path of the workbook
		XSSFWorkbook wb = new XSSFWorkbook("D:\\javaprogram\\Seleniumsep\\MavenProject\\Data\\createLead.xlsx");

		// step 2 - get into the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");

		int rowCount = ws.getLastRowNum();
		System.out.println("Row count is: "+rowCount);
		
		int Cellcount= ws.getRow(0).getLastCellNum();
		System.out.println("Cell count is ;" +Cellcount);
		
		//declare the string [][]
		String[][] data =new String [rowCount] [Cellcount];
		

		// if getting multiple data from excel using for condition
		for (int i = 0; i <rowCount; i++) {
			
			for (int j = 0; j <Cellcount ; j++) {
				
				// writing code in short instead of assigning variable to each class
			String text = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.print(" " +text);
			data[i][j] =text;
			}
			
			// Step 3 - get into the row
			// XSSFRow row = ws.getRow(i); //it accepts only index

			// step 4 = get into the cell
			// XSSFCell cell = row.getCell (1);

			// step5 = to read the data
			// String text = cell.getStringCellValue();
			//System.out.println(text);

		}
		// final step

		wb.close();
return data;

	}

}

//steps to integrate ReadExcel  with Data provider
//1. Declare 2D string data with rowcount and cell count as the size
//2. Assign the excel date to 2D array as data(i-0 ) (j)
//3.Convert main method to normal method
//Add Return statement and update return type as String [][]


