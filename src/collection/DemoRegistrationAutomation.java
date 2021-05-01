package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.itextpdf.text.log.SysoCounter;

public class DemoRegistrationAutomation {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
	//	WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
//	driver.switchTo().frame("singleframe");
//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("njnj");

		
		driver.findElement(By.xpath(".//*[@id='msdd']")).click();
	




	}

}
