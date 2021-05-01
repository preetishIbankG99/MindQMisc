package collection;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandles {
	public static void closeWindow(WebDriver driver,String data){
		Set<String>Windows=driver.getWindowHandles();
		for(String str:Windows){
			driver.switchTo().window(str);
			String title=driver.getTitle();
			if(title.equals(data)){
				driver.close();
			}
		}
		}
		public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		WindowHandles.closeWindow(driver, "Amazon");
		WindowHandles.closeWindow(driver, "Reliance Industries Limited");
		WindowHandles.closeWindow(driver,"Synchrony"); 
}
}
