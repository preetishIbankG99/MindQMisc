package extentreport;

import java.io.File;
import java.io.IOException;

import org.apache.maven.wagon.providers.http.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshotExtent {
public static String capture(WebDriver driver,String screenshotName) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File fs=ts.getScreenshotAs(OutputType.FILE);
	String dest=System.getProperty("user.dir")+"/test-outputs/"+screenshotName+".png";
	File destination=new File(dest);
	FileUtils.copyFile(fs, destination);
	
	
	
	return dest;
	
}
}
