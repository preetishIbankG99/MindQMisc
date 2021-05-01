package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PractiseTestNG {
/*@Test(priority=2)
public void setUp(){
System.out.println("Browser SetUp is Ready");
}

@Test(priority=1)
public void initialization(){
	System.out.println("Add All Dependencies Files");
	
}

@Test(priority=3)
public void utility(){
	//TO Skip A Exception We Can use throw new SkipException
	//We Can Use enabled=false
	System.out.println("Take screen Shot if its Fails");
throw new SkipException("I Will Skip This Exception");
}
@Test(priority=4)
public void startApp(){
	System.out.println("Itialization of applications");
	Assert.assertEquals("Gudu1", "Gudu");
	}
@Test(dependsOnMethods={"startApp"})
public void closeApp(){
	System.out.println("Application Closed");
}*/
public static WebDriver driver;	
@Test()
@Parameters({"username","password"})
	
public void FacebookCredentials(String username,String password) throws InterruptedException{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
    
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
	
	
	
}
	
}


