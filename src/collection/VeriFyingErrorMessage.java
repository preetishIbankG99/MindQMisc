package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VeriFyingErrorMessage {
	static WebDriver driver;
	@Test
	public void gmailverification() throws InterruptedException{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		
		String actual_Error=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		System.out.println("This is my actual error :"+actual_Error);
		String expected_Error="Enter an email or phone number";
		System.out.println("This is my expected error :"+expected_Error);
		Assert.assertEquals(actual_Error, expected_Error);
	}
}
