package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookDemodatadriven {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://facebook.com");
	FileInputStream fis=new FileInputStream("C:\\Users\\GUDU\\Desktop\\mypersonaldocs\\facebook.xls");
    HSSFWorkbook wb=new HSSFWorkbook(fis);
    HSSFSheet sh=wb.getSheetAt(0);
    int rc=sh.getPhysicalNumberOfRows();
	for(int i=1;i<=rc;i++){
		HSSFRow rw=sh.getRow(i);
		String un=rw.getCell(0).toString();
		String pw=rw.getCell(1).toString();
		String e_name=rw.getCell(2).toString();
		//datadriven from excel sheet
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys(un);
	
		WebElement passw=driver.findElement(By.id("pass"));
		passw.sendKeys(pw);
	
	WebElement submit=driver.findElement(By.cssSelector("input[type='submit']"));
	submit.click();
	Thread.sleep(3000);
	String a_name=driver.findElement(By.xpath(".//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span")).getText();
	HSSFCell cl=rw.createCell(3);
	cl.setCellValue(a_name);
	
	if(e_name.contentEquals(a_name)){
		HSSFCell status=rw.createCell(4);
		status.setCellValue("pass");
	}
	
	else{
		HSSFCell status=rw.createCell(4);
		status.setCellValue("fail");
	
	
	}
	FileOutputStream fout=new FileOutputStream("C:\\Users\\GUDU\\Desktop\\mypersonaldocs\\facebookkk.xls");
	wb.write(fout);
	}
    }
}
