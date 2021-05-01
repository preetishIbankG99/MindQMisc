package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleFIlesUpload {
	@Test
	public void uploaMultipleFiles() throws Throwable
	{
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("file:///C:/Users/GUDU/Desktop/browser.html");
	 
	driver.findElement(By.xpath(".//*[@id='1']")).click();
	 
	Runtime.getRuntime().exec("‪C:\\Users\\GUDU\\Desktop\\fileupload.exe"+" "+"C:\\Users\\GUDU\\Desktop\\switch browsers.txt");
	 
	Thread.sleep(2000);
	 
	driver.findElement(By.xpath(".//*[@id='1']")).click();
	 
	Thread.sleep(2000);
	 
	Runtime.getRuntime().exec("C:\\Users\\GUDU\\Desktop\\fileupload.exe"+" "+"‪C:\\Users\\GUDU\\Desktop\\PathVs Classpat.txt");
	}
}
