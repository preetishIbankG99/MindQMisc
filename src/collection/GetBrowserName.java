package collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetBrowserName {
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(js.executeScript("return navigator.appCodeName"));
	}
}
