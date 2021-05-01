package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelector {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://redbus.in");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement Destination=driver.findElement(By.cssSelector("[class='db'][type='text'][id='dest']"));
   // Destination.sendKeys("Hyderabad");
driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();

}
}
