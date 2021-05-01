package collection;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitGmailConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/");
	WebElement userid=driver.findElement(By.xpath("//input[@name='identifier']"));
	userid.sendKeys("preetish.bhanja@gmail.com");
	
	WebElement next=driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[3]"));
	next.click();
	//Thread.sleep(4000);
	
	 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(40, TimeUnit.SECONDS)
		        .pollingEvery(10, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
		        
		        WebElement password = wait.until(new Function<WebDriver, WebElement>()
		        		{
		        	public WebElement apply(WebDriver driver) {
		        		return driver.findElement(By.xpath("//input[@name='password']"));
		        		
		        	}
		        		});
		       
		        
		        password.sendKeys("1234");
	}

}
