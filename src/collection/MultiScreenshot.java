package collection;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MultiScreenshot {
public static void takescreenshot(WebDriver driver,String Filename) throws IOException{
	DateFormat df=new SimpleDateFormat("dd_MMM_YYYY hh_mm_ss");
	Date d=new Date();
	String Time=df.format(d);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\GUDU\\Desktop\\gudu"+Filename+".png"+Time));
System.out.println("Screenshot taken");	
}
}
