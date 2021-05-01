package testNGtest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent2 {
ExtentReports report;
ExtentTest logger;
WebDriver driver;
@Test
public void verifyFacebook(){
	report=new ExtentReports("H:\\testing tools videos\\Mukesh selenium\\ADVANCE SELENIUM REPORT\\Reports\\advreport.html");
	logger=report.startTest("TestVerifyAppLaunch");
	driver=new FirefoxDriver();
	logger.log(LogStatus.INFO, "Browser Started");
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	logger.log(LogStatus.INFO, "Application is Up and Running");
	
String Title=driver.getTitle();
Assert.assertTrue(Title.contains("Facebook"));
logger.log(LogStatus.PASS, "TitleVerified");
}



@AfterMethod
	public void tearDown(ITestResult result) throws InterruptedException{
if(ITestResult.FAILURE==result.getStatus()){
	Thread.sleep(5000);
String screenshotpath=Utility.takescreenshot(driver, result.getName());
String image=logger.addScreenCapture(screenshotpath);
logger.log(LogStatus.FAIL, "Title Verification",image);	
}
report.endTest(logger); 
report.flush();
driver.get("H:\\testing tools videos\\Mukesh selenium\\ADVANCE SELENIUM REPORT\\Reports\\advreport.html");
}
}
