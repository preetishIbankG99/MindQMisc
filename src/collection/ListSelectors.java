package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListSelectors {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.in");
	List<WebElement> links=driver.findElements(By.xpath("//*[@id]"));
		for(WebElement ele:links){
			System.out.println(ele.getAttribute("id"));
		}
		
		
		}
}
