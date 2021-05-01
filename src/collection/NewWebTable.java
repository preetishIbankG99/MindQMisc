package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,200)");
		List<WebElement>rows=driver.findElements(By.xpath(".//*[@id='task-table']/tbody/tr"));
		System.out.println(rows.size());

		for(int i=1;i<rows.size();i++){
			List<WebElement>cols=driver.findElements(By.xpath(".//*[@id='task-table']/tbody/tr["+i+"]/td"));
			for(int j=1;j<cols.size();j++){
			WebElement cell=driver.findElement(By.xpath(".//*[@id='task-table']/tbody/tr["+i+"]/td["+j+"]"));
			String cellvalue=cell.getText();
			if(cellvalue.equalsIgnoreCase("bootstrap 3")){
				WebElement serialno=driver.findElement(By.xpath(".//*[@id='task-table']/tbody/tr[4]/td[1]"));
				WebElement assignee=driver.findElement(By.xpath(".//*[@id='task-table']/tbody/tr[4]/td[3]"));
				 WebElement status=driver.findElement(By.xpath(".//*[@id='task-table']/tbody/tr[4]/td[4]"));
				 System.out.println();
				 System.out.println("Assignee serial no:"+serialno.getText());
				 System.out.println();
				System.out.println(" Assignne Name:"+assignee.getText());
				System.out.println();
				System.out.println("Assignee Status:"+status.getText());
				
				
				
				
			}
			}
		}
			
		}
}
