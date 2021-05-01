package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	System.out.println(driver.getCurrentUrl());
String Actualtext=driver.findElement(By.xpath(".//*[@id='content']//div//div//div//div[2]//div[2]")).getText();
System.out.println(Actualtext);

String Expectedtext="It's free and always will be.";
	SoftAssert assertion =new SoftAssert();
	assertion.assertEquals(Actualtext, Expectedtext);
	assertion.assertAll();
	System.out.println("This test got passed");
	
	

	}

}
