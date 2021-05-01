package collection;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class GmailFluentWait {
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
	FluentWait fwait=new FluentWait(driver);
	fwait.withTimeout(15, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordcbcdgh")));
	//fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	WebElement password=driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
	password.sendKeys("XXXXX");
	}
}
