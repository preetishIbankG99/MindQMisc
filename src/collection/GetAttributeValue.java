package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeValue {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.findElement(By.id("email")).sendKeys("preetish123");
	//This will give the value of my attribute
	String str=driver.findElement(By.id("email")).getAttribute("value");
	//This will give you the name of my attribute
	String str1=driver.findElement(By.id("pass")).getAttribute("name");
	System.out.println("Value of my attribute is::"+str);
    System.out.println("Nalue of my attribute is::"+str1);
	}

}
