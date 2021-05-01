package datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	static WebDriver driver;
	@Test(dataProvider="testdata")
    public void redbusinputdata(String FROM,String TO,String ONWARDDATE,String RETURNDATE) throws InterruptedException{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys(FROM);
	driver.findElement(By.id("dest")).sendKeys(TO);
	driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).sendKeys(ONWARDDATE);
	driver.findElement(By.xpath(".//*[@id='search']/div/div[4]/div/label")).sendKeys(RETURNDATE);
	driver.findElement(By.xpath(".//*[@id='search_btn']")).click();
	Thread.sleep(5000);
	driver.close();
	}
@DataProvider(name="testdata")
public Object[][]passData() throws IOException{
	ExcelDataConfig1 config=new ExcelDataConfig1("C:\\Users\\GUDU\\Desktop\\myinputdata.xlsx");
	int rows=config.getRowCount(0);
	
	Object[][] data=new Object[rows][4];
	
	for(int i=0;i<rows;i++){
	data[i][0]=config.getData(0, i, 0);
	data[i][1]=config.getData(0, i, 1);
	data[1][0]=config.getData(0, 1, 0);
	data[1][1]=config.getData(0, 1, 1);
	data[2][0]=config.getData(0, 2, 0);
	data[2][1]=config.getData(0, 2, 1);
	}
	return data;
	}
	
    }
