package pageObjectModelAmod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_001_SignIn3 {
public static void main(String[] args) throws Exception {
		
		PropertiesUtils prop= new PropertiesUtils("./locator.properties");
		
		
		WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// Typing email
		WebElement txtEmail= driver.findElement(prop.getLocator("EmailAddress"));
		txtEmail.sendKeys("preetishbhanja@gmail.com");
		
		// Typing password
		WebElement txtPass= driver.findElement(prop.getLocator("Password"));
		txtPass.sendKeys("gudu199");
		
		WebElement loginBtn=driver.findElement(prop.getLocator("Signin"));
		loginBtn.click();
		
		//Quit browser
		driver.quit();
		
		
		
	}
}
