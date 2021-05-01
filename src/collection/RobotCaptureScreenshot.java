package collection;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class RobotCaptureScreenshot {
public static void main(String[] args) throws InterruptedException, AWTException, Exception {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("*******");
	Thread.sleep(2000);
	WebElement login=driver.findElement(By.cssSelector("input[type='submit']"));
	
	login.click();
	Thread.sleep(2000);
	
	//This code will capture screen shot of current screen
	Robot r=new Robot();
	
	BufferedImage image = new Robot()
			.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit()
			.getScreenSize()));
	ImageIO.write(image, "png", new File("C:\\Users\\GUDU\\Desktop\\gudu\\image.png"));

}
}
