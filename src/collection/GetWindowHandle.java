package collection;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.reporters.jq.Main;

public class GetWindowHandle {
static public void CloseWindow (WebDriver driver,String data){
	Set<String>Windows=driver.getWindowHandles();
	for(String str:Windows){
		driver.switchTo().window(str);
		String title=driver.getTitle();
		if(title.equals(data)){
			driver.close();
			
		}
	}

}
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.naukri.com");
	GetWindowHandle obj=new GetWindowHandle();
	Thread.sleep(3000);
	obj.CloseWindow(driver, "Amazon");
}
	

	

	/*public static void main(String[] args ) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
driver.navigate().to("http://www.freejobalert.com/");

Set<String>windows=driver.getWindowHandles();
for(String str:windows){

driver.switchTo().window(str);
String Title=driver.getTitle();

if(Title.equals("FreeJobAlert.Com")){
	driver.close();
}
		Thread.sleep(5000);
	driver.navigate().refresh();
	}
	}*/
}
//}