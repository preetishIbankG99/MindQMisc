import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverObject {

	public static void main(String[] args) throws InterruptedException {

	

		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
	
       System.out.println("Total no of links on the flipkart site are :"+links.size());
		int count=0;
		
		for(WebElement ele:links)
		{
			if(!ele.getText().equals(""))
			{
				count=count+1;
			System.out.println(ele.getText());
			}
		}
		System.out.println("Total no of links with text are :"+count);	
		

}
}

