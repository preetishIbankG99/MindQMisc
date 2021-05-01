package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.in/");
	    List<WebElement>ele=driver.findElements(By.xpath("//a[@class='rt']"));
	    System.out.println(ele.size());
	    ele.get(3).click();
	/*	driver.get("https://www.ebay.in/");
		WebElement locator1=driver.findElement(By.xpath("(//a[@class='rt'])[2]"));
		WebElement locator2=driver.findElement(By.xpath("(//a[@class='rt'])[3]"));
	    WebElement locator3=driver.findElement(By.xpath("(//a[@class='rt'])[4]"));
	   driver.findElement(By.xpath(locator1|locator2|locator3)).click();*/
	    
	    
	}

}
