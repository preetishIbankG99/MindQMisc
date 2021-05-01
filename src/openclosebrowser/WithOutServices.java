package openclosebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WithOutServices {
	ChromeDriverService services;
WebDriver driver;
	
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		driver= new ChromeDriver();
	}
	
	@AfterMethod
	public void killBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void launchGoogle()
	{
		driver.get("http://www.google.com");
	}
	
	@Test
	public void launchFacebook()
	{
		driver.get("http://www.facebook.com");
	}
}
