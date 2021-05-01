package modularDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Log_inpage {
	public static WebElement element=null;
	@Test(priority=2)
	public static WebElement logusername(WebDriver driver){
		return element=driver.findElement(By.className("_2zrpKA"));
		
	}
	
	@Test(priority=3)	
		public static WebElement loguserpassword(WebDriver driver){
		return element=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	}
	
	@Test(priority=4)
	public static WebElement submitbutton(WebDriver driver){
	return element=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
	}
@Test(priority=5)
public static WebElement logoutlink(WebDriver driver){
		 return element=driver.findElement(By.linkText("Hi preetish kumar!"));
}			 
@Test(priority=6)
public static WebElement logout(WebDriver driver){
	return element=driver.findElement(By.linkText("Log Out"));
}
}