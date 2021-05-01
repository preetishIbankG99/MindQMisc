package extentreport;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportWithLog {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void startReport() {
		htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-outputs/myextentrepotlog.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		}
	
	@Test
	public void logGeneration() {
		test=extent.createTest("logGeneration");
		test.log(Status.INFO, "CreateTest() will return the extent object");
		test.log(Status.INFO, "I am actual Test case");
		test.log(Status.INFO, "I can write the actual logic test in test case");
		//using labels
		test.info(MarkupHelper.createLabel("********usinglabels*********", ExtentColor.RED));
		test.info(MarkupHelper.createLabel("This is text color1", ExtentColor.BLUE));
		test.info(MarkupHelper.createLabel("This is text color2", ExtentColor.PINK));
		test.info(MarkupHelper.createLabel("This is text color3", ExtentColor.YELLOW));
		test.info(MarkupHelper.createLabel("This is text color4", ExtentColor.INDIGO));
		test.info(MarkupHelper.createLabel("This is text color5", ExtentColor.ORANGE));
		
	
	}
	
	@AfterTest
	public void tearDown(){
		extent.flush();
	}
}
