package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPATHEXPRESSIONS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		//1-customize Xpath(Dynamic xpath with contains)
		WebElement userid=driver.findElement(By.xpath("*//input[contains(@id,'email')]"));
		userid.sendKeys("preetish");
		//2-Customize xpath with strats-with
      WebElement pass=driver.findElement(By.xpath("*//input[starts-with(@id,'pass')]"));
	  pass.sendKeys("preetish");
	  Thread.sleep(3000);
	pass.clear();
	//3-Customize Xpath with ends-with
//	WebElement pass1=driver.findElement(By.xpath("*//input[ends-with(@id,'pass')]"));
//	pass1.sendKeys("gudu");
	}

}
