package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGtest.TestNGListner.class)
public class MYTESTNGLISTENER {
  @Test
  public void GoogleTitleverify() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.co.in");
	  System.out.println(driver.getTitle());
	  driver.close();
  }
@Test
public void Titlematch(){
	System.out.println("Test2 Dummy");
	Assert.assertTrue(false);
}



}
