package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesExample {
	public static WebDriver driver;

	@BeforeMethod
	public void webtable(){
		// printing all the table values in to the console
		 driver = new FirefoxDriver();
		driver.get("http://indianrail.gov.in/");
		//driver.navigate().to("http://indianrail.gov.in/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Reserved Train Schedule"));
		link.click();

		WebElement searchBox = driver.findElement(By.id("lccp_trnname"));
		searchBox.sendKeys("14553");

		WebElement button = driver.findElement(By.className("btn_style"));
		button.click();
		}
                       
@Test
public void implementation(){
	
List<WebElement> rows = driver.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr"));
System.out.println("Total rows: "+rows.size());
	
List<WebElement> cols = driver.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr/td"));
System.out.println("Total cols: "+cols.size());

for(int i=1;i<rows.size();i++){
	

WebElement	Time=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr["+ (i+1) +"]/td[5]"));

WebElement TIMINGS=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr["+ (i+1) +"]/td[6]"));

System.out.println(   "ARRIVAL TIME OF THE TRAIN :"+Time.getText() + "----DEPARTURE TIME OF THE TRAIN :"+TIMINGS.getText());

}
}
@AfterMethod
public void closebrowser(){
	driver.close();
}
}

