package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://ebay.in");
Actions act=new Actions(driver);
WebElement obj1=driver.findElement(By.id("gh-btn"));
WebElement obj2=driver.findElement(By.id("gf-fbtn"));
act.dragAndDrop(obj1, obj2).build().perform();
	}

}
