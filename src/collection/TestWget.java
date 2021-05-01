package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWget {
	public static void main(String[] args) throws InterruptedException, Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GUDU/Desktop/upload.htm");
		WebElement ele=driver.findElement(By.cssSelector("input[type='file']"));
ele.click();
	Runtime.getRuntime().exec("‪‪C:\\Users\\GUDU\\Desktop\\File Upload.exe");
	}
}
