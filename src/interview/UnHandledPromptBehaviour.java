package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class UnHandledPromptBehaviour {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\PATH\\chromedriver.exe");
		ChromeOptions fo = new ChromeOptions();
		// set the behaviuor of the alert
		//fo.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		// create object to firefox driver, register options class
		WebDriver driver = new ChromeDriver(fo);
		driver.get("http://chercher.tech/java/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.name("alert")).click();
		driver.findElement(By.name("prompt")).click();
	}
}
