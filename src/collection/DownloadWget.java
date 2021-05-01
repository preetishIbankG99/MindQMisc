package collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DownloadWget {
	public static void main(String[] args) throws IOException, InterruptedException {
		ProfilesIni ini=new ProfilesIni();
		FirefoxProfile fp=ini.getProfile("default");
		WebDriver driver=new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download");
		Thread.sleep(5000);
		
		WebElement downloadLink=driver.findElement(By.partialLinkText("32 bit Windows IE"));
		Thread.sleep(5000);
		String fileloc=downloadLink.getAttribute("href");
		
		
		Runtime.getRuntime().exec("cmd /C C:\\Users\\GUDU\\Desktop\\selenium e learn\\wget.exe -P C:\\Users\\GUDU\\Desktop\\selenium e learn\\downloader"+fileloc);
}
}