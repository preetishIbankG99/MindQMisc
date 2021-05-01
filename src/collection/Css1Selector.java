package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css1Selector {
	static WebDriver driver=null;
public static void main(String[] args) {
	driver=new FirefoxDriver();
	driver.get("http://redbus.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement ele=driver.findElement(By.cssSelector("[class='db'][type='text'][id='src']"));
	ele.sendKeys("Hyderbad");
	
}
}
