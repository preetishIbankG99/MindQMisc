package collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesFromDropdown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement day=driver.findElement(By.id("day"));
		Select select=new Select(day);
		List<WebElement>list=select.getOptions();
		System.out.println("My Dropdown Elements are:: "+list.size());
		
     Set set=new HashSet();
     for(WebElement element:list) {
    	 set.add(element);
    
    	 
     }
	 System.out.println("After Removing Duplicates My Dropdown Elements are:: "+set.size());
	
	
	}

}
