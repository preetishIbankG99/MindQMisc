package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsertabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.in");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//opening a new tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.navigate().to("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//to move to parent tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.PAGE_UP);
		//to close a tab
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"w");
		}
}
