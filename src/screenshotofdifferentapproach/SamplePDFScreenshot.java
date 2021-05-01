//package screenshotofdifferentapproach;
//
//import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class SamplePDFScreenshot {
//	
//public static 	ArrayList screenshots;
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Before Method++++++++++++++++++");
//	}
//
//	@Test
//	public void OpenGoogleCherchertech() {
//		screenshots = new ArrayList();
//		System.setProperty("webdriver.chrome.driver", "D:\\PATH\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("https://google.com");
//
//		// take the screenshot 1 and store it
//		screenshots.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
//
//		driver.get("https://chercher.tech/java/index-selenium-webdriver");
//		// take the screenshot 2 and store it
//		screenshots.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
//	}
//
//	@org.testng.annotations.AfterClass
//	public void AfterClass() throws Exception {
//		System.out.println("AfterClass^^^^^^^^^^^^^^^^^^");
//		ScreenshotPDF.writeScreenShotToDocument(screenshots);
//	}
//
//	@org.testng.annotations.AfterSuite
//	public void AfterSuite() throws Exception {
//		System.out.println("AfterSuite************************");
//		ScreenshotPDF.writeScreenShotDocumentToPDF();
//	}
//	
//	
//	
//}
