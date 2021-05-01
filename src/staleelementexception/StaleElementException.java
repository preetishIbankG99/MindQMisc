package staleelementexception;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementException {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com");
	//give a break point here
	//reload a webpage
	//now id will be changed 
	WebElement usernam=driver.findElement(By.name("username"));
	usernam.sendKeys("gudu90");
	WebElement passwd=driver.findElement(By.name("password"));
	passwd.sendKeys("gudu1990");
	driver.close();

	}

}
