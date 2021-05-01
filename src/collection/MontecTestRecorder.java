package collection;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MontecTestRecorder {
public static final Object MediaTypeKey = "";
public static final Object CompressorNameKey = "";
public static final Object QualityKey = "";
public static final Object DepthKey = "";
public static final Object MimeTypeKey = "";
public static final Object MIME_AVI = "";
public static final Object EncodingKey = "";
public static final Object ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE = "";
public static final Object FrameRateKey = "";
public static final Object KeyFrameIntervalKey = "";
public static final Object MIME_QUICKTIME = "";
public static final Object ENCODING_QUICKTIME_JPEG = "";
public static WebDriver driver; 

@Test
public void captureVideo() throws IOException, AWTException, InterruptedException {
	
	GraphicsConfiguration gc = GraphicsEnvironment
		.getLocalGraphicsEnvironment()
		.getDefaultScreenDevice()
		.getDefaultConfiguration();
	
	ScreenRecorder sc = new ScreenRecorder(gc,
		gc.getBounds(),
		new Format(MediaTypeKey,FormatKeys.MediaType.FILE,MimeTypeKey,MIME_QUICKTIME),
		new Format(MediaTypeKey,FormatKeys.MediaType.VIDEO,EncodingKey,ENCODING_QUICKTIME_JPEG,
		CompressorNameKey,ENCODING_QUICKTIME_JPEG,
		DepthKey, 24, FrameRateKey, Rational.valueOf(15),
		QualityKey, 0.5f,
		KeyFrameIntervalKey, 15 * 60),
		new Format(MediaTypeKey,FormatKeys.MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
		null,
new File("C:\\Users\\GUDU\\Downloads\\Compressed\\montec.avi"));
		sc.start();
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("emai")).sendKeys("gudu");
		Thread.sleep(3000);
		sc.stop();
		
		}
}