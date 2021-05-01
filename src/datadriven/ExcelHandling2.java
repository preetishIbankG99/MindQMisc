package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelHandling2 {
	public static void main(String[] args) throws InterruptedException, Throwable {
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/");
		try {
			File f=new File("‪H:\testread.xlsx");
			//ZipSecureFile.setMinInflateRatio(-1.0d);
			FileInputStream fis=new FileInputStream(f);
		    
			XSSFWorkbook wb=new XSSFWorkbook(fis);
		    
		    XSSFSheet sh=wb.getSheetAt(0);
		    int rc=sh.getLastRowNum();//or getPhysicalNumberOfRows() but for it  for(int i=1;i<rc;i++)
		    
		    
		    for(int i=1;i<rc;i++){
		    XSSFRow rw=sh.getRow(i);//for achieving row 3 elements
		    String un=rw.getCell(0).toString();//typecasting()
		     String pw=rw.getCell(1).toString();
		     driver.findElement(By.name("userName")).sendKeys(un);
		     driver.findElement(By.name("password")).sendKeys(pw);
		     driver.findElement(By.name("login")).click();
		     Thread.sleep(3000);
		    
		}
		  
		    
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
	}
}
