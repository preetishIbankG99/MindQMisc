package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickusingAction {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	WebElement sigin=driver.findElement(By.cssSelector("input[type='submit']"));
		Actions act=new Actions(driver);
		act.doubleClick(sigin).build().perform();
}
}