package pageobjectmodeledu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements 
{
WebDriver driver;
By username=By.name("userName");
By password=By.name("password");
By login=By.name("login");
//creating constructor
public LoginElements(WebDriver driver1)
{
	this.driver=driver1;
}
public void userelement(String uid)
{
	driver.findElement(username).sendKeys(uid);
}
public void passwordelement(String pwd)
{
	driver.findElement(password).sendKeys(pwd);
}
public void loginelement()
{
	driver.findElement(login).click();
}

}
