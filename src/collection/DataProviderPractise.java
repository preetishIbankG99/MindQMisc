package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractise {

	@Test(dataProvider="testdata")
	public void testdata(String username,String password) {
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.close();
	}

@DataProvider(name="testdata")
public Object[][] getData(){
	Object [][]data=new Object[3][2];
	data[0][0]="user1";
	data[0][1]="123";
	
	data[1][0]="user2";
	data[1][1]="1234";
	
	data[2][0]="user3";
	data[2][1]="12345";

	return data;
	
}
}
