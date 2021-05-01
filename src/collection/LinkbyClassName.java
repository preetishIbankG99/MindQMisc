package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkbyClassName {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.findElement(By.className("gb_P")).click();
	String url=	driver.getCurrentUrl();
	System.out.println(url);
	}
}
