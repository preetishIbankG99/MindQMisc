package collection;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicObject {

	public static void main(String[] args) throws Exception  {
		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("selenium training");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'yui_3_18_0_3')]/li[2]")).click();    


	}
}