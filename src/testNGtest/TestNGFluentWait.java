package testNGtest;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class TestNGFluentWait {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		Thread.sleep(4000);
		FluentWait fw=new FluentWait(driver);
		fw.withTimeout(30, TimeUnit.SECONDS)
		.pollingEvery(10, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		fw.until(ExpectedConditions.visibilityOfElementLocated(By.id("hhhemail")));
	    driver.findElement(By.id("email")).sendKeys("preetish");
		}}
