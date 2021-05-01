package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDrv {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","H:\\lattttaaast\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GUDU\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
	}  
	} 


