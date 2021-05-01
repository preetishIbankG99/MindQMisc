package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleTonSelenium {
private static SingleTonSelenium instance_driver=null;
private WebDriver driver;
private SingleTonSelenium() {
	
}

public WebDriver openBrowser() {
	System.setProperty("webdriver.chrome.driver", "H:\\testing tools videos\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	return driver;
	
}
public static SingleTonSelenium getInstance() {
	if(instance_driver==null) 
		instance_driver=new SingleTonSelenium();
		return instance_driver;
}
}
