package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WithoutThrows {
	public static void main(String[] args) {//Even thread.sleep not asking for throws declaration
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://facebook.com");
		
		try {
			Thread.sleep(6000);
		
			driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
		 
		
		try{
			Thread.sleep(6000);
			driver.findElement(By.id("pass")).sendKeys("@@@@@@");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();	
		}
		try{
			Thread.sleep(6000);
			driver.findElement(By.xpath(".//*[@id='u_0_t']")).click();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}
}
