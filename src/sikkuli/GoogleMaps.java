package sikkuli;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMaps {

	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/maps/@12.9555296,77.7051441,15z");
		// clicks the only marker on the page
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Marathahalli");
		// don't forget to kill the browser or else you'll have neverending chromedriver.exe processes
		driver.findElement(By.xpath("(//button[@class='searchbox-searchbutton'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='section-hero-header-directions-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='directions-travel-mode-icon directions-walk-icon']")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("widget-mylocation")).click();
		//driver.switchTo().alert().accept();
		
		
		
		
	
	}

}
