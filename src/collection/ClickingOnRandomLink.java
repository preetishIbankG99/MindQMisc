package collection;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickingOnRandomLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/dialog/#modal-message");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int Count=0;
		for(WebElement ele:links){
			if(!ele.getText().equals("")){
				System.out.println(ele.getAttribute("href"));
			Count=Count+1;
			}
		System.out.println(ele.getText());
		System.out.println("Total No of links:"+Count);
		Thread.sleep(8000);
		Random ran=new Random();
		Thread.sleep(8000);
		links.get(ran.nextInt(6)).click();
		Thread.sleep(8000);
		String Title=driver.getTitle();
		System.out.println(Title);
		}
		}
}
