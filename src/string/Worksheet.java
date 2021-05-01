package string;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Data DrivenTesting
public class Worksheet {

	public static void main(String[] args) throws IOException {
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
////		driver.get("http://google.com");
		 XSSFWorkbook wb=new XSSFWorkbook("H:\\Book1.xlsx");
		 XSSFSheet sh=wb.getSheet("Sheet1");
		 int rowCount=sh.getPhysicalNumberOfRows();
		 for(int i=0;i<rowCount;i++){
			 int colCount=sh.getRow(i).getPhysicalNumberOfCells();
			 for(int j=0;j<colCount;j++){
				 XSSFCell cell=sh.getRow(i).getCell(j);
				 System.out.print(" "+cell);
				 
			 }
		 System.out.println();
		 }
		 

	}

}
