package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkNewWindowContextClick {
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		Thread.sleep(5000);
		WebElement link=driver.findElement(By.linkText("24x7 Customer Care"));
		Actions act=new Actions(driver);
		act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		}
}
