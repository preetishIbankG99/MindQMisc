package collection;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VerifyValuesFromDropdown {

	public static void main(String[] args) {
	//All values are same as in Drop down
	String arr[]= {"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
	//you can deliberately check for a dropdown value to fail suppose you write June then it will fail
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Select select=new Select(driver.findElement(By.id("month")));
	List<WebElement>dropdownValues=select.getOptions();
	System.out.println("dropdownValues"+dropdownValues.size());
	for(int i=0;i<dropdownValues.size();i++) {
		Assert.assertEquals(arr[i], dropdownValues.get(i).getText());
		
	}
      System.out.println("Verifocation Successfull");
	  driver.quit();
	}

}
