package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
public class ExtentReport {
	
	ExtentReports extent;
	
	@BeforeTest
    public void startReport(){
        extent = new ExtentReports("H:\\testing tools videos\\Mukesh selenium\\ADVANCE SELENIUM REPORT\\Reports\\Report.html", true);
    }
	@Test
public void verifytitle(){
extent.startTest("WebDriver Started");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
extent.startTest("Driver maximize");
driver.get("http://www.google.co.in");
extent.startTest("Url Fetched");
String title=driver.getTitle();
Assert.assertTrue(title.contains("Googlew"));


}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(7000);
		extent.flush();
		Thread.sleep(7000);
	    extent.close();
	}


}

