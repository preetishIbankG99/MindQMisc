package extentreport;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
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
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport3 {
ExtentHtmlReporter htmlreporter;
ExtentReports extent;
ExtentTest test;
@BeforeTest
	public void startReport() {
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-outputs/myextentrepot.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("OS", "Windows7");
		extent.setSystemInfo("Host Name", "Preetish");	
		extent.setSystemInfo("Environment", "QATesting");
		extent.setSystemInfo("UserName", "Preetish Kumar");
		htmlreporter.config().setDocumentTitle("AutomationTesting.in Demo report");
		htmlreporter.config().setDocumentTitle("My Own Report");
		htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlreporter.config().setTheme(Theme.DARK);
		}
@Test
public void demoTestPass() {
	test=extent.createTest("demoTestPass","This Test will demonstartes the pass test case");
Assert.assertTrue(true);
}
@Test
public void demoTestFail() {
	test=extent.createTest("demoTestFail","This Test will demonstartes the fail test case");
Assert.assertTrue(false);
}
@Test
public void demoTestSkip() {
	test=extent.createTest("demoTestSkip","This Test will demonstartes the skip test case");
throw new SkipException("This Test case not ready for exceution");
}
@AfterMethod
public void getResult(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Testcase Fails due to below issue", ExtentColor.RED));
		test.fail(result.getThrowable());
		
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Testcase Passed", ExtentColor.GREEN));
		
		
	}
	else if(result.getStatus()==ITestResult.SKIP) {
		test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"Testcase Skips due to below issue", ExtentColor.YELLOW));
		test.skip(result.getThrowable());
		
	}

}

@AfterTest
public void tearDown(){
	extent.flush();
}
}