package pageobjectmodeledu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestCaseClass {
@Test
public void verifyLogin()throws InterruptedException
{
//	WebDriver driver=new FirefoxDriver();
//	driver.manage().window().maximize();
	
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
//	WebDriver driver=new ChromeDriver();
	
	System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.navigate().to("http://newtours.demoaut.com/");
//	driver.findElement(By.name("userName")).sendKeys("vijay78");
//	driver.findElement(By.name("password")).sendKeys("vijay78");
//	driver.findElement(By.name("login")).click();
	LoginElements login=new LoginElements(driver);
	login.userelement("vijay78");
	login.passwordelement("vijay78");
	login.loginelement();
	
	Thread.sleep(3000);
	driver.close();
}
}