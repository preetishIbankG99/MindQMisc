package json;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
  @Test(retryAnalyzer=Retry.class)
  public void verifySelenium() {
  WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
  driver.get("http://www.facebook.com");
 Assert.assertTrue(driver.getTitle().contains("QTR")); 
  }
	
	



}
