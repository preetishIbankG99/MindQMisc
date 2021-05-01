package pageFactoryWithoutFindby;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
WebElement name_3_firstname;
	
	WebElement name_3_lastname;
	
	WebElement phone_9;
	
	// Constructor
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeFirstName(String firstName)
	{
		name_3_firstname.sendKeys(firstName);
	}
	
	public void typeLastName(String lastName)
	{
		name_3_lastname.sendKeys(lastName);
	}
	
	public void typephoneNo(String phoneNo)
	{
		phone_9.sendKeys(phoneNo);
	}
}
