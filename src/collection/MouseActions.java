package collection;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com");
    driver.manage().window().maximize();
		Thread.sleep(5000);

		Actions act = new Actions(driver);

		act
		.keyDown(Keys.CONTROL)
		.sendKeys(Keys.F5)
		.keyUp(Keys.CONTROL)
		.build()
		.perform();

	}

}
