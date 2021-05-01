package collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CalenderExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();

		WebElement calender = driver.findElement(By.xpath(".//*[@id='txtJourneyDate']"));

		calender.click();

		while (true) {
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			if (month.equals("June")) {
				break;
			} else {
				driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			}

		}

		List<WebElement> rows = driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[1]/tbody/tr"));

		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> cols = driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[1]/tbody/tr[" + i + "]/td"));

			for (int j = 1; j <= cols.size(); j++) {

				WebElement ele = driver.findElement(By.xpath("(.//*[@class='ui-datepicker-calendar'])[1]/tbody/tr[" + i + "]/td[" + j + "]"));

				String eleValue = ele.getText();
				if (eleValue.equals("22")) {
					ele.click();
				}
			}
		}
	}
}


