package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpDown {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
 driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://ebay.in");
WebElement ele=driver.findElement(By.cssSelector("body"));
	ele.sendKeys(Keys.END);
	Thread.sleep(3000);
	ele.sendKeys(Keys.HOME);
	}

}
