package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://www.flipkart.in");
	driver.manage().window().maximize();

}


}
