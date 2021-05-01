package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATAPRO {
	@Test(dataProvider = "testdata")
	
	public void gmaillogin(String username, String password) throws InterruptedException {
			
WebDriver driver=new FirefoxDriver();
		
	driver.manage().window().maximize();
			
	driver.get("https://www.facebook.com/");
			
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	driver.findElement(By.id("email")).sendKeys(username);
	
	driver.findElement(By.id("pass")).sendKeys(password);
	
		
	}

		
	@DataProvider(name = "testdata")
		
	public Object[][] data() {
			
	Object[][] obj = new Object[3][2];
			
	obj[0][0] = "kalyanseleniumtraining";
			
	obj[0][1] = "abcd";

			
	obj[1][0] = "chandrika.srinu";
			
	obj[1][1] = "xyz";

			
	obj[2][0] = "harinathvarma";
			
	obj[2][1] = "123";

		return obj;
		}
	}


