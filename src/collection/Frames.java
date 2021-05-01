package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().defaultContent();
	driver.switchTo().frame("login_page");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("preetish");
	

	}

}
