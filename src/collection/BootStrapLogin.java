package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapLogin {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signup=driver.findElement(By.xpath(".//*[@id='get_sign_up']"));
	    signup.click();
	//here we will get the frame which we have to switch
	    
	    driver.switchTo().frame("authiframe");
	    WebElement userid=driver.findElement(By.xpath(".//*[@id='authMobile']"));
	    userid.sendKeys("8763541990");
	
	
	}

}
