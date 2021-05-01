package collection;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotMouseWheel {
	 public static void main(String[] args) throws Exception {
		 WebDriver driver=new FirefoxDriver(); 
		 driver.manage().window().maximize();
		 driver.get("http://www.facebook.com");
		 Robot robot = new Robot();

		    robot.mouseMove(1500,900);
		    
		    driver.findElement(By.cssSelector("input[type='submit']"));
		    robot.mousePress(InputEvent.BUTTON1_MASK);
		    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		   
		  
		    robot.mousePress(InputEvent.BUTTON3_MASK);
		     robot.mouseRelease(InputEvent.BUTTON3_MASK);
		     robot.mouseWheel(-100);
		  }
}
