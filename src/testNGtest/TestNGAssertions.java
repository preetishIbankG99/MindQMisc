package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestNGAssertions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("(//span[@class='RveJvd snByac'])[3]")).click();
		Thread.sleep(3000);
		/*//Assertion Type1 with getText()
		String actual_error=driver.findElement(By.xpath(".//*[@id='view_container']/div/div[2]/div/form/div[1]/div/div[2]/div[2]")).getText();
		
		String expected_error="Enter an email or phone number";
		
		Assert.assertEquals(actual_error, expected_error);
		Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
        System.out.println("Test Type1 Passed");*/
        
      //Assertion Type2 with getAttribute()
         String actual_error1=driver.findElement(By.xpath(".//*[@id='view_container']/div/div[2]/div/form/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");
		
		String expected_error1="Enter an email or phone number";
        
		Assert.assertEquals(actual_error1, expected_error1);
		Assert.assertTrue(actual_error1.contains("Enter an email or phone number  "));
        System.out.println("Test Type2 Failed");
        
	}

}
