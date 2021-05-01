package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeysAlert {
	public static void main(String[] arg) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[3]/div[2]/button")).click();
		driver.switchTo().alert().sendKeys("preetish");
		driver.switchTo().alert().accept();

}}
