package collection;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import collection.ExcelDataConfig;

public class DataprDataDr {
	@Test(dataProvider="testdata")
	public void facebooklogin(String username,String password)
	{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.close();
	}
	@DataProvider(name="testdata")
	public Object[][] passData() throws IOException

	{
		ExcelDataConfig config=new ExcelDataConfig("D:\\workspace\\MindQ\\testdata\\inputdata.xlsx");
	int rows=config.getRowCount(0);
	
		Object[][]data=new Object[rows][2];
	for(int i=0;i<rows;i++)
	{ 
		data[i][0]=config.getData(0, i, 0);
		data[i][1]=config.getData(0, i, 1);
		data[1][0]=config.getData(0, 1, 0);
		data[1][1]=config.getData(0, i, 1);
		data[2][0]=config.getData(0, 2, 0);
		data[2][1]=config.getData(0, 2, 1);
		data[3][0]=config.getData(0, 3, 0);
		data[3][1]=config.getData(0, 3, 1);
	}

	return data;
		
		
		
		
		
		
	}

}
