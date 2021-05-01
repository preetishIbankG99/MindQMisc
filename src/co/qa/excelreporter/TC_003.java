package co.qa.excelreporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.extentreport.TestBase;



public class TC_003 extends TestBase {
public static WebDriver driver;

@Test
public void enterCredentials(){
	driver.findElement(By.id("email")).sendKeys("data1");
	driver.findElement(By.id("pass")).sendKeys("data2");
	Assert.assertTrue(true);
	
}
}
