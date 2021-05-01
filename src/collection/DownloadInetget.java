package collection;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class DownloadInetget {

	public static void main(String[] args) throws IOException {
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.seleniumhq.org/download/");
	Runtime.getRuntime().exec("C:\\Users\\GUDU\\Desktop\\downloadfile.exe");
	
	}
	
	
	
}
