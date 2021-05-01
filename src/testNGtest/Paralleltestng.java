package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Paralleltestng {
  @Test
  public void firefox() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://facebook.com");
  }
  
  
  
  @Test
  public void chrome() {
	  System.setProperty("webdriver.chrome.driver","H:\\lattttaaast\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	  driver.get("http://facebook.com");
  }
}
