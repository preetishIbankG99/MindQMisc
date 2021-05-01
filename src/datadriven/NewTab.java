package datadriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {
	
		 
		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver =  new FirefoxDriver();
			driver.get("http://www.facebook.com/");	
			
	                Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL); 
			r.keyPress(KeyEvent.VK_T); 
			r.keyRelease(KeyEvent.VK_CONTROL); 
			r.keyRelease(KeyEvent.VK_T);
	 
			Set<String> tabs = (Set<String>)driver.getWindowHandles();
	 
			for(String tab : tabs)
			{
				driver.switchTo().window(tab);
				System.out.println(driver.getTitle());
				if(driver.getTitle().contains("New Tab"))
					driver.get("http://www.google.com/");
			}
		}
	}

