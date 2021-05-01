package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL)
		.sendKeys(Keys.F5)
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		WebElement link=driver.findElement(By.linkText("Track Order"));
		act.doubleClick(link).build().perform();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.navigate().to("https://ebay.in");
		WebElement fashionlink=driver.findElement(By.linkText("Fashion"));
		act.moveToElement(fashionlink).build().perform();
		WebElement cameralink=driver.findElement(By.linkText("Cameras"));
		act.contextClick(cameralink);
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.id("gh-btn"));

		WebElement destination=driver.findElement(By.id("gf-norton"));

		act.dragAndDrop(source, destination).build().perform();

		}
}
