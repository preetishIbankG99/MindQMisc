package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebOOkChatBoxAutomation {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("preetishbhanja@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ruyruy");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

    
	driver.findElement(By.xpath(".//*[@id='js_1ob']/a/div/div[3]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='js_1zk']/div[6]/div/div")).sendKeys("Hiii Dost");
	
	}
}