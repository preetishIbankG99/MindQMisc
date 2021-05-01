package collection;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	@Test
	public void testconfig() throws Exception{
	File src=new File("./Configuration/Test1.properties");
	FileInputStream fis=new FileInputStream(src);
	Properties pro=new Properties();
	pro.load(fis);
	System.out.println("Propertyclass loaded");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
    String chromepath=pro.getProperty("ChromeDriver");
	System.out.println("My ChromePath is:"+chromepath);
   driver.get(pro.getProperty("Url")); 
   driver.findElement(By.xpath(pro.getProperty("login.userid.xpath"))).sendKeys("preetish");
   driver.findElement(By.xpath(pro.getProperty("login.password.xpath"))).sendKeys("gudu123");
  
}
}
