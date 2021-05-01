package collection;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;
public class FluentWaitMukesh {

	public static void main(String[] args) {
	WebDriver	driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
		// Create object of FluentWait class and pass webdriver as input
		 
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(30, TimeUnit.SECONDS)
        .pollingEvery(1, TimeUnit.SECONDS)
        .ignoring(NoSuchElementException.class);
        
        WebElement element = wait.until(new Function<WebDriver, WebElement>()
        		{
public WebElement apply(WebDriver driver)
{
	WebElement ele=driver.findElement(By.xpath("//p[@id='demo']"));
	String value=ele.getAttribute("innerHTML");
//return driver.findElement(By.xpath("//p[text()='WebDriver']"));
if(value.equalsIgnoreCase("WebDriver")) {
	return ele;
	
}
else {
	 System.out.println("Element coming on screen"+value); 
	return null;
	
}

}
	});
       System.out.println("Element is Displayed" +element.isDisplayed()); 
       
System.out.println("Element is::::"+element.getText());
}
	}
