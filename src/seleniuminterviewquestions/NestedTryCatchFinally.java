package seleniuminterviewquestions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedTryCatchFinally {

	public static void main (String[]args){
	try{
		System.out.println("********Outer : try block");
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "C:/Users/user/Pictures/geckodriver.exe");
		// open firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://chercher.tech/java/index-selenium-webdriver");
		try{
			System.out.println("********Inner: try block");
			// no element is present with such id
			driver.findElement(By.id("this-id-isnot-present")).click();
			// sleep method throws InterruptedException exception
		}catch(NoSuchElementException e){
			System.out.println("********Inner :No such Element Exception");
		}finally {
			System.out.println("********Inner: finally block");
		}
	}catch (Exception e) {
		System.out.println("********Outer: Catch block");
	}finally{
		System.out.println("********Outer: finally block");
	}
}
}