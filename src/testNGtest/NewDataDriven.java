package testNGtest;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewDataDriven {
public WebDriver driver;
@Test(dataProvider="testdata")
public void login(String username,String password){
	driver=new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.className("tdb1")).click();
	Assert.assertEquals("http://www.gcrit.com/build3/admin/login.php",driver.getCurrentUrl());
	driver.close();
}
	@DataProvider(name="testdata")
	public void readExcel() throws IOException{
	XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\GUDU\\Desktop\\gudubyte.xlsx");
	XSSFSheet sh=wb.getSheet("Sheet1");
    int rowCount=sh.getPhysicalNumberOfRows();
    for(int i=0;i<rowCount;i++){   
    	int colCount=sh.getRow(i).getPhysicalNumberOfCells();
    for(int j=0;j<colCount;j++){
    	XSSFCell cell=sh.getRow(i).getCell(j);
    	System.out.println(cell);
		 }
	
	
}
	
  }
}
