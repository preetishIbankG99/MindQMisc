package collection;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadLocationScreenshot {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {


		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download/");
		Runtime.getRuntime().exec("C:\\Users\\GUDU\\Desktop\\downloadfile.exe");
		Thread.sleep(6000);
	Robot r=new Robot();
		
		BufferedImage image = new Robot()
				.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit()
				.getScreenSize()));
		ImageIO.write(image, "png", new File("C:\\Users\\GUDU\\Desktop\\gudu\\image.png"));
		//But we have to open the download location where it will take the screen shot
		//otherwise it will take screenshot of browser or Eclipse ide 
		//in Robot screenshot give the path of download location that you have been provided in autoit.exefile in Inetget
	}
}
