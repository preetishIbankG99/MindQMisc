package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmExample {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.className("_3ac-")).click();
	//driver.switchTo().frame(0);
	WebElement frm=driver.findElement(By.tagName("iframe"));//selecting <iframe> tag from html
	
	driver.switchTo().frame(frm);
	driver.findElement(By.id("input_0")).sendKeys("paytm");
	
	
	
	}
}
