package extentreport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FreeCrmTestReport {
	public static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeTest
	public void setExtent() {
		// adding parameters
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-outputs/ExtentReports.html", true);
		extent.addSystemInfo("Host Name", "Preetish Pc");
		extent.addSystemInfo("username", "preetish bhanja");
		extent.addSystemInfo("Environment", "QA");

	}

	@AfterTest
	public  void endReport() {
		extent.flush();
		extent.close();
		
	}
	

	public static String getScreenshot(WebDriver driver, String screenshotname) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") +"/FailedTestScreenshots/"+screenshotname+dateName+ ".png";
		File finaldestination = new File(destination);
		FileUtils.copyFile(source, finaldestination);
		return destination;
	}

	@BeforeMethod
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	}

	@Test
	public void freeCrmTitleTest() {
		extentTest = extent.startTest("FreeCrmTest Title");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "#2 Free CRM for Any Business: Online Customer Relationship Software");
	}

	@Test
	public void checkcrmlogo() {
		extentTest = extent.startTest("FreeCrmTest Logo");
		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive123']")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException, InterruptedException {
		if (result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());// add
																						// name
																						// in
																						// extentreport
			extentTest.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());// add
			String screenshotpath = FreeCrmTestReport.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotpath));																				// error
								
	      } else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());

		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test Case PASS is " + result.getName());

		}
		
		extent.endTest(extentTest);// ending test
		
		driver.close();
		}
	
}
