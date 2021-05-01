package collection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarDatePickerJS {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.automationtesting.in/Datepicker.html");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//js.executeScript("document.getElementById('datepicker1').value='05/08/2018'");
		js.executeScript("document.querySelector('#datepicker1').value='05/08/2018'");
	}

}
