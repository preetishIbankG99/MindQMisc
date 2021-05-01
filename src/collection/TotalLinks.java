package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLinks {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
	    driver.manage().window().maximize();
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links are:"+links.size());
		int count=0;
	for(WebElement ele:links){
		if(!ele.getText().equals("")){
			count=count+1;
		System.out.println(ele.getText());
}
}
	}
}