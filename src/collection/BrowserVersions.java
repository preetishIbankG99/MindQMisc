package collection;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
//u can change it to chrome import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserVersions {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		Capabilities caps=((RemoteWebDriver)driver).getCapabilities();
		String browserName=caps.getBrowserName();
		String browserVersion=caps.getVersion();
		
		System.out.println(browserName +""+ browserVersion);
		
		}  	 
}
