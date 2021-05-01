package string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {
	
public static void closewindow(WebDriver driver,String data){
	Set<String>Windows= driver.getWindowHandles();
	for(String str:Windows){
		driver.switchTo().window(str);
		String title=driver.getTitle();
		if(title.equals(data)){
			driver.close();
		}
	}
	
	
}
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://naukri.com");
	WindowHandles.closewindow(driver, "Amazon");
}

}
 