package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDataPro 
{
	
@Test(dataProvider="testdata")
public void facebooklogin(String username,String password)
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys(username);
driver.findElement(By.id("pass")).sendKeys(password);
driver.quit();
}
@DataProvider(name="testdata")
public Object[][] passData()

{
Object[][]data=new Object[3][2];
data[0][0]="userid1";
data[0][1]="password1";
data[1][0]="userid2";
data[1][1]="password2";
data[2][0]="userid3";
data[2][1]="password3";


return data;
	
	
	
	
	
	
}











}
