package collection;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridSetup {
	public static WebDriver driver;
	String b_url;
	URL url;
	@BeforeTest
	public  void setUp() throws MalformedURLException {
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		
		cap.setPlatform(Platform.WINDOWS);
		url=new URL("http://192.168.2.24:4444/wd/hub");
		driver=new RemoteWebDriver(url,cap);
		 b_url="http://newtours.demoaut.com/";
}
	@Test
public void login(){
	driver.get(b_url);
driver.findElement(By.name("userName")).sendKeys("vijay78");
driver.findElement(By.name("password")).sendKeys("vijay78");
driver.findElement(By.name("login")).click();
}
@AfterTest
public void close(){
	driver.close();
}






}
