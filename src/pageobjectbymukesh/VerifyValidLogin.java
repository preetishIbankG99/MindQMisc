package pageobjectbymukesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import mukeshpomhelper.BrowserFactory;

public class VerifyValidLogin {
public static WebDriver driver;
	@Test
	public void checkValidUser() throws InterruptedException
	{
	 driver=BrowserFactory.startBrowser("firefox", "https://wordpress.com/log-in");	
	LoginPageNew log_in=PageFactory.initElements(driver, LoginPageNew.class);
	Thread.sleep(4000);
	log_in.log_in_wordpress("preetish", "bhanja");
	
	}
}
