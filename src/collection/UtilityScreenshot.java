package collection;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityScreenshot {
public static void takescreenshot(WebDriver driver,String filename) throws IOException{
	DateFormat df=new SimpleDateFormat("dd-MMM-yy hh-mm-ss");
	Date d=new Date();
	String Time=df.format(d);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\GUDU\\Desktop\\screenshot\\"+filename+".png"+Time));
	System.out.println("Screenshot Taken");
}
}
