package singleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.itextpdf.text.log.SysoCounter;

public class PageTest {
public static WebDriver driver=null;


public static void initialize() {
	if(driver==null) {
		if(Constant.browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "H:\\testing tools videos\\chromedriver_win32\\chromedriver.exe");
		try {
			ChromeOptions options = new ChromeOptions();
             options.addArguments("--disable-notifications");
           driver = new ChromeDriver(options);
		}
		catch(Exception e) {
			
		}
		
		}
		else if(Constant.browserName.equalsIgnoreCase("ff")) {

			 driver=new FirefoxDriver();
			
		}
	
		else if(Constant.browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
			WebDriver driver=new InternetExplorerDriver();
		}
	
	}

driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get(Constant.url);

}
public static void close() {
	System.out.println("Closing browser");
	driver.close();
	driver=null;
}


}
