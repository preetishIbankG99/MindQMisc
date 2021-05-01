package collection;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeNewtabFocus {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","H:\\lattttaaast\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");


	/*WebElement newtab=driver.findElement(By.cssSelector("body"));
	newtab.sendKeys(Keys.CONTROL +"t");
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1)); //switches to new tab
	driver.get("https://www.flipkart.com");*/
		driver.get("http://yahoo.com");  
	    ((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://google.com");
	 
	//driver.navigate().to("http://www.flipkart.com");
	}
}
