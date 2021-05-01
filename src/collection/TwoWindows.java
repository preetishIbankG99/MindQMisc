package collection;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoWindows {
	public static void main(String[] args) throws InterruptedException {
		// open firefox browser
		//System.setProperty("webdriver.gecko.driver", "C:/~/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// set implicit time to 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// navigate to the url
		driver.get("http://chercher.tech/java/handle-multiple-windows-tabs-selenium.php");
		// get the Session id of the Parent
		String parentGUID = driver.getWindowHandle();
		// click the button to open new window
		driver.findElement(By.id("two-window")).click();
		Thread.sleep(5000);
		// get the All the session id of the browsers
		Set<String> allGUID = driver.getWindowHandles();

		// pint the title of th epage
		System.out.println("Page title before Switching : "+ driver.getTitle());
		System.out.println("Total Windows : "+allGUID.size());
		// iterate the values in the set
		for(String guid : allGUID){
			// one enter into if blobk if the GUID is not equal to parent window's GUID
			if(! guid.equals(parentGUID)){
				// switch to the guid
				driver.switchTo().window(guid);
				// break the loop
				break;
			}
		}
		// search on the google page
		driver.findElement(By.name("q")).sendKeys("success");
		// print the title after switching
		System.out.println("Page title after Switching to goolge : "+ driver.getTitle());
		Thread.sleep(5000);
		// close the browser
		driver.close();
		// switch back to the parent window
		driver.switchTo().window(parentGUID);
		// print the title
		System.out.println("Page title after switching back to Parent: "+ driver.getTitle());
	}
}
