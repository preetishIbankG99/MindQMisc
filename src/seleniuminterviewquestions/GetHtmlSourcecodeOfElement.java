package seleniuminterviewquestions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetHtmlSourcecodeOfElement {
	public static void main(String[]args){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	JavascriptExecutor jsx = (JavascriptExecutor) driver;
	String elementId = "email";
	String html =(String) jsx.executeScript("return document.getElementById('" + elementId + "').innerHTML;");
}
}