package javascriptexecutor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleJavascriptOperationOnBrowser {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
     driver=new FirefoxDriver();

JavascriptExecutor js= ((JavascriptExecutor)driver);
//it works like navigate and get in javascript command
js.executeScript("window.location='https://www.ebay.in'");
//it works like findElement and value works like sendkeys in javascript executor
js.executeScript("document.getElementById('gh-ac').value='laptops'");
WebElement element=driver.findElement(By.xpath("//select[@id='gh-cat']"));
element.click();
Thread.sleep(3000);
//To Scroll Down a specific WebElement in a dropdownbox then click it
WebElement dropdownele=driver.findElement(By.xpath("//select[@id='gh-cat']//option[4]"));
Thread.sleep(3000);
js.executeScript("arguments[0].scrollIntoView(true)", dropdownele);
Thread.sleep(4000);
dropdownele.click();
js.executeScript("document.getElementById('gh-btn').click()");
for(int i=0;i<=3;i++) {
	//For scroll bar
	js.executeScript("window.scrollBy(0,700)");
	
	
}
//To Refresh a Webpage
js.executeScript("history.go(0)");

	
	//For chrome/mozilla to open a New Windowtab we use javascriptExecutor
js.executeScript("window.open()");
ArrayList<String>tabs=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(1));
driver.get("https://www.facebook.com");
	
	
	}

}
