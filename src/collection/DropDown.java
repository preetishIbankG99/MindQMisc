package collection;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new FirefoxDriver();
			driver.get("http://ebay.in");
			WebElement dropdownBox = driver.findElement(By.id("gh-cat"));
			Select sel = new Select(dropdownBox);
			List<WebElement> items = sel.getOptions();

			for (WebElement item : items) {
				System.out.println(item.getText());
			}

			 sel.selectByIndex(6);//SelectByIndex(int)
			 Thread.sleep(5000);
			 sel.selectByValue("1249");//selectByValue
			 Thread.sleep(5000);
			 sel.selectByVisibleText("eBay Daily");//selectByVisibleText(String)

	}

}
