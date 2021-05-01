package pageobjectwithpagefactoryedu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginClassPageFactory {
	@Test
	public void verifyLogin()throws InterruptedException
	{

		System.setProperty("webdriver.ie.driver", "H://testing tools videos//IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
	
WebElements locateElements=PageFactory.initElements(driver, WebElements.class);	
locateElements.loginMethods("vijay78","vijay78");
Thread.sleep(3000);
driver.close();
	}
}