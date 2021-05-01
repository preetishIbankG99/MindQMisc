package capturescreenshotforfailedtest;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest{
public static String capture(String screenshotname) throws IOException{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String dest=System.getProperty("user.dir")+ "/ErrorScreenshot/"+screenshotname+".png";
	File destination=new File(dest);
	FileUtils.copyFile(source,destination);
	return dest;
	
}


}
