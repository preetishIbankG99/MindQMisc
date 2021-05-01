package datadriven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Apachepoi {
static WebDriver driver;
@Test(dataProvider="testdata")
public void facebookinput(String emailid,String password,String firstname,String surname,String mobilenumber){
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(emailid);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.id("u_0_4")).sendKeys(firstname);
	driver.findElement(By.id("u_0_6")).sendKeys(surname);
	driver.findElement(By.id("u_0_9")).sendKeys(mobilenumber);
	/*try {
		Thread.sleep(3000);
		
		
		WebElement day=driver.findElement(By.xpath(".//*[@id='day']"));
		
		Select sel=new Select(day);
		sel.selectByValue("7");
		WebElement month=driver.findElement(By.xpath(".//*[@id='month']"));
		Select sel1=new Select(month);
		sel1.selectByValue("5");
		WebElement year=driver.findElement(By.xpath(".//*[@id='year']"));
		
		Select sel2=new Select(year);
		sel2.selectByValue("1990");
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}*/
}
@DataProvider(name="testdata")
public Object[][]passData() throws IOException, InvalidFormatException{
	File frc=new File("D:\\workspace\\MindQ\\Excel\\facebbook.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(frc);
	XSSFSheet sh=wb.getSheetAt(0);
	//int k=0;
    int rowCount=sh.getPhysicalNumberOfRows();
    int colCount=sh.getRow(0).getPhysicalNumberOfCells();
    //int colCount=sh.getRow(k).getPhysicalNumberOfCells();
    String Data[][]=new String[rowCount][colCount];
    for(int i=0;i<rowCount;i++){
    //if you dont want apache to read starting heading of your excel file  you can make i=1
	for(int j=0;j<colCount;j++){
    Data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
	
}
}
return Data;		
}
}
