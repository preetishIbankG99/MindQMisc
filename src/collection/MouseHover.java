package collection;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebay.in");

		WebElement fashionLink = driver.findElement(By.linkText("Fashion"));

		Actions act = new Actions(driver);

		act.moveToElement(fashionLink).build().perform();
	}



	}


