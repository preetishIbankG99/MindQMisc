package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenBoxAutomation {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//driver.findElement(By.id("pass")).sendKeys("saswat");
		js.executeScript("document.getElementById('pass').value='saswat'");
		
		
	
	}

}
