package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TakeSceen {
	static WebDriver driver;
	
@Test
public static void takescreen() throws Exception{
	driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
ScreenshotCapture.takescreen(driver, "type username");
driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys("gudupreetish");
ScreenshotCapture.takescreen(driver, "type password");
driver.findElement(By.linkText("Log In")).click();
ScreenshotCapture.takescreen(driver, "click login");
}
@AfterMethod
public void teardown(ITestResult result){
	if(ITestResult.FAILURE==result.getStatus())
	{
		ScreenshotCapture.takescreen(driver, result.getName());
	}
}

		
	}


