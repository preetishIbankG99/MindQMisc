package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlesex {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);

		Set<String>s1=driver.getWindowHandles();
		Iterator<String>i=s1.iterator();
		while(i.hasNext()){
			String child_window=i.next();
			if(!parent_window.equalsIgnoreCase(child_window)){
				driver.switchTo().window(child_window);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				driver.close();
				
				
			}
			
		}

		}

}
