package seleniuminterviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingAllLinks {
	public static void main(String[]args){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		List linksWithTag = driver.findElements(By.tagName("a"));
		List linksWithXpath = driver.findElements(By.xpath("//a"));
		List linksWithXpath2 = driver.findElements(By.xpath("//*[@href]"));
		List linksWithCSS = driver.findElements(By.cssSelector("a"));
	
	
	
	}
}
