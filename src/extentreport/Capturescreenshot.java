package extentreport;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Capturescreenshot {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	public static WebDriver driver;
	@BeforeTest
		public void startReport() {
			htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-outputs/myextentrepot.html");
			extent=new ExtentReports();
			extent.attachReporter(htmlreporter);
}
@Test
public void captureScreenshot() {
test=extent.createTest("captureScreenshot");
driver=new FirefoxDriver();
driver.get("https://www.google.co.in");
String title=driver.getTitle();
Assert.assertEquals(title, "Googgle");
}

@AfterMethod
public void getResult(ITestResult result) throws IOException {
	if(result.getStatus()==ITestResult.FAILURE) {
		String screenshotpath=GetScreenshotExtent.capture(driver, "screenshotName");
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Testcase Failed", ExtentColor.RED));
		test.fail(result.getThrowable());
		test.fail("Snapshot below: "+test.addScreenCaptureFromPath(screenshotpath));
		
	}
}

@AfterTest
public void tearDown(){
	extent.flush();
}

}