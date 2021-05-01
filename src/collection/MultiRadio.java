package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiRadio {

public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.in/2016/");
	List<WebElement>radio=driver.findElements(By.cssSelector("input[type='radio']"));
	for(int i=0;i<radio.size();i++){
		WebElement local_radio=radio.get(i);
		String value=local_radio.getAttribute("value");
		System.out.println("Values from Radio buttons are: "+value);
		
	}
	
}
}
