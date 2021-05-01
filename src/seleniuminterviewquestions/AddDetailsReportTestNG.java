package seleniuminterviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddDetailsReportTestNG {
	
		WebDriver driver=new FirefoxDriver();
		@Test
		public void openSelenium()
		{
			Reporter.log("opening chercher.tech");
			driver.get("https://chercher.tech");
			Reporter.log("chercher.tech opened");
		}

		@Test
		public void openGoogle()
		{
			Reporter.log("opening google.com");
			driver.get("http://www.google.com");
			Reporter.log("google opened");
		}
		@Test
		public void openGmail()
		{
			Reporter.log("opening gamil");
			driver.get("http://gmail.com");
			Reporter.log("gmail opened'");
		}
}
