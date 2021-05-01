package seleniuminterviewquestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementNotVisibleIssueWait {
	public static void main(String[] args) {
		// set the geckodriver.exe property
		//System.setProperty("webdriver.gecko.driver", "C:/path/geckodriver.exe");
		// open firefox
		WebDriver driver = new FirefoxDriver();
		// set implicit wait to 1 minute
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		// open webpage
		driver.get("https://chercher.tech/java/practice-dropdowns.html");
		// set the webdriver Wait as 60 seconds
		WebDriverWait wait = new WebDriverWait(driver, 60 /*seconds*/);
		String buttonXpath = "//button[@id='abc']";
		// wait for the element to be visible, max wait time is 60 seconds
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(buttonXpath)));
		// clicks the button which has xpath = //button[@id='abc']
		driver.findElement(By.xpath(buttonXpath)).click();
	}
}
