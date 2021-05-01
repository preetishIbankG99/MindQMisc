package collection;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4Class {
	static WebDriver driver; 
	public static void main(String[] args) {
	Logger logger=Logger.getLogger("Log4Class");
	PropertyConfigurator.configure("Log4j.properties");
	driver=new FirefoxDriver();
	logger.info("#######Firefox Opened##########");
	driver.manage().window().maximize();
	logger.info("#######Browser Maximized##########");
	driver.get("https://www.facebook.com/");
	logger.info("#######Fetching url##########");
	driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
	logger.info("#######Inserting Valid Userid##########");
	driver.findElement(By.id("pass")).sendKeys("gudubabubjg");
	logger.info("#######Inserting Valid Password##########");
	driver.findElement(By.xpath(".//*[@id='u_0_t658658']")).click();
	logger.info("#######Clicked Button##########");
}
}