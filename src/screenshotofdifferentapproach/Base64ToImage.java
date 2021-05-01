package screenshotofdifferentapproach;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;

import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base64ToImage {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://chercher.tech/selenium-webdriver-sample.html");

		// Take ScreenShot
		String scrBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

		// decode the base4 to bytes,
		byte[] base64Val=Base64.decodeBase64(scrBase64);

		//create a image file in local system
		File imgFile = new File("D:\\workspace\\MindQ\\Screenshots\\pageScreenshotBase64.png");

		// convert the bytes to image using ImageIo class
		BufferedImage img = ImageIO.read(new ByteArrayInputStream(base64Val));

		// write the image to the image file that we have created
		ImageIO.write(img, "png", imgFile);
  }
}
