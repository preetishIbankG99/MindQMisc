package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	driver.get("https://jqueryui.com/slider/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
	act.clickAndHold(slider).moveByOffset(30, 0).release(slider).build().perform();
	Thread.sleep(3000);
	act.clickAndHold(slider).moveByOffset(-40, 0).release(slider).build().perform();
	driver.quit();
	}
}
