package testNGtest;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static String takescreenshot(WebDriver driver,String filename){
		
		try{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String dest="H:\\testing tools videos\\Mukesh selenium\\ADVANCE SELENIUM REPORT\\AdvReport\\"+filename+".png";
        File destination=new File(dest);
		FileUtils.copyFile(source, destination);
		System.out.println("ScreenshotTaken");
		return dest;
		
		}
catch(Exception e){
	System.out.println("Exception while Taking screenshot "+e.getMessage());
	return e.getMessage();
}
		
	
	}
}
