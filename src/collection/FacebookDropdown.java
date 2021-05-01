package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

 //driver.findElement(By.id("month"));
 WebElement bdmonth=driver.findElement(By.xpath(".//*[@id='month']"));
Select month=new Select(bdmonth);
month.selectByIndex(5);
//month.selectByValue("5");
//month.selectByVisibleText("May");
if (!month.isMultiple()){
	List<WebElement>allMonths=month.getOptions();
	System.out.println("Total options in Month drop down are:"+allMonths.size());
	for(int i=0;i<allMonths.size();i++){
		String monthName=allMonths.get(i).getText();
		if(monthName.equals("May")){
			month.selectByIndex(i);
			break;
			
		}
	}
}
}}
