package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableSortAndSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/table-sort-search-demo.html");
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,200)");

		WebElement inputsearch=driver.findElement(By.xpath(".//*[@id='example_filter']/label/input"));
		inputsearch.sendKeys("san francisco");
		Thread.sleep(3000);
		WebElement basetable=driver.findElement(By.xpath(".//*[@id='example']/tbody"));

		List<WebElement>rows=basetable.findElements(By.tagName("tr"));
		for(WebElement row:rows){
			List<WebElement>cols=row.findElements(By.tagName("td"));
			for(WebElement col:cols){
				System.out.println(col.getText());
			System.out.print(" ");
			
			}
		System.out.println();
		}
		}

}
