package javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KillExeucatbleProcess {
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.makeseleniumeasy.com");
		
		// Killing executable file
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		
		
	}
}
