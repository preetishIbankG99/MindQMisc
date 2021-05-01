package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
	driver.navigate().to("http://google.com");
	String Value=driver.findElement(By.id("gb_70")).getAttribute("href");//for getting attribute
	System.out.println(Value);
driver.close();
}
}
