package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParticularCellValueofWebtable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,200)");
		WebElement basetable=driver.findElement(By.xpath(".//*[@id='task-table']/tbody"));

		List<WebElement>rows=basetable.findElements(By.tagName("tr"));
		for(WebElement row:rows){
			List<WebElement>cols=row.findElements(By.tagName("td"));
			for(WebElement col:cols){
				String cell=col.getText();
				if(cell.equalsIgnoreCase("seo tags")){
					int i=cols.indexOf(col);
					System.out.println("--Task--"+cols.get(i).getText() +"--Assignee--"+cols.get(i+1).getText() +" --Status--"+cols.get(i+2).getText());
				
				}
			}

}}}