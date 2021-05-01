package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement googleSearchBtn = driver.findElement(By.name("btnK"));
		
		// this is to get the colour of an element
		System.out.println("Colour of a button before mouse hover: "
				+ googleSearchBtn.getCssValue("colour"));
				Actions action = new Actions(driver);
				action.moveToElement(googleSearchBtn).perform();
				System.out.println("Color of a button after mouse hover : "
				+ googleSearchBtn.getCssValue("color"));
	
	
}

}
