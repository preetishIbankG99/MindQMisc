package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://ebay.in");
	//driver.manage().window().maximize();
	WebElement dropdownBox=driver.findElement(By.id("gh-cat"));
	Select sel=new Select(dropdownBox);
	WebElement ele=sel.getFirstSelectedOption();
	System.out.println(ele.getText());
	
	
	//sel.selectByIndex(16);//Select by index
//Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	//sel.selectByValue("281");
	//sel.selectByVisibleText("Jewellery & Precious Coins");
//	List<WebElement> items=sel.getOptions();
//	for(WebElement item:items){
//		System.out.println(item.getText());
	
	
	
	}
	}
    //}
