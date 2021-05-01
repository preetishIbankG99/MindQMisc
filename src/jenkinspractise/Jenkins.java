package jenkinspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jenkins {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("data1");
		driver.findElement(By.id("password")).sendKeys("data2");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
