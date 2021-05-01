package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class InternationalizationHandleSelenium {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages","fr");
		WebDriver driver = new FirefoxDriver(profile); 
		driver.get("http://google.co.in");
	}}
