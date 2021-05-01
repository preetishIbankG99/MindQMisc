package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentFrame {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "C:/Users/user/Pictures/geckodriver.exe");
		// open firefox
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open webpage
		driver.get("file:///C:/Users/user/Music/Site/java/frames-example-selenium-webdriver.php");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if check box is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		// navigate to parent frame, which is frame 1
		driver.switchTo().parentFrame();
		// set the value of the textbar to the value stored
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		// navigate to parent, which is page
		driver.switchTo().parentFrame();
		// store the text value
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		//verify the value matches or not
		if(textValue.equals("selenium webdriver")){
			System.out.println("Topic value is equal to 'selenium webdriver'");
		}
	}
}
