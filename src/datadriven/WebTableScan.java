package datadriven;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableScan {

	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver","H:\\testing tools videos\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
					
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println(":::: Customer Please Enter date in digit format::::");
		String input=scan.nextLine();
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(input))
			{
				ele.click();
				break;
			}
			

		}

	}

}
