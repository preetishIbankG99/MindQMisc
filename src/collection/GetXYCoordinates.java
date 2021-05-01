package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.graphbuilder.curve.Point;

public class GetXYCoordinates {
	public static void main (String [] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		Thread.sleep(5000);
		driver.get("http://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement element = driver.findElement(By.linkText("Software Testing Material"));
		org.openqa.selenium.Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		Actions action = new Actions(driver);
                action.moveToElement(element, xcord, ycord).click().build().perform();
}
}