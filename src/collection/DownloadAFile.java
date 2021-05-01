package collection;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadAFile {
	public static void main(String[] args) throws Exception {
		  
		// Create a profile
		FirefoxProfile profile=new FirefoxProfile();
		 
		// Set preferences for file type 
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		  
		// Open browser with profile                   
		WebDriver driver=new FirefoxDriver(profile);
		  
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		// Maximize window
		driver.manage().window().maximize();
		  
		// Open APP to download application
		driver.get("http://www.softpedia.com/");
		  
		driver.findElement(By.id("hps_input")).sendKeys("Adobe");
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.linkText("Adobe Acrobat Pro DC 2015.023.20053 / DC 17.009.20044 Patch")).click();
		driver.findElement(By.xpath(".//*[@id='dlbtn1']/a")).click();
		    driver.findElement(By.xpath(".//*[@id='dllinks']/div[2]/a")).click();
		    
		 }
}
