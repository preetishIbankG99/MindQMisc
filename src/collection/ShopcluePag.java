package collection;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopcluePag {
	public static void main(String[] args) throws IOException, InterruptedException { 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		//Click on Electronics
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computers");
        driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		Thread.sleep(4000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		for(int i=0;i<=10;i++){
		js.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(2000);
		}
		
		List pagination=driver.findElements(By.xpath(".//*[@id='pagn']/span/a"));
		int size=pagination.size();
		System.out.println(pagination.size());
		if(size>0){
			System.out.println("Pagination exists");
			//Click on  pages link
			for(int i=4;i>=size;i++){
				 

		driver.findElement(By.xpath(".//*[@id='pagn']/span["+i+"]/a")).click();
					Thread.sleep(5000); 
		System.out.println("page"+i);
		
		
		} 
			Thread.sleep(5000);
		//driver.quit();
} 
		else 
{ 
		System.out.println("pagination not exists"); 
		}}}
