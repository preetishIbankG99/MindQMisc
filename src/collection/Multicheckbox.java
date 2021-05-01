package collection;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multicheckbox {
	public static void main(String[] arg) throws InterruptedException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='isAgeSelected']")).click();
		List<WebElement>checkbox=driver.findElements(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div"));
		System.out.println(checkbox.size());
		for(int i=0;i<checkbox.size();i++){
			System.out.println(checkbox.get(i).getText());
		}
		}
}
