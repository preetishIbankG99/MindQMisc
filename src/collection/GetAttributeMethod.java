package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("")).sendKeys("abcd");
		List<WebElement>elements=driver.findElements(By.tagName("a"));
		for (WebElement ele : elements) {
		String hrefValue=ele.getAttribute("href");
		System.out.println(hrefValue );
		}
		}

	}


