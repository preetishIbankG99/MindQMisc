package collection;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumResizeBrowser {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.google.co.in");
		Dimension d=new Dimension(600,700);
		driver.manage().window().setSize(d);
		Point p=new Point(200,300);
driver.manage().window().setPosition(p);
		
	}

}
