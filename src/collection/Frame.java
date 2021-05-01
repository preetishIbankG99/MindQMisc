package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/animate/");
		WebElement frame1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		WebElement dimension=driver.findElement(By.xpath(".//*[@id='effect']"));
		System.out.println(dimension.getSize());
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='button']")).click();
		Thread.sleep(8000);
		WebElement dimension2=driver.findElement(By.xpath(".//*[@id='effect']"));
		System.out.println(dimension2.getSize());



		}
}
