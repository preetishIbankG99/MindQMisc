package collection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SSLCertificate {
public static void main(String[] args) {
	ProfilesIni ini=new ProfilesIni();
	FirefoxProfile fp=ini.getProfile("preetish");
//We have some predefined method in Selenium called setAcceptUntrustedCertificates() 
	//which accept Boolean values(true/false)- so we will make it true.
	// This will set the true value
	fp.setAcceptUntrustedCertificates(true);

	WebDriver driver=new FirefoxDriver(fp);
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://facebook.com");

}
}
