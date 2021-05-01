package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetValue{
	public static void main(String[]args){
		String uname="preetish";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement unamee=driver.findElement(By.id("email"));
		unamee.sendKeys("preetish");
		System.out.println(""+unamee.getAttribute("value"));
		if(uname.equals(unamee.getAttribute("value")));
		System.out.println("Hooray @#TestCase Pass&^%$");
		driver.close();
		
	}
}
