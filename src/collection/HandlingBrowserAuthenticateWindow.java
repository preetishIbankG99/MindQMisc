package collection;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBrowserAuthenticateWindow {
public static void main(String[] args) throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Runtime.getRuntime().exec("C:\\Users\\GUDU\\Desktop\\browserwindow authentication.exe");
	driver.get("https://www.engprod-charter.net/");
	
	
}
}
