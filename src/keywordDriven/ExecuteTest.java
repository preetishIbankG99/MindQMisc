package keywordDriven;

import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExecuteTest {
@Test
public void testLogin()throws Exception{
WebDriver webdriver=new FirefoxDriver();
ReadGuru99ExcelFile file=new ReadGuru99ExcelFile();
ReadObject  object=new ReadObject();
Properties allObjects=object.getObjectRepository();
UIOperation operation=new UIOperation(webdriver);
org.apache.poi.ss.usermodel.Sheet guru99Sheet=file.readExcel(System.getProperty("src")+"\\","TestCase.xlsx","keywordFramework");
int rowCount=guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
for(int i=1;i<rowCount+1;i++){
	Row row=guru99Sheet.getRow(i);
	if(row.getCell(0).toString().length()==0){
		System.out.println(row.getCell(1).toString()+"---"+row.getCell(2).toString()+"---"+row.getCell(3).toString()+"---"+row.getCell(4).toString());
	operation.perform(allObjects, row.getCell(1).toString(),row.getCell(2).toString(),row.getCell(3).toString(),row.getCell(4).toString());
	}
	else{
		System.out.println("New TestCase-->"+row.getCell(0).toString()+"Started");
	}

}
}
}
