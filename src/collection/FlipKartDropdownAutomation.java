package collection;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.Utils;

public class FlipKartDropdownAutomation {
	public static void takescreen(WebDriver driver,String filename){
		DateFormat df=new SimpleDateFormat("dd_MMM_YYYY hh_mm_ss");
		Date d=new Date();
		String Time=df.format(d);
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Utils.copyFile(f, new File("C:\\Users\\GUDU\\Documents\\" +filename+Time));	
	}

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
//		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("(//input[@type='text' ])[2]"));
		username.sendKeys("preetish.bhanja@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password' ]"));
		
		password.sendKeys("gudubhanja");
        
        
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(4000);
        //creating action class to mouse hover on men
		Actions act=new Actions(driver);
		WebElement menlink=driver.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(menlink).build().perform();
		Thread.sleep(2000);
		WebElement topwear=driver.findElement(By.xpath("//span[text()='Top wear']"));
		topwear.click();
		Thread.sleep(4000);
		WebElement ethinicwear=driver.findElement(By.xpath("(//a[@class='_1a8kD8'])[5]"));
	    ethinicwear.click();
	    
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    //js.executeScript("window.scrollBy(0, 500)");
	    WebElement min=driver.findElement(By.xpath("(//select[@class='a_eCSK'])[1]"));
	    WebElement max=driver.findElement(By.xpath("(//select[@class='a_eCSK'])[2]"));
	    
	    Select select =new Select(min);
	    select.selectByValue("1000");
	    
	    Thread.sleep(8000);
	    Select select1=new Select(max);
	    select1.selectByValue("1500");
         Thread.sleep(3000);	
	    js.executeScript("window.scrollBy(0, 500)");
	    
WebElement choosebrand=driver.findElement(By.xpath("(//div[@class='_1GEhLw'])[2]"));
           choosebrand.click();
		
           Thread.sleep(6000);
           js.executeScript("window.scrollBy(0, 500)");
           
           Thread.sleep(5000);
        WebElement size=driver.findElement(By.xpath("(//div[@class='_1GEhLw'])[12]"));
        size.click();
      
        Thread.sleep(6000);
       
        WebElement colorchoose=driver.findElement(By.xpath("//div[text()='Black']"));
        
        js.executeScript("arguments[0].scrollIntoView(true);",colorchoose);
        colorchoose.click();
       
          Thread.sleep(4000);
        
        FlipKartDropdownAutomation.takescreen(driver,"Flipkart.png");
        
       
        
        
        
        
        


		
        
        
	}

}
