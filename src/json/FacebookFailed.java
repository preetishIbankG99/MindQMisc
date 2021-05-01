package json;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import collection.FacebookUtility1;

public class FacebookFailed {
	static WebDriver driver;
  @Test
  public void  takescreenshot() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("http://facebook.com");
	  
	  driver.findElement(By.id("email")).sendKeys("preetish123");
	  Utility.takescreenshot(driver, "type username");
	  driver.findElement(By.id("pass")).sendKeys("gudu");
	  Utility.takescreenshot(driver, "password");
	  driver.findElement(By.cssSelector("input[typeeeee='submit']")).click();
	  Utility.takescreenshot(driver, "clicksubmit");
  }

  @AfterMethod
  public void teardown(ITestResult result){
  	if(ITestResult.FAILURE==result.getStatus()){
  		FacebookUtility1.takescreenshot(driver, result.getName());
  	}
}
}