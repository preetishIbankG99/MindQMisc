package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailImplicit {
	WebDriver driver=null;
	public static void main(String[] args) throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
driver.get("https://accounts.google.com/SignUp?hl=en");
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
WebElement Signin=driver.findElement(By.id("link-signin"));
//WebElement Signin=driver.findElement(By.id("linknbh"));
if(Signin.isDisplayed()){
	Signin.click();
System.out.println("button clicked");
}

else{
	Signin.click();
}
	
WebElement Userid=driver.findElement(By.xpath(".//*[@id='identifierId']"));
	Userid.sendKeys("preetish.bhanja@gmail.com");
	WebElement next=driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span"));
	next.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement password=driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
	password.sendKeys("XXXXX");
	}
}
