package collection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableEmojiFilter {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/table-records-filter-demo.html");
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,200)");

		WebElement emojisred=driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[3]/td[1]"));
		emojisred.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-200)");

		WebElement filteremoji=driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[3]"));
		filteremoji.click();

		WebElement Emojitext=driver.findElement(By.xpath("html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[3]/td[3]/div/div"));
		System.out.println(Emojitext.getText());

		}
}
