package collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrolPageByPage {
	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
       WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://www.makeseleniumeasy.com/");

		// Down casting driver to JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// It returns height of view part. You can say it as page height. When you click on page down key
		// Page scroll by one page. 
		long pageHeight= (long)js.executeScript("return window.innerHeight");
		System.out.println("Page height: "+pageHeight);
		
		// It is how much you can scroll. It is height if you scroll, you will reach to bottom of page.
		long scrollableHeight= (long)js.executeScript("return document.body.scrollHeight");
		System.out.println("Total scrollable height: "+scrollableHeight);
		
		// Finding number of pages. Adding 1 extra to consider decimal part.
		int numberOfPages=(int) (scrollableHeight/pageHeight)+1;
		
		System.out.println("Total pages: "+numberOfPages);
		

		// Now scrolling page by page
		for(int i=0;i<numberOfPages;i++)
		{
			js.executeScript("window.scrollBy(0,"+pageHeight+")");
			Thread.sleep(2000);
		}

	}
}
