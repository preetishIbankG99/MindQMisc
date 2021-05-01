package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultContent {
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
		// navigate to page level
		driver.switchTo().defaultContent();
		//switch to frame2
		driver.switchTo().frame("frame2");
		//find the dropdown
		WebElement dropdown = driver.findElement(By.tagName("select"));
		//Create object for select class
		Select sel = new Select(dropdown);
		//select the 'avatar' option
		sel.selectByVisibleText("Avatar");
	}
}
