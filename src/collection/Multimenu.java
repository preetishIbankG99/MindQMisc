package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multimenu {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	
driver.get("https://jqueryui.com/menu/");
JavascriptExecutor js = ((JavascriptExecutor) driver);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.switchTo().frame(0);
js.executeScript("window.scrollBy(0,15)");
Thread.sleep(9000);
WebElement menu1=driver.findElement(By.xpath(".//*[@id='ui-id-4']"));
menu1.click();
Thread.sleep(9000);
WebElement submenu=driver.findElement(By.xpath(".//*[@id='ui-id-6']"));
submenu.click();

}
}
