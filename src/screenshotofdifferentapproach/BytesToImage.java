package screenshotofdifferentapproach;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BytesToImage {
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
		byte[] scrBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		// convert the Bytes to File type
		File file = OutputType.FILE.convertFromPngBytes(scrBytes);
		// store the converted file as Image on D driver
		FileUtils.copyFile(file, new File("D:\\workspace\\MindQ\\Screenshots\\Bytes-Conerted-Image.png"), true);
  }
}
