package seleniuminterviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckIfElementExists {
public static void main(String[]args){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
	//to stop page loading when element is loaded
	driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
//	if(driver.findElements(By.id("email")).size()!=0)
//	  {
//		System.out.println("Element exists");
//      }
//    else
//     {
//     System.out.println("Element donot exists");
//      }

//	WebElement element  =driver.findElement(By.id("element-id"));
//	if(element instanceofRenderedWebElement) {
//		System.out.println("Element visible");
//	} else {
//		System.out.println("Element Not visible");
//	}

}
}
