package collection;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedScreenshot {
	static WebDriver driver;
@Test
	public static void screenshot() throws Exception{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath(".//[@id='jkjkhjkgkj']")).sendKeys("gudubhanja");
		}

@AfterMethod()
public void teardown(ITestResult result){
	if(ITestResult.FAILURE==result.getStatus()){
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
					File source=ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
					 
					System.out.println("Screenshot taken");
					} 
					catch (Exception e)
					{
					 
					System.out.println("Exception while taking screenshot "+e.getMessage());
					} 
					 
					 
					 
					}
					// close application
					driver.quit();
					}
		
}
