package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {
	public static void main(String[] args) {
		
	
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.gmail.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit for each
WebDriverWait wait=new WebDriverWait(driver,20);
driver.findElement(By.id("Email")).sendKeys("preetish.bhanja@gmail.com");
driver.findElement(By.id("next")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
driver.findElement(By.id("Passwd")).sendKeys("abcd");
}
}