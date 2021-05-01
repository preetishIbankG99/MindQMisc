package excelib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven1 {
	static WebDriver driver;
@Test(dataProvider="testdata")
public void facebooklogin(String username,String password){
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys(username);
driver.findElement(By.id("pass")).sendKeys(password);
driver.close();
}
@DataProvider(name="testdata")
public Object[][]passData() throws IOException{
	ExcelDataConFig1 config=new ExcelDataConFig1("D:\\workspace\\MindQ\\Excel\\guduexcel.xlsx");
	int row=config.getRowCount(0);
	Object[][]Data=new Object[row][2];
	for(int i=0;i<row;i++){
	    Data[i][0]=config.getData(0, i, 0);
		Data[i][1]=config.getData(0, i, 1);
		Data[1][0]=config.getData(0, 1, 0);
		Data[1][1]=config.getData(0, 1, 1);
		Data[2][0]=config.getData(0, 2, 0);
		Data[2][1]=config.getData(0, 2, 1);
		Data[3][0]=config.getData(0, 3, 0);
    	Data[3][1]=config.getData(0, 3, 1);

	}
	return Data;
	}
}
