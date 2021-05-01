package collection;
import java.io.File;
import java.io.IOException;

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

public class DataDrivenTesting {
	public WebDriver driver;
	 @Test(dataProvider="testdata")
	 public void login(String username,String password){
		 driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.id("email")).sendKeys(username);
		 driver.findElement(By.id("pass")).sendKeys(password);
		 Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
         driver.close();
}
	 
	 
	 @DataProvider(name="testdata")
public Object [] [] readExcel()throws IOException, BiffException  {
File f=new File("H:\\testing tools videos\\Mukesh selenium\\DataDriven\\reuse.xls");
Workbook w=Workbook.getWorkbook(f);
Sheet s=w.getSheet(0);
int rows=s.getRows();
int cols=s.getColumns();
System.out.println(rows);
System.out.println(cols);


String inputData[] []=new String[rows][cols];
for (int i=0;i<rows;i++){
	for(int j=0;j<cols;j++){
		//for reading excel file column is superior so we declare "j" as first element in getCell
		//for passing data in excel row is superior Cell(i,j) i=row ,j=column
		Cell c=s.getCell(j,i);
		inputData[i][j]=c.getContents();
		System.out.println(inputData[i][j]);
		
	}
}
	
return inputData;
}
}
