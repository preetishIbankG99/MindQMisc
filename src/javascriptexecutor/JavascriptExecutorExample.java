package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorExample {
	public static void main(String[] args) {
		// set the geckodriver.exe property
		
		// open firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// open webpage
		//driver.get("https://google.com");

		// find the search textbar in JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

//		Object searchTextbar = js.executeScript("return document.getElementById('lst-ib')");
//		// we have to cast the returned object into webelement to access
//		// all the webelement related methods
//		((WebElement) searchTextbar).sendKeys("abc");
//		//js.executeScript("document.getElementsByName('btnI')[0].click()");
//
//		js.executeScript("window.scrollBy(0,300)");
//		
//		// return the state of the page load
//		js.executeScript("return document.readyState");
//		
//		//js.executeScript("document.getElementById('default').scrollIntoView(true)");

		// highlight the search bar on google.
		//js.executeScript("document.getElementById('lst-ib').style.backgroundColor='red'");
	
		// scrolls the page by three page downs
	//	js.executeScript("window.scrollByPages(3)");
		
		//js.executeScript("window.scrollByPages(-5)");
		
		driver.get("https://chercher.tech/java/javascript-executor-selenium-webdriver");

		// get the maximum scroll distance Horizontally
		Object horizontalScrollBar = js.executeScript("return window.scrollMaxX");

		// get the maximum scroll distance Vertically
		Object verticalScrollBar = js.executeScript("return window.scrollMaxY");

		if(! horizontalScrollBar.equals("0")){
			System.out.println("Horizontal Scroll bar is Present");
		}else{
			System.out.println("Horizontal Scroll bar is Not Present");
		}

		if(! verticalScrollBar.equals("0")){
			System.out.println("Vertical Scroll bar is Present");
		}else{
			System.out.println("Vertical Scroll bar is Not Present");
		}
		
	}
}