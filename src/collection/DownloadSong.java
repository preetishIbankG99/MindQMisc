package collection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadSong {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		driver=new FirefoxDriver(fp);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		driver.manage().window().maximize();
		driver.get("https://pagalworld.la/");
		driver.findElement(By.xpath(".//*[@id='genreMoreList']/div[3]/a[1]/font[3]/b")).click();
		Thread.sleep(4000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	for (int i = 0; i<2; i++) {
		Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,80)");
	}
	driver.findElement(By.xpath(".//*[@id='genreMoreList']/ul/li[1]/b/a")).click();

	for (int i = 0; i<2; i++) {
		Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,80)");
	}
	driver.findElement(By.xpath("html/body/div[2]/div[5]/a/b/font")).click();
	}
}
