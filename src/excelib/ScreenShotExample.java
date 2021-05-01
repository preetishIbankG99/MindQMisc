package excelib;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download/");
		Runtime.getRuntime().exec("C:\\Users\\GUDU\\Desktop\\mydownload.exe");
}
	}	

	





