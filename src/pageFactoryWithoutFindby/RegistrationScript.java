package pageFactoryWithoutFindby;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationScript {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		
		RegistrationPage rp= new RegistrationPage(driver);
		
		rp.typeFirstName("Amod");
		rp.typeLastName("Mahajan");
		rp.typephoneNo("34234");
		
		driver.quit();
	}
}
