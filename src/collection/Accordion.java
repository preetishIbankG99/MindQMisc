package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Accordion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	driver.get("https://jqueryui.com/accordion/");
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.scrollBy(0,10)");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement select3=driver.findElement(By.xpath(".//*[@id='ui-id-5']"));
	select3.click();
	Thread.sleep(4000);
	WebElement select2=driver.findElement(By.xpath(".//*[@id='ui-id-3']"));
	select2.click();
	
	}

}
