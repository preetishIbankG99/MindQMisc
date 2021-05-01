package json;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
public static void takescreenshot(WebDriver driver,String filename){
	DateFormat df=new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
	Date d=new Date();
	String Time=df.format(d);
	try{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\workspace\\MindQ\\Screenshots"+filename+".png"+Time));
	System.out.println("Screen shot taken");
	}
	catch(Exception e){
		e.printStackTrace();
}
}
}

