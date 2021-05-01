package collection;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WgetExample2 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		 driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");
		String href =driver.findElement(By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a"))
				.getAttribute("href");
		String str="cmd /c C:\\Users\\HP-\\Desktop\\wgetExample\\wget.exe-P C:\\Users\\HP-\\Desktop\\wgetExample "+href;
				Runtime.getRuntime().exec(str);
		
	}
}