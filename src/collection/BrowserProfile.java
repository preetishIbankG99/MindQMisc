package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserProfile {

	public static void main(String[] args) {
//To open a particular profile we use a class called ProfilesIni	
ProfilesIni ini=new ProfilesIni ();
//After creating an object to ProfilesIni class use amethod get profile to point a particular profile which we need to open
FirefoxProfile fp=ini.getProfile("preetish");
//FirefoxProfile fp=ini.getProfile("default");
WebDriver driver=new FirefoxDriver(fp);
	}

}
