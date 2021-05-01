package datadriven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableParticularCellValues {
	public static WebDriver driver;

	@BeforeMethod
	public void webtable(){
		// printing all the table values in to the console
		 driver = new FirefoxDriver();
		driver.get("http://indianrail.gov.in/");
		//driver.navigate().to("http://indianrail.gov.in/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Reserved Train Schedule"));
		link.click();

		WebElement searchBox = driver.findElement(By.id("lccp_trnname"));
		searchBox.sendKeys("14553");

		WebElement button = driver.findElement(By.className("btn_style"));
		button.click();
		}
@Test
public void implementation(){
WebElement basetable=driver.findElement(By.xpath("(.//*[@class='table_border_both'])[2]"));
List<WebElement> rows = basetable.findElements(By.tagName("tr"));
for(WebElement row:rows){
List<WebElement>cols=row.findElements(By.tagName("td"));
for(WebElement col:cols){
	String cell=col.getText();
	if(cell.equalsIgnoreCase("BADLI")){
		int i=cols.indexOf(col);
		System.out.println("-Station:-"+cols.get(i).getText()+ " -train-slno:- "+cols.get(i-2).getText()+" -trainarrtime:- "+cols.get(i+2).getText()+"  -traindepttime:-  "+cols.get(i+3).getText());
}
}
}
}

@AfterMethod
public void closebrowser(){
	driver.close();
}
}
