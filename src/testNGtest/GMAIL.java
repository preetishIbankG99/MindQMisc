package testNGtest;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GMAIL {
@Test
public void verifyTitle(){
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.gmail.com");
String pageTitle=driver.getTitle();
Assert.assertEquals(pageTitle, "Gmail");
}
}