package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailureScreen {
  
	static WebDriver driver;
	@Test
  public void facebookscreenshot() throws Exception {
  driver=new FirefoxDriver();
  driver.manage().window().maximize();
  driver.navigate().to("http://facebook.com");
  
  driver.findElement(By.id("email")).sendKeys("preetish123");
  FacebookUtility1.takescreenshot(driver, "type username");
  driver.findElement(By.id("pass")).sendKeys("gudu");
  FacebookUtility1.takescreenshot(driver, "password");
  driver.findElement(By.cssSelector("input[type='submit']")).click();
  Thread.sleep(2000);
  FacebookUtility1.takescreenshot(driver, "click submit");
  }
@AfterMethod
public void teardown(ITestResult result){
	if(ITestResult.FAILURE==result.getStatus()){
		FacebookUtility1.takescreenshot(driver, result.getName());
	}
}






}
