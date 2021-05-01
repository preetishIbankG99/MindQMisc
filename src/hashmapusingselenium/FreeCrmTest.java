package hashmapusingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {
public static WebDriver driver;
public String credentials;
public String credentialsInfo[];	
@BeforeMethod
	public void setUp() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
		
	}
	
 @Test(priority=1)
 public void LoginwithAdminTest() throws InterruptedException {
	 
 //For Admin
	 
	//For admin for Customer change .get("customer")
			credentials=HashMapFreeCrm.getUserLoginInfo().get("admin");
			credentialsInfo=credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
			driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
			
			WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", loginbtn);
            Thread.sleep(4000);
 
          driver.switchTo().frame("mainpanel");
 
       Select select=new Select(driver.findElement(By.name("slctMonth")));
       select.selectByVisibleText(HashMapFreeCrm.monthMap().get(10));
 
 }
	
@Test(priority=2)
 public void LoginwithCustomerTest() {
	 
 //For Customer
	
	 //For admin for Customer change .get("customer")
	        credentials=HashMapFreeCrm.getUserLoginInfo().get("customer");
	        credentialsInfo=credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
			driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
			
			WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", loginbtn);
 
 }
@AfterMethod
public void tearDown() {
	driver.quit();
}
 
 
 
}
