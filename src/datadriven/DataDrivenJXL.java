package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DataDrivenJXL {
static WebDriver driver;
@Test(dataProvider="testdata")
public void facebook(String emailid,String password,String firstname,String surname) throws Exception{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(emailid);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.id("u_0_4")).sendKeys(firstname);
	driver.findElement(By.id("u_0_6")).sendKeys(surname);
	Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/" );
   driver.close();
}
@DataProvider(name="testdata")
public Object[][] readexcel() throws BiffException, IOException{
	File f=new File("C:\\Users\\GUDU\\Desktop\\project docs\\facebbook.xls");
	Workbook w=Workbook.getWorkbook(f);
	Sheet s=w.getSheet(0);
	int rows=s.getRows();
	int cols=s.getColumns();
	
	String inputdata[][]=new String[rows][cols];
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			Cell c=s.getCell(j, i);
			inputdata[i][j]=c.getContents();
			System.out.println(inputdata[i][j]);
		}
	}
	
	return inputdata;
	
}



}