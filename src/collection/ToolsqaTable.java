package collection;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsqaTable {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
        JavascriptExecutor js=((JavascriptExecutor)driver); 
        js.executeScript("window.scrollBy(0,380)");
        Thread.sleep(8000);
WebElement link=driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[8]/a"));
	link.click();
	Thread.sleep(4000);
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
