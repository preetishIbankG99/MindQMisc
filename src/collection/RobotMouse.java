package collection;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotMouse {
	public static void main(String[] args) throws AWTException {
		
		
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://bput.ac.in/home.html");
Robot robot=new Robot();
//robot.mouseMove(900,780);
driver.findElement(By.linkText("Admission"));
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//robot.delay(1500);
//robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

}
}
