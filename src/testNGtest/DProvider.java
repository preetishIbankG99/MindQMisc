package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProvider {
	@Test(dataProvider = "testdata")//dataprovider name is given as testdata
	
	public void gmaillogin(String username, String password) {
			
	WebDriver driver = new FirefoxDriver();
			
	driver.get("http://gmail.com");
			
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	driver.findElement(By.id("Email")).sendKeys(username);
			
	driver.findElement(By.id("next")).click();
			
	driver.findElement(By.id("Passwd")).sendKeys(password);
			
		
	}

	//@Dataprovider annotation is used to provide data	//the return type of Dataprovider is 2D objectArray
	@DataProvider(name = "testdata")
		
	public Object[][] data() {
			
	Object[][] obj = new Object[3][2];//here[3] no of Set/times it will execute//[2]no of parameters here used{username,password}
			
	obj[0][0] = "kalyanseleniumtraining";
			
	obj[0][1] = "abcd";

			
	obj[1][0] = "chandrika.srinu";
			
	obj[1][1] = "xyz";

			
	obj[2][0] = "harinathvarma";
			
	obj[2][1] = "123";

	return obj;
		}
	}

  

