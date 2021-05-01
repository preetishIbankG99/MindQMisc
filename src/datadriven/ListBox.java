package datadriven;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	
		 
		 public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.qavalidation.com/demo");
		 
		  WebElement val=driver.findElement(By.id("tools"));
		  Select s=new Select(val);
		  List<WebElement> allvals=s.getOptions();
		 
		  for(int i=0;i<allvals.size();i++)
		  {
		   Thread.sleep(1000);
		   System.out.println("CheckBox:"+ allvals.get(i).getAttribute("value"));
		   s.selectByIndex(i); //select one by one
		  }
		  
		  //s.deselectAll();
		  s.deselectByIndex(1);//deselect 2nd item
		  s.deselectByIndex(3);//deselect 4th item
		  
		  //select checkbox having value='Selenium'
		  List<WebElement> selected = s.getAllSelectedOptions();
		  for(WebElement e:selected)
		  {
		   if(e.getText().equals("Selenium")==false)
		    s.selectByVisibleText("Selenium");
		  }
		  //s.selectByValue(value)
		  
		  System.out.println("Selected CheckBoxes only");
		  List<WebElement> selected1 = s.getAllSelectedOptions();
		  for(WebElement el:selected1)
		  {
		   System.out.println("CheckBox:"+ el.getAttribute("value"));
		  }
		 }
		
}
