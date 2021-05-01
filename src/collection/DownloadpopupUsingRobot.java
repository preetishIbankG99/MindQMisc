package collection;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadpopupUsingRobot {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
				//System.setProperty("webdriver.gecko.driver", "C:/~/geckodriver.exe");
				// open firefox
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				// open web page
				driver.get("http://chercher.tech/files/minion.zip");
				Thread.sleep(3000);
				// create object to robot class
				Robot robot = new Robot();
				// press tab first time
				robot.keyPress(KeyEvent.VK_TAB);
				// press tab second time
				robot.keyPress(KeyEvent.VK_TAB);
				// press enter key
				robot.keyPress(KeyEvent.VK_ENTER);
		}
}
