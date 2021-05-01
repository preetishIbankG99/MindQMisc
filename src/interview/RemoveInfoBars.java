package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveInfoBars {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\PATH\\chromedriver.exe");
		ChromeOptions fo = new ChromeOptions();
		// disable the info bar
		fo.addArguments("--disable-infobars");
		// create object to firefx driver, register options class
		WebDriver driver = new ChromeDriver(fo);
		driver.get("http://bing.com");
	}
}
