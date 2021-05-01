package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQaGmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/");
		WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
        username.sendKeys("preetish.bhanja@gmail.com");
		
		WebElement Next=driver.findElement(By.xpath("//span[text()='Next']"));
		Next.click();
        Thread.sleep(4000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("gudub");
	
	    WebElement Next2=driver.findElement(By.xpath("//span[text()='Next']"));	
		Next2.click();
		
		
		Thread.sleep(4000);
		
		List<WebElement> MailList = driver.findElements(By.xpath("//div[@class='T-Jo-auh']"));
		for(int i=0;i<MailList.size();i++){
	System.out.println(MailList.get(i).getText());		
	
				
			}		
		
		
		
		
		
		
		
		
		WebElement logoutimg=driver.findElement(By.xpath("//span[@class='gb_8a gbii']"));
		logoutimg.click();
		Thread.sleep(4000);
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Sign out']"));
	    logout.click();
	}

}
