package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","H:\\lattttaaast\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		List<WebElement> li=driver.findElements(By.id("male"));
		System.out.println(li.size());
		for(WebElement el:li)
		{
			Integer x=el.getLocation().getX();
			System.out.println("The Location Of x is : -"+x);
			//Integer y=river.findElement(By.id("male")).getLocation().getY();
			if(x==0)
			{
				System.out.println("Element Is Not Visible Or Hidden");
			}
			else
				el.click();
		}
		Thread.sleep(5000);
		driver.close();
 
	}

}
