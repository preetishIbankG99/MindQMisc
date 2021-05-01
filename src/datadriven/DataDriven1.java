package datadriven;

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
	public void facebookcredentials(String emailid,String password,String firstname,String surname,String mobilenumber){
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(emailid);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_4")).sendKeys(firstname);
		driver.findElement(By.id("u_0_6")).sendKeys(surname);
		driver.findElement(By.id("u_0_9")).sendKeys(mobilenumber);
	}
@DataProvider(name="testdata")
public Object[][]passData() throws IOException{
	ExcelDataConfig2 config=new ExcelDataConfig2("D:\\workspace\\MindQ\\Excel\\facebbook.xlsx");
	int rows=config.getRowCount(0);
	Object[][] data=new Object[rows][5];
	
	
	for(int i=0;i<rows;i++){
		
//	data[0][0]=config.getData(0, 0, 0);
//	data[0][1]=config.getData(0, 0, 1);
//	data[0][2]=config.getData(0, 0, 2);
//	data[0][3]=config.getData(0, 0, 3);
//	data[0][4]=config.getData(0,0, 4);

	data[1][0]=config.getData(0, 1, 0);
	data[1][1]=config.getData(0, 1, 1);
	data[1][2]=config.getData(0, 1, 2);
	data[1][3]=config.getData(0, 1, 3);
	data[1][4]=config.getData(0, 1, 4);
	
	data[2][0]=config.getData(0, 2, 0);
	data[2][1]=config.getData(0, 2, 1);
	data[2][2]=config.getData(0, 2, 2);
	data[2][3]=config.getData(0, 2, 3);
	data[2][4]=config.getData(0, 2, 4);
	
	data[3][0]=config.getData(0, 3, 0);
	data[3][1]=config.getData(0, 3, 1);
	data[3][2]=config.getData(0, 3, 2);
	data[3][3]=config.getData(0, 3, 3);
	data[3][4]=config.getData(0, 3, 4);
	
	data[4][0]=config.getData(0, 4, 0);
	data[4][1]=config.getData(0, 4, 1);
	data[4][2]=config.getData(0, 4, 2);
	data[4][3]=config.getData(0, 4, 3);
	data[4][4]=config.getData(0, 4, 4);
	}
	return data;
	}
}
