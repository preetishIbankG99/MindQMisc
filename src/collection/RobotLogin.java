package collection;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotLogin {
	public static void main(String[] args) throws IOException, Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("gudubabu");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}