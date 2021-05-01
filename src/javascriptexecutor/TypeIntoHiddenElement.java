package javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeIntoHiddenElement {
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C://Users//amodm//Desktop//NewHidden.html");
		
		WebElement searchBox= driver.findElement(By.id("files"));
		
		// Down casting driver to JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Setting value for "style" attribute to make input tag visible
		js.executeScript("arguments[0].style.display='block';", searchBox);
		
		searchBox.sendKeys("C:\\Users\\GUDU\\Desktop\\BhanuProjectScreenshot\\AddDependenciesfor xls excelreaderinpom.png");
	}
}
