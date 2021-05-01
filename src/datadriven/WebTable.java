package datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebTable {
	public static void tableRead(WebDriver driver,String station){
		boolean flag=false;
		WebElement link = driver.findElement(By.linkText("Reserved Train Schedule"));
		link.click();

		WebElement searchBox = driver.findElement(By.id("lccp_trnname"));
		searchBox.sendKeys("14553");

		WebElement button = driver.findElement(By.className("btn_style"));
		button.click();
	//fixing table
	WebElement table=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]"));
	//table rows
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	System.out.println("Total rows are rows:"+rows.size());
	
	for(WebElement row:rows){
		List<WebElement>cols=row.findElements(By.tagName("td"));
		for(WebElement col:cols){
			String cell=col.getText();
			if(cell.equalsIgnoreCase(station)){
				int i=cols.indexOf(col);
			System.out.println("Station:"+cols.get(i).getText()+"tslno:"+cols.get(i-2).getText()+"tarrtime:"+cols.get(i+2).getText()+"tdepttime:"+cols.get(i+3).getText());	
			flag=true;
		    break;
			}
		}
		if(flag==true)
			break;
		}	
		}
		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://indianrail.gov.in");
			driver.manage().window().maximize();
			WebTable.tableRead(driver,"DELHI");	
				}
}
