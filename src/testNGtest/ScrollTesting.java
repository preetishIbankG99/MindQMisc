package testNGtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ScrollTesting {

	public static void main(String[] args) {
		ProfilesIni ini=new ProfilesIni();
		FirefoxProfile fp=ini.getProfile("preetish");
		fp.setPreference("browser.startup.homepage", "http://facebook.com");
		WebDriver driver=new FirefoxDriver(fp);
		
		Point point=new Point(100,100);
		
		driver.manage().window().setPosition(point);
		
			
		Point p=driver.findElement(By.id("email")).getLocation();
		int X=p.getX();
		int Y=p.getY();
		System.out.println("X:"+X);
		System.out.println("Y:"+Y);
	
		WebElement pass=driver.findElement(By.id("pass"));
	System.out.println("Size of my password box"+pass.getSize());
	System.out.println("my password box element location "+pass.getLocation());
	pass.sendKeys("gudu");
   WebElement login= driver.findElement(By.cssSelector("input[type='submit']"));
   System.out.println("size of login button"+login.getSize());
   System.out.println("my loginbutton box element location "+login.getLocation());
   login.click();
 
    
	}}
