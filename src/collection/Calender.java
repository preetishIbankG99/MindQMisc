package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apsrtconline.in//oprs-web//");
WebElement search1=driver.findElement(By.id("fromPlaceName"));
search1.sendKeys("Ameerpet");
WebElement search2=driver.findElement(By.id("toPlaceName"));
search2.sendKeys("Tirupati");
WebElement search3=driver.findElement(By.id("txtJourneyDate"));
search3.click();
driver.findElement(By.cssSelector("a[title='Next']")).click();
driver.findElement(By.xpath("html/body/div[5]/div[2]/table/tbody/tr[2]/td[4]/a")).click();
WebElement search4 =driver.findElement(By.id("txtReturnJourneyDate"));
search4.click();
driver.findElement(By.cssSelector("a[title='Next']")).click();
driver.findElement(By.xpath("html/body/div[5]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
//while(true){
//	String month = driver.findElement(By.className("ui-datepicker-month")).getText();
//	if (month.equals("May")) {
//		break;
//	} else {
//		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
	}
//}

	
	}

//}
