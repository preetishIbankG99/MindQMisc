package collection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.log.SysoCounter;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	
	WebElement from=driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']"));
from.click();

WebElement fromlist=driver.findElement(By.xpath("(//span[@class='autoCompleteItem__label'])[3]"));
fromlist.click();

Thread.sleep(3000);

WebElement to=driver.findElement(By.xpath("//*[@id='hp-widget__sTo']"));

WebElement tolist=driver.findElement(By.xpath("(//span[@class='autoCompleteItem__label'])[26]"));
tolist.click();
Thread.sleep(3000);
WebElement deptdate=driver.findElement(By.xpath("//input[@id='hp-widget__depart']"));
deptdate.click();
Thread.sleep(3000);      

WebElement todaydate=driver.findElement(By.xpath("(//a[@class='ui-state-default'])[7]"));
todaydate.click();

driver.findElement(By.xpath("//button[@id='searchBtn']")).click();


Thread.sleep(4000);




List<WebElement>listflights=driver.findElements(By.xpath("(//span[@class='checkbox_state pull-right'])[\"+i+\"]"));
System.out.println(listflights.size());

WebElement spicejet=driver.findElement(By.xpath("(//span[@class='checkbox_state pull-right'])[1]"));
for(int i=1;i<=listflights.size();i++) {
	if(listflights.contains(spicejet)) {
		spicejet.click();
		//driver.findElement(By.xpath("(//a[text()='Reset'])[3]")).click();
		
	}
	
}



	}

}
