package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchNewWindow {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"n");
	try{
	Thread.sleep(2000);
	for(String winhandle:driver.getWindowHandles()){
	driver.switchTo().window(winhandle)	;
	driver.get("http://ebay.com");
	}
	}
	catch(Exception e){
		System.out.println(e);
		}}}
