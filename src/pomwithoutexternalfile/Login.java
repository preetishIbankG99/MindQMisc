package pomwithoutexternalfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	

		WebDriver driver;

		public static Login getLoginPage(WebDriver driver) {
			return PageFactory.initElements(driver, Login.class);
		}

		// Implementing encapsulation and abstraction 
		@FindBy(id = "email")
		private WebElement txtEmailAddress;

		public WebElement gettxtEmailAddress() {
			return txtEmailAddress;
		}

		@FindBy(id = "pass")
		private WebElement txtPassword;

		public WebElement gettxtPassword() {
			return txtPassword;
		}

		@FindBy(id = "loginbutton")
		private WebElement btnSignin;

		public WebElement getbtnSignin() {
			return btnSignin;
		}

	}

