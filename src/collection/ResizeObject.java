package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeObject {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	driver.get("https://jqueryui.com/resizable/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	act.clickAndHold(resize).moveByOffset(400, 40).release(resize).build().perform();
	Thread.sleep(3000);
	driver.quit();
	}
}
