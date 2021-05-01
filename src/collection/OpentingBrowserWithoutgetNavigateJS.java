package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OpentingBrowserWithoutgetNavigateJS {

	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.startup.homepage","www.javatpoint.com");
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().window().maximize();
		}

	}


