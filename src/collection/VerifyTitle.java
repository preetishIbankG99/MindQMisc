package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	 // Here we have to specify the class � In our case class name is Retry
	 
    @Test(retryAnalyzer=Retry.class)

    public void verifySeleniumTitle()

    {  
    	WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("http://www.facebook.com");
    // Here we are verifying that title contains QTP or not. This test will fail because title does not contain QTP
    Assert.assertTrue(driver.getTitle().contains("QTP"));

    }
    }

                    



                 

