package collection;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollIntoView {
	public static void main(String[] arg) throws InterruptedException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span/span[2]/b")).click();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='select2-country-results']/li[11]"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		System.out.println(element.getText());
		}
}
