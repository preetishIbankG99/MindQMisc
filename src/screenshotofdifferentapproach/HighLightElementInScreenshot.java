package screenshotofdifferentapproach;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighLightElementInScreenshot {
	public static void main(String[] args) throws Exception {
		// set the geckodriver.exe property
		//System.setProperty("webdriver.gecko.driver", "C:/PATH/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("http://chercher.tech/selenium-webdriver-sample.html");
		// store the webelement
		WebElement element_node = driver.findElement(By.xpath("//input"));
		// pass the stored webelement to javascript executor
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    // highlight the element with red border 3px width
    jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
    // added sleep to give little time for browser to respond
    Thread.sleep(3000);

		// Take ScreenShot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// store the converted file as Image on D driver
		FileUtils.copyFile(file, new File("D:\\workspace\\MindQ\\Screenshots\\Element With Highlight.png"), true);
  }
}
