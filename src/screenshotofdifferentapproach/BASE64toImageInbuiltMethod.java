package screenshotofdifferentapproach;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BASE64toImageInbuiltMethod {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		//System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://www.facebook.com");

		// Take ScreenShot
		String scrBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		// convert the BASE64 to File type
		File file = OutputType.FILE.convertFromBase64Png(scrBase64);
		// store the converted file as Image on D driver
		FileUtils.copyFile(file, new File("D:\\workspace\\MindQ\\Screenshots\\BASE64-Conerted-Image.png"), true);
  }
}
