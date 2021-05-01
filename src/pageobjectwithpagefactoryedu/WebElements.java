package pageobjectwithpagefactoryedu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElements {

WebDriver driver;
@FindBy(name="userName") 
@CacheLookup
WebElement username;
@FindBy(how=How.NAME,using="password") 
@CacheLookup
WebElement password;
@FindBy(how=How.NAME,using="login") 
@CacheLookup
WebElement login;

public WebElements(WebDriver driver1)
{
this.driver=driver1	;

}
public void loginMethods(String uid ,String pwd)
{
username.sendKeys(uid);
password.sendKeys(pwd);
login.click();
}


}
