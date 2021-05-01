package configurationDemo;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestFacebookChrome {
@Test
public void testChrome() throws Exception{
	
		ConfigReader config=new ConfigReader();
	System.setProperty("webdriver.chrome.driver",config.getChromePath());
	WebDriver driver=new ChromeDriver();
	driver.get(config.getApplicationUrl());
	driver.close();
}
}
