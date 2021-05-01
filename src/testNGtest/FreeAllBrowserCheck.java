package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class FreeAllBrowserCheck {
public static WebDriver driver;
	
@Test(invocationCount=10)
@Parameters("browser")
  public void OpenBrowser(String browserName) {
	  if(browserName.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  
	  }
	  else if(browserName.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
	  }
	  
	  else if(browserName.equalsIgnoreCase("internetexplorer")) {
		  System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
	  }
  
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	}
}
