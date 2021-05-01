package singleton;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingleTonTest {
WebDriver driver;
@BeforeMethod
public void setUp() {
	SingleTonSelenium instancedriver= SingleTonSelenium.getInstance();
	driver=instancedriver.openBrowser();
	
}

@Test
public void testMethod() {
	driver.get("http://www.facebook.com");
System.out.println(driver.getTitle());

}

@AfterMethod
public void tearDown() {
	driver.close();
}
















}
