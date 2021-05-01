package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class BYALL {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
//driver.findElement(new ByAll(By.id("u_0_p"),By.name("firstname"),
		//By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"))).sendKeys("preetish");
	driver.findElement(new ByIdOrName("firstname")).sendKeys("preet");
	}

}
