package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		obj.switchTo().activeElement().sendKeys("softwaretestingblog");
		obj.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		obj.close();
		

	}

}
