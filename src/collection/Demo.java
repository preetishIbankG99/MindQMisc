package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

class Demo{
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");		
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links in flipkart site are:"+links.size());
	int count=0;
	for(WebElement ele:links){
		if(!ele.getText().equals("")){
			count =count+1;
			System.out.println(ele.getText());
		}
	System.out.println("Total numbers of links with textare:"+count);
	}
	}
}
