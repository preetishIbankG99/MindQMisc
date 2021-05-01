package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("movies");
		driver.findElement(By.id("_fZl")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
