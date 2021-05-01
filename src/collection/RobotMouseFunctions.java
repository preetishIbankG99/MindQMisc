package collection;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotMouseFunctions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GUDU/Desktop/uploader.html"); 
        Point p= driver.findElement(By.name("resumeupload")).getLocation();
        System.out.println("Location :"+p);
		Robot robot = new Robot();	
		robot.mouseMove(8,8); 
        robot.delay(1500);       
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 	
        robot.delay(1500);	
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
	}}