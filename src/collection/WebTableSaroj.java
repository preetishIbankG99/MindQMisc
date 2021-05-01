package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableSaroj {
	public static void tableRead(WebDriver driver,String station){
		boolean flag=false;
		WebElement reservedSchedule=driver.findElement(By.xpath("//a[@href='train_Schedule.html']"));
		reservedSchedule.click();
		driver.findElement(By.xpath(".//*[@id='lccp_trnname']")).sendKeys("14553");
		driver.findElement(By.className("btn_style")).click();
		WebElement table=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]"));//note:bracket-since here  
	                         //there is two tables having all the attributes and their values are equal
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	System.out.println("no. of rows:"+rows.size());
	for (WebElement row : rows) {
		List<WebElement> cols=row.findElements(By.tagName("td"));
	for (WebElement col : cols) {
		String cell=col.getText();
		if(cell.equals(station)){
		int i=cols.indexOf(col);
		System.out.print("Station:"+cols.get(i).getText()+"\tSl No:"+cols.get(i-2).getText()+"\t Arrival Time:"+cols.get(i+2).getText());
	    System.out.println("\tDept Time:"+cols.get(i+3).getText());
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
		WebTableSaroj.tableRead(driver,"BADLI");
}
}