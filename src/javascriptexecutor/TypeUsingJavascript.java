package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeUsingJavascript {
public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBox= driver.findElement(By.name("q"));
		
		// Down casting driver to JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Setting value for "value" attribute
		js.executeScript("arguments[0].value='selenium'", searchBox);
	}
}
