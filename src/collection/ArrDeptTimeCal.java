package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ArrDeptTimeCal {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://indianrail.gov.in");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Reserved Train Schedule"));
		link.click();
		WebElement searchBox = driver.findElement(By.id("lccp_trnname"));
		searchBox.sendKeys("14553");
		WebElement button = driver.findElement(By.className("btn_style"));
		button.click();
		List<WebElement> rows=driver.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr"));
		System.out.println("Number of rows inside the table are:"+rows.size());
		for(int i=2;i<=rows.size();i++){
			List<WebElement> cols=driver.findElements(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr["+i+"]/td"));
		for(int j=1;j<=cols.size();j++){
			WebElement cell=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[" + i + "]/td[" + j + "]"));
		String cellValue =cell.getText();
		if(cellValue.equals("BADLI")){
			WebElement ArrTime=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[4]/td[5]"));
		WebElement DeptTime=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]/tbody/tr[4]/td[6]"));
		System.out.println("Arrival Time at Badli is:"+ArrTime.getText());
		System.out.println("Departure Time at Badli is:"+DeptTime.getText());
		}
		}
		}
		}
}


