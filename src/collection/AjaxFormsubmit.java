package collection;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxFormsubmit {
	public static void main(String[] arg) throws InterruptedException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("preetish");

		WebElement comment=driver.findElement(By.xpath(".//*[@id='description']"));
		comment.sendKeys("hii folks");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btn-submit']")).click();
		WebElement message=driver.findElement(By.xpath(".//*[@id='submit-control']"));
		System.out.println(message.getText());
		Thread.sleep(4000);
		System.out.println(message.getText());



		}
}
