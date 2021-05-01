package screenshotofdifferentapproach;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConvertBytesToImage {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://chercher.tech/selenium-webdriver-sample.html");

		// Take ScreenShot
		byte[] scrBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		//create a image file in local system
		File imgFile = new File("D:\\workspace\\MindQ\\Screenshots\\pageScreenshotBytes.png");

		// convert the bytes to image using ImageIo class
		BufferedImage img = ImageIO.read(new ByteArrayInputStream(scrBytes));

		// write the image to the image file we have create
		ImageIO.write(img, "png", imgFile);
  }
}
