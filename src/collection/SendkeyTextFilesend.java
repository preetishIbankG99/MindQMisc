package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SendkeyTextFilesend {
	static WebDriver driver;
	
	static String URL = "https://encodable.com/uploaddemo/";
	@Test
	public static void testUpload() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get(URL);
		WebElement element = driver.findElement(By.xpath(".//*[@id='uploadname1']"));
//To input the filename along with path
		element.sendKeys("C:\\Users\\GUDU\\Desktop\\gudu\\subfolder\\New Text Document.txt");
driver.findElement(By.xpath(".//*[@id='newsubdir1']")).sendKeys("gudu");
driver.findElement(By.xpath(".//*[@id='formfield-email_address']")).sendKeys("preetish.bhanja@gmail.com");
driver.findElement(By.xpath(".//*[@id='formfield-first_name']")).sendKeys("preetish");		
// To click on the submit button (Not the browse button)
		
		  driver.findElement(By.xpath(".//*[@id='uploadbutton']")).click();
		
	}
}
