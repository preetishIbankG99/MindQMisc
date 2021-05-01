package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksOperation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.seleniumhq.org/download/");
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links available: "+links.size());
		int count=0;
		for(WebElement ele:links)
		{
		if(!ele.getText().equals("")){
		//it will print null values consisting link also	
		System.out.println(ele.getAttribute("href"));
		count=count+1;

		}
		System.out.println(ele.getText());
		System.out.println("Total no. of links: "+count);
		}
		}
}
