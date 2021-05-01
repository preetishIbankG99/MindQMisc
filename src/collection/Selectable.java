package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selectable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,240)");
	    driver.findElement(By.xpath(".//*[@id='menu-item-142']/a")).click();
		List<WebElement> item1=driver.findElements(By.xpath(".//*[@id='selectable']/li"));
		
		for(WebElement ele:item1){
			Thread.sleep(2000);
			ele.click();
			System.out.println(ele.getText());
		}
		}
}
