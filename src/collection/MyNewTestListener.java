package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(collection.TestNGListener.class)
public class MyNewTestListener {
	
  @Test
  public void GoogleTitleVerify() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.co.in");
	  System.out.println(driver.getTitle());
	  driver.close();
  }
@Test
public void TitleMatch(){
	System.out.println("Test2 Dummy");
	//fail your testcase if fails
	Assert.assertTrue(false);
	
	//pass your testcase if true
	//Assert.assertTrue(true);
}


}
