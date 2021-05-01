package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarConceptByNaveen {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://spicejet.com/");
		
		WebElement date=driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_view_date1']"));
		String dateVal="20/05";
		selectDateByJavascriptExecutor(driver,date,dateVal);
		
	}
public static void selectDateByJavascriptExecutor(WebDriver driver,WebElement element,String dateVal) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
}
	
}
