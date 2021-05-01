package collection;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.itextpdf.text.log.SysoCounter;

public class MultipleScrollIntoView {

	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();  
		driver.get("http://demo.automationtesting.in/Register.html");
		  
		  JavascriptExecutor js =((JavascriptExecutor)driver);
		  
		  WebElement unsorteddropdown = driver.findElement(By.xpath(".//*[@id='msdd']"));
		  unsorteddropdown.click();
		  List<WebElement>dlist=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		 
		  for(WebElement l:dlist) {
			  System.out.println(l.getText());
		l.getText().contentEquals("Bulgarian");
		l.click();
		  }

		  
	  
	}

}
