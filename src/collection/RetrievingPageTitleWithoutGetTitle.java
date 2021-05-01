package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingPageTitleWithoutGetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// Using getTitle() method
		System.out.println("Title of webpage by getTitle() method: "+driver.getTitle());
		
		// Using getAtttribute() method at title web element
		WebElement titleEle= driver.findElement(By.tagName("title"));
		System.out.println("Title of webpage by webelement title :"+titleEle.getAttribute("textContent"));
		
		// Using Javascript
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String titlebyJavascript= (String) jse.executeScript("return document.title");
		System.out.println("Title of webpage by Javascript :"+titlebyJavascript);
		
		
		// to close all window opened by driver
		driver.quit();
	

	}

}
