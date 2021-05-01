package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertWithSelenium {
	//SOFTASSERT
	@Test
	public void mysoftassertion() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://facebook.com");
	String Title=driver.getTitle();
    System.out.println(Title);
String ExpeTitle="Facebook – log in or sign uppppp";
SoftAssert assertion=new SoftAssert();
System.out.println("Test A");
assertion.assertEquals(Title, ExpeTitle);
System.out.println("Test A Success");
assertion.assertAll();
}
	
}
//HARDASSERT
	/*static WebDriver driver;
	public static void main(String[] args) {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://facebook.com");
	String Title=driver.getTitle();
    System.out.println(Title);
    System.out.println("Test B");
String ExpeTitle="Facebook – log in or sign upp";
	Assert.assertEquals(Title, ExpeTitle);
	
System.out.println("TestB finish");	
	}*/





