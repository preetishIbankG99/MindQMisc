package collection;

import java.security.InvalidParameterException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SwitchingDifferentBrowsers {

	public static WebDriver startDriver(Browsers browserType)
	{
	    switch (browserType)
	    {
	        case FIREFOX:
	        return new FirefoxDriver();
	            
	        case CHROME:
	        	System.setProperty("webdriver.chrome.driver", "H:\\lattttaaast\\chromedriver.exe");
	            
	            return new ChromeDriver();
	        case IE:
	            System.setProperty("webdriver.ie.driver", "H:\\testing tools videos\\IEDriverServer.exe");
	            return new InternetExplorerDriver();
	        
	        default:
	            throw new InvalidParameterException("Unknown browser type");
	    }
	}
	public enum Browsers
	{
	    CHROME, FIREFOX, IE;
	}
	public static void main (String[]args) throws InterruptedException {
	WebDriver driver = startDriver(Browsers.CHROME);
	driver.get("http://www.google.com");
    driver.findElement(By.id("lst-ib")).sendKeys("selenium tutorials");
    }}
