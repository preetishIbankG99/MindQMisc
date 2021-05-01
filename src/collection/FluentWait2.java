package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait2 {

	
	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://google.com");
FluentWait f=new FluentWait(driver);
f.withTimeout(15,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
f.until(ExpectedConditions.visibilityOfElementLocated(By.name("gjgjg")));
	}

}
