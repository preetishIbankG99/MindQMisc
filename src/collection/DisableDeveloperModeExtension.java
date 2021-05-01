package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableDeveloperModeExtension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\lattttaaast\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-extension");
		WebDriver driver =new ChromeDriver(option);

	}

}
