package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartScrollElement {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
//		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("(//input[@type='text' ])[2]"));
		username.sendKeys("preetish.bhanja@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password' ]"));
		
		password.sendKeys("gudubhanja");
        
		  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		  
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
		    js.executeScript("window.scrollBy(0, 500)");
		    
		    Thread.sleep(6000);
	        js.executeScript("window.scrollBy(500, 3600)");
	        
	}

}
