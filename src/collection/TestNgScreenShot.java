package collection;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgScreenShot {
@Test
public void takescreenshot() throws Exception{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(20000);
	UtilityScreenshot.takescreenshot(driver, "startbrowser");
	driver.get("http://facebook.com");
Thread.sleep(20000);
UtilityScreenshot.takescreenshot(driver, "userid");
driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
Thread.sleep(20000);
UtilityScreenshot.takescreenshot(driver, "password");
driver.findElement(By.id("pass")).sendKeys("preetishbhanja");
}
}
