package collection;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robozz {
	public static void main(String[] args) throws InterruptedException, Exception {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/");

		driver.findElement(By.className("fa")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("START NOW")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='uploader_browse']/span[2]")).click();
	StringSelection sel=new StringSelection("C:\\Users\\GUDU\\Desktop\\FileUploadUsingAutoit.java");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
Robot robot=new Robot();
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_CONTROL);

robot.keyPress(KeyEvent.VK_V);

robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

	}
	}

	
	


	
	
	




	



