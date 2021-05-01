package disabledjavasciptexecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class GMailFluentWait {
public static WebDriver driver;
public static WebElement passwd1;
	public static void main(String[] args) {
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("preetish.bhanja@gmail.com");
		
		WebElement next=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[3]"));
		next.click();
		
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(70, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		 passwd1 = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("password"));
			}
		});
		passwd1=driver.findElement(By.name("password"));
		passwd1.sendKeys("gudubabu");
		
	}}
