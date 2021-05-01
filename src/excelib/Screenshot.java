package excelib;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
public static void takescreenshot(WebDriver driver,String Filename) throws IOException{
	DateFormat df=new SimpleDateFormat("dd_MMM_yyy hh_mm_ss");
	Date d=new Date();
	String Time=df.format(d);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("C:\\Users\\GUDU\\Desktop\\preetish\\"+Filename+Time));
}
public static void main(String []args) throws IOException{
	WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://www.facebook.com");
    Screenshot.takescreenshot(driver, "gudu.png");
	
	
}
}
