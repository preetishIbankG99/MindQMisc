package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchtoNewtab {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.ebay.in/");
	System.out.println(driver.getTitle());//Google
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	//System.out.println(driver.getTitle());//New Tab
	driver.navigate().to("http://www.facebook.com");
	System.out.println(driver.getTitle());//Facebook - log in or sign up
//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"/t");//to open a new tab
//	System.out.println(driver.getTitle());
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
	System.out.println(driver.getTitle());
}
}
 