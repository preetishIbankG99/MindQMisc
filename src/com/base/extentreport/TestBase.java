package com.base.extentreport;

import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver;
@BeforeMethod
public void createDriver(){
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	}

@AfterMethod
public void closeBrowser(){
driver.close();
}
@AfterSuite()
public void generatereportinexcel() throws Exception{
	Xl.generateReport("H:\\photonwp\\MindQ\\test-outputs\\Report_Excel.xlsx");
}
}
