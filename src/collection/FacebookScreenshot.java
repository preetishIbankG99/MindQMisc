package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import string.Utitlity;

public class FacebookScreenshot {
	@Test
	public  void takescreenshot()throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Utility.takescreenshot(driver, "browserstart");
	driver.navigate().to("https://www.facebook.com/");
	Utility.takescreenshot(driver, "type username");
	driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
	Utility.takescreenshot(driver, "type password");
	driver.findElement(By.id("pass")).sendKeys("iyiyhihg");
	Utility.takescreenshot(driver, "click login");
	driver.findElement(By.linkText("Log In")).click();
}
}