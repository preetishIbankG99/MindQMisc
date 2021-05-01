package seleniuminterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class CustomLocators {
public static void main (String[]args){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.findElement(new ByIdOrName("email")).sendKeys("gudu1990");
	driver.findElement(new ByAll(By.className("inputtext"), By.id("pass"))).sendKeys("help");
	driver.findElement(new ByChained(By.id("pass"), By.tagName("input"))).sendKeys("gudubabu");;
}
}
