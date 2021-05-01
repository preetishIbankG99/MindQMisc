package collection;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Utils;



public class ScreenshotExample {
	public static void takescreen(WebDriver driver,String filename){
		DateFormat df=new SimpleDateFormat("dd_MMM_YYYY hh_mm_ss");
		Date d=new Date();
		String Time=df.format(d);
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Utils.copyFile(f, new File("C:\\Users\\GUDU\\Desktop\\imp documents\\scrn\\" +filename+Time));	
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		ScreenshotExample.takescreen(driver,"JavaTpoint.png");
	}
	
	//Take screenshot on failure
//	@AfterMethod 
//	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
//		if (testResult.getStatus() == ITestResult.FAILURE) { 
//			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
//					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
//		} 
//	}

}
