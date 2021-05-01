package capturescreenshotforfailedtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CaptureScreenshotTest extends MainTest {
@Test
public void captureScreenshot(){
	 driver=new FirefoxDriver();
	driver.get("http://www.automationtesting.in");
	String title=driver.getTitle();
	Assert.assertEquals("1Home-Selenium Webdriver Appium Complete Tutorial", title);
	driver.close();
}
}
