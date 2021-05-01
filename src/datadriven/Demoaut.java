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
import org.openqa.selenium.support.ui.Select;

public class Demoaut {
	
public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get("http://newtours.demoaut.com/");
	    
	    driver.findElement(By.name("userName")).sendKeys("vijay78");
	     driver.findElement(By.name("password")).sendKeys("vijay78");
	     driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
FileInputStream fis=new FileInputStream
("H:\\testing tools videos\\Mukesh selenium\\vijaySir_scripts\\TestCase1.xls");

HSSFWorkbook wb=new HSSFWorkbook(fis);
HSSFSheet sh=wb.getSheet("Sheet4");
int rc=sh.getPhysicalNumberOfRows();//or lastrownum
for(int i=1;i<=2;i++)//i=1 bcoz i am not counting i=0 as it is heading//change to i<=2 otherwise all rows will be executed
{
	HSSFRow rw=sh.getRow(i);
	String from=rw.getCell(1).toString();
	String to=rw.getCell(2).toString();
	String tpe=rw.getCell(3).toString();
	String s_class=rw.getCell(4).toString();
	String a_lines=rw.getCell(5).toString();
	String e_price=rw.getCell(6).toString();
	
driver.findElement(By.cssSelector("input[value='"+tpe+"']")).click();
//departure from
WebElement depfrm=driver.findElement(By.name("fromPort"));
Select df=new Select(depfrm);
df.selectByVisibleText(from);
	
//Arrivalin
WebElement arrin=driver.findElement(By.name("toPort"));
Select ai=new Select(arrin);
ai.selectByVisibleText(to);


driver.findElement(By.cssSelector("input[value='"+s_class+"']")).click();

WebElement alns=driver.findElement(By.name("airline"));
Select al=new Select(alns);
al.selectByVisibleText(a_lines);

driver.findElement(By.name("findFlights")).click();
Thread.sleep(3000);
driver.findElement(By.name("reserveFlights")).click();
Thread.sleep(3000);
driver.findElement(By.name("passFirst0")).sendKeys("senthil");
driver.findElement(By.name("passLast0")).sendKeys("Kumar");
driver.findElement(By.name("creditnumber")).sendKeys("123456789");
 WebElement same_as_billing=driver.findElement(By.xpath
("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
 same_as_billing.click();
 
 Select country=new Select(driver.findElement(By.name("delCountry")));
 country.selectByVisibleText("TOGO");
Thread.sleep(3000);
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
driver.findElement(By.name("buyFlights")).click();
Thread.sleep(3000);
 
 String a_price=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")).getText(); 
HSSFCell cl=rw.createCell(7);
cl.setCellValue(a_price);

if(e_price.contentEquals(a_price)){
	
	HSSFCell status=rw.createCell(8);
	status.setCellValue("pass");
}
else{

	HSSFCell status=rw.createCell(8);
	status.setCellValue("fail");
}
WebElement back_to_flight=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[1]/a/img"));
back_to_flight.click();
Thread.sleep(3000);
}	
FileOutputStream fout=new FileOutputStream("H:\\testing tools videos\\Mukesh selenium\\vijaySir_scripts\\TestCaseres1.xls");
wb.write(fout);
driver.close();
	}

}

