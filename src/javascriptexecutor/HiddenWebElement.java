package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenWebElement {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/hidden.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement button=driver.findElement(By.xpath("//button"));
		String script="arguments[0].click();";
		js.executeScript(script, button);
		System.out.println("Congrats Sucessfull");
		
	}

}
