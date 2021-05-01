package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleSorting {
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	driver.get("https://jqueryui.com/sortable/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement sort1=driver.findElement(By.xpath(".//*[@id='sortable']/li[1]"));
	Thread.sleep(4000);
	WebElement sort2=driver.findElement(By.xpath(".//*[@id='sortable']/li[2]"));
	act.clickAndHold(sort1).moveToElement(sort2).release(sort1).build().perform();
	Thread.sleep(3000);
}}
