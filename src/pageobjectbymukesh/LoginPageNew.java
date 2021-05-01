package pageobjectbymukesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew 
{
	public WebDriver driver;
	public LoginPageNew(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
@FindBy(id="usernameOrEmail")
@CacheLookup
WebElement username;

@FindBy(how=How.XPATH,using="//button[@type='submit']")
@CacheLookup
WebElement submit;

@FindBy(how=How.XPATH,using="//input[@type='password']")
@CacheLookup
WebElement password;

@FindBy(how=How.XPATH,using="(//span[@class='masterbar__item-content'])[3]")
@CacheLookup
WebElement sign_up;

public void log_in_wordpress(String uid,String passwd) throws InterruptedException{
	username.sendKeys(uid);
	submit.click();
	Thread.sleep(4000);
	password.sendKeys(passwd);
	System.out.println(sign_up.getText());
	
}
}
