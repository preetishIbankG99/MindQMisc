package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiPleBrowserTest {
	public static WebDriver driver;
@Test
@Parameters("browser")

	public void facebooklogin(String browser){
if(browser.equalsIgnoreCase("firefox")){
	driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
}
else if(browser.equalsIgnoreCase("internetexplorer")){
	System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
	driver=new InternetExplorerDriver();
    driver.get("http://www.flipkart.com");
    driver.manage().window().maximize();
    System.out.println(driver.getCurrentUrl());
    
}
else if(browser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	
}
}

}
