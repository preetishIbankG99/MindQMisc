package datadriven;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JexcelInteger {
	@Test(dataProvider="testdata")
	 public void add(String val1,String val2,String val3 ){
		 int a=Integer.parseInt(val1);
		 int b=Integer.parseInt(val2);
		 int c=Integer.parseInt(val3);
		 int result=a+b+c;
		 System.out.println(result);
	 }
		
	
		
	 @DataProvider(name="testdata")
	 public Object [] [] readExcel()throws IOException, BiffException  {
	 File f=new File("H:\\testing tools videos\\Mukesh selenium\\DataDriven\\useint.xls");
	 Workbook w=Workbook.getWorkbook(f);
	 Sheet s=w.getSheet(0);
	 int rows=s.getRows();
	 int cols=s.getColumns();
	


	 String inputData[] []=new String[rows][cols];
	 for (int i=0;i<rows;i++){
	 	for(int j=0;j<cols;j++){
	 		//for reading excel file column is superior so we declare "j" as first element in getCell
	 		//for passing data in excel row is superior Cell(i,j) i=row ,j=column
	 		Cell c=s.getCell(j,i);
	 		inputData[i][j]=c.getContents();
	 	
	 		
	 	}
	 }
	 	
	 return inputData;
	 } 
}
