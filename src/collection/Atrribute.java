package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Atrribute {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
	//driver.findElement(By.id("Email")).sendKeys("Basu1234");
	
//	driver.findElement(By.id("Email")).getAttribute("value");
	/*WebElement Gmail_Link=driver.findElement(By.id("Email"));
	boolean link_status=Gmail_Link.isDisplayed();//true isdisplay is enable will return always boolean values
	System.out.println(link_status);
	boolean link_status1=Gmail_Link.isEnabled();
	System.out.println(link_status);//true 
	String Link_name=Gmail_Link.getText();
	System.out.println("Link_name");
	Gmail_Link.click();*/
  WebElement radiobtn=driver.findElement(By.id("three"));
  radiobtn.click();
  if(radiobtn.isSelected()){
	  System.out.println("radiobutton is selected");
	  }
  else{
	  radiobtn.click();
	  
  
  
}
}
}