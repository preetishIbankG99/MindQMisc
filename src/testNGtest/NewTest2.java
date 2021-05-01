package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(dataProvider="testdata")
  public void gamillogin(String username,String password){
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://gmail.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("Email")).sendKeys(username);
	  driver.findElement(By.id("next")).click();
	  driver.findElement(By.id("Passwd")).sendKeys(password);
  }
  
@DataProvider(name="testdata")
public Object[][]data(){
	Object[][] obj=new Object[3][2];
	obj[0][0]="preetish.bhanja@gmail.com";
	obj[0][1]="ABCD";
	
	obj[1][0]="sarojspeaks726@gmail.com";
	obj[1][1]="EFGH";
	
	obj[2][0]="shibashakti.@gmail.com";
	obj[2][1]="STUV";
	return obj;
	
}
}
