package collection;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ObjectRepository2 {
  static WebDriver driver;
@Test
  public void facebooklogin() throws Exception {
	  
	File frc=new File("./Configuration/objectrepoo.properties");
	FileInputStream fis=new FileInputStream(frc);
	Properties pro=new Properties();
	pro.load(fis);
	
	Logger logger=Logger.getLogger(ObjectRepository2.class);
	PropertyConfigurator.configure("Log4j.properties");
	
	System.out.println("Propertyclass loaded");  
	driver=new FirefoxDriver();
	logger.info("#######Firefox Opened##########");
	driver.manage().window().maximize();
	logger.info("#######Window maximized##########");
	 driver.get(pro.getProperty("Url"));
	 logger.info("#######Url Entered##########");
	 driver.findElement(By.id(pro.getProperty("By.user.id"))).sendKeys("preetishbhanja@gmail.com");
	 logger.info("#######Input username##########");
	  driver.findElement(By.id(pro.getProperty("By.password.id"))).sendKeys("gudu1990@");
	  logger.info("#######input password##########");
	  driver.findElement(By.cssSelector(pro.getProperty("By.login.cssSelector"))).click();
}
@AfterMethod
	public void facebooklogout() throws Exception{
		
		File frc=new File("./Configuration/objectrepooo.properties");
		FileInputStream fis=new FileInputStream(frc);
		Properties pro=new Properties();
		pro.load(fis);
		Logger logger=Logger.getLogger(ObjectRepository2.class);
		PropertyConfigurator.configure("Log4j.properties");
	    driver.findElement(By.xpath(pro.getProperty("By.xpath.click"))).click();
	    logger.info("#######logout button##########");
	    driver.close();
	   
	}
	}


