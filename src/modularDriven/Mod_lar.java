package modularDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mod_lar {
WebDriver driver=null;	
public static WebElement element=null;
  @Test(priority=1)
  public  void checkingvalidation() throws InterruptedException {
	  driver=new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println("Url Fetched Successfully");
		element=driver.findElement(By.linkText("Log In"));
		element.click();
		System.out.println("Clicked on LoginLink");
	  //Reusing methods only
		Log_inpage.logusername(driver).sendKeys("preetish.bhanja@gmail.com");
		Thread.sleep(2000);
		System.out.println("inserted username");
		Log_inpage.loguserpassword(driver).sendKeys("gudubhanja");
		Thread.sleep(2000);
		System.out.println("inserted password");
		Log_inpage.submitbutton(driver).click();
		Thread.sleep(3000);
		System.out.println("clicked on Submitbutton");
		Log_inpage.logoutlink(driver).click();
		Thread.sleep(3000);
		Log_inpage.logout(driver).click();
        System.out.println("LoggedOut successfully"); 
        
        
  }
}

