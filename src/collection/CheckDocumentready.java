package collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckDocumentready {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://en.m.wikipedia.org/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String ready=(String)js.executeScript("return.document.readyState");
		System.out.println("Ready or Not :::"+ready);

	}

}
