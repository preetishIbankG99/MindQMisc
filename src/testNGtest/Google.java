package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
 //This program is now for ReportNg
	/*go to your project rightclick select porperties
	click on TestNg Disable autolistener now Some Work in Editing gle.xmlfile
	<listeners>
	<listener class-name="org.uncommons.reportng.HTMLReporter"/>
	<listener class-name="org.uncommons.reportng.JUnitXMLReporter"/>
	</listeners>
	Add it in your testng.xml
	*
	*
	*/
@Test
public void page (){
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
Assert.assertEquals(driver.getTitle(), "Googlet");
}

}