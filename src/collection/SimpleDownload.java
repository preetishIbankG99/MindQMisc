package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SimpleDownload {
	static WebDriver driver;
	public static void main(String[] args) {
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		driver=new FirefoxDriver(fp);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		driver.manage().window().maximize();
		driver.get("http://filehippo.com/download_free_pdf_reader/");
		driver.findElement(By.xpath(".//*[@id='program-header']/div[2]/a[1]")).click();
		
		
	}
		
}
