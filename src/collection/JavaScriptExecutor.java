package collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
	//((JavascriptExecutor)driver).executeScript(script,args)//executeScript to write javascript code
//script is mandatory but args is optional parameter
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor) driver);//use of type casting
		js.executeScript("window.location='http://ebay.in'");//Fetching url by javascript
	js.executeScript("document.getElementById('gh-ac').value='back packs'");//javascript gettingElement
	js.executeScript("document.getElementById('gh-btn').click()");//JavaScript Click

	for (int i = 0; i<5; i++) {
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,900)");//to scroll windows in js
	
	}
	js.executeScript("history.go(0)");//to refresh windows
	}

}
