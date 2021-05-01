package smallframeworkconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenExample {
public void readExcel(String filePath,String fileName,String sheetName) throws IOException {
	File file=new File(filePath+"\\"+fileName);
	FileInputStream fis=new FileInputStream(file);
	Workbook loginWorkbook=null;
	
	String fileExtension=fileName.substring(fileName.indexOf("."));
	if (fileExtension.equals(".xlsx")) {
		loginWorkbook=new XSSFWorkbook(fis);
		
	}
	else if(fileExtension.equals(".xls")) {
		loginWorkbook=new HSSFWorkbook(fis);
		}
	
	Sheet loginsheet=loginWorkbook.getSheet(sheetName);
	int rowCount=loginsheet.getLastRowNum()-loginsheet.getFirstRowNum();
	for(int i=1;i<rowCount+1;i++) {
		Row row=loginsheet.getRow(i);
		String username=row.getCell(0).getStringCellValue();
		String password=row.getCell(1).getStringCellValue();
		//tesing for username and password
	}
	
}
public void test(String username ,String password) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/v4/");
	WebElement userid=driver.findElement(By.name("uid"));
	userid.sendKeys(username);
	WebElement passwd=driver.findElement(By.name("password"));
	passwd.sendKeys(password);
	
	WebElement loginbtn=driver.findElement(By.name("btnLogin"));
	loginbtn.click();
	driver.close();
}
public static void main(String[] args) throws IOException {
	DataDrivenExample read=new DataDrivenExample();
	String filePath="H:\\photonwp\\MindQ\\";
	read.readExcel(filePath,"LoginData.xlsx","Sheet1");
}
}