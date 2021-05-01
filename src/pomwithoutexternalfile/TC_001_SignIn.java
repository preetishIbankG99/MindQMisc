package pomwithoutexternalfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_001_SignIn {
public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// Typing email
		WebElement txtEmail= Login.getLoginPage(driver).gettxtEmailAddress();
		txtEmail.sendKeys("preetishbhanja@gmail.com");
		
		// Typing password
		WebElement txtPass= Login.getLoginPage(driver).gettxtPassword();
		txtPass.sendKeys("gudu199");
		
		WebElement loginBtn=Login.getLoginPage(driver).getbtnSignin();
		loginBtn.click();
		
		
		txtEmail.sendKeys("preetishbhanja@gmail.com");
		txtPass.sendKeys("gudu199");
		//Quit browser
		//
		//driver.quit();
		
		
		
	}
}
