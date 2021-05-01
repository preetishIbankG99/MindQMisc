package screenshotofdifferentapproach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareScreenshots {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		//System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://chercher.tech/selenium-webdriver-sample.html");

		// Take ScreenShot
		 String screenshot_1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		 Thread.sleep(2000);
		 String screenshot_2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

		if(screenshot_1.equals(screenshot_2)){
			System.out.println("Screenshots are matching");
		}
		else{
			System.out.println("Screenshots are NOT matching");
		}
  }
}
