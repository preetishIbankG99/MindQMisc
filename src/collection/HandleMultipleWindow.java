package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindow {
	@Test
	public void uploaMultipleFiles() throws Throwable
	{
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("https://html.com/input-type-file/");
	 
	driver.findElement(By.xpath(".//*[@id='fileupload']")).click();
	 
	 Runtime.getRuntime().exec("‪C:\\Users\\GUDU\\Desktop\\srupa.exe"+" "+"C:\\Users\\GUDU\\Desktop\\untitle.txt");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='post-206']/div/div[3]/form/input[2]")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath(".//*[@id='fileupload']")).click();
	 Thread.sleep(2000);
	 Runtime.getRuntime().exec("‪C:\\Users\\GUDU\\Desktop\\srupa.exe"+" "+"‪C:\\Users\\GUDU\\Desktop\\Qspider.txt");
	 driver.findElement(By.xpath(".//*[@id='post-206']/div/div[3]/form/input[2]")).click();
	
}
} 
