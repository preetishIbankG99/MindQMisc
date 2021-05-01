package collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.tutorialspoint.com/");
	Thread.sleep(2000);
	driver.findElement(By.className("fa-send")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("START NOW")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='uploader_browse']/span[2]")).click();
	Thread.sleep(2000);
	Runtime.getRuntime().exec("cmd /C ‪‪‪C:\\Users\\GUDU\\Desktop\\Autoit.exe");
	}

}
