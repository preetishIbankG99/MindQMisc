package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchBus {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("https://www.redbus.in/");
		 
		Utiity.isElementPresnt(driver,".//*[@id='txtSource']", 20).sendKeys("Bangalore");
		 
		Utiity.isElementPresnt(driver,".//*[@id='txtDestination']", 20).sendKeys("Chennai");
		}

	}


