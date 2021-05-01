package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilsSeleniumDataProvider {
	public static WebDriver driver;
	@BeforeTest
	public void facebookdatadriven() {
		// System.setProperty("webdriver.chrome.driver","H:\\testing tools videos\\chromedriver_win32\\chromedriver.exe");
			// driver=new ChromeDriver();
			driver=new FirefoxDriver();
	}
	
	@Test(dataProvider="testdata")
	public void test1(String username,String password) throws InterruptedException {
		System.out.println(username+" | "+password);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	@DataProvider(name="testdata")
	public  Object[][] getData() {
		String excelPath="H:\\testing tools videos\\Mukesh selenium\\DataDriven\\data.xlsx";
		testData(excelPath,"Sheet1");
		Object data[][]=testData(excelPath,"Sheet1");
	return data;
	}
public  Object[][] testData(String excelPath,String sheetName) {
	ExcelUtils excel=new ExcelUtils(excelPath,sheetName);
	int rowCount=excel.getRowCount();
	int colCount=excel.getColCount();
	Object data[][]=new Object[rowCount-1][colCount];
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<colCount;j++) {
			String cellData=excel.getCellDataString(i, j);
			//System.out.print(cellData+" | ");
			data[i-1][j]=cellData;
		}
		//System.out.println();
	}
return data;
}
}
