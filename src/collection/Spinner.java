package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Spinner {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	driver.get("https://jqueryui.com/spinner/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	
	WebElement spinner1=driver.findElement(By.xpath("html/body/p[1]/span/a[1]/span[1]"));
for(int i=0;i<4;i++){
	Thread.sleep(4000);
	spinner1.click();
}
	Thread.sleep(4000);
	WebElement spinner2=driver.findElement(By.xpath("html/body/p[1]/span/a[2]/span[1]"));
	for(int i=0;i<4;i++){
		Thread.sleep(4000);
		spinner2.click();
	}
	}
	}
