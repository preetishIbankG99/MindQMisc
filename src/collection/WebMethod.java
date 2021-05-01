package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebMethod {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
    String title =driver.getTitle();
	System.out.println(title);
	
//	String pagesource=driver.getPageSource();
//	System.out.println(pagesource);
	
	String Url=driver.getCurrentUrl();
	System.out.println(Url);
	
	boolean a=driver.findElement(By.id("next")).isEnabled();
	System.out.println(a);
	 boolean b=driver.findElement(By.id("next")).isDisplayed();
	 System.out.println(b);
	 String WindowHandle=driver.getWindowHandle();
	 System.out.println(WindowHandle);
	


}
}
