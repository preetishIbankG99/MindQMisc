package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyTextInBold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:\\Users\\GUDU\\Desktop\\fontWeight.html");
		
		// Assert tag name of bold text
		String tagName= driver.findElement(By.id("bold1")).getTagName();
		Assert.assertEquals(tagName, "b");
		
		// Assert tag name of bold text
		String tagName1= driver.findElement(By.id("bold2")).getTagName();
		Assert.assertEquals(tagName1, "strong");
		
		// Get value of font-weight and assert if it is bold
		String fontWeight= driver.findElement(By.id("bold3")).getCssValue("font-weight");
		System.out.println(fontWeight);
		Assert.assertTrue(Integer.parseInt(fontWeight)>700);
		
		driver.quit();
		
	}

}
