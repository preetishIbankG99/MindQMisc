package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch{
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com/");
//driver.get("https://www.licindia.in/");
//driver.navigate().to("http://naukri.com");
//driver.navigate().to("https://www.google.com/");
//driver.manage().window().maximize();
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
Thread.sleep(5000);
//driver.getCurrentUrl();// to get the url
//System.out.println(driver.getCurrentUrl());// to get the url
//driver.getPageSource();
//System.out.println(driver.getPageSource());
//driver.getTitle();
//System.out.println(driver.getTitle());
//String title=driver.getTitle();
if("Facebook - Log In or Sign Up".equals(driver.getTitle())){
	System.out.println("title came successfully");
}
else{
	System.out.println("title came unsuccessfully");
}
driver.close();
		




//driver.quit();
//driver.close();
}
}


	
	
	
		
		
		
		
		
	
