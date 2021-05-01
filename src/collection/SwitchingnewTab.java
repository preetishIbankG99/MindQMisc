package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingnewTab {
	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.co.in");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		List<WebElement>ele=driver.findElements(By.tagName("a"));
		System.out.println("total no of links"+ele.size());
		int count=0;
		for(WebElement links:ele){
			if(!links.getText().equals(" ")){
				System.out.println(links.getAttribute("href"));
				count=count+1;
				}
		System.out.println(links.getText());
		System.out.println("Total links are:"+count);
		}
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t" );
		driver.navigate().to("http://facebook.com");
		System.out.println(driver.getTitle());
		}
}
