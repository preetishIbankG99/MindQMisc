package datadrivenexcelstatuswithcolor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoaut {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
//		WebDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
//		WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("vijay78");
	driver.findElement(By.name("password")).sendKeys("vijay78");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	FileInputStream fis=new FileInputStream("H:\\testing tools videos\\Mukesh selenium\\vijaySir_scripts\\TestCase1.xls");
	HSSFWorkbook wb=new HSSFWorkbook(fis);
    HSSFSheet sh=wb.getSheet("Sheet4");
    int rc=sh.getPhysicalNumberOfRows();
	for(int i=1;i<=2;i++){
		HSSFRow rw=sh.getRow(i);
		String from=rw.getCell(1).toString();
		String to=rw.getCell(2).toString();
		String tpe=rw.getCell(3).toString();
		String s_class=rw.getCell(4).toString();
		String a_lines=rw.getCell(5).toString();
		String e_price=rw.getCell(6).toString();
		driver.findElement(By.cssSelector("input[value='"+tpe+"']")).click();
//departure
		WebElement depfrm=driver.findElement(By.name("fromPort"));
		Select df=new Select(depfrm);
		df.selectByVisibleText(from);
//Arrival
		WebElement arrin=driver.findElement(By.name("toPort"));
		Select ai=new Select(arrin);
		ai.selectByVisibleText(to);

		driver.findElement(By.cssSelector("input[value='"+s_class+"']")).click();
//		WebElement alns=driver.findElement(By.name("airline"));
		Select al=new Select(driver.findElement(By.name("airline")));
		al.selectByVisibleText(a_lines);
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("passFirst0")).sendKeys("Senthil");
		driver.findElement(By.name("passLast0")).sendKeys("Kumar");
		driver.findElement(By.name("creditnumber")).sendKeys("123456789");
		WebElement same_as_billing=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
				+ "/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
		same_as_billing.click();
	Select country=new Select(driver.findElement(By.name("delCountry")));
	country.selectByVisibleText("TOGO");
	Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.findElement(By.name("buyFlights")).click();
	Thread.sleep(3000);
	String a_price=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody"
			+ "/tr[5]/td/table/tbody/tr[12]/td/table/tbody/tr[2]/td[2]/font/b/font/font/b/font")).getText();
	HSSFCell cl=rw.createCell(7);
	cl.setCellValue(a_price);
	if(e_price.contentEquals(a_price)){
		 cl = rw.createCell((short) 8);
			cl.setCellValue("pass");

			CellStyle style = wb.createCellStyle();
			style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		    cl.setCellStyle(style);
		
		}
		
		else {
		
			 cl = rw.createCell((short) 8);
				cl.setCellValue("fail");

				CellStyle style = wb.createCellStyle();
				style.setFillForegroundColor(IndexedColors.DARK_RED.getIndex());
			    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			    cl.setCellStyle(style);
		}
		WebElement back_to_flight=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[1]/a/img"));
		back_to_flight.click();
		
		FileOutputStream fout=new FileOutputStream("H:\\testing tools videos\\Mukesh selenium\\vijaySir_scripts\\TestCase3.xls");
		wb.write(fout);
		//driver.close();
		}
	    }
	
	}
	


	
