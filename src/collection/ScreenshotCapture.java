package collection;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Utils;

public class ScreenshotCapture {
	public static void takescreen(WebDriver driver,String filename){
	DateFormat df=new SimpleDateFormat("dd_MMM_yyyy hh_mm_ss");
	Date d=new Date();
	String Time=df.format(d);
	try{
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
Utils.copyFile(f, new File("C:\\Users\\GUDU\\Desktop\\selenium e learn\\"+filename+".png"+Time));
System.out.println("Captured Screenshot");	
}
	
catch(Exception e){
	e.printStackTrace();
}
	
	}
}
