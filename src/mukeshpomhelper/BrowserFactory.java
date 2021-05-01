package mukeshpomhelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
public static WebDriver driver;
public static WebDriver startBrowser(String browser,String url) throws InterruptedException{
	if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("internetexplorer")){
		System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")){
		 driver=new FirefoxDriver();
	}
	

driver.manage().window().maximize();
driver.get(url);
Thread.sleep(4000);
return driver;

}

}
