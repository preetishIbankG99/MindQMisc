package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeBack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");

		WebElement searchbox=driver.findElement(By.id("masthead-search-term"));
	    searchbox.sendKeys("selenium");

	    WebElement searchbutton=driver.findElement(By.id("search-btn"));
	    searchbutton.click();
	    Thread.sleep(5000);
	   driver.findElement(By.cssSelector("body")).sendKeys(Keys.ALT ,Keys.ARROW_LEFT);
	    
	    }
}
