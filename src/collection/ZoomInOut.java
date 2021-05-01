package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomInOut {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();


		driver.get("http://en.wikipedia.org");
		try{
			
		for(int i=0;i<5;i++){
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.ADD);	
		}
		Thread.sleep(2000);
		for(int i=0;i<5;i++){
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);	
		}

		}
		catch(Exception e){
			System.out.println(e);
		}
		}	
}
