package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookJSE {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("babu");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	Thread.sleep(6000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	for(int i=0;i<5;i++){
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,800)");
		
	}
	
	
	}
	
}
