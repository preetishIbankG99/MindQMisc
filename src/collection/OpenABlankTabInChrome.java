package collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenABlankTabInChrome {
public static void main(String[]args){
	System.setProperty("webdriver.chrome.driver","H:\\lattttaaast\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.open('http://amazon.in','_blank');");

}
}
