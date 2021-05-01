package collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiScreenShotTestNg {
  @Test
  public void takescreenshot() throws IOException {
  WebDriver driver=new FirefoxDriver();
  driver.manage().window().maximize();
  MultiScreenshot.takescreenshot(driver, "browserstart");
  driver.get("https://facebook.com");
  MultiScreenshot.takescreenshot(driver, "typeusername");
  driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
  MultiScreenshot.takescreenshot(driver, "typepassword");
  driver.findElement(By.id("pass")).sendKeys("gudu12345");
  
  
  
  }
}
