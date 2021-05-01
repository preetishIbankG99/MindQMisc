package javasciptexecutorscrollview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollInToViewExample {
	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://www.makeseleniumeasy.com/");

		// Down casting driver to JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		// This element is down of the web page
//		WebElement wordpresslink= driver.findElement(By.xpath("//a[text()='Proudly powered by WordPress']"));

		// This element is top of the web page
		WebElement wordpresslink=driver.findElement(By.xpath("//a[text()='About']"));
		/*// This command will bring element in to view but will not align with top of browser and further scroll down is not possible.
		js.executeScript("arguments[0].scrollIntoView(true);", wordpresslink);*/
	
		// This command will bring element in to view and will align with bottom of browser which is not possible to do.
				// In this case no scroll will be performed.  
				js.executeScript("arguments[0].scrollIntoView(false);", wordpresslink);
	
	}
}
