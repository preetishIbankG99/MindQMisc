package interview;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DATADRIVEN {
	public static WebDriver driver;
	@Test(dataProvider="testdata")
	public void login(String username,String password ,String firstname,String surname){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_4")).sendKeys(firstname);
		driver.findElement(By.id("u_0_6")).sendKeys(surname);
		driver.close();
		}
@DataProvider(name="testdata")
public Object[][]readexcel() throws BiffException, IOException, InvalidFormatException{
File f=new File("H:\\Users\\Gudu\\Desktop\\facebook.xlsx");
/*
 * My JXL
 * 
 * 
 */

/*JXL*/
/*Workbook w=Workbook.getWorkbook(f);
Sheet s=w.getSheet(0);
int rows=s.getRows();
int cols=s.getColumns();
String inputData[][]=new String[rows][cols];
for(int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
Cell c=s.getCell(j, i);
inputData[i][j]=c.getContents();
System.out.println(inputData[i][j]);

	}
}*/
/*=====================================================================*/
/* Apache Poi XLSX*/
XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet sh=wb.getSheetAt(0);
int rows=sh.getPhysicalNumberOfRows();
int cols=sh.getRow(0).getPhysicalNumberOfCells();
String Data[][]=new String[rows][cols];
for(int i=0;i<rows;i++){
	for (int j=0;j<cols;j++){
		Data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
	System.out.println(Data[i][j]);
	}
}
return Data;
	
}
		
	
		
}
