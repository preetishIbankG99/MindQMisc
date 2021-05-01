package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarConceptMukesh {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		//clicking on onward date
WebElement onwardate=driver.findElement(By.xpath("//label[@for='onward_cal' and @class='db text-trans-uc']"));
onwardate.click();

Thread.sleep(3000);
List<WebElement>dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
int total_nodes=dates.size();
System.out.println(dates.size());
for(int i=0;i<total_nodes;i++) {
	String date=dates.get(i).getText();
	
	if(date.equalsIgnoreCase("28")) {
		dates.get(i).click();
	
		break;
	}
	
}


	}

}
